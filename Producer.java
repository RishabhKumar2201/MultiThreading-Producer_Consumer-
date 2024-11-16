package AdvanceCode.Multi_Threading;

public class Producer extends Thread{
    Company c;
    public Producer(Company c){
        this.c = c;
    }

    public void run(){
        int i = 0;

        while(i <= 10){
            c.produce_Item(i);

            try{
                Thread.sleep(2000);
                i++;
            } 
            catch(InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Finished Producer work");
    }
}
