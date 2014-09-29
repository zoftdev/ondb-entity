/*
 * To change target license header, choose License Headers in Project Properties.
 * To change target template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hlex.ondb.entity;

import com.hlex.ondb.exception.NullKeyException;
import com.google.gson.Gson;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EmbeddedId;
import javax.persistence.Id;
import org.apache.commons.lang3.reflect.FieldUtils;

/**
 * find @Id to make majorkey 
 * find @EmbededId to make minorkey
 * 
 * @author targetadee
 */
public   class AnnoEntityHelper implements ONDBEntityHelperInf {

     
     
    public String getStringValue(Object target) {
        return (new Gson()).toJson(target);
    }

    @Override
    public byte[] getByteValue(Object target) {
        return getStringValue(  target).getBytes();
    }
    
    
    /**
     * see getKeyByAnnotation(MinorKey.class)
     * @return 
     * @throws NullKeyException 
     */
    @Override
    public    List<String> getMinorKey(Object o) throws NullKeyException {
        return getKeyByAnnotation(o,EmbeddedId.class);
    }

    /**
     * See getKeyByAnnotation(MajorKey.class)
     * @return
     * @throws NullKeyException 
     */
    @Override
    public   List<String> getMajorKey(Object o) throws NullKeyException {
        return getKeyByAnnotation(o,Id.class);
        
    }
    
    
    
    /**
     * Seek for @Major key and create
     * "fieldname/fieldvalue/fieldname/fieldvalue/"
     *
     *
     * @param type FindingAnnoation Target : MajorKey or MinorKey
     * @return
     * @throws com.hlex.ondb.exception.NullKeyException
     */        
    public   List<String> getKeyByAnnotation(Object o,Class<? extends Annotation> type) throws NullKeyException {
    
        //returned variable
        List<String> key = new ArrayList();

        //field all field for @MajorKey
        Field[] fs = FieldUtils.getAllFields(o.getClass());
        for (Field f : fs) {
            Annotation mjk = f.getAnnotation(type);
            Object value = null;
            if (mjk != null) {
                try {
                    value = FieldUtils.readField(o, f.getName(), true);
                    //null value case
                    if (value == null) {
                        throw new NullKeyException(f.getName() + " has null value");
                    }

                    //add /fieldname/fieldvalue
                    key.add(f.getName());
                    key.add(value.toString());
                    
                    
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(AnnoEntityHelper.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        //no @majorkey case
        if (key.isEmpty()) {
            throw new NullKeyException("no "+type.getSimpleName() +" key");
        }

        return key;
    }

    

}
