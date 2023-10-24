import javax.xml.transform.Result;
import java.sql.*;

public class mySqlConnectionExample {
    public static Connection getMyConnection() throws SQLException {
        String hostName = "localhost"; //127.0.1
        String dbName = "javaExample";
        String username = "root";
        String password = "";
        //chuoi ket noi den database
        //"jdbc:myqsql://localhost:3306/javaexample,username,password"
        String connectionUrl = "jdbc:mysql://" + hostName + ":3306/" + dbName;
        Connection connection = DriverManager.getConnection(connectionUrl,username,password);
        return connection;
    }
    //Create new record : Insert Into Emplyee value( 1, "Hoang", "Ha Noi")
    public static void createEmployee() throws SQLException {
        // ket noi, dung lai connection
        Connection connection = getMyConnection();
        // tao statement
        Statement statement = connection.createStatement();
        // 3. tao query String Database thao tac db
        String query = "insert into Employee(Id,Name,Address)" +
                "values(2,'Hoàng','Ha Noi')";
        //4. thuc hien insert
        int count = statement.executeUpdate(query);
        System.out.println("Count: " + count);
    }
    public static void getDataEmployee() throws SQLException {
        Connection connection = getMyConnection();
        Statement statement = connection.createStatement();
        String query = "select * from employee";
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name =resultSet.getString(2);
            String address = resultSet.getString(3);
            System.out.println("================");
            System.out.println(id);
            System.out.println(name);
            System.out.println(address);
        }
        connection.close();
    }
    public static void crudMySQLDb() throws SQLException {
        //1. Tao Connection Object
        Connection connection = getMyConnection();
        //2. Tao Statement Object de thuc thi
        Statement statement = connection.createStatement();
        //3. Tạo bảng
        //Create table product(int primary key, proName varchar(20), description varchar(20)
        //executeQuery Read data
        //executeUpdate create, update, delete
        statement.execute("DROP TABLE IF EXISTS PRODUCT;");
        statement.execute("CREATE TABLE PRODUCT(id int primary key, proName varchar(50), description varchar(100));");
        //Insert data
        statement.execute("INSERT INTO PRODUCT VALUES (1, 'iPhone15', 'Dien Thoai')");
        //SELECT DATA STATEMENT
        ResultSet resultSet = statement.executeQuery("SELECT * FROM PRODUCT");
        while (resultSet.next()){
            System.out.println("Product name: " + resultSet.getString(2));
        }
    }
    public static void crudMySQLDbUser() throws SQLException {
        //1. Tao Connection Object
        Connection connection = getMyConnection();
        //2. Tao Statement Object de thuc thi
        Statement statement = connection.createStatement();
        //3. Tạo bảng
        //Create table product(int primary key, proName varchar(20), description varchar(20)
        //executeQuery Read data
        //executeUpdate create, update, delete
        statement.execute("DROP TABLE IF EXISTS USERS;");
        statement.execute("CREATE TABLE USERS(id int primary key, username varchar(50), password varchar(100));");
        //Insert data
        statement.execute("INSERT INTO USERS VALUES (1, 'Hoang', 'Hoang')");
        statement.execute("INSERT INTO USERS VALUES (2, 'Hoang1', 'Hoang1')");
    }
    //login with statement
    public static void loginWithStatement(String username,String password) throws SQLException{
        //tao ket noi database
        Connection connection = getMyConnection();
        //2.tao truy van(query)
        String query = "SELECT username FROM users WHERE username LIKE '" + username + "' AND password LIKE '" + password + "'";
        // 3. tao statement
        Statement statement = connection.createStatement();
        //4.tao resultset
        ResultSet resultSet = statement.executeQuery(query);
        //5.
        while (resultSet.next()){
            System.out.println("username: "+ resultSet.getString("username"));
        }
    }
    //login with
    public static void loginWithPreparedStatement(String username, String password) throws  SQLException{
        //1 Tao connection
        Connection connection = getMyConnection();
        //2 Query
        String query = "SELECT username FROM USERS WHERE username LIKE ? AND password LIKE ?";
        //3 Tao prepared statement
        PreparedStatement pstm = connection.prepareStatement(query);
        //3.1 Gan gia tri tham so cho PreparedStatement
        pstm.setString(1, username);
        pstm.setString(2, password);
        //4 Thuc thi
        ResultSet resultSet = pstm.executeQuery();
        //5 Fetch data
        while (resultSet.next()){
            System.out.println("Username: " + resultSet.getString("username"));
        }
        //Select data with prepared statement
        //SELECT * FROM PRODUCT
        String q = "SELECT * FROM PRODUCT WHERE proName LIKE ? OR id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(q);
        preparedStatement.setString(1, "iPhone");
        preparedStatement.setInt(2, 1);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println("ID: " + resultSet.getInt("id"));
            System.out.println("proNAme: " + resultSet.getString("proName"));
            //Update data with prepared statement
            //UPDATE PRODUCT SET proName = ? WHERE id = ?
            String qUpdate = "UPDATE PRODUCT proName = ? WHERE id = ?";
            preparedStatement = connection.prepareStatement(qUpdate);
            preparedStatement.setString(1, "SamSung");
            preparedStatement.setInt(2, 1);
            int rowUpdate = preparedStatement.executeUpdate();
            if (rowUpdate>0){
                System.out.println("Update success");
            }
            //Delete date with prepared statement
            //DELETE FROM PRODUCT WHERE proName = ? or id = ?
            preparedStatement = connection.prepareStatement("DELETE PRODUCT proName = ?");
            preparedStatement.setString(1, "SamSung");
        }
    }

    public static void main(String[] args) throws SQLException {
        //getMyConnection();
        if (getMyConnection() != null){
            System.out.println("Connect success");
//            createEmployee();
//            getDataEmployee();
//            CRUDMySQLDB();
//            loginWithStatement("admin","admin");
            loginWithPreparedStatement("admin","admin");
        }else {
            System.out.println("connect fail");
        }
    }
}
