
public class PresenteAr extends VerbTense {
	
	//construct a regular ar verb in el presente perfecto
	public PresenteAr(InfinitiveVerb infinitiveForm) throws VerbException {
			super(infinitiveForm, "o", "as", "a", "amos", "áis", "an", "ás");
			if ((!(infinitiveForm.getVerbEnding().equalsIgnoreCase("ar")))) {
				throw new VerbException(infinitiveForm);
			}
	}
	
	//construct an irregular verb in el presente perfecto (indicate endings)
	public PresenteAr(InfinitiveVerb infinitiveForm, String yo, String tu,
	String el_ella_usted, String nosotros_as, String vosotros_as,
	String ellos_as_ustedes, String vos) throws VerbException {
		super(infinitiveForm, yo, tu, el_ella_usted, nosotros_as,
		vosotros_as, ellos_as_ustedes, vos);
		if ((!(infinitiveForm.getVerbEnding().equalsIgnoreCase("ar")))) {
			throw new VerbException(infinitiveForm);
		}
	}
	
	@Override
	public String conjugateYo() {
		StringBuilder reflexiveStart = new StringBuilder("me ");
		String verbString = new StringBuilder(infinitiveForm.getVerbStem()).append(yo).toString();
		if (infinitiveForm.getReflexiveFlag()) {
			return reflexiveStart.append(verbString).toString();
		}
		// TODO Auto-generated method stub
		return verbString;
	}
	
	public String conjugateYo(String newStem) {
		StringBuilder reflexiveStart = new StringBuilder("me ");
		String verbString = new StringBuilder(newStem).append(yo).toString();
		if (infinitiveForm.getReflexiveFlag()) {
			return reflexiveStart.append(verbString).toString();
		}
		// TODO Auto-generated method stub
		return verbString;
	}

	@Override
	public String conjugateTu() {
		// TODO Auto-generated method stub
		StringBuilder reflexiveStart = new StringBuilder("te ");
		String verbString = new StringBuilder(infinitiveForm.getVerbStem()).append(tu).toString();
		if (infinitiveForm.getReflexiveFlag()) {
			return reflexiveStart.append(verbString).toString();
		}
		// TODO Auto-generated method stub
		return verbString;
	}
	
	public String conjugateTu(String newStem) {
		StringBuilder reflexiveStart = new StringBuilder("te ");
		String verbString = new StringBuilder(newStem).append(tu).toString();
		if (infinitiveForm.getReflexiveFlag()) {
			return reflexiveStart.append(verbString).toString();
		}
		// TODO Auto-generated method stub
		return verbString;
	}

	@Override
	public String conjugateElEllaUsted() {
		// TODO Auto-generated method stub
		StringBuilder reflexiveStart = new StringBuilder("se ");
		String verbString = new StringBuilder(infinitiveForm.getVerbStem()).append(el_ella_usted).toString();
		if (infinitiveForm.getReflexiveFlag()) {
			return reflexiveStart.append(verbString).toString();
		}
		// TODO Auto-generated method stub
		return verbString;
	}
	
	public String conjugateElEllaUsted(String newStem) {
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
	public String conjugateEllosEllasUstedes() {
		// TODO Auto-generated method stub
		StringBuilder reflexiveStart = new StringBuilder("se ");
		String verbString = new StringBuilder(infinitiveForm.getVerbStem()).append(ellos_as_ustedes).toString();
		if (infinitiveForm.getReflexiveFlag()) {
			return reflexiveStart.append(verbString).toString();
		}
		// TODO Auto-generated method stub
		return verbString;
	}
	
	public String conjugateEllosEllasUstedes(String newStem) {
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
