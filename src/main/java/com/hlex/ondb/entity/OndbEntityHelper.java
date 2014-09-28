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
public class OndbEntityHelper<T> extends AnnoEntityHelper{

    public OndbEntityHelper(T o) {
        super(o);
    }
    
    public Value getValue(){
        return Value.createValue(getByteValue());
    }
    
    public Key getKey() throws NullKeyException{
        return Key.createKey(getMajorKey(), getMinorKey());
    }
    
    
    public static <X> X parseData(Class<? extends X> c,byte[] byteValue) {
        X ret=(X)new Gson().fromJson (new String(byteValue), c);
        return ret;
    }
}
