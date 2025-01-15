package sum;

public class Main {
    public static void main(String[] args) {
        int grapes[]={12,23,34,45,56,67,89};
        int total=0;
        for(int c=0; c<grapes.length; c++){
        
            total=total+grapes[c];
        }
        System.out.println("total; "+total);
     }
}