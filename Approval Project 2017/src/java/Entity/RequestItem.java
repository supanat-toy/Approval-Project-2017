/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SONY
 */
@Entity
@Table(name = "request_item")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RequestItem.findAll", query = "SELECT r FROM RequestItem r")
    , @NamedQuery(name = "RequestItem.findByFormId", query = "SELECT r FROM RequestItem r WHERE r.requestItemPK.formId = :formId")
    , @NamedQuery(name = "RequestItem.findByItemId", query = "SELECT r FROM RequestItem r WHERE r.requestItemPK.itemId = :itemId")
    , @NamedQuery(name = "RequestItem.findByQuantity", query = "SELECT r FROM RequestItem r WHERE r.quantity = :quantity")})
public class RequestItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RequestItemPK requestItemPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantity")
    private int quantity;

    public RequestItem() {
    }

    public RequestItem(RequestItemPK requestItemPK) {
        this.requestItemPK = requestItemPK;
    }

    public RequestItem(RequestItemPK requestItemPK, int quantity) {
        this.requestItemPK = requestItemPK;
        this.quantity = quantity;
    }

    public RequestItem(int formId, int itemId) {
        this.requestItemPK = new RequestItemPK(formId, itemId);
    }

    public RequestItemPK getRequestItemPK() {
        return requestItemPK;
    }

    public void setRequestItemPK(RequestItemPK requestItemPK) {
        this.requestItemPK = requestItemPK;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (requestItemPK != null ? requestItemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RequestItem)) {
            return false;
        }
        RequestItem other = (RequestItem) object;
        if ((this.requestItemPK == null && other.requestItemPK != null) || (this.requestItemPK != null && !this.requestItemPK.equals(other.requestItemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.RequestItem[ requestItemPK=" + requestItemPK + " ]";
    }
    
}
