package com.esuyolu.jspcontexts.conversion;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("emailValidator")
public class EmailValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		String string = (String) value;
		String text = "";	
		if (!string.contains("@")) {
			text += "e-posta mutlaka @ içermeli";
		}
		if (!string.contains(".")) {
			text += "e-posta mutlaka . içermeli";
		}
		if (!text.equals("")) {
			FacesMessage facesMessage = new FacesMessage();
			facesMessage.setSummary("geçersiz e-posta");
			facesMessage.setDetail(text);
			facesMessage.setSeverity(FacesMessage.SEVERITY_FATAL);
			throw new ValidatorException(facesMessage);
		}
	}
}
