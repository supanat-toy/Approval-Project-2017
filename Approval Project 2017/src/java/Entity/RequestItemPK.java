/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author SONY
 */
@Embeddable
public class RequestItemPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "form_id")
    private int formId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "item_id")
    private int itemId;

    public RequestItemPK() {
    }

    public RequestItemPK(int formId, int itemId) {
        this.formId = formId;
        this.itemId = itemId;
    }

    public int getFormId() {
        return formId;
    }

    public void setFormId(int formId) {
        this.formId = formId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) formId;
        hash += (int) itemId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RequestItemPK)) {
            return false;
        }
        RequestItemPK other = (RequestItemPK) object;
        if (this.formId != other.formId) {
            return false;
        }
        if (this.itemId != other.itemId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.RequestItemPK[ formId=" + formId + ", itemId=" + itemId + " ]";
    }
    
}
