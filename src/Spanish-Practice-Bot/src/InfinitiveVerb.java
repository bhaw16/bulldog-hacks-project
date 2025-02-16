package spanish;


public class InfinitiveVerb {
	private String stem;
	private String ending;
	private boolean irregular;
	private boolean reflexive;
	
	public InfinitiveVerb(String stem, String ending) {
		this.stem = stem;
		this.ending = ending;
		this.irregular = false;
		this.reflexive = false;
	}
	
	public InfinitiveVerb(String stem, String ending, boolean irregular) {
		this.stem = stem;
		this.ending = ending;
		this.irregular = irregular;
		this.reflexive = false;
	}
	
	public InfinitiveVerb(String stem, String ending, boolean irregular, boolean reflexive) {
		this.stem = stem;
		this.ending = ending;
		this.irregular = irregular;
		this.reflexive = reflexive;
	}
	
	public String toString() {
		StringBuilder verb = new StringBuilder(stem).append(ending);
		return (reflexive) ? verb.append("se").toString() : verb.toString();
	}
	
	public String getVerbStem() {
		return stem;
	}
	
	public String getVerbEnding() {
		return ending;
	}
	
	public boolean getIrregularFlag() {
		return irregular;
	}
	
	public boolean getReflexiveFlag() {
		return reflexive;
	}
}
