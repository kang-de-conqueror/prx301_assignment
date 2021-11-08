package Model;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Products")
public class ProductList implements Serializable{
    private static final long serialVersionUID =1L;
    private List<Product> product;

    public ProductList() {
    }

    public ProductList(List<Product> product) {
        this.product = product;
    }

    public List<Product> getProduct() {
        return product;
    }
    @XmlElement(name="Product")
    public void setProduct(List<Product> product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "ProductList{" + "product=" + product + '}';
    }
    
}
