package plan4.Transport;

import java.util.Date;

/**
 * @Description:
 * @Author: Administrator
 * @Date: 2020/5/18 11:09
 * @Version: 1.0
 * @Modified by:
 */
public abstract class Transport {
    private String id;
    private String ownership;
    private String Price;
    private Date dateOfPurchase;
    private String GPSPosition;

    public abstract void drivingMethod();
    public abstract void load();
    public abstract void maintain();
    public abstract void addGas();

    public Transport() {
    }

    public Transport(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getGPSPosition() {
        return GPSPosition;
    }

    public void setGPSPosition(String GPSPosition) {
        this.GPSPosition = GPSPosition;
    }
}
