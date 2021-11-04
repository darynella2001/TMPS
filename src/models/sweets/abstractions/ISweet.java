package models.sweets.abstractions;

public interface ISweet {
    String getDetails();
    void setName(String name);
    void setCompany(String company);
    String getName();
    String getCompany();
    void setSugar(int sugar);
    int getSugar();
    void setPrice(double price);
    double getPrice();
}
