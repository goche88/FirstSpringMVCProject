package com.gontuseries.util;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String> {

	private String listOfHobbies;
	@Override
	public void initialize(IsValidHobby isValidHobby) {
				listOfHobbies = isValidHobby.listOfValidHobbies();
	}

	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext ctx) {
		if(studentHobby == null) {
			return false;
		}
		if(studentHobby.matches(listOfHobbies)) {
			return true;
		}
		return false;
	}

}