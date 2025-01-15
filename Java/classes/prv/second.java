package prv;

public class second {
    private int hour =9;
    private int min  =7;
    private int sec  =5;

    public void setTime (int hour,int min,int sec){

        this.hour=10;
        this.min=20;
        this.sec=14;
    
    }
    public String time(){
        return String.format("%02d:%02d:%02d" , hour, min,sec);
    }
}
//keyword:"this"{ordering to print particular statement}