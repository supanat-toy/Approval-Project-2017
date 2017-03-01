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
public class FormTypeModel {
    
    public FormTypeModel(){
        this.form_type_id = 0;
        this.name = "";
    }
    
    private int form_type_id;
    String name;

    public int getForm_type_id() {
        return form_type_id;
    }

    public void setForm_type_id(int form_type_id) {
        this.form_type_id = form_type_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
