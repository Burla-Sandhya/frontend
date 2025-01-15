package arrmds;
//array methods
public class J {

    public static void main(String[] args) {
        int wages[] = { 100, 200, 300, 400, 500 };
        for (int x:wages){
            System.out.println(x);
        }
        System.out.println();

        increment(wages);

        for (int x:wages){
            System.out.println(x);
        }
    }
    public static void increment(int insert[]) {
     for(int bonus=0; bonus<insert.length; bonus++){

        insert[bonus] += 200;
        }     
            
}
}