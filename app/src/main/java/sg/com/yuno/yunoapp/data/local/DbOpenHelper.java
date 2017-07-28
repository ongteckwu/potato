package sg.com.yuno.yunoapp.data.local;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import javax.inject.Inject;
import javax.inject.Singleton;

import sg.com.yuno.yunoapp.injection.ApplicationContext;
import sg.com.yuno.yunoapp.injection.DatabaseInfo;

@Singleton
public class DbOpenHelper extends SQLiteOpenHelper {


    @Inject
    public DbOpenHelper(@ApplicationContext Context context,
                        @DatabaseInfo String dbName,
                        @DatabaseInfo Integer version) {
        super(context, dbName, null, version);
    }

    @Override
    public void onConfigure(SQLiteDatabase db) {
        super.onConfigure(db);
        //Uncomment line below if you want to enable foreign keys
        //db.execSQL("PRAGMA foreign_keys=ON;");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.beginTransaction();
        try {
            db.execSQL(Db.RibotProfileTable.CREATE);
            //Add other tables here
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) { }

}
