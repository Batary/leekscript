package leekscript.compiler.expression;

public class Operators {
	public final static int CROCHET = 1;
	public final static int PARENTHESIS = 2;
	public final static int INCREMENT = 3;
	public final static int DECREMENT = 4;
	public final static int NOT = 5;
	public final static int MULTIPLIE = 6;
	public final static int DIVIDE = 7;
	public final static int MODULUS = 8;
	public final static int ADD = 9;
	public final static int MINUS = 10;
	public final static int LESS = 11;
	public final static int LESSEQUALS = 12;
	public final static int MORE = 13;
	public final static int MOREEQUALS = 14;
	public final static int EQUALS = 15;
	public final static int NOTEQUALS = 16;
	public final static int AND = 17;
	public final static int OR = 18;
	public final static int ASSIGN = 19;
	public final static int ADDASSIGN = 20;
	public final static int MINUSASSIGN = 21;
	public final static int MULTIPLIEASSIGN = 22;
	public final static int DIVIDEASSIGN = 23;
	public final static int MODULUSASSIGN = 24;
	public final static int UNARY_MINUS = 25;
	public final static int TERNAIRE = 26;
	public final static int DOUBLE_POINT = 27;
	public final static int POWER = 28;
	public final static int POWERASSIGN = 29;
	public final static int EQUALS_EQUALS = 30;
	public final static int NOT_EQUALS_EQUALS = 31;
	public final static int SHIFT_LEFT = 32;
	public final static int ROTATE_RIGHT = 33;
	public final static int SHIFT_RIGHT = 34;
	public final static int BITXOR = 35;
	public final static int BITAND = 36;
	public final static int BITOR = 37;
	public final static int SHIFT_LEFT_ASSIGN = 38;
	public final static int ROTATE_RIGHT_ASSIGN = 39;
	public final static int SHIFT_RIGHT_ASSIGN = 40;
	public final static int BITXOR_ASSIGN = 41;
	public final static int BITAND_ASSIGN = 42;
	public final static int BITOR_ASSIGN = 43;
	public final static int PRE_INCREMENT = 44;
	public final static int PRE_DECREMENT = 45;
	public final static int REFERENCE = 46;

	public final static int getOperator(String operator) {
		if(operator.equals("[")) return CROCHET;
		if(operator.equals("(")) return PARENTHESIS;
		if(operator.equals("++")) return INCREMENT;
		if(operator.equals("--")) return DECREMENT;
		if(operator.equals("!")) return NOT;
		if(operator.equals("*")) return MULTIPLIE;
		if(operator.equals("/")) return DIVIDE;
		if(operator.equals("%")) return MODULUS;
		if(operator.equals("+")) return ADD;
		if(operator.equals("-")) return MINUS;
		if(operator.equals("<")) return LESS;
		if(operator.equals("<=")) return LESSEQUALS;
		if(operator.equals(">")) return MORE;
		if(operator.equals(">=")) return MOREEQUALS;
		if(operator.equals("==")) return EQUALS;
		if(operator.equals("!=")) return NOTEQUALS;
		if(operator.equals("&&")) return AND;
		if(operator.equals("||")) return OR;
		if(operator.equals("=")) return ASSIGN;
		if(operator.equals("+=")) return ADDASSIGN;
		if(operator.equals("-=")) return MINUSASSIGN;
		if(operator.equals("*=")) return MULTIPLIEASSIGN;
		if(operator.equals("/=")) return DIVIDEASSIGN;
		if(operator.equals("%=")) return MODULUSASSIGN;
		if(operator.equals("?")) return TERNAIRE;
		if(operator.equals(":")) return DOUBLE_POINT;
		if(operator.equals("**")) return POWER;
		if(operator.equals("^=")) return POWERASSIGN;
		if(operator.equals("===")) return EQUALS_EQUALS;
		if(operator.equals("!==")) return NOT_EQUALS_EQUALS;
		if(operator.equals("^")) return BITXOR;
		if(operator.equals("&")) return BITAND;
		if(operator.equals("|")) return BITOR;
		if(operator.equals("<<")) return SHIFT_LEFT;
		if(operator.equals(">>")) return SHIFT_RIGHT;
		if(operator.equals(">>>")) return ROTATE_RIGHT;
		if(operator.equals("**=")) return POWERASSIGN;
		if(operator.equals("^=")) return BITXOR_ASSIGN;
		if(operator.equals("&=")) return BITAND_ASSIGN;
		if(operator.equals("|=")) return BITOR_ASSIGN;
		if(operator.equals("<<=")) return SHIFT_LEFT_ASSIGN;
		if(operator.equals(">>=")) return SHIFT_RIGHT_ASSIGN;
		if(operator.equals(">>>=")) return ROTATE_RIGHT_ASSIGN;
		if(operator.equals("@")) return REFERENCE;
		return -1;
	}

