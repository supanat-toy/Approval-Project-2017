/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session;

import Entity.ResponseMessage;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SONY
 */
@Stateless
public class ResponseMessageFacade extends AbstractFacade<ResponseMessage> {

    @PersistenceContext(unitName = "Approval_Project_2017PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ResponseMessageFacade() {
        super(ResponseMessage.class);
    }
    
}
