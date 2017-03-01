/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SONY
 */
@Entity
@Table(name = "form_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FormType.findAll", query = "SELECT f FROM FormType f")
    , @NamedQuery(name = "FormType.findByFormTypeId", query = "SELECT f FROM FormType f WHERE f.formTypeId = :formTypeId")
    , @NamedQuery(name = "FormType.findByName", query = "SELECT f FROM FormType f WHERE f.name = :name")})
public class FormType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "form_type_id")
    private Integer formTypeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "name")
    private String name;

    public FormType() {
    }

    public FormType(Integer formTypeId) {
        this.formTypeId = formTypeId;
    }

    public FormType(Integer formTypeId, String name) {
        this.formTypeId = formTypeId;
        this.name = name;
    }

    public Integer getFormTypeId() {
        return formTypeId;
    }

    public void setFormTypeId(Integer formTypeId) {
        this.formTypeId = formTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (formTypeId != null ? formTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FormType)) {
            return false;
        }
        FormType other = (FormType) object;
        if ((this.formTypeId == null && other.formTypeId != null) || (this.formTypeId != null && !this.formTypeId.equals(other.formTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.FormType[ formTypeId=" + formTypeId + " ]";
    }
    
}
