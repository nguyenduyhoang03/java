package Thread01;
/*
 - Sử dụng luồng(thread): Chạy nhanh, hiệu quả hơn
 - ưu điểm của đa luồng:
    + có thể thực hiện nhiều luồng cùng một lúc
    + tiết kiệm thời gian
 - Các luồng chạy độc lập với nhau, nếu có ngoại lệ xảy ra thì chỉ xảy ra ở 1 luồng duy nhất
 - Luồng là một đơn vị nhỏ nhất của máy tính
 - Đa luồng (multiThreading) và đa nhiệm (multitasking)
    + một chương trình thực hiện nhiều luồng = Đa luồng ( multiThreading)
    + nhiều chương trình chạy một lúc = Đa nhiệm (multiTasking)
 - LifeCycle Of Thread
    + New --> Runnable -> Running -> Terminated
    1.New: luồng ở trạng thái đã tạo 1 instance của class nhưng trước khi gọi phương thức Start
    2.Runnale: Luồng ở trạng thái sau khi gọi Start
    3.Running: Luồng ở trạng thái này khi Thread scheduler đã chọn nó
    4.None Runnable: Luồng vẫn còn sống nhưng k đủ điều kiện để chạy
    5.Terminated: Luồng ở trạng thái này khi phương thức run của nó đã thoát
 */
public class MultiThreadVsRunnable implements Runnable{
    //overiding the run() method;
    public void run(){
        System.out.println("Running Thread");
    }
}
