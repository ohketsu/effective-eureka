/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.wm.mathutil.test;

import com.wm.mathutil.core.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author hminh
 */
@RunWith(value = Parameterized.class)
//Báo với Junit và JVM rằng class này sẽ tách data ra khỏi câu lệnh assertEquals
// Về logic khi run class này, Junit sẽ tự sinh ra thêm code để fill data vào trong hàm asert cho mình 
// mình bị phải viết theo cách Junit yêu cầu thì mới sửa được bad smell
// dùng code theo cách bị ép tuân thủ theo 1 logic nào đó =>> frame work 
public class MathUtilAdvancedTest {
    @Parameterized.Parameters
    public static Object[][] initData() {
        int a[] = {5, 10, 15, 20};
        return new Object[][]{{0, 1},
        {1, 1},
        {2, 2},
        {3, 6},
        {4, 24},
        {5, 120}};
    }
    //Map 1 đóng 2 cột vào 2 biến n và expected 
    // junit sẽ tự loop qua từng dòng của mảng để gán data vào 2 biến tương ứng () 
     //test hoy, so sánh hoy
    @Parameterized.Parameter(value = 0)
    public int n;
    
    @Parameterized.Parameter(value = 1)
    public long expected;

   

    @Test
    public void testFactorialGivenRightArgumentRunsWell() {
        assertEquals(expected, MathUtility.getFactorial(n));
    }

}
