package test;

public class TestArray extends TestCommon {

	public void run() throws Exception {

		section("Array.constructor()");
		// DISABLED_code("Array").equals("<class Array>");
		// DISABLED_code("Array()").equals("[]");
		// DISABLED_code("new Array").equals("[]");
		// DISABLED_code("new Array()").equals("[]");
		// DISABLED_code("new Array() + 1").equals("[1]");
		code("return [];").equals("[]");
		code("return [1];").equals("[1]");
		code("return [1, 2, 3];").equals("[1, 2, 3]");
		// DISABLED_code("[1l, 2l, 3l]").equals("[1, 2, 3]");
		code_v10("return [1.21, -5, 4.55, 12, -6.7];").equals("[1,21, -5, 4,55, 12, -6,7]");
		code_v11("return [1.21, -5, 4.55, 12, -6.7];").equals("[1.21, -5, 4.55, 12, -6.7]");
		code("return [true, false, true];").equals("[true, false, true]");
		// DISABLED_code("[23, true, '', {}, 123]").equals("[23, true, '', {}, 123]");
		// DISABLED_code("let a = x -> x [1, 2, a]").equals("[1, 2, <function>]");
		// DISABLED_code("[1m, 34324234m, 231232131232132134379897874534243257343341432423m]").equals("[1, 34324234, 231232131232132134379897874534243257343341432423]");
		// DISABLED_code("[true, 'hello', 231232131232132134379897874534243257343341432423m]").equals("[true, 'hello', 231232131232132134379897874534243257343341432423]");

		section("Array & variables");
		code("var a = []; return a;").equals("[]");
		code_v10("var a = @[]; return a;").equals("[]");
		code_v10("var a = [1, 2, 3] var b = a push(b, 4) return a;").equals("[1, 2, 3]");
		code_v10("var a = [1, 2, 3] var b = (function() { return @a })() push(b, 4) return a;").equals("[1, 2, 3, 4]");

		section("Array.operator +");
		code("return [1, 2, 3] + [4, 5, 6];").equals("[1, 2, 3, 4, 5, 6]");
		// DISABLED_code("return [] + 1;").equals("[1]");
		// DISABLED_code("return [] + 1 + 2 + 3;").equals("[1, 2, 3]");
		// DISABLED_code("return [1] + 2;").equals("[1, 2]");
		// DISABLED_code("return [1] + 0.5;").equals("[1, 0.5]");
		// DISABLED_code("return [0.5] + 'a';").equals("[0.5, 'a']");
		code("return ['a'] + ['b'];").equals("[a, b]");
		// DISABLED_code("return [1] + 0.5 + 'a';").equals("[1, 0.5, 'a']");
		// DISABLED_code("return [1] + 0.5 + 'a' + 'b';").equals("[1, 0.5, 'a', 'b']");
		// DISABLED_code("return [1] + null;").equals("[1, null]");
		// DISABLED_code("return [1] + true;").equals("[1, true]");
		code("return [1] + [2] + [3];").equals("[1, 2, 3]");
		code_v10("return [1] + [2.5] + ['a'];").equals("[1, 2,5, a]");
		code_v11("return [1] + [2.5] + ['a'];").equals("[1, 2.5, a]");
		code_v10("return ['a'] + [2.5] + [1];").equals("[a, 2,5, 1]");
		code_v11("return ['a'] + [2.5] + [1];").equals("[a, 2.5, 1]");
		code("return [1] + ['a'];").equals("[1, a]");
		code("return ['a'] + [1];").equals("[a, 1]");
		// DISABLED_code("return [12.5] + null;").equals("[12.5, null]");
		// DISABLED_code("var a = ['yo'] return a + null;").equals("['yo', null]");
		// DISABLED_code("return [12.5] + true;").equals("[12.5, true]");
		// DISABLED_code("return ['yo'] + true;").equals("['yo', true]");
		// DISABLED_code("var a = ['yo'] return a + true;").equals("['yo', true]");
		// DISABLED_code("return [15.5] + [12, ''][0];").equals("[15.5, 12]");
		// DISABLED_code("var a = [15.5] return a + [12, ''][0];").equals("[15.5, 12]");
		// DISABLED_code("var a = [1] return a + [12, ''][0];").equals("[1, 12]");
		// DISABLED_code("return ['yo'] + '!';").equals("['yo', '!']");
		// DISABLED_code("var a = ['yo'] return a + '!';").equals("['yo', '!']");
		code("var a = [5] var b = ['b'] return a + b;").equals("[5, b]");
		code("var a = ['a'] return a + ['b'];").equals("[a, b]");
		// DISABLED_code("[1, 2] + {};").equals("[1, 2, {}]");
		// DISABLED_code("let a = [1, 2] a + {};").equals("[1, 2, {}]");
		// DISABLED_code("['a', 'b'] + {};").equals("['a', 'b', {}]");
		// DISABLED_code("let a = ['a', 'b'] a + {}").equals("['a', 'b', {}]");
		// DISABLED_code("return ['a', 'b'] + (x -> x)").equals("['a', 'b', <function>]");
		// DISABLED_code("let a = ['a', 'b'] a + (x -> x)").equals("['a', 'b', <function>]");
		// DISABLED_code("['a', 'b'] + Number").equals("['a', 'b', <class Number>]");
		// DISABLED_code("let a = ['a', 'b'] a + Number").equals("['a', 'b', <class Number>]");
		// DISABLED_code("var a = [1, 2] return a + [3, 4];").equals("[1, 2, 3, 4]");
		// DISABLED_code("var a = ['a'] return [3.5, 4.6] + a;").equals("[3.5, 4.6, 'a']");
		// DISABLED_code("var pq = [] pq = pq + 1 return pq;").equals("[1]");
		// DISABLED_code("[1l] + 12l").equals("[1, 12]");
		// DISABLED_code("[] + 12l").equals("[12]");

		section("null array");
		code("var a = null return a[1]").equals("null");
		code("var a = null return a['a']").equals("null");
		code("var a = null return a[1] = 12").equals("null");

		section("Array.operator +=");
		// DISABLED_code("var a = [1.55] a += 12.9 return a;").equals("[1.55]");
		// DISABLED_code("var a = ['a'] a += 'b' return a;").equals("['a', 'b']");
		// DISABLED_code("var a = [1, 2, 3] a[0] += 5 return a[0];").equals("6");
		// DISABLED_code("var v = 12 var a = [v, 2, 3] a[0] += 5 return a[0];").equals("17");
		// DISABLED_code("var a = [1, 2, 3] a += 'hello' return a;").equals("[1, 2, 3, 'hello']");
		code_v10("var a = [1.5] a += ['a', 'b'] return a").equals("[1,5, a, b]");
		code_v11("var a = [1.5] a += ['a', 'b'] return a").equals("[1.5, a, b]");
		// DISABLED_code("var a = [1.5] a += false return a;").equals("[1.5, false]");
		// DISABLED_code("var a = [1] a += <2, 3> a").equals("[1, 2, 3]");
		// DISABLED_code("var a = [1] a += <5.5, 7.314> a").equals("[1, 5.5, 7.314]");
		// DISABLED_code("var a = [1] a += <5, 7.314, 'hello'> a").equals("[1, 5, 7.314, 'hello']");
		// DISABLED_code("var a = [1] a += [<5, 7.314, 'hello'>, ''][0] a").equals("[1, 5, 7.314, 'hello']");
		// DISABLED_code("var a = [1] a += <'z', 'a'> a").equals("[1, 'a', 'z']");
		// DISABLED_code("var a = [1] a += 'a' return a;").equals("[1, 'a']");
		// DISABLED_code("var a = [[1]] a[0] += [12, ''][0] return a[0];").equals("[1, 12]");
		code_v10("var a = [1.11] a += [2, 3] return a").equals("[1,11, 2, 3]");
		code_v11("var a = [1.11] a += [2, 3] return a").equals("[1.11, 2, 3]");
		// DISABLED_code("var a = [[1.55]] a[0] += [12.9, ''][0] return a[0];").equals("[1.55, 12.9]");
		// DISABLED_code("var a = [[1.55]] a[0] += [-1.5, 6.7] return a[0];").equals("[1.55, -1.5, 6.7]");
		// DISABLED_code("var a = [[1.55]] a[0] += <8, 4> a[0]").equals("[1.55, 4, 8]");
		// DISABLED_code("var a = [[1.55]] a[0] += < -8.5, 4.7> a[0]").equals("[1.55, -8.5, 4.7]");
		// DISABLED_code("var a = [[1.55]] a[0] += < -8.5, 4.7, 'hello'> a[0]").equals("[1.55, -8.5, 4.7, 'hello']");
		code("var a = ['a'] return a += [1, 2]").equals("[a, 1, 2]");
		code_v10("var a = ['a'] return a += [1.5, 2.5]").equals("[a, 1,5, 2,5]");
		code_v11("var a = ['a'] return a += [1.5, 2.5]").equals("[a, 1.5, 2.5]");
		// DISABLED_code("var a = ['a'] a += <1, 2>").equals("['a', 1, 2]");
		// DISABLED_code("var a = ['a'] a += <1.5, 2.5>").equals("['a', 1.5, 2.5]");
		// DISABLED_code("var a = ['a'] var b = <'b'> a += b a").equals("['a', 'b']");
		code("var a = ['a'] var b = [12] a += b return a").equals("[a, 12]");
		// DISABLED_code("var a = [1, 2, 3] a[1] += 0.5 return a;").equals("[1, 2.5, 3]");
		code("var a = [1, 2, 3] a += [4] return a").equals("[1, 2, 3, 4]");
		// DISABLED_code("var a = [1, 2, 3] a[1] += 500l a").equals("[1, 502, 3]");
		// DISABLED_code("var a = [] if (true) a += 12 return a;").equals("[12]");
		// DISABLED_code("var a = [1] if (true) a += 12 return a;").equals("[1, 12]");
		// DISABLED_code("var a = ['a'] if (true) a += 12 return a;").equals("['a', 12]");

		section("Array.operator += on element");
		code("var a = [5] a[0] += 1 return a;").equals("[6]");
		code("var a = [5, 6, 7] a[0] += 10 a[1] += 10 return a;").equals("[15, 16, 7]");
		code("var a = [[5]] a[0][0] += 1 return a;").equals("[[6]]");
		code("var a = [] a[0] += 1 return a;").equals("[1]");

		section("Array.operator ++ on element");
		code("var a = [5] a[0]++ return a;").equals("[6]");
		code("var a = [5, 6, 7] a[0]++ a[1]++ return a;").equals("[6, 7, 7]");
		code("var a = [[5]] a[0][0]++ return a;").equals("[[6]]");

		section("Array.operator -- on element");
		code("var a = [5] a[0]-- return a;").equals("[4]");
		code("var a = [5, 6, 7] a[0]-- a[1]-- return a;").equals("[4, 5, 7]");
		code("var a = [[5]] a[0][0]-- return a;").equals("[[4]]");

		section("Array.operator -= on element");
		code("var a = [5] a[0] -= 1 return a;").equals("[4]");
		code("var a = [5, 6, 7] a[0] -= 10 a[1] -= 10 return a;").equals("[-5, -4, 7]");
		code("var a = [[5]] a[0][0] -= 1 return a;").equals("[[4]]");
		code("var a = [] a[0] -= 1 return a;").equals("[-1]");

		section("Array.operator *= on element");
		code("var a = [5] a[0] *= 10 return a;").equals("[50]");
		code("var a = [5, 6, 7] a[0] *= 10 a[1] *= 10 return a;").equals("[50, 60, 7]");
		code("var a = [[5]] a[0][0] *= 10 return a;").equals("[[50]]");

		section("Array.operator |= on element");
		code("var a = [5] a[0] |= 2 return a;").equals("[7]");
		code("var a = [5, 6, 7] a[0] |= 8 a[1] |= 8 return a;").equals("[13, 14, 7]");
		code("var a = [[5]] a[0][0] |= 2 return a;").equals("[[7]]");
		code("var a = [] a[0] |= 1 return a;").equals("[1]");

		section("Array.count()");
		code("return count([1, 2, 3, 4, 5]);").equals("5");

		section("Array.push()");
		code("var a = [] push(a, 12) return a;").equals("[12]");
		code("var a = [] push(a, 1) push(a, 2) push(a, 3) return a;").equals("[1, 2, 3]");
		code("var a = [1, 2, 3] push(a, 4) return a;").equals("[1, 2, 3, 4]");
		code("var a = [1, 2, 3] push(a, 'hello') return a;").equals("[1, 2, 3, hello]");
		code("return push([], 'hello');").equals("null");
		code("var a = [[]] push(a[0], 'hello') return a;").equals("[[hello]]");
		code("var a = [[]] push(a, [1, 2, 3]) return a;").equals("[[], [1, 2, 3]]");
		code("var a = [1, [1, 2]] push(a[1], 3) return a;").equals("[1, [1, 2, 3]]");
		code("var a = [1, [1, 2]] push(a[1], 3) return a[1];").equals("[1, 2, 3]");
		code("var a = [1, ['a', 'b']] push(a[1], 'c') return a[1];").equals("[a, b, c]");
		code("var a = [[], ['a']] push(a[1], 'b') return a;").equals("[[], [a, b]]");
		code("return function() { var a = []; for (var i = 0; i < 100000; ++i) { push(a, i); } return a[91212]; }();").equals("91212");
		code("return function() { var a = ['a','b','c','d']; push(a, 'b'); return string(a); }();").equals("[a, b, c, d, b]");

		section("Array.pushAll()");
		code("var a = [] pushAll(a, [1, 2, 3]) return a;").equals("[1, 2, 3]");
		code("var a = [1, 2, 3] pushAll(a, [4, 5, 6]) return a;").equals("[1, 2, 3, 4, 5, 6]");
		code("var a = [] var b = [1, 2, 3] pushAll(a, b) return a;").equals("[1, 2, 3]");
		code("var a = [1, 2, 3] var b = [4, 5, 6] pushAll(a, b) return a;").equals("[1, 2, 3, 4, 5, 6]");
		code("var a = [[], ['a']] pushAll(a[1], ['b', 'c']) return a;").equals("[[], [a, b, c]]");
		code("return function() { var a = [1, 2, 3]; pushAll(a, [5, 6, 7]); return a; }();").equals("[1, 2, 3, 5, 6, 7]");

		section("Array.filter() v1.0");
		code_v10("return arrayFilter([1, 2, 3, 4, 5, 6, 7, 8, 9], function(e) { return e > 5; });").equals("[5 : 6, 6 : 7, 7 : 8, 8 : 9]");
		code_v10("return arrayFilter([4, 5, 6, 'test', 8, 9], function(e) { return e == 'test'; });").equals("[3 : test]");
		code_v10("return arrayFilter(['a', 'b', 'c', 'd'], function(k, v) { return k == 3; });").equals("[3 : d]");
		code_v10("return function() { var t = ['a', 'b', 'c', 'd']; arrayFilter(t, function(k, @v) { v = 4; return k == 3; }); return t; }();").equals("[4, 4, 4, 4]");
		code_v10("return arrayFilter(['a', 'b', 'c', 'd'], function(k, @v) { v = 4; return k == 3; });").equals("[3 : 4]");

		section("Array.filter() v1.1");
		code_v11("return arrayFilter([1, 2, 3, 4, 5, 6, 7, 8, 9], function(e) { return e > 5; });").equals("[6, 7, 8, 9]");
		code_v11("return arrayFilter([4, 5, 6, 'test', 8, 9], function(e) { return e == 'test'; });").equals("[test]");
		code_v11("return string(arrayFilter(['a', 'b', 'c', 'd'], function(k, v) { return k == 3; }));").equals("[d]");

		section("Array.flatten()");
		code("return arrayFlatten([6,7,[8,9]],99);").equals("[6, 7, 8, 9]");
		code("return arrayFlatten([6,[[7]],[8,9]],2);").equals("[6, 7, 8, 9]");
		code("return arrayFlatten([6,[[7]],[8,9]]);").equals("[6, [7], 8, 9]");

		section("Array.sort");
		code_v10("return function() { var t = [null, null, 4, 8, 9]; sort(t); return t; }();").equals("[4, 8, 9, null, null]");
		code_v11("return function() { var t = [null, null, 4, 8, 9]; sort(t); return t; }();").equals("[null, null, 4, 8, 9]");
		code_v10("return function() { var t = [4, null, 4, null, 4]; sort(t); return t; }();").equals("[4, 4, 4, null, null]");
		code_v11("return function() { var t = [4, null, 4, null, 4]; sort(t); return t; }();").equals("[null, null, 4, 4, 4]");
		code_v10("return function() { var t = [4, null, 5, null, 8]; sort(t, SORT_DESC); return t; }();").equals("[null, null, 8, 5, 4]");
		code_v11("return function() { var t = [4, null, 5, null, 8]; sort(t, SORT_DESC); return t; }();").equals("[8, 5, 4, null, null]");

		section("Array and references");
		code_v10("var t = [@3, @4, @5]; return t;").equals("[3, 4, 5]");
		code_v10("var t = [3, 4, 5]; var a = 12; t[1] = @a return t;").equals("[3, 12, 5]");
		code_v10("var t = [3, 4, 5]; var a = @t[1] a++ return t;").equals("[3, 4, 5]");
		code_v10("var t = [3, 4, 5]; var a = null a = @t[1] a++ return t;").equals("[3, 4, 5]");
		code_v10("var t = [3, 4, 5]; t[3] = [1, 2, 3, 4]; var r = @t[3]; r[4] = 'coucou'; return t;").equals("[3, 4, 5, [1, 2, 3, 4, coucou]]");

		section("Array.map() v1.0");
		code_v10("return arrayMap([1, 2, 3, 4, 5], function(e) { return e * 2; });").equals("[2, 4, 6, 8, 10]");
		code_v10("return arrayMap([4, 9, 16], sqrt);").equals("[2, 3, 4]");
		code_v10("return arrayMap(['a': 1,'b': 2], function(k, v) { return k + v; });").equals("[a : a1, b : b2]");
		code_v10("return function() { var t = ['a':1,'b':2]; arrayMap(t, function(@k, @v) { v = 'tomate'; k = 'ctus'; return 3; }); return t; }();").equals("[a : tomate, b : tomate]");

		section("Array.map() v1.1");
		code_v11("return arrayMap([1, 2, 3, 4, 5], function(e) { return e * 2; });").equals("[2, 4, 6, 8, 10]");
		code_v11("return arrayMap([4, 9, 16], sqrt);").equals("[2.0, 3.0, 4.0]");
		code_v11("return arrayMap(['a': 1, 'b': 2], function(k, v) { return k + v; });").equals("[a : a1, b : b2]");
		code_v11("return function() { var t = ['a': 1, 'b': 2]; arrayMap(t, function(k, v) { v = 'tomate'; k = 'ctus'; return 3; }); return t; }();").equals("[a : 1, b : 2]");

		section("Array.foldLeft()");
		code("return arrayFoldLeft([6, 7, 8, 9], function(a, b) { return a + b; }, 0)").equals("30");
		code("return arrayFoldLeft([1,0,1,2,5,7,9], function(a,b){return a+','+b;},'')").equals(",1,0,1,2,5,7,9");

		section("Array.foldRight()");
		code("return arrayFoldRight([6,7,8,9], function(a,b){return a+b;},0)").equals("30");
		code("return arrayFoldRight([1,0,1,2,5,7,9], function(a,b){return a+','+b;},'')").equals("1,0,1,2,5,7,9,");

		section("Array.partition()");
		code("return arrayPartition([6,7,8,9], function(a){return a&1;})").equals("[[1 : 7, 3 : 9], [0 : 6, 2 : 8]]");
		code("return string(arrayPartition([6,7,8,9], function(k,v){return k;}))").equals("[[1 : 7, 2 : 8, 3 : 9], [6]]");
		code("return string(arrayPartition([4,3,2,1], function(k,v){return k<v;}))").equals("[[4, 3], [2 : 2, 3 : 1]]");
		code_v10("return string(function(){var t=[1,2,3]; arrayPartition(t, function(@v){ v=3; }); return t;}())").equals("[3, 3, 3]");
		code_v10("return string(function(){var t=[1,2,3]; arrayPartition(t, function(k, @v){ v=3; }); return t;}())").equals("[3, 3, 3]");
		code_v10("return string(arrayPartition([4,3,2,1], function(k,@v){ v=3; return k<v;}))").equals("[[3, 3, 3], [3 : 3]]");

		section("Array.concat()");
		code("return [0] + [1, 2]").equals("[0, 1, 2]");
		code("return function() { var a = [0, 1]; a += [3]; return a }()").equals("[0, 1, 3]");
		code("return arrayConcat([0], [1, 2])").equals("[0, 1, 2]");

		section("Array.iter()");
		code("var t = [1,2,3,4]; arrayIter(t, function(v){ v=2; }); return t;").equals("[1, 2, 3, 4]");
		code_v10("var t = [1,2,3,4]; arrayIter(t, function(@v){ v=2; }); return t;").equals("[2, 2, 2, 2]");
		code_v10("var t = [1,2,3,4]; arrayIter(t, function(k, @v){ v=k; }); return t;").equals("[0, 1, 2, 3]");
		code("var t = [1,2,3,4]; arrayIter(t, function(k, v){ v=k; }); return t;").equals("[1, 2, 3, 4]");

		section("Array.sort()");
		code("var t = [0,1,2]; return arraySort(t,function(e, f){return (e>f)?(-1):(e<f)?1:0;})").equals("[2, 1, 0]");
		code("var t = [2:0,1:1,0:2]; return arraySort(t,function(k1, v1, k2, v2){return (k1>k2)?(-1):(k1<k2)?1:0;})").equals("[2 : 0, 1 : 1, 0 : 2]");
		code("var t = ['test','t']; return arraySort(t,function(k1, v1, k2, v2){return (k1>k2)?(-1):(k1<k2)?1:0;})").equals("[t, test]");

		section("Array.remove()");
		code("var r = ['a','b','c','d','e']; return remove(r,1);").equals("b");
		code("var r = ['a','b','c','d','e']; return remove(r,55);").equals("null");
		code("var r = ['a','b','c','d','e']; remove(r,1); return r;").equals("[a, c, d, e]");

		section("Array.count()");
		code("return count(['a','b','c','d','e'])").equals("5");

		section("Array.join()");
		code("return join(['a','b','c','d','e'],'_')").equals("a_b_c_d_e");
		code("return join(['a','b','c','d','e'],'_-')").equals("a_-b_-c_-d_-e");

		section("Array.insert()");
		code("var a = ['a','b','c','d']; insert(a, 'b', 1); return a;").equals("[a, b, b, c, d]");

		section("Array.unshift()");
		code("var a = ['a','b','c','d']; unshift(a, 'b'); return a;").equals("[b, a, b, c, d]");

		section("Array.shift()");
		code("var a = ['a','b','c','d']; shift(a); return a;").equals("[b, c, d]");

		section("Array.pop()");
		code("var a = ['a','b','c','d']; pop(a); return a;").equals("[a, b, c]");

		section("Array.removeElement()");
		code("var a = ['a','b','c','d']; removeElement(a,'c'); return a").equals("[0 : a, 1 : b, 3 : d]");

		section("Array.removeKey()");
		code("var a = ['a':'va','b':'vb','c':'vc','d':'vd']; removeKey(a,'a'); return a").equals("[b : vb, c : vc, d : vd]");

		section("Array.sort()");
		code("var a = [8,6,2,3,7,1,0]; sort(a); return a").equals("[0, 1, 2, 3, 6, 7, 8]");
		code("var a = [8,6,2,3,7,1,0]; sort(a, SORT_ASC); return a").equals("[0, 1, 2, 3, 6, 7, 8]");
		code("var a = [8,6,2,3,7,1,0]; sort(a, SORT_DESC); return a").equals("[8, 7, 6, 3, 2, 1, 0]");

		section("Array.assocSort()");
		code("var a = ['b':'vb','c':'vc','a':'va','d':'vd']; assocSort(a); return a").equals("[a : va, b : vb, c : vc, d : vd]");
		code("var a = ['b':'vb','c':'vc','a':'va','d':'vd']; assocSort(a, SORT_DESC); return a").equals("[d : vd, c : vc, b : vb, a : va]");
		code("var a = [8,6,2,3,7,1,0]; assocSort(a); return a").equals("[6 : 0, 5 : 1, 2 : 2, 3 : 3, 1 : 6, 4 : 7, 0 : 8]");

		section("Array.keySort()");
		code("var a = ['b':'vb','c':'vc','a':'va','d':'vd']; keySort(a); return a").equals("[a : va, b : vb, c : vc, d : vd]");
		code("var a = ['b':'vb','c':'vc','a':'va','d':'vd']; keySort(a, SORT_DESC); return a").equals("[d : vd, c : vc, b : vb, a : va]");
		code("var a = [6 : 0, 5 : 1, 2 : 2, 3 : 3, 1 : 6, 4 : 7, 0 : 8]; keySort(a); return a").equals("[8, 6, 2, 3, 7, 1, 0]");

		section("Array.search()");
		code("var a = ['a','b','c','d']; return search(a,'c')").equals("2");
		code("var a = ['cle1':'a','cle2':'b','cle3':'c','cle4':'d']; return search(a,'c')").equals("cle3");
		code("var a = ['cle1':'a','cle2':'b','cle3':'c','cle4':'d']; return search(a,'454')").equals("null");

		section("Array.inArray()");
		code("var a = ['a','b','c','d']; return inArray(a,'c')").equals("true");
		code("var a = ['cle1':'a','cle2':'b','cle3':'c','cle4':'d']; return inArray(a,'c')").equals("true");
		code("var a = ['cle1':'a','cle2':'b','cle3':'c','cle4':'d']; return inArray(a,'cle3')").equals("false");
		code("var a = ['cle1':'a','cle2':'b','cle3':'c','cle4':'d']; return inArray(a,'454')").equals("false");

		section("Array.reverse()");
		code("var a = ['a','b','c','d']; reverse(a); return a").equals("[d, c, b, a]");

		section("Array.arrayMin()");
		code("return arrayMin([8,4,3,-1,8,44])").equals("-1");
		code("return arrayMin([0:7,8:9,'a':2])").equals("2");

		section("Array.arrayMax()");
		code("return arrayMax([8,4,3,-1,8,44])").equals("44");
		code("return arrayMax([0:7,8:9,'a':2])").equals("9");

		section("Array.sum()");
		code("return sum([1,5,7])").equals("13.0");
		code("return sum([0:1,'a':5,'test':7])").equals("13.0");
		code("return sum([])").equals("0.0");

		section("Array.average()");
		code("return average([2,4,6])").equals("4.0");
		code("return average([0:2,'a':4,'test':6])").equals("4.0");
		code("return average([])").equals("0.0");

		section("Array.fill()");
		code("var a = [1,2,3]; fill(a, 'a'); return a").equals("[a, a, a]");
		code("var a = [1,2,3]; fill(a, 'a',2); return a").equals("[a, a, 3]");
		code("var a = []; fill(a, 'a',2); return a").equals("[a, a]");

		section("Array.isEmpty()");
		code("return isEmpty([2,4,6])").equals("false");
		code("return isEmpty([2:8])").equals("false");
		code("return isEmpty([])").equals("true");

		section("Array.subArray()");
		code("return subArray([1,2,3,4,5,6,7,8],1,3)").equals("[2, 3, 4]");
		code("return subArray([1,2,3,4,5,6,7,8],3,3)").equals("[4]");

		section("Array.assocReverse()");
		code("var a = [1,2,3]; assocReverse(a); return a;").equals("[2 : 3, 1 : 2, 0 : 1]");
	}
}
