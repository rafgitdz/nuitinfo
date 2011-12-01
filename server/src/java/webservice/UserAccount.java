/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ejb.Stateless;

/**
 *
 * @author jbaleiza
 */
@WebService()
@Stateless()
public class UserAccount {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CreateAccount")
    public Integer CreateAccount(@WebParam(name = "id")
    String id, @WebParam(name = "nom")
    String nom, @WebParam(name = "prenom")
    String prenom, @WebParam(name = "mdp")
    String mdp, @WebParam(name = "mail")
    String mail, @WebParam(name = "date_naissance")
    String date_naissance) {

    
        return null;
    }


}
