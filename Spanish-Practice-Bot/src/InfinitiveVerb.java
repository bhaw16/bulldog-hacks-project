
public class InfinitiveVerb {
	private String stem;
	private String ending;
	private boolean irregular;
	private boolean reflextive;
	
	public String toString() {
		return new StringBuilder(stem).append(ending).toString();
	}
}
