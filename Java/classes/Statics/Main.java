package Statics;

public class Main {
    public static void main(String[] args) {
        Duplicate section1 = new Duplicate("gavurav", "Denny");
        Duplicate section2 = new Duplicate("dheeraj", "kumar");
        Duplicate section3 = new Duplicate("jain", "slive");
        Duplicate section4 = new Duplicate("pavithra", "reddy");
        System.out.println("\n----------------\n");
        System.out.printf("Name: %s %s \nTotal members in the club: %d\n", section1.getfirstN(), section1.getlastN(),
                section1.gettotalmembers());
        System.out.printf("Name: %s %s \nTotal members in the club: %d\n", section2.getfirstN(), section2.getlastN(),
                section2.gettotalmembers());
        System.out.printf("Name: %s %s \nTotal members in the club: %d\n", section3.getfirstN(), section3.getlastN(),
                section3.gettotalmembers());
        System.out.printf("Name: %s %s \nTotal members in the club: %d\n", section4.getfirstN(), section4.getlastN(),
                section4.gettotalmembers());

    }
}
