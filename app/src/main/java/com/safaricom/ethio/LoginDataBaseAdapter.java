package com.kaleb.ethio;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class LoginDataBaseAdapter {
	public static final String ID="idnum", tabletab="tabletab",tabcount="tabcount",subtabcount="subtabcount",tab1name="tab1name",tab2name="tab2name",tab3name="tab3name",tab4name="ta41name",tab5name="tab5name",tab6name="tab6name",tab7name="tab7name",
			tab8name="tab8name",tab9name="tab9name",tab10name="tab10name",tab11name="tab11name";
	public static String subtabsaf="subtabsaf",subtabsafam="subtabsafam",subtabet="subtabet",subtabetam="subtabetam",
			tab1subtab1name="tab1subtab1name",tab1subtab2name="tab1subtab2name",tab1subtab3name="tab1subtab3name",tab1subtab4name="tab1subtab4name",
			tab2subtab1name="tab2subtab1name",tab2subtab2name="tab2subtab2name",tab2subtab3name="tab2subtab3name",tab2subtab4name="tab2subtab4name",
			tab3subtab1name="tab3subtab1name",tab3subtab2name="tab3subtab2name",tab3subtab3name="tab3subtab3name",tab3subtab4name="tab3subtab4name",
			tab4subtab1name="tab4subtab1name",tab4subtab2name="tab4subtab2name",tab4subtab3name="tab4subtab3name",tab4subtab4name="tab4subtab4name",
			tab5subtab1name="tab5subtab1name",tab5subtab2name="tab5subtab2name",tab5subtab3name="tab5subtab3name",tab5subtab4name="tab5subtab4name",
			tab6subtab1name="tab6subtab1name",tab6subtab2name="tab6subtab2name",tab6subtab3name="tab6subtab3name",tab6subtab4name="tab6subtab4name",
			tab7subtab1name="tab7subtab1name",tab7subtab2name="tab7subtab2name",tab7subtab3name="tab7subtab3name",tab7subtab4name="tab7subtab4name",
			tab8subtab1name="tab8subtab1name",tab8subtab2name="tab8subtab2name",tab8subtab3name="tab8subtab3name",tab8subtab4name="tab8subtab4name",
			tab9subtab1name="tab9subtab1name",tab9subtab2name="tab9subtab2name",tab9subtab3name="tab9subtab3name",tab9subtab4name="tab9subtab4name",
			tab10subtab1name="tab10subtab1name",tab10subtab2name="tab10subtab2name",tab10subtab3name="tab10subtab3name",tab10subtab4name="tab10subtab4name",
			tab11subtab1name="tab11subtab1name",tab11subtab2name="tab11subtab2name",tab11subtab3name="tab11subtab3name",tab11subtab4name="tab11subtab4name",
			tab12subtab1name="tab12subtab1name",tab12subtab2name="tab12subtab2name",tab12subtab3name="tab12subtab3name",tab12subtab4name="tab12subtab4name";

	static  String CREATE_subtabsaf_TABLE = "create table " + subtabsaf +
			"( " + tab1subtab1name+"  text,"+tab1subtab2name+"  text," +tab1subtab3name+"  text,"+tab1subtab4name+"  text,"+
			tab2subtab1name+"  text,"+tab2subtab2name+"  text," +tab2subtab3name+"  text,"+tab2subtab4name+"  text,"+
			tab3subtab1name+"  text,"+tab3subtab2name+"  text," +tab3subtab3name+"  text,"+tab3subtab4name+"  text,"+
			tab4subtab1name+"  text,"+tab4subtab2name+"  text," +tab4subtab3name+"  text,"+tab4subtab4name+"  text,"+
			tab5subtab1name+"  text,"+tab5subtab2name+"  text," +tab5subtab3name+"  text,"+tab5subtab4name+"  text,"+
			tab6subtab1name+"  text,"+tab6subtab2name+"  text," +tab6subtab3name+"  text,"+tab6subtab4name+"  text,"+
			tab7subtab1name+"  text,"+tab7subtab2name+"  text," +tab7subtab3name+"  text,"+tab7subtab4name+"  text,"+
			tab8subtab1name+"  text,"+tab8subtab2name+"  text," +tab8subtab3name+"  text,"+tab8subtab4name+"  text,"+
			tab9subtab1name+"  text,"+tab9subtab2name+"  text," +tab9subtab3name+"  text,"+tab9subtab4name+"  text,"+
			tab10subtab1name+"  text,"+tab10subtab2name+"  text," +tab10subtab3name+"  text,"+tab10subtab4name+"  text,"+
			tab11subtab1name+"  text,"+tab11subtab2name+"  text," +tab11subtab3name+"  text,"+tab11subtab4name+"  text,"+
			tab12subtab1name+"  text,"+tab12subtab2name+"  text," +tab12subtab3name+"  text,"+tab12subtab4name+"  text,"+ID+" INTEGER PRIMARY KEY AUTOINCREMENT) ";

	static final String CREATE_subtabsafam_TABLE = "create table " + subtabsafam +
			"( " + tab1subtab1name+"  text,"+tab1subtab2name+"  text," +tab1subtab3name+"  text,"+tab1subtab4name+"  text,"+
			tab2subtab1name+"  text,"+tab2subtab2name+"  text," +tab2subtab3name+"  text,"+tab2subtab4name+"  text,"+
			tab3subtab1name+"  text,"+tab3subtab2name+"  text," +tab3subtab3name+"  text,"+tab3subtab4name+"  text,"+
			tab4subtab1name+"  text,"+tab4subtab2name+"  text," +tab4subtab3name+"  text,"+tab4subtab4name+"  text,"+
			tab5subtab1name+"  text,"+tab5subtab2name+"  text," +tab5subtab3name+"  text,"+tab5subtab4name+"  text,"+
			tab6subtab1name+"  text,"+tab6subtab2name+"  text," +tab6subtab3name+"  text,"+tab6subtab4name+"  text,"+
			tab7subtab1name+"  text,"+tab7subtab2name+"  text," +tab7subtab3name+"  text,"+tab7subtab4name+"  text,"+
			tab8subtab1name+"  text,"+tab8subtab2name+"  text," +tab8subtab3name+"  text,"+tab8subtab4name+"  text,"+
			tab9subtab1name+"  text,"+tab9subtab2name+"  text," +tab9subtab3name+"  text,"+tab9subtab4name+"  text,"+
			tab10subtab1name+"  text,"+tab10subtab2name+"  text," +tab10subtab3name+"  text,"+tab10subtab4name+"  text,"+
			tab11subtab1name+"  text,"+tab11subtab2name+"  text," +tab11subtab3name+"  text,"+tab11subtab4name+"  text,"+
			tab12subtab1name+"  text,"+tab12subtab2name+"  text," +tab12subtab3name+"  text,"+tab12subtab4name+"  text,"+ID+" INTEGER PRIMARY KEY AUTOINCREMENT) ";
	static final String CREATE_subtabet_TABLE = "create table " + subtabet +
			"( " + tab1subtab1name+"  text,"+tab1subtab2name+"  text," +tab1subtab3name+"  text,"+tab1subtab4name+"  text,"+
			tab2subtab1name+"  text,"+tab2subtab2name+"  text," +tab2subtab3name+"  text,"+tab2subtab4name+"  text,"+
			tab3subtab1name+"  text,"+tab3subtab2name+"  text," +tab3subtab3name+"  text,"+tab3subtab4name+"  text,"+
			tab4subtab1name+"  text,"+tab4subtab2name+"  text," +tab4subtab3name+"  text,"+tab4subtab4name+"  text,"+
			tab5subtab1name+"  text,"+tab5subtab2name+"  text," +tab5subtab3name+"  text,"+tab5subtab4name+"  text,"+
			tab6subtab1name+"  text,"+tab6subtab2name+"  text," +tab6subtab3name+"  text,"+tab6subtab4name+"  text,"+
			tab7subtab1name+"  text,"+tab7subtab2name+"  text," +tab7subtab3name+"  text,"+tab7subtab4name+"  text,"+
			tab8subtab1name+"  text,"+tab8subtab2name+"  text," +tab8subtab3name+"  text,"+tab8subtab4name+"  text,"+
			tab9subtab1name+"  text,"+tab9subtab2name+"  text," +tab9subtab3name+"  text,"+tab9subtab4name+"  text,"+
			tab10subtab1name+"  text,"+tab10subtab2name+"  text," +tab10subtab3name+"  text,"+tab10subtab4name+"  text,"+
			tab11subtab1name+"  text,"+tab11subtab2name+"  text," +tab11subtab3name+"  text,"+tab11subtab4name+"  text,"+
			tab12subtab1name+"  text,"+tab12subtab2name+"  text," +tab12subtab3name+"  text,"+tab12subtab4name+"  text,"+ID+" INTEGER PRIMARY KEY AUTOINCREMENT) ";

	static final String CREATE_subtabetam_TABLE = "create table " + subtabetam +
			"( " + tab1subtab1name+"  text,"+tab1subtab2name+"  text," +tab1subtab3name+"  text,"+tab1subtab4name+"  text,"+
			tab2subtab1name+"  text,"+tab2subtab2name+"  text," +tab2subtab3name+"  text,"+tab2subtab4name+"  text,"+
			tab3subtab1name+"  text,"+tab3subtab2name+"  text," +tab3subtab3name+"  text,"+tab3subtab4name+"  text,"+
			tab4subtab1name+"  text,"+tab4subtab2name+"  text," +tab4subtab3name+"  text,"+tab4subtab4name+"  text,"+
			tab5subtab1name+"  text,"+tab5subtab2name+"  text," +tab5subtab3name+"  text,"+tab5subtab4name+"  text,"+
			tab6subtab1name+"  text,"+tab6subtab2name+"  text," +tab6subtab3name+"  text,"+tab6subtab4name+"  text,"+
			tab7subtab1name+"  text,"+tab7subtab2name+"  text," +tab7subtab3name+"  text,"+tab7subtab4name+"  text,"+
			tab8subtab1name+"  text,"+tab8subtab2name+"  text," +tab8subtab3name+"  text,"+tab8subtab4name+"  text,"+
			tab9subtab1name+"  text,"+tab9subtab2name+"  text," +tab9subtab3name+"  text,"+tab9subtab4name+"  text,"+
			tab10subtab1name+"  text,"+tab10subtab2name+"  text," +tab10subtab3name+"  text,"+tab10subtab4name+"  text,"+
			tab11subtab1name+"  text,"+tab11subtab2name+"  text," +tab11subtab3name+"  text,"+tab11subtab4name+"  text,"+
			tab12subtab1name+"  text,"+tab12subtab2name+"  text," +tab12subtab3name+"  text,"+tab12subtab4name+"  text,"+ID+" INTEGER PRIMARY KEY AUTOINCREMENT) ";

	public static  String tabnameet="tabnameet",tabnameetam="tabnameetam",tabnamesaf="tabnamesaf",tabnamesafam="tabnamesafam",tabname1="tabname1",tabname2="tabname2",tabname3="tabname3",
			tabname4="tabname4",tabname5="tabname5",tabname6="tabname6",tabname7="tabname7",
			tabname8="tabname8",tabname9="tabname9",tabname10="tabname10",tabname11="tabname11",tabname12="tabname12";

	static final String CREATE_tabnameet_TABLE = "create table " + tabnameet +
			"( " + tabname1+"  text,"+tabname2+"  text,"+tabname3+"  text," +tabname4+"  text," +tabname5+"  text," +tabname6+"  text," +
			tabname7+"  text," +tabname8+"  text," +tabname9+"  text," +tabname10+"  text," +tabname11+"  text," +tabname12+"  text,"+ID+" INTEGER PRIMARY KEY AUTOINCREMENT) ";

	static final String CREATE_tabnameetam_TABLE = "create table " + tabnameetam +
			"( " + tabname1+"  text,"+tabname2+"  text,"+tabname3+"  text," +tabname4+"  text," +tabname5+"  text," +tabname6+"  text," +
			tabname7+"  text," +tabname8+"  text," +tabname9+"  text," +tabname10+"  text," +tabname11+"  text," +tabname12+"  text,"+ID+" INTEGER PRIMARY KEY AUTOINCREMENT) ";

	static final String CREATE_tabnamesaf_TABLE = "create table " + tabnamesaf +
			"( " + tabname1+"  text,"+tabname2+"  text,"+tabname3+"  text," +tabname4+"  text," +tabname5+"  text," +tabname6+"  text," +
			tabname7+"  text," +tabname8+"  text," +tabname9+"  text," +tabname10+"  text," +tabname11+"  text," +tabname12+"  text,"+ID+" INTEGER PRIMARY KEY AUTOINCREMENT) ";

	static final String CREATE_tabnamesafam_TABLE = "create table " + tabnamesafam +
			"( " + tabname1+"  text,"+tabname2+"  text,"+tabname3+"  text," +tabname4+"  text," +tabname5+"  text," +tabname6+"  text," +
			tabname7+"  text," +tabname8+"  text," +tabname9+"  text," +tabname10+"  text," +tabname11+"  text," +tabname12+"  text,"+ID+" INTEGER PRIMARY KEY AUTOINCREMENT) ";


	//ID+" INTEGER PRIMARY KEY AUTOINCREMENT) "

	public static final String holipackage="holipackage",gift="gift",foryou="foryou",tableholiday = "holiday",tableweekly="weekly",tabledaily="daily",tablemonthly="monthly",tablenight="night",tableweeklyam="weeklyam",tabledailyam="dailyam",tablemonthlyam="monthlyam",tablenightam="nightam",
			tableweeklysaf="weeklysaf",tabledailysaf="dailysaf",tablemonthlysaf="monthlysaf",tablenightsaf="nightsaf",tableweeklyamsaf="weeklyamsaf",tabledailyamsaf="dailyamsaf",tablemonthlyamsaf="monthlyamsaf",tablenightamsaf="nightamsaf";
	public static final String databasename ="jobinfo",tablename="ussd",tablename1="maintab",tablename2="subtab",step="step",stepamharic="stepamharic",description="description",stepgift="stepgift";
	public static final String  tag1="tag1",tag2="tag2",tag3="tag3",tag4="tag4",tag5="tag5",tag6="tag6",tag7="tag7",tag8="tag8",tag9="tag9",tag10="tag10",tag11="tag11",tag12="tag12",tab1="tab1",foryou1="foryou1",gift1="gift1",tab2="tab2",foryou2="foryou2",gift2="gift2",tab3="tab3",foryou3="foryou3",gift3="gift3",tab4="tab4",foryou4="foryou4",gift4="gift4",tab5="tab5",foryou5="foryou5",gift5="gift5",tab6="tab6",foryou6="foryou6",gift6="gift6",tab7="tab7",foryou7="foryou7",gift7="gift7",tab8="tab8",foryou8="foryou8",gift8="gift8",tab9="tab9",foryou9="foryou9",gift9="gift9",tab10="tab10"
			,foryou10="foryou10",gift10="gift10",tab11="tab11",foryou11="foryou11",gift11="gift11",tab12="tab12",foryou12="foryou12",gift12="gift12",tab13="tab13",tab14="tab14",tab15="tab15",tab16="tab16";
	//public static final String subtab1="daily",subtab2="weekly",subtab3="monthly",subtab4="night";
	static final String DATABASE_NAME = "votersystem.db";
	static final int DATABASE_VERSION = 1;
	public LoginDataBaseAdapter loginDataBaseAdapter;
	static final String CREATE_temp_TABLE = "create table " + tablename +
			"( " +step+"  text,"+stepgift+"  text," +description+" text) ";

	static final String CREATE_holiday_TABLE = "create table " + tableholiday +
			"( " + holipackage+"  text,"+stepamharic+"  text,"+gift+"  text," +foryou+" text) ";





	static final String CREATE_daily_TABLE = "create table " + tabledaily +
			"( " +tab1+"  text,"+foryou1+"  text," +gift1+"  text,"+ tab2+"  text,"+foryou2+"  text," +gift2+"  text,"+ tab3+"  text,"+foryou3+"  text," +gift3+"  text,"+ tab4+"  text,"+foryou4+"  text," +gift4+"  text,"+ tab5+"  text,"+foryou5+"  text," +gift5
			+"  text," +tab6+"  text,"+foryou6+"  text," +gift6+"  text,"+ tab7+"  text,"+foryou7+"  text," +gift7+"  text,"+ tab8+"  text,"+foryou8+"  text," +gift8+"  text,"+ tab9+"  text,"+foryou9+"  text," +gift9+"  text,"+ tab10+"  text,"+foryou10+"  text," +gift10+"  text,"+ tab11+"  text,"+foryou11+"  text," +gift11+"  text,"+tab12+"  text,"+foryou12+"  text,"
			+gift12+"  text,"+tag1+"  text,"+tag2+"  text,"+tag3+"  text,"+tag4+"  text,"+tag5+"  text,"+tag6+"  text,"+tag7+"  text,"+tag8+"  text,"+tag9+"  text,"+tag10+"  text,"+tag11+"  text,"+tag12+"  text,"+ID+" INTEGER PRIMARY KEY AUTOINCREMENT) ";

	static final String CREATE_weekly_TABLE = "create table " + tableweekly +
			"( " + tab1+"  text,"+foryou1+"  text," +gift1+"  text,"+ tab2+"  text,"+foryou2+"  text," +gift2+"  text,"+ tab3+"  text,"+foryou3+"  text," +gift3+"  text,"+ tab4+"  text,"+foryou4+"  text," +gift4+"  text,"+ tab5+"  text,"+foryou5+"  text," +gift5
			+"  text,"+tab6+"  text,"+foryou6+"  text," +gift6+"  text,"+tab7+"  text,"+foryou7+"  text," +gift7+"  text,"+ tab8+"  text,"+foryou8+"  text," +gift8+"  text,"+ tab9+"  text,"+foryou9+"  text," +gift9+"  text,"+ tab10+"  text,"+foryou10+"  text," +gift10+"  text,"+ tab11+"  text,"+foryou11+"  text," +gift11+"  text,"+ tab12+"  text,"+foryou12+"  text,"
			+gift12+"  text,"+tag1+"  text,"+tag2+"  text,"+tag3+"  text,"+tag4+"  text,"+tag5+"  text,"+tag6+"  text,"+tag7+"  text,"+tag8+"  text,"+tag9+"  text,"+tag10+"  text,"+tag11+"  text,"+tag12+"  text,"+ID+" INTEGER PRIMARY KEY AUTOINCREMENT) ";

	static final String CREATE_monthly_TABLE = "create table " + tablemonthly +
			"( " + tab1+"  text,"+foryou1+"  text," +gift1+"  text,"+ tab2+"  text,"+foryou2+"  text," +gift2+"  text,"+ tab3+"  text,"+foryou3+"  text," +gift3+"  text,"+ tab4+"  text,"+foryou4+"  text," +gift4+"  text,"+ tab5+"  text,"+foryou5+"  text," +gift5
			+"  text,"+ tab6+"  text,"+foryou6+"  text," +gift6+"  text,"+ tab7+"  text,"+foryou7+"  text," +gift7+"  text,"+ tab8+"  text,"+foryou8+"  text," +gift8+"  text,"+ tab9+"  text,"+foryou9+"  text," +gift9+"  text,"+ tab10+"  text,"+foryou10+"  text," +gift10+"  text,"+ tab11+"  text,"+foryou11+"  text," +gift11+"  text,"+ tab12+"  text,"+foryou12+"  text,"
			+gift12+"  text,"+tag1+"  text,"+tag2+"  text,"+tag3+"  text,"+tag4+"  text,"+tag5+"  text,"+tag6+"  text,"+tag7+"  text,"+tag8+"  text,"+tag9+"  text,"+tag10+"  text,"+tag11+"  text,"+tag12+"  text,"+ID+" INTEGER PRIMARY KEY AUTOINCREMENT) ";

	static final String CREATE_night_TABLE = "create table " + tablenight +
			"( " + tab1+"  text,"+foryou1+"  text," +gift1+"  text,"+ tab2+"  text,"+foryou2+"  text," +gift2+"  text,"+ tab3+"  text,"+foryou3+"  text," +gift3+"  text,"+ tab4+"  text,"+foryou4+"  text," +gift4+"  text,"+ tab5+"  text,"+foryou5+"  text," +gift5
			+"  text,"+ tab6+"  text,"+foryou6+"  text," +gift6+"  text,"+tab7+"  text,"+foryou7+"  text," +gift7+"  text,"+ tab8+"  text,"+foryou8+"  text," +gift8+"  text,"+ tab9+"  text,"+foryou9+"  text," +gift9+"  text,"+ tab10+"  text,"+foryou10+"  text," +gift10+"  text,"+ tab11+"  text,"+foryou11+"  text," +gift11+"  text,"+ tab12+"  text,"+foryou12+"  text,"
			+gift12+"  text,"+tag1+"  text,"+tag2+"  text,"+tag3+"  text,"+tag4+"  text,"+tag5+"  text,"+tag6+"  text,"+tag7+"  text,"+tag8+"  text,"+tag9+"  text,"+tag10+"  text,"+tag11+"  text,"+tag12+"  text,"+ID+" INTEGER PRIMARY KEY AUTOINCREMENT) ";
	static final String CREATE_dailyam_TABLE = "create table " + tabledailyam +
			"( " + tab1+"  text,"+foryou1+"  text," +gift1+"  text,"+ tab2+"  text,"+foryou2+"  text," +gift2+"  text,"+ tab3+"  text,"+foryou3+"  text," +gift3+"  text,"+ tab4+"  text,"+foryou4+"  text," +gift4+"  text,"+ tab5+"  text,"+foryou5+"  text," +gift5
			+"  text,"+ tab6+"  text,"+foryou6+"  text," +gift6+"  text,"+tab7+"  text,"+foryou7+"  text," +gift7+"  text,"+ tab8+"  text,"+foryou8+"  text," +gift8+"  text,"+ tab9+"  text,"+foryou9+"  text," +gift9+"  text,"+ tab10+"  text,"+foryou10+"  text," +gift10+"  text,"+ tab11+"  text,"+foryou11+"  text," +gift11+"  text,"+ tab12+"  text,"+foryou12+"  text,"
			+gift12+"  text,"+tag1+"  text,"+tag2+"  text,"+tag3+"  text,"+tag4+"  text,"+tag5+"  text,"+tag6+"  text,"+tag7+"  text,"+tag8+"  text,"+tag9+"  text,"+tag10+"  text,"+tag11+"  text,"+tag12+"  text,"+ID+" INTEGER PRIMARY KEY AUTOINCREMENT) ";
	static final String CREATE_weeklyam_TABLE = "create table " + tableweeklyam +
			"( " + tab1+"  text,"+foryou1+"  text," +gift1+"  text,"+ tab2+"  text,"+foryou2+"  text," +gift2+"  text,"+ tab3+"  text,"+foryou3+"  text," +gift3+"  text,"+ tab4+"  text,"+foryou4+"  text," +gift4+"  text,"+ tab5+"  text,"+foryou5+"  text," +gift5
			+"  text,"+ tab6+"  text,"+foryou6+"  text," +gift6+"  text,"+tab7+"  text,"+foryou7+"  text," +gift7+"  text,"+ tab8+"  text,"+foryou8+"  text," +gift8+"  text,"+ tab9+"  text,"+foryou9+"  text," +gift9+"  text,"+ tab10+"  text,"+foryou10+"  text," +gift10+"  text,"+ tab11+"  text,"+foryou11+"  text," +gift11+"  text,"+ tab12+"  text,"+foryou12+"  text,"
			+gift12+"  text,"+tag1+"  text,"+tag2+"  text,"+tag3+"  text,"+tag4+"  text,"+tag5+"  text,"+tag6+"  text,"+tag7+"  text,"+tag8+"  text,"+tag9+"  text,"+tag10+"  text,"+tag11+"  text,"+tag12+"  text,"+ID+" INTEGER PRIMARY KEY AUTOINCREMENT) ";
	static final String CREATE_monthlyam_TABLE = "create table " + tablemonthlyam +
			"( " + tab1+"  text,"+foryou1+"  text," +gift1+"  text,"+ tab2+"  text,"+foryou2+"  text," +gift2+"  text,"+ tab3+"  text,"+foryou3+"  text," +gift3+"  text,"+ tab4+"  text,"+foryou4+"  text," +gift4+"  text,"+ tab5+"  text,"+foryou5+"  text," +gift5
			+"  text,"+ tab6+"  text,"+foryou6+"  text," +gift6+"  text,"+tab7+"  text,"+foryou7+"  text," +gift7+"  text,"+ tab8+"  text,"+foryou8+"  text," +gift8+"  text,"+ tab9+"  text,"+foryou9+"  text," +gift9+"  text,"+ tab10+"  text,"+foryou10+"  text," +gift10+"  text,"+ tab11+"  text,"+foryou11+"  text," +gift11+"  text,"+ tab12+"  text,"+foryou12+"  text,"
			+gift12+"  text,"+tag1+"  text,"+tag2+"  text,"+tag3+"  text,"+tag4+"  text,"+tag5+"  text,"+tag6+"  text,"+tag7+"  text,"+tag8+"  text,"+tag9+"  text,"+tag10+"  text,"+tag11+"  text,"+tag12+"  text,"+ID+" INTEGER PRIMARY KEY AUTOINCREMENT) ";
	static final String CREATE_nightam_TABLE = "create table " + tablenightam +
			"( " + tab1+"  text,"+foryou1+"  text," +gift1+"  text,"+ tab2+"  text,"+foryou2+"  text," +gift2+"  text,"+ tab3+"  text,"+foryou3+"  text," +gift3+"  text,"+ tab4+"  text,"+foryou4+"  text," +gift4+"  text,"+ tab5+"  text,"+foryou5+"  text," +gift5
			+"  text,"+ tab6+"  text,"+foryou6+"  text," +gift6+"  text,"+tab7+"  text,"+foryou7+"  text," +gift7+"  text,"+ tab8+"  text,"+foryou8+"  text," +gift8+"  text,"+ tab9+"  text,"+foryou9+"  text," +gift9+"  text,"+ tab10+"  text,"+foryou10+"  text," +gift10+"  text,"+ tab11+"  text,"+foryou11+"  text," +gift11+"  text,"+ tab12+"  text,"+foryou12+"  text,"
			+gift12+"  text,"+tag1+"  text,"+tag2+"  text,"+tag3+"  text,"+tag4+"  text,"+tag5+"  text,"+tag6+"  text,"+tag7+"  text,"+tag8+"  text,"+tag9+"  text,"+tag10+"  text,"+tag11+"  text,"+tag12+"  text,"+ID+" INTEGER PRIMARY KEY AUTOINCREMENT) ";


	static final String CREATE_dailysaf_TABLE = "create table " + tabledailysaf +
			"( " +tab1+"  text,"+foryou1+"  text," +gift1+"  text,"+ tab2+"  text,"+foryou2+"  text," +gift2+"  text,"+ tab3+"  text,"+foryou3+"  text," +gift3+"  text,"+ tab4+"  text,"+foryou4+"  text," +gift4+"  text,"+ tab5+"  text,"+foryou5+"  text," +gift5
			+"  text," +tab6+"  text,"+foryou6+"  text," +gift6+"  text,"+ tab7+"  text,"+foryou7+"  text," +gift7+"  text,"+ tab8+"  text,"+foryou8+"  text," +gift8+"  text,"+ tab9+"  text,"+foryou9+"  text," +gift9+"  text,"+ tab10+"  text,"+foryou10+"  text," +gift10+"  text,"+ tab11+"  text,"+foryou11+"  text," +gift11+"  text,"+tab12+"  text,"+foryou12+"  text,"
			+gift12+"  text,"+tag1+"  text,"+tag2+"  text,"+tag3+"  text,"+tag4+"  text,"+tag5+"  text,"+tag6+"  text,"+tag7+"  text,"+tag8+"  text,"+tag9+"  text,"+tag10+"  text,"+tag11+"  text,"+tag12+"  text,"+ID+" INTEGER PRIMARY KEY AUTOINCREMENT) ";

	static final String CREATE_weeklysaf_TABLE = "create table " + tableweeklysaf +
			"( " + tab1+"  text,"+foryou1+"  text," +gift1+"  text,"+ tab2+"  text,"+foryou2+"  text," +gift2+"  text,"+ tab3+"  text,"+foryou3+"  text," +gift3+"  text,"+ tab4+"  text,"+foryou4+"  text," +gift4+"  text,"+ tab5+"  text,"+foryou5+"  text," +gift5
			+"  text,"+tab6+"  text,"+foryou6+"  text," +gift6+"  text,"+tab7+"  text,"+foryou7+"  text," +gift7+"  text,"+ tab8+"  text,"+foryou8+"  text," +gift8+"  text,"+ tab9+"  text,"+foryou9+"  text," +gift9+"  text,"+ tab10+"  text,"+foryou10+"  text," +gift10+"  text,"+ tab11+"  text,"+foryou11+"  text," +gift11+"  text,"+ tab12+"  text,"+foryou12+"  text,"
			+gift12+"  text,"+tag1+"  text,"+tag2+"  text,"+tag3+"  text,"+tag4+"  text,"+tag5+"  text,"+tag6+"  text,"+tag7+"  text,"+tag8+"  text,"+tag9+"  text,"+tag10+"  text,"+tag11+"  text,"+tag12+"  text,"+ID+" INTEGER PRIMARY KEY AUTOINCREMENT) ";

	static final String CREATE_monthlysaf_TABLE = "create table " + tablemonthlysaf +
			"( " + tab1+"  text,"+foryou1+"  text," +gift1+"  text,"+ tab2+"  text,"+foryou2+"  text," +gift2+"  text,"+ tab3+"  text,"+foryou3+"  text," +gift3+"  text,"+ tab4+"  text,"+foryou4+"  text," +gift4+"  text,"+ tab5+"  text,"+foryou5+"  text," +gift5
			+"  text,"+ tab6+"  text,"+foryou6+"  text," +gift6+"  text,"+ tab7+"  text,"+foryou7+"  text," +gift7+"  text,"+ tab8+"  text,"+foryou8+"  text," +gift8+"  text,"+ tab9+"  text,"+foryou9+"  text," +gift9+"  text,"+ tab10+"  text,"+foryou10+"  text," +gift10+"  text,"+ tab11+"  text,"+foryou11+"  text," +gift11+"  text,"+ tab12+"  text,"+foryou12+"  text,"
			+gift12+"  text,"+tag1+"  text,"+tag2+"  text,"+tag3+"  text,"+tag4+"  text,"+tag5+"  text,"+tag6+"  text,"+tag7+"  text,"+tag8+"  text,"+tag9+"  text,"+tag10+"  text,"+tag11+"  text,"+tag12+"  text,"+ID+" INTEGER PRIMARY KEY AUTOINCREMENT) ";

	static final String CREATE_nightsaf_TABLE = "create table " + tablenightsaf +
			"( " + tab1+"  text,"+foryou1+"  text," +gift1+"  text,"+ tab2+"  text,"+foryou2+"  text," +gift2+"  text,"+ tab3+"  text,"+foryou3+"  text," +gift3+"  text,"+ tab4+"  text,"+foryou4+"  text," +gift4+"  text,"+ tab5+"  text,"+foryou5+"  text," +gift5
			+"  text,"+ tab6+"  text,"+foryou6+"  text," +gift6+"  text,"+tab7+"  text,"+foryou7+"  text," +gift7+"  text,"+ tab8+"  text,"+foryou8+"  text," +gift8+"  text,"+ tab9+"  text,"+foryou9+"  text," +gift9+"  text,"+ tab10+"  text,"+foryou10+"  text," +gift10+"  text,"+ tab11+"  text,"+foryou11+"  text," +gift11+"  text,"+ tab12+"  text,"+foryou12+"  text,"
			+gift12+"  text,"+tag1+"  text,"+tag2+"  text,"+tag3+"  text,"+tag4+"  text,"+tag5+"  text,"+tag6+"  text,"+tag7+"  text,"+tag8+"  text,"+tag9+"  text,"+tag10+"  text,"+tag11+"  text,"+tag12+"  text,"+ID+" INTEGER PRIMARY KEY AUTOINCREMENT) ";
	static final String CREATE_dailyamsaf_TABLE = "create table " + tabledailyamsaf +
			"( " + tab1+"  text,"+foryou1+"  text," +gift1+"  text,"+ tab2+"  text,"+foryou2+"  text," +gift2+"  text,"+ tab3+"  text,"+foryou3+"  text," +gift3+"  text,"+ tab4+"  text,"+foryou4+"  text," +gift4+"  text,"+ tab5+"  text,"+foryou5+"  text," +gift5
			+"  text,"+ tab6+"  text,"+foryou6+"  text," +gift6+"  text,"+tab7+"  text,"+foryou7+"  text," +gift7+"  text,"+ tab8+"  text,"+foryou8+"  text," +gift8+"  text,"+ tab9+"  text,"+foryou9+"  text," +gift9+"  text,"+ tab10+"  text,"+foryou10+"  text," +gift10+"  text,"+ tab11+"  text,"+foryou11+"  text," +gift11+"  text,"+ tab12+"  text,"+foryou12+"  text,"
			+gift12+"  text,"+tag1+"  text,"+tag2+"  text,"+tag3+"  text,"+tag4+"  text,"+tag5+"  text,"+tag6+"  text,"+tag7+"  text,"+tag8+"  text,"+tag9+"  text,"+tag10+"  text,"+tag11+"  text,"+tag12+"  text,"+ID+" INTEGER PRIMARY KEY AUTOINCREMENT) ";
	static final String CREATE_weeklyamsaf_TABLE = "create table " + tableweeklyamsaf +
			"( " + tab1+"  text,"+foryou1+"  text," +gift1+"  text,"+ tab2+"  text,"+foryou2+"  text," +gift2+"  text,"+ tab3+"  text,"+foryou3+"  text," +gift3+"  text,"+ tab4+"  text,"+foryou4+"  text," +gift4+"  text,"+ tab5+"  text,"+foryou5+"  text," +gift5
			+"  text,"+ tab6+"  text,"+foryou6+"  text," +gift6+"  text,"+tab7+"  text,"+foryou7+"  text," +gift7+"  text,"+ tab8+"  text,"+foryou8+"  text," +gift8+"  text,"+ tab9+"  text,"+foryou9+"  text," +gift9+"  text,"+ tab10+"  text,"+foryou10+"  text," +gift10+"  text,"+ tab11+"  text,"+foryou11+"  text," +gift11+"  text,"+ tab12+"  text,"+foryou12+"  text,"
			+gift12+"  text,"+tag1+"  text,"+tag2+"  text,"+tag3+"  text,"+tag4+"  text,"+tag5+"  text,"+tag6+"  text,"+tag7+"  text,"+tag8+"  text,"+tag9+"  text,"+tag10+"  text,"+tag11+"  text,"+tag12+"  text,"+ID+" INTEGER PRIMARY KEY AUTOINCREMENT) ";
	static final String CREATE_monthlyamsaf_TABLE = "create table " + tablemonthlyamsaf +
			"( " + tab1+"  text,"+foryou1+"  text," +gift1+"  text,"+ tab2+"  text,"+foryou2+"  text," +gift2+"  text,"+ tab3+"  text,"+foryou3+"  text," +gift3+"  text,"+ tab4+"  text,"+foryou4+"  text," +gift4+"  text,"+ tab5+"  text,"+foryou5+"  text," +gift5
			+"  text,"+ tab6+"  text,"+foryou6+"  text," +gift6+"  text,"+tab7+"  text,"+foryou7+"  text," +gift7+"  text,"+ tab8+"  text,"+foryou8+"  text," +gift8+"  text,"+ tab9+"  text,"+foryou9+"  text," +gift9+"  text,"+ tab10+"  text,"+foryou10+"  text," +gift10+"  text,"+ tab11+"  text,"+foryou11+"  text," +gift11+"  text,"+ tab12+"  text,"+foryou12+"  text,"
			+gift12+"  text,"+tag1+"  text,"+tag2+"  text,"+tag3+"  text,"+tag4+"  text,"+tag5+"  text,"+tag6+"  text,"+tag7+"  text,"+tag8+"  text,"+tag9+"  text,"+tag10+"  text,"+tag11+"  text,"+tag12+"  text,"+ID+" INTEGER PRIMARY KEY AUTOINCREMENT) ";
	static final String CREATE_nightamsaf_TABLE = "create table " + tablenightamsaf +
			"( " + tab1+"  text,"+foryou1+"  text," +gift1+"  text,"+ tab2+"  text,"+foryou2+"  text," +gift2+"  text,"+ tab3+"  text,"+foryou3+"  text," +gift3+"  text,"+ tab4+"  text,"+foryou4+"  text," +gift4+"  text,"+ tab5+"  text,"+foryou5+"  text," +gift5
			+"  text,"+ tab6+"  text,"+foryou6+"  text," +gift6+"  text,"+tab7+"  text,"+foryou7+"  text," +gift7+"  text,"+ tab8+"  text,"+foryou8+"  text," +gift8+"  text,"+ tab9+"  text,"+foryou9+"  text," +gift9+"  text,"+ tab10+"  text,"+foryou10+"  text," +gift10+"  text,"+ tab11+"  text,"+foryou11+"  text," +gift11+"  text,"+ tab12+"  text,"+foryou12+"  text,"
			+gift12+"  text,"+tag1+"  text,"+tag2+"  text,"+tag3+"  text,"+tag4+"  text,"+tag5+"  text,"+tag6+"  text,"+tag7+"  text,"+tag8+"  text,"+tag9+"  text,"+tag10+"  text,"+tag11+"  text,"+tag12+"  text,"+ID+" INTEGER PRIMARY KEY AUTOINCREMENT) ";



	/*static final String CREATE_tab_TABLE = "create table " + tabletab +
			"( " + tab1+"  text,"+foryou1+"  text," +gift1+"  text,"+ tab2+"  text,"+foryou2+"  text," +gift2+"  text,"+ tab3+"  text,"+foryou3+"  text," +gift3+"  text,"+ tab4+"  text,"+foryou4+"  text," +gift4+"  text,"+ tab5+"  text,"+foryou5+"  text," +gift5
			+"  text,"+ tab6+"  text,"+foryou6+"  text," +gift6+"  text,"+tab7+"  text,"+foryou7+"  text," +gift7+"  text,"+ tab8+"  text,"+foryou8+"  text," +gift8+"  text,"+ tab9+"  text,"+foryou9+"  text," +gift9+"  text,"+ tab10+"  text,"+foryou10+"  text," +gift10+"  text,"+ tab11+"  text,"+foryou11+"  text," +gift11+"  text,"+ tab12+"  text,"+foryou12+"  text,"
			+gift12+"  text,"+tag1+"  text,"+tag2+"  text,"+tag3+"  text,"+tag4+"  text,"+tag5+"  text,"+tag6+"  text,"+tag7+"  text,"+tag8+"  text,"+tag9+"  text,"+tag10+"  text,"+tag11+"  text,"+tag12+"  text,"+ID+" INTEGER PRIMARY KEY AUTOINCREMENT) ";

static final String CREATE_maintab_TABLE = "create table " + tablename1 +
			"( " +tab1+"  text,"+foryou1+"  text," +gift1+"  text,"+ tab2+"  text,"+foryou2+"  text," +gift2+"  text,"+ tab3+"  text,"+foryou3+"  text," +gift3+"  text,"+ tab4+"  text,"+foryou4+"  text," +gift4+"  text,"+ tab5+"  text,"+foryou5+"  text," +gift5
			+"  text," +tab6+"  text,"+foryou6+"  text," +gift6+"  text,"+ tab7+"  text,"+foryou7+"  text," +gift7+"  text,"+ tab8+"  text,"+foryou8+"  text," +gift8+"  text,"+ tab9+"  text,"+foryou9+"  text," +gift9+"  text,"+ tab10+"  text,"+foryou10+"  text," +gift10+"  text,"+ tab11+"  text,"+foryou11+"  text," +gift11+"  text,"+tab12+"  text,"+foryou12+"  text,"
			+gift12+"  text,"+tag1+"  text,"+tag2+"  text,"+tag3+"  text,"+tag4+"  text,"+tag5+"  text,"+tag6+"  text,"+tag7+"  text,"+tag8+"  text,"+tag9+"  text,"+tag10+"  text,"+tag11+"  text,"+tag12+"  text,"+ID+" INTEGER PRIMARY KEY AUTOINCREMENT) ";


*/


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
	public void settabname(String tabname,String tabnum,String tablename){
		ContentValues contentValues = new ContentValues();
		contentValues.put("tabname"+tabnum,tabname);
		//contentValues.put(ID,"1");

		if(gettabname(tablename).size()<1){
			for(int i=1;i<13;i++){
				if(!String.valueOf(i).equals(tabnum)){
					contentValues.put("tabname"+i,"");
				}
			}
			db.insert(tablename, null, contentValues);
		}else{
			db.update(tablename,  contentValues,ID + "=?" , new String[]{"1"});
		}
	}

	public ArrayList<MyListData> gettabname(String table) {
		String sql="Select*from "+table+" ";
		Cursor cursor = db.rawQuery(sql,null);
		if (cursor != null)
			cursor.moveToFirst();

		ArrayList<MyListData> arrayList = new ArrayList<>();
		if(cursor.moveToFirst()){
			do{
				MyListData myListData = new MyListData();
				myListData.settab1name(cursor.getString(0));
				myListData.settab2name(cursor.getString(1));
				myListData.settab3name(cursor.getString(2));
				myListData.settab4name(cursor.getString(3));
				myListData.settab5name(cursor.getString(4));
				myListData.settab6name(cursor.getString(5));
				myListData.settab7name(cursor.getString(6));
				myListData.settab8name(cursor.getString(7));
				myListData.settab9name(cursor.getString(8));
				myListData.settab10name(cursor.getString(9));
				myListData.settab11name(cursor.getString(10));
				myListData.settab12name(cursor.getString(11));
				myListData.setId(cursor.getString(12));

				arrayList.add(myListData);
			}while (cursor.moveToNext());

		}
		cursor.close();
		return arrayList;
	}

	public void setsubtab(String subtabname,String tabnum,String subtabnum,String tablename){
		ContentValues contentValues = new ContentValues();
       // contentValues.put(ID,"1");
        if(getsubtab(tablename).size()<1){
			for(int i=1;i<13;i++){
				for(int j=1;j<5;j++){
					contentValues.put("tab"+i+"subtab"+j+"name","");
				}
			}
			contentValues.put("tab"+tabnum+"subtab"+subtabnum+"name",subtabname);
			db.insert(tablename, null, contentValues);
		}else{
			contentValues.put("tab"+tabnum+"subtab"+subtabnum+"name",subtabname);
			db.update(tablename,  contentValues,ID + "=?" , new String[]{"1"});

		}
	}

	public ArrayList<MyListData> getsubtab(String table) {
		String sql="Select*from "+table+" ";
		Cursor cursor = db.rawQuery(sql,null);
		if (cursor != null)
			cursor.moveToFirst();

		ArrayList<MyListData> arrayList = new ArrayList<>();
		if(cursor.moveToFirst()){
			do{
				MyListData myListData = new MyListData();
				myListData.settab1Subtab1name(cursor.getString(0));
				myListData.settab1Subtab2name(cursor.getString(1));
				myListData.settab1Subtab3name(cursor.getString(2));
				myListData.settab1Subtab4name(cursor.getString(3));

				myListData.settab2Subtab1name(cursor.getString(4));
				myListData.settab2Subtab2name(cursor.getString(5));
				myListData.settab2Subtab3name(cursor.getString(6));
				myListData.settab2Subtab4name(cursor.getString(7));

				myListData.settab3Subtab1name(cursor.getString(8));
				myListData.settab3Subtab2name(cursor.getString(9));
				myListData.settab3Subtab3name(cursor.getString(10));
				myListData.settab3Subtab4name(cursor.getString(11));

				myListData.settab4Subtab1name(cursor.getString(12));
				myListData.settab4Subtab2name(cursor.getString(13));
				myListData.settab4Subtab3name(cursor.getString(14));
				myListData.settab4Subtab4name(cursor.getString(15));

				myListData.settab5Subtab1name(cursor.getString(16));
				myListData.settab5Subtab2name(cursor.getString(17));
				myListData.settab5Subtab3name(cursor.getString(18));
				myListData.settab5Subtab4name(cursor.getString(19));

				myListData.settab6Subtab1name(cursor.getString(20));
				myListData.settab6Subtab2name(cursor.getString(21));
				myListData.settab6Subtab3name(cursor.getString(22));
				myListData.settab6Subtab4name(cursor.getString(23));

				myListData.settab7Subtab1name(cursor.getString(24));
				myListData.settab7Subtab2name(cursor.getString(25));
				myListData.settab7Subtab3name(cursor.getString(26));
				myListData.settab7Subtab4name(cursor.getString(27));

				myListData.settab8Subtab1name(cursor.getString(28));
				myListData.settab8Subtab2name(cursor.getString(29));
				myListData.settab8Subtab3name(cursor.getString(30));
				myListData.settab8Subtab4name(cursor.getString(31));

				myListData.settab9Subtab1name(cursor.getString(32));
				myListData.settab9Subtab2name(cursor.getString(33));
				myListData.settab9Subtab3name(cursor.getString(34));
				myListData.settab9Subtab4name(cursor.getString(35));

				myListData.settab10Subtab1name(cursor.getString(36));
				myListData.settab10Subtab2name(cursor.getString(37));
				myListData.settab10Subtab3name(cursor.getString(38));
				myListData.settab10Subtab4name(cursor.getString(39));

				myListData.settab11Subtab1name(cursor.getString(40));
				myListData.settab11Subtab2name(cursor.getString(41));
				myListData.settab11Subtab3name(cursor.getString(42));
				myListData.settab11Subtab4name(cursor.getString(43));

				myListData.settab12Subtab1name(cursor.getString(44));
				myListData.settab12Subtab2name(cursor.getString(45));
				myListData.settab12Subtab3name(cursor.getString(46));
				myListData.settab12Subtab4name(cursor.getString(47));
				myListData.setId(cursor.getString(48));

				arrayList.add(myListData);
			}while (cursor.moveToNext());

		}
		cursor.close();
		return arrayList;
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
	public void deletealltabledata(String tablename) {

		db.delete(tablename, null,null);

	}
	public void deletedata(String tablename,int position) {
		String where=ID+"=?";
		if(position>0) {
            db.delete(tablename, where, new String[]{get(tablename).get(position - 1).getId()});
        }
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
	}
	public void deletejob(String table) {
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

	public void insertholiday(String stepp,String foryouu,String giftt,String steppam){
		ContentValues contentValues = new ContentValues();
		contentValues.put(holipackage,stepp);
		contentValues.put(foryou,foryouu);
		contentValues.put(gift,giftt);
		contentValues.put(stepamharic,steppam);

		db.insert(tableholiday, null, contentValues);

	}
	public ArrayList<MyListData> getholiday() {
		String sql="Select*from "+tableholiday+" ";
		Cursor cursor = db.rawQuery(sql,null);
		if (cursor != null)
			cursor.moveToFirst();

		ArrayList<MyListData> arrayList = new ArrayList<>();
		if(cursor.moveToFirst()){
			do{
				MyListData myListData = new MyListData();
				myListData.setHolipackage(cursor.getString(0));
				myListData.setHolipackageam(cursor.getString(1));
				myListData.setGift(cursor.getString(2));
				myListData.setForyou(cursor.getString(3));

				arrayList.add(myListData);
			}while (cursor.moveToNext());

		}
		cursor.close();
		return arrayList;
	}
	public void inserttotable(MyListData myListData,String tabletype) {
		ContentValues contentValues = new ContentValues();

		//contentValues.put(ID,String.valueOf(getdatasize(tabletype)+1));

		contentValues.put(tag1,myListData.getTag1());
		contentValues.put(tag2,myListData.getTag2());
		contentValues.put(tag3,myListData.getTag3());
		contentValues.put(tag4,myListData.getTag4());
		contentValues.put(tag5,myListData.getTag5());
		contentValues.put(tag6,myListData.getTag6());
		contentValues.put(tag7,myListData.getTag7());
		contentValues.put(tag8,myListData.getTag8());
		contentValues.put(tag9,myListData.getTag9());
		contentValues.put(tag10,myListData.getTag10());
		contentValues.put(tag11,myListData.getTag11());
		contentValues.put(tag12,myListData.getTag12());

		contentValues.put(tab1,myListData.getTab1());

		contentValues.put(tab2,myListData.getTab2());

		contentValues.put(tab3,myListData.getTab3());

		contentValues.put(tab4,myListData.getTab4());


		contentValues.put(tab5,myListData.getTab5());


		contentValues.put(tab6,myListData.getTab6());

		contentValues.put(tab7,myListData.getTab7());

		contentValues.put(tab8,myListData.getTab8());

		contentValues.put(tab9,myListData.getTab9());

		contentValues.put(tab10,myListData.getTab10());

		contentValues.put(tab11,myListData.getTab11());

		contentValues.put(tab12,myListData.getTab12());



		contentValues.put(foryou1,myListData.getForyou1());

		contentValues.put(foryou2,myListData.getForyou2());


		contentValues.put(foryou3,myListData.getForyou3());
		contentValues.put(foryou4,myListData.getForyou4());
		contentValues.put(foryou5,myListData.getForyou5());
		contentValues.put(foryou6,myListData.getForyou6());
		contentValues.put(foryou7,myListData.getForyou7());
		contentValues.put(foryou8,myListData.getForyou8());

		contentValues.put(foryou9,myListData.getForyou9());

		contentValues.put(foryou10,myListData.getForyou10());

		contentValues.put(foryou11,myListData.getForyou11());
		contentValues.put(foryou12,myListData.getForyou12());
		contentValues.put(gift1,myListData.getGift1());
		contentValues.put(gift2,myListData.getGift2());
		contentValues.put(gift3,myListData.getGift3());
		contentValues.put(gift4,myListData.getGift4());
		contentValues.put(gift5,myListData.getGift5());
		contentValues.put(gift6,myListData.getGift6());
		contentValues.put(gift7,myListData.getGift7());
		contentValues.put(gift8,myListData.getGift8());
		contentValues.put(gift9,myListData.getGift9());
		contentValues.put(gift10,myListData.getGift10());
		contentValues.put(gift11,myListData.getGift11());
		contentValues.put(gift12,myListData.getGift12());

		db.insert(tabletype, null, contentValues);

	}


	//@android.support.annotation.RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void updatetotable(MyListData myListData, String tabletype, String where) {
		ContentValues contentValues = new ContentValues();

		if(!(Objects.equals(myListData.getTag1(), ""))){contentValues.put(tag1,myListData.getTag1());}
		if(!(Objects.equals(myListData.getTag2(), ""))){contentValues.put(tag2,myListData.getTag2());}
		if(!(Objects.equals(myListData.getTag3(), ""))){contentValues.put(tag3,myListData.getTag3());}
		if(!(Objects.equals(myListData.getTag4(), ""))){contentValues.put(tag4,myListData.getTag4());}
		if(!(Objects.equals(myListData.getTag5(), ""))){contentValues.put(tag5,myListData.getTag5());}
		if(!(Objects.equals(myListData.getTag6(), ""))){contentValues.put(tag6,myListData.getTag6());}
		if(!(Objects.equals(myListData.getTag7(), ""))){contentValues.put(tag7,myListData.getTag7());}
		if(!(Objects.equals(myListData.getTag8(), ""))){contentValues.put(tag8,myListData.getTag8());}
		if(!(Objects.equals(myListData.getTag9(), ""))){contentValues.put(tag9,myListData.getTag9());}
		if(!(Objects.equals(myListData.getTag10(), ""))){contentValues.put(tag10,myListData.getTag10());}
		if(!(Objects.equals(myListData.getTag11(), ""))){contentValues.put(tag11,myListData.getTag11());}
		if(!(Objects.equals(myListData.getTag12(), ""))){contentValues.put(tag12,myListData.getTag12());}

		if(!(Objects.equals(myListData.getTab1(), ""))){ contentValues.put(tab1,myListData.getTab1()); }
		if(!(Objects.equals(myListData.getTab2(), ""))){ contentValues.put(tab2,myListData.getTab2()); }

		if(!(Objects.equals(myListData.getTab3(), ""))){
			contentValues.put(tab3,myListData.getTab3());
		}
		if(!(Objects.equals(myListData.getTab4(), ""))){
			contentValues.put(tab4,myListData.getTab4());
		}

		if(!(Objects.equals(myListData.getTab5(), ""))){
			contentValues.put(tab5,myListData.getTab5());

		}
		if(!(Objects.equals(myListData.getTab6(), ""))){
			contentValues.put(tab6,myListData.getTab6());

		}if(!(Objects.equals(myListData.getTab7(), ""))){
			contentValues.put(tab7,myListData.getTab7());

		}if(!(Objects.equals(myListData.getTab8(), ""))){
			contentValues.put(tab8,myListData.getTab8());

		}if(!(Objects.equals(myListData.getTab9(), ""))){
			contentValues.put(tab9,myListData.getTab9());

		}if(!(Objects.equals(myListData.getTab10(), ""))){
			contentValues.put(tab10,myListData.getTab10());

		}if(!(Objects.equals(myListData.getTab11(), ""))){
			contentValues.put(tab11,myListData.getTab11());

		}if(!(Objects.equals(myListData.getTab12(), ""))){
			contentValues.put(tab12,myListData.getTab12());

		}

		if(!(Objects.equals(myListData.getForyou1(), ""))){
			contentValues.put(foryou1,myListData.getForyou1());
		}
		if(!(Objects.equals(myListData.getForyou2(), ""))){
			contentValues.put(foryou2,myListData.getForyou2());

		}
		if(!(Objects.equals(myListData.getForyou3(), ""))){
			contentValues.put(foryou3,myListData.getForyou3());
		}
		if(!(Objects.equals(myListData.getForyou4(), ""))){
			contentValues.put(foryou4,myListData.getForyou4());
		}

		if(!(Objects.equals(myListData.getForyou5(), ""))){
			contentValues.put(foryou5,myListData.getForyou5());

		}
		if(!(Objects.equals(myListData.getForyou6(), ""))){
			contentValues.put(foryou6,myListData.getForyou6());

		}if(!(Objects.equals(myListData.getForyou7(), ""))){
			contentValues.put(foryou7,myListData.getForyou7());

		}if(!(Objects.equals(myListData.getForyou8(), ""))){
			contentValues.put(foryou8,myListData.getForyou8());

		}if(!(Objects.equals(myListData.getForyou9(), ""))){
			contentValues.put(foryou9,myListData.getForyou9());

		}if(!(Objects.equals(myListData.getForyou10(), ""))){
			contentValues.put(foryou10,myListData.getForyou10());

		}if(!(Objects.equals(myListData.getForyou11(), ""))){
			contentValues.put(foryou11,myListData.getForyou11());

		}if(!(Objects.equals(myListData.getForyou12(), ""))){
			contentValues.put(foryou12,myListData.getForyou12());

		}

		if(!(Objects.equals(myListData.getGift1(), ""))){
			contentValues.put(gift1,myListData.getGift1());
		}
		if(!(Objects.equals(myListData.getGift2(), ""))){
			contentValues.put(gift2,myListData.getGift2());

		}
		if(!(Objects.equals(myListData.getGift3(), ""))){
			contentValues.put(gift3,myListData.getGift3());
		}
		if(!(Objects.equals(myListData.getGift4(), ""))){
			contentValues.put(gift4,myListData.getGift4());
		}

		if(!(Objects.equals(myListData.getGift5(), ""))){
			contentValues.put(gift5,myListData.getGift5());

		}
		if(!(Objects.equals(myListData.getGift6(), ""))){
			contentValues.put(gift6,myListData.getGift6());

		}if(!(Objects.equals(myListData.getGift7(), ""))){
			contentValues.put(gift7,myListData.getGift7());

		}if(!(Objects.equals(myListData.getGift8(), ""))){
			contentValues.put(gift8,myListData.getGift8());

		}if(!(Objects.equals(myListData.getGift9(), ""))){
			contentValues.put(gift9,myListData.getGift9());

		}if(!(Objects.equals(myListData.getGift10(), ""))){
			contentValues.put(gift10,myListData.getGift10());

		}if(!(Objects.equals(myListData.getGift11(), ""))){
			contentValues.put(gift11,myListData.getGift11());

		}if(!(Objects.equals(myListData.getGift12(), ""))){
			contentValues.put(gift12,myListData.getGift12());

		}

		if(!(contentValues.toString().isEmpty())&&Integer.parseInt(where)>0&&getdatasize(tabletype)>=Integer.parseInt(where)){
			db.update(tabletype,  contentValues,ID + "=?" , new String[]{get(tabletype).get(Integer.parseInt(where)-1).getId()});

		}

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
	/*public ArrayList<MyListData> getaccount() {
		String sql="Select*from "+tabledaily+" ";
		Cursor cursor = db.rawQuery(sql,null);
		if (cursor != null)
			cursor.moveToFirst();

		ArrayList<MyListData> arrayList = new ArrayList<>();
		if(cursor.moveToFirst()){
			do{
			MyListData myListData = new MyListData();myListData.setStep(cursor.getString(0));
				myListData.setStepgift( cursor.getString(0));
				myListData.setDescription( cursor.getString(1));
				myListData.setTab1( cursor.getString(2));
				myListData.setTab2( cursor.getString(3));
				myListData.setTab3( cursor.getString(4));
				arrayList.add(myListData);
			}while (cursor.moveToNext());

		}
		cursor.close();
		return arrayList;
	}*/ public ArrayList<MyListData> get(String tabeltype) {
		String sql="Select*from "+tabeltype+" ";
		Cursor cursor = db.rawQuery(sql,null);
		if (cursor != null)
			cursor.moveToFirst();

		ArrayList<MyListData> arrayList = new ArrayList<>();
		if(cursor.moveToFirst()){
			do{
				MyListData myListData = new MyListData();
				myListData.setTab1(cursor.getString(0));
				myListData.setForyou1(cursor.getString(1));
				myListData.setGift1(cursor.getString(2));
				myListData.setTab2(cursor.getString(3));
				myListData.setForyou2(cursor.getString(4));
				myListData.setGift2(cursor.getString(5));
				myListData.setTab3(cursor.getString(6));
				myListData.setForyou3(cursor.getString(7));
				myListData.setGift3(cursor.getString(8));
				myListData.setTab4(cursor.getString(9));
				myListData.setForyou4(cursor.getString(10));
				myListData.setGift4(cursor.getString(11));
				myListData.setTab5(cursor.getString(12));
				myListData.setForyou5(cursor.getString(13));
				myListData.setGift5(cursor.getString(14));
				myListData.setTab6(cursor.getString(15));
				myListData.setForyou6(cursor.getString(16));
				myListData.setGift6(cursor.getString(17));
				myListData.setTab7(cursor.getString(18));
				myListData.setForyou7(cursor.getString(19));
				myListData.setGift7(cursor.getString(20));
				myListData.setTab8(cursor.getString(21));
				myListData.setForyou8(cursor.getString(22));
				myListData.setGift8(cursor.getString(23));
				myListData.setTab9(cursor.getString(24));
				myListData.setForyou9(cursor.getString(25));
				myListData.setGift9(cursor.getString(26));
				myListData.setTab10(cursor.getString(27));
				myListData.setForyou10(cursor.getString(28));
				myListData.setGift10(cursor.getString(29));
				myListData.setTab11(cursor.getString(30));
				myListData.setForyou11(cursor.getString(31));
				myListData.setGift11(cursor.getString(32));
				myListData.setTab12(cursor.getString(33));
				myListData.setForyou12(cursor.getString(34));
				myListData.setGift12(cursor.getString(35));
				myListData.setTag1(cursor.getString(36));
				myListData.setTag2(cursor.getString(37));
				myListData.setTag3(cursor.getString(38));
				myListData.setTag4(cursor.getString(39));
				myListData.setTag5(cursor.getString(40));
				myListData.setTag6(cursor.getString(41));
				myListData.setTag7(cursor.getString(42));
				myListData.setTag8(cursor.getString(43));
				myListData.setTag9(cursor.getString(44));
				myListData.setTag10(cursor.getString(45));
				myListData.setTag11(cursor.getString(46));
				myListData.setTag12(cursor.getString(47));
				myListData.setId(cursor.getString(48));

				arrayList.add(myListData);
			}while (cursor.moveToNext());

		}
		cursor.close();
		return arrayList;
	}
	public  int getdatasize(String table){
		String countQuery = "SELECT  * FROM " + table;
		db = dbHelper.getWritableDatabase();
		Cursor cursor = db.rawQuery(countQuery, null);
		int count = cursor.getCount();
		cursor.close();
		return count;
	}
}
