package com.ai.aboutExceptions;

public class HugeTraffic extends Exception{

    public HugeTraffic(String name){
        super(name);
    }

    public static void main(String[] args) throws HugeTraffic {
        if("Hyderabad" == "Hyderbad"){
            try{
            throw new HugeTraffic("Takes long time to reach destination");
            }catch (HugeTraffic hf){
                System.out.println(hf.toString());
            }
        }
    }
}
