/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.wm.mathutil.test;


import com.wm.mathutil.core.MathUtility;
import jdk.nashorn.internal.AssertsEnabled;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author hminh
 */
public class MathUtilityTest {
    /*hàm getF còn được thiết kế rằng nếu đưa n cà chớn tham số sẽ không đúng chuẩn, n<0 |n >20 thì
    hàm sẽ ném ra ngoại lệ 
    Tức là nếu đưa n > 0, ví dụ -5 thì sẽ nhận về expected là exception
    ta sẽ dùng junit để xem hàm có ném ra ngoại lệ như thiết kế hay không 
    */
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowException(){
        //nguyên tắc kiểm thử, so sánh giữa expected và actual value
        // Test case #4 test getF with n<0;
        //Expected an Exception is throw, in this case illegal argument exception is thrown
        //Junit 4 không có hàm assert()Exception
        //Junit 5 có assert()
        int n = -5;
        MathUtility.getFactorial(n);
        //nếu chỉ viết lệnh này đứng 1 mình thì có ý nghĩa là ta chưa biết được liệu rằng có ngoại lệ như kỳ vọng hay không 
        //xanh đỏ trong trường hợp này không phản ánh ý nghĩa 
        }
    
    @Test
    public void testRedGreenSignal() {
        Assert.assertEquals(69,96);
    }
    @Test
    public void testFactorialGivenRightArgumentReturnWell(){
        //test case #1: test getF() with n = 0;
        //expected 1 
        //test hàm getF() với n = 0; hy vọng trả 1, tức là 0! = 1 
        int n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        Assert.assertEquals(expected,actual);
        
        //test case #2: test getF() with n = 1;
        // expected 1
        //test hàm getF() với n = 1; hy vọng trả 1, tức là 1! = 1 
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        Assert.assertEquals(expected,actual);
        /* viết kiểu assertequals(equals,actual) 
        Lặp đi lặp lại  -> code bốc mùi, bad smell
        Nhược điểm đoạn code trên 
        Trộn lẫn giữa lệnh so sánh và các data dùng để test 
        Vì trộn lẫn nên ta khó nhìn hết đầy đủ các test case 
        Nguyên lí nghịch lý thuốc trừ sâu có khả năng xuất hiện
        TA SẼ FIX CODE BỐC MÙI LẶP LẠI BẰNG 1 KĨ THUẬT MỚI 
        GỌI LÀ DATA DRIVEN TESTING - DDT 
        */
    }
        
    
}
