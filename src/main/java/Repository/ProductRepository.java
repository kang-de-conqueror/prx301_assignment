/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Marshaller.UnmarshallerService;
import Model.Product;
import java.util.ArrayList;

public class ProductRepository {

    private static ArrayList<Product> listPro = new ArrayList<>();
    private static final UnmarshallerService unmarshallerService = new UnmarshallerService();

    public static void initialData() {
        if (listPro.isEmpty()) {
            listPro = unmarshallerService.unmarshallerProduct();
        }
    }

    public static ArrayList<Product> sortByName(String brand) {
        ArrayList<Product> list = new ArrayList<>();
        for (Product product : unmarshallerService.unmarshallerProduct()) {
            if (product.getBrand().equals(brand)) {
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
        for (Product p : listPro) {
            if (p.getId().equals(product.getId())) {
                return false;
            }
        }
        listPro.add(product);
        return true;
    }

    public static ArrayList<Product> read() {
        return listPro;
    }

    public static Product detail(String id) {
        for (Product pro : ProductRepository.read()) {
            if (id.equals(pro.getId())) {
                return pro;
            }
        }
        return null;
    }

    public static boolean update(Product pro) {
        for (int i = 0; i < listPro.size(); i++) {
            if (pro.getId().equals(listPro.get(i).getId())) {
                listPro.set(i, pro);
                return true;
            }
        }
        return false;
    }

    public static boolean delete(String id) {
        int index = -1;
        for (int i = 0; i < listPro.size(); i++) {
            if (id.equals(listPro.get(i).getId())) {
                index = i;
                break;
            }
        }
        if (index > -1) {
            listPro.remove(index);
            return true;
        }
        return false;
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
