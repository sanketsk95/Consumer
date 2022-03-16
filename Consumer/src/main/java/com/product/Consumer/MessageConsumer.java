package com.product.Consumer;

import java.io.StringReader;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
	@Autowired 
	studentRepository repo;
	  @JmsListener(destination = "student-result-queue")
		public void messageListener(String xml) throws JAXBException {
	//	  System.out.println("student +"+ student);
			
			  // System.out.println(xml); 
		  	JAXBContext jContext =
			  JAXBContext.newInstance(Student.class); //creating the marshaller object
			  Marshaller marshallObj = jContext.createMarshaller(); 
			  Unmarshaller
			  unmarshallerObj = jContext.createUnmarshaller(); //setting the property to
			 // show xml format output
			  marshallObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			  
			  double average=0.0; String result=""; // Student
			Student student=(Student)unmarshallerObj.unmarshal(new StreamSource(new
			  StringReader(xml)));
			  average=(student.getMaths()+student.getEnglish()+student.getPhysics()
			  +student.getChemistry()+student.getSanskrit())/5;
			List<Student> list=repo.findAll();
			System.out.println(list);
			   repo.updateStudentAverageByRoll_No(average,student.getRoll_No() );
			  System.out.print("average"+average); if(average>35) { result="pass"; } else {
			  result="failed"; } System.out.println("result "+result);
			 }
	 
	
}
