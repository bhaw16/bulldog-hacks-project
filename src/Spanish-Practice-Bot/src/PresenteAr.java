package java.spanish;

public class PresenteAr extends VerbTense {
	
	private boolean needsNewStem;
	
	//construct a regular ar verb in el presente perfecto
	public PresenteAr(InfinitiveVerb infinitiveForm) throws VerbException {
			super(infinitiveForm, "o", "as", "a", "amos", "áis", "an", "ás");
			if ((!(infinitiveForm.getVerbEnding().equalsIgnoreCase("ar")))) {
				throw new VerbException(infinitiveForm);
			}
			needsNewStem = false;
	}
	
	//construct an irregular ar verb w/ changing stem
	public PresenteAr(InfinitiveVerb infinitiveForm, boolean needsNewStem) throws VerbException {
		super(infinitiveForm, "o", "as", "a", "amos", "áis", "an", "ás");
		if ((!(infinitiveForm.getVerbEnding().equalsIgnoreCase("ar")))) {
			throw new VerbException(infinitiveForm);
		}
		this.needsNewStem = needsNewStem;
	}
	
	//The following commented constructors only apply to Er and Ir Verbs
	/*
	//construct an irregular verb in el presente perfecto (indicate endings, stem unchanging)
	public PresenteAr(InfinitiveVerb infinitiveForm, String yo, String tu,
	String el_ella_usted, String nosotros_as, String vosotros_as,
	String ellos_as_ustedes, String vos) throws VerbException {
		super(infinitiveForm, yo, tu, el_ella_usted, nosotros_as,
		vosotros_as, ellos_as_ustedes, vos);
		if ((!(infinitiveForm.getVerbEnding().equalsIgnoreCase("ar")))) {
			throw new VerbException(infinitiveForm);
		}
		needsNewStem = false;
	}
	
	//construct an irregular verb w/ changing stem; indicate endings
	public PresenteAr(InfinitiveVerb infinitiveForm, String yo, String tu,
	String el_ella_usted, String nosotros_as, String vosotros_as,
	String ellos_as_ustedes, String vos, boolean needsNewStem) throws VerbException {
		super(infinitiveForm, yo, tu, el_ella_usted, nosotros_as,
		vosotros_as, ellos_as_ustedes, vos);
		if ((!(infinitiveForm.getVerbEnding().equalsIgnoreCase("ar")))) {
			throw new VerbException(infinitiveForm);
		}
		if (!infinitiveForm.getIrregularFlag()) {
			throw new VerbException();
		}
		this.needsNewStem = needsNewStem;
	}
	*/
	
	public InfinitiveVerb getInfinitiveForm() {
		return this.infinitiveForm;
	}
	
	public boolean getStemChangeFlag() {
		return this.needsNewStem;
	}
	
	//toString for regular verbs/irregular verbs with one stem and ending
	public String toString() {
		try {
			return new StringBuilder("Verb: ").append(infinitiveForm.toString())
			.append("\nYo ").append(conjugateYo()).append("\nTú ").append(conjugateTu())
			.append("\nÉl/Ella/Elle/Usted ").append(conjugateElEllaUsted())
			.append("\nNosotros(as) ").append(conjugateNosotrosAs())
			.append("\nVosotros(as) ").append(conjugateVosotrosAs())
			.append("\nEllos/Ellas/Elles/Ustedes ").append(conjugateEllosEllasUstedes())
			.append("\nVos ").append(conjugateVos()).toString();
		}
		catch (VerbException v) {
			return v.getMessage();
		}
	}
	
	//toString for irregular verbs w/ changing stem on all forms except nosotros(as), vosotros(as) and vos
	public String toString(String newStem) throws VerbException {
		return new StringBuilder("Verb: ").append(infinitiveForm.toString())
		.append("\nYo ").append(conjugateYo(newStem)).append("\nTú ").append(conjugateTu(newStem))
		.append("\nÉl/Ella/Elle/Usted ").append(conjugateElEllaUsted(newStem))
		.append("\nNosotros(as) ").append(conjugateNosotrosAs())
		.append("\nVosotros(as) ").append(conjugateVosotrosAs())
		.append("\nEllos/Ellas/Elles/Ustedes ").append(conjugateEllosEllasUstedes(newStem))
		.append("\nVos ").append(conjugateVos()).toString();
	}
	
	@Override
	public String conjugateYo() throws VerbException {
		if (needsNewStem) {
			throw new VerbException();
		}
		StringBuilder reflexiveStart = new StringBuilder("me ");
		String verbString = new StringBuilder(infinitiveForm.getVerbStem()).append(yo).toString();
		if (infinitiveForm.getReflexiveFlag()) {
			return reflexiveStart.append(verbString).toString();
		}
		// TODO Auto-generated method stub
		return verbString;
	}
	
