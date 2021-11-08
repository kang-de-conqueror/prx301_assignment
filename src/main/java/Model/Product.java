/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Product")
@XmlAccessorType(XmlAccessType.FIELD)
public class Product implements Serializable {

    private String Id;
    private String Name;
    private String Brand;
    private int Price;
    private String Color;
    private int Quantity;
    private String ImgUrl;

    public Product() {
    }

    public Product(String Id, String Name, String Brand, int Price, String Color, int Quantity, String ImgURL) {
        this.Id = Id;
        this.Name = Name;
        this.Brand = Brand;
        this.Price = Price;
        this.Color = Color;
        this.Quantity = Quantity;
        this.ImgUrl = ImgURL;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
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

    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String ImgUrl) {
        this.ImgUrl = ImgUrl;
    }

    @Override
    public String toString() {
        return "Product{" + "Id=" + Id + ", Name=" + Name + ", Brand=" + Brand + ", Price=" + Price + ", Color=" + Color + ", Quantity=" + Quantity + ", ImgUrl=" + ImgUrl + '}';
    }

}
