/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Marshaller.Unmarshaller;
import Model.Product;
import Model.ProductList;
import java.util.ArrayList;

/**
 *
 * @author looby
 */
public class ProductRepository {

    private static ArrayList<Product> listPro = new ArrayList<>();

    public static void initialData() {
        listPro = Unmarshaller.unmarshallerProduct();
    }
    public static ArrayList<Product> sortByName(String brand){
        ArrayList<Product> list = new ArrayList<>();
        for (Product product : Unmarshaller.unmarshallerProduct()) {
            if(product.getBrand().equals(brand)){
                list.add(product);
            }
        }
        return list;
    }
    public static ArrayList<Product> sortByPrice(int low, int high){
        ArrayList<Product> list = new ArrayList<>();
        for (Product product : Unmarshaller.unmarshallerProduct()) {
            if(product.getPrice() >= low && product.getPrice() <= high){
                list.add(product);
            }
        }
        return list;
    }

    public static void create(Product product) {
        ProductRepository.listPro.add(product);
    }

    public static ArrayList<Product> read() {
        return ProductRepository.listPro;
    }

    public static Product detail(String id) {
        for (Product pro : ProductRepository.listPro) {
            if (pro.getProductId().equals(id)) {
                return pro;
            }
        }
        return null;
    }

    public static void update(Product pro) {
        for (int i = 0; i < listPro.size(); i++) {
            if (listPro.get(i).getProductId().equals(pro.getProductId())) {
                listPro.set(i, pro);
                break;
            }
        }
    }

    public static void delete(String id) {
        int index = -1;
        for (int i = 0; i < listPro.size(); i++) {
            if (listPro.get(i).getProductId().equals(id)) {
                index = i;
                break;
            }
        }
        if (index > -1) {
            listPro.remove(index);
        }
    }

    @Override
    public String toString() {
        return "ProductRepo{" + "listPro=" + listPro + '}';
    }

    public ArrayList<Product> getlistPro() {
        return listPro;
    }

    public void setlistPro(ArrayList<Product> listPro) {
        ProductRepository.listPro = listPro;
    }

    public ProductRepository(ArrayList<Product> listPro) {
        ProductRepository.listPro = listPro;
    }

    public ProductRepository() {
        listPro = new ArrayList<>();
    }
}
