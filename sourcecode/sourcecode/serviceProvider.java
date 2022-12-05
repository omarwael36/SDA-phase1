package sourcecode;

public abstract class serviceProvider{
    private String name;
    private float taxes;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getTaxes() {
        return taxes;
    }
    public void setTaxes(float taxes) {
        this.taxes = taxes;
    }
}
