package prv;

public class Main {
    public static void main(String[] args) {
        second result=new second();
        
        System.out.println(result.time());

        System.out.println();

        result.setTime(00,00,00);

        System.out.println(result.time());
    }
}
