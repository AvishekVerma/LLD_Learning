package designPatterns.singelton;

public class DBConnection {
    private static DBConnection db = null;

    private DBConnection(){

    }

    private static DBConnection createInstance(){
        if(db==null)
            db=new DBConnection();
        return db;
    }
}
