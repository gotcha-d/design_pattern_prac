package template_method;

// public class StringDisplay extends AbstractDisplay {
public class StringDisplay implements DisplayInterface {

    
    // 表示すべき文字
    private String string;
    // 文字列の表示幅
    private int width;

    public StringDisplay(String str) {
        this.string = str;
        this.width = str.length();
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + this.string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");

    }
}
