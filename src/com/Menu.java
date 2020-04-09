package com;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="menu")
public class Menu {
	
	private List<Item> item;

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}
	
//	private Menu.Items items;
//	
//	public Menu.Items getItems() {
//		return items;
//	}
//
//	@XmlElement(name="items")
//	public void setItems(Menu.Items items) {
//		this.items = items;
//	}
//	
//	public static class Items {
//		@XmlElement(name="item")
//		private List<Item> item;
//	}
}
