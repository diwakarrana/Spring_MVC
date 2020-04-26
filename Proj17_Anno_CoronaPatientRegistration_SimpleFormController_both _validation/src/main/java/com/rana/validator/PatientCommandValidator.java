package com.rana.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.rana.javabeans.PatientCommand;

@Component("patCmdValidator")
public class PatientCommandValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		System.out.println("PatientCommandValidator.supports()");
		return clazz.isAssignableFrom(PatientCommand.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		PatientCommand patCmd=null;
		   System.out.println("PatientCommandValidator.validate()");
		   //type casting
		   patCmd=(PatientCommand)target;
		   //enable Serrver side form validations only when  client side form validations are not done
		      //server side form validations..
			   
			   if(patCmd.getVflag().equalsIgnoreCase("no")) {
				   System.out.println("PatientCommandValidator.validate()--->server form validations are happening");
			   
			   System.out.println(patCmd.getPatName()+"  "+patCmd.getLocation()+"   "+patCmd.getHospital()+"  "+ patCmd.getAge());
			   
		      if(patCmd.getPatName()==null || patCmd.getPatName().equalsIgnoreCase("") || patCmd.getPatName().length()==0)
			     errors.rejectValue("patName","patient.name.required");
		  
		      if(patCmd.getAge()==null)
			      errors.rejectValue("age","patient.age.required");
		      else if(patCmd.getAge()<1 || patCmd.getAge()>100)
			   errors.rejectValue("age","patient.age.range");
		   
		     if(patCmd.getLocation()==null || patCmd.getLocation().equalsIgnoreCase("") || patCmd.getLocation().length()==0)
			   errors.rejectValue("location","patient.location.required");
		   
		      if(patCmd.getHospital()==null || patCmd.getHospital().equalsIgnoreCase("") || patCmd.getHospital().length()==0)
			   errors.rejectValue("hospital","patient.hospital.required");
		     else if(patCmd.getHospital().length()<3 || patCmd.getHospital().length()>12)
			   errors.rejectValue("hospital","patient.hospital.length");
	}

}
}