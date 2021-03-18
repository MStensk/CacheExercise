public class Main {
    public static void main (String[] args){
        Cache userCache = new Cache();
        userCache.set("fedbøsse",67);
        userCache.get();
        userCache.delete(userCache.key);
        userCache.get();
        userCache.has();






    }
}
