package fr.training.samples.spring.shop.samples.spring.shop.exposition.customer.rest;

import java.io.Serializable;

/**
 * @author Badr NASS
 *
 */
class CustomerDTO implements Serializable {

    /**
     * serialVersionUID of type long
     */
    private static final long serialVersionUID = 1L;

    /**
     * customerID of type String
     */
    private String customerID;

    /**
     * name of type String
     */
    private String name;

    /**
     * password of type String
     */
    private String password;

    /**
     * 
     */
    public CustomerDTO() {
        super();
    }

    /**
     * @param name
     * @param password
     */
    public CustomerDTO(final String name, final String password) {
        super();
        this.name = name;
        this.password = password;
    }

    /**
     * @param customerID
     * @param name
     * @param password
     */
    public CustomerDTO(final String customerID, final String name, final String password) {
        this.customerID = customerID;
        this.name = name;
        this.password = password;
    }

    /**
     * @return
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param customerID
     */
    public void setCustomerID(final String customerID) {
        this.customerID = customerID;
    }

    /**
     * @param name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @param password
     */
    public void setPassword(final String password) {
        this.password = password;
    }

}
