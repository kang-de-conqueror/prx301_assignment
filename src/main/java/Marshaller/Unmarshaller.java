/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Marshaller;


import Model.Product;
import Model.ProductList;
import Model.User;
import Model.UserList;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;

/**
 *
 * @author looby
 */
public class Unmarshaller {
    public static ArrayList<Product> unmarshaller() {
        File xmlFile = new File("D:\\FPT\\Fall2021\\PRX301\\ProjectWeb\\src\\Product.xml");
        ArrayList<Product> listPro = new ArrayList<>();
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(ProductList.class);
            javax.xml.bind.Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            ProductList productList = (ProductList) jaxbUnmarshaller.unmarshal(xmlFile);
            for (Product product : productList.getProduct()) {
                listPro.add(product);
            }
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listPro;
    }
    public static ArrayList<User> unmarshallerUser() {
        File xmlFile = new File("D:\\FPT\\Fall2021\\PRX301\\ProjectWeb\\src\\User.xml");
        ArrayList<User> userList = new ArrayList<>();
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(UserList.class);
            javax.xml.bind.Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            UserList users = (UserList) jaxbUnmarshaller.unmarshal(xmlFile);
            for (User user : users.getUserList()) {
                userList.add(user);
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return userList;
    }
  
}
