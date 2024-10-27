package leekscript.runner.values;

import java.math.BigInteger;
import java.util.Set;

import leekscript.runner.AI;
import leekscript.runner.LeekRunException;

/**
 * Represents an integer number with size limited only by memory and operations
 * cost. Current implementation is a wrapper on BigInteger. It allows easy swap
 * for other versions. Untested mutable version to be considered :
 * https://github.com/bwakell/Huldra/blob/master/src/main/java/org/huldra/math/BigInt.java
 * 
 * @see BigInteger
 */
public class BigIntegerValue extends Number implements LeekValue {

	// TODO operations

	private BigInteger value;

	public BigIntegerValue(String val, int radix) {
		value = new BigInteger(val, radix);
	}

	public BigIntegerValue(String val) {
		value = new BigInteger(val);
	}
	
	public BigIntegerValue(double val) {
		value = BigInteger.valueOf((long) val);
	}
	
	public BigIntegerValue(long val) {
		value = BigInteger.valueOf(val);
	}

	public BigIntegerValue(BigInteger val) {
		value = val;
	}

	public BigIntegerValue add(BigIntegerValue val) {
		return new BigIntegerValue(value.add(val.value));
	}

	public BigIntegerValue subtract(BigIntegerValue val) {
		return new BigIntegerValue(value.subtract(val.value));
	}

	public BigIntegerValue multiply(BigIntegerValue val) {
		return new BigIntegerValue(value.multiply(val.value));
	}

	public BigIntegerValue divide(BigIntegerValue val) {
		return new BigIntegerValue(value.divide(val.value));
	}

	public BigIntegerValue pow(int exponent) {
		return new BigIntegerValue(value.pow(exponent));
	}

	public BigIntegerValue sqrt() {
		return new BigIntegerValue(value.sqrt());
	}

	public BigIntegerValue abs() {
		return new BigIntegerValue(value.abs());
	}

	public BigIntegerValue negate() {
		return new BigIntegerValue(value.negate());
	}

	public BigIntegerValue mod(BigIntegerValue m) {
		return new BigIntegerValue(value.mod(m.value));
	}

	public BigIntegerValue shiftLeft(int n) {
		return new BigIntegerValue(value.shiftLeft(n));
	}

	public BigIntegerValue shiftRight(int n) {
		return new BigIntegerValue(value.shiftRight(n));
	}

	public BigIntegerValue and(BigIntegerValue val) {
		return new BigIntegerValue(value.and(val.value));
	}

	public BigIntegerValue or(BigIntegerValue val) {
		return new BigIntegerValue(value.or(val.value));
	}

	public BigIntegerValue xor(BigIntegerValue val) {
		return new BigIntegerValue(value.xor(val.value));
	}

	public BigIntegerValue not() {
		return new BigIntegerValue(value.not());
	}

	public BigIntegerValue andNot(BigIntegerValue val) {
		return new BigIntegerValue(value.andNot(val.value));
	}

	public BigIntegerValue setBit(int n) {
		return new BigIntegerValue(value.setBit(n));
	}

	public BigIntegerValue clearBit(int n) {
		return new BigIntegerValue(value.clearBit(n));
	}

	public BigIntegerValue flipBit(int n) {
		return new BigIntegerValue(value.flipBit(n));
	}

	public BigIntegerValue min(BigIntegerValue val) {
		return new BigIntegerValue(value.min(val.value));
	}

	public BigIntegerValue max(BigIntegerValue val) {
		return new BigIntegerValue(value.max(val.value));
	}
	
	public static BigIntegerValue valueOf(double val) {
		return new BigIntegerValue(val);
	}

	public static BigIntegerValue valueOf(long val) {
		return new BigIntegerValue(val);
	}
	
	public static BigIntegerValue valueOf(BigInteger val) {
		return new BigIntegerValue(val);
	}

	public static BigIntegerValue valueOf(BigIntegerValue val) {
		return val; // BigInteger is not mutable so this is safe
	}

	public int signum() {
		return value.signum();
	}

	public long bitCount() {
		return value.bitCount();
	}

	public long getLowestSetBit() {
		return value.getLowestSetBit();
	}

	public int compareTo(BigIntegerValue y) {
		return value.compareTo(y.value);
	}

	@Override
	public int intValue() {
		return value.intValue();
	}

	@Override
	public long longValue() {
		return value.longValue();
	}

	@Override
	public float floatValue() {
		return value.floatValue();
	}

	@Override
	public double doubleValue() {
		return value.doubleValue();
	}
	
	public String toString() {
		return value.toString();
	}
	
	public String toString(int i) {
		return value.toString(i);
	}

	@Override
	public String string(AI ai, Set<Object> visited) throws LeekRunException {
		return this.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof BigIntegerValue && value.equals(((BigIntegerValue) obj).value);
	}

	public static final BigIntegerValue ZERO = valueOf(0);

	public static final BigIntegerValue ONE = valueOf(1);

}