	public static int getPriority(int operator) {
		switch(operator) {
		case CROCHET:
		case PARENTHESIS:
			return 15;
		case INCREMENT:
		case DECREMENT:
		case REFERENCE:
		case UNARY_MINUS:
			return 14;
		case NOT:
			return 13;
		case POWER:
			return 12;
		case MULTIPLIE:
		case DIVIDE:
		case MODULUS:
			return 11;
		case ADD:
		case MINUS:
			return 10;
		case SHIFT_LEFT:
		case SHIFT_RIGHT:
		case ROTATE_RIGHT:
			return 9;
		case LESS:
		case LESSEQUALS:
		case MORE:
		case MOREEQUALS:
			return 8;
		case EQUALS:
		case NOTEQUALS:
		case EQUALS_EQUALS:
		case NOT_EQUALS_EQUALS:
			return 7;
		case BITAND:
			return 6;
		case BITXOR:
			return 5;
		case BITOR:
			return 4;
		case AND:
			return 3;
		case OR:
			return 2;
		case TERNAIRE:
		case DOUBLE_POINT:
			return 1;
		case ASSIGN:
		case ADDASSIGN:
		case MINUSASSIGN:
		case MULTIPLIEASSIGN:
		case DIVIDEASSIGN:
		case MODULUSASSIGN:
		case POWERASSIGN:
		case SHIFT_LEFT_ASSIGN:
		case SHIFT_RIGHT_ASSIGN:
		case ROTATE_RIGHT_ASSIGN:
		case BITAND_ASSIGN:
		case BITOR_ASSIGN:
		case BITXOR_ASSIGN:
			return 0;
		default:
			return -1;
		}
	}

	public static boolean isUnaryPrefix(int operator) {
		switch(operator) {
		case NOT:
		case UNARY_MINUS:
		case PRE_INCREMENT:
		case PRE_DECREMENT:
		case REFERENCE:
			return true;
		}
		return false;
	}

	public static boolean isUnary(int operator) {
		return isUnaryPrefix(operator) || isUnarySuffix(operator);
	}

	public static boolean isUnarySuffix(int operator) {
		switch(operator) {
		case INCREMENT:
		case DECREMENT:
			return true;
		}
		return false;
	}

	public static String getString(int operator) {
		switch(operator) {
		case ADD:
			return "+";
		case MINUS:
			return "-";
		case MULTIPLIE:
			return "*";
		case DIVIDE:
			return "/";
		case MODULUS:
			return "%";
		case ASSIGN:
			return "=";
		case AND:
			return "&&";
		case OR:
			return "||";
		case EQUALS:
			return "==";
		case NOTEQUALS:
			return "!=";
		case NOT:
			return "!";
		case INCREMENT:
			return "++";
		case DECREMENT:
			return "--";
		case POWER:
			return "^";
		case POWERASSIGN:
			return "^=";
		}
		return "null";
	}
}
