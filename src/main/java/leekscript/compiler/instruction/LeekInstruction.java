package leekscript.compiler.instruction;

import leekscript.compiler.JavaWriter;
import leekscript.compiler.bloc.MainLeekBlock;

public interface LeekInstruction {

	public String getCode();

	public void writeJavaCode(MainLeekBlock mainblock, JavaWriter writer);

	public int getEndBlock();

	public boolean putCounterBefore();
}
