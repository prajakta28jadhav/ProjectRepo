package com.cjc.app.fss.ro.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Make {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int makeId;

	private String makeName;

	private String makeDesc;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "make")
	private Model model;

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public int getMakeId() {
		return makeId;
	}

	public void setMakeId(int makeId) {
		this.makeId = makeId;
	}

	public String getMakeName() {
		return makeName;
	}

	public void setMakeName(String makeName) {
		this.makeName = makeName;
	}

	public String getMakeDesc() {
		return makeDesc;
	}

	public void setMakeDesc(String makeDesc) {
		this.makeDesc = makeDesc;
	}

}
