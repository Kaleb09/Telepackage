package com.kaleb.ethio;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataBaseHelper extends SQLiteOpenHelper {
	public DataBaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase _db) {

		_db.execSQL(LoginDataBaseAdapter.CREATE_tabnameet_TABLE);
		_db.execSQL(LoginDataBaseAdapter.CREATE_tabnameetam_TABLE);
		_db.execSQL(LoginDataBaseAdapter.CREATE_tabnamesaf_TABLE);
		_db.execSQL(LoginDataBaseAdapter.CREATE_tabnamesafam_TABLE);
		_db.execSQL(LoginDataBaseAdapter.CREATE_subtabsaf_TABLE);
		_db.execSQL(LoginDataBaseAdapter.CREATE_subtabsafam_TABLE);
		_db.execSQL(LoginDataBaseAdapter.CREATE_subtabet_TABLE);
		_db.execSQL(LoginDataBaseAdapter.CREATE_subtabetam_TABLE);
		_db.execSQL(LoginDataBaseAdapter.CREATE_holiday_TABLE);
		_db.execSQL(LoginDataBaseAdapter.CREATE_temp_TABLE);
		_db.execSQL(LoginDataBaseAdapter.CREATE_daily_TABLE);
		_db.execSQL(LoginDataBaseAdapter.CREATE_weekly_TABLE);
		_db.execSQL(LoginDataBaseAdapter.CREATE_monthly_TABLE);
		_db.execSQL(LoginDataBaseAdapter.CREATE_night_TABLE);
		_db.execSQL(LoginDataBaseAdapter.CREATE_dailyam_TABLE);
		_db.execSQL(LoginDataBaseAdapter.CREATE_weeklyam_TABLE);
		_db.execSQL(LoginDataBaseAdapter.CREATE_monthlyam_TABLE);
		_db.execSQL(LoginDataBaseAdapter.CREATE_nightam_TABLE);
		_db.execSQL(LoginDataBaseAdapter.CREATE_dailysaf_TABLE);
		_db.execSQL(LoginDataBaseAdapter.CREATE_weeklysaf_TABLE);
		_db.execSQL(LoginDataBaseAdapter.CREATE_monthlysaf_TABLE);
		_db.execSQL(LoginDataBaseAdapter.CREATE_nightsaf_TABLE);
		_db.execSQL(LoginDataBaseAdapter.CREATE_dailyamsaf_TABLE);
		_db.execSQL(LoginDataBaseAdapter.CREATE_weeklyamsaf_TABLE);
		_db.execSQL(LoginDataBaseAdapter.CREATE_monthlyamsaf_TABLE);
		_db.execSQL(LoginDataBaseAdapter.CREATE_nightamsaf_TABLE);
		/*_db.execSQL(LoginDataBaseAdapter.CREATE_tab_TABLE);
		_db.execSQL(LoginDataBaseAdapter.CREATE_maintab_TABLE);*/


	}

	@Override
	public void onUpgrade(SQLiteDatabase _db, int _oldVersion, int _newVersion) {
		// Log the version upgrade.
		Log.w("TaskDBAdapter", "Upgrading from version " + _oldVersion + " to " + _newVersion + ", which will destroy all old data");
		_db.execSQL("DROP TABLE IF EXISTS " + "TEMPLATE");
		onCreate(_db);
	}
}