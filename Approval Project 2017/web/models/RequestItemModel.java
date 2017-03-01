/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author USER
 */
public class RequestItemModel {
    private int form_id;
    private int item_id;
    private int quantity;

    public RequestItemModel() {
        this.form_id = 0;
        this.item_id = 0;
        this.quantity = 0;
    }
    
    public RequestItemModel(int form_id, int item_id, int quantity) {
        this.form_id = form_id;
        this.item_id = item_id;
        this.quantity = quantity;
    }

    public int getForm_id() {
        return form_id;
    }

    public void setForm_id(int form_id) {
        this.form_id = form_id;
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
