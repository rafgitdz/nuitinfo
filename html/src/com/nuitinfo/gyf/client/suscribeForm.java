package com.nuitinfo.gyf.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.smartgwt.client.types.TitleOrientation;
//import com.smartgwt.client.widgets.events.ClickEvent;
//import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.ButtonItem;
import com.smartgwt.client.widgets.form.fields.DateItem;
import com.smartgwt.client.widgets.form.fields.FormItem;
import com.smartgwt.client.widgets.form.fields.PasswordItem;
import com.smartgwt.client.widgets.form.fields.TextItem;
import com.smartgwt.client.widgets.form.validator.MatchesFieldValidator;
import com.smartgwt.client.widgets.layout.HLayout;

import com.smartgwt.client.widgets.form.fields.events.ClickEvent;  
import com.smartgwt.client.widgets.form.fields.events.ClickHandler;  

public class suscribeForm extends Composite {	            
		        public suscribeForm(){  
		            HLayout layout = new HLayout(20);  
		              
		            final DynamicForm form = new DynamicForm();  
		            form.setWidth(250);
		            		              
		            TextItem usernameItem = new TextItem();  
		            usernameItem.setTitle("Username");  
		            usernameItem.setRequired(true);  
		            usernameItem.setDefaultValue("bob");  
		      
		            TextItem emailItem = new TextItem();  
		            emailItem.setTitle("Email");  
		            emailItem.setRequired(true);  
		            emailItem.setDefaultValue("bob@isomorphic.com"); 

		            DateItem birthdayItem = new DateItem();  
		            birthdayItem.setTitle("Date");  
		            birthdayItem.setHint("<nobr>Picklist based date input</nobr>");  
		            
		            MatchesFieldValidator validator = new MatchesFieldValidator();  
		            validator.setOtherField("password2");  
		            validator.setErrorMessage("Passwords do not match");  
		            
		            PasswordItem passwordItem = new PasswordItem();  
		            passwordItem.setTitle("Password"); 
		            passwordItem.setName("password");  
		            passwordItem.setRequired(true);  
		            passwordItem.setValidators(validator); 
		            
		            PasswordItem password2Item = new PasswordItem();  
		            password2Item.setTitle("Password again");  
		            password2Item.setName("password2");  
		            password2Item.setRequired(true);  
		            password2Item.setType("password");  
		      
		            final ButtonItem createAccount = new ButtonItem();  
		            createAccount.setName("createAccount");  
		            createAccount.setTitle("Create Account");  
		            createAccount.addClickHandler(new ClickHandler() {  
		                public void onClick(ClickEvent event) {  
		                    form.validate();  
		                }  
		            });
		            
		            form.setFields(new FormItem[] {usernameItem, emailItem, birthdayItem, passwordItem, password2Item, createAccount});  		              

		            layout.addMember(form); 
		            initWidget(layout);
		        }  
		      
		    }  

