package template_method;

public abstract class AbstractDisplay {
    
    // open, print, closeはサブクラスに実装を任せる抽象メソッド
    protected abstract void open();
    protected abstract void print();
    protected abstract void close();

    // displayはAbstractDisplayで実装しているメソッド
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
