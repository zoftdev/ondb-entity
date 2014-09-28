/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hlex.ondb.entity;

import com.hlex.ondb.exception.NullKeyException;
import com.google.gson.Gson;
import com.hlex.ondb.anno.MajorKey;
import com.hlex.ondb.anno.MinorKey;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.reflect.FieldUtils;

/**
 *
 * @author thisadee
 */
public abstract class AnnotateKeyEntity implements ONDBEntity {

    
    public String getStringValue() {
        return (new Gson()).toJson(this);
    }

    @Override
    public byte[] getValue() {
        return getStringValue().getBytes();
    }
    
    
    /**
     * see getKeyByAnnotation(MinorKey.class)
     * @return 
     * @throws NullKeyException 
     */
    @Override
    public List<String> getMinorKey() throws NullKeyException {
        return getKeyByAnnotation(MinorKey.class);
    }

    /**
     * See getKeyByAnnotation(MajorKey.class)
     * @return
     * @throws NullKeyException 
     */
    @Override
    public List<String> getMajorKey() throws NullKeyException {
        return getKeyByAnnotation(MajorKey.class);
        
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
    public List<String> getKeyByAnnotation(Class<? extends Annotation> type) throws NullKeyException {
    
        //returned variable
        List<String> key = new ArrayList();

        //field all field for @MajorKey
        Field[] fs = FieldUtils.getAllFields(this.getClass());
        for (Field f : fs) {
            Annotation mjk = f.getAnnotation(type);
            Object value = null;
            if (mjk != null) {
                try {
                    value = FieldUtils.readField(this, f.getName(), true);
                    //null value case
                    if (value == null) {
                        throw new NullKeyException(f.getName() + " has null value");
                    }

                    //add /fieldname/fieldvalue
                    key.add(f.getName());
                    key.add(value.toString());
                    
                    
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(AnnotateKeyEntity.class.getName()).log(Level.SEVERE, null, ex);
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
