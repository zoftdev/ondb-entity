/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hlex.ondb.entity;

import com.google.gson.Gson;
import com.hlex.ondb.exception.NullKeyException;
import oracle.kv.Key;
import oracle.kv.Value;

/**
 *
 * @author thisadee
 */
public class OndbEntityHelper  extends AnnoEntityHelper{

    
    
    public Value getValue(Object target){
        return Value.createValue(getByteValue(target));
    }
    
    public Key getKey(Object target) throws NullKeyException{
        return Key.createKey(getMajorKey(target), getMinorKey(target));
    }
    
    
    public <X extends Object> X parseData(Class<X> c,byte[] byteValue) {
        return new Gson().fromJson (new String(byteValue), c);
//        return ret;
    }
}
