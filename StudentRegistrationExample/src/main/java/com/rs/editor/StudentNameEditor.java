package com.rs.editor;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {
	public StudentNameEditor() {
		System.out.println("StudentNameEditor: 0-param constr");
	}
	
	@Override
	public void setAsText(String name) throws IllegalArgumentException {
		System.out.println(name);
		if(name!=null && !name.isEmpty() && name.length()>0) {
			System.out.println("NameChanging to UpperCase");
			setValue(name.toUpperCase());
		}
	}
}
