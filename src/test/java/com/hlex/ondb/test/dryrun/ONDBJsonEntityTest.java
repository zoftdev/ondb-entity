/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hlex.ondb.test.dryrun;

import com.hlex.ondb.entity.AnnoEntityHelper;
import com.hlex.ondb.test.entity.Activity;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author thisadee
 */
public class ONDBJsonEntityTest {
    
    public ONDBJsonEntityTest() {
        
        a.setCode("0");
        a.setProcess_msec(5);
        a.setCreate_dt(new Date());
    }
    
    Activity a=new Activity("engine2_3g", "mytid","myactid");     
    AnnoEntityHelper helper=new AnnoEntityHelper();
    
    /**
     * Test of getValue method, of class ONDBJsonEntity.
     */
    @Test
    public void testGetValue() {
        
        String data=helper.getStringValue(a);
        System.out.println("data = " + data);
    }

    /**
     * Test of getMinorKey method, of class ONDBJsonEntity.
     */
    @Test
    public void testGetMinorKey() {
        
    }

    /**
     * Test of getMajorKey method, of class ONDBJsonEntity.
     */
    @Test
    public void testGetMajorKey() throws Exception {
        
        List<String> l = helper.getMajorKey(a);
        System.out.println("l = " + l);
        List<String> minor = helper.getMinorKey(a);
        System.out.println("minor = " + minor);
//        assertEquals(new ArrayList()., a);
        
    }
    
}
