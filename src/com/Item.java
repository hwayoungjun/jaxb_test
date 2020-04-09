package com;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "item")
public class Item {
	private String name;
	private String id;
	private String link;
	
	@XmlAttribute(name = "absoluteSee")
	private boolean isAbsoluteSee;
	@XmlAttribute(name ="onlyGrade")
	private int onlyGrade;
	
	private List<Item> item;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	public boolean isAbsoluteSee() {
		return isAbsoluteSee;
	}

	public void setAbsoluteSee(boolean isAbsoluteSee) {
		this.isAbsoluteSee = isAbsoluteSee;
	}

	public int getOnlyGrade() {
		return onlyGrade;
	}

	public void setOnlyGrade(int onlyGrade) {
		this.onlyGrade = onlyGrade;
	}
}
