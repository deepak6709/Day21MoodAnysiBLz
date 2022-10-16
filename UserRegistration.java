package com.RegexpBlz;



import java.util.Scanner;
import java.util.regex.Pattern;

import javax.xml.validation.Validator;

public class UserRegistration {
	public boolean validFirstName(String name) throws UserRegistrationException {
		// firstName or lastName starts with Cap and has minimum 3 characters

		Pattern fName = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");
		boolean isValid = fName.matcher(name).matches();

		if (isValid) {
			return true;
		} else {
			throw new Exception("Invalid first name " + name);
		}

	}

	public boolean validLastName(String name) throws UserRegistrationException {
		// Validation for firstName or lastName is same
		boolean isValid = validFirstName(name);
		if (isValid) {
			return true;
		} else {
			throw new UserRegistrationException("Invalid last name" + name);
		}
	}

	public boolean validEmailId(String email) throws UserRegistrationException {
	        /*        E.g. abc.xyz@bl.co.in
	        Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in)
	        with precise @ and . positions
	        */

	        Pattern pattern=Pattern.compile("^[a-z].[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2,})$");

	public Validator name = (name) -> {
		Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");
		boolean isValid = pattern.matcher(name).matches();
		if (isValid) {
			return true;
		} else {
			throw new UserRegistrationException("Invalid Name => " + name);
		}
	};

	public Validator validEmailId = (email) -> {
		Pattern pattern = Pattern.compile("^[a-z].[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2,})$");
		boolean isValid = pattern.matcher(email).matches();
		if (isValid) {
			return true;
		} else {
			throw new UserRegistrationException("Invalid email" + email);
			throw new UserRegistrationException("Invalid email");
		}
	
	

	public boolean validPhoneNumber(String number) throws UserRegistrationException {

	public Validator validPhoneNumber = (phoneNumber) -> {
		Pattern pattern = Pattern.compile("^[9][1][ ][6-9][0-9]{9}$");
		boolean isValid = pattern.matcher(number).matches();
		boolean isValid = pattern.matcher(phoneNumber).matches();
		if (isValid) {
			return true;
		} else {
			throw new UserRegistrationException("Invalid phone number" + number);
		}
	};
	else
	{
		throw new Exception("Invalid phone number");
	}
	}

	public boolean validPassword(String password)throws UserRegistrationException{

	// password all rules 1 to 4
     	public Validator validPassword = (password) -> {
	        Pattern pattern = Pattern.compile("^(?=.[A-Z])(?=.[a-z])(?=.[0-9])(?=.[@#$%^&+=])?.{8,}$");
	        boolean isValid = pattern.matcher(password).matches();
	        if(isValid){
	            return true;
	        }
	        else{
	            throw new UserRegistrationException("password is invalid " +password);
	            throw new UserRegistrationException("Invalid password ");
	        }
	    }
}}}
