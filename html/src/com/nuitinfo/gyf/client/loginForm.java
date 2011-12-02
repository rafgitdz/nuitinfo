package com.nuitinfo.gyf.client;

import com.smartgwt.client.types.TitleOrientation;  
//import com.smartgwt.client.widgets.events.ClickEvent;  
//import com.smartgwt.client.widgets.events.ClickHandler;  
import com.smartgwt.client.widgets.form.DynamicForm;  
import com.smartgwt.client.widgets.form.fields.ButtonItem;
import com.smartgwt.client.widgets.form.fields.FormItem;  
import com.smartgwt.client.widgets.form.fields.PasswordItem;  
import com.smartgwt.client.widgets.form.fields.TextItem;  
import com.smartgwt.client.widgets.layout.HLayout; 
import com.smartgwt.client.widgets.layout.Layout;
  
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.smartgwt.client.widgets.form.fields.events.ClickEvent;  
import com.smartgwt.client.widgets.form.fields.events.ClickHandler;  
  
public class loginForm extends Composite {   
	
    public loginForm() {  
        HLayout layout = new HLayout(20);  
          
        final DynamicForm form = new DynamicForm();  
        form.setWidth(250);  
          
        TextItem usernameItem = new TextItem();  
        usernameItem.setTitle("Username");  
        usernameItem.setRequired(true);  
        usernameItem.setDefaultValue("bob");  
  
        PasswordItem passwordItem = new PasswordItem();  
        passwordItem.setTitle("Password");  
        passwordItem.setRequired(true);  
 
        final ButtonItem logAccount = new ButtonItem();  
        logAccount.setName("logAccount");  
        logAccount.setTitle("Log Account");
        
        logAccount.addClickHandler(new ClickHandler() {  
            public void onClick(ClickEvent event) {  
                if(form.validate()) {
                    return;
                }
                
                // requête soap
                
            }  
        });
        
        form.setFields(new FormItem[] {usernameItem, passwordItem, logAccount});  
        
        layout.addMember(form);
        initWidget(layout);           
    }  
  
}  