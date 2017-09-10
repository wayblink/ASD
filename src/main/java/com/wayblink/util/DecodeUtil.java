package com.wayblink.util;

import java.io.ByteArrayOutputStream;

public class DecodeUtil {
        public static String decode(String bytes){
          ByteArrayOutputStream baos=new ByteArrayOutputStream(bytes.length()/2);
          String hexString="0123456789ABCDEF";
          for(int i=0;i<bytes.length();i+=2)
          baos.write((hexString.indexOf(bytes.charAt(i))<<4 |hexString.indexOf(bytes.charAt(i+1))));
          return new String(baos.toByteArray());
        }

        public static String deleteFlag(String input,String flag){
            StringBuilder sb=new StringBuilder();
            int step=flag.length();
            int i=0,j=i+step;
            int n=input.length();
            while(i<n&&j-i==step){
                if(input.substring(i,j).equals(flag)){
                    i+=step;
                    j+=step;
                }else{
                    sb.append(input.substring(i,j));
                    i+=step;
                    j+=step;
                }
                if(j>n){
                    j=n;
                }
            }
            return sb.toString();
        }

        public static String filter(String input){
            StringBuilder sb=new StringBuilder();
            int n=input.length();
            int i=0;
            String regex="%[0-9A-F][0-9A-F]";
            StringBuilder temp=new StringBuilder();

            while(i+3<=n){
                if(input.substring(i, i+3).matches(regex)){
                    temp.append(input.substring(i+1,i+3));
                    i+=3;
                }else{
                    sb.append(decode(temp.toString()));
                    temp=new StringBuilder();
                    sb.append(input.charAt(i));
                    i++;
                }
            }
            sb.append(decode(temp.toString()));
            sb.append(input.substring(i));
            return sb.toString();
        }
}
