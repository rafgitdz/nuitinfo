package com.nuitinfo.gyf.client;

import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.ListGridFieldType;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.ImgButton;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.form.DynamicForm;  
import com.smartgwt.client.widgets.form.fields.ButtonItem;
import com.smartgwt.client.widgets.form.fields.FormItem;  
import com.smartgwt.client.widgets.form.fields.PasswordItem;  
import com.smartgwt.client.widgets.form.fields.TextItem;  
import com.smartgwt.client.widgets.layout.HLayout; 
import com.smartgwt.client.widgets.layout.VLayout;
import com.google.gwt.user.client.ui.Composite;

import com.smartgwt.client.widgets.grid.ListGrid;
import com.smartgwt.client.widgets.grid.ListGridField;
import com.smartgwt.client.widgets.grid.ListGridRecord;
  
public class wishListForm extends Composite {  
  
    private HLayout rollOverCanvas;  
    private ListGridRecord rollOverRecord;   
    
    public wishListForm() {  
    	VLayout canvas = new VLayout();
    	
        final ListGrid wishListGrid = new ListGrid() {  
            @Override  
            protected Canvas getRollOverCanvas(Integer rowNum, Integer colNum) {  
                rollOverRecord = this.getRecord(rowNum);  
  
                if(rollOverCanvas == null) {  
                    rollOverCanvas = new HLayout(3);  
                    rollOverCanvas.setSnapTo("TR");  
                    rollOverCanvas.setWidth(50);  
                    rollOverCanvas.setHeight(22);  
  
                    ImgButton editImg = new ImgButton();  
                    editImg.setShowDown(false);  
                    editImg.setShowRollOver(false);  
                    editImg.setLayoutAlign(Alignment.CENTER);  
                    editImg.setSrc("silk/comment_edit.png");  
                    editImg.setPrompt("Edit Comments");  
                    editImg.setHeight(16);  
                    editImg.setWidth(16);  
                    editImg.addClickHandler(new ClickHandler() {  
                        public void onClick(ClickEvent event) {  
                            SC.say("Edit Comment Icon Clicked for country : " + rollOverRecord.getAttribute("countryName"));  
                        }  
                    });  
  
                    ImgButton chartImg = new ImgButton();  
                    chartImg.setShowDown(false);  
                    chartImg.setShowRollOver(false);  
                    chartImg.setLayoutAlign(Alignment.CENTER);  
                    chartImg.setSrc("silk/chart_bar.png");  
                    chartImg.setPrompt("View Chart");  
                    chartImg.setHeight(16);  
                    chartImg.setWidth(16);  
                    chartImg.addClickHandler(new ClickHandler() {  
                        public void onClick(ClickEvent event) {  
                            SC.say("Chart Icon Clicked for country : " + rollOverRecord.getAttribute("countryName"));  
                        }  
                    });  
  
                    rollOverCanvas.addMember(editImg);  
                    rollOverCanvas.addMember(chartImg);  
                }  
                return rollOverCanvas;  
  
            }  
        };  
        wishListGrid.setShowRollOverCanvas(true);  
  
  
        wishListGrid.setWidth(500);  
        wishListGrid.setHeight(224);  
        wishListGrid.setShowAllRecords(true);  
  
        ListGridField nameField = new ListGridField("name", "Name");  
        ListGridField typeField = new ListGridField("type", "Type");  
        ListGridField priceField = new ListGridField("price", "Price");  
        
        wishListGrid.setCanEdit(true);  
        wishListGrid.setFields(nameField, typeField, priceField);  
        wishListGrid.setCanResizeFields(true);  
        //wishListGrid.setData(CountryData.getRecords());  
        canvas.addMember(wishListGrid);
        
        IButton button = new IButton("Edit New");  
        button.setTop(250);  
        button.addClickHandler(new ClickHandler() {  
            public void onClick(ClickEvent event) {  
            	wishListGrid.startEditingNew();  
            }  
        }); 
        canvas.addMember(button);
        
        initWidget(canvas);  
    }  
}  