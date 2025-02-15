
public class VerbEndingException extends Exception {

	public VerbEndingException(InfinitiveVerb verb) {
		super(new StringBuilder("This method is not compatible with verbs ending in")
				.append(verb.getVerbEnding()).toString());
	}

}
