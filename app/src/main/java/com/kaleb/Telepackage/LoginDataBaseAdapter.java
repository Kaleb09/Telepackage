package com.kaleb.Telepackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;


public class LoginDataBaseAdapter {
	private static final String tableweekly="weekly",tabledaily="daily",tablemonhly="monthly",tablenight="night";
	private static final String databasename ="jobinfo",tablename="ussd",tablename1="maintab",tablename2="subtab",step="step",description="description",stepgift="stepgift";
	private static final String tab1="tab1",foryou1="foryou1",gift1="gift1",tab2="tab2",foryou2="foryou2",gift2="gift2",tab3="tab3",foryou3="foryou3",gift3="gift3",tab4="tab4",foryou4="foryou4",gift4="gift4",tab5="tab5",foryou5="foryou5",gift5="gift5",tab6="tab6",foryou6="foryou6",gift6="gift6",tab7="tab7",foryou7="foryou7",gift7="gift7",tab8="tab8",foryou8="foryou8",gift8="gift8",tab9="tab9",foryou9="foryou9",gift9="gift9",tab10="tab10"
			,foryou10="foryou10",gift10="gift10",tab11="tab11",foryou11="foryou11",gift11="gift11",tab12="tab12",foryou12="foryou12",gift12="gift12",tab13="tab13",tab14="tab14",tab15="tab15",tab16="tab16";
	private static final String subtab1="daily",subtab2="weekly",subtab3="monthly",subtab4="night";
	static final String DATABASE_NAME = "votersystem.db";
	static final int DATABASE_VERSION = 1;
	private LoginDataBaseAdapter loginDataBaseAdapter;
	static final String CREATE_temp_TABLE = "create table " + tablename +
			"( " + step+"  text,"+stepgift+"  text," +description+" text) ";
	static final String CREATE_maintab_TABLE = "create table " + tablename1 +
			"( " + tab1+"  text,"+tab2+"  text," +tab3+"  text,"+tab4+"  text,"+tab5+"  text,"+tab6+"  text,"+tab7+"  text,"+tab8+"  text,"
			+tab9+"  text,"+tab10+"  text,"+tab11+"  text,"+tab12+"  text,"+tab13+"  text,"+tab14+"  text,"+tab15+"  text,"
			+tab16+" text) ";
	static final String CREATE_subtab_TABLE = "create table " + tablename2 +
			"( " + subtab1+"  text,"+subtab2+"  text," +subtab3+"  text,"+tab4+"  text,"+subtab4+" text) ";
	static final String CREATE_daily_TABLE = "create table " + tabledaily +
			"( " + tab1+"  text,"+foryou1+"  text," +gift1+"  text,"+ tab2+"  text,"+foryou2+"  text," +gift2+"  text,"+ tab3+"  text,"+foryou3+"  text," +gift3+ tab4+"  text,"+foryou4+"  text," +gift4+"  text,"+ tab5+"  text,"+foryou5+"  text," +gift5
			+ tab6+"  text,"+foryou6+"  text," +gift6+"  text,"+"  text,"+ tab7+"  text,"+foryou7+"  text," +gift7+"  text,"+ tab8+"  text,"+foryou8+"  text," +gift8+"  text,"+ tab9+"  text,"+foryou9+"  text," +gift9+"  text,"+ tab10+"  text,"+foryou10+"  text," +gift10+"  text,"+ tab11+"  text,"+foryou11+"  text," +gift11+ tab12+"  text,"+foryou12+"  text," +gift12+" text) ";
	static final String CREATE_weekly_TABLE = "create table " + tableweekly +
			"( " + tab1+"  text,"+foryou1+"  text," +gift1+"  text,"+ tab2+"  text,"+foryou2+"  text," +gift2+"  text,"+ tab3+"  text,"+foryou3+"  text," +gift3+ tab4+"  text,"+foryou4+"  text," +gift4+"  text,"+ tab5+"  text,"+foryou5+"  text," +gift5
			+ tab6+"  text,"+foryou6+"  text," +gift6+"  text,"+"  text,"+ tab7+"  text,"+foryou7+"  text," +gift7+"  text,"+ tab8+"  text,"+foryou8+"  text," +gift8+"  text,"+ tab9+"  text,"+foryou9+"  text," +gift9+"  text,"+ tab10+"  text,"+foryou10+"  text," +gift10+"  text,"+ tab11+"  text,"+foryou11+"  text," +gift11+ tab12+"  text,"+foryou12+"  text," +gift12+" text) ";
	static final String CREATE_monthly_TABLE = "create table " + tablemonhly +
			"( " + tab1+"  text,"+foryou1+"  text," +gift1+"  text,"+ tab2+"  text,"+foryou2+"  text," +gift2+"  text,"+ tab3+"  text,"+foryou3+"  text," +gift3+ tab4+"  text,"+foryou4+"  text," +gift4+"  text,"+ tab5+"  text,"+foryou5+"  text," +gift5
			+ tab6+"  text,"+foryou6+"  text," +gift6+"  text,"+"  text,"+ tab7+"  text,"+foryou7+"  text," +gift7+"  text,"+ tab8+"  text,"+foryou8+"  text," +gift8+"  text,"+ tab9+"  text,"+foryou9+"  text," +gift9+"  text,"+ tab10+"  text,"+foryou10+"  text," +gift10+"  text,"+ tab11+"  text,"+foryou11+"  text," +gift11+ tab12+"  text,"+foryou12+"  text," +gift12+" text) ";
	static final String CREATE_night_TABLE = "create table " + tablenight +
			"( " + tab1+"  text,"+foryou1+"  text," +gift1+"  text,"+ tab2+"  text,"+foryou2+"  text," +gift2+"  text,"+ tab3+"  text,"+foryou3+"  text," +gift3+ tab4+"  text,"+foryou4+"  text," +gift4+"  text,"+ tab5+"  text,"+foryou5+"  text," +gift5
			+ tab6+"  text,"+foryou6+"  text," +gift6+"  text,"+"  text,"+ tab7+"  text,"+foryou7+"  text," +gift7+"  text,"+ tab8+"  text,"+foryou8+"  text," +gift8+"  text,"+ tab9+"  text,"+foryou9+"  text," +gift9+"  text,"+ tab10+"  text,"+foryou10+"  text," +gift10+"  text,"+ tab11+"  text,"+foryou11+"  text," +gift11+ tab12+"  text,"+foryou12+"  text," +gift12+" text) ";
	public SQLiteDatabase db;
	private final Context context;
	private DataBaseHelper dbHelper;
	private Cursor mCursor;
	String resul = "";
	int n = 0;

