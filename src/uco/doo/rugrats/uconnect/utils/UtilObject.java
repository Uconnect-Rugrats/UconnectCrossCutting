package uco.doo.rugrats.uconnect.utils;

import java.lang.reflect.Field;

public interface UtilObject {

	
	static <O> boolean isNull(final O object) {
		return object == null;
	}

	static <O> O getDefault(final O object, final O defaultValue) {
		return isNull(object) ? defaultValue : object;
	}

	static <O> String getInstanceInString(final O object){
		StringBuilder instanceInString = new StringBuilder();
		Field[] attributes = object.getClass().getDeclaredFields();
		instanceInString.append("class: ").append(object.getClass().getSimpleName()).append("\n");
		for (Field attribute : attributes){
			attribute.setAccessible(true);
			try {
				instanceInString.append("\t").append(attribute.getName()).append(": ").append(attribute.get(object)).append("\n");
			}catch (IllegalAccessException e){
				instanceInString.append(" <<NO ACCESS ATTRIBUTE>> ");
			}
		}
		return instanceInString.toString();
		}
	static <O> boolean isDefault(final O object, final O defaultValue) {
		return  defaultValue.equals(getDefault(object, defaultValue));
	}
	static Object getDefaultValue(){
		return null;
	}

}