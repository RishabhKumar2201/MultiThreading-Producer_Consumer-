package AdvanceCode.Multi_Threading;

public class Consumer extends Thread{
    
    Company c;
    public Consumer(Company c){
        this.c = c;
    }

    public void run(){
        int i = 0;

        while(i <= 10){
            c.consume_Item();

            try{
                Thread.sleep(2000);
                i++;
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Finished Consumer work");
    }
}
