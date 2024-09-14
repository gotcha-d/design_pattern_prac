package singleton;

public class Main {
    
    public static void main() {
        // System.out.println("Start");
        // Singleton obj1 = Singleton.getInstance();
        // Singleton obj2 = Singleton.getInstance();

        // if (obj1 == obj2) {
        //     System.out.println("obj1と2は同じインスタンス");
        // } else {
        //     System.out.println("obj1と2は違うインスタンス");
        // }
        // System.out.println("End");

        System.out.println("Start");
        Triple a1 = Triple.getInstance("ALPHA");
        Triple b1 = Triple.getInstance("BETA");
        Triple c1 = Triple.getInstance("GAMMA");
        Triple a2 = Triple.getInstance("ALPHA");
        Triple b2 = Triple.getInstance("BETA");
        Triple c2 = Triple.getInstance("GAMMA");
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        if (a1 == a2) {
            System.out.println("a1 == a1 (" + a1 + ")");
        }
        System.out.println("End");
    }
}
