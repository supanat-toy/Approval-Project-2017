/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SONY
 */
@Entity
@Table(name = "response_message")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ResponseMessage.findAll", query = "SELECT r FROM ResponseMessage r")
    , @NamedQuery(name = "ResponseMessage.findByResponseMessageId", query = "SELECT r FROM ResponseMessage r WHERE r.responseMessageId = :responseMessageId")
    , @NamedQuery(name = "ResponseMessage.findByFormId", query = "SELECT r FROM ResponseMessage r WHERE r.formId = :formId")
    , @NamedQuery(name = "ResponseMessage.findByMessage", query = "SELECT r FROM ResponseMessage r WHERE r.message = :message")
    , @NamedQuery(name = "ResponseMessage.findByCreatedDate", query = "SELECT r FROM ResponseMessage r WHERE r.createdDate = :createdDate")
    , @NamedQuery(name = "ResponseMessage.findByCreatedBy", query = "SELECT r FROM ResponseMessage r WHERE r.createdBy = :createdBy")
    , @NamedQuery(name = "ResponseMessage.findByUpdatedDate", query = "SELECT r FROM ResponseMessage r WHERE r.updatedDate = :updatedDate")
    , @NamedQuery(name = "ResponseMessage.findByUpdatedBy", query = "SELECT r FROM ResponseMessage r WHERE r.updatedBy = :updatedBy")})
public class ResponseMessage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "response_message_id")
    private Integer responseMessageId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "form_id")
    private int formId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10000)
    @Column(name = "message")
    private String message;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created_by")
    private int createdBy;
    @Basic(optional = false)
    @NotNull
    @Column(name = "updated_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "updated_by")
    private int updatedBy;

    public ResponseMessage() {
    }

    public ResponseMessage(Integer responseMessageId) {
        this.responseMessageId = responseMessageId;
    }

    public ResponseMessage(Integer responseMessageId, int formId, String message, Date createdDate, int createdBy, Date updatedDate, int updatedBy) {
        this.responseMessageId = responseMessageId;
        this.formId = formId;
        this.message = message;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
        this.updatedDate = updatedDate;
        this.updatedBy = updatedBy;
    }

    public Integer getResponseMessageId() {
        return responseMessageId;
    }

    public void setResponseMessageId(Integer responseMessageId) {
        this.responseMessageId = responseMessageId;
    }

    public int getFormId() {
        return formId;
    }

    public void setFormId(int formId) {
        this.formId = formId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public int getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (responseMessageId != null ? responseMessageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ResponseMessage)) {
            return false;
        }
        ResponseMessage other = (ResponseMessage) object;
        if ((this.responseMessageId == null && other.responseMessageId != null) || (this.responseMessageId != null && !this.responseMessageId.equals(other.responseMessageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.ResponseMessage[ responseMessageId=" + responseMessageId + " ]";
    }
    
}
