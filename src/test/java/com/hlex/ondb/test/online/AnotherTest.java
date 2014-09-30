/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hlex.ondb.test.online;

import com.hlex.ondb.entity.OndbEntityHelper;
import com.hlex.ondb.exception.NullKeyException;
import com.hlex.ondb.test.entity.Activity;
import java.util.Date;
import oracle.kv.KVStore;
import oracle.kv.KVStoreConfig;
import oracle.kv.KVStoreFactory;
import org.junit.Test;
import org.junit.Ignore;

/**
 *
 * @author thisadee
 */
@Ignore
public class AnotherTest {
    
    Activity a=new Activity("engine2_3g", "mytid","myactid");
    OndbEntityHelper ahelper=new OndbEntityHelper();
    private KVStoreConfig config=new KVStoreConfig("sbmrmv", new String[]{"localhost:5000","localhost:5020","localhost:5040"});
    
    KVStore ks=KVStoreFactory.getStore(config);   
    
    public AnotherTest(){
//        config.setSocketOpenTimeout(2, TimeUnit.SECONDS);
//        config.setRequestTimeout(1, TimeUnit.SECONDS);
        a.setCreate_dt(new Date());
        a.setProcess_msec(2555);
        a.setTranId("anotherid");
        a.setDescription("It would be nice if we could write a single sort method that could sort the elements in an Integer array, a String array or an array of any type that supports ordering.\n" +
"\n" +
"Java Generic methods and generic classes enable programmers to specify, with a single method declaration, a set of related methods or, with a single class declaration, a set of related types, respectively.\n" +
"\n" +
"Generics also provide compile-time type safety that allows programmers to catch invalid types at compile time.\n" +
"\n" +
"Using Java Generic concept, we might write a generic method for sorting an array of objects, then invoke the generic method with Integer arrays, Double arrays, String arrays and so on, to sort the array elements.\n" +
"\n" +
"Generic Methods:\n" +
"You can write a single generic method declaration that can be called with arguments of different types. Based on the types of the arguments passed to the generic method, the compiler handles each method call appropriately. Following are the rules to define Generic Methods:\n" +
"\n" +
"All generic method declarations have a type parameter section delimited by angle brackets (< and >) that precedes the method's return type ( < E > in the next example).\n" +
"\n" +
"Each type parameter section contains one or more type parameters separated by commas. A type parameter, also known as a type variable, is an identifier that specifies a generic type name.\n" +
"\n" +
"The type parameters can be used to declare the return type and act as placeholders for the types of the arguments passed to the generic method, which are known as actual type arguments.\n" +
"\n" +
"A generic method's body is declared like that of any other method. Note that type parameters can represent only reference types, not primitive types (like int, double and char).");
        
    }
    
    
    @Test
    public void testsome() throws NullKeyException{
      
        
    }
    
    

}
