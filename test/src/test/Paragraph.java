package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Paragraph {

	public static String changeFormat(String paragraph) {
		
		String regexPattern = "(\\d{3}-\\d{2}-\\d{4})";
		Pattern p = Pattern.compile(regexPattern);
        Matcher n = p.matcher(paragraph);
        String policyNumber = null;
        StringBuilder sb = new StringBuilder();
        
        while (n.find()) {
            System.out.println(n.group(1)); 
            policyNumber = n.group(1);
            String policyNumberParts[] = policyNumber.split("-");
            String formatedPolicyNumber = policyNumberParts[0] + "/" + policyNumberParts[2] + "/" + policyNumberParts[1];
            
            paragraph = paragraph.replaceFirst(regexPattern, formatedPolicyNumber);
        }
        
        return paragraph;
	}

	public static void main(String[] args) {
		System.out.println(changeFormat("Please quote your policy number: 112-39-8552. Please quote your policy number: 112-39-8553."));
	}
}
