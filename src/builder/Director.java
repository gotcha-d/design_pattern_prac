package builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    // 文書を作る
    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("一般的な挨拶");
        builder.makeItems(new String[] {
            "how are you?",
            "hello",
            "Hi"
        });
        builder.makeString("時間帯に応じたあいさつ");
        builder.makeItems(new String[] {
            "good morning",
            "good afternoon",
            "good evening"
        });
        builder.close();
    }
}
