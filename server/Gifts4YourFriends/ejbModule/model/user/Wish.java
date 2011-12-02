/*
 * This class stores all the information about the user's different wishes
 */

package model.user;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wish implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long _id;

	private String _name;

	private String _description;

	@Enumerated(EnumType.STRING)
	private Category _category;

	public Wish(Long id, String name, String description) {
		this._id = id;
		this._name = name;
		this._description = description;
	}

	public Wish(Long id, String name, String description, Category category) {

		this._id = id;
		this._name = name;
		this._description = description;
	}

	@Override
	public String toString() {
		return "model.Wish[id=" + _id + "]";
	}

	/****************************** GETTERS **************************************/

	public Category getCategory() {
		return _category;
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

	/****************************** SETTERS **************************************/

	public void setCategories(Category categories) {
		this._category = categories;
	}

	public void setCategory(Category category) {
		this._category = category;
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
}
