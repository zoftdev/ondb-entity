/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hlex.ondb.test.dryrun;

import com.hlex.ondb.test.entiy.Activity;
import oracle.kv.KVStore;
import oracle.kv.KVStoreConfig;
import oracle.kv.KVStoreFactory;
import oracle.kv.Key;
import oracle.kv.Value;
import org.junit.Test;

/**
 *
 * @author thisadee
 */
public class CRUD {
    
    Activity a=new Activity("engine2_3g", "mytid","myactid");
    private KVStoreConfig config=new KVStoreConfig("kvstore", "localhost:5000");
    KVStore ks=KVStoreFactory.getStore(config);

    
    @Test
    public void testPut(){
//        ks.put(Key.createKey(a.getMajorKey(), a.getMinorKey()), a.getValue());
        
    }

}
