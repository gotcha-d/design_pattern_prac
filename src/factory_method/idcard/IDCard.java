package factory_method.idcard;

import factory_method.framework.Product;

public class IDCard extends Product {
    
    private String owner;
    private int id;

    IDCard(String owner, int id) {
        System.out.println(owner + "のカードを作ります(ID: " + id + ")");
        this.owner = owner;
        this.id = id;
    }

    @Override
    public void use() {
        System.out.println(this + "を使います(ID: " + id + ")");
    }

    @Override
    public String toString() {
        return "[IDCard: " + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
