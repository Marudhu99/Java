package com.javapractice;

enum EmailServiceConstants {
	mailTemplateTableName("TIMESHEET_APP_EMAIL_TEMPLATE"),
	mailTemplateKeyColumnName("DSC_EMAIL_TEMPLATE_KEY"),
	mailTemplateColumnName("DSC_EMAIL_TEMPLATE"), 
	mailTemplateModifiedDateColumnName("DATE_USER_MODIFIED");

	String constants;

	EmailServiceConstants(String constants) {
		this.constants = constants;
	}

	public String getConst() {
		return constants;
	}
}

public class EnumDemo2 {

	public static void main(String[] args) {
       System.out.println(EmailServiceConstants.mailTemplateColumnName.getConst());
       System.out.println(EmailServiceConstants.mailTemplateKeyColumnName.getConst());
       System.out.println(EmailServiceConstants.mailTemplateModifiedDateColumnName.getConst());
	}

}
