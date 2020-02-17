package com.mycom.demo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class MathTest {

    @Test
    public void testAdd(){
        assertThat(1+1, equalTo((2)));
    }
}
