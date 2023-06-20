package Junit;
  
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

 
  
public class TestLogic {  
  
    @Test  
    public void testFindMax(){  
    	 assertEquals(4, sumOfTen.findMax(new int[]{1, 3, 4, 2}));
         assertEquals(-1, sumOfTen.findMax(new int[]{-12, -1, -3, -4, -2})); 
    }  
} 