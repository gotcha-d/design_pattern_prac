package template_method;

public interface DisplayInterface {

    // open, print, closeはサブクラスに実装を任せる抽象メソッド
    public void open();
    public void print();
    public void close();

    // displayはAbstractDisplayで実装しているメソッド
    default void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }}
