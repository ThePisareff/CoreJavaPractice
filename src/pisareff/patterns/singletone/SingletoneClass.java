package pisareff.patterns.singletone;

public class SingletoneClass {

    private static SingletoneClass instance = null;
    private String data = "";
    private SingletoneClass() {
    }

    public static SingletoneClass getInstance(){
        if (instance == null){
            instance = new SingletoneClass();
            return instance;
        } else {
            return instance;
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
