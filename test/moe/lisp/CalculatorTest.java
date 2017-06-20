/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moe.lisp;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 *
 * @author koide
 * 
 * クラスCalculatorに対するテストケース
 * @author masafum.ifuku(2017.6.19)
 */
public class CalculatorTest {
    // テストメソッド
    
    /**
     * 2引数とも正数の場合のテスト<br/>
     * 対象: Multiply(int, int)<br/>
     * 条件: 引数　10, 20<br/>
     * 期待する値: 戻り値 200<br/>
     */
    @Test
    public void testMultiply01() throws Exception {
        Calculator calc = new Calculator(); // テスト対象
        int expected = 200;                 // 期待する戻り値
        int actual = calc.multiply(10, 20); // テスト対象実行
        assertEquals(expected, actual);     // 実行結果検証
    }
    
    /**
     * 引数の一方が負数, 他方が正数の場合のテスト<br/>
     * 対象: Multiply(int, int)<br/>
     * 条件: 引数　-10, 20<br/>
     * 期待する値: 戻り値 -200<br/>
     */
    @Test
    public void testMultiply02() throws Exception {
        Calculator calc = new Calculator(); // テスト対象
        int expected = -200;                 // 期待する戻り値
        int actual = calc.multiply(-10, 20); // テスト対象実行
        assertEquals(expected, actual);     // 実行結果検証
    }
    
    /**
     * 引数の一方が0, 他方が正数の場合のテスト<br/>
     * 対象: Multiply(int, int)<br/>
     * 条件: 引数　0, 20<br/>
     * 期待する値: 戻り値 0<br/>
     */
    @Test
    public void testMultiply03() throws Exception {
        Calculator calc = new Calculator(); // テスト対象
        int expected = 0;                 // 期待する戻り値
        int actual = calc.multiply(0, 20); // テスト対象実行
        assertEquals(expected, actual);     // 実行結果検証
    }

    /*
    3整数の大小関係とa,b,cの当てはめ方を以下に示す.
        x > y > z : 6通り
        x > y = z : 3通り
        x = y > z : 3通り
        x = y = z : 1通り
    すなわち13通りのケースでテストを行えば良い.
    */
    /**
     * c &gt; b &gt; aの場合のテスト<br/>
     * 対象: Max(int, int, int)<br/>
     * 条件: 引数　10, 20, 30<br/>
     * 期待する値: 戻り値 30<br/>
     */
    @Test
    public void testMax01() throws Exception {
        Calculator calc = new Calculator(); // テスト対象
        int expected = 30;                 // 期待する戻り値
        int actual = calc.max(10, 20, 30); // テスト対象実行
        assertEquals(expected, actual);     // 実行結果検証
    }
    
    /**
     * a &gt; b &gt; bの場合のテスト<br/>
     * 対象: Max(int, int, int)<br/>
     * 条件: 引数　30, 20, 10<br/>
     * 期待する値: 戻り値 30<br/>
     */
    @Test
    public void testMax02() throws Exception {
        Calculator calc = new Calculator(); // テスト対象
        int expected = 30;                 // 期待する戻り値
        int actual = calc.max(30, 20, 10); // テスト対象実行
        assertEquals(expected, actual);     // 実行結果検証
    }
    
    /**
     * b &gt; a &gt; cの場合のテスト<br/>
     * 対象: Max(int, int, int)<br/>
     * 条件: 引数　20, 30, 10<br/>
     * 期待する値: 戻り値 30<br/>
     */
    @Test
    public void testMax03() throws Exception {
        Calculator calc = new Calculator(); // テスト対象
        int expected = 30;                 // 期待する戻り値
        int actual = calc.max(20, 30, 10); // テスト対象実行
        assertEquals(expected, actual);     // 実行結果検証
    }
    
    /**
     * a &gt; b &eq; cの場合のテスト<br/>
     * 対象: Max(int, int, int)<br/>
     * 条件: 引数　30, 10, 10<br/>
     * 期待する値: 戻り値 30<br/>
     */
    @Test
    public void testMax04() throws Exception {
        Calculator calc = new Calculator(); // テスト対象
        int expected = 30;                 // 期待する戻り値
        int actual = calc.max(30, 10, 10); // テスト対象実行
        assertEquals(expected, actual);     // 実行結果検証
    }
    
