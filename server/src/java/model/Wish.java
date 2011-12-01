/*
 * This class stores all the information about the user's different wishes
 */

package model;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author mavomoeb
 */
public class Wish {
    private Integer _id;
    private String _name;
    private String _description;
    private List<Category> _categories;

    public Wish() {
        this._categories = new ArrayList<Category>();
    }
    
    public Wish(Integer id, String name, String description) {
        this._id = id;
        this._name = name;
        this._description = description;
        this._categories = new ArrayList<Category>();
    }

    public Wish(Integer id, String name, String description,
                List<Category> categories) {
        this._id = id;
        this._name = name;
        this._description = description;
        this._categories = categories;
    }

/******************************  GETTERS **************************************/

    public List<Category> getCategories() {
        return _categories;
    }

    public Category getCategory(int position) {
        return _categories.get(position);
    }

    public String getDescription() {
        return _description;
    }

    public Integer getId() {
        return _id;
    }

    public String getName() {
        return _name;
    }

/******************************  SETTERS **************************************/

    public void setCategories(List<Category> categories) {
        this._categories = categories;
    }

    public void setCategory(int position, Category category) {
        this._categories.set(position, category);
    }

    public void setDescription(String description) {
        this._description = description;
    }

    public void setId(Integer id) {
        this._id = id;
    }

    public void setName(String name) {
        this._name = name;
    }

/*****************************************************************************/

    public void addCategory(Category category) {
        this._categories.add(category);
    }

    public void removeCategory(Category category) {
        this._categories.remove(category);
    }

    public void removeCategory(Integer position) {
        this._categories.remove(position);
    }

}
