/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hlex.ondb.test.dryrun;

import com.hlex.ondb.entity.AnnoEntityHelper;
import com.hlex.ondb.entity.OndbEntityHelper;
import com.hlex.ondb.exception.NullKeyException;
import com.hlex.ondb.test.entiy.Activity;
import java.util.Date;
import javax.validation.Valid;
import oracle.kv.KVStore;
import oracle.kv.KVStoreConfig;
import oracle.kv.KVStoreFactory;
import oracle.kv.Key;
import oracle.kv.ValueVersion;
import org.junit.Test;

/**
 *
 * @author thisadee
 */
public class CRUD {
    
    Activity a=new Activity("engine2_3g", "mytid","myactid");
    OndbEntityHelper ahelper=new OndbEntityHelper(a);
    private KVStoreConfig config=new KVStoreConfig("kvstore", "localhost:5000");
    KVStore ks=KVStoreFactory.getStore(config);   
    
    @Test
    public void testPut() throws NullKeyException{
        a.setCreate_dt(new Date());
        a.setProcess_msec(2555);
        ks.put(ahelper.getKey(),ahelper.getValue());
        
    }
    
    @Test
    public void testGet() throws NullKeyException{
        
        ValueVersion i = ks.get(ahelper.getKey());
        System.out.println("i = " + i);
        Activity aout = OndbEntityHelper.parseData(a.getClass(), i.getValue().getValue());
        System.out.println("aout = " + aout);
    }

}
