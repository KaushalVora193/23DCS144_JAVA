package set_7;
class set7_5 
{
    public static void main(String[] args) 
    {
        Thread firstThread  = new Thread(new MyThread(), "FIRST ");
        Thread secondThread = new Thread(new MyThread(), "SECOND");
        Thread thirdThread  = new Thread(new MyThread(), "THIRD ");

        firstThread.setPriority(3);
        secondThread.setPriority(Thread.NORM_PRIORITY); 
        thirdThread.setPriority(7);

        firstThread.start();
        secondThread.start();
        thirdThread.start();
    }
}

class MyThread implements Runnable 
{
    public void run() 
    {
        System.out.println(Thread.currentThread().getName() + " Running with Priority : " + Thread.currentThread().getPriority());
    }
}