	public LoginDataBaseAdapter(Context _context) {
		context = _context;
		dbHelper = new DataBaseHelper(context, DATABASE_NAME, null, DATABASE_VERSION);

	}

	public LoginDataBaseAdapter open() throws SQLException {
		db = dbHelper.getWritableDatabase();
		return this;
	}

	public void close() {
		db.close();
	}

	public SQLiteDatabase getDatabaseInstance() {
		return db;
	}
	public int deleteEntry(String password) {
		String where = "PASSWORD=?";
		int numberOFEntriesDeleted = db.delete("LOGIN", where, new String[]{password});
		return numberOFEntriesDeleted;
	}
	public void delete(String password) {
		String where = "FIRSTNAME=?";
		db.delete("ADMIN", where, new String[]{password});
	}

	public String getSinlgeEntry(String password) {
		Cursor cursor = db.query("LOGIN", null, " PASSWORD=?", new String[]{password}, null, null, null);
		if (cursor.getCount() < 1) // UserName Not Exist
		{
			cursor.close();
			return "NOT EXIST";
		}
		cursor.moveToFirst();
		String repassword = cursor.getString(cursor.getColumnIndex("REPASSWORD"));
		cursor.close();
		return repassword;
	}
	public void updateEntry(String password, String repassword) {
		ContentValues updatedValues = new ContentValues();
		updatedValues.put("PASSWORD", password);
		updatedValues.put("REPASSWORD", repassword);
		updatedValues.put("SECURITYHINT", repassword);
		String where = "USERNAME = ?";
		db.update("LOGIN", updatedValues, where, new String[]{password});
	}public void deletejob(String table) {
		String where = "delete from "+table;
		db.delete(table,null,null);
	}
	public boolean isempty1(String tabl){
		String cou="SELECT count(*) FROM "+tabl;
		Cursor c=db.rawQuery(cou,null);
		c.moveToFirst();
		if(c.getInt(0)==0){
			return true;
		}else {
			return false;
		}
	}


	public void inserttotable(MyListData myListData) {
		ContentValues contentValues = new ContentValues();
		contentValues.put(step,myListData.getStep());
		contentValues.put(stepgift,myListData.stepgift);
		contentValues.put(description,myListData.getDescription());
		db.insert(tablename, null, contentValues);
	}
	public List<String> getAllFirstName() {

		List<String> todos = new ArrayList<String>();
		String selectQuery = "SELECT  * FROM " + "ADMIN";
		Log.e("admin", selectQuery);
		Cursor c = db.rawQuery(selectQuery, null);
		// looping through all rows and adding to list
		if (c.moveToFirst()) {
			do {
				todos.add(c.getString(1));
			} while (c.moveToNext());
		}
		return todos;
	}
	public ArrayList<MyListData> getaccount() {
		String sql="Select*from "+tablename+" ";
		Cursor cursor = db.rawQuery(sql,null);
		if (cursor != null)
			cursor.moveToFirst();

		ArrayList<MyListData> arrayList = new ArrayList<>();
		if(cursor.moveToFirst()){
			do{
			MyListData myListData = new MyListData();myListData.setStep(cursor.getString(0));
				myListData.setStepgift( cursor.getString(1));
				myListData.setDescription( cursor.getString(2));
				arrayList.add(myListData);
			}while (cursor.moveToNext());

		}
		cursor.close();
		return arrayList;
	}
}
