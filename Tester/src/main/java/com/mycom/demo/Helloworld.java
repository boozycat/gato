package com.mycom.demo;

import org.apache.log4j.Logger;

public class Helloworld {

    private static Logger LOG = Logger.getLogger("Helloworld");

    public static void main(String [] ars){
        LOG.info("this is an info message");
        LOG.debug("this is a debug message");
        System.out.println("Helloworld Amdocs Dallas");
        LOG.error("this is an error message");
    }
}
