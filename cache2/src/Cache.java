public class Cache {
    public String key = "default";
    private int value = 0;

    public void set(String key, int value) {
        this.key = key;
        this.value = value;
    }
    public String get() {
        System.out.println(key + value);
        return key + value;

    }
    public boolean has() {
        if (key == get()) {
            System.out.println(key);
            return true;
        }
        return false;
    }
    public void delete(String key) {
        if(key!="default") {
            set("default",0);
        }
    }

}
