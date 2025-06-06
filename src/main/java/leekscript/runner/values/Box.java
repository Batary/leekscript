package leekscript.runner.values;

import leekscript.runner.values.BigIntegerValue;

import java.math.BigInteger;

import leekscript.AILog;
import leekscript.runner.AI;
import leekscript.runner.LeekOperations;
import leekscript.runner.LeekRunException;
import leekscript.runner.LeekValueManager;
import leekscript.common.Error;

public class Box<T> {

	protected Object mValue;
	protected AI mUAI = null;

	public Box(AI ai) {
		mUAI = ai;
		mValue = null;
	}

	public Box(AI ai, Object value) throws LeekRunException {
		mUAI = ai;
		ai.ops(1);
		if (ai.getVersion() >= 2) {
			mValue = value;
		} else if (value instanceof Box) {
			mValue = LeekOperations.clone(ai, ((Box) value).get());
		} else {
			mValue = value;
		}
	}

	public Box(AI ai, Object value, int ops) throws LeekRunException {
		this(ai, value);
		ai.ops(ops);
	}

	public T get() {
		return (T) mValue;
	}

	public Object set(Object value) throws LeekRunException {
		// mUAI.ops(1);
		if (mUAI.getVersion() >= 2) {
			if (value instanceof Box) {
				return mValue = ((Box) value).get();
			} else {
				return mValue = value;
			}
		} else {
			if (value instanceof Box) {
				return mValue = LeekOperations.clone(mUAI, ((Box) value).get());
			} else {
				return mValue = value;
			}
		}
	}

	public Object setRef(Object value) throws LeekRunException {
		if (value instanceof Box box) {
			return mValue = box.get();
		} else {
			return mValue = value;
		}
	}

	public void initGlobal(Object value) throws LeekRunException {
		if (value instanceof Box) {
			if (mUAI.getVersion() >= 2) {
				mValue = value;
			} else {
				mValue = LeekOperations.clone(mUAI, value);
			}
		} else {
			mValue = value;
		}
	}

	public T increment() throws LeekRunException {
		if (mValue instanceof Long) {
			var value = (Long) mValue;
			mValue = value + 1;
			return (T) value;
		}
		if (mValue instanceof BigIntegerValue) {
			var value = (BigIntegerValue) mValue;
			mValue = value.add(new BigIntegerValue(mUAI, BigInteger.ONE));
			return (T) value;
		}
		if (mValue instanceof Double) {
			var value = (Double) mValue;
			mValue = value + 1;
			return (T) value;
		}
		mUAI.addSystemLog(AILog.ERROR, Error.INVALID_OPERATOR, new String[] { mUAI.export(mValue) + "++" });
		return null;
	}

	public T decrement() throws LeekRunException {
		if (mValue instanceof Long) {
			var value = (Long) mValue;
			mValue = value - 1;
			return (T) value;
		}
		if (mValue instanceof BigIntegerValue) {
			var value = (BigIntegerValue) mValue;
			mValue = value.subtract(new BigIntegerValue(mUAI, BigInteger.ONE));
			return (T) value;
		}
		if (mValue instanceof Double) {
			var value = (Double) mValue;
			mValue = value - 1;
			return (T) value;
		}
		mUAI.addSystemLog(AILog.ERROR, Error.INVALID_OPERATOR, new String[] { mUAI.export(mValue) + "--" });
		return null;
	}

	public T pre_increment() throws LeekRunException {
		if (mValue instanceof Long) {
			return (T) (mValue = (Long) mValue + 1);
		}
		if (mValue instanceof BigIntegerValue) {
			return (T) (mValue = ((BigIntegerValue) mValue).add(new BigIntegerValue(mUAI, BigInteger.ONE)));
		}
		if (mValue instanceof Double) {
			return (T) (mValue = (Double) mValue + 1);
		}
		mUAI.addSystemLog(AILog.ERROR, Error.INVALID_OPERATOR, new String[] { "++" + mUAI.export(mValue) });
		return null;
	}

