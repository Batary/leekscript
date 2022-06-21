package leekscript.compiler.bloc;

import leekscript.compiler.AIFile;
import leekscript.compiler.JavaWriter;
import leekscript.compiler.Location;
import leekscript.compiler.Token;
import leekscript.compiler.WordCompiler;
import leekscript.compiler.expression.Expression;
import leekscript.compiler.expression.LeekBoolean;

public class DoWhileBlock extends AbstractLeekBlock {

	private Expression mCondition = null;
	private final Token token;

	public DoWhileBlock(AbstractLeekBlock parent, MainLeekBlock main, Token token) {
		super(parent, main);
		this.token = token;
	}

	public void setCondition(Expression condition) {
		mCondition = condition;
	}

	public Expression getCondition() {
		return mCondition;
	}

	@Override
	public String getCode() {
		return "do{\n" + super.getCode() + "}while(" + mCondition.getString() + ");";
	}

	@Override
	public void writeJavaCode(MainLeekBlock mainblock, JavaWriter writer) {
		writer.addLine("do {");
		writer.addCounter(1);
		super.writeJavaCode(mainblock, writer);
		writer.addCode("} while (ops(");
		// Prevent unreachable code error
		if (mCondition instanceof LeekBoolean) {
			writer.addCode("bool(");
			writer.getBoolean(mainblock, mCondition);
			writer.addCode(")");
		} else {
			writer.getBoolean(mainblock, mCondition);
		}
		writer.addCode(", " + mCondition.getOperations() + ")");
		writer.addLine(");", getLocation());
	}

	@Override
	public boolean isBreakable() {
		return true;
	}

	public void preAnalyze(WordCompiler compiler) {
		if (mCondition != null) {
			mCondition.preAnalyze(compiler);
		}
		super.preAnalyze(compiler);
	}

	public void analyze(WordCompiler compiler) {
		if (mCondition != null) {
			mCondition.analyze(compiler);
		}
		super.analyze(compiler);
	}

	@Override
	public Location getLocation() {
		return token.getLocation();
	}
}
