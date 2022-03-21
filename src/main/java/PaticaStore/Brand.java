package PaticaStore;

import java.util.ArrayList;
import java.util.List;

public class Brand {
    private  int Id;
    private String name;

    public Brand(){

    }
    public Brand(int id, String name) {
        Id = id;
        this.name = name;
    }

    public static List<Brand> allBrand(){
        List<Brand> brands = new ArrayList<Brand>();
        brands.add(new Apple());
        brands.add(new Asus());
        brands.add(new Casper());
        brands.add(new HP());
        brands.add(new Huawei());
        brands.add(new Lenovo());
        brands.add(new Monster());
        brands.add(new Samsung());
        brands.add(new Xiaomi());
        return brands;
    }

    public static Brand getById(int Id){
        for(Brand b : Brand.allBrand()){
            if(b.getId() == Id){
                return b;
            }
        }
        return null;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
