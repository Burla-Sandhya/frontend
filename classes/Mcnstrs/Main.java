package Mcnstrs;
/*constructors mainly 2 types:
Default cnstr:     passing with or without parameters
parameterized cnstr:   passing parameters

*/
public class Main {
    public static void main(String[] args) {

        MultiContrs insert1 = new MultiContrs();
        MultiContrs insert2 = new MultiContrs(3);
        MultiContrs insert3 = new MultiContrs(4, 15);
        MultiContrs insert4 = new MultiContrs(12, 45, 54);

        System.out.println(insert1.myResult());
        System.out.println(insert2.myResult());
        System.out.println(insert3.myResult());
        System.out.println(insert4.myResult());
    }
}