package com.esuyolu.jspcontexts.conversion;

import java.util.StringTokenizer;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter("emailConverter")
public class EmailConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		try {
			StringTokenizer tokenizer = new StringTokenizer(value, "@.");
			EmailAddress emailAddress = new EmailAddress();
			emailAddress.setUser(tokenizer.nextToken());
			emailAddress.setDomain(tokenizer.nextToken());
			emailAddress.setExtension(tokenizer.nextToken());

			return emailAddress;
		} catch (Exception e) {
			throw new ConverterException("Geçersiz e-posta");
		}
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		EmailAddress emailAddress = (EmailAddress) value;
		StringBuilder builder = new StringBuilder();
		builder.append(emailAddress.getUser());
		builder.append("@");
		builder.append(emailAddress.getDomain());
		builder.append(".");
		builder.append(emailAddress.getExtension());

		return builder.toString();
	}

}
