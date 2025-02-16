package java.spanish;


public abstract class VerbTense {
	protected String yo;
	protected String tu;
	protected String el_ella_usted;
	protected String nosotros_as;
	protected String vosotros_as;
	protected String ellos_as_ustedes;
	protected String vos;
	protected InfinitiveVerb infinitiveForm;
	
	public VerbTense(InfinitiveVerb infinitiveForm, String yo, String tu,
	String el_ella_usted, String nosotros_as, String vosotros_as,
	String ellos_as_ustedes, String vos) {
		this.infinitiveForm = infinitiveForm;
		this.yo = yo;
		this.tu = tu;
		this.el_ella_usted = el_ella_usted;
		this.nosotros_as = nosotros_as;
		this.vosotros_as = vosotros_as;
		this.ellos_as_ustedes = ellos_as_ustedes;
		this.vos = vos;
	}
	
	public abstract String toString();
	public abstract InfinitiveVerb getInfinitiveForm();
	public abstract String conjugateYo() throws VerbException;
	public abstract String conjugateTu() throws VerbException;
	public abstract String conjugateElEllaUsted() throws VerbException;
	public abstract String conjugateNosotrosAs();
	public abstract String conjugateVosotrosAs();
	public abstract String conjugateEllosEllasUstedes() throws VerbException;
	public abstract String conjugateVos();
	
}
