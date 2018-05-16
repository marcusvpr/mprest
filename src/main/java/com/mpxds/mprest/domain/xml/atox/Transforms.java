package com.mpxds.mprest.domain.xml.atox;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Transforms")
public class Transforms {
	//

	@XmlElement(name="Transform")
   private List<Transform> Transforms = new ArrayList<Transform>();

	// --- 
	
	public List<Transform> getTransforms() { return Transforms; }		
    public void add(Transform Transform) {
    	Transforms.add(Transform);
    }
    
    // ---
 
	@Override
	public String toString() {
		//
		return "Transforms[" + Transforms.toString() + "]Transforms";
  	}
}