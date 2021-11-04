package domain.builders.abstractions;

public interface ISweetBuilder {
    void create();
    void setName(String name);
    void setCompany(String company);
    void setSugar(int sugar);
    void setPrice(double price);
}
