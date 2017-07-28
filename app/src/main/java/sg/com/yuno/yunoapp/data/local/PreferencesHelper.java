package sg.com.yuno.yunoapp.data.local;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Inject;
import javax.inject.Singleton;

import sg.com.yuno.yunoapp.injection.ApplicationContext;

@Singleton
public class PreferencesHelper {

    public static final String PREF_FILE_NAME = "android_boilerplate_pref_file";

    private final SharedPreferences mPref;

    @Inject
    public PreferencesHelper(@ApplicationContext Context context) {
        mPref = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
    }

    public void put(String key, String value) {
        mPref.edit().putString(key, value).apply();
    }

    public void put(String key, int value) {
        mPref.edit().putInt(key, value).apply();
    }

    public void put(String key, float value) {
        mPref.edit().putFloat(key, value).apply();
    }

    public void put(String key, boolean value) {
        mPref.edit().putBoolean(key, value).apply();
    }

    public String get(String key, String defaultValue) {
        return mPref.getString(key, defaultValue);
    }

    public Integer get(String key, int defaultValue) {
        return mPref.getInt(key, defaultValue);
    }

    public Float get(String key, float defaultValue) {
        return mPref.getFloat(key, defaultValue);
    }

    public Boolean get(String key, boolean defaultValue) {
        return mPref.getBoolean(key, defaultValue);
    }

    public void deleteSavedData(String key) {
        mPref.edit().remove(key).apply();
    }
    public void clear() {
        mPref.edit().clear().apply();
    }

}
