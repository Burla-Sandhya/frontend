package enumset;
import java.util.EnumSet;
//enumeration is working specific (from - to particular zones) rask
public class Main {
    public static void main(String[] args) {
        for(Second input:Second.values()){
            System.out.printf("%s\t%s\t%s\t%s\n",input,input.getDomain(),input.getAge(),input.getGender());
        }
        System.out.println(("\n-----------Range of Users---------\n"));
        for(Second input:EnumSet.range(Second.ksytra, Second.vishnu)){
            System.out.printf("%s\t%s\t%s\t%s\n",input,input.getDomain(),input.getAge(),input.getGender());
        }
    }
}
