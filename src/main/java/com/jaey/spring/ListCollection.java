package com.jaey.spring;

import java.util.ArrayList;

public class ListCollection {
	private ArrayList<ListEntity> list = new ArrayList<ListEntity>();
	
	public ListCollection () {
		list.add(new ListEntity("","","","",""));
		list.add(new ListEntity("","","","",""));
		list.add(new ListEntity("","","","",""));
		list.add(new ListEntity("","","","",""));
		list.add(new ListEntity("","","","",""));
		list.add(new ListEntity("","","","",""));
		list.add(new ListEntity("","","","",""));
		list.add(new ListEntity("","","","",""));
		list.add(new ListEntity("","","","",""));
		list.add(new ListEntity("","","","",""));
		list.add(new ListEntity("","","","",""));
		list.add(new ListEntity("","","","",""));
	}

	public ArrayList<ListEntity> getList() {
		return list;
	}
	
	
}
