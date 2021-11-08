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
import static java.rmi.server.LogStream.log;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

/**
 *
 * @author looby
 */
public class Unmarshaller {
    public static ArrayList<Product> unmarshallerProduct() {
        File xmlFile = new File("Product.xml");
        ArrayList<Product> listPro = new ArrayList<>();
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(ProductList.class);
            javax.xml.bind.Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            ProductList productList = (ProductList) jaxbUnmarshaller.unmarshal(xmlFile);
            for (Product product : productList.getProduct()) {
                listPro.add(product);
            }
           
        } catch (JAXBException ex) {
            log("");
        }
        return listPro;
    }
    public static ArrayList<User> unmarshallerUser() {
        File xmlFile = new File("User.xml");
        ArrayList<User> userList = new ArrayList<>();
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(UserList.class);
            javax.xml.bind.Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            UserList users = (UserList) jaxbUnmarshaller.unmarshal(xmlFile);
            for (User user : users.getUserList()) {
                userList.add(user);
            }
            
        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
        return userList;
    }
  
}
