/*
 * This class stores all the information about the user's different wishes
 */

package model;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ManyToMany;

/**
 *
 * @author mavomoeb
 */
@Entity
public class Wish implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long _id;
    
    
    @Column(name="name")
    private String _name;

    @Column(name="description")
    private String _description;

    @ManyToMany(cascade=CascadeType.ALL)
    private List<Category> _categories;

    public Wish() {
        this._categories = new ArrayList<Category>();
    }
    
    public Wish(Long id, String name, String description) {
        this._id = id;
        this._name = name;
        this._description = description;
        this._categories = new ArrayList<Category>();
    }

    public Wish(Long id, String name, String description,
                List<Category> categories) {
        this._id = id;
        this._name = name;
        this._description = description;
        this._categories = categories;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (_id != null ? _id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Wish)) {
            return false;
        }
        Wish other = (Wish) object;
        if ((this._id == null && other._id != null) || (this._id != null && !this._id.equals(other._id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Wish[id=" + _id + "]";
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

    public Long getId() {
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

    public void setId(Long id) {
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
