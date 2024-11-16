package AdvanceCode.Multi_Threading;

class Company{
    
    int n;
    boolean produced = false;

    synchronized public void produce_Item(int n){
        if(produced == true){
            try{
                wait();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        
        this.n = n;
        System.out.println("Produced :" + this.n);
        produced = true;
        notify();
    }

    synchronized public void consume_Item(){
        if(produced == false){
            try{
                wait();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Consumed :" + this.n);
        produced = false;
        notify();
    }
}