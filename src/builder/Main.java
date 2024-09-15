package builder;

public class Main {
    public static void main(String type) {
        if (type.isEmpty()) {
            usage();
            System.exit(0);
        }

        if (type.equals("text")) {
            TextBuilder builder = new TextBuilder();
            Director director = new Director(builder);
            director.construct();
            String result = builder.getTextResult();
            System.out.println(result);
        } else if (type.equals("html")) {
            HTMLBuilder builder = new HTMLBuilder();
            Director director = new Director(builder);
            director.construct();
            String fileName = builder.getHTMLResult();
            System.out.println("ファイル" + fileName + "が作成されました");
        } else {
            usage();
            System.exit(0);
        }
    }

    public static void usage() {
        System.out.println("Usage: java Main text   テキストで文書作成");
        System.out.println("Usage: java Main html   HTMLで文書作成");
    }
}
