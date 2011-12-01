/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package webservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ejb.Stateless;
import model.Category;

/**
 *
 * @author jbaleiza
 */
@WebService()
@Stateless()
public class UserWishes {

    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "AddWish")
    public Integer AddWish(@WebParam(name = "nickname") String nickname,
                          @WebParam(name = "id") Integer id,
                          @WebParam(name = "name") String name,
                          @WebParam(name = "description") String description,
                          @WebParam(name = "categories") List<Category> categories
                          ) {
        
        return 1;
    }

    @WebMethod(operationName = "DelWish")
    public Integer DelWish(@WebParam(name = "nickname") String nickname,
                          @WebParam(name = "id") Integer id,
                          @WebParam(name = "name") String name,
                          @WebParam(name = "description") String description,
                          @WebParam(name = "categories") List<Category> categories
                          ) {

        return 1;
    }

    @WebMethod(operationName = "SetWish")
    public Integer SetWish(@WebParam(name = "nickname") String nickname,
                          @WebParam(name = "id") Integer id,
                          @WebParam(name = "name") String name,
                          @WebParam(name = "description") String description,
                          @WebParam(name = "categories") List<Category> categories
                          ) {
        
        return 1;
    }

}
