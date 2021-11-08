/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Marshaller;

import Model.Product;
import Model.ProductList;
import Model.User;
import Model.UserList;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author looby
 */
public class UnmarshallerService {

    private static final Logger LOGGER = Logger.getLogger(UnmarshallerService.class.getName());

    public ArrayList<Product> unmarshallerProduct() {
        ArrayList<Product> products = new ArrayList<>();
        try {
            InputStream xmlFile = getClass().getResourceAsStream("/xml/Product.xml");
            if (null == xmlFile) {
                return products;
            }
            JAXBContext jaxbContext;
            jaxbContext = JAXBContext.newInstance(ProductList.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            ProductList productList = (ProductList) jaxbUnmarshaller.unmarshal(xmlFile);
            for (Product product : productList.getProduct()) {
                products.add(product);
            }
            LOGGER.log(Level.SEVERE, "Size product: " + products.size());
        } catch (JAXBException ex) {
            LOGGER.log(Level.SEVERE, "[Unmarshaller] Error: " + ex.getMessage(), ex);
        }
        return products;
    }

    public ArrayList<User> unmarshallerUser() {
        ArrayList<User> users = new ArrayList<>();
        try {
            InputStream xmlFile = getClass().getResourceAsStream("/xml/Product.xml");
            if (null == xmlFile) {
                return users;
            }
            JAXBContext jaxbContext;
            jaxbContext = JAXBContext.newInstance(UserList.class);
            javax.xml.bind.Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            UserList userList = (UserList) jaxbUnmarshaller.unmarshal(xmlFile);
            for (User user : userList.getUserList()) {
                users.add(user);
            }

        } catch (JAXBException ex) {
            LOGGER.log(Level.SEVERE, "[Unmarshaller] Error: " + ex.getMessage(), ex);
        }
        return users;
    }

}
