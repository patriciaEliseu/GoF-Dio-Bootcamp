package one.digitalinovation.gof;

/**
 * Singleton "lazyholder",
 */

public class SingletonLazyHolder  {
    private static class InstanceHolder {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }
    public  static SingletonLazyHolder getInstance() {
        return InstanceHolder.instance;
    }


}


