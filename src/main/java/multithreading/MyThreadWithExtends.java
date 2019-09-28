package multithreading;

public class MyThreadWithExtends extends Thread {

    private int tickets = 10;

    @Override
    public void run() {

        for (int i = 0; i <= 100; i++) {
            if(tickets>0){
                System.out.println(Thread.currentThread().getName()+"--卖出票：" + tickets--);
            }
        }
    }


    public static void main(String[] args) {
        MyThreadWithExtends thread1 = new MyThreadWithExtends();
        MyThreadWithExtends thread2 = new MyThreadWithExtends();
        MyThreadWithExtends thread3 = new MyThreadWithExtends();

        thread1.start();
        thread2.start();
        thread3.start();

    }

}