    /**
     * c &gt; a &eq; bの場合のテスト<br/>
     * 対象: Max(int, int, int)<br/>
     * 条件: 引数　10, 10, 30<br/>
     * 期待する値: 戻り値 30<br/>
     */
    @Test
    public void testMax05() throws Exception {
        Calculator calc = new Calculator(); // テスト対象
        int expected = 30;                 // 期待する戻り値
        int actual = calc.max(10, 10, 30); // テスト対象実行
        assertEquals(expected, actual);     // 実行結果検証
    }
    
    /**
     * a &eq; b &eq; cの場合のテスト<br/>
     * 対象: Max(int, int, int)<br/>
     * 条件: 引数　30, 30, 30<br/>
     * 期待する値: 戻り値 30<br/>
     */
    @Test
    public void testMax06() throws Exception {
        Calculator calc = new Calculator(); // テスト対象
        int expected = 30;                 // 期待する戻り値
        int actual = calc.max(30, 30, 30); // テスト対象実行
        assertEquals(expected, actual);     // 実行結果検証
    }
    
    /**
     * a &eq; b &gt; cの場合のテスト<br/>
     * 対象: Max(int, int, int)<br/>
     * 条件: 引数　30, 30, 10<br/>
     * 期待する値: 戻り値 30<br/>
     */
    @Test
    public void testMax07() throws Exception {
        Calculator calc = new Calculator(); // テスト対象
        int expected = 30;                 // 期待する戻り値
        int actual = calc.max(30, 30, 10); // テスト対象実行
        assertEquals(expected, actual);     // 実行結果検証
    }
    
    /**
     * a &eq; c &gt; bの場合のテスト<br/>
     * 対象: Max(int, int, int)<br/>
     * 条件: 引数　30, 10, 30<br/>
     * 期待する値: 戻り値 30<br/>
     */
    @Test
    public void testMax08() throws Exception {
        Calculator calc = new Calculator(); // テスト対象
        int expected = 30;                 // 期待する戻り値
        int actual = calc.max(30, 10, 30); // テスト対象実行
        assertEquals(expected, actual);     // 実行結果検証
    }
    
    /**
     * a &gt; c &gt; bの場合のテスト<br/>
     * 対象: Max(int, int, int)<br/>
     * 条件: 引数　30, 10, 20<br/>
     * 期待する値: 戻り値 30<br/>
     */
    @Test
    public void testMax09() throws Exception {
        Calculator calc = new Calculator(); // テスト対象
        int expected = 30;                 // 期待する戻り値
        int actual = calc.max(30, 10, 20); // テスト対象実行
        assertEquals(expected, actual);     // 実行結果検証
    }
    
    /**
     * b &eq; c &gt; aの場合のテスト<br/>
     * 対象: Max(int, int, int)<br/>
     * 条件: 引数　10, 30, 30<br/>
     * 期待する値: 戻り値 30<br/>
     */
    @Test
    public void testMax10() throws Exception {
        Calculator calc = new Calculator(); // テスト対象
        int expected = 30;                 // 期待する戻り値
        int actual = calc.max(10, 30, 30); // テスト対象実行
        assertEquals(expected, actual);     // 実行結果検証
    }
    
    /**
     * b &gt; c &eq; aの場合のテスト<br/>
     * 対象: Max(int, int, int)<br/>
     * 条件: 引数　10, 30, 10<br/>
     * 期待する値: 戻り値 30<br/>
     */
    @Test
    public void testMax11() throws Exception {
        Calculator calc = new Calculator(); // テスト対象
        int expected = 30;                 // 期待する戻り値
        int actual = calc.max(10, 30, 10); // テスト対象実行
        assertEquals(expected, actual);     // 実行結果検証
    }
    
    
    /**
     * c &gt; a &gt; bの場合のテスト<br/>
     * 対象: Max(int, int, int)<br/>
     * 条件: 引数　20, 10, 30<br/>
     * 期待する値: 戻り値 30<br/>
     */
    @Test
    public void testMax12() throws Exception {
        Calculator calc = new Calculator(); // テスト対象
        int expected = 30;                 // 期待する戻り値
        int actual = calc.max(20, 10, 30); // テスト対象実行
        assertEquals(expected, actual);     // 実行結果検証
    }
    
    /**
     * b &gt; c &gt; aの場合のテスト<br/>
     * 対象: Max(int, int, int)<br/>
     * 条件: 引数　10, 30, 20<br/>
     * 期待する値: 戻り値 30<br/>
     */
    @Test
    public void testMax13() throws Exception {
        Calculator calc = new Calculator(); // テスト対象
        int expected = 30;                 // 期待する戻り値
        int actual = calc.max(10, 30, 20); // テスト対象実行
        assertEquals(expected, actual);     // 実行結果検証
    }
    
}
