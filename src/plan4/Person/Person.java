package plan4.Person;


import plan4.Transport.Transport;

/**
 * @Description:
 * @Author: Administrator
 * @Date: 2020/5/18 11:05
 * @Version: 1.0
 * @Modified by:
 */
public class Person {
    private String id;
    private String P_Name;
    private int P_Age;
    private String P_Sex;

    public void driveTransport(Transport transport){
        System.out.println("driving"+transport.getId());
    }

    public Person() {
    }

    public Person(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getP_Name() {
        return P_Name;
    }

    public void setP_Name(String p_Name) {
        P_Name = p_Name;
    }

    public int getP_Age() {
        return P_Age;
    }

    public void setP_Age(int p_Age) {
        P_Age = p_Age;
    }

    public String getP_Sex() {
        return P_Sex;
    }

    public void setP_Sex(String p_Sex) {
        P_Sex = p_Sex;
    }
}
