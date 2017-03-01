/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import java.util.Date;

/**
 *
 * @author USER
 */
public class ItemModel {
    private int item_id;
    private int form_rype_id;
    private String image;
    private String name;
    private Date created_date;
    private Date updated_date;

    public ItemModel() {
        this.item_id = 0;
        this.form_rype_id = 0;
        this.image = "";
        this.name = "";
        this.created_date = new Date();
        this.updated_date = new Date();
    }
    
    public ItemModel(int item_id, int form_rype_id, String image, String name, Date created_date, Date updated_date) {
        this.item_id = item_id;
        this.form_rype_id = form_rype_id;
        this.image = image;
        this.name = name;
        this.created_date = created_date;
        this.updated_date = updated_date;
    }
    
    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public int getForm_rype_id() {
        return form_rype_id;
    }

    public void setForm_rype_id(int form_rype_id) {
        this.form_rype_id = form_rype_id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public Date getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(Date updated_date) {
        this.updated_date = updated_date;
    }
}
