/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Product")
@XmlAccessorType(XmlAccessType.FIELD)
public class Product {
    private static final long serialVersionUID = 1L;
    private String ProductId;
    private String ProductName;
    private String Brand;
    private int Price;
    private String Color;
    private int Quantity;
    private String imgURL;

    public Product() {
    }

    public Product(String ProductId, String ProductName, String Brand, int Price, String Color, int Quantity, String imgURL) {
        this.ProductId = ProductId;
        this.ProductName = ProductName;
        this.Brand = Brand;
        this.Price = Price;
        this.Color = Color;
        this.Quantity = Quantity;
        this.imgURL = imgURL;
    }

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    @Override
    public String toString() {
        return "Product{" + "ProductId=" + ProductId + ", ProductName=" + ProductName + ", Brand=" + Brand + ", Price=" + Price + ", Color=" + Color + ", Quantity=" + Quantity + ", imgURL=" + imgURL + '}';
    }
    
}
