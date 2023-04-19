package com.kaleb.Telepackage;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class databasereference {
    LoginDataBaseAdapter loginDataBaseAdapter;

    DatabaseReference tabd10,tabd11,tabd12,tabd13,tabd14,tabd15,foryoud10,foryoud11,foryoud12,foryoud13,foryoud14,foryoud15,giftd10,giftd11,giftd12,giftd13,giftd14,giftd15,tabd20,tabd21,tabd22,tabd23,tabd24,tabd25,foryoud20,foryoud21,foryoud22,foryoud23,foryoud24,foryoud25,giftd20,giftd21,giftd22,giftd23,giftd24,giftd25,tabd30,tabd31,tabd32,tabd33,tabd34,tabd35,foryoud30,foryoud31,foryoud32,foryoud33,foryoud34,foryoud35,giftd30,giftd31,giftd32,giftd33,giftd34,giftd35,tabd40,tabd41,tabd42,tabd43,tabd44,tabd45,
            foryoud40,foryoud41,foryoud42,foryoud43,foryoud44,foryoud45,giftd40,giftd41,giftd42,giftd43,giftd44,giftd45,tabd50,tabd51,tabd52,tabd53,tabd54,tabd55,foryoud50,foryoud51,foryoud52,foryoud53,foryoud54,foryoud55,giftd50,giftd51,giftd52,giftd53,giftd54,giftd55,tabd60,tabd61,tabd62,tabd63,tabd64,tabd65,foryoud60,foryoud61,foryoud62,foryoud63,foryoud64,foryoud65,giftd60,giftd61,giftd62,giftd63,giftd64,giftd65,tabd70,tabd71,tabd72,tabd73,tabd74,tabd75,foryoud70,foryoud71,foryoud72,foryoud73,foryoud74,
            foryoud75,giftd70,giftd71,giftd72,giftd73,giftd74,giftd75,tabd80,tabd81,tabd82,tabd83,tabd84,tabd85,foryoud80,foryoud81,foryoud82,foryoud83,foryoud84,foryoud85,giftd80,giftd81,giftd82,giftd83,giftd84,giftd85,tabd90,tabd91,tabd92,tabd93,tabd94,tabd95,foryoud90,foryoud91,foryoud92,foryoud93,foryoud94,foryoud95,giftd90,giftd91,giftd92,giftd93,giftd94,giftd95,tabd100,tabd101,tabd102,tabd103,tabd104,tabd105
            ,foryoud100,foryoud101,foryoud102,foryoud103,foryoud104,foryoud105,giftd100,giftd101,giftd102,giftd103,giftd104,giftd105,tabd110,tabd111,tabd112,tabd113,tabd114,tabd115,foryoud110,foryoud111,foryoud112,foryoud113,foryoud114,foryoud115,giftd110,giftd111,giftd112,giftd113,giftd114,giftd115,tabd120,tabd121,tabd122,tabd123,tabd124,tabd125,foryoud120,foryoud121,foryoud122,foryoud123,foryoud124,foryoud125,giftd120,giftd121,giftd122,giftd123,giftd124,giftd125,tab13,tab14,tab15,tab16,
            tabw10,tabw11,tabw12,tabw13,tabw14,tabw15,foryouw10,foryouw11,foryouw12,foryouw13,foryouw14,foryouw15,giftw10,giftw11,giftw12,giftw13,giftw14,giftw15,tabw20,tabw21,tabw22,tabw23,tabw24,tabw25,foryouw20,foryouw21,foryouw22,foryouw23,foryouw24,foryouw25,giftw20,giftw21,giftw22,giftw23,giftw24,giftw25,tabw30,tabw31,tabw32,tabw33,tabw34,tabw35,foryouw30,foryouw31,foryouw32,foryouw33,foryouw34,foryouw35,giftw30,giftw31,giftw32,giftw33,giftw34,giftw35,tabw40,tabw41,tabw42,tabw43,tabw44,tabw45,
            foryouw40,foryouw41,foryouw42,foryouw43,foryouw44,foryouw45,giftw40,giftw41,giftw42,giftw43,giftw44,giftw45,tabw50,tabw51,tabw52,tabw53,tabw54,tabw55,foryouw50,foryouw51,foryouw52,foryouw53,foryouw54,foryouw55,giftw50,giftw51,giftw52,giftw53,giftw54,giftw55,tabw60,tabw61,tabw62,tabw63,tabw64,tabw65,foryouw60,foryouw61,foryouw62,foryouw63,foryouw64,foryouw65,giftw60,giftw61,giftw62,giftw63,giftw64,giftw65,tabw70,tabw71,tabw72,tabw73,tabw74,tabw75,foryouw70,foryouw71,foryouw72,foryouw73,foryouw74,
            foryouw75,giftw70,giftw71,giftw72,giftw73,giftw74,giftw75,tabw80,tabw81,tabw82,tabw83,tabw84,tabw85,foryouw80,foryouw81,foryouw82,foryouw83,foryouw84,foryouw85,giftw80,giftw81,giftw82,giftw83,giftw84,giftw85,tabw90,tabw91,tabw92,tabw93,tabw94,tabw95,foryouw90,foryouw91,foryouw92,foryouw93,foryouw94,foryouw95,giftw90,giftw91,giftw92,giftw93,giftw94,giftw95,tabw100,tabw101,tabw102,tabw103,tabw104,tabw105
            ,foryouw100,foryouw101,foryouw102,foryouw103,foryouw104,foryouw105,giftw100,giftw101,giftw102,giftw103,giftw104,giftw105,tabw110,tabw111,tabw112,tabw113,tabw114,tabw115,foryouw110,foryouw111,foryouw112,foryouw113,foryouw114,foryouw115,giftw110,giftw111,giftw112,giftw113,giftw114,giftw115,tabw120,tabw121,tabw122,tabw123,tabw124,tabw125,foryouw120,foryouw121,foryouw122,foryouw123,foryouw124,foryouw125,giftw120,giftw121,giftw122,giftw123,giftw124,giftw125

   ,tabm10,tabm11,tabm12,tabm13,tabm14,tabm15,foryoum10,foryoum11,foryoum12,foryoum13,foryoum14,foryoum15,giftm10,giftm11,giftm12,giftm13,giftm14,giftm15,tabm20,tabm21,tabm22,tabm23,tabm24,tabm25,foryoum20,foryoum21,foryoum22,foryoum23,foryoum24,foryoum25,giftm20,giftm21,giftm22,giftm23,giftm24,giftm25,tabm30,tabm31,tabm32,tabm33,tabm34,tabm35,foryoum30,foryoum31,foryoum32,foryoum33,foryoum34,foryoum35,giftm30,giftm31,giftm32,giftm33,giftm34,giftm35,tabm40,tabm41,tabm42,tabm43,tabm44,tabm45,
    foryoum40,foryoum41,foryoum42,foryoum43,foryoum44,foryoum45,giftm40,giftm41,giftm42,giftm43,giftm44,giftm45,tabm50,tabm51,tabm52,tabm53,tabm54,tabm55,foryoum50,foryoum51,foryoum52,foryoum53,foryoum54,foryoum55,giftm50,giftm51,giftm52,giftm53,giftm54,giftm55,tabm60,tabm61,tabm62,tabm63,tabm64,tabm65,foryoum60,foryoum61,foryoum62,foryoum63,foryoum64,foryoum65,giftm60,giftm61,giftm62,giftm63,giftm64,giftm65,tabm70,tabm71,tabm72,tabm73,tabm74,tabm75,foryoum70,foryoum71,foryoum72,foryoum73,foryoum74,
            foryoum75,giftm70,giftm71,giftm72,giftm73,giftm74,giftm75,tabm80,tabm81,tabm82,tabm83,tabm84,tabm85,foryoum80,foryoum81,foryoum82,foryoum83,foryoum84,foryoum85,giftm80,giftm81,giftm82,giftm83,giftm84,giftm85,tabm90,tabm91,tabm92,tabm93,tabm94,tabm95,foryoum90,foryoum91,foryoum92,foryoum93,foryoum94,foryoum95,giftm90,giftm91,giftm92,giftm93,giftm94,giftm95,tabm100,tabm101,tabm102,tabm103,tabm104,tabm105
            ,foryoum100,foryoum101,foryoum102,foryoum103,foryoum104,foryoum105,giftm100,giftm101,giftm102,giftm103,giftm104,giftm105,tabm110,tabm111,tabm112,tabm113,tabm114,tabm115,foryoum110,foryoum111,foryoum112,foryoum113,foryoum114,foryoum115,giftm110,giftm111,giftm112,giftm113,giftm114,giftm115,tabm120,tabm121,tabm122,tabm123,tabm124,tabm125,foryoum120,foryoum121,foryoum122,foryoum123,foryoum124,foryoum125,giftm120,giftm121,giftm122,giftm123,giftm124,giftm125

    ,tabn10,tabn11,tabn12,tabn13,tabn14,tabn15,foryoun10,foryoun11,foryoun12,foryoun13,foryoun14,foryoun15,giftn10,giftn11,giftn12,giftn13,giftn14,giftn15,tabn20,tabn21,tabn22,tabn23,tabn24,tabn25,foryoun20,foryoun21,foryoun22,foryoun23,foryoun24,foryoun25,giftn20,giftn21,giftn22,giftn23,giftn24,giftn25,tabn30,tabn31,tabn32,tabn33,tabn34,tabn35,foryoun30,foryoun31,foryoun32,foryoun33,foryoun34,foryoun35,giftn30,giftn31,giftn32,giftn33,giftn34,giftn35,tabn40,tabn41,tabn42,tabn43,tabn44,tabn45,
    foryoun40,foryoun41,foryoun42,foryoun43,foryoun44,foryoun45,giftn40,giftn41,giftn42,giftn43,giftn44,giftn45,tabn50,tabn51,tabn52,tabn53,tabn54,tabn55,foryoun50,foryoun51,foryoun52,foryoun53,foryoun54,foryoun55,giftn50,giftn51,giftn52,giftn53,giftn54,giftn55,tabn60,tabn61,tabn62,tabn63,tabn64,tabn65,foryoun60,foryoun61,foryoun62,foryoun63,foryoun64,foryoun65,giftn60,giftn61,giftn62,giftn63,giftn64,giftn65,tabn70,tabn71,tabn72,tabn73,tabn74,tabn75,foryoun70,foryoun71,foryoun72,foryoun73,foryoun74,foryoun75
            ,giftn70,giftn71,giftn72,giftn73,giftn74,giftn75,tabn80,tabn81,tabn82,tabn83,tabn84,tabn85,foryoun80,foryoun81,foryoun82,foryoun83,foryoun84,foryoun85,giftn80,giftn81,giftn82,giftn83,giftn84,giftn85,tabn90,tabn91,tabn92,tabn93,tabn94,tabn95,foryoun90,foryoun91,foryoun92,foryoun93,foryoun94,foryoun95,giftn90,giftn91,giftn92,giftn93,giftn94,giftn95,tabn100,tabn101,tabn102,tabn103,tabn104,tabn105
            ,foryoun100,foryoun101,foryoun102,foryoun103,foryoun104,foryoun105,giftn100,giftn101,giftn102,giftn103,giftn104,giftn105,tabn110,tabn111,tabn112,tabn113,tabn114,tabn115,foryoun110,foryoun111,foryoun112,foryoun113,foryoun114,foryoun115,giftn110,giftn111,giftn112,giftn113,giftn114,giftn115,tabn120,tabn121,tabn122,tabn123,tabn124,tabn125,foryoun120,foryoun121,foryoun122,foryoun123,foryoun124,foryoun125,giftn120,giftn121,giftn122,giftn123,giftn124,giftn125;

   String tabd10t,tabd11t,tabd12t,tabd13t,tabd14t,tabd15t,foryoud10t,foryoud11t,foryoud12t,foryoud13t,foryoud14t,foryoud15t,giftd10t,giftd11t,giftd12t,giftd13t,giftd14t,giftd15t,tabd20t,tabd21t,tabd22t,tabd23t,tabd24t,tabd25t,foryoud20t,foryoud21t,foryoud22t,foryoud23t,foryoud24t,foryoud25t,giftd20t,giftd21t,giftd22t,giftd23t,giftd24t,giftd25t,tabd30t,tabd31t,tabd32t,tabd33t,tabd34t,tabd35t,foryoud30t,foryoud31t,foryoud32t,foryoud33t,foryoud34t,foryoud35t,giftd30t,giftd31t,giftd32t,giftd33t,giftd34t,giftd35t,tabd40t,tabd41t,tabd42t,tabd43t,tabd44t,tabd45t,
           foryoud40t,foryoud41t,foryoud42t,foryoud43t,foryoud44t,foryoud45t,giftd40t,giftd41t,giftd42t,giftd43t,giftd44t,giftd45t,tabd50t,tabd51t,tabd52t,tabd53t,tabd54t,tabd55t,foryoud50t,foryoud51t,foryoud52t,foryoud53t,foryoud54t,foryoud55t,giftd50t,giftd51t,giftd52t,giftd53t,giftd54t,giftd55t,tabd60t,tabd61t,tabd62t,tabd63t,tabd64t,tabd65t,foryoud60t,foryoud61t,foryoud62t,foryoud63t,foryoud64t,foryoud65t,giftd60t,giftd61t,giftd62t,giftd63t,giftd64t,giftd65t,tabd70t,tabd71t,tabd72t,tabd73t,tabd74t,tabd75t,foryoud70t,foryoud71t,foryoud72t,foryoud73t,foryoud74t,
           foryoud75t,giftd70t,giftd71t,giftd72t,giftd73t,giftd74t,giftd75t,tabd80t,tabd81t,tabd82t,tabd83t,tabd84t,tabd85t,foryoud80t,foryoud81t,foryoud82t,foryoud83t,foryoud84t,foryoud85t,giftd80t,giftd81t,giftd82t,giftd83t,giftd84t,giftd85t,tabd90t,tabd91t,tabd92t,tabd93t,tabd94t,tabd95t,foryoud90t,foryoud91t,foryoud92t,foryoud93t,foryoud94t,foryoud95t,giftd90t,giftd91t,giftd92t,giftd93t,giftd94t,giftd95t,tabd100t,tabd101t,tabd102t,tabd103t,tabd104t,tabd105t
           ,foryoud100t,foryoud101t,foryoud102t,foryoud103t,foryoud104t,foryoud105t,giftd100t,giftd101t,giftd102t,giftd103t,giftd104t,giftd105t,tabd110t,tabd111t,tabd112t,tabd113t,tabd114t,tabd115t,foryoud110t,foryoud111t,foryoud112t,foryoud113t,foryoud114t,foryoud115t,giftd110t,giftd111t,giftd112t,giftd113t,giftd114t,giftd115t,tabd120t,tabd121t,tabd122t,tabd123t,tabd124t,tabd125t,foryoud120t,foryoud121t,foryoud122t,foryoud123t,foryoud124t,foryoud125t,giftd120t,giftd121t,giftd122t,giftd123t,giftd124t,giftd125t,tab13t,tab14t,tab15t,tab16t,
           tabw10t,tabw11t,tabw12t,tabw13t,tabw14t,tabw15t,foryouw10t,foryouw11t,foryouw12t,foryouw13t,foryouw14t,foryouw15t,giftw10t,giftw11t,giftw12t,giftw13t,giftw14t,giftw15t,tabw20t,tabw21t,tabw22t,tabw23t,tabw24t,tabw25t,foryouw20t,foryouw21t,foryouw22t,foryouw23t,foryouw24t,foryouw25t,giftw20t,giftw21t,giftw22t,giftw23t,giftw24t,giftw25t,tabw30t,tabw31t,tabw32t,tabw33t,tabw34t,tabw35t,foryouw30t,foryouw31t,foryouw32t,foryouw33t,foryouw34t,foryouw35t,giftw30t,giftw31t,giftw32t,giftw33t,giftw34t,giftw35t,tabw40t,tabw41t,tabw42t,tabw43t,tabw44t,tabw45t,
           foryouw40t,foryouw41t,foryouw42t,foryouw43t,foryouw44t,foryouw45t,giftw40t,giftw41t,giftw42t,giftw43t,giftw44t,giftw45t,tabw50t,tabw51t,tabw52t,tabw53t,tabw54t,tabw55t,foryouw50t,foryouw51t,foryouw52t,foryouw53t,foryouw54t,foryouw55t,giftw50t,giftw51t,giftw52t,giftw53t,giftw54t,giftw55t,tabw60t,tabw61t,tabw62t,tabw63t,tabw64t,tabw65t,foryouw60t,foryouw61t,foryouw62t,foryouw63t,foryouw64t,foryouw65t,giftw60t,giftw61t,giftw62t,giftw63t,giftw64t,giftw65t,tabw70t,tabw71t,tabw72t,tabw73t,tabw74t,tabw75t,foryouw70t,foryouw71t,foryouw72t,foryouw73t,foryouw74t,
           foryouw75t,giftw70t,giftw71t,giftw72t,giftw73t,giftw74t,giftw75t,tabw80t,tabw81t,tabw82t,tabw83t,tabw84t,tabw85t,foryouw80t,foryouw81t,foryouw82t,foryouw83t,foryouw84t,foryouw85t,giftw80t,giftw81t,giftw82t,giftw83t,giftw84t,giftw85t,tabw90t,tabw91t,tabw92t,tabw93t,tabw94t,tabw95t,foryouw90t,foryouw91t,foryouw92t,foryouw93t,foryouw94t,foryouw95t,giftw90t,giftw91t,giftw92t,giftw93t,giftw94t,giftw95t,tabw100t,tabw101t,tabw102t,tabw103t,tabw104t,tabw105t
           ,foryouw100t,foryouw101t,foryouw102t,foryouw103t,foryouw104t,foryouw105t,giftw100t,giftw101t,giftw102t,giftw103t,giftw104t,giftw105t,tabw110t,tabw111t,tabw112t,tabw113t,tabw114t,tabw115t,foryouw110t,foryouw111t,foryouw112t,foryouw113t,foryouw114t,foryouw115t,giftw110t,giftw111t,giftw112t,giftw113t,giftw114t,giftw115t,tabw120t,tabw121t,tabw122t,tabw123t,tabw124t,tabw125t,foryouw120t,foryouw121t,foryouw122t,foryouw123t,foryouw124t,foryouw125t,giftw120t,giftw121t,giftw122t,giftw123t,giftw124t,giftw125t

           ,tabm10t,tabm11t,tabm12t,tabm13t,tabm14t,tabm15t,foryoum10t,foryoum11t,foryoum12t,foryoum13t,foryoum14t,foryoum15t,giftm10t,giftm11t,giftm12t,giftm13t,giftm14t,giftm15t,tabm20t,tabm21t,tabm22t,tabm23t,tabm24t,tabm25t,foryoum20t,foryoum21t,foryoum22t,foryoum23t,foryoum24t,foryoum25t,giftm20t,giftm21t,giftm22t,giftm23t,giftm24t,giftm25t,tabm30t,tabm31t,tabm32t,tabm33t,tabm34t,tabm35t,foryoum30t,foryoum31t,foryoum32t,foryoum33t,foryoum34t,foryoum35t,giftm30t,giftm31t,giftm32t,giftm33t,giftm34t,giftm35t,tabm40t,tabm41t,tabm42t,tabm43t,tabm44t,tabm45t,
           foryoum40t,foryoum41t,foryoum42t,foryoum43t,foryoum44t,foryoum45t,giftm40t,giftm41t,giftm42t,giftm43t,giftm44t,giftm45t,tabm50t,tabm51t,tabm52t,tabm53t,tabm54t,tabm55t,foryoum50t,foryoum51t,foryoum52t,foryoum53t,foryoum54t,foryoum55t,giftm50t,giftm51t,giftm52t,giftm53t,giftm54t,giftm55t,tabm60t,tabm61t,tabm62t,tabm63t,tabm64t,tabm65t,foryoum60t,foryoum61t,foryoum62t,foryoum63t,foryoum64t,foryoum65t,giftm60t,giftm61t,giftm62t,giftm63t,giftm64t,giftm65t,tabm70t,tabm71t,tabm72t,tabm73t,tabm74t,tabm75t,foryoum70t,foryoum71t,foryoum72t,foryoum73t,foryoum74t,
           foryoum75t,giftm70t,giftm71t,giftm72t,giftm73t,giftm74t,giftm75t,tabm80t,tabm81t,tabm82t,tabm83t,tabm84t,tabm85t,foryoum80t,foryoum81t,foryoum82t,foryoum83t,foryoum84t,foryoum85t,giftm80t,giftm81t,giftm82t,giftm83t,giftm84t,giftm85t,tabm90t,tabm91t,tabm92t,tabm93t,tabm94t,tabm95t,foryoum90t,foryoum91t,foryoum92t,foryoum93t,foryoum94t,foryoum95t,giftm90t,giftm91t,giftm92t,giftm93t,giftm94t,giftm95t,tabm100t,tabm101t,tabm102t,tabm103t,tabm104t,tabm105t
           ,foryoum100t,foryoum101t,foryoum102t,foryoum103t,foryoum104t,foryoum105t,giftm100t,giftm101t,giftm102t,giftm103t,giftm104t,giftm105t,tabm110t,tabm111t,tabm112t,tabm113t,tabm114t,tabm115t,foryoum110t,foryoum111t,foryoum112t,foryoum113t,foryoum114t,foryoum115t,giftm110t,giftm111t,giftm112t,giftm113t,giftm114t,giftm115t,tabm120t,tabm121t,tabm122t,tabm123t,tabm124t,tabm125t,foryoum120t,foryoum121t,foryoum122t,foryoum123t,foryoum124t,foryoum125t,giftm120t,giftm121t,giftm122t,giftm123t,giftm124t,giftm125t

           ,tabn10t,tabn11t,tabn12t,tabn13t,tabn14t,tabn15t,foryoun10t,foryoun11t,foryoun12t,foryoun13t,foryoun14t,foryoun15t,giftn10t,giftn11t,giftn12t,giftn13t,giftn14t,giftn15t,tabn20t,tabn21t,tabn22t,tabn23t,tabn24t,tabn25t,foryoun20t,foryoun21t,foryoun22t,foryoun23t,foryoun24t,foryoun25t,giftn20t,giftn21t,giftn22t,giftn23t,giftn24t,giftn25t,tabn30t,tabn31t,tabn32t,tabn33t,tabn34t,tabn35t,foryoun30t,foryoun31t,foryoun32t,foryoun33t,foryoun34t,foryoun35t,giftn30t,giftn31t,giftn32t,giftn33t,giftn34t,giftn35t,tabn40t,tabn41t,tabn42t,tabn43t,tabn44t,tabn45t,
           foryoun40t,foryoun41t,foryoun42t,foryoun43t,foryoun44t,foryoun45t,giftn40t,giftn41t,giftn42t,giftn43t,giftn44t,giftn45t,tabn50t,tabn51t,tabn52t,tabn53t,tabn54t,tabn55t,foryoun50t,foryoun51t,foryoun52t,foryoun53t,foryoun54t,foryoun55t,giftn50t,giftn51t,giftn52t,giftn53t,giftn54t,giftn55t,tabn60t,tabn61t,tabn62t,tabn63t,tabn64t,tabn65t,foryoun60t,foryoun61t,foryoun62t,foryoun63t,foryoun64t,foryoun65t,giftn60t,giftn61t,giftn62t,giftn63t,giftn64t,giftn65t,tabn70t,tabn71t,tabn72t,tabn73t,tabn74t,tabn75t,foryoun70t,foryoun71t,foryoun72t,foryoun73t,foryoun74t,foryoun75t
           ,giftn70t,giftn71t,giftn72t,giftn73t,giftn74t,giftn75t,tabn80t,tabn81t,tabn82t,tabn83t,tabn84t,tabn85t,foryoun80t,foryoun81t,foryoun82t,foryoun83t,foryoun84t,foryoun85t,giftn80t,giftn81t,giftn82t,giftn83t,giftn84t,giftn85t,tabn90t,tabn91t,tabn92t,tabn93t,tabn94t,tabn95t,foryoun90t,foryoun91t,foryoun92t,foryoun93t,foryoun94t,foryoun95t,giftn90t,giftn91t,giftn92t,giftn93t,giftn94t,giftn95t,tabn100t,tabn101t,tabn102t,tabn103t,tabn104t,tabn105t
           ,foryoun100t,foryoun101t,foryoun102t,foryoun103t,foryoun104t,foryoun105t,giftn100t,giftn101t,giftn102t,giftn103t,giftn104t,giftn105t,tabn110t,tabn111t,tabn112t,tabn113t,tabn114t,tabn115t,foryoun110t,foryoun111t,foryoun112t,foryoun113t,foryoun114t,foryoun115t,giftn110t,giftn111t,giftn112t,giftn113t,giftn114t,giftn115t,tabn120t,tabn121t,tabn122t,tabn123t,tabn124t,tabn125t,foryoun120t,foryoun121t,foryoun122t,foryoun123t,foryoun124t,foryoun125t,giftn120t,giftn121t,giftn122t,giftn123t,giftn124t,giftn125t;

    FirebaseDatabase fd;int total=0;
public String change(String str){
    String  strr = "";
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)==','){
            strr=new StringBuilder(str).insert(i,"t").toString();
        }
    }
    return strr;
}
public void getfire(){

    tabd10.addListenerForSingleValueEvent(new ValueEventListener() {
    @Override
    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
        tabd10t=dataSnapshot.getValue(String.class);
        total=total+1;check();
    }

    @Override
    public void onCancelled(@NonNull DatabaseError databaseError) {

    }
}); tabd11.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd11t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd12.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd12t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd13.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd13t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd14.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd14t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd15.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd15t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd20.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd20t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd21.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd21t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd22.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd22t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd23.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd23t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd24.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd24t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd25.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd25t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd30.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd30t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd31.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd31t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd32.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd32t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd33.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd33t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd34.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd34t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd35.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd35t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd40.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd40t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd41.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd41t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd42.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd42t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd43.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd43t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd44.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd44t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd45.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd45t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd50.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd50t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd51.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd51t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd52.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd52t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd53.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd53t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd54.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd54t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd55.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd55t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    tabd60.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd60t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    }); tabd61.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd61t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd62.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd62t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd63.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd63t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd64.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd64t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd65.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd65t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd70.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd70t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd71.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd71t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd72.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd72t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd73.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd73t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd74.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd74t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd75.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd75t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd80.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd80t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd81.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd81t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd82.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd82t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd83.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd83t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd84.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd84t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd85.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd85t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd90.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd90t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd91.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd91t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd92.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd92t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd93.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd93t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd94.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd94t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd95.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd95t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd100.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd100t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd101.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd101t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd102.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd102t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd103.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd103t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd104.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd104t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd105.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd105t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });





    /*tabd110.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd110t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    }); tabd111.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd111t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd112.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd112t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd113.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd113t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd114.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd114t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd115.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd115t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd120.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd120t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd121.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd121t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd122.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd122t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd123.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd123t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd124.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd124t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabd125.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabd125t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });*/






    tabw10.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw10t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    }); tabw11.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw11t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw12.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw12t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw13.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw13t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw14.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw14t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw15.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw15t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw20.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw20t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw21.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw21t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw22.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw22t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw23.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw23t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw24.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw24t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw25.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw25t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw30.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw30t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw31.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw31t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw32.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw32t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw33.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw33t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw34.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw34t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw35.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw35t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw40.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw40t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw41.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw41t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw42.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw42t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw43.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw43t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw44.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw44t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw45.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw45t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw50.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw50t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw51.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw51t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw52.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw52t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw53.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw53t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw54.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw54t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw55.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw55t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    tabw60.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw60t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    }); tabw61.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw61t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw62.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw62t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw63.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw63t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw64.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw64t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw65.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw65t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw70.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw70t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw71.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw71t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw72.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw72t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw73.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw73t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw74.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw74t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw75.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw75t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw80.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw80t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw81.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw81t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw82.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw82t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw83.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw83t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw84.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw84t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw85.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw85t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw90.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw90t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw91.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw91t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw92.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw92t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw93.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw93t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw94.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw94t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw95.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw95t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw100.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw100t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw101.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw101t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw102.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw102t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw103.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw103t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw104.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw104t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw105.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw105t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });





    /*tabw110.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw110t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    }); tabw111.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw111t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw112.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw112t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw113.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw113t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw114.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw114t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw115.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw115t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw120.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw120t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw121.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw121t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw122.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw122t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw123.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw123t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw124.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw124t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabw125.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabw125t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });*/




    tabm10.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm10t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    }); tabm11.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm11t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm12.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm12t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm13.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm13t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm14.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm14t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm15.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm15t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm20.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm20t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm21.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm21t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm22.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm22t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm23.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm23t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm24.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm24t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm25.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm25t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm30.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm30t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm31.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm31t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm32.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm32t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm33.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm33t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm34.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm34t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm35.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm35t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm40.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm40t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm41.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm41t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm42.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm42t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm43.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm43t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm44.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm44t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm45.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm45t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm50.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm50t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm51.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm51t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm52.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm52t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm53.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm53t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm54.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm54t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm55.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm55t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    tabm60.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm60t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    }); tabm61.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm61t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm62.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm62t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm63.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm63t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm64.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm64t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm65.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm65t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm70.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm70t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm71.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm71t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm72.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm72t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm73.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm73t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm74.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm74t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm75.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm75t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm80.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm80t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm81.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm81t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm82.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm82t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm83.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm83t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm84.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm84t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm85.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm85t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm90.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm90t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm91.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm91t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm92.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm92t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm93.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm93t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm94.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm94t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm95.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm95t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm100.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm100t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm101.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm101t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm102.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm102t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm103.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm103t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm104.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm104t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm105.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm105t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });





   /* tabm110.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm110t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    }); tabm111.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm111t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm112.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm112t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm113.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm113t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm114.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm114t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm115.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm115t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm120.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm120t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm121.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm121t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm122.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm122t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm123.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm123t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm124.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm124t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabm125.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabm125t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });*/






    tabn10.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn10t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    }); tabn11.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn11t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn12.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn12t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn13.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn13t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn14.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn14t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn15.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn15t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn20.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn20t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn21.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn21t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn22.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn22t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn23.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn23t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn24.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn24t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn25.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn25t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn30.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn30t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn31.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn31t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn32.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn32t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn33.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn33t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn34.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn34t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn35.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn35t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn40.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn40t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn41.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn41t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn42.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn42t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn43.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn43t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn44.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn44t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn45.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn45t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn50.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn50t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn51.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn51t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn52.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn52t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn53.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn53t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn54.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn54t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn55.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn55t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    tabn60.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn60t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    }); tabn61.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn61t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn62.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn62t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn63.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn63t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn64.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn64t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn65.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn65t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn70.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn70t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn71.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn71t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn72.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn72t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn73.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn73t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn74.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn74t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn75.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn75t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn80.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn80t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn81.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn81t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn82.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn82t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn83.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn83t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn84.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn84t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn85.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn85t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn90.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn90t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn91.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn91t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn92.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn92t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn93.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn93t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn94.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn94t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn95.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn95t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn100.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn100t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn101.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn101t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn102.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn102t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn103.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn103t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn104.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn104t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn105.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn105t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });





   /* tabn110.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn110t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    }); tabn111.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn111t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn112.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn112t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn113.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn113t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn114.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn114t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn115.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn115t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn120.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn120t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn121.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn121t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn122.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn122t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn123.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn123t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn124.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn124t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    tabn125.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            tabn125t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });*/
