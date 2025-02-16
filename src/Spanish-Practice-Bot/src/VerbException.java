package java.spanish;


public class VerbException extends Exception {

	public VerbException() {
		super(new StringBuilder("This verb is an irregular verb that needs a new stem.")
		.append("\nPlease call a different method.").toString());
	}
	
	public VerbException(String stem) {
		super(new StringBuilder("This verb does not change stems. ")
		.append("Please remove any and all parameters from this method call.")
		.toString());
	}
	
	public VerbException(InfinitiveVerb verb) {
		super(new StringBuilder("This method is not compatible with verbs ending in ")
		.append(verb.getVerbEnding()).toString());
	}

}
