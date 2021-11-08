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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

/**
 *
 * @author looby
 */
public class Unmarshaller {
    private static final Logger LOGGER = Logger.getLogger(Unmarshaller.class.getName());
    
    public static ArrayList<Product> unmarshallerProduct() {
        File xmlFile = new File("xml/Product.xml");
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
            LOGGER.log(Level.SEVERE, "[Unmarshaller] Error: " + ex.getMessage(), ex);
        }
        return listPro;
    }
    public static ArrayList<User> unmarshallerUser() {
        File xmlFile = new File("xml/User.xml");
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
            LOGGER.log(Level.SEVERE, "[Unmarshaller] Error: " + ex.getMessage(), ex);
        }
        return userList;
    }
  
}