//###################################################################

    foryoud10.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud10t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoud12.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud12t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud13.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud13t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoud14.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud14t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud15.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud15t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud20.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud20t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoud21.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud21t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoud22.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud22t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud23.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud23t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud24.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud24t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud25.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud25t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud30.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud30t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    foryoud31.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud31t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud32.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud32t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud33.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud33t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud34.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud34t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud35.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud35t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    foryoud40.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud40t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoud41.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud12t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoud42.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud42t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoud43.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud43t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoud44.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud44t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud45.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud45t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud50.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud50t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud51.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud51t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoud52.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud52t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud53.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud53t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud54.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud54t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud55.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud55t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud60.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud60t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    foryoud61.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud61t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud62.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud62t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud63.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud63t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud64.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud64t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud65.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud65t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud70.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud70t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    foryoud71.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud71t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud72.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud72t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud73.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud73t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud74.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud74t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud75.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud75t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    foryoud80.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud80t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoud81.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud81t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoud82.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud82t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoud83.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud43t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoud84.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud84t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud85.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud85t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud90.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud90t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoud91.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud91t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoud92.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud92t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud93.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud93t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud94.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud94t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud95.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud95t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud90.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud90t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    foryoud91.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud91t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud92.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud92t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud93.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud93t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud94.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud94t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud95.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud95t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud100.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud100t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    foryoud101.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud101t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud102.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud102t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud103.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud103t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud104.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud104t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud105.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud105t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


   /* foryoud110.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud110t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoud111.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud111t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoud112.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud112t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoud113.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud113t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoud114.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud114t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud115.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud115t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud120.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud120t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoud121.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud121t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoud122.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud122t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud123.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud123t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud124.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud124t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoud125.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud125t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });*/





    foryouw10.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw10t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryouw12.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw12t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw13.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw13t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryouw14.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw14t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw15.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw15t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw20.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw20t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryouw21.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw21t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryouw22.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw22t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw23.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw23t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw24.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw24t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw25.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw25t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw30.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw30t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    foryouw31.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw31t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw32.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw32t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw33.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw33t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw34.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw34t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw35.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw35t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    foryouw40.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw40t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryouw41.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw41t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryouw42.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw42t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryouw43.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw43t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryouw44.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw44t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw45.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw45t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw50.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw50t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryouw51.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw51t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryouw52.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw52t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw53.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw53t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw54.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw54t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw55.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw55t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw60.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw60t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    foryouw61.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw61t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw62.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw62t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw63.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw63t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw64.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw64t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw65.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw65t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw70.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw70t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    foryouw71.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw71t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw72.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw72t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw73.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw73t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw74.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw74t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw75.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw75t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    foryouw80.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw80t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryouw81.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw81t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryouw82.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw82t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryouw83.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw43t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryouw84.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw84t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw85.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw85t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw90.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw90t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryouw91.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw91t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryouw92.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw92t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw93.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw93t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw94.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw94t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw95.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw95t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw90.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw90t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    foryouw91.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw91t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw92.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw92t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw93.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw93t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw94.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw94t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw95.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw95t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw100.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw100t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    foryouw101.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw101t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw102.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw102t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw103.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw103t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw104.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw104t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw105.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw105t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


   /* foryouw110.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw110t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryouw111.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw111t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryouw112.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw112t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryouw113.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw113t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryouw114.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw114t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw115.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw115t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw120.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw120t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryouw121.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw121t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryouw122.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw122t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw123.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw123t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw124.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw124t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryouw125.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryouw125t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });*/






    foryoum10.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum10t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoum12.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum12t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum13.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum13t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoum14.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum14t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum15.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum15t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum20.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum20t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoum21.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum21t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoum22.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum22t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum23.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum23t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum24.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum24t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum25.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum25t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum30.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum30t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    foryoum31.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum31t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum32.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum32t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum33.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum33t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum34.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum34t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum35.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum35t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    foryoum40.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum40t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoum41.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum12t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoum42.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum42t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoum43.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum43t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoum44.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum44t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum45.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum45t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum50.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum50t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoum51.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud51t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoum52.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum52t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum53.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum53t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum54.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum54t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum55.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum55t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum60.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum60t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    foryoum61.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum61t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum62.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum62t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum63.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum63t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum64.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum64t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum65.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum65t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum70.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum70t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    foryoum71.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum71t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum72.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum72t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum73.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum73t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum74.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum74t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum75.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum75t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    foryoum80.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum80t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoum81.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum81t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoum82.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum82t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoum83.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum83t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoum84.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum84t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum85.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum85t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum90.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum90t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoum91.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum91t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoum92.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum92t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum93.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum93t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum94.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum94t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum95.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum95t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum90.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum90t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    foryoum91.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum91t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum92.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum92t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum93.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum93t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum94.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum94t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum95.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum95t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum100.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum100t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    foryoum101.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum101t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum102.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum102t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum103.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum103t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum104.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum104t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum105.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum105t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


   /* foryoum110.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum110t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoum111.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum111t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoum112.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum112t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoum113.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum113t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoud114.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoud114t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum115.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum115t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum120.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum120t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoum121.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum121t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoum122.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum122t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum123.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum123t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum124.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum124t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoum125.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoum125t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });*/



    foryoun10.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun10t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoun12.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun12t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun13.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun13t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoun14.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun14t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun15.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun15t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun20.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun20t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoun21.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun21t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoun22.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun22t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun23.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun23t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun24.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun24t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun25.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun25t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun30.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun30t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    foryoun31.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun31t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun32.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun32t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun33.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun33t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun34.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun34t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun35.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun35t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    foryoun40.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun40t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoun41.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun41t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoun42.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun42t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoun43.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun43t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoun44.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun44t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun45.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun45t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun50.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun50t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoun51.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun51t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoun52.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun52t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun53.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun53t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun54.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun54t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun55.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun55t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun60.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun60t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    foryoun61.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun61t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun62.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun62t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun63.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun63t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun64.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun64t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun65.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun65t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun70.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun70t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    foryoun71.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun71t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun72.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun72t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun73.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun73t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun74.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun74t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun75.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun75t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    foryoun80.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun80t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoun81.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun81t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoun82.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun82t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoun83.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun43t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoun84.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun84t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun85.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun85t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun90.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun90t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoun91.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun91t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoun92.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun92t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun93.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun93t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun94.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun94t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun95.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun95t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun90.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun90t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    foryoun91.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun91t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun92.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun92t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun93.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun93t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun94.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun94t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun95.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun95t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun100.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun100t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    foryoun101.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun101t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun102.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun102t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun103.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun103t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun104.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun104t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun105.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun105t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


   /* foryoun110.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun110t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoun111.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun111t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoun112.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun112t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoun113.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun113t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoun114.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun114t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun115.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun115t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun120.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun120t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoun121.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun121t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    foryoun122.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun122t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun123.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun123t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun124.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun124t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    foryoun125.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            foryoun125t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });*/


    //###################################################################

    giftd10.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd10t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd11.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd11t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd12.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd12t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd13.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd13t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd14.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd14t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftd15.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd15t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftd20.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd20t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftd21.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd21t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    giftd22.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd22t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd23.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd23t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd24.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd24t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd25.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd25t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd30.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd30t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftd31.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd31t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftd32.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd32t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftd33.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd33t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    giftd34.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd34t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd35.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd35t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd40.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd40t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd41.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd41t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd42.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd42t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftd43.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd43t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftd44.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd44t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftd45.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd45t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });




    giftd50.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd50t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd51.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd51t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd12.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd52t=dataSnapshot.getValue(String.class);total=total+1;check();;
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd53.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd53t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd54.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd54t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftd55.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd55t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftd60.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd60t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftd61.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd61t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    giftd62.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd62t=dataSnapshot.getValue(String.class);
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd63.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd63t=dataSnapshot.getValue(String.class);
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd64.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd64t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd65.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd65t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd70.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd70t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftd71.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd71t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftd72.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd72t=dataSnapshot.getValue(String.class);
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftd73.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd73t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    giftd74.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd74t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd75.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd75t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd80.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd80t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd81.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd81t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd82.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd82t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftd83.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd83t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftd84.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd84t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftd85.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd85t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });



    giftd90.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd90t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd91.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd91t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd92.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd92t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd93.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd93t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd94.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd94t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftd95.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd95t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftd100.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd100t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftd101.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd101t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    giftd102.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd102t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd103.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd103t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd104.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd104t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd105.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd105t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
  /* giftd110.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd110t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftd111.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd11t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftd112.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd112t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftd113.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd113t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    giftd114.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd114t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd115.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd115t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd120.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd120t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd121.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd121t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftd122.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd122t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftd123.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd123t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftd124.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd124t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftd125.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftd125t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });*/


    giftw10.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw10t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw11.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw11t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw12.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw12t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw13.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw13t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw14.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw14t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftw15.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw15t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftw20.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw20t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftw21.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw21t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    giftw22.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw22t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw23.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw23t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw24.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw24t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw25.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw25t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw30.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw30t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftw31.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw31t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftw32.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw32t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftw33.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw33t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    giftw34.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw34t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw35.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw35t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw40.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw40t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw41.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw41t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw42.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw42t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftw43.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw43t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftw44.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw44t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftw45.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw45t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });




    giftw50.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw50t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw51.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw51t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw12.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw52t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw53.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw53t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw54.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw54t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftw55.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw55t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftw60.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw60t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftw61.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw61t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    giftw62.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw62t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw63.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw63t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw64.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw64t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw65.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw65t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw70.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw70t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftw71.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw71t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftw72.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw72t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftw73.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw73t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    giftw74.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw74t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw75.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw75t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw80.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw80t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw81.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw81t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw82.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw82t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftw83.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw83t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftw84.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw84t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftw85.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw85t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });



    giftw90.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw90t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw91.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw91t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw92.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw92t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw93.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw93t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw94.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw94t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftw95.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw95t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftw100.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw100t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftw101.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw101t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    giftw102.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw102t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw103.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw103t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw104.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw104t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw105.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw105t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
   /* giftw110.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw110t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftw111.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw11t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftw112.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw112t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftw113.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw113t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    giftw114.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw114t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw115.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw115t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw120.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw120t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    giftw121.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw121t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftw122.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw122t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftw123.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw123t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    giftw124.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw124t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftw125.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftw125t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });*/


    giftm10.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm10t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm11.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm11t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm12.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm12t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm13.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm13t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm14.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm14t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftm15.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm15t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftm20.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm20t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftm21.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm21t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    giftm22.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm22t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm23.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm23t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm24.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm24t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm25.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm25t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm30.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm30t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftm31.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm31t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftm32.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm32t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftm33.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm33t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    giftm34.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm34t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm35.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm35t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm40.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm40t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm41.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm41t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm42.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm42t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftm43.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm43t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftm44.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm44t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftm45.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm45t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });




    giftm50.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm50t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm51.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm51t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm12.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm52t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm53.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm53t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm54.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm54t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftm55.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm55t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftm60.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm60t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftm61.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm61t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    giftm62.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm62t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm63.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm63t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm64.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm64t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm65.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm65t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm70.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm70t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftm71.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm71t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftm72.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm72t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftm73.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm73t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    giftm74.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm74t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm75.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm75t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm80.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm80t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm81.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm81t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm82.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm82t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftm83.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm83t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftm84.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm84t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftm85.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm85t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });



    giftm90.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm90t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm91.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm91t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm92.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm92t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm93.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm93t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm94.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm94t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftm95.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm95t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftm100.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm100t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftm101.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm101t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    giftm102.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm102t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm103.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm103t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm104.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm104t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm105.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm105t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
  /*  giftm110.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm110t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftm111.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm11t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftm112.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm112t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftm113.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm113t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    giftm114.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm114t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm115.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm115t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm120.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm120t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm121.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm121t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftm122.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm122t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftm123.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm123t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    giftm124.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm124t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftm125.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftm125t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });*/


    giftn10.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn10t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn11.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn11t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn12.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn12t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn13.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn13t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn14.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn14t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftn15.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn15t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftn20.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn20t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftn21.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn21t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    giftn22.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn22t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn23.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn23t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn24.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn24t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn25.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn25t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn30.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn30t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftn31.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn31t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftn32.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn32t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftn33.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn33t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    giftn34.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn34t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn35.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn35t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn40.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn40t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn41.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn41t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn42.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn42t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftn43.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn43t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftn44.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn44t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftn45.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn45t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });




    giftn50.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn50t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn51.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn51t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn52.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn52t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn53.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn53t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn54.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn54t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftn55.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn55t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftn60.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn60t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftn61.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn61t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    giftn62.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn62t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn63.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn63t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn64.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn64t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn65.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn65t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn70.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn70t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftn71.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn71t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftn72.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn72t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftn73.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn73t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    giftn74.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn74t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn75.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn75t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn80.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn80t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn81.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn81t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn82.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn82t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftn83.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn83t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftn84.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn84t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftn85.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn85t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });



    giftn90.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn90t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn91.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn91t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn92.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn92t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn93.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn93t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn94.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn94t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftn95.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn95t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftn100.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn100t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftn101.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn101t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    giftn102.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn102t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn103.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn103t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn104.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn104t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn105.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn105t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
   /* giftn110.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn110t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftn111.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn11t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftn112.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn112t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftn113.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn113t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });


    giftn114.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn114t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn115.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn115t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn120.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn120t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn121.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn121t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });
    giftn122.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn122t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    }); giftn123.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn123t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    }); giftn124.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn124t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });

    giftn125.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            giftn125t=dataSnapshot.getValue(String.class);total=total+1;check();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {

        }
    });*/
    }



    public void datareference(){
        tabd10=fd.getReference("Telepackage/daily/Tab1/0");
        tabd11=fd.getReference("Telepackage/daily/Tab1/1");
        tabd12=fd.getReference("Telepackage/daily/Tab1/2");
        tabd13=fd.getReference("Telepackage/daily/Tab1/3");
        tabd14=fd.getReference("Telepackage/daily/Tab1/4");
        tabd15=fd.getReference("Telepackage/daily/Tab1/5");

        tabd20=fd.getReference("Telepackage/daily/Tab2/0");
        tabd21=fd.getReference("Telepackage/daily/Tab2/1");
        tabd22=fd.getReference("Telepackage/daily/Tab2/2");
        tabd23=fd.getReference("Telepackage/daily/Tab2/3");
        tabd24=fd.getReference("Telepackage/daily/Tab2/4");
        tabd25=fd.getReference("Telepackage/daily/Tab2/5");

        tabd30=fd.getReference("Telepackage/daily/Tab3/0");
        tabd31=fd.getReference("Telepackage/daily/Tab3/1");
        tabd32=fd.getReference("Telepackage/daily/Tab3/2");
        tabd33=fd.getReference("Telepackage/daily/Tab3/3");
        tabd34=fd.getReference("Telepackage/daily/Tab3/4");
        tabd35=fd.getReference("Telepackage/daily/Tab3/5");

        tabd40=fd.getReference("Telepackage/daily/Tab4/0");
        tabd41=fd.getReference("Telepackage/daily/Tab4/1");
        tabd42=fd.getReference("Telepackage/daily/Tab4/2");
        tabd43=fd.getReference("Telepackage/daily/Tab4/3");
        tabd44=fd.getReference("Telepackage/daily/Tab4/4");
        tabd45=fd.getReference("Telepackage/daily/Tab4/5");

        tabd50=fd.getReference("Telepackage/daily/Tab5/0");
        tabd51=fd.getReference("Telepackage/daily/Tab5/1");
        tabd52=fd.getReference("Telepackage/daily/Tab5/2");
        tabd53=fd.getReference("Telepackage/daily/Tab5/3");
        tabd54=fd.getReference("Telepackage/daily/Tab5/4");
        tabd55=fd.getReference("Telepackage/daily/Tab5/5");

        tabd60=fd.getReference("Telepackage/daily/Tab6/0");
        tabd61=fd.getReference("Telepackage/daily/Tab6/1");
        tabd62=fd.getReference("Telepackage/daily/Tab6/2");
        tabd63=fd.getReference("Telepackage/daily/Tab6/3");
        tabd64=fd.getReference("Telepackage/daily/Tab6/4");
        tabd65=fd.getReference("Telepackage/daily/Tab6/5");

        tabd70=fd.getReference("Telepackage/daily/Tab7/0");
        tabd71=fd.getReference("Telepackage/daily/Tab7/1");
        tabd72=fd.getReference("Telepackage/daily/Tab7/2");
        tabd73=fd.getReference("Telepackage/daily/Tab7/3");
        tabd74=fd.getReference("Telepackage/daily/Tab7/4");
        tabd75=fd.getReference("Telepackage/daily/Tab7/5");

        tabd80=fd.getReference("Telepackage/daily/Tab8/0");
        tabd81=fd.getReference("Telepackage/daily/Tab8/1");
        tabd82=fd.getReference("Telepackage/daily/Tab8/2");
        tabd83=fd.getReference("Telepackage/daily/Tab8/3");
        tabd84=fd.getReference("Telepackage/daily/Tab8/4");
        tabd85=fd.getReference("Telepackage/daily/Tab8/5");

        tabd90=fd.getReference("Telepackage/daily/Tab9/0");
        tabd91=fd.getReference("Telepackage/daily/Tab9/1");
        tabd92=fd.getReference("Telepackage/daily/Tab9/2");
        tabd93=fd.getReference("Telepackage/daily/Tab9/3");
        tabd94=fd.getReference("Telepackage/daily/Tab9/4");
        tabd95=fd.getReference("Telepackage/daily/Tab9/5");

        tabd100=fd.getReference("Telepackage/daily/Tab10/0");
        tabd101=fd.getReference("Telepackage/daily/Tab10/1");
        tabd102=fd.getReference("Telepackage/daily/Tab10/2");
        tabd103=fd.getReference("Telepackage/daily/Tab10/3");
        tabd104=fd.getReference("Telepackage/daily/Tab10/4");
        tabd105=fd.getReference("Telepackage/daily/Tab10/5");

        tabd110=fd.getReference("Telepackage/daily/Tab11/0");
        tabd111=fd.getReference("Telepackage/daily/Tab11/1");
        tabd112=fd.getReference("Telepackage/daily/Tab11/2");
        tabd113=fd.getReference("Telepackage/daily/Tab11/3");
        tabd114=fd.getReference("Telepackage/daily/Tab11/4");
        tabd115=fd.getReference("Telepackage/daily/Tab11/5");

        tabd120=fd.getReference("Telepackage/daily/Tab12/0");
        tabd121=fd.getReference("Telepackage/daily/Tab12/1");
        tabd122=fd.getReference("Telepackage/daily/Tab12/2");
        tabd123=fd.getReference("Telepackage/daily/Tab12/3");
        tabd124=fd.getReference("Telepackage/daily/Tab12/4");
        tabd125=fd.getReference("Telepackage/daily/Tab12/5");


        foryoud10=fd.getReference("Telepackage/daily/foryou1/0");
        foryoud11=fd.getReference("Telepackage/daily/foryou1/1");
        foryoud12=fd.getReference("Telepackage/daily/foryou1/2");
        foryoud13=fd.getReference("Telepackage/daily/foryou1/3");
        foryoud14=fd.getReference("Telepackage/daily/foryou1/4");
        foryoud15=fd.getReference("Telepackage/daily/foryou1/5");

        foryoud20=fd.getReference("Telepackage/daily/foryou2/0");
        foryoud21=fd.getReference("Telepackage/daily/foryou2/1");
        foryoud22=fd.getReference("Telepackage/daily/foryou2/2");
        foryoud23=fd.getReference("Telepackage/daily/foryou2/3");
        foryoud24=fd.getReference("Telepackage/daily/foryou2/4");
        foryoud25=fd.getReference("Telepackage/daily/foryou2/5");

        foryoud30=fd.getReference("Telepackage/daily/foryou3/0");
        foryoud31=fd.getReference("Telepackage/daily/foryou3/1");
        foryoud32=fd.getReference("Telepackage/daily/foryou3/2");
        foryoud33=fd.getReference("Telepackage/daily/foryou3/3");
        foryoud34=fd.getReference("Telepackage/daily/foryou3/4");
        foryoud35=fd.getReference("Telepackage/daily/foryou3/5");

        foryoud40=fd.getReference("Telepackage/daily/foryou4/0");
        foryoud41=fd.getReference("Telepackage/daily/foryou4/1");
        foryoud42=fd.getReference("Telepackage/daily/foryou4/2");
        foryoud43=fd.getReference("Telepackage/daily/foryou4/3");
        foryoud44=fd.getReference("Telepackage/daily/foryou4/4");
        foryoud45=fd.getReference("Telepackage/daily/foryou4/5");

        foryoud50=fd.getReference("Telepackage/daily/foryou5/0");
        foryoud51=fd.getReference("Telepackage/daily/foryou5/1");
        foryoud52=fd.getReference("Telepackage/daily/foryou5/2");
        foryoud53=fd.getReference("Telepackage/daily/foryou5/3");
        foryoud54=fd.getReference("Telepackage/daily/foryou5/4");
        foryoud55=fd.getReference("Telepackage/daily/foryou5/5");

        foryoud60=fd.getReference("Telepackage/daily/foryou6/0");
        foryoud61=fd.getReference("Telepackage/daily/foryou6/1");
        foryoud62=fd.getReference("Telepackage/daily/foryou6/2");
        foryoud63=fd.getReference("Telepackage/daily/foryou6/3");
        foryoud64=fd.getReference("Telepackage/daily/foryou6/4");
        foryoud65=fd.getReference("Telepackage/daily/foryou6/5");

        foryoud70=fd.getReference("Telepackage/daily/foryou7/0");
        foryoud71=fd.getReference("Telepackage/daily/foryou7/1");
        foryoud72=fd.getReference("Telepackage/daily/foryou7/2");
        foryoud73=fd.getReference("Telepackage/daily/foryou7/3");
        foryoud74=fd.getReference("Telepackage/daily/foryou7/4");
        foryoud75=fd.getReference("Telepackage/daily/foryou7/5");

        foryoud80=fd.getReference("Telepackage/daily/foryou8/0");
        foryoud81=fd.getReference("Telepackage/daily/foryou8/1");
        foryoud82=fd.getReference("Telepackage/daily/foryou8/2");
        foryoud83=fd.getReference("Telepackage/daily/foryou8/3");
        foryoud84=fd.getReference("Telepackage/daily/foryou8/4");
        foryoud85=fd.getReference("Telepackage/daily/foryou8/5");

        foryoud90=fd.getReference("Telepackage/daily/foryou9/0");
        foryoud91=fd.getReference("Telepackage/daily/foryou9/1");
        foryoud92=fd.getReference("Telepackage/daily/foryou9/2");
        foryoud93=fd.getReference("Telepackage/daily/foryou9/3");
        foryoud94=fd.getReference("Telepackage/daily/foryou9/4");
        foryoud95=fd.getReference("Telepackage/daily/foryou9/5");

        foryoud100=fd.getReference("Telepackage/daily/foryou10/0");
        foryoud101=fd.getReference("Telepackage/daily/foryou10/1");
        foryoud102=fd.getReference("Telepackage/daily/foryou10/2");
        foryoud103=fd.getReference("Telepackage/daily/foryou10/3");
        foryoud104=fd.getReference("Telepackage/daily/foryou10/4");
        foryoud105=fd.getReference("Telepackage/daily/foryou10/5");

        foryoud110=fd.getReference("Telepackage/daily/foryou11/0");
        foryoud111=fd.getReference("Telepackage/daily/foryou11/1");
        foryoud112=fd.getReference("Telepackage/daily/foryou11/2");
        foryoud113=fd.getReference("Telepackage/daily/foryou11/3");
        foryoud114=fd.getReference("Telepackage/daily/foryou11/4");
        foryoud115=fd.getReference("Telepackage/daily/foryou11/5");

        foryoud120=fd.getReference("Telepackage/daily/foryou12/0");
        foryoud121=fd.getReference("Telepackage/daily/foryou12/1");
        foryoud122=fd.getReference("Telepackage/daily/foryou12/2");
        foryoud123=fd.getReference("Telepackage/daily/foryou12/3");
        foryoud124=fd.getReference("Telepackage/daily/foryou12/4");
        foryoud125=fd.getReference("Telepackage/daily/foryou12/5");

        giftd10=fd.getReference("Telepackage/daily/gift1/0");
        giftd11=fd.getReference("Telepackage/daily/gift1/1");
        giftd12=fd.getReference("Telepackage/daily/gift1/2");
        giftd13=fd.getReference("Telepackage/daily/gift1/3");
        giftd14=fd.getReference("Telepackage/daily/gift1/4");
        giftd15=fd.getReference("Telepackage/daily/gift1/5");

        giftd20=fd.getReference("Telepackage/daily/gift2/0");
        giftd21=fd.getReference("Telepackage/daily/gift2/1");
        giftd22=fd.getReference("Telepackage/daily/gift2/2");
        giftd23=fd.getReference("Telepackage/daily/gift2/3");
        giftd24=fd.getReference("Telepackage/daily/gift2/4");
        giftd25=fd.getReference("Telepackage/daily/gift2/5");

        giftd30=fd.getReference("Telepackage/daily/gift3/0");
        giftd31=fd.getReference("Telepackage/daily/gift3/1");
        giftd32=fd.getReference("Telepackage/daily/gift3/2");
        giftd33=fd.getReference("Telepackage/daily/gift3/3");
        giftd34=fd.getReference("Telepackage/daily/gift3/4");
        giftd35=fd.getReference("Telepackage/daily/gift3/5");

        giftd40=fd.getReference("Telepackage/daily/gift4/0");
        giftd41=fd.getReference("Telepackage/daily/gift4/1");
        giftd42=fd.getReference("Telepackage/daily/gift4/2");
        giftd43=fd.getReference("Telepackage/daily/gift4/3");
        giftd44=fd.getReference("Telepackage/daily/gift4/4");
        giftd45=fd.getReference("Telepackage/daily/gift4/5");

        giftd50=fd.getReference("Telepackage/daily/gift5/0");
        giftd51=fd.getReference("Telepackage/daily/gift5/1");
        giftd52=fd.getReference("Telepackage/daily/gift5/2");
        giftd53=fd.getReference("Telepackage/daily/gift5/3");
        giftd54=fd.getReference("Telepackage/daily/gift5/4");
        giftd55=fd.getReference("Telepackage/daily/gift5/5");

        giftd60=fd.getReference("Telepackage/daily/gift6/0");
        giftd61=fd.getReference("Telepackage/daily/gift6/1");
        giftd62=fd.getReference("Telepackage/daily/gift6/2");
        giftd63=fd.getReference("Telepackage/daily/gift6/3");
        giftd64=fd.getReference("Telepackage/daily/gift6/4");
        giftd65=fd.getReference("Telepackage/daily/gift6/5");

        giftd70=fd.getReference("Telepackage/daily/gift7/0");
        giftd71=fd.getReference("Telepackage/daily/gift7/1");
        giftd72=fd.getReference("Telepackage/daily/gift7/2");
        giftd73=fd.getReference("Telepackage/daily/gift7/3");
        giftd74=fd.getReference("Telepackage/daily/gift7/4");
        giftd75=fd.getReference("Telepackage/daily/gift7/5");

        giftd80=fd.getReference("Telepackage/daily/gift8/0");
        giftd81=fd.getReference("Telepackage/daily/gift8/1");
        giftd82=fd.getReference("Telepackage/daily/gift8/2");
        giftd83=fd.getReference("Telepackage/daily/gift8/3");
        giftd84=fd.getReference("Telepackage/daily/gift8/4");
        giftd85=fd.getReference("Telepackage/daily/gift8/5");

        giftd90=fd.getReference("Telepackage/daily/gift9/0");
        giftd91=fd.getReference("Telepackage/daily/gift9/1");
        giftd92=fd.getReference("Telepackage/daily/gift9/2");
        giftd93=fd.getReference("Telepackage/daily/gift9/3");
        giftd94=fd.getReference("Telepackage/daily/gift9/4");
        giftd95=fd.getReference("Telepackage/daily/gift9/5");

        giftd100=fd.getReference("Telepackage/daily/gift10/0");
        giftd101=fd.getReference("Telepackage/daily/gift10/1");
        giftd102=fd.getReference("Telepackage/daily/gift10/2");
        giftd103=fd.getReference("Telepackage/daily/gift10/3");
        giftd104=fd.getReference("Telepackage/daily/gift10/4");
        giftd105=fd.getReference("Telepackage/daily/gift10/5");

        giftd110=fd.getReference("Telepackage/daily/gift11/0");
        giftd111=fd.getReference("Telepackage/daily/gift11/1");
        giftd112=fd.getReference("Telepackage/daily/gift11/2");
        giftd113=fd.getReference("Telepackage/daily/gift11/3");
        giftd114=fd.getReference("Telepackage/daily/gift11/4");
        giftd115=fd.getReference("Telepackage/daily/gift11/5");

        giftd120=fd.getReference("Telepackage/daily/gift12/0");
        giftd121=fd.getReference("Telepackage/daily/gift12/1");
        giftd122=fd.getReference("Telepackage/daily/gift12/2");
        giftd123=fd.getReference("Telepackage/daily/gift12/3");
        giftd124=fd.getReference("Telepackage/daily/gift12/4");
        giftd125=fd.getReference("Telepackage/daily/gift12/5");


        tabw10=fd.getReference("Telepackage/weekly/Tab1/0");
        tabw11=fd.getReference("Telepackage/weekly/Tab1/1");
        tabw12=fd.getReference("Telepackage/weekly/Tab1/2");
        tabw13=fd.getReference("Telepackage/weekly/Tab1/3");
        tabw14=fd.getReference("Telepackage/weekly/Tab1/4");
        tabw15=fd.getReference("Telepackage/weekly/Tab1/5");

        tabw20=fd.getReference("Telepackage/weekly/Tab2/0");
        tabw21=fd.getReference("Telepackage/weekly/Tab2/1");
        tabw22=fd.getReference("Telepackage/weekly/Tab2/2");
        tabw23=fd.getReference("Telepackage/weekly/Tab2/3");
        tabw24=fd.getReference("Telepackage/weekly/Tab2/4");
        tabw25=fd.getReference("Telepackage/weekly/Tab2/5");

        tabw30=fd.getReference("Telepackage/weekly/Tab3/0");
        tabw31=fd.getReference("Telepackage/weekly/Tab3/1");
        tabw32=fd.getReference("Telepackage/weekly/Tab3/2");
        tabw33=fd.getReference("Telepackage/weekly/Tab3/3");
        tabw34=fd.getReference("Telepackage/weekly/Tab3/4");
        tabw35=fd.getReference("Telepackage/weekly/Tab3/5");

        tabw40=fd.getReference("Telepackage/weekly/Tab4/0");
        tabw41=fd.getReference("Telepackage/weekly/Tab4/1");
        tabw42=fd.getReference("Telepackage/weekly/Tab4/2");
        tabw43=fd.getReference("Telepackage/weekly/Tab4/3");
        tabw44=fd.getReference("Telepackage/weekly/Tab4/4");
        tabw45=fd.getReference("Telepackage/weekly/Tab4/5");

        tabw50=fd.getReference("Telepackage/weekly/Tab5/0");
        tabw51=fd.getReference("Telepackage/weekly/Tab5/1");
        tabw52=fd.getReference("Telepackage/weekly/Tab5/2");
        tabw53=fd.getReference("Telepackage/weekly/Tab5/3");
        tabw54=fd.getReference("Telepackage/weekly/Tab5/4");
        tabw55=fd.getReference("Telepackage/weekly/Tab5/5");

        tabw60=fd.getReference("Telepackage/weekly/Tab6/0");
        tabw61=fd.getReference("Telepackage/weekly/Tab6/1");
        tabw62=fd.getReference("Telepackage/weekly/Tab6/2");
        tabw63=fd.getReference("Telepackage/weekly/Tab6/3");
        tabw64=fd.getReference("Telepackage/weekly/Tab6/4");
        tabw65=fd.getReference("Telepackage/weekly/Tab6/5");

        tabw70=fd.getReference("Telepackage/weekly/Tab7/0");
        tabw71=fd.getReference("Telepackage/weekly/Tab7/1");
        tabw72=fd.getReference("Telepackage/weekly/Tab7/2");
        tabw73=fd.getReference("Telepackage/weekly/Tab7/3");
        tabw74=fd.getReference("Telepackage/weekly/Tab7/4");
        tabw75=fd.getReference("Telepackage/weekly/Tab7/5");

        tabw80=fd.getReference("Telepackage/weekly/Tab8/0");
        tabw81=fd.getReference("Telepackage/weekly/Tab8/1");
        tabw82=fd.getReference("Telepackage/weekly/Tab8/2");
        tabw83=fd.getReference("Telepackage/weekly/Tab8/3");
        tabw84=fd.getReference("Telepackage/weekly/Tab8/4");
        tabw85=fd.getReference("Telepackage/weekly/Tab8/5");

        tabw90=fd.getReference("Telepackage/weekly/Tab9/0");
        tabw91=fd.getReference("Telepackage/weekly/Tab9/1");
        tabw92=fd.getReference("Telepackage/weekly/Tab9/2");
        tabw93=fd.getReference("Telepackage/weekly/Tab9/3");
        tabw94=fd.getReference("Telepackage/weekly/Tab9/4");
        tabw95=fd.getReference("Telepackage/weekly/Tab9/5");

        tabw100=fd.getReference("Telepackage/weekly/Tab10/0");
        tabw101=fd.getReference("Telepackage/weekly/Tab10/1");
        tabw102=fd.getReference("Telepackage/weekly/Tab10/2");
        tabw103=fd.getReference("Telepackage/weekly/Tab10/3");
        tabw104=fd.getReference("Telepackage/weekly/Tab10/4");
        tabw105=fd.getReference("Telepackage/weekly/Tab10/5");

        tabw110=fd.getReference("Telepackage/weekly/Tab11/0");
        tabw111=fd.getReference("Telepackage/weekly/Tab11/1");
        tabw112=fd.getReference("Telepackage/weekly/Tab11/2");
        tabw113=fd.getReference("Telepackage/weekly/Tab11/3");
        tabd114=fd.getReference("Telepackage/weekly/Tab11/4");
        tabd115=fd.getReference("Telepackage/weekly/Tab11/5");

        tabw120=fd.getReference("Telepackage/weekly/Tab12/0");
        tabw121=fd.getReference("Telepackage/weekly/Tab12/1");
        tabw122=fd.getReference("Telepackage/weekly/Tab12/2");
        tabw123=fd.getReference("Telepackage/weekly/Tab12/3");
        tabw124=fd.getReference("Telepackage/weekly/Tab12/4");
        tabw125=fd.getReference("Telepackage/weekly/Tab12/5");


        foryouw10=fd.getReference("Telepackage/weekly/foryou1/0");
        foryouw11=fd.getReference("Telepackage/weekly/foryou1/1");
        foryouw12=fd.getReference("Telepackage/weekly/foryou1/2");
        foryouw13=fd.getReference("Telepackage/weekly/foryou1/3");
        foryouw14=fd.getReference("Telepackage/weekly/foryou1/4");
        foryouw15=fd.getReference("Telepackage/weekly/foryou1/5");

        foryouw20=fd.getReference("Telepackage/weekly/foryou2/0");
        foryouw21=fd.getReference("Telepackage/weekly/foryou2/1");
        foryouw22=fd.getReference("Telepackage/weekly/foryou2/2");
        foryouw23=fd.getReference("Telepackage/weekly/foryou2/3");
        foryouw24=fd.getReference("Telepackage/weekly/foryou2/4");
        foryouw25=fd.getReference("Telepackage/weekly/foryou2/5");

        foryouw30=fd.getReference("Telepackage/weekly/foryou3/0");
        foryouw31=fd.getReference("Telepackage/weekly/foryou3/1");
        foryouw32=fd.getReference("Telepackage/weekly/foryou3/2");
        foryouw33=fd.getReference("Telepackage/weekly/foryou3/3");
        foryouw34=fd.getReference("Telepackage/weekly/foryou3/4");
        foryouw35=fd.getReference("Telepackage/weekly/foryou3/5");

        foryouw40=fd.getReference("Telepackage/weekly/foryou4/0");
        foryouw41=fd.getReference("Telepackage/weekly/foryou4/1");
        foryouw42=fd.getReference("Telepackage/weekly/foryou4/2");
        foryouw43=fd.getReference("Telepackage/weekly/foryou4/3");
        foryouw44=fd.getReference("Telepackage/weekly/foryou4/4");
        foryouw45=fd.getReference("Telepackage/weekly/foryou4/5");

        foryouw50=fd.getReference("Telepackage/weekly/foryou5/0");
        foryouw51=fd.getReference("Telepackage/weekly/foryou5/1");
        foryouw52=fd.getReference("Telepackage/weekly/foryou5/2");
        foryouw53=fd.getReference("Telepackage/weekly/foryou5/3");
        foryouw54=fd.getReference("Telepackage/weekly/foryou5/4");
        foryouw55=fd.getReference("Telepackage/weekly/foryou5/5");

        foryouw60=fd.getReference("Telepackage/weekly/foryou6/0");
        foryouw61=fd.getReference("Telepackage/weekly/foryou6/1");
        foryouw62=fd.getReference("Telepackage/weekly/foryou6/2");
        foryouw63=fd.getReference("Telepackage/weekly/foryou6/3");
        foryouw64=fd.getReference("Telepackage/weekly/foryou6/4");
        foryouw65=fd.getReference("Telepackage/weekly/foryou6/5");

        foryouw70=fd.getReference("Telepackage/weekly/foryou7/0");
        foryouw71=fd.getReference("Telepackage/weekly/foryou7/1");
        foryouw72=fd.getReference("Telepackage/weekly/foryou7/2");
        foryouw73=fd.getReference("Telepackage/weekly/foryou7/3");
        foryouw74=fd.getReference("Telepackage/weekly/foryou7/4");
        foryouw75=fd.getReference("Telepackage/weekly/foryou7/5");

        foryouw80=fd.getReference("Telepackage/weekly/foryou8/0");
        foryouw81=fd.getReference("Telepackage/weekly/foryou8/1");
        foryouw82=fd.getReference("Telepackage/weekly/foryou8/2");
        foryouw83=fd.getReference("Telepackage/weekly/foryou8/3");
        foryouw84=fd.getReference("Telepackage/weekly/foryou8/4");
        foryouw85=fd.getReference("Telepackage/weekly/foryou8/5");

        foryouw90=fd.getReference("Telepackage/weekly/foryou9/0");
        foryouw91=fd.getReference("Telepackage/weekly/foryou9/1");
        foryouw92=fd.getReference("Telepackage/weekly/foryou9/2");
        foryouw93=fd.getReference("Telepackage/weekly/foryou9/3");
        foryouw94=fd.getReference("Telepackage/weekly/foryou9/4");
        foryouw95=fd.getReference("Telepackage/weekly/foryou9/5");

        foryouw100=fd.getReference("Telepackage/weekly/foryou10/0");
        foryouw101=fd.getReference("Telepackage/weekly/foryou10/1");
        foryouw102=fd.getReference("Telepackage/weekly/foryou10/2");
        foryouw103=fd.getReference("Telepackage/weekly/foryou10/3");
        foryouw104=fd.getReference("Telepackage/weekly/foryou10/4");
        foryouw105=fd.getReference("Telepackage/weekly/foryou10/5");

        foryouw110=fd.getReference("Telepackage/weekly/foryou11/0");
        foryouw111=fd.getReference("Telepackage/weekly/foryou11/1");
        foryouw112=fd.getReference("Telepackage/weekly/foryou11/2");
        foryouw113=fd.getReference("Telepackage/weekly/foryou11/3");
        foryouw114=fd.getReference("Telepackage/weekly/foryou11/4");
        foryouw115=fd.getReference("Telepackage/weekly/foryou11/5");

        foryouw120=fd.getReference("Telepackage/weekly/foryou12/0");
        foryouw121=fd.getReference("Telepackage/weekly/foryou12/1");
        foryouw122=fd.getReference("Telepackage/weekly/foryou12/2");
        foryouw123=fd.getReference("Telepackage/weekly/foryou12/3");
        foryouw124=fd.getReference("Telepackage/weekly/foryou12/4");
        foryouw125=fd.getReference("Telepackage/weekly/foryou12/5");

        giftw10=fd.getReference("Telepackage/weekly/gift1/0");
        giftw11=fd.getReference("Telepackage/weekly/gift1/1");
        giftw12=fd.getReference("Telepackage/weekly/gift1/2");
        giftw13=fd.getReference("Telepackage/weekly/gift1/3");
        giftw14=fd.getReference("Telepackage/weekly/gift1/4");
        giftw15=fd.getReference("Telepackage/weekly/gift1/5");

        giftw20=fd.getReference("Telepackage/weekly/gift2/0");
        giftw21=fd.getReference("Telepackage/weekly/gift2/1");
        giftw22=fd.getReference("Telepackage/weekly/gift2/2");
        giftw23=fd.getReference("Telepackage/weekly/gift2/3");
        giftw24=fd.getReference("Telepackage/weekly/gift2/4");
        giftw25=fd.getReference("Telepackage/weekly/gift2/5");

        giftw30=fd.getReference("Telepackage/weekly/gift3/0");
        giftw31=fd.getReference("Telepackage/weekly/gift3/1");
        giftw32=fd.getReference("Telepackage/weekly/gift3/2");
        giftw33=fd.getReference("Telepackage/weekly/gift3/3");
        giftw34=fd.getReference("Telepackage/weekly/gift3/4");
        giftw35=fd.getReference("Telepackage/weekly/gift3/5");

        giftw40=fd.getReference("Telepackage/weekly/gift4/0");
        giftw41=fd.getReference("Telepackage/weekly/gift4/1");
        giftw42=fd.getReference("Telepackage/weekly/gift4/2");
        giftw43=fd.getReference("Telepackage/weekly/gift4/3");
        giftw44=fd.getReference("Telepackage/weekly/gift4/4");
        giftw45=fd.getReference("Telepackage/weekly/gift4/5");

        giftw50=fd.getReference("Telepackage/weekly/gift5/0");
        giftw51=fd.getReference("Telepackage/weekly/gift5/1");
        giftw52=fd.getReference("Telepackage/weekly/gift5/2");
        giftw53=fd.getReference("Telepackage/weekly/gift5/3");
        giftw54=fd.getReference("Telepackage/weekly/gift5/4");
        giftw55=fd.getReference("Telepackage/weekly/gift5/5");

        giftw60=fd.getReference("Telepackage/weekly/gift6/0");
        giftw61=fd.getReference("Telepackage/weekly/gift6/1");
        giftw62=fd.getReference("Telepackage/weekly/gift6/2");
        giftw63=fd.getReference("Telepackage/weekly/gift6/3");
        giftw64=fd.getReference("Telepackage/weekly/gift6/4");
        giftw65=fd.getReference("Telepackage/weekly/gift6/5");

        giftw70=fd.getReference("Telepackage/weekly/gift7/0");
        giftw71=fd.getReference("Telepackage/weekly/gift7/1");
        giftw72=fd.getReference("Telepackage/weekly/gift7/2");
        giftw73=fd.getReference("Telepackage/weekly/gift7/3");
        giftw74=fd.getReference("Telepackage/weekly/gift7/4");
        giftw75=fd.getReference("Telepackage/weekly/gift7/5");

        giftw80=fd.getReference("Telepackage/weekly/gift8/0");
        giftw81=fd.getReference("Telepackage/weekly/gift8/1");
        giftw82=fd.getReference("Telepackage/weekly/gift8/2");
        giftw83=fd.getReference("Telepackage/weekly/gift8/3");
        giftw84=fd.getReference("Telepackage/weekly/gift8/4");
        giftw85=fd.getReference("Telepackage/weekly/gift8/5");

        giftw90=fd.getReference("Telepackage/weekly/gift9/0");
        giftw91=fd.getReference("Telepackage/weekly/gift9/1");
        giftw92=fd.getReference("Telepackage/weekly/gift9/2");
        giftw93=fd.getReference("Telepackage/weekly/gift9/3");
        giftw94=fd.getReference("Telepackage/weekly/gift9/4");
        giftw95=fd.getReference("Telepackage/weekly/gift9/5");

        giftw100=fd.getReference("Telepackage/weekly/gift10/0");
        giftw101=fd.getReference("Telepackage/weekly/gift10/1");
        giftw102=fd.getReference("Telepackage/weekly/gift10/2");
        giftw103=fd.getReference("Telepackage/weekly/gift10/3");
        giftw104=fd.getReference("Telepackage/weekly/gift10/4");
        giftw105=fd.getReference("Telepackage/weekly/gift10/5");

        giftw110=fd.getReference("Telepackage/weekly/gift11/0");
        giftw111=fd.getReference("Telepackage/weekly/gift11/1");
        giftw112=fd.getReference("Telepackage/weekly/gift11/2");
        giftw113=fd.getReference("Telepackage/weekly/gift11/3");
        giftw114=fd.getReference("Telepackage/weekly/gift11/4");
        giftw115=fd.getReference("Telepackage/weekly/gift11/5");

        giftw120=fd.getReference("Telepackage/weekly/gift12/0");
        giftw121=fd.getReference("Telepackage/weekly/gift12/1");
        giftw122=fd.getReference("Telepackage/weekly/gift12/2");
        giftw123=fd.getReference("Telepackage/weekly/gift12/3");
        giftw124=fd.getReference("Telepackage/weekly/gift12/4");
        giftw125=fd.getReference("Telepackage/weekly/gift12/5");

        tabm10=fd.getReference("Telepackage/monthly/Tab1/0");
        tabm11=fd.getReference("Telepackage/monthly/Tab1/1");
        tabm12=fd.getReference("Telepackage/monthly/Tab1/2");
        tabm13=fd.getReference("Telepackage/monthly/Tab1/3");
        tabm14=fd.getReference("Telepackage/monthly/Tab1/4");
        tabm15=fd.getReference("Telepackage/monthly/Tab1/5");

        tabm20=fd.getReference("Telepackage/monthly/Tab2/0");
        tabm21=fd.getReference("Telepackage/monthly/Tab2/1");
        tabm22=fd.getReference("Telepackage/monthly/Tab2/2");
        tabm23=fd.getReference("Telepackage/monthly/Tab2/3");
        tabm24=fd.getReference("Telepackage/monthly/Tab2/4");
        tabm25=fd.getReference("Telepackage/monthly/Tab2/5");

        tabm30=fd.getReference("Telepackage/monthly/Tab3/0");
        tabm31=fd.getReference("Telepackage/monthly/Tab3/1");
        tabm32=fd.getReference("Telepackage/monthly/Tab3/2");
        tabm33=fd.getReference("Telepackage/monthly/Tab3/3");
        tabm34=fd.getReference("Telepackage/monthly/Tab3/4");
        tabm35=fd.getReference("Telepackage/monthly/Tab3/5");

        tabm40=fd.getReference("Telepackage/monthly/Tab4/0");
        tabm41=fd.getReference("Telepackage/monthly/Tab4/1");
        tabm42=fd.getReference("Telepackage/monthly/Tab4/2");
        tabm43=fd.getReference("Telepackage/monthly/Tab4/3");
        tabm44=fd.getReference("Telepackage/monthly/Tab4/4");
        tabm45=fd.getReference("Telepackage/monthly/Tab4/5");

        tabm50=fd.getReference("Telepackage/monthly/Tab5/0");
        tabm51=fd.getReference("Telepackage/monthly/Tab5/1");
        tabm52=fd.getReference("Telepackage/monthly/Tab5/2");
        tabm53=fd.getReference("Telepackage/monthly/Tab5/3");
        tabm54=fd.getReference("Telepackage/monthly/Tab5/4");
        tabm55=fd.getReference("Telepackage/monthly/Tab5/5");

        tabm60=fd.getReference("Telepackage/monthly/Tab6/0");
        tabm61=fd.getReference("Telepackage/monthly/Tab6/1");
        tabm62=fd.getReference("Telepackage/monthly/Tab6/2");
        tabm63=fd.getReference("Telepackage/monthly/Tab6/3");
        tabm64=fd.getReference("Telepackage/monthly/Tab6/4");
        tabm65=fd.getReference("Telepackage/monthly/Tab6/5");

        tabm70=fd.getReference("Telepackage/monthly/Tab7/0");
        tabm71=fd.getReference("Telepackage/monthly/Tab7/1");
        tabm72=fd.getReference("Telepackage/monthly/Tab7/2");
        tabm73=fd.getReference("Telepackage/monthly/Tab7/3");
        tabm74=fd.getReference("Telepackage/monthly/Tab7/4");
        tabm75=fd.getReference("Telepackage/monthly/Tab7/5");

        tabm80=fd.getReference("Telepackage/monthly/Tab8/0");
        tabm81=fd.getReference("Telepackage/monthly/Tab8/1");
        tabm82=fd.getReference("Telepackage/monthly/Tab8/2");
        tabm83=fd.getReference("Telepackage/monthly/Tab8/3");
        tabm84=fd.getReference("Telepackage/monthly/Tab8/4");
        tabm85=fd.getReference("Telepackage/monthly/Tab8/5");

        tabm90=fd.getReference("Telepackage/monthly/Tab9/0");
        tabm91=fd.getReference("Telepackage/monthly/Tab9/1");
        tabm92=fd.getReference("Telepackage/monthly/Tab9/2");
        tabm93=fd.getReference("Telepackage/monthly/Tab9/3");
        tabm94=fd.getReference("Telepackage/monthly/Tab9/4");
        tabm95=fd.getReference("Telepackage/monthly/Tab9/5");

        tabm100=fd.getReference("Telepackage/monthly/Tab10/0");
        tabm101=fd.getReference("Telepackage/monthly/Tab10/1");
        tabm102=fd.getReference("Telepackage/monthly/Tab10/2");
        tabm103=fd.getReference("Telepackage/monthly/Tab10/3");
        tabm104=fd.getReference("Telepackage/monthly/Tab10/4");
        tabm105=fd.getReference("Telepackage/monthly/Tab10/5");

        tabm110=fd.getReference("Telepackage/monthly/Tab11/0");
        tabm111=fd.getReference("Telepackage/monthly/Tab11/1");
        tabm112=fd.getReference("Telepackage/monthly/Tab11/2");
        tabm113=fd.getReference("Telepackage/monthly/Tab11/3");
        tabm114=fd.getReference("Telepackage/monthly/Tab11/4");
        tabm115=fd.getReference("Telepackage/monthly/Tab11/5");

        tabm120=fd.getReference("Telepackage/monthly/Tab12/0");
        tabm121=fd.getReference("Telepackage/monthly/Tab12/1");
        tabm122=fd.getReference("Telepackage/monthly/Tab12/2");
        tabm123=fd.getReference("Telepackage/monthly/Tab12/3");
        tabm124=fd.getReference("Telepackage/monthly/Tab12/4");
        tabm125=fd.getReference("Telepackage/monthly/Tab12/5");


        foryoum10=fd.getReference("Telepackage/monthly/foryou1/0");
        foryoum11=fd.getReference("Telepackage/monthly/foryou1/1");
        foryoum12=fd.getReference("Telepackage/monthly/foryou1/2");
        foryoum13=fd.getReference("Telepackage/monthly/foryou1/3");
        foryoum14=fd.getReference("Telepackage/monthly/foryou1/4");
        foryoum15=fd.getReference("Telepackage/monthly/foryou1/5");

        foryoum20=fd.getReference("Telepackage/monthly/foryou2/0");
        foryoum21=fd.getReference("Telepackage/monthly/foryou2/1");
        foryoum22=fd.getReference("Telepackage/monthly/foryou2/2");
        foryoum23=fd.getReference("Telepackage/monthly/foryou2/3");
        foryoum24=fd.getReference("Telepackage/monthly/foryou2/4");
        foryoum25=fd.getReference("Telepackage/monthly/foryou2/5");

        foryoum30=fd.getReference("Telepackage/monthly/foryou3/0");
        foryoum31=fd.getReference("Telepackage/monthly/foryou3/1");
        foryoum32=fd.getReference("Telepackage/monthly/foryou3/2");
        foryoum33=fd.getReference("Telepackage/monthly/foryou3/3");
        foryoum34=fd.getReference("Telepackage/monthly/foryou3/4");
        foryoum35=fd.getReference("Telepackage/monthly/foryou3/5");

        foryoum40=fd.getReference("Telepackage/monthly/foryou4/0");
        foryoum41=fd.getReference("Telepackage/monthly/foryou4/1");
        foryoum42=fd.getReference("Telepackage/monthly/foryou4/2");
        foryoum43=fd.getReference("Telepackage/monthly/foryou4/3");
        foryoum44=fd.getReference("Telepackage/monthly/foryou4/4");
        foryoum45=fd.getReference("Telepackage/monthly/foryou4/5");

        foryoum50=fd.getReference("Telepackage/monthly/foryou5/0");
        foryoum51=fd.getReference("Telepackage/monthly/foryou5/1");
        foryoum52=fd.getReference("Telepackage/monthly/foryou5/2");
        foryoum53=fd.getReference("Telepackage/monthly/foryou5/3");
        foryoum54=fd.getReference("Telepackage/monthly/foryou5/4");
        foryoum55=fd.getReference("Telepackage/monthly/foryou5/5");

        foryoum60=fd.getReference("Telepackage/monthly/foryou6/0");
        foryoum61=fd.getReference("Telepackage/monthly/foryou6/1");
        foryoum62=fd.getReference("Telepackage/monthly/foryou6/2");
        foryoum63=fd.getReference("Telepackage/monthly/foryou6/3");
        foryoum64=fd.getReference("Telepackage/monthly/foryou6/4");
        foryoum65=fd.getReference("Telepackage/monthly/foryou6/5");

        foryoum70=fd.getReference("Telepackage/monthly/foryou7/0");
        foryoum71=fd.getReference("Telepackage/monthly/foryou7/1");
        foryoum72=fd.getReference("Telepackage/monthly/foryou7/2");
        foryoum73=fd.getReference("Telepackage/monthly/foryou7/3");
        foryoum74=fd.getReference("Telepackage/monthly/foryou7/4");
        foryoum75=fd.getReference("Telepackage/monthly/foryou7/5");

        foryoum80=fd.getReference("Telepackage/monthly/foryou8/0");
        foryoum81=fd.getReference("Telepackage/monthly/foryou8/1");
        foryoum82=fd.getReference("Telepackage/monthly/foryou8/2");
        foryoum83=fd.getReference("Telepackage/monthly/foryou8/3");
        foryoum84=fd.getReference("Telepackage/monthly/foryou8/4");
        foryoum85=fd.getReference("Telepackage/monthly/foryou8/5");

        foryoum90=fd.getReference("Telepackage/monthly/foryou9/0");
        foryoum91=fd.getReference("Telepackage/monthly/foryou9/1");
        foryoum92=fd.getReference("Telepackage/monthly/foryou9/2");
        foryoum93=fd.getReference("Telepackage/monthly/foryou9/3");
        foryoum94=fd.getReference("Telepackage/monthly/foryou9/4");
        foryoum95=fd.getReference("Telepackage/monthly/foryou9/5");

        foryoum100=fd.getReference("Telepackage/monthly/foryou10/0");
        foryoum101=fd.getReference("Telepackage/monthly/foryou10/1");
        foryoum102=fd.getReference("Telepackage/monthly/foryou10/2");
        foryoum103=fd.getReference("Telepackage/monthly/foryou10/3");
        foryoum104=fd.getReference("Telepackage/monthly/foryou10/4");
        foryoum105=fd.getReference("Telepackage/monthly/foryou10/5");

        foryoum110=fd.getReference("Telepackage/monthly/foryou11/0");
        foryoum111=fd.getReference("Telepackage/monthly/foryou11/1");
        foryoum112=fd.getReference("Telepackage/monthly/foryou11/2");
        foryoum113=fd.getReference("Telepackage/monthly/foryou11/3");
        foryoum114=fd.getReference("Telepackage/monthly/foryou11/4");
        foryoum115=fd.getReference("Telepackage/monthly/foryou11/5");

        foryoum120=fd.getReference("Telepackage/monthly/foryou12/0");
        foryoum121=fd.getReference("Telepackage/monthly/foryou12/1");
        foryoum122=fd.getReference("Telepackage/monthly/foryou12/2");
        foryoum123=fd.getReference("Telepackage/monthly/foryou12/3");
        foryoum124=fd.getReference("Telepackage/monthly/foryou12/4");
        foryoum125=fd.getReference("Telepackage/monthly/foryou12/5");

        giftm10=fd.getReference("Telepackage/monthly/gift1/0");
        giftm11=fd.getReference("Telepackage/monthly/gift1/1");
        giftm12=fd.getReference("Telepackage/monthly/gift1/2");
        giftm13=fd.getReference("Telepackage/monthly/gift1/3");
        giftm14=fd.getReference("Telepackage/monthly/gift1/4");
        giftm15=fd.getReference("Telepackage/monthly/gift1/5");

        giftm20=fd.getReference("Telepackage/monthly/gift2/0");
        giftm21=fd.getReference("Telepackage/monthly/gift2/1");
        giftm22=fd.getReference("Telepackage/monthly/gift2/2");
        giftm23=fd.getReference("Telepackage/monthly/gift2/3");
        giftm24=fd.getReference("Telepackage/monthly/gift2/4");
        giftm25=fd.getReference("Telepackage/monthly/gift2/5");

        giftm30=fd.getReference("Telepackage/monthly/gift3/0");
        giftm31=fd.getReference("Telepackage/monthly/gift3/1");
        giftm32=fd.getReference("Telepackage/monthly/gift3/2");
        giftm33=fd.getReference("Telepackage/monthly/gift3/3");
        giftm34=fd.getReference("Telepackage/monthly/gift3/4");
        giftm35=fd.getReference("Telepackage/monthly/gift3/5");

        giftm40=fd.getReference("Telepackage/monthly/gift4/0");
        giftm41=fd.getReference("Telepackage/monthly/gift4/1");
        giftm42=fd.getReference("Telepackage/monthly/gift4/2");
        giftm43=fd.getReference("Telepackage/monthly/gift4/3");
        giftm44=fd.getReference("Telepackage/monthly/gift4/4");
        giftm45=fd.getReference("Telepackage/monthly/gift4/5");

        giftm50=fd.getReference("Telepackage/monthly/gift5/0");
        giftm51=fd.getReference("Telepackage/monthly/gift5/1");
        giftm52=fd.getReference("Telepackage/monthly/gift5/2");
        giftm53=fd.getReference("Telepackage/monthly/gift5/3");
        giftm54=fd.getReference("Telepackage/monthly/gift5/4");
        giftm55=fd.getReference("Telepackage/monthly/gift5/5");

        giftm60=fd.getReference("Telepackage/monthly/gift6/0");
        giftm61=fd.getReference("Telepackage/monthly/gift6/1");
        giftm62=fd.getReference("Telepackage/monthly/gift6/2");
        giftm63=fd.getReference("Telepackage/monthly/gift6/3");
        giftm64=fd.getReference("Telepackage/monthly/gift6/4");
        giftm65=fd.getReference("Telepackage/monthly/gift6/5");

        giftm70=fd.getReference("Telepackage/monthly/gift7/0");
        giftm71=fd.getReference("Telepackage/monthly/gift7/1");
        giftm72=fd.getReference("Telepackage/monthly/gift7/2");
        giftm73=fd.getReference("Telepackage/monthly/gift7/3");
        giftm74=fd.getReference("Telepackage/monthly/gift7/4");
        giftm75=fd.getReference("Telepackage/monthly/gift7/5");

        giftm80=fd.getReference("Telepackage/monthly/gift8/0");
        giftm81=fd.getReference("Telepackage/monthly/gift8/1");
        giftm82=fd.getReference("Telepackage/monthly/gift8/2");
        giftm83=fd.getReference("Telepackage/monthly/gift8/3");
        giftm84=fd.getReference("Telepackage/monthly/gift8/4");
        giftm85=fd.getReference("Telepackage/monthly/gift8/5");

        giftm90=fd.getReference("Telepackage/monthly/gift9/0");
        giftm91=fd.getReference("Telepackage/monthly/gift9/1");
        giftm92=fd.getReference("Telepackage/monthly/gift9/2");
        giftm93=fd.getReference("Telepackage/monthly/gift9/3");
        giftm94=fd.getReference("Telepackage/monthly/gift9/4");
        giftm95=fd.getReference("Telepackage/monthly/gift9/5");

        giftm100=fd.getReference("Telepackage/monthly/gift10/0");
        giftm101=fd.getReference("Telepackage/monthly/gift10/1");
        giftm102=fd.getReference("Telepackage/monthly/gift10/2");
        giftm103=fd.getReference("Telepackage/monthly/gift10/3");
        giftm104=fd.getReference("Telepackage/monthly/gift10/4");
        giftm105=fd.getReference("Telepackage/monthly/gift10/5");

        giftm110=fd.getReference("Telepackage/monthly/gift11/0");
        giftm111=fd.getReference("Telepackage/monthly/gift11/1");
        giftm112=fd.getReference("Telepackage/monthly/gift11/2");
        giftm113=fd.getReference("Telepackage/monthly/gift11/3");
        giftm114=fd.getReference("Telepackage/monthly/gift11/4");
        giftm115=fd.getReference("Telepackage/monthly/gift11/5");

        giftm120=fd.getReference("Telepackage/monthly/gift12/0");
        giftm121=fd.getReference("Telepackage/monthly/gift12/1");
        giftm122=fd.getReference("Telepackage/monthly/gift12/2");
        giftm123=fd.getReference("Telepackage/monthly/gift12/3");
        giftm124=fd.getReference("Telepackage/monthly/gift12/4");
        giftm125=fd.getReference("Telepackage/monthly/gift12/5");


        tabn10=fd.getReference("Telepackage/night/Tab1/0");
        tabn11=fd.getReference("Telepackage/night/Tab1/1");
        tabn12=fd.getReference("Telepackage/night/Tab1/2");
        tabn13=fd.getReference("Telepackage/night/Tab1/3");
        tabn14=fd.getReference("Telepackage/night/Tab1/4");
        tabn15=fd.getReference("Telepackage/night/Tab1/5");

        tabn20=fd.getReference("Telepackage/night/Tab2/0");
        tabn21=fd.getReference("Telepackage/night/Tab2/1");
        tabn22=fd.getReference("Telepackage/night/Tab2/2");
        tabn23=fd.getReference("Telepackage/night/Tab2/3");
        tabn24=fd.getReference("Telepackage/night/Tab2/4");
        tabn25=fd.getReference("Telepackage/night/Tab2/5");

        tabn30=fd.getReference("Telepackage/night/Tab3/0");
        tabn31=fd.getReference("Telepackage/night/Tab3/1");
        tabn32=fd.getReference("Telepackage/night/Tab3/2");
        tabn33=fd.getReference("Telepackage/night/Tab3/3");
        tabn34=fd.getReference("Telepackage/night/Tab3/4");
        tabn35=fd.getReference("Telepackage/night/Tab3/5");

        tabn40=fd.getReference("Telepackage/night/Tab4/0");
        tabn41=fd.getReference("Telepackage/night/Tab4/1");
        tabn42=fd.getReference("Telepackage/night/Tab4/2");
        tabn43=fd.getReference("Telepackage/night/Tab4/3");
        tabn44=fd.getReference("Telepackage/night/Tab4/4");
        tabn45=fd.getReference("Telepackage/night/Tab4/5");

        tabn50=fd.getReference("Telepackage/night/Tab5/0");
        tabn51=fd.getReference("Telepackage/night/Tab5/1");
        tabn52=fd.getReference("Telepackage/night/Tab5/2");
        tabn53=fd.getReference("Telepackage/night/Tab5/3");
        tabn54=fd.getReference("Telepackage/night/Tab5/4");
        tabn55=fd.getReference("Telepackage/night/Tab5/5");

        tabn60=fd.getReference("Telepackage/night/Tab6/0");
        tabn61=fd.getReference("Telepackage/night/Tab6/1");
        tabn62=fd.getReference("Telepackage/night/Tab6/2");
        tabn63=fd.getReference("Telepackage/night/Tab6/3");
        tabn64=fd.getReference("Telepackage/night/Tab6/4");
        tabn65=fd.getReference("Telepackage/night/Tab6/5");

        tabn70=fd.getReference("Telepackage/night/Tab7/0");
        tabn71=fd.getReference("Telepackage/night/Tab7/1");
        tabn72=fd.getReference("Telepackage/night/Tab7/2");
        tabn73=fd.getReference("Telepackage/night/Tab7/3");
        tabn74=fd.getReference("Telepackage/night/Tab7/4");
        tabn75=fd.getReference("Telepackage/night/Tab7/5");

        tabn80=fd.getReference("Telepackage/night/Tab8/0");
        tabn81=fd.getReference("Telepackage/night/Tab8/1");
        tabn82=fd.getReference("Telepackage/night/Tab8/2");
        tabn83=fd.getReference("Telepackage/night/Tab8/3");
        tabn84=fd.getReference("Telepackage/night/Tab8/4");
        tabn85=fd.getReference("Telepackage/night/Tab8/5");

        tabn90=fd.getReference("Telepackage/night/Tab9/0");
        tabn91=fd.getReference("Telepackage/night/Tab9/1");
        tabn92=fd.getReference("Telepackage/night/Tab9/2");
        tabn93=fd.getReference("Telepackage/night/Tab9/3");
        tabn94=fd.getReference("Telepackage/night/Tab9/4");
        tabn95=fd.getReference("Telepackage/night/Tab9/5");

        tabn100=fd.getReference("Telepackage/night/Tab10/0");
        tabn101=fd.getReference("Telepackage/night/Tab10/1");
        tabn102=fd.getReference("Telepackage/night/Tab10/2");
        tabn103=fd.getReference("Telepackage/night/Tab10/3");
        tabn104=fd.getReference("Telepackage/night/Tab10/4");
        tabn105=fd.getReference("Telepackage/night/Tab10/5");

        tabn110=fd.getReference("Telepackage/night/Tab11/0");
        tabn111=fd.getReference("Telepackage/night/Tab11/1");
        tabn112=fd.getReference("Telepackage/night/Tab11/2");
        tabn113=fd.getReference("Telepackage/night/Tab11/3");
        tabn114=fd.getReference("Telepackage/night/Tab11/4");
        tabn115=fd.getReference("Telepackage/night/Tab11/5");

        tabn120=fd.getReference("Telepackage/night/Tab12/0");
        tabn121=fd.getReference("Telepackage/night/Tab12/1");
        tabn122=fd.getReference("Telepackage/night/Tab12/2");
        tabn123=fd.getReference("Telepackage/night/Tab12/3");
        tabn124=fd.getReference("Telepackage/night/Tab12/4");
        tabn125=fd.getReference("Telepackage/night/Tab12/5");


        foryoun10=fd.getReference("Telepackage/night/foryou1/0");
        foryoun11=fd.getReference("Telepackage/night/foryou1/1");
        foryoun12=fd.getReference("Telepackage/night/foryou1/2");
        foryoun13=fd.getReference("Telepackage/night/foryou1/3");
        foryoun14=fd.getReference("Telepackage/night/foryou1/4");
        foryoun15=fd.getReference("Telepackage/night/foryou1/5");

        foryoun20=fd.getReference("Telepackage/night/foryou2/0");
        foryoun21=fd.getReference("Telepackage/night/foryou2/1");
        foryoun22=fd.getReference("Telepackage/night/foryou2/2");
        foryoun23=fd.getReference("Telepackage/night/foryou2/3");
        foryoun24=fd.getReference("Telepackage/night/foryou2/4");
        foryoun25=fd.getReference("Telepackage/night/foryou2/5");

        foryoun30=fd.getReference("Telepackage/night/foryou3/0");
        foryoun31=fd.getReference("Telepackage/night/foryou3/1");
        foryoun32=fd.getReference("Telepackage/night/foryou3/2");
        foryoun33=fd.getReference("Telepackage/night/foryou3/3");
        foryoun34=fd.getReference("Telepackage/night/foryou3/4");
        foryoun35=fd.getReference("Telepackage/night/foryou3/5");

        foryoun40=fd.getReference("Telepackage/night/foryou4/0");
        foryoun41=fd.getReference("Telepackage/night/foryou4/1");
        foryoun42=fd.getReference("Telepackage/night/foryou4/2");
        foryoun43=fd.getReference("Telepackage/night/foryou4/3");
        foryoun44=fd.getReference("Telepackage/night/foryou4/4");
        foryoun45=fd.getReference("Telepackage/night/foryou4/5");

        foryoun50=fd.getReference("Telepackage/night/foryou5/0");
        foryoun51=fd.getReference("Telepackage/night/foryou5/1");
        foryoun52=fd.getReference("Telepackage/night/foryou5/2");
        foryoun53=fd.getReference("Telepackage/night/foryou5/3");
        foryoun54=fd.getReference("Telepackage/night/foryou5/4");
        foryoun55=fd.getReference("Telepackage/night/foryou5/5");

        foryoun60=fd.getReference("Telepackage/night/foryou6/0");
        foryoun61=fd.getReference("Telepackage/night/foryou6/1");
        foryoun62=fd.getReference("Telepackage/night/foryou6/2");
        foryoun63=fd.getReference("Telepackage/night/foryou6/3");
        foryoun64=fd.getReference("Telepackage/night/foryou6/4");
        foryoun65=fd.getReference("Telepackage/night/foryou6/5");

        foryoun70=fd.getReference("Telepackage/night/foryou7/0");
        foryoun71=fd.getReference("Telepackage/night/foryou7/1");
        foryoun72=fd.getReference("Telepackage/night/foryou7/2");
        foryoun73=fd.getReference("Telepackage/night/foryou7/3");
        foryoun74=fd.getReference("Telepackage/night/foryou7/4");
        foryoun75=fd.getReference("Telepackage/night/foryou7/5");

        foryoun80=fd.getReference("Telepackage/night/foryou8/0");
        foryoun81=fd.getReference("Telepackage/night/foryou8/1");
        foryoun82=fd.getReference("Telepackage/night/foryou8/2");
        foryoun83=fd.getReference("Telepackage/night/foryou8/3");
        foryoun84=fd.getReference("Telepackage/night/foryou8/4");
        foryoun85=fd.getReference("Telepackage/night/foryou8/5");

        foryoun90=fd.getReference("Telepackage/night/foryou9/0");
        foryoun91=fd.getReference("Telepackage/night/foryou9/1");
        foryoun92=fd.getReference("Telepackage/night/foryou9/2");
        foryoun93=fd.getReference("Telepackage/night/foryou9/3");
        foryoun94=fd.getReference("Telepackage/night/foryou9/4");
        foryoun95=fd.getReference("Telepackage/night/foryou9/5");

        foryoun100=fd.getReference("Telepackage/night/foryou10/0");
        foryoun101=fd.getReference("Telepackage/night/foryou10/1");
        foryoun102=fd.getReference("Telepackage/night/foryou10/2");
        foryoun103=fd.getReference("Telepackage/night/foryou10/3");
        foryoun104=fd.getReference("Telepackage/night/foryou10/4");
        foryoun105=fd.getReference("Telepackage/night/foryou10/5");

        foryoun110=fd.getReference("Telepackage/night/foryou11/0");
        foryoun111=fd.getReference("Telepackage/night/foryou11/1");
        foryoun112=fd.getReference("Telepackage/night/foryou11/2");
        foryoun113=fd.getReference("Telepackage/night/foryou11/3");
        foryoun114=fd.getReference("Telepackage/night/foryou11/4");
        foryoun115=fd.getReference("Telepackage/night/foryou11/5");

        foryoun120=fd.getReference("Telepackage/night/foryou12/0");
        foryoun121=fd.getReference("Telepackage/night/foryou12/1");
        foryoun122=fd.getReference("Telepackage/night/foryou12/2");
        foryoun123=fd.getReference("Telepackage/night/foryou12/3");
        foryoun124=fd.getReference("Telepackage/night/foryou12/4");
        foryoun125=fd.getReference("Telepackage/night/foryou12/5");

        giftn10=fd.getReference("Telepackage/night/gift1/0");
        giftn11=fd.getReference("Telepackage/night/gift1/1");
        giftn12=fd.getReference("Telepackage/night/gift1/2");
        giftn13=fd.getReference("Telepackage/night/gift1/3");
        giftn14=fd.getReference("Telepackage/night/gift1/4");
        giftn15=fd.getReference("Telepackage/night/gift1/5");

        giftn20=fd.getReference("Telepackage/night/gift2/0");
        giftn21=fd.getReference("Telepackage/night/gift2/1");
        giftn22=fd.getReference("Telepackage/night/gift2/2");
        giftn23=fd.getReference("Telepackage/night/gift2/3");
        giftn24=fd.getReference("Telepackage/night/gift2/4");
        giftn25=fd.getReference("Telepackage/night/gift2/5");

        giftn30=fd.getReference("Telepackage/night/gift3/0");
        giftn31=fd.getReference("Telepackage/night/gift3/1");
        giftn32=fd.getReference("Telepackage/night/gift3/2");
        giftn33=fd.getReference("Telepackage/night/gift3/3");
        giftn34=fd.getReference("Telepackage/night/gift3/4");
        giftn35=fd.getReference("Telepackage/night/gift3/5");

        giftn40=fd.getReference("Telepackage/night/gift4/0");
        giftn41=fd.getReference("Telepackage/night/gift4/1");
        giftn42=fd.getReference("Telepackage/night/gift4/2");
        giftn43=fd.getReference("Telepackage/night/gift4/3");
        giftn44=fd.getReference("Telepackage/night/gift4/4");
        giftn45=fd.getReference("Telepackage/night/gift4/5");

        giftn50=fd.getReference("Telepackage/night/gift5/0");
        giftn51=fd.getReference("Telepackage/night/gift5/1");
        giftn52=fd.getReference("Telepackage/night/gift5/2");
        giftn53=fd.getReference("Telepackage/night/gift5/3");
        giftn54=fd.getReference("Telepackage/night/gift5/4");
        giftn55=fd.getReference("Telepackage/night/gift5/5");

        giftn60=fd.getReference("Telepackage/night/gift6/0");
        giftn61=fd.getReference("Telepackage/night/gift6/1");
        giftn62=fd.getReference("Telepackage/night/gift6/2");
        giftn63=fd.getReference("Telepackage/night/gift6/3");
        giftn64=fd.getReference("Telepackage/night/gift6/4");
        giftn65=fd.getReference("Telepackage/night/gift6/5");

        giftn70=fd.getReference("Telepackage/night/gift7/0");
        giftn71=fd.getReference("Telepackage/night/gift7/1");
        giftn72=fd.getReference("Telepackage/night/gift7/2");
        giftn73=fd.getReference("Telepackage/night/gift7/3");
        giftn74=fd.getReference("Telepackage/night/gift7/4");
        giftn75=fd.getReference("Telepackage/night/gift7/5");

        giftn80=fd.getReference("Telepackage/night/gift8/0");
        giftn81=fd.getReference("Telepackage/night/gift8/1");
        giftn82=fd.getReference("Telepackage/night/gift8/2");
        giftn83=fd.getReference("Telepackage/night/gift8/3");
        giftn84=fd.getReference("Telepackage/night/gift8/4");
        giftn85=fd.getReference("Telepackage/night/gift8/5");

        giftn90=fd.getReference("Telepackage/night/gift9/0");
        giftn91=fd.getReference("Telepackage/night/gift9/1");
        giftn92=fd.getReference("Telepackage/night/gift9/2");
        giftn93=fd.getReference("Telepackage/night/gift9/3");
        giftn94=fd.getReference("Telepackage/night/gift9/4");
        giftn95=fd.getReference("Telepackage/night/gift9/5");

        giftn100=fd.getReference("Telepackage/night/gift10/0");
        giftn101=fd.getReference("Telepackage/night/gift10/1");
        giftn102=fd.getReference("Telepackage/night/gift10/2");
        giftn103=fd.getReference("Telepackage/night/gift10/3");
        giftn104=fd.getReference("Telepackage/night/gift10/4");
        giftn105=fd.getReference("Telepackage/night/gift10/5");

        giftn110=fd.getReference("Telepackage/night/gift11/0");
        giftn111=fd.getReference("Telepackage/night/gift11/1");
        giftn112=fd.getReference("Telepackage/night/gift11/2");
        giftn113=fd.getReference("Telepackage/night/gift11/3");
        giftn114=fd.getReference("Telepackage/night/gift11/4");
        giftn115=fd.getReference("Telepackage/night/gift11/5");

        giftn120=fd.getReference("Telepackage/night/gift12/0");
        giftn121=fd.getReference("Telepackage/night/gift12/1");
        giftn122=fd.getReference("Telepackage/night/gift12/2");
        giftn123=fd.getReference("Telepackage/night/gift12/3");
        giftn124=fd.getReference("Telepackage/night/gift12/4");
        giftn125=fd.getReference("Telepackage/night/gift12/5");

    }
    public void telepackageamharic(){
        tabd10=fd.getReference("Telepackage/daily/Tab1/0");
        tabd11=fd.getReference("Telepackage/daily/Tab1/1");
        tabd12=fd.getReference("Telepackage/daily/Tab1/2");
        tabd13=fd.getReference("Telepackage/daily/Tab1/3");
        tabd14=fd.getReference("Telepackage/daily/Tab1/4");
        tabd15=fd.getReference("Telepackage/daily/Tab1/5");

        tabd20=fd.getReference("Telepackage/daily/Tab2/0");
        tabd21=fd.getReference("Telepackage/daily/Tab2/1");
        tabd22=fd.getReference("Telepackage/daily/Tab2/2");
        tabd23=fd.getReference("Telepackage/daily/Tab2/3");
        tabd24=fd.getReference("Telepackage/daily/Tab2/4");
        tabd25=fd.getReference("Telepackage/daily/Tab2/5");

        tabd30=fd.getReference("Telepackage/daily/Tab3/0");
        tabd31=fd.getReference("Telepackage/daily/Tab3/1");
        tabd32=fd.getReference("Telepackage/daily/Tab3/2");
        tabd33=fd.getReference("Telepackage/daily/Tab3/3");
        tabd34=fd.getReference("Telepackage/daily/Tab3/4");
        tabd35=fd.getReference("Telepackage/daily/Tab3/5");

        tabd40=fd.getReference("Telepackage/daily/Tab4/0");
        tabd41=fd.getReference("Telepackage/daily/Tab4/1");
        tabd42=fd.getReference("Telepackage/daily/Tab4/2");
        tabd43=fd.getReference("Telepackage/daily/Tab4/3");
        tabd44=fd.getReference("Telepackage/daily/Tab4/4");
        tabd45=fd.getReference("Telepackage/daily/Tab4/5");

        tabd50=fd.getReference("Telepackage/daily/Tab5/0");
        tabd51=fd.getReference("Telepackage/daily/Tab5/1");
        tabd52=fd.getReference("Telepackage/daily/Tab5/2");
        tabd53=fd.getReference("Telepackage/daily/Tab5/3");
        tabd54=fd.getReference("Telepackage/daily/Tab5/4");
        tabd55=fd.getReference("Telepackage/daily/Tab5/5");

        tabd60=fd.getReference("Telepackage/daily/Tab6/0");
        tabd61=fd.getReference("Telepackage/daily/Tab6/1");
        tabd62=fd.getReference("Telepackage/daily/Tab6/2");
        tabd63=fd.getReference("Telepackage/daily/Tab6/3");
        tabd64=fd.getReference("Telepackage/daily/Tab6/4");
        tabd65=fd.getReference("Telepackage/daily/Tab6/5");

        tabd70=fd.getReference("Telepackage/daily/Tab7/0");
        tabd71=fd.getReference("Telepackage/daily/Tab7/1");
        tabd72=fd.getReference("Telepackage/daily/Tab7/2");
        tabd73=fd.getReference("Telepackage/daily/Tab7/3");
        tabd74=fd.getReference("Telepackage/daily/Tab7/4");
        tabd75=fd.getReference("Telepackage/daily/Tab7/5");

        tabd80=fd.getReference("Telepackage/daily/Tab8/0");
        tabd81=fd.getReference("Telepackage/daily/Tab8/1");
        tabd82=fd.getReference("Telepackage/daily/Tab8/2");
        tabd83=fd.getReference("Telepackage/daily/Tab8/3");
        tabd84=fd.getReference("Telepackage/daily/Tab8/4");
        tabd85=fd.getReference("Telepackage/daily/Tab8/5");

        tabd90=fd.getReference("Telepackage/daily/Tab9/0");
        tabd91=fd.getReference("Telepackage/daily/Tab9/1");
        tabd92=fd.getReference("Telepackage/daily/Tab9/2");
        tabd93=fd.getReference("Telepackage/daily/Tab9/3");
        tabd94=fd.getReference("Telepackage/daily/Tab9/4");
        tabd95=fd.getReference("Telepackage/daily/Tab9/5");

        tabd100=fd.getReference("Telepackage/daily/Tab10/0");
        tabd101=fd.getReference("Telepackage/daily/Tab10/1");
        tabd102=fd.getReference("Telepackage/daily/Tab10/2");
        tabd103=fd.getReference("Telepackage/daily/Tab10/3");
        tabd104=fd.getReference("Telepackage/daily/Tab10/4");
        tabd105=fd.getReference("Telepackage/daily/Tab10/5");

        tabd110=fd.getReference("Telepackage/daily/Tab11/0");
        tabd111=fd.getReference("Telepackage/daily/Tab11/1");
        tabd112=fd.getReference("Telepackage/daily/Tab11/2");
        tabd113=fd.getReference("Telepackage/daily/Tab11/3");
        tabd114=fd.getReference("Telepackage/daily/Tab11/4");

        tabd125=fd.getReference("Telepackage/daily/Tab12/5");
        tabd120=fd.getReference("Telepackage/daily/Tab12/0");
        tabd121=fd.getReference("Telepackage/daily/Tab12/1");
        tabd122=fd.getReference("Telepackage/daily/Tab12/2");
        tabd123=fd.getReference("Telepackage/daily/Tab12/3");
        tabd124=fd.getReference("Telepackage/daily/Tab12/4");
        tabd125=fd.getReference("Telepackage/daily/Tab12/5");




        tabw10=fd.getReference("Telepackage/weekly/Tab1/0");
        tabw11=fd.getReference("Telepackage/weekly/Tab1/1");
        tabw12=fd.getReference("Telepackage/weekly/Tab1/2");
        tabw13=fd.getReference("Telepackage/weekly/Tab1/3");
        tabw14=fd.getReference("Telepackage/weekly/Tab1/4");
        tabw15=fd.getReference("Telepackage/weekly/Tab1/5");

        tabw20=fd.getReference("Telepackage/weekly/Tab2/0");
        tabw21=fd.getReference("Telepackage/weekly/Tab2/1");
        tabw22=fd.getReference("Telepackage/weekly/Tab2/2");
        tabw23=fd.getReference("Telepackage/weekly/Tab2/3");
        tabw24=fd.getReference("Telepackage/weekly/Tab2/4");
        tabw25=fd.getReference("Telepackage/weekly/Tab2/5");

        tabw30=fd.getReference("Telepackage/weekly/Tab3/0");
        tabw31=fd.getReference("Telepackage/weekly/Tab3/1");
        tabw32=fd.getReference("Telepackage/weekly/Tab3/2");
        tabw33=fd.getReference("Telepackage/weekly/Tab3/3");
        tabw34=fd.getReference("Telepackage/weekly/Tab3/4");
        tabw35=fd.getReference("Telepackage/weekly/Tab3/5");

        tabw40=fd.getReference("Telepackage/weekly/Tab4/0");
        tabw41=fd.getReference("Telepackage/weekly/Tab4/1");
        tabw42=fd.getReference("Telepackage/weekly/Tab4/2");
        tabw43=fd.getReference("Telepackage/weekly/Tab4/3");
        tabw44=fd.getReference("Telepackage/weekly/Tab4/4");
        tabw45=fd.getReference("Telepackage/weekly/Tab4/5");

        tabw50=fd.getReference("Telepackage/weekly/Tab5/0");
        tabw51=fd.getReference("Telepackage/weekly/Tab5/1");
        tabw52=fd.getReference("Telepackage/weekly/Tab5/2");
        tabw53=fd.getReference("Telepackage/weekly/Tab5/3");
        tabw54=fd.getReference("Telepackage/weekly/Tab5/4");
        tabw55=fd.getReference("Telepackage/weekly/Tab5/5");

        tabw60=fd.getReference("Telepackage/weekly/Tab6/0");
        tabw61=fd.getReference("Telepackage/weekly/Tab6/1");
        tabw62=fd.getReference("Telepackage/weekly/Tab6/2");
        tabw63=fd.getReference("Telepackage/weekly/Tab6/3");
        tabw64=fd.getReference("Telepackage/weekly/Tab6/4");
        tabw65=fd.getReference("Telepackage/weekly/Tab6/5");

        tabw70=fd.getReference("Telepackage/weekly/Tab7/0");
        tabw71=fd.getReference("Telepackage/weekly/Tab7/1");
        tabw72=fd.getReference("Telepackage/weekly/Tab7/2");
        tabw73=fd.getReference("Telepackage/weekly/Tab7/3");
        tabw74=fd.getReference("Telepackage/weekly/Tab7/4");
        tabw75=fd.getReference("Telepackage/weekly/Tab7/5");

        tabw80=fd.getReference("Telepackage/weekly/Tab8/0");
        tabw81=fd.getReference("Telepackage/weekly/Tab8/1");
        tabw82=fd.getReference("Telepackage/weekly/Tab8/2");
        tabw83=fd.getReference("Telepackage/weekly/Tab8/3");
        tabw84=fd.getReference("Telepackage/weekly/Tab8/4");
        tabw85=fd.getReference("Telepackage/weekly/Tab8/5");

        tabw90=fd.getReference("Telepackage/weekly/Tab9/0");
        tabw91=fd.getReference("Telepackage/weekly/Tab9/1");
        tabw92=fd.getReference("Telepackage/weekly/Tab9/2");
        tabw93=fd.getReference("Telepackage/weekly/Tab9/3");
        tabw94=fd.getReference("Telepackage/weekly/Tab9/4");
        tabw95=fd.getReference("Telepackage/weekly/Tab9/5");

        tabw100=fd.getReference("Telepackage/weekly/Tab10/0");
        tabw101=fd.getReference("Telepackage/weekly/Tab10/1");
        tabw102=fd.getReference("Telepackage/weekly/Tab10/2");
        tabw103=fd.getReference("Telepackage/weekly/Tab10/3");
        tabw104=fd.getReference("Telepackage/weekly/Tab10/4");
        tabw105=fd.getReference("Telepackage/weekly/Tab10/5");

        tabw110=fd.getReference("Telepackage/weekly/Tab11/0");
        tabw111=fd.getReference("Telepackage/weekly/Tab11/1");
        tabw112=fd.getReference("Telepackage/weekly/Tab11/2");
        tabw113=fd.getReference("Telepackage/weekly/Tab11/3");
        tabd114=fd.getReference("Telepackage/weekly/Tab11/4");

        tabw125=fd.getReference("Telepackage/weekly/Tab12/5");
        tabw120=fd.getReference("Telepackage/weekly/Tab12/0");
        tabw121=fd.getReference("Telepackage/weekly/Tab12/1");
        tabw122=fd.getReference("Telepackage/weekly/Tab12/2");
        tabw123=fd.getReference("Telepackage/weekly/Tab12/3");
        tabw124=fd.getReference("Telepackage/weekly/Tab12/4");
        tabw125=fd.getReference("Telepackage/weekly/Tab12/5");


        foryouw10=fd.getReference("Telepackage/weekly/foryou1/0");
        foryouw11=fd.getReference("Telepackage/weekly/foryou1/1");
        foryouw12=fd.getReference("Telepackage/weekly/foryou1/2");
        foryouw13=fd.getReference("Telepackage/weekly/foryou1/3");
        foryouw14=fd.getReference("Telepackage/weekly/foryou1/4");
        foryouw15=fd.getReference("Telepackage/weekly/foryou1/5");

        foryouw20=fd.getReference("Telepackage/weekly/foryou2/0");
        foryouw21=fd.getReference("Telepackage/weekly/foryou2/1");
        foryouw22=fd.getReference("Telepackage/weekly/foryou2/2");
        foryouw23=fd.getReference("Telepackage/weekly/foryou2/3");
        foryouw24=fd.getReference("Telepackage/weekly/foryou2/4");
        foryouw25=fd.getReference("Telepackage/weekly/foryou2/5");

        foryouw30=fd.getReference("Telepackage/weekly/foryou3/0");
        foryouw31=fd.getReference("Telepackage/weekly/foryou3/1");
        foryouw32=fd.getReference("Telepackage/weekly/foryou3/2");
        foryouw33=fd.getReference("Telepackage/weekly/foryou3/3");
        foryouw34=fd.getReference("Telepackage/weekly/foryou3/4");
        foryouw35=fd.getReference("Telepackage/weekly/foryou3/5");

        foryouw40=fd.getReference("Telepackage/weekly/foryou4/0");
        foryouw41=fd.getReference("Telepackage/weekly/foryou4/1");
        foryouw42=fd.getReference("Telepackage/weekly/foryou4/2");
        foryouw43=fd.getReference("Telepackage/weekly/foryou4/3");
        foryouw44=fd.getReference("Telepackage/weekly/foryou4/4");
        foryouw45=fd.getReference("Telepackage/weekly/foryou4/5");

        foryouw50=fd.getReference("Telepackage/weekly/foryou5/0");
        foryouw51=fd.getReference("Telepackage/weekly/foryou5/1");
        foryouw52=fd.getReference("Telepackage/weekly/foryou5/2");
        foryouw53=fd.getReference("Telepackage/weekly/foryou5/3");
        foryouw54=fd.getReference("Telepackage/weekly/foryou5/4");
        foryouw55=fd.getReference("Telepackage/weekly/foryou5/5");

        foryouw60=fd.getReference("Telepackage/weekly/foryou6/0");
        foryouw61=fd.getReference("Telepackage/weekly/foryou6/1");
        foryouw62=fd.getReference("Telepackage/weekly/foryou6/2");
        foryouw63=fd.getReference("Telepackage/weekly/foryou6/3");
        foryouw64=fd.getReference("Telepackage/weekly/foryou6/4");
        foryouw65=fd.getReference("Telepackage/weekly/foryou6/5");

        foryouw70=fd.getReference("Telepackage/weekly/foryou7/0");
        foryouw71=fd.getReference("Telepackage/weekly/foryou7/1");
        foryouw72=fd.getReference("Telepackage/weekly/foryou7/2");
        foryouw73=fd.getReference("Telepackage/weekly/foryou7/3");
        foryouw74=fd.getReference("Telepackage/weekly/foryou7/4");
        foryouw75=fd.getReference("Telepackage/weekly/foryou7/5");

        foryouw80=fd.getReference("Telepackage/weekly/foryou8/0");
        foryouw81=fd.getReference("Telepackage/weekly/foryou8/1");
        foryouw82=fd.getReference("Telepackage/weekly/foryou8/2");
        foryouw83=fd.getReference("Telepackage/weekly/foryou8/3");
        foryouw84=fd.getReference("Telepackage/weekly/foryou8/4");
        foryouw85=fd.getReference("Telepackage/weekly/foryou8/5");

        foryouw90=fd.getReference("Telepackage/weekly/foryou9/0");
        foryouw91=fd.getReference("Telepackage/weekly/foryou9/1");
        foryouw92=fd.getReference("Telepackage/weekly/foryou9/2");
        foryouw93=fd.getReference("Telepackage/weekly/foryou9/3");
        foryouw94=fd.getReference("Telepackage/weekly/foryou9/4");
        foryouw95=fd.getReference("Telepackage/weekly/foryou9/5");

        foryouw100=fd.getReference("Telepackage/weekly/foryou10/0");
        foryouw101=fd.getReference("Telepackage/weekly/foryou10/1");
        foryouw102=fd.getReference("Telepackage/weekly/foryou10/2");
        foryouw103=fd.getReference("Telepackage/weekly/foryou10/3");
        foryouw104=fd.getReference("Telepackage/weekly/foryou10/4");
        foryouw105=fd.getReference("Telepackage/weekly/foryou10/5");

        foryouw110=fd.getReference("Telepackage/weekly/foryou11/0");
        foryouw111=fd.getReference("Telepackage/weekly/foryou11/1");
        foryouw112=fd.getReference("Telepackage/weekly/foryou11/2");
        foryouw113=fd.getReference("Telepackage/weekly/foryou11/3");
        foryouw114=fd.getReference("Telepackage/weekly/foryou11/4");
        foryouw115=fd.getReference("Telepackage/weekly/foryou11/5");

        foryouw120=fd.getReference("Telepackage/weekly/foryou12/0");
        foryouw121=fd.getReference("Telepackage/weekly/foryou12/1");
        foryouw122=fd.getReference("Telepackage/weekly/foryou12/2");
        foryouw123=fd.getReference("Telepackage/weekly/foryou12/3");
        foryouw124=fd.getReference("Telepackage/weekly/foryou12/4");
        foryouw125=fd.getReference("Telepackage/weekly/foryou12/5");

        giftw10=fd.getReference("Telepackage/weekly/gift1/0");
        giftw11=fd.getReference("Telepackage/weekly/gift1/1");
        giftw12=fd.getReference("Telepackage/weekly/gift1/2");
        giftw13=fd.getReference("Telepackage/weekly/gift1/3");
        giftw14=fd.getReference("Telepackage/weekly/gift1/4");
        giftw15=fd.getReference("Telepackage/weekly/gift1/5");

        giftw10=fd.getReference("Telepackage/weekly/gift2/0");
        giftw21=fd.getReference("Telepackage/weekly/gift2/1");
        giftw22=fd.getReference("Telepackage/weekly/gift2/2");
        giftw23=fd.getReference("Telepackage/weekly/gift2/3");
        giftw24=fd.getReference("Telepackage/weekly/gift2/4");
        giftw25=fd.getReference("Telepackage/weekly/gift2/5");

        giftw30=fd.getReference("Telepackage/weekly/gift3/0");
        giftw31=fd.getReference("Telepackage/weekly/gift3/1");
        giftw32=fd.getReference("Telepackage/weekly/gift3/2");
        giftw33=fd.getReference("Telepackage/weekly/gift3/3");
        giftw34=fd.getReference("Telepackage/weekly/gift3/4");
        giftw35=fd.getReference("Telepackage/weekly/gift3/5");

        giftw40=fd.getReference("Telepackage/weekly/gift4/0");
        giftw41=fd.getReference("Telepackage/weekly/gift4/1");
        giftw42=fd.getReference("Telepackage/weekly/gift4/2");
        giftw43=fd.getReference("Telepackage/weekly/gift4/3");
        giftw44=fd.getReference("Telepackage/weekly/gift4/4");
        giftw45=fd.getReference("Telepackage/weekly/gift4/5");

        giftw50=fd.getReference("Telepackage/weekly/gift5/0");
        giftw51=fd.getReference("Telepackage/weekly/gift5/1");
        giftw52=fd.getReference("Telepackage/weekly/gift5/2");
        giftw53=fd.getReference("Telepackage/weekly/gift5/3");
        giftw54=fd.getReference("Telepackage/weekly/gift5/4");
        giftw55=fd.getReference("Telepackage/weekly/gift5/5");

        giftw60=fd.getReference("Telepackage/weekly/gift6/0");
        giftw61=fd.getReference("Telepackage/weekly/gift6/1");
        giftw62=fd.getReference("Telepackage/weekly/gift6/2");
        giftw63=fd.getReference("Telepackage/weekly/gift6/3");
        giftw64=fd.getReference("Telepackage/weekly/gift6/4");
        giftw65=fd.getReference("Telepackage/weekly/gift6/5");

        giftw70=fd.getReference("Telepackage/weekly/gift7/0");
        giftw71=fd.getReference("Telepackage/weekly/gift7/1");
        giftw72=fd.getReference("Telepackage/weekly/gift7/2");
        giftw73=fd.getReference("Telepackage/weekly/gift7/3");
        giftw74=fd.getReference("Telepackage/weekly/gift7/4");
        giftw75=fd.getReference("Telepackage/weekly/gift7/5");

        giftw80=fd.getReference("Telepackage/weekly/gift8/0");
        giftw81=fd.getReference("Telepackage/weekly/gift8/1");
        giftw82=fd.getReference("Telepackage/weekly/gift8/2");
        giftw83=fd.getReference("Telepackage/weekly/gift8/3");
        giftw84=fd.getReference("Telepackage/weekly/gift8/4");
        giftw85=fd.getReference("Telepackage/weekly/gift8/5");

        giftw90=fd.getReference("Telepackage/weekly/gift9/0");
        giftw91=fd.getReference("Telepackage/weekly/gift9/1");
        giftw92=fd.getReference("Telepackage/weekly/gift9/2");
        giftw93=fd.getReference("Telepackage/weekly/gift9/3");
        giftw94=fd.getReference("Telepackage/weekly/gift9/4");
        giftw95=fd.getReference("Telepackage/weekly/gift9/5");

        giftw100=fd.getReference("Telepackage/weekly/gift10/0");
        giftw101=fd.getReference("Telepackage/weekly/gift10/1");
        giftw102=fd.getReference("Telepackage/weekly/gift10/2");
        giftw103=fd.getReference("Telepackage/weekly/gift10/3");
        giftw104=fd.getReference("Telepackage/weekly/gift10/4");
        giftw105=fd.getReference("Telepackage/weekly/gift10/5");

        giftw110=fd.getReference("Telepackage/weekly/gift11/0");
        giftw111=fd.getReference("Telepackage/weekly/gift11/1");
        giftw112=fd.getReference("Telepackage/weekly/gift11/2");
        giftw113=fd.getReference("Telepackage/weekly/gift11/3");
        giftw114=fd.getReference("Telepackage/weekly/gift11/4");
        giftw115=fd.getReference("Telepackage/weekly/gift11/5");

        giftw120=fd.getReference("Telepackage/weekly/gift12/0");
        giftw121=fd.getReference("Telepackage/weekly/gift12/1");
        giftw122=fd.getReference("Telepackage/weekly/gift12/2");
        giftw123=fd.getReference("Telepackage/weekly/gift12/3");
        giftw124=fd.getReference("Telepackage/weekly/gift12/4");
        giftw125=fd.getReference("Telepackage/weekly/gift12/5");




        tabm10=fd.getReference("Telepackage/monthly/Tab1/0");
        tabm11=fd.getReference("Telepackage/monthly/Tab1/1");
        tabm12=fd.getReference("Telepackage/monthly/Tab1/2");
        tabm13=fd.getReference("Telepackage/monthly/Tab1/3");
        tabm14=fd.getReference("Telepackage/monthly/Tab1/4");
        tabm15=fd.getReference("Telepackage/monthly/Tab1/5");

        tabm20=fd.getReference("Telepackage/monthly/Tab2/0");
        tabm21=fd.getReference("Telepackage/monthly/Tab2/1");
        tabm22=fd.getReference("Telepackage/monthly/Tab2/2");
        tabm23=fd.getReference("Telepackage/monthly/Tab2/3");
        tabm24=fd.getReference("Telepackage/monthly/Tab2/4");
        tabm25=fd.getReference("Telepackage/monthly/Tab2/5");

        tabm30=fd.getReference("Telepackage/monthly/Tab3/0");
        tabm31=fd.getReference("Telepackage/monthly/Tab3/1");
        tabm32=fd.getReference("Telepackage/monthly/Tab3/2");
        tabm33=fd.getReference("Telepackage/monthly/Tab3/3");
        tabm34=fd.getReference("Telepackage/monthly/Tab3/4");
        tabm35=fd.getReference("Telepackage/monthly/Tab3/5");

        tabm40=fd.getReference("Telepackage/monthly/Tab4/0");
        tabm41=fd.getReference("Telepackage/monthly/Tab4/1");
        tabm42=fd.getReference("Telepackage/monthly/Tab4/2");
        tabm43=fd.getReference("Telepackage/monthly/Tab4/3");
        tabm44=fd.getReference("Telepackage/monthly/Tab4/4");
        tabm45=fd.getReference("Telepackage/monthly/Tab4/5");

        tabm50=fd.getReference("Telepackage/monthly/Tab5/0");
        tabm51=fd.getReference("Telepackage/monthly/Tab5/1");
        tabm52=fd.getReference("Telepackage/monthly/Tab5/2");
        tabm53=fd.getReference("Telepackage/monthly/Tab5/3");
        tabm54=fd.getReference("Telepackage/monthly/Tab5/4");
        tabm55=fd.getReference("Telepackage/monthly/Tab5/5");

        tabm60=fd.getReference("Telepackage/monthly/Tab6/0");
        tabm61=fd.getReference("Telepackage/monthly/Tab6/1");
        tabm62=fd.getReference("Telepackage/monthly/Tab6/2");
        tabm63=fd.getReference("Telepackage/monthly/Tab6/3");
        tabm64=fd.getReference("Telepackage/monthly/Tab6/4");
        tabm65=fd.getReference("Telepackage/monthly/Tab6/5");

        tabm70=fd.getReference("Telepackage/monthly/Tab7/0");
        tabm71=fd.getReference("Telepackage/monthly/Tab7/1");
        tabm72=fd.getReference("Telepackage/monthly/Tab7/2");
        tabm73=fd.getReference("Telepackage/monthly/Tab7/3");
        tabm74=fd.getReference("Telepackage/monthly/Tab7/4");
        tabm75=fd.getReference("Telepackage/monthly/Tab7/5");

        tabm80=fd.getReference("Telepackage/monthly/Tab8/0");
        tabm81=fd.getReference("Telepackage/monthly/Tab8/1");
        tabm82=fd.getReference("Telepackage/monthly/Tab8/2");
        tabm83=fd.getReference("Telepackage/monthly/Tab8/3");
        tabm84=fd.getReference("Telepackage/monthly/Tab8/4");
        tabm85=fd.getReference("Telepackage/monthly/Tab8/5");

        tabm90=fd.getReference("Telepackage/monthly/Tab9/0");
        tabm91=fd.getReference("Telepackage/monthly/Tab9/1");
        tabm92=fd.getReference("Telepackage/monthly/Tab9/2");
        tabm93=fd.getReference("Telepackage/monthly/Tab9/3");
        tabm94=fd.getReference("Telepackage/monthly/Tab9/4");
        tabm95=fd.getReference("Telepackage/monthly/Tab9/5");

        tabm100=fd.getReference("Telepackage/monthly/Tab10/0");
        tabm101=fd.getReference("Telepackage/monthly/Tab10/1");
        tabm102=fd.getReference("Telepackage/monthly/Tab10/2");
        tabm103=fd.getReference("Telepackage/monthly/Tab10/3");
        tabm104=fd.getReference("Telepackage/monthly/Tab10/4");
        tabm105=fd.getReference("Telepackage/monthly/Tab10/5");

        tabm110=fd.getReference("Telepackage/monthly/Tab11/0");
        tabm111=fd.getReference("Telepackage/monthly/Tab11/1");
        tabm112=fd.getReference("Telepackage/monthly/Tab11/2");
        tabm113=fd.getReference("Telepackage/monthly/Tab11/3");
        tabm114=fd.getReference("Telepackage/monthly/Tab11/4");

        tabm125=fd.getReference("Telepackage/monthly/Tab12/5");
        tabm120=fd.getReference("Telepackage/monthly/Tab12/0");
        tabm121=fd.getReference("Telepackage/monthly/Tab12/1");
        tabm122=fd.getReference("Telepackage/monthly/Tab12/2");
        tabm123=fd.getReference("Telepackage/monthly/Tab12/3");
        tabm124=fd.getReference("Telepackage/monthly/Tab12/4");
        tabm125=fd.getReference("Telepackage/monthly/Tab12/5");




        tabn10=fd.getReference("Telepackage/night/Tab1/0");
        tabn11=fd.getReference("Telepackage/night/Tab1/1");
        tabn12=fd.getReference("Telepackage/night/Tab1/2");
        tabn13=fd.getReference("Telepackage/night/Tab1/3");
        tabn14=fd.getReference("Telepackage/night/Tab1/4");
        tabn15=fd.getReference("Telepackage/night/Tab1/5");

        tabn20=fd.getReference("Telepackage/night/Tab2/0");
        tabn21=fd.getReference("Telepackage/night/Tab2/1");
        tabn22=fd.getReference("Telepackage/night/Tab2/2");
        tabn23=fd.getReference("Telepackage/night/Tab2/3");
        tabn24=fd.getReference("Telepackage/night/Tab2/4");
        tabn25=fd.getReference("Telepackage/night/Tab2/5");

        tabn30=fd.getReference("Telepackage/night/Tab3/0");
        tabn31=fd.getReference("Telepackage/night/Tab3/1");
        tabn32=fd.getReference("Telepackage/night/Tab3/2");
        tabn33=fd.getReference("Telepackage/night/Tab3/3");
        tabn34=fd.getReference("Telepackage/night/Tab3/4");
        tabn35=fd.getReference("Telepackage/night/Tab3/5");

        tabn40=fd.getReference("Telepackage/night/Tab4/0");
        tabn41=fd.getReference("Telepackage/night/Tab4/1");
        tabn42=fd.getReference("Telepackage/night/Tab4/2");
        tabn43=fd.getReference("Telepackage/night/Tab4/3");
        tabn44=fd.getReference("Telepackage/night/Tab4/4");
        tabn45=fd.getReference("Telepackage/night/Tab4/5");

        tabn50=fd.getReference("Telepackage/night/Tab5/0");
        tabn51=fd.getReference("Telepackage/night/Tab5/1");
        tabn52=fd.getReference("Telepackage/night/Tab5/2");
        tabn53=fd.getReference("Telepackage/night/Tab5/3");
        tabn54=fd.getReference("Telepackage/night/Tab5/4");
        tabn55=fd.getReference("Telepackage/night/Tab5/5");

        tabn60=fd.getReference("Telepackage/night/Tab6/0");
        tabn61=fd.getReference("Telepackage/night/Tab6/1");
        tabn62=fd.getReference("Telepackage/night/Tab6/2");
        tabn63=fd.getReference("Telepackage/night/Tab6/3");
        tabn64=fd.getReference("Telepackage/night/Tab6/4");
        tabn65=fd.getReference("Telepackage/night/Tab6/5");

        tabn70=fd.getReference("Telepackage/night/Tab7/0");
        tabn71=fd.getReference("Telepackage/night/Tab7/1");
        tabn72=fd.getReference("Telepackage/night/Tab7/2");
        tabn73=fd.getReference("Telepackage/night/Tab7/3");
        tabn74=fd.getReference("Telepackage/night/Tab7/4");
        tabn75=fd.getReference("Telepackage/night/Tab7/5");

        tabn80=fd.getReference("Telepackage/night/Tab8/0");
        tabn81=fd.getReference("Telepackage/night/Tab8/1");
        tabn82=fd.getReference("Telepackage/night/Tab8/2");
        tabn83=fd.getReference("Telepackage/night/Tab8/3");
        tabn84=fd.getReference("Telepackage/night/Tab8/4");
        tabn85=fd.getReference("Telepackage/night/Tab8/5");

        tabn90=fd.getReference("Telepackage/night/Tab9/0");
        tabn91=fd.getReference("Telepackage/night/Tab9/1");
        tabn92=fd.getReference("Telepackage/night/Tab9/2");
        tabn93=fd.getReference("Telepackage/night/Tab9/3");
        tabn94=fd.getReference("Telepackage/night/Tab9/4");
        tabn95=fd.getReference("Telepackage/night/Tab9/5");

        tabn100=fd.getReference("Telepackage/night/Tab10/0");
        tabn101=fd.getReference("Telepackage/night/Tab10/1");
        tabn102=fd.getReference("Telepackage/night/Tab10/2");
        tabn103=fd.getReference("Telepackage/night/Tab10/3");
        tabn104=fd.getReference("Telepackage/night/Tab10/4");
        tabn105=fd.getReference("Telepackage/night/Tab10/5");

        tabn110=fd.getReference("Telepackage/night/Tab11/0");
        tabn111=fd.getReference("Telepackage/night/Tab11/1");
        tabn112=fd.getReference("Telepackage/night/Tab11/2");
        tabn113=fd.getReference("Telepackage/night/Tab11/3");
        tabn114=fd.getReference("Telepackage/night/Tab11/4");

        tabn125=fd.getReference("Telepackage/night/Tab12/5");
        tabn120=fd.getReference("Telepackage/night/Tab12/0");
        tabn121=fd.getReference("Telepackage/night/Tab12/1");
        tabn122=fd.getReference("Telepackage/night/Tab12/2");
        tabn123=fd.getReference("Telepackage/night/Tab12/3");
        tabn124=fd.getReference("Telepackage/night/Tab12/4");
        tabn125=fd.getReference("Telepackage/night/Tab12/5");

    }

    public void check(){
        if(total==720){
           //databaseassign();
            total=0;
        }
    }
}
