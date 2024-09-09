package template_method;

public class Main {
    
    public static void main() {
        // "H"をもったCharDisplayクラスのインスタンスを作る
        AbstractDisplay display1 = new CharDisplay('H');
        AbstractDisplay display2 = new StringDisplay("Hello, world");
    
        display1.display();
        display2.display();
    }
}
