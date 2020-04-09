package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

@SuppressWarnings("rawtypes")
public class Main {

	public static void main(String[] args) throws Exception {
		
        JAXBContext ctx = JAXBContext.newInstance(Menu.class);   
        Unmarshaller umshr = ctx.createUnmarshaller();   
        File xml = new File("src/menu_origin.xml");
        
        InputStream is = new FileInputStream(xml);
        Menu menu = (Menu) umshr.unmarshal(is);   
 
        Iterator itr = menu.getItem().iterator();
        while (itr.hasNext()) {
        	Item item = (Item) itr.next();

        	System.out.println("id :: " + item.getId());
        	System.out.println("name :: " + item.getName());
        	System.out.println("link :: " + item.getLink());
        	System.out.println("absoluteSee :: " + item.isAbsoluteSee());
        	System.out.println("onlyGrade :: " + item.getOnlyGrade());
        	
        	Iterator itr2 = item.getItem().iterator();
        	while (itr2.hasNext()) {
        		Item item2 = (Item) itr2.next();
        		System.out.println("		id :: " + item2.getId());
                System.out.println("		name :: " + item2.getName());
                System.out.println("		link :: " + item2.getLink());
                System.out.println("		absoluteSee :: " + item2.isAbsoluteSee());
                System.out.println("		onlyGrade :: " + item2.getOnlyGrade());
                System.out.println("");
                if(item2.getItem() != null) {
                	Iterator itr3 = item2.getItem().iterator();
                	while (itr3.hasNext()) {
                		Item item3 = (Item) itr3.next();
                		System.out.println("				id :: " + item3.getId());
                		System.out.println("				name :: " + item3.getName());
                		System.out.println("				link :: " + item3.getLink());
                		System.out.println("				absoluteSee :: " + item3.isAbsoluteSee());
                		System.out.println("				onlyGrade :: " + item3.getOnlyGrade());
                		System.out.println("");
                	}
                }
        	}
        }
	}

}
