package Thread01;

public class NewThread extends Thread{
    @Override // optional
    public void run() {
        for (int i = 1; i < 6; i++){
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
        System.out.println("Thread Done");
    }
}
