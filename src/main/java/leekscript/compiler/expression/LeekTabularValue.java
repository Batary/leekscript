package leekscript.compiler.expression;

import leekscript.compiler.JavaWriter;
import leekscript.compiler.bloc.MainLeekBlock;

public class LeekTabularValue extends AbstractExpression {

	private AbstractExpression mTabular;
	private AbstractExpression mCase;
	private boolean mLeftValue = false;

	public void setTabular(AbstractExpression tabular) {
		mTabular = tabular;
	}

	public void setCase(AbstractExpression caseexp) {
		mCase = caseexp;
	}

	public AbstractExpression getTabular() {
		return mTabular;
	}

	public AbstractExpression getCase() {
		return mCase;
	}

	@Override
	public int getType() {
		return TABULAR_VALUE;
	}

	@Override
	public String getString() {
		return (mTabular == null ? "null" : mTabular.getString()) + "[" + (mCase == null ? "null" : mCase.getString()) + "]";
	}

	@Override
	public boolean validExpression(MainLeekBlock mainblock) throws LeekExpressionException {
		//On doit vérifier qu'on a affaire : soit à une expression tabulaire, soit à une variable, soit à une globale
		if(!(mTabular instanceof LeekVariable) && !(mTabular instanceof LeekGlobal) && !(mTabular instanceof LeekTabularValue)){
			//throw new LeekExpressionException(this, "Ce n'est pas un tableau valide");
			mLeftValue = false;
		}
		//Sinon on valide simplement les deux expressions
		mTabular.validExpression(mainblock);
		mCase.validExpression(mainblock);
		return true;
	}

	@Override
	public void writeJavaCode(MainLeekBlock mainblock, JavaWriter writer) {
		if(mLeftValue){
			mTabular.writeJavaCode(mainblock, writer);
			writer.addCode(".getValue().getOrCreate(mUAI, ");
			mCase.writeJavaCode(mainblock, writer);
			writer.addCode(")");
		}
		else{
			mTabular.writeJavaCode(mainblock, writer);
			writer.addCode(".getValue().get(mUAI, ");
			mCase.writeJavaCode(mainblock, writer);
			writer.addCode(")");
		}
	}

	public void setLeftValue(boolean b) {
		mLeftValue = b;
	}

}
