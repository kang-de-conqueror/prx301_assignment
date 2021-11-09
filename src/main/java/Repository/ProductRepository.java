/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Marshaller.UnmarshallerService;
import Model.Product;
import java.util.ArrayList;

public class ProductRepository {

    private static ArrayList<Product> products = new ArrayList<>();
    private static final UnmarshallerService unmarshallerService = new UnmarshallerService();

    public static void initialData() {
        if (products.isEmpty()) {
            products = unmarshallerService.unmarshallerProduct();
        }
    }

    public static ArrayList<Product> sortByName(String brand) {
        ArrayList<Product> list = new ArrayList<>();
        for (Product product : products) {
            if (product.getBrand().contains(brand)) {
                list.add(product);
            }
        }
        return list;
    }
    
    public static ArrayList<Product> search(String name) {
        if (name.isEmpty()) {
            return products;
        }
        ArrayList<Product> list = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                list.add(product);
            }
        }
        return list;
    }

    public static ArrayList<Product> sortByPrice(int low, int high) {
        ArrayList<Product> list = new ArrayList<>();
        for (Product product : unmarshallerService.unmarshallerProduct()) {
            if (product.getPrice() >= low && product.getPrice() <= high) {
                list.add(product);
            }
        }
        return list;
    }

    public static boolean create(Product product) {
        for (Product p : products) {
            if (p.getId().equals(product.getId())) {
                return false;
            }
        }
        products.add(product);
        return true;
    }

    public static ArrayList<Product> read() {
        return products;
    }

    public static Product getById(String id) {
        for (Product pro : ProductRepository.read()) {
            if (id.equals(pro.getId())) {
                return pro;
            }
        }
        return null;
    }

    public static boolean update(Product pro) {
        for (int i = 0; i < products.size(); i++) {
            if (pro.getId().equals(products.get(i).getId())) {
                products.set(i, pro);
                return true;
            }
        }
        return false;
    }

    public static boolean delete(String id) {
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (id.equals(products.get(i).getId())) {
                index = i;
                break;
            }
        }
        if (index > -1) {
            products.remove(index);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ProductRepo{" + "listPro=" + products + '}';
    }

    public ArrayList<Product> getlistPro() {
        return products;
    }

    public void setlistPro(ArrayList<Product> listPro) {
        ProductRepository.products = listPro;
    }

    public ProductRepository(ArrayList<Product> listPro) {
        ProductRepository.products = listPro;
    }

    public ProductRepository() {
        products = new ArrayList<>();
    }
}
