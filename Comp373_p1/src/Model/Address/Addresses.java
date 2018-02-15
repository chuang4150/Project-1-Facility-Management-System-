package Model.Address;

public class Addresses implements Address {

    private String address1;
    private String address2;
    private String city;
    private String state;
    private int zip;

    public void setAddress1(String address1){
        this.address1 = address1;
    }

    public void setAddress2(String address2){
        this.address2 = address2;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setState(String state){
        this.state = state;
    }

    public void setZip(int zip){
        this.zip = zip;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }
}
