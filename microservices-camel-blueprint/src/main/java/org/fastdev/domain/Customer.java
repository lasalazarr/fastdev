package org.fastdev.domain;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by alberto on 5/12/17.
 */
@XmlRootElement(name = "Customer")
public class Customer implements Serializable{

    private Customer customer;

    private String product;

    private int quanitity;

    private String status;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuanitity() {
        return quanitity;
    }

    public void setQuanitity(int quanitity) {
        this.quanitity = quanitity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}


