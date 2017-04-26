/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author supanattechasothon
 */
public class mRequestedItem {
    private int form_department_id;
    private int form_type_id;
    private String image_url;
    private String name;
    private int item_id;
    private int quantity;

    public mRequestedItem() {
    }

    public int getForm_department_id() {
        return form_department_id;
    }

    public void setForm_department_id(int form_department_id) {
        this.form_department_id = form_department_id;
    }

    public int getForm_type_id() {
        return form_type_id;
    }

    public void setForm_type_id(int form_type_id) {
        this.form_type_id = form_type_id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