	public T pre_decrement() throws LeekRunException {
		if (mValue instanceof Long) {
			return (T) (mValue = (Long) mValue - 1);
		}
		if (mValue instanceof BigIntegerValue) {
			return (T) (mValue = ((BigIntegerValue) mValue).subtract(new BigIntegerValue(mUAI, BigInteger.ONE)));
		}
		if (mValue instanceof Double) {
			return (T) (mValue = (Double) mValue - 1);
		}
		mUAI.addSystemLog(AILog.ERROR, Error.INVALID_OPERATOR, new String[] { "--" + mUAI.export(mValue) });
		return null;
	}

	public Object not() throws LeekRunException {
		// mUAI.ops(1);
		return !mUAI.bool(mValue);
	}

	public Object opposite() throws LeekRunException {
		// mUAI.ops(1);
		if (mValue instanceof Double) {
			return -(Double) mValue;
		}
		if (mValue instanceof BigIntegerValue) {
			return ((BigIntegerValue) mValue).negate();
		}
		return -mUAI.longint(mValue);
	}

	public Object add_eq(Object val) throws LeekRunException {
		if (mValue instanceof LegacyArrayLeekValue && !(val instanceof String)) {
			return mValue = mUAI.add_eq(mValue, val);
		}
		return mValue = mUAI.add(mValue, val);
	}

	public Object sub_eq(Object val) throws LeekRunException {
		// TODO cast if mUAI.sub has other type than mValue (ie val type != mValue type)
		return mValue = mUAI.sub(mValue, val);
	}

	public Object mul_eq(Object val) throws LeekRunException {
		return mValue = mUAI.mul(mValue, val);
	}

	public Object pow_eq(Object val) throws LeekRunException {
		return mValue = mUAI.pow(mValue, val);
	}

	public Number band_eq(Object val) throws LeekRunException {
		return (Number) (mValue = mUAI.band(mValue, val));
	}

	public Number bor_eq(Object val) throws LeekRunException {
		return (Number) (mValue = mUAI.bor(mValue, val));
	}

	public Number bxor_eq(Object val) throws LeekRunException {
		return (Number) (mValue = mUAI.bxor(mValue, val));
	}

	public Number shl_eq(Object val) throws LeekRunException {
		return (Number) (mValue = mUAI.shl(mValue, val));
	}

	public Number shr_eq(Object val) throws LeekRunException {
		return (Number) (mValue = mUAI.shr(mValue, val));
	}

	public Number ushr_eq(Object val) throws LeekRunException {
		return (Number) (mValue = mUAI.ushr(mValue, val));
	}

	public Number div_eq(Object val) throws LeekRunException {
		return (Number) (mValue = mUAI.div(mValue, val));
	}

	public Object div_eq_v1(Object val) throws LeekRunException {
		return mValue = mUAI.div_v1(mValue, val);
	}

	public Number intdiv_eq(Object val) throws LeekRunException {
		return (Number) (mValue = mUAI.intdiv(mValue, val));
	}

	public Object mod_eq(Object val) throws LeekRunException {
		return mValue = mUAI.mod(mValue, val);
	}

	public Object get(Object index, ClassLeekValue fromClass) throws LeekRunException {
		return mUAI.get(mValue, index, fromClass);
	}

	public Box getOrCreate(Object index) throws LeekRunException {
		return LeekValueManager.getOrCreate(mUAI, mValue, index);
	}

	public Object getField(String field, ClassLeekValue fromClass) throws LeekRunException {
		if (mValue instanceof ObjectLeekValue object) {
			return object.getField(field, fromClass);
		}
		return null;
	}

	public Box getFieldL(String field) throws LeekRunException {
		if (mValue instanceof ObjectLeekValue object) {
			return object.getFieldL(field);
		}
		throw new LeekRunException(Error.UNKNOWN_FIELD);
	}

	public Object put(AI ai, Object key, Object value) throws LeekRunException {
		if (mValue instanceof LegacyArrayLeekValue) {
			return ((LegacyArrayLeekValue) mValue).put(key, value);
		}
		throw new LeekRunException(Error.UNKNOWN_FIELD);
	}

	public AI getAI() {
		return mUAI;
	}

	public Object execute(Object... arguments) throws LeekRunException {
		return mUAI.execute(mValue, arguments);
	}

	@Override
	public String toString() {
		return "Box(" + (mValue != null ? mValue.toString() : "null") + ")";
	}
}
