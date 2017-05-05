/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author SONY
 */
public class mItem {
    private int item_id;
    private String image;
    private String name;

    public mItem(){
        this.item_id = 0;
        this.image = "N/A";
        this.name = "N/A";
    }
    
    public mItem(int item_id, String image, String name) {
        this.item_id = item_id;
        this.image = image;
        this.name = name;
    }
    
    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
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
    
    
}
