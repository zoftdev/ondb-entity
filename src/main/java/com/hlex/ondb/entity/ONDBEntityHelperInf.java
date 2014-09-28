/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hlex.ondb.entity;

import com.hlex.ondb.exception.NullKeyException;
import java.util.List;

/**
 *
 * @author thisadee
 */
interface ONDBEntityHelperInf {
    public List<String> getMajorKey() throws NullKeyException;
    public List<String> getMinorKey() throws NullKeyException;
    public byte[] getByteValue();
//    public String parseValue();
}
