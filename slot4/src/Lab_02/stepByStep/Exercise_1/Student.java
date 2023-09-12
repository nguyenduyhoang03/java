package Lab_02.Exercise_1;

public class Student {
    private int id;
    private String name;
    private boolean gender;
    public Student(){
        this.id = 0;
        this.name = "Unkown";
        this.gender = true;
    }
    public Student(int id, String name, boolean gender){
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public boolean isMale(){
        return this.gender;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setMale(boolean gender){
        this.gender = gender;
    }
    public void printInfo() {
        System.out.println("-----------------------------------");
        System.out.println("| ID |        Name         | Male |");
        System.out.printf("| %d | %s | %b |\n",this.id,this.name,this.gender);
    }

}
