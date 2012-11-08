package mist2mean.fbm.objects;

import java.util.ArrayList;
import java.util.List;

public class ObjectContainer {
	private List<BaseObject> container;
	public ObjectContainer(){
		container = new ArrayList<BaseObject>();
	}
	
	public void update(){
		for(BaseObject obj : container){
			obj.update();
		}
	}
	public void draw(){
		for(BaseObject obj : container){
			obj.draw();
		}
	}
	
	public void addObject(BaseObject obj){
		container.add(obj);
	}
	
	public void deleteObject(BaseObject obj){
		if(container.contains(obj)){
			container.remove(obj);
		}
	}
	
	public void deleteObjectByID(int id){
		if(container.get(id) != null){
			container.remove(id);
		}
	}
	
	public BaseObject getObject(int id){
		return container.get(id);
	}
	
	public BaseObject[] getAllObjects(){
		return container.toArray(new BaseObject[container.size()]);
	}
	
	public BaseObject[] getObjectsByClass(BaseObject classType){
		List<BaseObject> foundObjects = new ArrayList<BaseObject>();
		for(BaseObject obj : container){
			if(obj.getClass() == classType.getClass()){
				foundObjects.add(obj);
			}
		}
		return foundObjects.toArray(new BaseObject[foundObjects.size()]);
	}
}
