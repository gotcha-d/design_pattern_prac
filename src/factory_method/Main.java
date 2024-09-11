package factory_method;

import factory_method.framework.*;

import factory_method.idcard.IDCardFactory;

public class Main {
    
    public static void main() {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Hiroshi Yuki");
        Product card2 = factory.create("Tomoura");
        Product card3 = factory.create("Hanako Sato");

        card1.use();
        card2.use();
        card3.use();
    }
}
