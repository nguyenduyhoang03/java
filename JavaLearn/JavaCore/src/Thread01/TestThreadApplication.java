package Thread01;

public class TestThreadApplication {
    public static void main(String[] args) throws InterruptedException {
        MultiThreadVsThread mThread = new MultiThreadVsThread();
        mThread.start(); //bat dau chay luong`

        MultiThreadVsRunnable mThreadRunnable = new MultiThreadVsRunnable();
        Thread thread = new Thread(mThreadRunnable);
        thread.start(); //bat dau chay luong`

        //tao Thread test
        NewThread newThread = new NewThread();
        System.out.println("Name: " + newThread.getName());
        System.out.println("ID: " + newThread.getId());
        newThread.start();
        newThread.join(20000);// khi new thread hoan thanh nhiem vu trong vong 2000mls thi
        // thi cac luong khac moi bat dau lam viec
        /* join() cho` mot luong ket thuc OR lam` cho cac luong dang chay ngung hoat dong
        cho den khi luong ma no tham gia hoan thanh, bat buoc phai su dung throws InterupedExeption
        */
        NewThread newThread1 = new NewThread();
        NewThread newThread2 = new NewThread();
        NewThread newThread3 = new NewThread();
        NewThread newThread4 = new NewThread();
        newThread1.start();
        newThread2.start();
        newThread3.start();
        newThread4.start();
        //public void run(): thuc hien hanh dong luong
        //start():  bat dau thuc thi
        //sleep: tam ngung trong bao lau( tao do tre)
        //interrupt(): check ket thuc luong.ngat luong --> gian doan luong
    }
}
