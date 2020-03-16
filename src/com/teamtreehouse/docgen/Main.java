package com.teamtreehouse.docgen;

import com.teamtreehouse.math.MathUtils;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
//        // Get a class object
//        Class<?> clazz = MathUtils.class;
//
//        // Get all declared methods
//        Method[] methods = clazz.getDeclaredMethods();
//
//        // Loop over the nethods
//        for (Method m : methods){
//            // Display method name
//            System.out.printf("name %s%n", m.getName() );
//
//            System.out.printf("\t params: %s%n", m.getParameterCount());
//            // return type
//            System.out.printf("\t return type: %s%n", m.getReturnType().getSimpleName());
//            // modifiers
//            int mods = m.getModifiers();
//           // System.out.printf("\tmodifers: %s%n", mods);
//            String modStr = Modifier.toString(mods);
//            System.out.printf("\tmodifers: %s%n", modStr);
//        }

        // TODO: Process the MathUtils class's annotations
        DocProcessor.process(MathUtils.class);

    }
}