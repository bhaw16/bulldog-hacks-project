
public class Presente extends VerbTense {
	
	//construct a regular ar verb in el presente
	public Presente(InfinitiveVerb infinitiveForm) throws VerbEndingException{
			super(infinitiveForm, "o", "as", "a", "amos", "áis", "an", "");
			if ((!(infinitiveForm.getVerbEnding().equalsIgnoreCase("ar")))) {
				throw new VerbEndingException(infinitiveForm);
			}
	}
	
	@Override
	protected String conjugateYo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String conjugateTu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String conjugateElEllaUsted() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String conjugateNosotrosAs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String conjugateVosotrosAs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String conjugateEllosEllasUstedes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String conjugateVos() {
		// TODO Auto-generated method stub
		return null;
	}

}
