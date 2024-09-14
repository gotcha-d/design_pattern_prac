package factory_method.idcard;

import java.util.HashMap;

import factory_method.framework.Factory;
import factory_method.framework.Product;

public class IDCardFactory extends Factory {
    
    private HashMap<Integer, String> table = new HashMap();
    private int id = 0;

    @Override
    protected Product createProduct(String owner) {
        id++;
        table.put(id, owner);
        return new IDCard(owner, id);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "を登録しました");
    }
}
