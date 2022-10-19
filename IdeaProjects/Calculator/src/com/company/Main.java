package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

    double c = sum(3,5);

    }

public static int sum(int a, int b){
        return a+b;
}

@Test
    public void testSum(){

          assertEquals(sum(3, 5), 8);
}


}
