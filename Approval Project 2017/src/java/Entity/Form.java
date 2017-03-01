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
@Table(name = "form")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Form.findAll", query = "SELECT f FROM Form f")
    , @NamedQuery(name = "Form.findByFormId", query = "SELECT f FROM Form f WHERE f.formId = :formId")
    , @NamedQuery(name = "Form.findByFormTypeId", query = "SELECT f FROM Form f WHERE f.formTypeId = :formTypeId")
    , @NamedQuery(name = "Form.findByEventName", query = "SELECT f FROM Form f WHERE f.eventName = :eventName")
    , @NamedQuery(name = "Form.findByActivity", query = "SELECT f FROM Form f WHERE f.activity = :activity")
    , @NamedQuery(name = "Form.findByDepartment", query = "SELECT f FROM Form f WHERE f.department = :department")
    , @NamedQuery(name = "Form.findByCampus", query = "SELECT f FROM Form f WHERE f.campus = :campus")
    , @NamedQuery(name = "Form.findByFacility", query = "SELECT f FROM Form f WHERE f.facility = :facility")
    , @NamedQuery(name = "Form.findByPreparingDate", query = "SELECT f FROM Form f WHERE f.preparingDate = :preparingDate")
    , @NamedQuery(name = "Form.findByStartingDate", query = "SELECT f FROM Form f WHERE f.startingDate = :startingDate")
    , @NamedQuery(name = "Form.findByCoordinatorName", query = "SELECT f FROM Form f WHERE f.coordinatorName = :coordinatorName")
    , @NamedQuery(name = "Form.findByCoordinatorPhoneNumber", query = "SELECT f FROM Form f WHERE f.coordinatorPhoneNumber = :coordinatorPhoneNumber")
    , @NamedQuery(name = "Form.findByDescription", query = "SELECT f FROM Form f WHERE f.description = :description")
    , @NamedQuery(name = "Form.findByCreatedDate", query = "SELECT f FROM Form f WHERE f.createdDate = :createdDate")
    , @NamedQuery(name = "Form.findByCreatedBy", query = "SELECT f FROM Form f WHERE f.createdBy = :createdBy")
    , @NamedQuery(name = "Form.findByUpdatedDate", query = "SELECT f FROM Form f WHERE f.updatedDate = :updatedDate")
    , @NamedQuery(name = "Form.findByUpdatedBy", query = "SELECT f FROM Form f WHERE f.updatedBy = :updatedBy")
    , @NamedQuery(name = "Form.findByApprovedDate", query = "SELECT f FROM Form f WHERE f.approvedDate = :approvedDate")
    , @NamedQuery(name = "Form.findByApprovedBy", query = "SELECT f FROM Form f WHERE f.approvedBy = :approvedBy")
    , @NamedQuery(name = "Form.findByIsApproved", query = "SELECT f FROM Form f WHERE f.isApproved = :isApproved")})
public class Form implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "form_id")
    private Integer formId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "form_type_id")
    private int formTypeId;
    @Size(max = 300)
    @Column(name = "event_name")
    private String eventName;
    @Size(max = 300)
    @Column(name = "activity")
    private String activity;
    @Size(max = 300)
    @Column(name = "department")
    private String department;
    @Size(max = 100)
    @Column(name = "campus")
    private String campus;
    @Size(max = 300)
    @Column(name = "facility")
    private String facility;
    @Column(name = "preparing_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date preparingDate;
    @Column(name = "starting_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startingDate;
    @Size(max = 300)
    @Column(name = "coordinator_name")
    private String coordinatorName;
    @Size(max = 10)
    @Column(name = "coordinator_phone_number")
    private String coordinatorPhoneNumber;
    @Size(max = 10000)
    @Column(name = "description")
    private String description;
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
    @Column(name = "approved_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date approvedDate;
    @Column(name = "approved_by")
    private Integer approvedBy;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_approved")
    private boolean isApproved;

    public Form() {
    }

    public Form(Integer formId) {
        this.formId = formId;
    }

    public Form(Integer formId, int formTypeId, Date createdDate, int createdBy, Date updatedDate, int updatedBy, boolean isApproved) {
        this.formId = formId;
        this.formTypeId = formTypeId;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
        this.updatedDate = updatedDate;
        this.updatedBy = updatedBy;
        this.isApproved = isApproved;
    }

    public Integer getFormId() {
        return formId;
    }

    public void setFormId(Integer formId) {
        this.formId = formId;
    }

    public int getFormTypeId() {
        return formTypeId;
    }

    public void setFormTypeId(int formTypeId) {
        this.formTypeId = formTypeId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public Date getPreparingDate() {
        return preparingDate;
    }

    public void setPreparingDate(Date preparingDate) {
        this.preparingDate = preparingDate;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public String getCoordinatorName() {
        return coordinatorName;
    }

    public void setCoordinatorName(String coordinatorName) {
        this.coordinatorName = coordinatorName;
    }

    public String getCoordinatorPhoneNumber() {
        return coordinatorPhoneNumber;
    }

    public void setCoordinatorPhoneNumber(String coordinatorPhoneNumber) {
        this.coordinatorPhoneNumber = coordinatorPhoneNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Date getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(Date approvedDate) {
        this.approvedDate = approvedDate;
    }

    public Integer getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(Integer approvedBy) {
        this.approvedBy = approvedBy;
    }

    public boolean getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(boolean isApproved) {
        this.isApproved = isApproved;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (formId != null ? formId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Form)) {
            return false;
        }
        Form other = (Form) object;
        if ((this.formId == null && other.formId != null) || (this.formId != null && !this.formId.equals(other.formId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Form[ formId=" + formId + " ]";
    }
    
}
