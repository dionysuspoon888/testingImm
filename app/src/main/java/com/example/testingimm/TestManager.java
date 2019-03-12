package com.example.testingimm;

import android.content.Intent;

/**
 * Created by D on 3/12/2019.
 */

public class TestManager {

    public static class JXBuilder<T>{
        private final Class<T> type;

        public JXBuilder(Class<T> type) {
            this.type = type;
        }

        public Class<T> getMyType() {
            return this.type;
        }

        public String build(){
            String tmpString = "";

            AmazingModel model1 = new AmazingModel();

            tmpString =  type.toString();

            String tmpString1 = model1.getClass().toString();

            String tmpString2 = AmazingModel.class.toString();
            //class com.example.testingimm.AmazingModel

            return tmpString;
        }
    }

}
