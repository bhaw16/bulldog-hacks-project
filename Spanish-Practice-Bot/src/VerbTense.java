
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
		this.vos = vos;
	}
	
	protected abstract String conjugateYo();
	protected abstract String conjugateTu();
	protected abstract String conjugateElEllaUsted();
	protected abstract String conjugateNosotrosAs();
	protected abstract String conjugateVosotrosAs();
	protected abstract String conjugateEllosEllasUstedes();
	protected abstract String conjugateVos();
	
}
