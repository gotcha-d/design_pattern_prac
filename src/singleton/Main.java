package singleton;

public class Main {
    
    public static void main() {
        System.out.println("Start");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("obj1と2は同じインスタンス");
        } else {
            System.out.println("obj1と2は違うインスタンス");
        }
        System.out.println("End");
    }
}
