/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repo;

import Model.Product;
import java.util.ArrayList;

/**
 *
 * @author looby
 */
public class ProductRepo {

    private static ArrayList<Product> listPro = new ArrayList<>();

    public static void initialData() {
        listPro.add(new Product("P1", "car1", "brand 1", 100, "Green", "sang", "/car1.jpg", 1000));
        listPro.add(new Product("P2", "car2", "brand 4", 200, "Blue", "xin", "/car2.jpg", 1000));
        listPro.add(new Product("P3", "car3", "brand 4", 300, "Red", "sang", "/car3.jpg", 1000));

    }

    public static void create(Product product) {
        ProductRepo.listPro.add(product);
    }

    public static ArrayList<Product> read() {
        return ProductRepo.listPro;
    }

    public static Product detail(String id) {
        for (Product pro : ProductRepo.listPro) {
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
        return  "ProductRepo{" + "listPro=" + listPro + '}';
    }

    public ArrayList<Product> getlistPro() {
        return listPro;
    }

    public void setlistPro(ArrayList<Product> listPro) {
        this.listPro = listPro;
    }

    public ProductRepo(ArrayList<Product> listPro) {
        this.listPro = listPro;
    }

    public ProductRepo() {
        listPro = new ArrayList<>();
    }
}