	public String conjugateYo(String newStem) throws VerbException {
		if (!infinitiveForm.getIrregularFlag()) {
			throw new VerbException(newStem);
		}
		StringBuilder reflexiveStart = new StringBuilder("me ");
		String verbString = new StringBuilder(newStem).append(yo).toString();
		if (infinitiveForm.getReflexiveFlag()) {
			return reflexiveStart.append(verbString).toString();
		}
		// TODO Auto-generated method stub
		return verbString;
	}

	@Override
	public String conjugateTu() throws VerbException {
		if (needsNewStem) {
			throw new VerbException();
		}
		// TODO Auto-generated method stub
		StringBuilder reflexiveStart = new StringBuilder("te ");
		String verbString = new StringBuilder(infinitiveForm.getVerbStem()).append(tu).toString();
		if (infinitiveForm.getReflexiveFlag()) {
			return reflexiveStart.append(verbString).toString();
		}
		// TODO Auto-generated method stub
		return verbString;
	}
	
	public String conjugateTu(String newStem) throws VerbException {
		if (!infinitiveForm.getIrregularFlag()) {
			throw new VerbException(newStem);
		}
		StringBuilder reflexiveStart = new StringBuilder("te ");
		String verbString = new StringBuilder(newStem).append(tu).toString();
		if (infinitiveForm.getReflexiveFlag()) {
			return reflexiveStart.append(verbString).toString();
		}
		// TODO Auto-generated method stub
		return verbString;
	}

	@Override
	public String conjugateElEllaUsted() throws VerbException {
		if (needsNewStem) {
			throw new VerbException();
		}
		// TODO Auto-generated method stub
		StringBuilder reflexiveStart = new StringBuilder("se ");
		String verbString = new StringBuilder(infinitiveForm.getVerbStem()).append(el_ella_usted).toString();
		if (infinitiveForm.getReflexiveFlag()) {
			return reflexiveStart.append(verbString).toString();
		}
		// TODO Auto-generated method stub
		return verbString;
	}
	
	public String conjugateElEllaUsted(String newStem) throws VerbException {
		if (!infinitiveForm.getIrregularFlag()) {
			throw new VerbException(newStem);
		}
		StringBuilder reflexiveStart = new StringBuilder("se ");
		String verbString = new StringBuilder(newStem).append(el_ella_usted).toString();
		if (infinitiveForm.getReflexiveFlag()) {
			return reflexiveStart.append(verbString).toString();
		}
		// TODO Auto-generated method stub
		return verbString;
	}

	@Override
	public String conjugateNosotrosAs() {
		// TODO Auto-generated method stub
		StringBuilder reflexiveStart = new StringBuilder("nos ");
		String verbString = new StringBuilder(infinitiveForm.getVerbStem()).append(nosotros_as).toString();
		if (infinitiveForm.getReflexiveFlag()) {
			return reflexiveStart.append(verbString).toString();
		}
		// TODO Auto-generated method stub
		return verbString;
	}

	@Override
	public String conjugateVosotrosAs() {
		// TODO Auto-generated method stub
		StringBuilder reflexiveStart = new StringBuilder("os ");
		String verbString = new StringBuilder(infinitiveForm.getVerbStem()).append(vosotros_as).toString();
		if (infinitiveForm.getReflexiveFlag()) {
			return reflexiveStart.append(verbString).toString();
		}
		// TODO Auto-generated method stub
		return verbString;
	}

	@Override
	public String conjugateEllosEllasUstedes() throws VerbException {
		if (needsNewStem) {
			throw new VerbException();
		}
		// TODO Auto-generated method stub
		StringBuilder reflexiveStart = new StringBuilder("se ");
		String verbString = new StringBuilder(infinitiveForm.getVerbStem()).append(ellos_as_ustedes).toString();
		if (infinitiveForm.getReflexiveFlag()) {
			return reflexiveStart.append(verbString).toString();
		}
		// TODO Auto-generated method stub
		return verbString;
	}
	
	public String conjugateEllosEllasUstedes(String newStem) throws VerbException {
		if (!infinitiveForm.getIrregularFlag()) {
			throw new VerbException(newStem);
		}
		StringBuilder reflexiveStart = new StringBuilder("se ");
		String verbString = new StringBuilder(newStem).append(ellos_as_ustedes).toString();
		if (infinitiveForm.getReflexiveFlag()) {
			return reflexiveStart.append(verbString).toString();
		}
		// TODO Auto-generated method stub
		return verbString;
	}

	@Override
	public String conjugateVos() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		StringBuilder reflexiveStart = new StringBuilder("te ");
		String verbString = new StringBuilder(infinitiveForm.getVerbStem()).append(vos).toString();
		if (infinitiveForm.getReflexiveFlag()) {
			return reflexiveStart.append(verbString).toString();
		}
		// TODO Auto-generated method stub
		return verbString;
	}

}
