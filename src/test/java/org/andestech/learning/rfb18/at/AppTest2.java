package org.andestech.learning.rfb18.at;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class AppTest2 {

    int[] arr = new int[]{1,2,3,4};

    @Rule
    public Timeout tw = new Timeout(200);

    @Rule
    public ExpectedException ex =  ExpectedException.none();

    @BeforeClass
    public static void clearGlobalCachBefore(){
        System.out.println("!!! before: Global cache cleared");
        //...
    }

    @AfterClass
    public static void clearGlobalCacheAfter(){
        System.out.println("!!! after: Global cache cleared");}


    public AppTest2(){
        System.out.println("++ ctor: " + this);
    }

    //@Before
    public void clearLocalCachBefore(){
        System.out.println("!!before: local cache cleared");
        //...
    }

    //@After
    public void clearLocalCacheAfter(){
        System.out.println("!!after: local cache cleared");
        //...
    }
//    public void
//
//    public void

    @Test
    public void test333(){
        System.out.println("++ " +
        Thread.currentThread().getStackTrace()[1].getMethodName());
        //.. loging
        try { Thread.sleep(170);} catch (InterruptedException e) {e.printStackTrace();
        }

    }

    @Category({ISuperTestCategory.class})
    @Test
    public void test444(){
        System.out.println("++ " +
                Thread.currentThread().getStackTrace()[1].getMethodName());
    // worker
        try { Thread.sleep(160);} catch (InterruptedException e) {e.printStackTrace();

    }}


    //@Test(expected = ArrayIndexOutOfBoundsException.class)
    @Test
    @Ignore
    public void test555(){
        System.out.println("++ " +
                Thread.currentThread().getStackTrace()[1].getMethodName());
        // worker
        //
        //Class.forName("org.blabla.TEST01");
        arr[4]=123;
        try { Thread.sleep(160);} catch (InterruptedException e) {e.printStackTrace();

        }}
}
