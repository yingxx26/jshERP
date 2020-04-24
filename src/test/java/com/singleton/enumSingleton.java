package com.singleton;

public class enumSingleton {
   private static boolean flag = true;

    private enumSingleton() {

    }

    public static enumSingleton getInstance(){
        return singleEnum.SINGLETON.getInstance();
    }


    private enum singleEnum{
        SINGLETON;

        private enumSingleton singleton;

        //jvm保证枚举的构造方法只被调用一次
        singleEnum(){
            singleton = new enumSingleton();
            System.out.println("111" );
        }

        private enumSingleton getInstance(){
            return singleton;
        }
    }
}

