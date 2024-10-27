package test;

import java.util.ArrayList;
import java.util.List;

import leekscript.common.Error;
import leekscript.compiler.LexicalParser;
import leekscript.runner.LeekConstants;

public class TestBigInt extends TestCommon {

	public void run() throws Exception {

		header("Big Numbers");

		section("Basic numbers");
//		code_v4_("return 0L").equals("0");
//		code_v4_("return -1L").equals("-1");
//		code_v4_("return -(-1L)").equals("1");
		
		// does not work (BigInteger does not parse this notation)
//		code_v4_("return -1e100L").equals("-10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
		// need to use long to go from double to BigInteger, so we lose information
//		code_v4_("return -1e100 as BigInteger").equals("-10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
//		code_v4_("return 1e100 as big_integer").equals("10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");

//		code_v4_("return 1e+3 as big_integer").equals("1000");
//		code_v4_("return 1e+3+2 as BigInteger").equals("1002");
//		code_v4_("return 1e+3-2 as BigInteger").equals("998");
//		code_v4_("return 1.5e-3 as big_integer").equals("0");
//		code_v4_("return 1.99 as big_integer").equals("1");
//		code_v4_("return 1L as big_integer").equals("1");
//		code_v4_("return 1L as real").equals("1.0");
//		code_v4_("return 1L as integer").equals("1");

		section("Class");
//		code_v4_("return BigInteger();").equals("0");
//		code_v4_("return new BigInteger();").equals("0");
//		code_v4_("return BigInteger() + 1;").equals("1");
//		code_v4_("return BigInteger() - 1;").equals("-1");
//		code_v4_("return (BigInteger() + 1) << 100;").equals("1267650600228229401496703205376");

		section("Lexical errors");
//		code_v4_("123451234548975415644561534894564896785416r").error(Error.INVALID_NUMBER);
//		code_v4_("0b011001711111111111111111111111111111111111111111111111111111111111111111111111111111111111L").error(Error.INVALID_NUMBER);
//		code_v4_("0x+123451234548975415644561534894564896785416").error(Error.INVALID_NUMBER);
//		code_v4_("0b#123451234548975415644561534894564896785416").error(Error.INVALID_CHAR);
//		code_v4_("0b'123451234548975415644561534894564896785416").error(Error.STRING_NOT_CLOSED);
//		code_v4_("0b\"123451234548975415644561534894564896785416").error(Error.STRING_NOT_CLOSED);
//		code_v4_("0xeazblqzd123451234548975415644561534894564896785416").error(Error.INVALID_NUMBER);
//		code_v4_("0xffxff123451234548975415644561534894564896785416").error(Error.INVALID_NUMBER);
//		code_v4_("0b101b01011111111111111111111111111111111111111111111111111111111111111111111111111111111111").error(Error.INVALID_NUMBER);
//		code_v4_("0b101x01011111111111111111111111111111111111111111111111111111111111111111111111111111111111").error(Error.INVALID_NUMBER);
//		code_v4_("0b101.01011111111111111111111111111111111111111111111111111111111111111111111111111111111111").error(Error.INVALID_NUMBER);
//		code_v4_("0.1L").error(Error.INVALID_NUMBER);
		
		section("Basic operations");
//		code_v4_("return 2L + 5;").equals("7");
//		code_v4_("return 2 + 1267650600228229401496703205376L;").equals("1267650600228229401496703205378");
//		code_v4_("return 1267650600228229401496703205376L;").equals("1267650600228229401496703205376");
//		code_v4_("return 1L << 100;").equals("1267650600228229401496703205376");
//		code_v4_("big_integer x = 12; return x;").equals("12");
//		code_v4_("big_integer x = 1; return x << 150 == 1427247692705959881058285969449495136382746624L;").equals("true");
//		code_v4_("big_integer x = 1427247692705959881058285969449495136382746624; return x + 1;").equals("1427247692705959881058285969449495136382746625");
//		code_v4_("return BigInteger();").equals("0");
//		code_v4_("return new BigInteger();").equals("0");
//		code_v4_("return (BigInteger() + 1) << 100;").equals("1267650600228229401496703205376");
//		code_v4_("return 5L == 5;").equals("true");
//		code_v4_("return 5L == 5.0;").equals("true");
//		code_v4_("return 5L == 5L;").equals("true");
//
//		code_v4_("return 1267650600228229401496703205376L == 1267650600228229401496703205376;").equals("true");
//		code_v4_("return 1267650600228229401496703205376L == 1267650600228229401496703205377;").equals("false");
//		code_v4_("return 1267650600228229401496703205376L == (BigInteger() + 1) << 104 >>> 2 >> 2;").equals("true");
//		
//		code_v4_("return 0x8fa6cd83e41a6f4ecL").equals("165618988158544180460");
//		code_v4_("-0xa71ed8fa6cd83e41a6f4eaf4ed9dff8cc3ab1e9a4ec6baf1ea77db4fa1c").equals("-72088955549248787618860543269425825306377186794534918826231778059287068");
//		code_v4_("0xfe54c4ceabf93c4eaeafcde94eba4c79741a7cc8ef43daec6a71ed8fa6cd8b3e41a6f4ea7f4ed9dff8cc3ab61e9a4ec6baf1ea77deb4fa1c").equals("722100440055342029825617696009879717719483550913608718409456486549003139646247155371523487552495527165084677501327990299146441654073884");
//		code_v4_("return 0b010101010101110101010101011111111110111110111110000000011101101010101001").equals("1574698668551521295017");
//		code_v4_("return -0b101010101011101010101010111111111101111101111100000000111011010101010010011111100000011111111111110000").equals("-3381639641241763826573319995376");

		
//		code_v4_("return 5L + 5;").equals("10");
//		code_v4_("return 10 - 3L;").equals("7");
//		code_v4_("return -2L + 3;").equals("1");
//		code_v4_("return 5 * 5L;").equals("25");
//		code_v4_("return 15L / 3;").equals("5");
//		code_v4_("return 15L \\ 3;").equals("5");
//		code_v4_("return 15 / 3L;").equals("5");
//		code_v4_("return 15 \\ 3L;").equals("5");
//		code_v4_("return 15L / 2;").equals("7");
//		code_v4_("return 15 / 2L;").equals("7");
//		code_v4_("return 12L ** 2;").equals("144");
//		code_v4_("return 2 ** 5L;").equals("32");
//		code_v4_("return 2L < 5;").equals("true");
//		code_v4_("return 12 < 5L;").equals("false");
//		code_v4_("return 5L == 12;").equals("false");
//		code_v4_("return 12 == 12L;").equals("true");
//		// TODO absolute value operator
//		// DISABLED_code_v4_("return |-12L|;").equals("12");
//		code_v4_("return -12L * 2;").equals("-24");
//		code_v4_("return (-12) * 2L;").equals("-24");
//		code_v4_("return -12L ** 2;").equals("144");
//		code_v4_("return (-12) ** 2L;").equals("144");
//		code_v4_("return -12L + 2;").equals("-10");
//		code_v4_("var a = [2L, 'a'] return [-a[0], ~a[0]] == [-2, ~2];").equals("true");
		// TODO operator +x
		// code_v4_("var a = [2L, 'a'] return [-a[0], +a[0], ~a[0]] == [-2, 2, ~2];").equals("true");
//

//		code_v4_("var x = 5L + 5; return x instanceof BigInteger").equals("true");
//		code_v4_("var x = 10 - 3L; return x instanceof BigInteger").equals("true");
//		code_v4_("var x = -2L + 3; return x instanceof BigInteger").equals("true");
//		code_v4_("var x = 5 * 5L; return x instanceof BigInteger").equals("true");
//		code_v4_("var x = 15L / 3; return x instanceof BigInteger").equals("true");
//		code_v4_("var x = 15L \\ 3; return x instanceof BigInteger").equals("true");
//		code_v4_("var x = 15 / 3L; return x instanceof BigInteger").equals("true");
//		code_v4_("var x = 15 \\ 3L; return x instanceof BigInteger").equals("true");
//		code_v4_("var x = 15L / 2; return x instanceof BigInteger").equals("true");
//		code_v4_("var x = 15 / 2L; return x instanceof BigInteger").equals("true");
//		code_v4_("var x = 12L ** 2; return x instanceof BigInteger").equals("true");
//		code_v4_("var x = 12L ** 2; return x instanceof Number").equals("true");
//		code_v4_("var x = 12L ** 2; return x instanceof Integer").equals("false");
//		code_v4_("var x = 2 ** 5L; return x instanceof Integer").equals("true");
////		// TODO absolute value operator
////		// DISABLED_code_v4_("var x = |-12L|; return x instanceof BigInteger").equals("true");
//		code_v4_("var x = -12L * 2; return x instanceof BigInteger").equals("true");
//		code_v4_("var x = (-12) * 2L; return x instanceof BigInteger").equals("true");
//		code_v4_("var x = -12L ** 2; return x instanceof BigInteger").equals("true");
//		code_v4_("var x = (-12) ** 2L; return x instanceof Integer").equals("true");
//		code_v4_("var x = -12L + 2; return x instanceof BigInteger").equals("true");
//		code_v4_("var a = [2L, 'a'] return -a[0] instanceof BigInteger && ~a[0] instanceof BigInteger").equals("true");
		
		section("Hexadecimal representation");
//		code_v4_("return 0x0L;").equals("0");
//		code_v4_("return 0x00000000L").equals("0");
//		code_v4_("return 0x1L").equals("1");
//		code_v4_("return 0x00000001L").equals("1");
//		code_v4_("return 0xfL").equals("15");
//		code_v4_("return 0x0000000fL").equals("15");
//		code_v4_("return -0xfL").equals("-15");
//		code_v4_("return 0xffL").equals("255");
//		code_v4_("return 0x10L").equals("16");
//		code_v4_("return -0xffffL").equals("-65535");
//		code_v4_("return 0xffffffffL").equals("4294967295");
//		code_v4_("return 0x7FFFFFFFFFFFFFFFL").equals("9223372036854775807");
//		
		section("Binary representation");
//		code_v4_("return 0b0L").equals("0");
//		code_v4_("return 0b00001L").equals("1");
//		code_v4_("return 0b1001010110L").equals("598");
//		code_v4_("return -0b0101101001111L").equals("-2895");
//		code_v4_("return 0b0111111111111111111111111111111111111111111111111111111111111111L").equals("9223372036854775807");
//		
		section("Underscore delimiters");
//		code_v4_("return 1_000_123L").equals("1000123");
//		code_v4_("return 1_000__123L").error(Error.MULTIPLE_NUMERIC_SEPARATORS);
//		code_v4_("return 0x_ffL").equals("255");
		code_v4_("return 0_x_ff").error(Error.INVALID_NUMBER);
		code_v4_("return 0_x_ffL").error(Error.INVALID_NUMBER);
//		code_v4_("return 0xff_ff_ff_ffL").equals("4294967295");
//		code_v4_("return 0b1001_0101_10L").equals("598");
//		code_v4_("return 5.001_002_003L").error(Error.INVALID_NUMBER);
//		code_v4_("return 5.001_002_003L").error(Error.INVALID_NUMBER);
//		code_v4_("return _1_000_000L").error(Error.UNKNOWN_VARIABLE_OR_FUNCTION);
//
//		section("null must not be considered as 0");
//		code_v4_("return null == 0;").equals("false");
//		code_v4_("return null < 0;").equals("false");
//		// code_v4_("null + 5").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//		// code_v4_("5 + null").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//		// code_v4_("5 / null").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//		// code_v4_("null / 12").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//		// code_v4_("null * 5").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//		// code_v4_("5 * null").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//
//		section("Numbers with variables");
//		code_v4_("var a = 2 return a++;").equals("2");
//		code_v4_("var a = 2; return ++a;").equals("3");
//		code_v4_("var a = 2 return a--;").equals("2");
//		code_v4_("var a = 2; return --a;").equals("1");
//		code_v4_("var a = 2 return a += 5;").equals("7");
//		code_v4_("var a = 2 return a -= 5;").equals("-3");
//		code_v4_("var a = 2 return a *= 5;").equals("10");
//		code_v4_("var a = 100 return a /= 5;").equals("20");
//		code_strict_v1("var a = 100 return a /= 5;").equals("20");
//		code_strict_v1("any a = 100 return a /= 5;").equals("20");
//		code_v4_("var a = 100 return a /= 5;").equals("20.0");
//		code_strict_v2_("var a = 100 return a /= 5;").equals("20");
//		code_strict_v2_("any a = 100 return a /= 5;").equals("20.0");
//		code_v4_("var a = 56 return a %= 17;").equals("5");
//		code_v4_("var a = 15 return a **= 2;").equals("225");
//		code_v4_("var a = 1.5 return a * 0.5;").equals("0,75");
//		code_v4_("var a = 1.5 return a * 0.5;").equals("0.75");
//		// DISABLED_code_v4_("var i = 1m return i = i + 2m;").equals("3");
//		code_v4_("var a = 10; a += 10 - 2 * 3; return a;").equals("14");
//
//		section("multiple operations");
//		code_v4_("return (33 - 2) / 2;").equals("15,5");
//		code_v4_("return (33 - 2) / 2;").equals("15.5");
//		code_v4_("return 12 < (45 / 4);").equals("false");
//		code_v4_("return 12 == (24 / 2);").equals("true");
//		// code_v4_("2.5 + 4.7").almost(7.2);
//		// DISABLED_code_v4_("return 2.5 × 4.7;").equals("11.75");
//		code_v4_("return 5 * 2 + 3 * 4;").equals("22");
//
//		section("String conversions");
//		// DISABLED_code_v4_("65.char()").equals("'A'");
//		// DISABLED_code_v4_("char(65)").equals("'A'");
//		// DISABLED_code_v4_("126.char()").equals("'~'");
//		// DISABLED_code_v4_("char(128040)").equals("'🐨'");
//		// DISABLED_code_v4_("126.784.char()").equals("'~'");
//		// DISABLED_code_v4_("char([126.784, 'hello'][0])").equals("'~'");
//		// DISABLED_code_v4_("let c = 65 (c.char())").equals("'A'");
//		// DISABLED_code_v4_("let c = 65 (c.char() + '!')").equals("'A!'");
//		// DISABLED_code_v4_("0x2764.char()").equals("'❤'");
//
//		section("Multiple precision numbers");
//		// DISABLED_code_v4_("12344532132423").equals("12344532132423");
//		// DISABLED_code_v4_("var a = 10m a").equals("10");
//		// DISABLED_code_v4_("0m").equals("0");
//		// DISABLED_code_v4_("0xf45eab5c9d13aab44376beff").equals("75628790656539575381594128127");
//		// TODO floating-point multiple precision numbers
//		// TODO code_v4_("123456.78910m").equals("123456.7891");
//		// TODO code_v4_("123456789123456789123456789.5").equals("");
//		// TODO code_v4_("1234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567883459720303390827584524332795121111123456788999999999999999999999999999999999.5").equals("");
//		// DISABLED_code_v4_("let a = 1209876543789765432456765432087654321 a").equals("1209876543789765432456765432087654321");
//		// DISABLED_code_v4_("let a = { 1209876543789765432456765432087654321 } a").equals("1209876543789765432456765432087654321");
//		// DISABLED_code_v4_("var a = 5m a = 12m").equals("12");
//		// DISABLED_code_v4_("var a = 5m a = 12m a").equals("12");
//		// DISABLED_code_v4_("let f = -> 12m f().string()").equals("'12'");
//
//		section("Integer division by zero");
//		// code_v4_("1 \\ 0").exception(ls::vm::Exception::DIVISION_BY_ZERO);
//		// code_v4_("1 % 0").exception(ls::vm::Exception::DIVISION_BY_ZERO);
//
//		/*
//		 * Number standard library
//		 */
//		// header("Number standard library");
//		section("Constructor");
//		code_v4_("return Number").equals("<class Number>");
//		// DISABLED_code_v4_("Number()").equals("0");
//		// DISABLED_code_v4_("Number(12)").equals("12");
//		// DISABLED_code_v4_("Number(12.5)").equals("12.5");
//		// DISABLED_code_v4_("Number(12l)").equals("12");
//		// DISABLED_code_v4_("Number(12m)").equals("12");
//		// DISABLED_code_v4_("[Number(), 'str']").equals("[0, 'str']");
//		// DISABLED_code_v4_("new Number").equals("0");
//		// DISABLED_code_v4_("new Number()").equals("0");
//		// DISABLED_code_v4_("new Number(12)").equals("12");
//		// DISABLED_code_v4_("['', new Number()]").equals("['', 0]");
//		// DISABLED_code_v4_("['', new Number]").equals("['', 0]");
//		// DISABLED_code_v4_("['', Number()]").equals("['', 0]");
//		// DISABLED_code_v4_("['', new Number(12)]").equals("['', 12]");
//		// DISABLED_code_v4_("['', Number(12)]").equals("['', 12]");
//
//		section("Constants");
//		code_v4_("return PI").equals("3,142");
//		code_v4_("return PI").almost(3.141592653589793116);
//		code_v4_("return ['', PI]").equals("[\"\", 3,142]");
//		code_v4_("return ['', PI]").equals("[\"\", 3.141592653589793]");
//		code_v4_("return 2 * PI").equals("6,283");
//		code_v4_("return 2 * PI").almost(6.283185307179586232);
//		code_v4_("return E").equals("2,718");
//		code_v4_("return E").almost(2.718281828459045091);
//		// code_v4_("phi").almost(1.618033988749894903);
//		// code_v4_("epsilon").almost(0.000000000000000222);
//		// code_v4_("let pi = 3 pi").equals("3");
//		// code_v4_("{ let pi = 3 } pi").almost(3.141592653589793116);
//		code_v4_("return Infinity").equals("∞");
//		code_v4_("return NaN").equals("NaN");
//		code_v4_("return NaN === NaN").equals("false");
//		code_v4_("return 0 / 0 === NaN").equals("false");
//
//		section("Constants in class");
//		code_v4_("return Real.MIN_VALUE").equals("4.9E-324");
//		code_v4_("return Real.MIN_VALUE.class").equals("<class Real>");
//		code_v4_("return Real.MAX_VALUE").equals("1.7976931348623157E308");
//		code_v4_("return Real.MAX_VALUE.class").equals("<class Real>");
//		code_v4_("return Real.MAX_VALUE + Real.MIN_VALUE").equals("1.7976931348623157E308");
//		code_v4_("return Integer.MIN_VALUE").equals("-9223372036854775808");
//		code_v4_("return Integer.MIN_VALUE.class").equals("<class Integer>");
//		code_v4_("return Integer.MAX_VALUE").equals("9223372036854775807");
//		code_v4_("return Integer.MIN_VALUE + Integer.MAX_VALUE").equals("-1");
//		code_v4_("return Integer.MAX_VALUE.class").equals("<class Integer>");
//		code_v4_("Integer.MIN_VALUE = 0").error(Error.CANNOT_ASSIGN_FINAL_FIELD);
//		code_v4_("Integer.MIN_VALUE += 10").error(Error.CANNOT_ASSIGN_FINAL_FIELD);
//		code_v4_("Integer.MAX_VALUE = 0").error(Error.CANNOT_ASSIGN_FINAL_FIELD);
//		code_v4_("Integer.MAX_VALUE += 10").error(Error.CANNOT_ASSIGN_FINAL_FIELD);
//		code_v4_("Real.MIN_VALUE = 0").error(Error.CANNOT_ASSIGN_FINAL_FIELD);
//		code_v4_("Real.MIN_VALUE += 0").error(Error.CANNOT_ASSIGN_FINAL_FIELD);
//		code_v4_("Real.MAX_VALUE = 0").error(Error.CANNOT_ASSIGN_FINAL_FIELD);
//		code_v4_("Real.MAX_VALUE += 0").error(Error.CANNOT_ASSIGN_FINAL_FIELD);
//
//		/*
//		 * Operators
//		 */
//		section("Number.operator unary -");
//		code_v4_("var a = [12, ''] var b = a[0]; return -b;").equals("-12");
//		code_v4_("return -(12 ** 2);").equals("-144");
//		// DISABLED_code_v4_("return -(12m ** 2);").equals("-144");
//		// DISABLED_code_v4_("-100m").equals("-100");
//
//		section("Number.operator unary !");
//		code_v4_("var a = [12, ''] var b = a[0]; return !b;").equals("false");
//
//		section("Number.operator unary ~");
//		code_v4_("var a = [12, ''] var b = a[0]; return ~b;").equals("-13");
//		code_v4_("var a = 12 return ['', ~a];").equals("[\"\", -13]");
//
//		section("Number.operator ++x");
//		code_v4_("var a = 20; return ++a;").equals("21");
//		code_v4_("var a = 30; ++a return a;").equals("31");
//		// DISABLED_code_v4_("var a = 20m; return ++a;").equals("21");
//		// DISABLED_code_v4_("var a = 20m; ++a return a;").equals("21");
//		// DISABLED_code_v4_("var a = 20m; let b = ++a return b;").equals("21");
//		// code_v4_("++5").error(ls::Error::Type::VALUE_MUST_BE_A_LVALUE, {"5"});
//		code_v4_("var a = 5 return ['', ++a];").equals("[\"\", 6]");
//
//		section("Number.operator --x");
//		code_v4_("var a = 20; return --a;").equals("19");
//		code_v4_("var a = 30; --a return a;").equals("29");
//		// code_v4_("--5").error(ls::Error::Type::VALUE_MUST_BE_A_LVALUE, {"5"});
//		code_v4_("var a = 5 return ['', --a];").equals("[\"\", 4]");
//
//		section("Number.operator x++");
//		code_v4_("var a = 20; return a++;").equals("20");
//		code_v4_("var a = 20; a++ return a;").equals("21");
//		code_v4_("var a = 20; var b = a++ return b;").equals("20");
//		// DISABLED_code_v4_("var a = 20m; a++").equals("20");
//		// DISABLED_code_v4_("var a = 20m; a++ a").equals("21");
//		// DISABLED_code_v4_("var a = 20m; var b = a++ b").equals("20");
//		// code_v4_("5++").error(ls::Error::Type::VALUE_MUST_BE_A_LVALUE, {"5"});
//
//		section("Number.operator x--");
//		code_v4_("var a = 20; return a--;").equals("20");
//		code_v4_("var a = 20; a-- return a;").equals("19");
//		code_v4_("var a = 20; var b = a-- return b;").equals("20");
//		// DISABLED_code_v4_("var a = 20m; a--").equals("20");
//		// DISABLED_code_v4_("var a = 20m; a-- a").equals("19");
//		// DISABLED_code_v4_("var a = 20m; var b = a-- b").equals("20");
//		// code_v4_("5--").error(ls::Error::Type::VALUE_MUST_BE_A_LVALUE, {"5"});
//
//		section("Number.operator in");
//		// TODO idea : a in b returns true if a is a divisor of b
//		// code_v4_("2 in 12").error(ls::Error::Type::VALUE_MUST_BE_A_CONTAINER, {"12"});
//
//		section("Number.operator =");
//		// DISABLED_code_v4_("var a = 1m, b = 4m; a = b").equals("4");
//
//		section("Number.operator ==");
//		code_v4_("return 12 == 12;").equals("true");
//		code_v4_("return 13 == 12;").equals("false");
//		// DISABLED_code_v4_("12m == 12m").equals("true");
//		// DISABLED_code_v4_("13m == 12m").equals("false");
//		code_v4_("return 12 ** 5 == 12 ** 5;").equals("true");
//		code_v4_("return 12 ** 5 == (3 * 4) ** 5;").equals("true");
//		code_v4_("return 12 ** 5 == 248832;").equals("true");
//		code_v4_("return 248832 == 12 ** 5;").equals("true");
//		// DISABLED_code_v4_("12m ** 5m == 12m ** 5m").equals("true");
//		// DISABLED_code_v4_("12m ** 5m == (3m * 4m) ** 5m").equals("true");
//		// DISABLED_code_v4_("12m ** 5m == 248832").equals("true");
//		// DISABLED_code_v4_("248832 == 12m ** 5m").equals("true");
//
//		section("Number.operator +");
//		code_v4_("return 1 + 2;").equals("3");
//		code_v4_("return 1 + (2 + 3);").equals("6");
//		code_v4_("return (1 + 2) + 3;").equals("6");
//		code_v4_("return (1 + 2) + (3 + 4);").equals("10");
//		// DISABLED_code_v4_("1m + 2m").equals("3");
//		// DISABLED_code_v4_("1m + (2m + 3m)").equals("6");
//		// DISABLED_code_v4_("(1m + 2m) + 3m").equals("6");
//		// DISABLED_code_v4_("(1m + 2m) + (3m + 4m)").equals("10");
//		code_v4_("return 15 + false;").equals("15");
//		code_v4_("return 15 + true;").equals("16");
//		code_v4_("var a = 15 return a + true;").equals("16");
//		// DISABLED_code_v4_("10000m + 15").equals("10015");
//		// DISABLED_code_v4_("let a = ['a', 12321111111111111111111111111111111321321321999999] a[1] + 123456789").equals("12321111111111111111111111111111111321321445456788");
//		code_v4_("return 10000 + (-15);").equals("9985");
//		// DISABLED_code_v4_("10000m + (-15)").equals("9985");
//		code_v4_("return null + 2;").equals("2");
//		code_v4_("return 2 + null;").equals("2");
//		code_v4_("return null + null;").equals("0");
//
//		section("Number.operator +=");
//		code_v4_("var a = 15 a += true return a;").equals("16");
//		// code_v4_("var a = 15$ a += []").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//		// code_v4_("var a = 15$ a += [] a").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//		code_v4_("var a = 10 return a += 4;").equals("14");
//		code_v4_("var a = 10 a += 4 return a;").equals("14");
//		code_v4_("var a = 15 return ['', a += 7];").equals("[\"\", 22]");
//		code_v4_("var a = 10 a += 5 return a;").equals("15");
//		code_v4_("var a = 10 a += 78 return a;").equals("88");
//		code_v4_("var a = 10 a += (-6) return a;").equals("4");
//		// DISABLED_code_v4_("var a = 10m return a += 4m;").equals("14");
//		// DISABLED_code_v4_("var a = 10m a += 4m return a;").equals("14");
//		// DISABLED_code_v4_("var a = 15 return ['', a += 7];").equals("['', 22]");
//		// DISABLED_code_v4_("var a = 10m a += 5 return a;").equals("15");
//		// DISABLED_code_v4_("var a = 10m a += 78m return a;").equals("88");
//		// DISABLED_code_v4_("var a = 10m a += (-6) return a;").equals("4");
//
//		section("Number.operator -");
//		code_v4_("return -12").equals("-12");
//		code_v4_("return -0").equals("0");
//		code_v4_("return -null").equals("0");
//		code_v4_("return 1 - 2;").equals("-1");
//		code_v4_("return 1 - (2 - 3);").equals("2");
//		code_v4_("return (1 - 2) - 3;").equals("-4");
//		code_v4_("return (1 - 2) - (3 - 4);").equals("0");
//		code_v4_("return (10 + 10) - 1;").equals("19");
//		// DISABLED_code_v4_("return 1m - 2m;").equals("-1");
//		// DISABLED_code_v4_("return 1m - (2m - 3m);").equals("2");
//		// DISABLED_code_v4_("return (1m - 2m) - 3m;").equals("-4");
//		// DISABLED_code_v4_("return (1m - 2m) - (3m - 4m);").equals("0");
//		// DISABLED_code_v4_("return (10m + 10m) - 1").equals("19");
//		code_v4_("return 15 - 3;").equals("12");
//		// DISABLED_code_v4_("1000m - 12").equals("988");
//		// DISABLED_code_v4_("1000m - (-12)").equals("1012");
//		code_v4_("return 15 - false;").equals("15");
//		code_v4_("return 15 - true;").equals("14");
//		code_v4_("var a = 15 return a - true;").equals("14");
//		// code_v4_("12$ - []").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//		code_v4_("var a = 100 return a - 20;").equals("80");
//		code_v4_("return null - null;").equals("0");
//		code_v4_("return 12 - null;").equals("12");
//		code_v4_("return null - 12;").equals("-12");
//
//		section("Number.operator -=");
//		code_v4_("var a = 15 a -= true return a;").equals("14");
//		// code_v4_("var a = 15$ a -= []").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//		// code_v4_("var a = 15$ a -= [] a").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//		code_v4_("var a = 15 return ['', a -= 6];").equals("[\"\", 9]");
//
//		section("Number.operator *");
//		code_v4_("return 3 * 4;").equals("12");
//		code_v4_("return 10 + 3 * 4;").equals("22");
//		code_v4_("return (5 + 2) * (16 * 2);").equals("224");
//		// DISABLED_code_v4_("3m * 4m").equals("12");
//		// DISABLED_code_v4_("10m + 3m * 4m").equals("22");
//		// DISABLED_code_v4_("(5m + 2m) * (16m * 2m)").equals("224");
//		code_v4_("return 12 * false;").equals("0");
//		code_v4_("var a = 13; return a * false;").equals("0");
//		code_v4_("return 13 * true;").equals("13");
//		code_v4_("return 7 * 2;").equals("14");
//		code_v4_("var a = 6; return a * 3;").equals("18");
//		// code_v4_("14$ * []").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//		// DISABLED_code_v4_("return 12344532132423 * 987657897613412;").equals("12192174652930109838844857276");
//		// DISABLED_code_v4_("12344532132423m * 987657897613412m").equals("12192174652930109838844857276");
//		// DISABLED_code_v4_("5 * 'yo'").equals("'yoyoyoyoyo'");
//		// DISABLED_code_v4_("50m * 10").equals("500");
//		// DISABLED_code_v4_("50 * 10m").equals("500");
//		// DISABLED_code_v4_("let a = ['a', 12321111111111111111111111111111111321321321999999] a[1] * 123456789").equals("1521124814690000000000000000000000025951877651354934543211");
//		code_v4_("return null * 2;").equals("0");
//		code_v4_("return 2 * null;").equals("0");
//		code_v4_("return null * null;").equals("0");
//
//		section("Number.operator *=");
//		code_v4_("var a = 15 a *= true return a;").equals("15");
//		code_v4_("var a = 15 a *= false return a;").equals("0");
//		code_v4_("var a = 15 a *= null return a;").equals("0");
//		// code_v4_("var a = 15$ a *= []").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//		// code_v4_("var a = 15$ a *= [] a").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//		code_v4_("var a = 15; return ['', a *= 2];").equals("[\"\", 30]");
//		code_v4_("var a = 5 a *= 0 return a;").equals("0");
//		code_v4_("var a = 5 a *= 12 return a;").equals("60");
//		code_v4_("var a = 5 a *= 5 return a;").equals("25");
//		code_v4_("var a = null a *= 5 return a;").equals("0");
//		code_strict("var a = null a *= 5 return a;").error(Error.ASSIGNMENT_INCOMPATIBLE_TYPE);
//		code_strict("any a = null a *= 5 return a;").equals("0");
//		code_v4_("var a = null a *= null return a;").equals("0");
//		code_strict("var a = null a *= null return a;").error(Error.ASSIGNMENT_INCOMPATIBLE_TYPE);
//		code_strict("any a = null a *= null return a;").equals("0");
//		code_v4_("var a = null return a *= 5").equals("0");
//		code_strict("var a = null return a *= 5").error(Error.ASSIGNMENT_INCOMPATIBLE_TYPE);
//		code_strict("any a = null return a *= 5").equals("0");
//		code_v4_("var a = null return a *= null").equals("0");
//		code_strict("var a = null return a *= null").error(Error.ASSIGNMENT_INCOMPATIBLE_TYPE);
//		code_strict("any a = null return a *= null").equals("0");
//		// DISABLED_code_v4_("var a = 5m a *= 0 a").equals("0");
//		// DISABLED_code_v4_("var a = 5m a *= 12 a").equals("60");
//		// DISABLED_code_v4_("var a = 5m a *= 5m a").equals("25");
//		// DISABLED_code_v4_("var a = 91591785496891278315799124157189514175m a *= 157854689278315792457851475m a").equals("14458192840057923568549758280294876918394393505787702519557158125");
//		// DISABLED_code_v4_("var a = 78m a *= true a").equals("78");
//
//		section("Number.operator **");
//		code_v4_("return 14 ** 3;").equals("2744");
//		code_v4_("return 14 ** null;").equals("1");
//		code_v4_("return null ** 2;").equals("0");
//		code_v4_("return null ** null;").equals("1");
//		code_v4_("return 0 ** 0;").equals("1");
//		// DISABLED_code_v4_("return 14 ** true;").equals("14");
//		// DISABLED_code_v4_("return 14 ** false;").equals("1");
//		// DISABLED_code_v4_("let a = 14 return a ** false;").equals("1");
//		// code_v4_("14$ ** []").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//		// DISABLED_code_v4_("return 2 ** 50;").equals("1.125899906842624E15");
//		// DISABLED_code_v4_("return 2l ** 50;").equals("1125899906842624");
//		// DISABLED_code_v4_("257l ** 20").equals("-9223372036854775808"); // overflow
//		// DISABLED_code_v4_("257m ** 20").equals("1580019571820317063568778786121273112555213952001");
//		// DISABLED_code_v4_("2m ** 50").equals("1125899906842624");
//		// DISABLED_code_v4_("(5m + 2m) ** (16m * 2m)").equals("1104427674243920646305299201");
//		// code_v4_("123m ** 1900").exception(ls::vm::Exception::NUMBER_OVERFLOW);
//		code_v4_("var s = 0 s = 5 ** 2 return s;").equals("25");
//
//		section("Number.operator **=");
//		code_v4_("var a = 5; a **= 4 return a").equals("625");
//		code_v4_("var a = 5; return a **= 4").equals("625");
//		code_v4_("var a = 5; return a **= true").equals("5");
//		code_v4_("var a = null a **= 5 return a").equals("0");
//		code_strict("var a = null a **= 5 return a").error(Error.ASSIGNMENT_INCOMPATIBLE_TYPE);
//		code_strict("any a = null return a **= 5").equals("0");
//		// DISABLED_code_v4_("var a = 5$; a **= false").equals("1");
//		// code_v4_("var a = 5$; a **= []").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//		// DISABLED_code_v4_("var a = 5; ['', a **= 4]").equals("['', 625]");
//
//		section("Number.operator %");
//		code_v4_("return 721 % 57;").equals("37");
//		code_v4_("return false % 3;").equals("0");
//		code_v4_("return true % 3;").equals("1");
//		code_v4_("var a = 721 return a % 57;").equals("37");
//		code_v4_("var a = null return a % 57;").equals("0");
//		// code_v4_("let a = 721$ a % []").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//		// DISABLED_code_v4_("721 % true").equals("0");
//		// code_v4_("721$ % false").exception(ls::vm::Exception::DIVISION_BY_ZERO);
//		// code_v4_("let a = 721$ a % false").exception(ls::vm::Exception::DIVISION_BY_ZERO);
//		// DISABLED_code_v4_("let a = 721$ a % true").equals("0");
//		// DISABLED_code_v4_("123456789123456789m % 234567m").equals("221463");
//		// DISABLED_code_v4_("(12m ** 40m) % 234567m").equals("228798");
//		// DISABLED_code_v4_("100000m % (12m ** 3m)").equals("1504");
//		// DISABLED_code_v4_("(100000m * 10m) % (12m ** 3m)").equals("1216");
//		// code_v4_("['salut', 123][0] % 5").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//		// TODO should have semantic error
//		// code_v4_("['salut', 'a'][0] % 5").error(ls::Error::NO_SUCH_OPERATOR, {});
//
//		section("Number.operator %=");
//		code_v4_("var a = 721 return a %= 17;").equals("7");
//		// DISABLED_code_v4_("var a = 721 a %= true").equals("0");
//		// code_v4_("var a = 721$ a %= []").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//
//		// section("Number.operator %%");
//		// DISABLED_code_v4_("0 %% 1").equals("0");
//		// DISABLED_code_v4_("2 %% 5").equals("2");
//		// DISABLED_code_v4_("(-2) %% 5").equals("3");
//		// DISABLED_code_v4_("(-12) %% 5").equals("3");
//		// DISABLED_code_v4_("721 %% 57").equals("37");
//		// DISABLED_code_v4_("(-721) %% 57").equals("20");
//		// DISABLED_code_v4_("(-721$) %% 57$").equals("20");
//
//		// section("Number.operator %%=");
//		// DISABLED_code_v4_("var a = 0 a %%= 1").equals("0");
//		// DISABLED_code_v4_("var a = 2 a %%= 5").equals("2");
//		// DISABLED_code_v4_("var a = -2 a %%= 5").equals("3");
//		// DISABLED_code_v4_("var a = -12 a %%= 5").equals("3");
//		// DISABLED_code_v4_("var a = 721 a %%= 57").equals("37");
//		// DISABLED_code_v4_("var a = -721 a %%= 57").equals("20");
//		// DISABLED_code_v4_("var a = -721$ a %%= 57$").equals("20");
//
//		section("Number.operator /");
//		code_v4_("8 / 0").equals("null");
//		code_v4_("8 / 0").equals("∞");
//		code_v4_("8 / null").equals("null");
//		code_v4_("8 / null").equals("∞");
//		code_v4_("null / 5").equals("0");
//		code_v4_("null / 5").equals("0.0");
//		// code_v4_("12$ / false").exception(ls::vm::Exception::DIVISION_BY_ZERO);
//		// code_v4_("let a = 13$; a / false").exception(ls::vm::Exception::DIVISION_BY_ZERO);
//		code_v4_("return 13 / true;").equals("13");
//		code_v4_("return 13 / true;").equals("13.0");
//		code_v4_("return 14 / 2;").equals("7");
//		code_v4_("return 14 / 2;").equals("7.0");
//		code_v4_("var a = 18; return a / 3;").equals("6");
//		code_v4_("var a = 18; return a / 3;").equals("6.0");
//		// code_v4_("14$ / []").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//		code_v4_("var a = 17, b = 5 return a / b;").equals("3,4");
//		code_v4_("var a = 17, b = 5 return a / b;").equals("3.4");
//
//		section("Number.operator /=");
//		code_v4_("var a = 12 a /= 3 return a;").equals("4");
//		code_v4_("var a = 12 a /= 3 return a;").equals("4.0");
//		code_strict("var a = 12 a /= 3 return a;").equals("4");
//		code_strict_v1("any a = 12 a /= 3 return a;").equals("4");
//		code_strict_v2_("any a = 12 a /= 3 return a;").equals("4.0");
//		code_v4_("var a = 12 a /= 0.5 return a;").equals("24");
//		code_v4_("var a = 12 a /= 0.5 return a;").equals("24.0");
//		code_strict("var a = 12 a /= 0.5 return a;").equals("24");
//		code_v4_("var a = 12 a /= true return a;").equals("12");
//		code_v4_("var a = 12 a /= true return a;").equals("12.0");
//		code_strict("var a = 12 a /= true return a;").equals("12");
//		code_v4_("var a = null a /= 5 return a;").equals("0");
//		code_v4_("var a = null a /= 5 return a;").equals("0.0");
//		// code_v4_("var a = 12 a /= false return a;").equals("nan");
//		// code_v4_("var a = 12$ a /= []").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//		// code_v4_("var a = 12$ a /= [] a").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//		code_v4_("var a = 15; return ['', a /= 2];").equals("[\"\", 7,5]");
//		code_v4_("var a = 15; return ['', a /= 2];").equals("[\"\", 7.5]");
//		code_strict_v2_("var a = 15; return ['', a /= 2];").equals("[\"\", 7]");
//		code_strict_v2_("any a = 15; return ['', a /= 2];").equals("[\"\", 7.5]");
//
//		section("Number.operator <");
//		code_v4_("return 5 < 2;").equals("false");
//		code_v4_("return 2 < 5;").equals("true");
//		code_v4_("return 5.1 < 2.1;").equals("false");
//		code_v4_("return 2.1 < 5.1;").equals("true");
//		// code_v4_("3m < 4m").equals("true");
//		// code_v4_("10m < (3m * 4m)").equals("true");
//		// code_v4_("(5m + 5m) < (3m * 4m)").equals("true");
//		// code_v4_("(5m + 5m) < 12m").equals("true");
//		// code_v4_("3m < 4").equals("true");
//
//		section("Number.operator <=");
//		code_v4_("return 5 <= 2;").equals("false");
//		code_v4_("return 2 <= 5;").equals("true");
//		code_v4_("return 5.1 <= 2.1;").equals("false");
//		code_v4_("return 2.1 <= 5.1;").equals("true");
//		code_v4_("return 3 <= 4;").equals("true");
//		code_v4_("return 3 <= [];").equals("false");
//
//		section("Number.operator >");
//		code_v4_("return 5 > 2;").equals("true");
//		code_v4_("return 2 > 5;").equals("false");
//		code_v4_("return 5.1 > 2.1;").equals("true");
//		code_v4_("return 2.1 > 5.1;").equals("false");
//		// code_v4_("12 > 5m").equals("true");
//		code_v4_("return [] > true;").equals("false");
//		// code_v4_("-100m > 0").equals("false");
//
//		section("Number.operator >=");
//		code_v4_("return 5 >= 2;").equals("true");
//		code_v4_("return 2 >= 5;").equals("false");
//		code_v4_("return 5.1 >= 2.1;").equals("true");
//		code_v4_("return 2.1 >= 5.1;").equals("false");
//
//		// section("Number.operator \\");
//		// code_v4_("10 \\ 2").equals("5");
//		// code_v4_("10 \\ 4").equals("2");
//		// code_v4_("2432431 \\ 2313").equals("1051");
//		// code_v4_("let a = 420987$ a \\ 546$").equals("771");
//		// code_v4_("420987$ \\ 12").equals("35082");
//		// code_v4_("12345678912345l \\ 1234").equals("10004602035");
//		// code_v4_("12$ \\ false").exception(ls::vm::Exception::DIVISION_BY_ZERO);
//		// code_v4_("let a = 13$; a \\ false").exception(ls::vm::Exception::DIVISION_BY_ZERO);
//		// code_v4_("13$ \\ true").equals("13");
//		// code_v4_("17$ \\ 4").equals("4");
//		// code_v4_("let a = 10.7$; a \\ true").equals("10");
//		// code_v4_("let a = 10$; a \\ 4").equals("2");
//		// code_v4_("14$ \\ []").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//		// code_v4_("67.89$ \\ 1").equals("67");
//		// code_v4_("['', 10 \\ 2]").equals("['', 5]");
//		// code_v4_("['', 10$ \\ 2]").equals("['', 5]");
//
//		// section("Number.operator \\=");
//		// code_v4_("var a = 12 a \\= 5").equals("2");
//		// code_v4_("var a = 12$ a \\= 5").equals("2");
//		// code_v4_("var a = 30$ a \\= 4 a").equals("7");
//		// code_v4_("var a = 12$ a \\= true a").equals("12");
//		// code_v4_("var a = 12$ a \\= false a").exception(ls::vm::Exception::DIVISION_BY_ZERO);
//		// code_v4_("var a = 12$ a \\= []").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//		// code_v4_("var a = 12$ a \\= [] a").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//		// code_v4_("var a = 12 ['', a \\= 5]").equals("['', 2]");
//
//		section("Number.operator &");
//		code_v4_("return 0 & 0;").equals("0");
//		code_v4_("return 1 & 0;").equals("0");
//		code_v4_("return 1 & 1;").equals("1");
//		code_v4_("return 5 & 12;").equals("4");
//		code_v4_("return 87619 & 18431;").equals("17987");
//		code_v4_("return 87619 & [18431, ''][0];").equals("17987");
//		code_v4_("var a = 87619 return a &= 18431;").equals("17987");
//		code_v4_("var a = 87619 a &= 18431 return a;").equals("17987");
//		code_v4_("return 87619 & 18431;").equals("17987");
//		// code_v4_("87619$ &= 18431").error(ls::Error::VALUE_MUST_BE_A_LVALUE, {"87619"});
//		code_v4_("var a = 87619 a &= 18431 return a;").equals("17987");
//		// code_v4_("[12, 'hello'][1] & 5").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//		// code_v4_("var a = [12, 'hello'][1] a &= 18431 a").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//
//		section("Number.operator |");
//		code_v4_("return 0 | 0;").equals("0");
//		code_v4_("return 1 | 0;").equals("1");
//		code_v4_("return 1 | 1;").equals("1");
//		code_v4_("return 5 | 12;").equals("13");
//		code_v4_("return [5, ''][0] | [12, ''][0];").equals("13");
//		code_v4_("return 87619 | 18431;").equals("88063");
//		code_v4_("var a = 87619 return a |= 18431;").equals("88063");
//		code_v4_("var a = 87619 a |= 18431 return a;").equals("88063");
//		code_v4_("return [87619, ''][0] | 18431;").equals("88063");
//		// code_v4_("87619$ |= 18431").error(ls::Error::VALUE_MUST_BE_A_LVALUE, {"87619"});
//		code_v4_("var a = 87619 a |= 18431 return a;").equals("88063");
//		// code_v4_("[12, 'hello'][1] | 5").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//
//		section("Number.operator ^");
//		code_v4_("return 0 ^ 0;").equals("0");
//		code_v4_("return 1 ^ 0;").equals("1");
//		code_v4_("return 1 ^ 1;").equals("0");
//		code_v4_("return 5 ^ 12;").equals("9");
//		code_v4_("return 87619 ^ 18431;").equals("70076");
//		code_v4_("return [87619, ''][0] ^ [18431, ''][0];").equals("70076");
//		code_v4_("var a = 5 a ^= 2 return a;").equals("25"); // In LS 1.0, ^= was power equals
//		code_v4_("var a = 87619 return a ^= 18431;").equals("70076");
//		code_v4_("var a = 87619 a ^= 18431 return a;").equals("70076");
//		code_v4_("return [87619, ''][0] ^ 18431;").equals("70076");
//		// code_v4_("87619$ ^= 18431").error(ls::Error::VALUE_MUST_BE_A_LVALUE, {"87619"});
//		code_v4_("var a = 87619 a ^= 18431 return a;").equals("70076");
//		// code_v4_("[12, 'hello'][1] ^ 5").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//
//		section("Number.operator <<");
//		code_v4_("return 0 << 0;").equals("0");
//		code_v4_("return 1 << 0;").equals("1");
//		code_v4_("return 123456 << 0;").equals("123456");
//		code_v4_("return 0 << 1;").equals("0");
//		code_v4_("return 0 << 12;").equals("0");
//		code_v4_("return 1 << 8;").equals("256");
//		code_v4_("return 123 << 12;").equals("503808");
//		code_v4_("return [123, ''][0] << 12;").equals("503808");
//		code_v4_("var a = 123 return a <<= 11;").equals("251904");
//		code_v4_("var a = 123 a <<= 13 return a;").equals("1007616");
//		code_v4_("var a = [123, ''] return a[0] <<= 13;").equals("1007616");
//		code_v4_("var a = 123 return ['', a <<= 13];").equals("[\"\", 1007616]");
//		// code_v4_("'salut' << 5").exception(ls::vm::Exception::NO_SUCH_OPERATOR);
//
//		section("Number.operator >>");
//		code_v4_("return 0 >> 0;").equals("0");
//		code_v4_("return 1 >> 0;").equals("1");
//		code_v4_("return 123456 >> 0;").equals("123456");
//		code_v4_("return 0 >> 1;").equals("0");
//		code_v4_("return 0 >> 12;").equals("0");
//		code_v4_("return 155 >> 3;").equals("19");
//		code_v4_("return -155 >> 3;").equals("-20");
//		code_v4_("return 12345 >> 8;").equals("48");
//		code_v4_("return 123123123 >> 5;").equals("3847597");
//		code_v4_("return [123123123, ''][0] >> 5;").equals("3847597");
//		code_v4_("var a = 123123123 return a >>= 6;").equals("1923798");
//		code_v4_("var a = 123123123 a >>= 7 return a;").equals("961899");
//		code_v4_("var a = [123123123, ''] return a[0] >>= 7;").equals("961899");
//		code_v4_("var a = 12345 return ['', a >>= 8];").equals("[\"\", 48]");
//		// code_v4_("'salut' >> 5").error(ls::Error::NO_SUCH_OPERATOR, {env.tmp_string->to_string(), ">>", env.integer->to_string()});
//
//		section("Number.operator >>>");
//		code_v4_("return 155 >>> 3;").equals("19");
//		code_v4_("return -155 >>> 3;").equals("2305843009213693932");
//		code_v4_("return [-155, ''][0] >>> 3;").equals("2305843009213693932");
//		code_v4_("var a = -155 return a >>>= 4;").equals("1152921504606846966");
//		code_v4_("var a = -155 a >>>= 5 return a;").equals("576460752303423483");
//		code_v4_("var a = [-155, ''] return a[0] >>>= 5;").equals("576460752303423483");
//		code_v4_("var a = -155 return ['', a >>>= 5];").equals("[\"\", 576460752303423483]");
//		// code_v4_("'salut' >>> 5").error(ls::Error::NO_SUCH_OPERATOR, {env.tmp_string->to_string(), ">>>", env.integer->to_string()});
//
//		section("Not a statement errors");
//		code_v4_("null; return null;").equals("null");
//		code_v4_("(null); return null;").equals("null");
//		code_v4_("((null)); return null;").equals("null");
//		code_v4_("true; return null;").equals("null");
//		code_v4_("false; return null;").equals("null");
//		code_v4_("'salut'; return null;").equals("null");
//		code_v4_("var a; a; return null;").equals("null");
//		code_v4_("12; return null;").equals("null");
//		code_v4_("12 && 5; return null;").equals("null");
//		code_v4_("12 + 5; return null;").equals("null");
//		code_v4_("12 - 5; return null;").equals("null");
//		code_v4_("12 * 5; return null;").equals("null");
//		code_v4_("12 / 5; return null;").equals("null");
//		code_v4_("12 % 5; return null;").equals("null");
//		code_v4_("12 ** 5; return null;").equals("null");
//		code_v4_("12 ^ 5; return null;").equals("null");
//		code_v4_("12 & 5; return null;").equals("null");
//		code_v4_("12 | 5; return null;").equals("null");
//		code_v4_("12 < 5; return null;").equals("null");
//		code_v4_("12 > 5; return null;").equals("null");
//		code_v4_("12 <= 5; return null;").equals("null");
//		code_v4_("12 >= 5; return null;").equals("null");
//		code_v4_("12 == 5; return null;").equals("null");
//		code_v4_("12 === 5; return null;").equals("null");
//		code_v4_("(12 && 5); return null;").equals("null");
//		code_v4_("true ? 1 : 2; return null;").equals("null");
//		code_v4_("(true ? 1 : 2); return null;").equals("null");
//
//		/*
//		* Methods
//		*/
//		section("Number.abs()");
//		// code_v4_("return abs;").equals("<function>");
//		code_v4_("return abs(-12);").equals("12");
//		code_v4_("return abs(-19.5);").equals("19,5");
//		code_v4_("return abs(-19.5);").equals("19.5");
//		code_v4_("return abs(12);").equals("12");
//		// code_v4_("return abs(-16436435l)").equals("16436435");
//		code_v4_("return abs(-12.67);").equals("12,67");
//		code_v4_("return abs(-12.67);").equals("12.67");
//		code_v4_("return abs(['a', -15][1]);").equals("15");
//		// code_v4_("return (-17).abs()").equals("17");
//		// code_v4_("return (-19.5).abs()").equals("19.5");
//		// code_v4_("return 12.abs").equals("<function>");
//		// code_v4_("abs([1, 'salut'][1])").exception(ls::vm::Exception::WRONG_ARGUMENT_TYPE);
//		code_v4_("return abs(null)").equals("0");
//		code_v4_("return abs(null)").equals("0.0");
//		code_strict("return abs(null)").error(Error.WRONG_ARGUMENT_TYPE);
//		code_v4_("var ax = randInt(-17, 17) var ay = randInt(-17 + abs(ax), 17 - abs(ax))").debug().equals("null");
//
//		section("Number.exp()");
//		code_v4_("return exp(0)").equals("1");
//		code_v4_("return exp(0)").equals("1.0");
//		code_v4_("return exp(1)").equals("2,718");
//		code_v4_("return exp(1)").almost(Math.E);
//		code_v4_("return exp(4)").equals("54,598");
//		code_v4_("return exp(4)").almost(54.598150033144236204);
//		code_v4_("return exp(4.89)").equals("132,954");
//		code_v4_("return exp(4.89)").almost(132.953574051282743085);
//		code_v4_("return exp(-2.97)").equals("0,051");
//		code_v4_("return exp(-2.97)").almost(0.051303310331919108);
//		code_v4_("return exp(['a', 7.78][1])").equals("2 392,275");
//		code_v4_("return exp(['a', 7.78][1])").almost(2392.274820537377763685);
//		// code_v4_("return 0.exp();").equals("1");
//		// code_v4_("return 1.exp();").almost(Math.E);
//		// code_v4_("return 7.exp();").almost(1096.633158428458500566);
//		// code_v4_("return (-7).exp();").almost(0.000911881965554516);
//		// code_v4_("return (-3.33).exp();").almost(0.035793105067655297);
//		code_v4_("return E ** 5;").equals("148,413");
//		code_v4_("return E ** 5;").almost(148.413159102576571513);
//
//		section("Number.floor()");
//		code_v4_("return floor(5.9);").equals("5");
//		code_v4_("var a = 5 return floor(a);").equals("5");
//		code_v4_("var a = 5.4 return floor(a);").equals("5");
//		code_v4_("return floor(['a', -14.7][1]);").equals("-15");
//		code_v4_("return floor(5.5);").equals("5");
//		code_v4_("return floor(1.897)").equals("1");
//		code_v4_("return floor(3.01)").equals("3");
//
//		section("Number.round()");
//		code_v4_("return round(5.7)").equals("6");
//		code_v4_("return round(5.4)").equals("5");
//		code_v4_("return round(['a', -15.89][1])").equals("-16");
//		code_v4_("return round(12)").equals("12");
//		code_v4_("return round(-1000)").equals("-1000");
//		code_v4_("return round(1.897)").equals("2");
//		code_v4_("return round(3.01)").equals("3");
//
//		section("Number.ceil()");
//		code_v4_("return ceil(5.1)").equals("6");
//		code_v4_("return ceil(188)").equals("188");
//		code_v4_("return ceil(1.897)").equals("2");
//		code_v4_("return ceil(3.01)").equals("4");
//
//		section("Number.max()");
//		code_v4_("return max(8, 5)").equals("8");
//		code_v4_("return max(8, 88)").equals("88");
//		code_v4_("return max(5, 12);").equals("12");
//		code_v4_("return max(5.0, 12);").equals("12");
//		code_v4_("return max(5.0, 12);").equals("12.0");
//		code_v4_("return max(75.7, 12);").equals("75,7");
//		code_v4_("return max(75.7, 12);").almost(75.7);
//		code_v4_("return max(5, 12.451);").equals("12,451");
//		code_v4_("return max(5, 12.451);").almost(12.451);
//		code_v4_("return max([5, 'a'][0], 4);").equals("5");
//		code_v4_("return max([5, 'a'][0], 76);").equals("76");
//		code_v4_("return max(4, [5, 'a'][0]);").equals("5");
//		code_v4_("return max(77, [5, 'a'][0]);").equals("77");
//		code_v4_("return max([55, 'a'][0], [5, 'a'][0]);").equals("55");
//		code_v4_("return max(5, 12.8);").equals("12,8");
//		code_v4_("return max(5, 12.8);").equals("12.8");
//		code_v4_("return max(15.7, 12.8);").equals("15,7");
//		code_v4_("return max(15.7, 12.8);").equals("15.7");
//		code_v4_("return max([15.7, ''][0], 12.8);").equals("15,7");
//		code_v4_("return max([15.7, ''][0], 12.8);").equals("15.7");
//		code_v4_("return max(5.5, [12.8, ''][0]);").equals("12,8");
//		code_v4_("return max(5.5, [12.8, ''][0]);").equals("12.8");
//		code_v4_("var a = 0.8 return max(0, a)").equals("0,8");
//		code_v4_("var a = 0.8 return max(0, a)").equals("0.8");
//		code_v4_("real value = 5 value *= max(1, 1.1) return value").equals("5,5");
//		code_v4_("real value = 5 value *= max(1, 1.1) return value").equals("5.5");
//		// code_v4_("return 2.max([7.5, ''][0]);").equals("7.5");
//		// code_v4_("return [2, ''][0].max([7.5, ''][0]);").equals("7.5");
//		// code_v4_("2.max([7.5, ''][1])").exception(ls::vm::Exception::WRONG_ARGUMENT_TYPE);
//		// code_v4_("return max(5l, 10.5)").equals("10.5");
//		// code_v4_("return max(5l, 10)").equals("10");
//		// code_v4_("return max(true, 10l)").equals("10");
//		// code_v4_("max('string', 12)").error(ls::Error::METHOD_NOT_FOUND, {"max(" + env.tmp_string->to_string() + ", " + env.integer->to_string() + ")"});
//
//		section("Number.min()");
//		code_v4_("return min(8, 5)").equals("5");
//		code_v4_("return min(8, 88)").equals("8");
//		code_v4_("return min(5, 12)").equals("5");
//		code_v4_("return min(75.7, 12)").equals("12");
//		code_v4_("return min(75.7, 12)").almost(12.0);
//		code_v4_("return min(5, 12.451)").equals("5");
//		code_v4_("return min(5, 12.451)").almost(5.0);
//		code_v4_("return min([5, 'a'][0], 4)").equals("4");
//		code_v4_("return min([5, 'a'][0], 76)").equals("5");
//		code_v4_("return min(4, [5, 'a'][0])").equals("4");
//		code_v4_("return min(77, [5, 'a'][0])").equals("5");
//		code_v4_("return min([55, 'a'][0], [5, 'a'][0])").equals("5");
//		code_v4_("return min(5, 12.8)").equals("5");
//		code_v4_("return min(5, 12.8)").equals("5.0");
//		code_v4_("return min(15.7, 12.8)").equals("12,8");
//		code_v4_("return min(15.7, 12.8)").equals("12.8");
//		code_v4_("return min([15.7, ''][0], 12.8)").equals("12,8");
//		code_v4_("return min([15.7, ''][0], 12.8)").equals("12.8");
//		code_v4_("return min(5.5, [12.8, ''][0])").equals("5,5");
//		code_v4_("return min(5.5, [12.8, ''][0])").equals("5.5");
//		code_v4_("return -min(15.7, 12)").equals("-12");
//		code_v4_("return -min(15.7, 12)").equals("-12.0");
//		// code_v4_("return min(5l, 10.5);").equals("5");
//		// code_v4_("return min(5l, 10);").equals("5");
//		// code_v4_("return min(true, 10l);").equals("1");
//		// code_v4_("min('string', 12)").error(ls::Error::METHOD_NOT_FOUND, {"min(" + env.tmp_string->to_string() + ", " + env.integer->to_string() + ")"});
//
//		section("Number.cos()");
//		code_v4_("return cos(0)").equals("1");
//		code_v4_("return cos(0)").equals("1.0");
//		code_v4_("return cos(2.5)").equals("-0,801");
//		code_v4_("return cos(2.5)").almost(Math.cos(2.5));
//		code_v4_("return cos(PI)").equals("-1");
//		code_v4_("return cos(PI)").equals("-1.0");
//		code_v4_("return cos(PI / 2)").equals("0");
//		code_v4_("return cos(PI / 2)").almost(0.0);
//		// code_v4_("return π.cos()").equals("-1");
//		// code_v4_("return ['', π][1].cos()").equals("-1");
//		code_v4_("return cos(['', PI][1]);").equals("-1");
//		code_v4_("return cos(['', PI][1]);").equals("-1.0");
//		code_v4_("return cos(PI);").equals("-1");
//		code_v4_("return cos(PI);").equals("-1.0");
//
//		section("Number.acos()");
//		code_v4_("return acos(1)").equals("0");
//		code_v4_("return acos(1)").equals("0.0");
//		code_v4_("return acos(-1)").equals("3,142");
//		code_v4_("return acos(-1)").almost(Math.PI);
//		code_v4_("return acos(0)").equals("1,571");
//		code_v4_("return acos(0)").almost(Math.PI / 2);
//		// code_v4_("return (-0.33).acos()").almost(1.907099901948877019);
//		code_v4_("return acos(['y', 0][1])").equals("1,571");
//		code_v4_("return acos(['y', 0][1])").almost(Math.PI / 2);
//
//		section("Number.sin()");
//		code_v4_("return sin(0)").equals("0");
//		code_v4_("return sin(0)").equals("0.0");
//		code_v4_("return sin(2.5)").equals("0,598");
//		code_v4_("return sin(2.5)").almost(Math.sin(2.5));
//		code_v4_("return sin(PI)").equals("0");
//		code_v4_("return sin(PI)").almost(0.0);
//		code_v4_("return sin(PI / 2)").equals("1");
//		code_v4_("return sin(PI / 2)").equals("1.0");
//		code_v4_("return sin(- PI / 2)").equals("-1");
//		code_v4_("return sin(- PI / 2)").equals("-1.0");
//		code_v4_("return sin(['', PI / 2][1])").equals("1");
//		code_v4_("return sin(['', PI / 2][1])").equals("1.0");
//		code_v4_("return sin(PI / 2)").equals("1");
//		code_v4_("return sin(PI / 2)").equals("1.0");
//
//		section("Number.tan()");
//		code_v4_("return tan(0)").equals("0");
//		code_v4_("return tan(0)").equals("0.0");
//		code_v4_("return tan(2.5)").equals("-0,747");
//		code_v4_("return tan(2.5)").almost(Math.tan(2.5));
//		code_v4_("return tan(PI)").equals("-0");
//		code_v4_("return tan(PI)").almost(0.0);
//		code_v4_("return tan(PI / 4)").equals("1");
//		code_v4_("return tan(PI / 4)").almost(1.0);
//		code_v4_("return tan(- PI / 4)").equals("-1");
//		code_v4_("return tan(- PI / 4)").almost(-1.0);
//		code_v4_("return tan(['', PI / 4][1])").equals("1");
//		code_v4_("return tan(['', PI / 4][1])").almost(1.0);
//
//		section("Number.asin()");
//		code_v4_("return asin(0)").equals("0");
//		code_v4_("return asin(0)").equals("0.0");
//		code_v4_("return asin(-1)").equals("-1,571");
//		code_v4_("return asin(-1)").almost(-Math.PI / 2);
//		code_v4_("return asin(1)").equals("1,571");
//		code_v4_("return asin(1)").almost(Math.PI / 2);
//		// code_v4_("return 0.33.asin()").almost(0.33630357515398035);
//		code_v4_("return asin(['y', -1][1])").equals("-1,571");
//		code_v4_("return asin(['y', -1][1])").almost(-Math.PI / 2);
//
//		section("Number.atan()");
//		code_v4_("return atan(1)").equals("0,785");
//		code_v4_("return atan(1)").almost(Math.PI / 4);
//		code_v4_("return atan(-1)").equals("-0,785");
//		code_v4_("return atan(-1)").almost(-Math.PI / 4);
//		code_v4_("return atan(0.5)").equals("0,464");
//		code_v4_("return atan(0.5)").almost(0.463647609000806094);
//		// code_v4_("return 0.atan()").equals("0");
//		code_v4_("return atan(['y', 0.5][1])").equals("0,464");
//		code_v4_("return atan(['y', 0.5][1])").almost(0.463647609000806094);
//
//		section("Number.atan2()");
//		code_v4_("return atan2(1, 1)").equals("0,785");
//		code_v4_("return atan2(1, 1)").almost(Math.PI / 4);
//		code_v4_("return atan2(150.78, 150.78)").equals("0,785");
//		code_v4_("return atan2(150.78, 150.78)").almost(Math.PI / 4);
//		code_v4_("return atan2(1, 0)").equals("1,571");
//		code_v4_("return atan2(1, 0)").almost(Math.PI / 2);
//		code_v4_("return atan2(-1, 0)").equals("-1,571");
//		code_v4_("return atan2(-1, 0)").almost(-Math.PI / 2);
//		code_v4_("return atan2(0, 1)").equals("0");
//		code_v4_("return atan2(0, 1)").equals("0.0");
//		code_v4_("return atan2(0, -1)").equals("3,142");
//		code_v4_("return atan2(0, -1)").almost(Math.PI);
//		code_v4_("return atan2(12.12, 42.42)").equals("0,278");
//		code_v4_("return atan2(12.12, 42.42)").almost(0.278299659005111333);
//		// code_v4_("return 1.atan2(1)").almost(Math.PI / 4);
//		// code_v4_("return ['', -1][1].atan2(1)").almost(-Math.PI / 4);
//		// code_v4_("return 1.atan2(['', -1][1])").almost(3 * Math.PI / 4);
//		// code_v4_("return ['', -1][1].atan2(['', -1][1])").almost(-3 * Math.PI / 4);
//		code_v4_("return atan2(1, 1)").equals("0,785");
//		code_v4_("return atan2(1, 1)").almost(Math.PI / 4);
//		code_v4_("return atan2(['', -1][1], 1)").equals("-0,785");
//		code_v4_("return atan2(['', -1][1], 1)").almost(-Math.PI / 4);
//		code_v4_("return atan2(1, ['', -1][1])").equals("2,356");
//		code_v4_("return atan2(1, ['', -1][1])").almost(3 * Math.PI / 4);
//		code_v4_("return atan2(['', -1][1], ['', -1][1])").equals("-2,356");
//		code_v4_("return atan2(['', -1][1], ['', -1][1])").almost(-3 * Math.PI / 4);
//		// code_v4_("return atan2(1, true)").almost(Math.PI / 4);
//		// code_v4_("return atan2(true, false)").almost(Math.PI / 2);
//
//		section("Number.cbrt()");
//		code_v4_("return cbrt(125)").almost(5.0);
//		code_v4_("return cbrt(1000)").almost(10.0);
//		code_v4_("return cbrt(1728)").almost(12.0, 1e-14);
//		// code_v4_("return 1728.cbrt()").almost(12.0, 0.00000000000001);
//		code_v4_("return cbrt(['', 1728][1])").almost(12.0, 0.00000000000001);
//		// code_v4_("return ['', 1728][1].cbrt()").almost(12.0, 0.00000000000001);
//
//		// section("Number.int()");
//		// code_v4_("int(15.1)").equals("15");
//		// code_v4_("int(15.5)").equals("15");
//		// code_v4_("int(15.9)").equals("15");
//
//		// section("Number.isInteger()");
//		// code_v4_("isInteger(12)").equals("true");
//		// code_v4_("isInteger(0)").equals("true");
//		// code_v4_("isInteger(-5)").equals("true");
//		// code_v4_("isInteger(12.9)").equals("false");
//		// code_v4_("isInteger(-5.2)").equals("false");
//		// code_v4_("isInteger(π)").equals("false");
//		// code_v4_("12.isInteger()").equals("true");
//		// code_v4_("12.5.isInteger()").equals("false");
//		// code_v4_("[12, 0][0].isInteger()").equals("true");
//		// code_v4_("[12.5, 0][0].isInteger()").equals("false");
//
//		// section("Number.fold");
//		// code_v4_("1234567.fold((x, y) -> x + y, 0)").equals("28");
//		// code_v4_("1234567.fold((x, y) -> x + y, 1000)").equals("1028");
//		// code_v4_("1234567.fold((x, y) -> x * y, 1)").equals("5040");
//		// code_v4_("1234567.fold((x, y) -> x + y ** 2, 0)").equals("140");
//
//		section("Number.hypot");
//		code_v4_("return hypot(3, 4)").equals("5");
//		code_v4_("return hypot(3, 4)").equals("5.0");
//		// code_v4_("return 3.hypot(4)").equals("5");
//		code_v4_("return hypot(34, 74)").equals("81,437");
//		code_v4_("return hypot(34, 74)").almost(81.437092286);
//		code_v4_("return hypot([34, ''][0], 74)").equals("81,437");
//		code_v4_("return hypot([34, ''][0], 74)").almost(81.437092286);
//
//		section("Number.signum");
//		// code_v4_("0.signum()").equals("0");
//		// code_v4_("-0.signum()").equals("0");
//		// code_v4_("12.signum()").equals("1");
//		// code_v4_("12.5.signum()").equals("1");
//		// code_v4_("-12.signum()").equals("-1");
//		// code_v4_("-12.5.signum()").equals("-1");
//		code_v4_("return signum(0)").equals("0");
//		code_v4_("return signum(12)").equals("1");
//		code_v4_("return signum(-17)").equals("-1");
//		code_v4_("return signum(-12.5)").equals("-1");
//		code_v4_("return signum(85)").equals("1");
//
//		section("Number.sqrt");
//		code_v4_("return sqrt(2)").equals("1,414");
//		code_v4_("return sqrt(2)").almost(Math.sqrt(2));
//		// code_v4_("return sqrt(123456789123456789123456789)").equals("11111111066111");
//		// code_v4_("return sqrt(55m ** 20m)").equals("253295162119140625");
//		// code_v4_("return sqrt(12m + 5m)").equals("4");
//		// code_v4_("return var n = 12; n.sqrt()").equals("3.4641016151");
//		// code_v4_("return let f = sqrt f(5)").equals("2.2360679775");
//		code_v4_("return sqrt(16)").equals("4");
//		code_v4_("return sqrt(16)").equals("4.0");
//		code_v4_("return sqrt(25)").equals("5");
//		code_v4_("return sqrt(25)").equals("5.0");
//
//		section("Number.toDegrees");
//		// code_v4_("return π.toDegrees()").equals("180");
//		// code_v4_("return (π / 2).toDegrees()").equals("90");
//		// code_v4_("return (-π / 2).toDegrees()").equals("-90");
//		// code_v4_("return 0.toDegrees()").equals("0");
//		code_v4_("return toDegrees(PI)").equals("180");
//		code_v4_("return toDegrees(PI)").equals("180.0");
//		code_v4_("return toDegrees(PI / 2)").equals("90");
//		code_v4_("return toDegrees(PI / 2)").equals("90.0");
//		code_v4_("return toDegrees(-PI / 2)").equals("-90");
//		code_v4_("return toDegrees(-PI / 2)").equals("-90.0");
//		code_v4_("return toDegrees(0)").equals("0");
//		code_v4_("return toDegrees(0)").equals("0.0");
//
//		section("Number.toRadians");
//		// code_v4_("return 180.toRadians()").almost(Math.PI);
//		// code_v4_("return 90.toRadians()").almost(Math.PI / 2);
//		// code_v4_("return (-90).toRadians()").almost(-Math.PI / 2);
//		// code_v4_("return 0.toRadians()").equals("0");
//		code_v4_("return toRadians(180)").equals("3,142");
//		code_v4_("return toRadians(180)").almost(Math.PI);
//		code_v4_("return toRadians(90)").equals("1,571");
//		code_v4_("return toRadians(90)").almost(Math.PI / 2);
//		code_v4_("return toRadians(-90)").equals("-1,571");
//		code_v4_("return toRadians(-90)").almost(-Math.PI / 2);
//		code_v4_("return toRadians(0)").equals("0");
//		code_v4_("return toRadians(0)").equals("0.0");
//
//		section("Number.log");
//		// code_v4_("1.log()").equals("0");
//		code_v4_("return log(1)").equals("0");
//		code_v4_("return log(1)").equals("0.0");
//		code_v4_("return log(E)").equals("1");
//		code_v4_("return log(E)").equals("1.0");
//		// code_v4_("123456.log()").equals("11.7236400963");
//		code_v4_("return log(654321)").equals("13,391");
//		code_v4_("return log(654321)").almost(13.3913533357);
//		code_v4_("return log([55555, ''][0])").equals("10,925");
//		code_v4_("return log([55555, ''][0])").almost(10.9251288);
//
//		section("Number.log10");
//		code_v4_("return log10(10)").equals("1");
//		code_v4_("return log10(10)").equals("1.0");
//		// code_v4_("return 1.log10()").equals("0");
//		// code_v4_("return 123456.log10()").equals("5.0915122016");
//		code_v4_("return log10(654321)").equals("5,816");
//		code_v4_("return log10(654321)").almost(5.8157908589);
//		code_v4_("return log10([55555, ''][0])").equals("4,745");
//		code_v4_("return log10([55555, ''][0])").almost(4.7447231519);
//
//		section("Number.pow");
//		// code_v4_("2.pow(10)").equals("1024");
//		code_v4_("return pow(5, 3)").equals("125");
//		code_v4_("return pow(5, 3)").equals("125.0");
//		code_v4_("return pow(2, 10)").equals("1 024");
//		code_v4_("return pow(2, 10)").equals("1024.0");
//		// code_v4_("pow([10, ''][0], 5)").equals("100000");
//		// code_v4_("3000.pow(3)").equals("2147483648");
//		// code_v4_("return pow(3000, 3)").equals("2147483648");
//		// code_v4_("3000l.pow(3)").equals("27000000000");
//
//		// section("Object-like calls");
//		// code_v4_("(-12).abs()").equals("12");
//		// code_v4_("π.cos()").equals("-1");
//		// code_v4_("(π / 2).sin()").equals("1");
//		// code_v4_("12.sqrt()").almost(3.464101615137754386);
//		// code_v4_("12.8.floor()").equals("12");
//		// code_v4_("-12.8.floor()").equals("-12");
//		// code_v4_("(-12.8).floor()").equals("-13");
//		// code_v4_("12.2.ceil()").equals("13");
//		// code_v4_("12.8.round()").equals("13");
//		// code_v4_("-12.8.round()").equals("-13");
//		// code_v4_("2.pow(10)").equals("1024");
//		// code_v4_("0.isInteger()").equals("true");
//		// code_v4_("56.7.isInteger()").equals("false");
//		// code_v4_("(-56.7).isInteger()").equals("false");
//		// code_v4_("3.max(5)").equals("5");
//		// code_v4_("5.max(3)").equals("5");
//
//		// section("Combinated");
//		// code_v4_("3.max(5).min(2)").equals("2");
//		// code_v4_("3.max(5).max(10).max(12)").equals("12");
//		// code_v4_("10.max(5).max(8.7).max(-3.91)").equals("10");
//		// code_v4_("10.sqrt().cos()").almost(-0.99978607287932586);
//
//		// section("Number.isPrime()");
//		// code_v4_("0.isPrime()").equals("false");
//		// code_v4_("1.isPrime()").equals("false");
//		// code_v4_("2.isPrime()").equals("true");
//		// code_v4_("3.isPrime()").equals("true");
//		// code_v4_("4.isPrime()").equals("false");
//		// code_v4_("5.isPrime()").equals("true");
//		// code_v4_("1993.isPrime()").equals("true");
//		// code_v4_("3972049.isPrime()").equals("false");
//		// code_v4_("(1993l).isPrime()").equals("true");
//		// code_v4_("4398042316799.isPrime()").equals("true");
//		// code_v4_("(4398042316799m).isPrime() >= 1").equals("true");
//		// code_v4_("359334085968622831041960188598043661065388726959079837.isPrime()").equals("1");
//		// code_v4_("(146m ** 45m).isPrime()").equals("0");
//		// code_v4_("1993l.isPrime()").equals("true");
//		// code_v4_("1993m.isPrime()").equals("2");
//
//		section("Number.rand()");
//		code_v4_("var a = rand() return a >= 0 and a <= 1").equals("true");
//		code_v4_("var a = rand() return a > 1").equals("false");
//		code_v4_("var a = randInt(2067, 2070) return a >= 2067 and a < 2070").equals("true");
//		code_v1_3("var a = randFloat(500, 510) return a >= 500 and a < 510").equals("true");
//		code_v4_("var a = randReal(500, 510) return a >= 500 and a < 510").equals("true");
//
//		section("Number.bitCount()");
//		code_v4_("return bitCount(0)").equals("0");
//		code_v4_("return bitCount(0b11001110011)").equals("7");
//		code_v4_("return bitCount(0b111100111001111)").equals("11");
//		code_v4_("return bitCount(0xff)").equals("8");
//
//		section("Number.trailingZeros()");
//		code_v4_("return trailingZeros(0)").equals("64");
//		code_v4_("return trailingZeros(0b00001100110000)").equals("4");
//		code_v4_("return trailingZeros(0b100000000000)").equals("11");
//		code_v4_("return trailingZeros(0xff00)").equals("8");
//
//		section("Number.leadingZeros()");
//		code_v4_("return leadingZeros(0)").equals("64");
//		code_v4_("return leadingZeros(0b0000110011)").equals("58");
//		code_v4_("return leadingZeros(0b000000001)").equals("63");
//		code_v4_("return leadingZeros(0b11111111111111111111111111111111111111111111111110000110011)").equals("5");
//		code_v4_("return leadingZeros(0xff)").equals("56");
//
//		section("Number.bitReverse()");
//		code_v4_("return binString(bitReverse(0))").equals("\"0\"");
//		code_v4_("return binString(bitReverse(0b0000110011))").equals("\"1100110000000000000000000000000000000000000000000000000000000000\"");
//		code_v4_("return binString(bitReverse(0b000000001))").equals("\"1000000000000000000000000000000000000000000000000000000000000000\"");
//		code_v4_("return binString(bitReverse(0b11111111111111111111111111111111111111111111111110000110011))").equals("\"1100110000111111111111111111111111111111111111111111111111100000\"");
//		code_v4_("return binString(bitReverse(0xff))").equals("\"1111111100000000000000000000000000000000000000000000000000000000\"");
//
//		section("Number.byteReverse()");
//		code_v4_("return hexString(byteReverse(0))").equals("\"0\"");
//		code_v4_("return hexString(byteReverse(0xaabbccddeeff))").equals("\"ffeeddccbbaa0000\"");
//		code_v4_("return hexString(byteReverse(0xabcdef))").equals("\"efcdab0000000000\"");
//		code_v4_("return hexString(byteReverse(0xfffaaafff))").equals("\"ffafaaff0f000000\"");
//
//		section("Number.binString()");
//		code_v4_("return binString(0)").equals("\"0\"");
//		code_v4_("return binString(0b0000110011)").equals("\"110011\"");
//		code_v4_("return binString(0b000000001)").equals("\"1\"");
//		code_v4_("return binString(0b11001111000111001011101101110000110011)").equals("\"11001111000111001011101101110000110011\"");
//		code_v4_("return binString(0xff)").equals("\"11111111\"");
//
//		section("Number.hexString()");
//		code_v4_("return hexString(0)").equals("\"0\"");
//		code_v4_("return hexString(0xAABBCCDDEEFF)").equals("\"aabbccddeeff\"");
//		code_v4_("return hexString(0xABCDEF00FEDCBA)").equals("\"abcdef00fedcba\"");
//		code_v4_("return hexString(0xAAAAAAA0000000)").equals("\"aaaaaaa0000000\"");
//		code_v4_("return hexString(0xFF)").equals("\"ff\"");
//
//		section("Number.rotateLeft");
//		code_v4_("return rotateLeft(0, 0)").equals("0");
//		code_v4_("return rotateLeft(0, 5)").equals("0");
//		code_v4_("return rotateLeft(0, -5)").equals("0");
//		code_v4_("return rotateLeft(12345678, 10)").equals("12641974272");
//		code_v4_("return rotateLeft(99999999999, 40)").equals("8568097191560746824");
//
//		section("Number.rotateRight");
//		code_v4_("return rotateRight(0, 0)").equals("0");
//		code_v4_("return rotateRight(0, 5)").equals("0");
//		code_v4_("return rotateRight(0, -5)").equals("0");
//		code_v4_("return rotateRight(12345678, 10)").equals("6016809102166994712");
//		code_v4_("return rotateRight(99999999999, 40)").equals("1677721599983222784");
//		code_v4_("return rotateRight(99999999999, 40) === rotateLeft(99999999999, -40)").equals("true");
//
//		section("Number.realBits");
//		code_v4_("return realBits(0.0)").equals("0");
//		code_v4_("return realBits(1.0)").equals("4607182418800017408");
//		code_v4_("return realBits(-1.0)").equals("-4616189618054758400");
//		code_v4_("return realBits(PI)").equals("4614256656552045848");
//		code_v4_("return realBits(5.12345)").equals("4617454510305100746");
//		code_v4_("return realBits(5434323.213213)").equals("4707593071093958692");
//
//		section("Number.bitsToReal");
//		code_v4_("return bitsToReal(0)").equals("0.0");
//		code_v4_("return bitsToReal(4607182418800017408)").equals("1.0");
//		code_v4_("return bitsToReal(-4616189618054758400)").equals("-1.0");
//		code_v4_("return bitsToReal(4614256656552045848)").equals("3.141592653589793");
//		code_v4_("return bitsToReal(4617454510305100746)").equals("5.12345");
//		code_v4_("return bitsToReal(4707593071093958692)").equals("5434323.213213");
//
//		section("Number.isFinite");
//		code_v4_("return isFinite(0)").equals("true");
//		code_v4_("return isFinite(12)").equals("true");
//		code_v4_("return isFinite(42143.344324)").equals("true");
//		code_v4_("return isFinite(1 / 0)").equals("false");
//
//		section("Number.isInfinite");
//		code_v4_("return isInfinite(0)").equals("false");
//		code_v4_("return isInfinite(12)").equals("false");
//		code_v4_("return isInfinite(42143.344324)").equals("false");
//		code_v4_("return isInfinite(1 / 0)").equals("true");
//
//		section("Number.isNaN");
//		code_v4_("return isNaN(0)").equals("false");
//		code_v4_("return isNaN(12)").equals("false");
//		code_v4_("return isNaN(42143.344324)").equals("false");
//		code_v4_("return isNaN(0 / 0)").equals("true");
//		code_v4_("return isNaN(NaN)").equals("true");
//
//		section("Number.isPermutation");
//		code_v4_("return isPermutation(0, 0)").equals("true");
//		code_v4_("return isPermutation(1, 0)").equals("false");
//		code_v4_("return isPermutation(12345678, 51762384)").equals("true");
//		code_v4_("return isPermutation(11112222, 22221111)").equals("true");
//		code_v4_("return isPermutation(123456, 12345678)").equals("false");
//		
//
//
//		section("Operator ==");
//		code_v4_("return null == null").equals("true");
//
//		code_v4_("return false == false").equals("true");
//		code_v4_("return true == true").equals("true");
//		code_v4_("return false == true").equals("false");
//		code_v4_("return true == false").equals("false");
//		code_v1_3("return true == 'true'").equals("true");
//		code_v4_("return true == 'true'").equals("false");
//		code_v1_3("return false == 'false'").equals("true");
//		code_v4_("return false == 'false'").equals("false");
//		code_v4_("return true == 'false'").equals("false");
//		code_v4_("return false == 'true'").equals("false");
//		code_v1_3("return false == []").equals("true");
//		code_v4_("return false == []").equals("false");
//		code_v1_3("return false == 0").equals("true");
//		code_v4_("return false == 0").equals("false");
//		code_v1_3("return true == 1").equals("true");
//		code_v4_("return true == 1").equals("false");
//		code_v1_3("return false != 0").equals("false");
//		code_v4_("return false != 0").equals("true");
//		code_v1_3("return true != 1").equals("false");
//		code_v4_("return true != 1").equals("true");
//		code_v1_3("return false == ''").equals("true");
//		code_v4_("return false == ''").equals("false");
//		code_v1_3("return false == '0'").equals("true");
//		code_v4_("return false == '0'").equals("false");
//		code_v1_3("return false == []").equals("true");
//		code_v4_("return false == []").equals("false");
//		code_v1_3("return false == [0]").equals("true");
//		code_v4_("return false == [0]").equals("false");
//		code_v1_3("return true == 12").equals("true");
//		code_v4_("return true == 12").equals("false");
//		code_v1_3("return true == '1'").equals("true");
//		code_v4_("return true == '1'").equals("false");
//		code_v1_3("return true == '12'").equals("true");
//		code_v4_("return true == '12'").equals("false");
//		code_v1_3("return true == 'lama'").equals("true");
//		code_v4_("return true == 'lama'").equals("false");
//		code_v1_3("return true == [1]").equals("true");
//		code_v4_("return true == [1]").equals("false");
//		code_v1_3("return true == [12]").equals("true");
//		code_v4_("return true == [12]").equals("false");
//		code_v1_3("return true == [1, 2, 3]").equals("true");
//		code_v4_("return true == [1, 2, 3]").equals("false");
//
//		code_v1_3("return 0 == false").equals("true");
//		code_v4_("return 0 == false").equals("false");
//		code_v4_("return 0 == 0").equals("true");
//		code_v1_3("return 0 == ''").equals("true");
//		code_v4_("return 0 == ''").equals("false");
//		code_v1_3("return 0 == '0'").equals("true");
//		code_v4_("return 0 == '0'").equals("false");
//		code_v1_3("return 0 == 'false'").equals("true");
//		code_v4_("return 0 == 'false'").equals("false");
//		code_v1_3("return 0 == []").equals("true");
//		code_v4_("return 0 == []").equals("false");
//		code_v1_3("return 0 == [0]").equals("true");
//		code_v4_("return 0 == [0]").equals("false");
//		code_v4_("return 0 != null").equals("true");
//
//		code_v1_3("return 1 == true").equals("true");
//		code_v4_("return 1 == true").equals("false");
//		code_v1_3("return 1 == '1'").equals("true");
//		code_v4_("return 1 == '1'").equals("false");
//		code_v1_3("return 1 == 'true'").equals("true");
//		code_v4_("return 1 == 'true'").equals("false");
//		code_v4_("return 1 == 'lama'").equals("false");
//		code_v1_3("return 1 == [1]").equals("true");
//		code_v4_("return 1 == [1]").equals("false");
//		code_v4_("return 1 == 2").equals("false");
//
//		code_v1_3("return 12 == true").equals("true");
//		code_v4_("return 12 == true").equals("false");
//		code_v4_("return -1 == -5").equals("false");
//		code_v4_("return 50 == 50").equals("true");
//		code_v4_("return 5 == 5").equals("true");
//		code_v4_("return 45 == 5").equals("false");
//		code_v1_3("return 10 == '10'").equals("true");
//		code_v4_("return 10 == '10'").equals("false");
//		code_v4_("return 10 == '15'").equals("false");
//		code_v4_("return 10 == '15'").equals("false");
//		code_v1_3("return 10.8 == '10.8'").equals("true");
//		code_v4_("return 10.8 == '10.8'").equals("false");
//		code_v4_("return 10.8 == '10.87'").equals("false");
//		code_v1_3("return 12 == 'true'").equals("true");
//		code_v4_("return 12 == 'true'").equals("false");
//		code_v4_("return 2 == 'false'").equals("false");
//		code_v1_3("return 12 == [12]").equals("true");
//		code_v4_("return 12 == [12]").equals("false");
//
//		code_v4_("return 'Chaine1' == 'Chaine1'").equals("true");
//		code_v4_("return 'Chaine1' == 'Chaine2'").equals("false");
//		code_v1_3("return '1' == 1").equals("true");
//		code_v4_("return '1' == 1").equals("false");
//		code_v1_3("return '0' == 0").equals("true");
//		code_v4_("return '0' == 0").equals("false");
//		code_v1_3("return '10' == 10").equals("true");
//		code_v4_("return '10' == 10").equals("false");
//		code_v4_("return '15' == 10").equals("false");
//
//		code_v4_("return [] == []").equals("true");
//		code_v4_("return [0] == [0]").equals("true");
//		code_v4_("return [0, 1] == [0, 1]").equals("true");
//		code_v4_("return [0, 1] == [0]").equals("false");
//		code_v4_("return ['Chaine1'] == ['Chaine2']").equals("false");
//		code_v4_("return ['Chaine1'] == ['Chaine1']").equals("true");
//
//		code_v4_("return function() {} == function() {}").equals("false");
//		code_v4_("return endsWith == function() {}").equals("false");
//		code_v4_("return endsWith == endsWith").equals("true");
//
//		String[] values1 = new String[] { "false", "true", "0", "1", "12", "''", "'0'", "'1'", "'12'", "'lama'", "'true'", "'false'",
//			"[]", "[0]", "[1]", "[12]", "[1,2,3]", "null" };
//		String[] equalEqual = new String[] {
//			"X X  XX    XXX    ", // false
//			" X XX  XXXX   XXX ", // true
//			"X X  XX    XXX    ", // 0
//			" X X   X  X   X   ", // 1
//			" X  X   X X    X  ", // 12
//			"X X  X      XX    ", // " "
//			"X X   X      X    ", // "0"
//			" X X   X      X   ", // "1"
//			" X  X   X      X  ", // "12"
//			" X       X        ", // "lama"
//			" X XX     X   XXX ", // "true"
//			"X X        XXX    ", // "false"
//			"X X  X     XX     ", // []
//			"X X  XX    X X    ", // [0]
//			" X X   X  X   X   ", // [1]
//			" X  X   X X    X  ", // [12]
//			" X        X     X ", // [1,2,3]
//			"                 X", // null
//		};
//
//		for (int i = 0; i < values1.length; i++) {
//			for (int j = 0; j < values1.length; j++) {
//				code_v1_3("return " + values1[i] + " == " + values1[j]).equals(String.valueOf(equalEqual[i].charAt(j) == 'X'));
//				code_v4_("return " + values1[i] + " == " + values1[j]).equals(String.valueOf(i == j));
//			}
//		}
//
//		section("Other operators");
//		code_v4_("var sum = 1, ops = 10 return sum < ops * 0.95 || sum > ops").equals("true");
//		code_v4_("var sum = 9.8, ops = 10 return sum < ops * 0.95 || sum > ops").equals("false");
//		code_v4_("var sum = 98 var ops = 100 return sum < ops * 0.95 || sum > ops").equals("false");
//		code_v4_("var sum = 98 var ops = 100 if (sum < ops * 0.95 || sum > ops) {}").equals("null");
//		code_v4_("var sum = 1 var ops = 10 if (sum < ops * 0.95 || sum > ops) {} return null").equals("null");
//		code_v4_("var a = [] if (a != []) {}").equals("null");
//		code_v1_3("return !null == 50").equals("true");
//		code_v4_("return !null == 50").equals("false");
//
//		section("Operator ===");
//		Object[] values = new Object[] { "0", "1",
//			"12", "13", "false",
//			"true", "null", "'true'",
//			"'false'", "'12'",
//			"'lama'",
//			"[]", "['12']" };
//
//		for (int i = 0; i < values.length; i++) {
//			for (int j = 0; j < values.length; j++) {
//				code_v4_("return " + values[i] + " === " + values[j]).equals(String.valueOf(i == j));
//			}
//		}
//		code_v4_("return 1 === 1.0").equals("true");
//		code_v4_("return 12 === 12.0").equals("true");
//		code_v4_("return null == [null]").equals("false");
//		code_v4_("return null != [null]").equals("true");
//		code_v4_("return [null] == null").equals("true"); // Bug in LS1.0
//		code_v4_("return [null] == null").equals("false"); // Fixed in 1.1
//		code_v4_("return [null] != null").equals("false"); // Bug in LS1.0
//		code_v4_("return [null] != null").equals("true"); // Fixed in 1.1
//
//		code_v4_("var a = 1; var result = -10 + (1- (a-1)); return result").equals("-9");
//		code_v4_("var a = 1; var result = 0; result = -10 + (1- (a-1)); return result").equals("-9");
//
//		code_v4_("return null < 3").equals("true");
//		code_v4_("var a = null return a < 3").equals("true");
//		code_v4_("return true < 10").equals("true");
//		code_v4_("return false < 10").equals("true");
//		code_v4_("return 10 < true").equals("false");
//		code_v4_("return 10 < false").equals("false");
//		code_v4_("return 10 > true").equals("true");
//		code_v4_("return 10 > false").equals("true");
//		code_v4_("return true > 10").equals("false");
//		code_v4_("return false > 10").equals("false");
//
//		code_v4_("var a = 20 if (15 > a > 11) { return true } return false").equals("false");
//		code_v4_("return 15 > 14 > 11 and 150 < 200 < 250").equals("false");
//		code_v4_("return 15 > 10 > 11 and 150 < 200 < 250").equals("false");
//		code_v4_("return 15 > 14 > 11 and 150 < 100 < 250").equals("false");
//		code_v4_("return 15 > 10 > 11 and 150 < 100 < 250").equals("false");
//
//		section("Operator +");
//		code_v4_("return false + 1").equals("1");
//		code_v4_("return 1 + false").equals("1");
//		code_v4_("return true + 1").equals("2");
//		code_v4_("return 1 + true").equals("2");
//		code_v4_("return true + null").equals("1");
//		code_v4_("return null + true").equals("1");
//		code_v4_("return false + null").equals("0");
//		code_v4_("return null + false").equals("0");
//
//		section("Assignment to itself");
//		// TODO
//		// code_v4_("var x = 2 x = x").warning(Error.ASSIGN_SAME_VARIABLE);
//		// code_v4_("class A { x constructor(z) { x = x } }").warning(Error.ASSIGN_SAME_VARIABLE);
//		// code_v4_("class A { x constructor(z) { this.x = x } }").warning(Error.ASSIGN_SAME_VARIABLE);
//		// code_v4_("class A { x constructor(z) { this.x = this.x } }").warning(Error.ASSIGN_SAME_VARIABLE);
//		// code_v4_("class A { x constructor(z) { x = this.x } }").warning(Error.ASSIGN_SAME_VARIABLE);
//		// code_v4_("class A { static x constructor(z) { x = x } }").warning(Error.ASSIGN_SAME_VARIABLE);
//		// code_v4_("class A { static x constructor(z) { class.x = x } }").warning(Error.ASSIGN_SAME_VARIABLE);
//		// code_v4_("class A { static x constructor(z) { class.x = class.x } }").warning(Error.ASSIGN_SAME_VARIABLE);
//		// code_v4_("class A { static x constructor(z) { x = class.x } }").warning(Error.ASSIGN_SAME_VARIABLE);
//
//		section("Comparison always false");
//		code_v4_("5.5 == true").warning(Error.COMPARISON_ALWAYS_FALSE);
//		code_v4_("count([]) == 'hello'").warning(Error.COMPARISON_ALWAYS_FALSE);
//		code_v4_("[:] == {}").warning(Error.COMPARISON_ALWAYS_FALSE);
//		code_v4_("(function() {}) == null").warning(Error.COMPARISON_ALWAYS_FALSE);
//		code_v4_("Array == 12").warning(Error.COMPARISON_ALWAYS_FALSE);
//
//		section("Comparison always true");
//		code_v4_("5.5 != true").warning(Error.COMPARISON_ALWAYS_TRUE);
//		code_v4_("count([]) != 'hello'").warning(Error.COMPARISON_ALWAYS_TRUE);
//		code_v4_("[:] != {}").warning(Error.COMPARISON_ALWAYS_TRUE);
//		code_v4_("(function() {}) != null").warning(Error.COMPARISON_ALWAYS_TRUE);
//		code_v4_("Array != 12").warning(Error.COMPARISON_ALWAYS_TRUE);
//
//		section("Unknown operator");
//		code_v4_("'salut' - 2").warning(Error.UNKNOWN_OPERATOR);
//		code_v4_("2 / [1, 2, 3]").warning(Error.UNKNOWN_OPERATOR);
//		code_v4_("{} % 5").warning(Error.UNKNOWN_OPERATOR);
//
//		section("Assignment operators");
//
//		Object[] values2 = new Object[] {
//			"null", "true", "false", "12", "5.678", "false", "true", "'lama'", "[1, 2, 3, 4, 5]"
//		};
//		Object[] operators = new Object[] {
//			"+", "-", "*", "/", "%", "&", "^", "|", "<<", ">>", ">>>", "**",
//		};
//		Object[] assignmentOperators = new Object[] {
//			"+=", "-=", "*=", "/=", "%=", "&=", "^=", "|=", "<<=", ">>=", ">>>=", "**=",
//		};
//		String[] actualResults = new String[] {
//			"0", "0", "0", "null", "null", "0", "0", "0", "0", "0", "0", "1", "0", "0", "0", "null", "null", "0", "1", "0", "0", "0", "0", "1", "1", "-1", "0", "0", "0", "0", "1", "1", "0", "0", "0", "0", "1", "-1", "0", "0", "0", "0", "0", "1", "0", "0", "0", "0", "0", "0", "0", "null", "null", "0", "0", "0", "0", "0", "0", "1", "0", "0", "0", "null", "null", "0", "1", "0", "0", "0", "0", "1", "12", "-12", "0", "0", "0", "0", "12", "12", "0", "0", "0", "0", "12", "-12", "0", "0", "0", "0", "0", "12", "0", "0", "0", "0", "5,678", "-5,678", "0", "0", "0", "0", "5", "5", "0", "0", "0", "0", "5,678", "-5,678", "0", "0", "0", "0", "0", "5", "0", "0", "0", "0", "0", "0", "0", "null", "null", "0", "0", "0", "0", "0", "0", "1", "0", "0", "0", "null", "null", "0", "1", "0", "0", "0", "0", "1", "1", "-1", "0", "0", "0", "0", "1", "1", "0", "0", "0", "0", "1", "-1", "0", "0", "0", "0", "0", "1", "0", "0", "0", "0", "\"nulllama\"", "-4", "0", "0", "0", "0", "4", "4", "0", "0", "0", "0", "\"nulllama\"", "-4", "0", "0", "0", "0", "0", "4", "0", "0", "0", "0", "[null, 1, 2, 3, 4, 5]", "-5", "0", "0", "0", "0", "5", "5", "0", "0", "0", "0", "[null, 1, 2, 3, 4, 5]", "-5", "0", "0", "0", "0", "0", "5", "0", "0", "0", "0", "1", "1", "0", "null", "null", "0", "1", "1", "1", "1", "1", "1", "1", "1", "0", "null", "null", "0", "1", "1", "1", "1", "1", "1", "2", "0", "1", "1", "0", "1", "0", "1", "2", "0", "0", "1", "2", "0", "1", "1", "0", "1", "1", "1", "2", "0", "0", "1", "1", "1", "0", "null", "null", "0", "1", "1", "1", "1", "1", "1", "1", "1", "0", "null", "null", "0", "1", "1", "1", "1", "1", "1", "13", "-11", "12", "0,083", "1", "0", "13", "13", "4096", "0", "0", "1", "13", "-11", "12", "0,083", "1", "0", "1", "13", "4096", "0", "0", "1", "6,678", "-4,678", "5,678", "0,176", "1", "1", "4", "5", "32", "0", "0", "1", "6,678", "-4,678", "5,678", "0,176", "1", "1", "1", "5", "32", "0", "0", "1", "1", "1", "0", "null", "null", "0", "1", "1", "1", "1", "1", "1", "1", "1", "0", "null", "null", "0", "1", "1", "1", "1", "1", "1", "2", "0", "1", "1", "0", "1", "0", "1", "2", "0", "0", "1", "2", "0", "1", "1", "0", "1", "1", "1", "2", "0", "0", "1", "\"truelama\"", "-3", "4", "0,25", "1", "0", "5", "5", "16", "0", "0", "1", "\"truelama\"", "-3", "4", "0,25", "1", "0", "1", "5", "16", "0", "0", "1", "[true, 1, 2, 3, 4, 5]", "-4", "5", "0,2", "1", "1", "4", "5", "32", "0", "0", "1", "[true, 1, 2, 3, 4, 5]", "-4", "5", "0,2", "1", "1", "1", "5", "32", "0", "0", "1", "0", "0", "0", "null", "null", "0", "0", "0", "0", "0", "0", "1", "0", "0", "0", "null", "null", "0", "1", "0", "0", "0", "0", "1", "1", "-1", "0", "0", "0", "0", "1", "1", "0", "0", "0", "0", "1", "-1", "0", "0", "0", "0", "0", "1", "0", "0", "0", "0", "0", "0", "0", "null", "null", "0", "0", "0", "0", "0", "0", "1", "0", "0", "0", "null", "null", "0", "1", "0", "0", "0", "0", "1", "12", "-12", "0", "0", "0", "0", "12", "12", "0", "0", "0", "0", "12", "-12", "0", "0", "0", "0", "0", "12", "0", "0", "0", "0", "5,678", "-5,678", "0", "0", "0", "0", "5", "5", "0", "0", "0", "0", "5,678", "-5,678", "0", "0", "0", "0", "0", "5", "0", "0", "0", "0", "0", "0", "0", "null", "null", "0", "0", "0", "0", "0", "0", "1", "0", "0", "0", "null", "null", "0", "1", "0", "0", "0", "0", "1", "1", "-1", "0", "0", "0", "0", "1", "1", "0", "0", "0", "0", "1", "-1", "0", "0", "0", "0", "0", "1", "0", "0", "0", "0", "\"falselama\"", "-4", "0", "0", "0", "0", "4", "4", "0", "0", "0", "0", "\"falselama\"", "-4", "0", "0", "0", "0", "0", "4", "0", "0", "0", "0", "[false, 1, 2, 3, 4, 5]", "-5", "0", "0", "0", "0", "5", "5", "0", "0", "0", "0", "[false, 1, 2, 3, 4, 5]", "-5", "0", "0", "0", "0", "0", "5", "0", "0", "0", "0", "12", "12", "0", "null", "null", "0", "12", "12", "12", "12", "12", "1", "12", "12", "0", "null", "null", "0", "1", "12", "12", "12", "12", "1", "13", "11", "12", "12", "0", "0", "13", "13", "24", "6", "6", "12", "13", "11", "12", "12", "0", "0", "12", "13", "24", "6", "6", "12", "12", "12", "0", "null", "null", "0", "12", "12", "12", "12", "12", "1", "12", "12", "0", "null", "null", "0", "1", "12", "12", "12", "12", "1", "24", "0", "144", "1", "0", "12", "0", "12", "49152", "0", "0", "8916100448256", "24", "0", "144", "1", "0", "12", "8916100448256", "12", "49152", "0", "0", "8916100448256", "17,678", "6,322", "68,136", "2,113", "0,644", "4", "9", "13", "384", "0", "0", "1 341 501,353", "17,678", "6,322", "68,136", "2,113", "0,644", "4", "1 341 501,353", "13", "384", "0", "0", "1 341 501,353", "12", "12", "0", "null", "null", "0", "12", "12", "12", "12", "12", "1", "12", "12", "0", "null", "null", "0", "1", "12", "12", "12", "12", "1", "13", "11", "12", "12", "0", "0", "13", "13", "24", "6", "6", "12", "13", "11", "12", "12", "0", "0", "12", "13", "24", "6", "6", "12", "\"12lama\"", "8", "48", "3", "0", "4", "8", "12", "192", "0", "0", "20736", "\"12lama\"", "8", "48", "3", "0", "4", "20736", "12", "192", "0", "0", "20736", "[12, 1, 2, 3, 4, 5]", "7", "60", "2,4", "2", "4", "9", "13", "384", "0", "0", "248832", "[12, 1, 2, 3, 4, 5]", "7", "60", "2,4", "2", "4", "248832", "13", "384", "0", "0", "248832", "5,678", "5,678", "0", "null", "NaN", "0", "5", "5", "5", "5", "5", "1", "5,678", "5,678", "0", "null", "NaN", "0", "1", "5", "5", "5", "5", "1", "6,678", "4,678", "5,678", "5,678", "0,678", "1", "4", "5", "10", "2", "2", "5,678", "6,678", "4,678", "5,678", "5,678", "0,678", "1", "5,678", "5", "10", "2", "2", "5,678", "5,678", "5,678", "0", "null", "NaN", "0", "5", "5", "5", "5", "5", "1", "5,678", "5,678", "0", "null", "NaN", "0", "1", "5", "5", "5", "5", "1", "17,678", "-6,322", "68,136", "0,473", "5,678", "4", "9", "13", "20480", "0", "0", "1 122 909 247,194", "17,678", "-6,322", "68,136", "0,473", "5,678", "4", "1 122 909 247,194", "13", "20480", "0", "0", "1 122 909 247,194", "11,356", "0", "32,24", "1", "0", "5", "0", "5", "160", "0", "0", "19 156,732", "11,356", "0", "32,24", "1", "0", "5", "19 156,732", "5", "160", "0", "0", "19 156,732", "5,678", "5,678", "0", "null", "NaN", "0", "5", "5", "5", "5", "5", "1", "5,678", "5,678", "0", "null", "NaN", "0", "1", "5", "5", "5", "5", "1", "6,678", "4,678", "5,678", "5,678", "0,678", "1", "4", "5", "10", "2", "2", "5,678", "6,678", "4,678", "5,678", "5,678", "0,678", "1", "5,678", "5", "10", "2", "2", "5,678", "\"5,678lama\"", "1,678", "22,712", "1,419", "1,678", "4", "1", "5", "80", "0", "0", "1 039,397", "\"5,678lama\"", "1,678", "22,712", "1,419", "1,678", "4", "1 039,397", "5", "80", "0", "0", "1 039,397", "[5,678, 1, 2, 3, 4, 5]", "0,678", "28,39", "1,136", "0,678", "5", "0", "5", "160", "0", "0", "5 901,697", "[5,678, 1, 2, 3, 4, 5]", "0,678", "28,39", "1,136", "0,678", "5", "5 901,697", "5", "160", "0", "0", "5 901,697", "0", "0", "0", "null", "null", "0", "0", "0", "0", "0", "0", "1", "0", "0", "0", "null", "null", "0", "1", "0", "0", "0", "0", "1", "1", "-1", "0", "0", "0", "0", "1", "1", "0", "0", "0", "0", "1", "-1", "0", "0", "0", "0", "0", "1", "0", "0", "0", "0", "0", "0", "0", "null", "null", "0", "0", "0", "0", "0", "0", "1", "0", "0", "0", "null", "null", "0", "1", "0", "0", "0", "0", "1", "12", "-12", "0", "0", "0", "0", "12", "12", "0", "0", "0", "0", "12", "-12", "0", "0", "0", "0", "0", "12", "0", "0", "0", "0", "5,678", "-5,678", "0", "0", "0", "0", "5", "5", "0", "0", "0", "0", "5,678", "-5,678", "0", "0", "0", "0", "0", "5", "0", "0", "0", "0", "0", "0", "0", "null", "null", "0", "0", "0", "0", "0", "0", "1", "0", "0", "0", "null", "null", "0", "1", "0", "0", "0", "0", "1", "1", "-1", "0", "0", "0", "0", "1", "1", "0", "0", "0", "0", "1", "-1", "0", "0", "0", "0", "0", "1", "0", "0", "0", "0", "\"falselama\"", "-4", "0", "0", "0", "0", "4", "4", "0", "0", "0", "0", "\"falselama\"", "-4", "0", "0", "0", "0", "0", "4", "0", "0", "0", "0", "[false, 1, 2, 3, 4, 5]", "-5", "0", "0", "0", "0", "5", "5", "0", "0", "0", "0", "[false, 1, 2, 3, 4, 5]", "-5", "0", "0", "0", "0", "0", "5", "0", "0", "0", "0", "1", "1", "0", "null", "null", "0", "1", "1", "1", "1", "1", "1", "1", "1", "0", "null", "null", "0", "1", "1", "1", "1", "1", "1", "2", "0", "1", "1", "0", "1", "0", "1", "2", "0", "0", "1", "2", "0", "1", "1", "0", "1", "1", "1", "2", "0", "0", "1", "1", "1", "0", "null", "null", "0", "1", "1", "1", "1", "1", "1", "1", "1", "0", "null", "null", "0", "1", "1", "1", "1", "1", "1", "13", "-11", "12", "0,083", "1", "0", "13", "13", "4096", "0", "0", "1", "13", "-11", "12", "0,083", "1", "0", "1", "13", "4096", "0", "0", "1", "6,678", "-4,678", "5,678", "0,176", "1", "1", "4", "5", "32", "0", "0", "1", "6,678", "-4,678", "5,678", "0,176", "1", "1", "1", "5", "32", "0", "0", "1", "1", "1", "0", "null", "null", "0", "1", "1", "1", "1", "1", "1", "1", "1", "0", "null", "null", "0", "1", "1", "1", "1", "1", "1", "2", "0", "1", "1", "0", "1", "0", "1", "2", "0", "0", "1", "2", "0", "1", "1", "0", "1", "1", "1", "2", "0", "0", "1", "\"truelama\"", "-3", "4", "0,25", "1", "0", "5", "5", "16", "0", "0", "1", "\"truelama\"", "-3", "4", "0,25", "1", "0", "1", "5", "16", "0", "0", "1", "[true, 1, 2, 3, 4, 5]", "-4", "5", "0,2", "1", "1", "4", "5", "32", "0", "0", "1", "[true, 1, 2, 3, 4, 5]", "-4", "5", "0,2", "1", "1", "1", "5", "32", "0", "0", "1", "\"lamanull\"", "4", "0", "null", "null", "0", "4", "4", "4", "4", "4", "1", "\"lamanull\"", "4", "0", "null", "null", "0", "1", "4", "4", "4", "4", "1", "\"lamatrue\"", "3", "4", "4", "0", "0", "5", "5", "8", "2", "2", "4", "\"lamatrue\"", "3", "4", "4", "0", "0", "4", "5", "8", "2", "2", "4", "\"lamafalse\"", "4", "0", "null", "null", "0", "4", "4", "4", "4", "4", "1", "\"lamafalse\"", "4", "0", "null", "null", "0", "1", "4", "4", "4", "4", "1", "\"lama12\"", "-8", "48", "0,333", "4", "4", "8", "12", "16384", "0", "0", "16777216", "\"lama12\"", "-8", "48", "0,333", "4", "4", "16777216", "12", "16384", "0", "0", "16777216", "\"lama5,678\"", "-1,678", "22,712", "0,704", "4", "4", "1", "5", "128", "0", "0", "2 621,179", "\"lama5,678\"", "-1,678", "22,712", "0,704", "4", "4", "2 621,179", "5", "128", "0", "0", "2 621,179", "\"lamafalse\"", "4", "0", "null", "null", "0", "4", "4", "4", "4", "4", "1", "\"lamafalse\"", "4", "0", "null", "null", "0", "1", "4", "4", "4", "4", "1", "\"lamatrue\"", "3", "4", "4", "0", "0", "5", "5", "8", "2", "2", "4", "\"lamatrue\"", "3", "4", "4", "0", "0", "4", "5", "8", "2", "2", "4", "\"lamalama\"", "0", "16", "1", "0", "4", "0", "4", "64", "0", "0", "256", "\"lamalama\"", "0", "16", "1", "0", "4", "256", "4", "64", "0", "0", "256", "\"lama[1, 2, 3, 4, 5]\"", "-1", "20", "0,8", "4", "4", "1", "5", "128", "0", "0", "1024", "\"lama[1, 2, 3, 4, 5]\"", "-1", "20", "0,8", "4", "4", "1024", "5", "128", "0", "0", "1024", "[1, 2, 3, 4, 5, null]", "5", "0", "null", "null", "0", "5", "5", "5", "5", "5", "1", "[1, 2, 3, 4, 5, null]", "5", "0", "null", "null", "0", "1", "5", "5", "5", "5", "1", "[1, 2, 3, 4, 5, true]", "4", "5", "5", "0", "1", "4", "5", "10", "2", "2", "5", "[1, 2, 3, 4, 5, true]", "4", "5", "5", "0", "1", "5", "5", "10", "2", "2", "5", "[1, 2, 3, 4, 5, false]", "5", "0", "null", "null", "0", "5", "5", "5", "5", "5", "1", "[1, 2, 3, 4, 5, false]", "5", "0", "null", "null", "0", "1", "5", "5", "5", "5", "1", "[1, 2, 3, 4, 5, 12]", "-7", "60", "0,417", "5", "4", "9", "13", "20480", "0", "0", "244140625", "[1, 2, 3, 4, 5, 12]", "-7", "60", "0,417", "5", "4", "244140625", "13", "20480", "0", "0", "244140625", "[1, 2, 3, 4, 5, 5,678]", "-0,678", "28,39", "0,881", "5", "5", "0", "5", "160", "0", "0", "9 305,757", "[1, 2, 3, 4, 5, 5,678]", "-0,678", "28,39", "0,881", "5", "5", "9 305,757", "5", "160", "0", "0", "9 305,757", "[1, 2, 3, 4, 5, false]", "5", "0", "null", "null", "0", "5", "5", "5", "5", "5", "1", "[1, 2, 3, 4, 5, false]", "5", "0", "null", "null", "0", "1", "5", "5", "5", "5", "1", "[1, 2, 3, 4, 5, true]", "4", "5", "5", "0", "1", "4", "5", "10", "2", "2", "5", "[1, 2, 3, 4, 5, true]", "4", "5", "5", "0", "1", "5", "5", "10", "2", "2", "5", "\"[1, 2, 3, 4, 5]lama\"", "1", "20", "1,25", "1", "4", "1", "5", "80", "0", "0", "625", "\"[1, 2, 3, 4, 5]lama\"", "1", "20", "1,25", "1", "4", "625", "5", "80", "0", "0", "625", "[1, 2, 3, 4, 5, 1, 2, 3, 4, 5]", "0", "25", "1", "0", "5", "0", "5", "160", "0", "0", "3125", "[1, 2, 3, 4, 5, 1, 2, 3, 4, 5]", "0", "25", "1", "0", "5", "3125", "5", "160", "0", "0", "3125"
//		};
//		List<String> results = new ArrayList<String>();
//		int r = 0;
//		String result;
//		for (var value1 : values2) {
//			for (var value2 : values2) {
//				for (var operator : operators) {
//					String expected = actualResults[r++];
//					var c = code_v4_("var a = " + value1 + " return a " + operator + " " + value2);
//					if (expected.equals("error")) result = c.error(Error.INVALID_OPERATOR);
//					else result = c.equals(expected);
//					results.add("\"" + result + "\"");
//				}
//				for (var operator : assignmentOperators) {
//					String expected = actualResults[r++];
//					var c = code_v4_("var a = " + value1 + " a " + operator + " " + value2 + " return a");
//					if (expected.equals("error")) result = c.error(Error.INVALID_OPERATOR);
//					else result = c.equals(expected);
//					results.add("\"" + result + "\"");
//				}
//			}
//		}
//		System.out.println(results);
//	
//		header("Variables");
//		// code_v4_("var a").equals("(void)");
//		// code_v4_("var a = 2").equals("(void)");
//		code_v4_("var a = 2 return a").equals("2");
//		code_v4_("var a, b, c = 3 return c").equals("3");
//		code_v4_("var a = 1, b = 2, c = 3 return c").equals("3");
//		code_v4_("var a = 1, b = 2, c return c").equals("null");
//		// code_v4_("var a = 1, b, c = 3").equals("(void)");
//		// code_v4_("var a, b, c = 3").equals("(void)");
//		// code_v4_("var a, b, c").equals("(void)");
//		code_v4_("var a return a").equals("null");
//		code_v4_("var a a = 12 return a").equals("12");
//		code_v4_("var a = 5 a = 13 return a").equals("13");
//		code_v4_("var a = 1 var b = (a = 12) return b").equals("12");
//		// code_v4_("var s = 'hello'").equals("(void)");
//		code_v4_("var s = 'hello' return s").equals("\"hello\"");
//		// code_v4_("var état = 12 return état").equals("12");
//		// code_v4_("var 韭 = 'leek' return 韭").equals("'leek'");
//		// code_v4_("var ♫☯🐖👽 = 5 var 🐨 = 2 return ♫☯🐖👽 ** 🐨").equals("25");
//		code_v4_("var a = 2 return [a = 10]").equals("[10]");
//		code_v4_("var a = 2 return ['a', a = 10]").equals("[\"a\", 10]");
//
//		section("typeOf()");
//		// Test nombre
//		code_v4_("return typeOf(255)").equals(String.valueOf(LeekConstants.TYPE_NUMBER.getIntValue()));
//		code_v4_("return typeOf(255.8)").equals(String.valueOf(LeekConstants.TYPE_NUMBER.getIntValue()));
//		// Test string
//		code_v4_("return typeOf('coucou')").equals(String.valueOf(LeekConstants.TYPE_STRING.getIntValue()));
//		// Test boolean
//		code_v4_("return typeOf(false)").equals(String.valueOf(LeekConstants.TYPE_BOOLEAN.getIntValue()));
//		// Test array
//		code_v4_("return typeOf([1,false])").equals(String.valueOf(LeekConstants.TYPE_ARRAY.getIntValue()));
//		// Test fonction
//		code_v4_("return typeOf(function(){ return null; })").equals(String.valueOf(LeekConstants.TYPE_FUNCTION.getIntValue()));
//		// Test null
//		code_v4_("return typeOf(null)").equals(String.valueOf(LeekConstants.TYPE_NULL.getIntValue()));
//		// Test piège
//		code_v4_("return typeOf(function(){ return 4; }())").equals(String.valueOf(LeekConstants.TYPE_NUMBER.getIntValue()));
//		code_v4_("return typeOf(<1, 2, 3>)").equals(String.valueOf(LeekConstants.TYPE_SET.getIntValue()));
//		code_v4_("return typeOf([1..10])").equals(String.valueOf(LeekConstants.TYPE_INTERVAL.getIntValue()));
//
//		section("color()");
//		code_v4_("color(0, 0, 0)").error(Error.REMOVED_FUNCTION_REPLACEMENT);
//		code_v1_3("return color(255,0,255)").equals(String.valueOf(0xFF00FF));
//		code_v1_3("return color(255,255,0)").equals(String.valueOf(0xFFFF00));
//		code_v1_3("return color(0,255,255)").equals(String.valueOf(0x00FFFF));
//
//		section("getColor()");
//		code_v4_("return getColor(255,0,255)").equals(String.valueOf(0xFF00FF));
//		code_v4_("return getColor(255,255,0)").equals(String.valueOf(0xFFFF00));
//		code_v4_("return getColor(0,255,255)").equals(String.valueOf(0x00FFFF));
//
//		// Red
//		code_v4_("return getRed(" + 0xAE0000 + ")").equals("174");
//		// Green
//		code_v4_("return getGreen(" + 0xAF00 + ")").equals("175");
//		// Blue
//		code_v4_("return getBlue(" + 0xAD + ")").equals("173");
//
//		section("Variables with keywords");
//		String[] reservedWordsV1 = new String[] { "as", "continue", "break", "do", "else", "false", "for", "function", "global", "if", "in", "not", "null", "return", "true", "var", "while", "and", "or", "xor" };
//		String[] reservedWordsV2 = new String[] { "class", "constructor", "extends", "instanceof", "new", "private", "protected", "public", "static", "super", "this" };
//		String[] reservedWordsV3 = new String[] { "abstract", "await", "byte", "case", "catch", "char", "const", "default", "double", "enum", "eval", "export", "final", "finally", "float", "goto", "implements", "import", "int", "interface", "let", "long", "native", "package", "short", "switch", "synchronized", "throw", "throws", "transient", "try", "typeof", "void", "volatile", "with", "yield" };
//		for (var word : reservedWordsV1) {
//			code_v4_("var " + word + " = 2;").error(Error.VAR_NAME_EXPECTED);
//		}
//		for (var word : reservedWordsV2) {
//			code_v4_("var " + word + " = 2;").error(Error.NONE);
//			code_v4_("var " + word + " = 2;").error(Error.VAR_NAME_EXPECTED);
//		}
//		for (var word : reservedWordsV3) {
//			code_v4_("var " + word + " = 2;").error(Error.NONE);
//			code_v4_("var " + word + " = 2;").error(Error.VAR_NAME_EXPECTED);
//		}
//
//		section("Globals with keywords");
//		code_v4_("global break = 2").error(Error.VAR_NAME_EXPECTED_AFTER_GLOBAL);
//		for (var word : LexicalParser.reservedWords) {
//			code_v4_("global " + word + " = 2;").error(Error.VAR_NAME_EXPECTED_AFTER_GLOBAL);
//		}
//
//		code_v4_("var new = 12 var b = @new return b").equals("12");
//		code_v4_("global final = 2").error(Error.NONE);
//
//		section("Type changes");
//		code_v4_("var a return a = 12").equals("12");
//		code_v4_("var a a = 12 return a").equals("12");
//		code_v4_("var a return a = 12.5").equals("12,5");
//		code_v4_("var a return a = 12.5").equals("12.5");
//		code_v4_("var a a = 12.5 return a").equals("12,5");
//		code_v4_("var a a = 12.5 return a").equals("12.5");
//		code_v4_("var a return a = 'a'").equals("\"a\"");
//		code_v4_("var a a = 'a' return a").equals("\"a\"");
//		// code_v4_("var a return a = 12m").equals("12");
//		// code_v4_("var a a = 12m return a").equals("12");
//		code_v4_("var a = 2 return a = 'hello'").equals("\"hello\"");
//		code_strict("var a = 2 return a = 'hello'").error(Error.ASSIGNMENT_INCOMPATIBLE_TYPE);
//		code_strict("any a = 2 return a = 'hello'").equals("\"hello\"");
//		code_v4_("var a = 'hello' return a = 2").equals("2");
//		code_strict("var a = 'hello' return a = 2").error(Error.ASSIGNMENT_INCOMPATIBLE_TYPE);
//		code_strict("any a = 'hello' return a = 2").equals("2");
//		code_v4_("var a = 2 a = 'hello' return a").equals("\"hello\"");
//		code_strict("var a = 2 a = 'hello' return a").error(Error.ASSIGNMENT_INCOMPATIBLE_TYPE);
//		code_strict("any a = 2 a = 'hello' return a").equals("\"hello\"");
//		code_v4_("var a = 2 a = [1, 2] return a").equals("[1, 2]");
//		code_strict("var a = 2 a = [1, 2] return a").error(Error.ASSIGNMENT_INCOMPATIBLE_TYPE);
//		code_strict("any a = 2 a = [1, 2] return a").equals("[1, 2]");
//		code_v4_("var a = 5.5 a = {} return a").equals("{}");
//		code_strict_v2_("var a = 5.5 a = {} return a").error(Error.ASSIGNMENT_INCOMPATIBLE_TYPE);
//		code_strict_v2_("any a = 5.5 a = {} return a").equals("{}");
//		// code_v4_("var a = [5, 7] a = 7 System.print(a)").output("7\n");
//		// code_v4_("var a = 7 a = [5, 12] a").equals("[5, 12]");
//		// code_v4_("var a = 7 System.print(a) a = <5, 12> System.print(a)").output("7\n<5, 12>\n");
//		// code_v4_("var a = 5 a = 200l").equals("200");
//		// code_v4_("var a = 5 a = 200l a").equals("200");
//		// code_v4_("var a = 200l a = 5").equals("5");
//		// code_v4_("var a = 200l a = 5 a").equals("5");
//		// code_v4_("var a = 5.5 a = 200l a").equals("200");
//		code_v4_("var a = 5.5 return a = 2").equals("2");
//		code_strict_v1("var a = 5.5 return a = 2").equals("2");
//		code_strict_v2_("var a = 5.5 return a = 2").equals("2.0");
		// code_v4_("var a = 5.5 a = 1000m").equals("1000");
		// code_v4_("var a = 5.5 a = 2m ** 100").equals("1267650600228229401496703205376");
		// code_v4_("var a = 2m return a = 5").equals("5");
		// code_v4_("var a = 5.5 System.print(a) a = 2 System.print(a) a = 200l System.print(a) a = 1000m System.print(a) a = 'hello' System.print(a)").output("5.5\n2\n200\n1000\nhello\n");
		// code_v4_("var a = [] a = 5m").equals("5");

		// section("Value.copy()");
		// code_v4_("2.copy()").equals("2");
		// code_v4_("2.5.copy()").equals("2.5");
		// code_v4_("12l.copy()").equals("12");
		// code_v4_("100m").equals("100");
		// code_v4_("'abc'.copy()").equals("'abc'");
		// code_v4_("[].copy()").equals("[]");
		// code_v4_("[1, 2, 3].copy()").equals("[1, 2, 3]");
		// code_v4_("[1.5, 2.5, 3.5].copy()").equals("[1.5, 2.5, 3.5]");
		// code_v4_("[1..1000].copy()").equals("[1..1000]");
		// code_v4_("[:].copy()").equals("[:]");
		// code_v4_("{}.copy()").equals("{}");
		// code_v4_("(x -> x).copy()").equals("<function>");
		// code_v4_("Number.copy()").equals("<class Number>");

//		section("Assignments");
//		// code_v4_("var b = 0 { b = 12 } return b").equals("12");
//		// code_v4_("var i = 12 { i = 'salut' } return i").equals("salut");
//		// code_v4_("var i = 12 {{{ i = 'salut' }}} return i").equals("salut");
//		code_v4_("var b = 5 if (1) { b = 'salut' } return b").equals("\"salut\"");
//		code_strict("var b = 5 if (1) { b = 'salut' } return b").error(Error.ASSIGNMENT_INCOMPATIBLE_TYPE);
//		code_strict("any b = 5 if (1) { b = 'salut' } return b").equals("\"salut\"");
//		code_v4_("var b = 5 if (0) { b = 'salut' } return b").equals("5");
//		code_strict("var b = 5 if (0) { b = 'salut' } return b").error(Error.ASSIGNMENT_INCOMPATIBLE_TYPE);
//		code_strict("any b = 5 if (0) { b = 'salut' } return b").equals("5");
//		code_v4_("var a = 12 if (1) { a = 5 a++ } else { a = 3 } return a").equals("6");
//		code_v4_("var a = 12 if (0) { a = 5 a++ } else { a = 5.5 } return a").equals("5,5");
//		code_v4_("var a = 12 if (0) { a = 5 a++ } else { a = 5.5 } return a").equals("5.5");
//		code_strict_v2_("real a = 12 if (0) { a = 5 a++ } else { a = 5.5 } return a").equals("5.5");
//		// code_v4_("var a = 12 if (0) { a = 5 a++ } else { a = 7l } return a").equals("7");
//		code_v4_("var b = 5 if (1) {} else { b = 'salut' } return b").equals("5");
//		code_strict("any b = 5 if (1) {} else { b = 'salut' } return b").equals("5");
//		code_v4_("var b = 5 if (0) {} else { b = 'salut' } return b").equals("\"salut\"");
//		code_strict("any b = 5 if (0) {} else { b = 'salut' } return b").equals("\"salut\"");
//		code_v4_("var x = 5 if (true) if (true) x = 'a' return x").equals("\"a\"");
//		code_strict("any x = 5 if (true) if (true) x = 'a' return x").equals("\"a\"");
//		code_v4_("var x = 5 if (true) if (true) if (true) if (true) if (true) x = 'a' return x").equals("\"a\"");
//		code_strict("any x = 5 if (true) if (true) if (true) if (true) if (true) x = 'a' return x").equals("\"a\"");
//		// code_v4_("var x = 2 var y = { if (x == 0) { return 'error' } 7 * x } return y").equals("14");
//		code_v4_("var y if (false) { if (true) {;} else { y = 2 } } else { y = 5 } return y").equals("5");
//		code_v4_("PI = PI + 12; return PI").error(Error.CANT_ASSIGN_VALUE);
//		code_v4_("var grow = []; var n = []; grow = @n; return grow").equals("[]");
//		code_v4_("var PI = 3 return PI").equals("3");
//		code_v4_("var a = 2 var b = 5 var c = 7; a = b = c return [a, b, c]").equals("[7, 7, 7]");
//
//		section("Assignments with +=");
//		code_v4_("var a = 10 a += 0.5 return a").equals("10,5");
//		code_v4_("var a = 10 a += 0.5 return a").equals("10.5");
//		code_strict_v2_("var a = 10 a += 0.5 return a").equals("10");
//		code_strict_v2_("var a = 10 a += 4.5 return a").equals("14");
//
//		section("File");
//		file("ai/code/trivial.leek").equals("2");
//
//		section("number()");
//		code_v4_("return number('12')").equals("12");
//		code_v4_("return number('12.55')").equals("12,55");
//		code_v4_("return number('12.55')").equals("12.55");
//
//		section("Variables with accents");
//		code_v4_("var état = 12 return état").equals("12");
//		code_v4_("var ÀÖØÝàöøýÿ = 'yo' return ÀÖØÝàöøýÿ").equals("\"yo\"");
//		code_v4_("var nœud = [] return nœud").equals("[]");
//
//		section("Variables and types");
//		DISABLED_code_v4_("real a = 1.1 integer b = a return b").equals("1");
//		code_v4_("real a = 1.1 integer b = a return b").equals("1");
//		DISABLED_code_v4_("real a = 1.9 integer b = a return b").equals("1");
//		code_v4_("real a = 1.9 integer b = a return b").equals("1");
//		DISABLED_code_v4_("integer|real a = 1.999; integer b = a; return b").equals("1");
//		code_v4_("integer|real a = 1.999; integer b = a; return b").equals("1");
//	
	}
}
