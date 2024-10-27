package leekscript.compiler.expression;

import leekscript.runner.values.BigIntegerValue;

import leekscript.common.Type;
import leekscript.compiler.JavaWriter;
import leekscript.compiler.Token;
import leekscript.compiler.bloc.MainLeekBlock;

public class LeekBigInteger extends LeekNumber {

	private final BigIntegerValue value;

	public LeekBigInteger(Token token, BigIntegerValue value) {
		super(token, Type.BIG_INT);
		this.value = value;
	}

	@Override
	public boolean isInfinity() {
		return false;
	}

	@Override
	public String toString() {
		return value.toString();
	}

	@Override
	public void writeJavaCode(MainLeekBlock mainblock, JavaWriter writer) {
		writer.addCode("new BigIntegerValue(\"" + value.toString() + "\")");
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof LeekBigInteger) {
			return value.equals(((LeekBigInteger) o).value);
		}
		return false;
	}
}
