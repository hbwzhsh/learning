package com.cxy.redisclient.integration;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.cxy.redisclient.presentation.RedisClient;

public class I18nFile extends PropertyFile {
	private static InputStream propertyFile;
	private static Properties properties;
	
	public static final String SERVER = "SERVER";
	public static final String ADD = "ADD";
	public static final String UPDATE = "UPDATE";
	public static final String REMOVE = "REMOVE";
	public static final String PROPERTIES = "PROPERTIES";
	public static final String EXIT = "EXIT";
	public static final String DATA = "DATA";
	public static final String NEW = "NEW";
	public static final String STRING = "STRING";
	public static final String LIST = "LIST";
	public static final String SET = "SET";
	public static final String ZSET = "ZSET";
	public static final String HASH = "HASH";
	public static final String RENAME = "RENAME";
	public static final String DELETE = "DELETE";
	public static final String CUT = "CUT";
	public static final String COPY = "COPY";
	public static final String PASTE = "PASTE";
	public static final String IMPORT = "IMPORT";
	public static final String EXPORT = "EXPORT";
	public static final String FIND = "FIND";
	public static final String FINDFORWARD = "FINDFORWARD";
	public static final String FINDBACKWARD = "FINDBACKWARD";
	public static final String VIEW = "VIEW";
	public static final String HIERARCHY = "HIERARCHY";
	public static final String FLAT = "FLAT";
	public static final String REFRESH = "REFRESH";
	public static final String FAVORITES = "FAVORITES";
	public static final String ORGANIZE = "ORGANIZE";
	public static final String HELP = "HELP";
	public static final String DONATION = "DONATION";
	public static final String ABOUT = "ABOUT";
	
	public static final String REDISSERVERS = "REDISSERVERS";
	public static final String ADDFAVORITES = "ADDFAVORITES";
	public static final String ADDSERVER = "ADDSERVER";
	public static final String NAME = "NAME";
	public static final String TYPE = "TYPE";
	public static final String SIZE = "SIZE";
	public static final String ERROR = "ERROR";
	public static final String INFORMATION = "INFORMATION";
	public static final String OBJECTDELETE = "OBJECTDELETE";
	public static final String NEWKEYFOUND = "NEWKEYFOUND";
	public static final String LOCATION = "LOCATION";
	public static final String KEY = "KEY";
	public static final String FINDAGAIN = "FINDAGAIN";
	public static final String FINDRESULTS = "FINDRESULT";
	public static final String NOFOUND = "NOFOUND";
	public static final String EXPORTREDIS = "EXPORTREDIS";
	public static final String FILEEXIST = "FILEEXIST";
	public static final String FILEREPLACE = "FILEREPLACE";
	public static final String IMPORTREDIS = "IMPORTREDIS";
	public static final String REMOVESERVER = "REMOVESERVER";
	public static final String CONFIRMREMOVESERVER = "CONFIRMREMOVESERVER";
	public static final String RENAMEFAIL = "RENAMEFAIL";
	public static final String RENAMERESULT = "RENAMERESULT";
	public static final String FINDSERVER = "FINDSERVER";
	public static final String FINDDB = "FINDDB";
	public static final String DELETEKEY = "DELETEKEY";
	public static final String CONFIRMDELETEKEY = "CONFIRMDELETEKEY";
	public static final String RENAMEKEYFAIL = "RENAMEKEYFAIL";
	public static final String RENAMEKEYRESULT = "RENAMEKEYRESULT";
	public static final String DBPROPERTIES = "DBPROPERTIES";
	public static final String CONTAINERPROPERTIES = "CONTAINERPROPERTIES";
	public static final String DATABASE = "DATABASE";
	public static final String CONTAINER = "CONTAINER";
	public static final String ABOUTREDISCLIENT = "ABOUTREDISCLIENT";
	public static final String VERSION = "VERSION";
	public static final String DEVELOPER = "DEVELOPER";
	public static final String ISSUE = "ISSUE";
	public static final String CLICK = "CLICK";
	public static final String CAOXINYU = "CAOXINYU";
	public static final String OK = "OK";
	public static final String DONATIONMESSAGE = "DONATIONMESSAGE";
	public static final String ADDFAVORITE = "ADDFAVORITE";
	public static final String FAVORITE = "FAVORITE";
	public static final String CANCEL = "CANCEL";
	public static final String INPUTFAVORITE = "INPUTFAVORITE";
	public static final String ORGANIZEFAVORITE = "ORGANIZEFAVORITE";
	public static final String UPDATEFAVORITE = "UPDATEFAVORITE";
	public static final String NEWHASH = "NEWHASH";
	public static final String VALUES = "VALUES";
	public static final String FIELD = "FIELD";
	public static final String VALUE = "VALUE";
	public static final String INPUTVALUES = "INPUTVALUES";
	public static final String HASHINPUTFORMAT = "HASHINPUTFORMAT";
	public static final String INPUTHASH = "INPUTHASH";
	public static final String KEYENDERROR = "KEYENDERROR";
	public static final String INPUTWHOLE = "INPUTWHOLE";
	public static final String HASHPROPERTY = "HASHPROPERTY";
	public static final String DELETECONTAINERS = "DELETECONTAINERS";
	public static final String DELETECONTAINER = "DELETECONTAINER";
	public static final String DELETEKEYS = "DELETEKEYS";
	public static final String DELETESUBCONTAINER = "DELETESUBCONTAINER";
	public static final String FINDDATA = "FINDDATA";
	public static final String FINDDIRECTION = "FINDDIRECTION";
	public static final String FORWARD = "FORWARD";
	public static final String BACKWARD = "BACKWARD";
	public static final String KEYTYPE = "KEYTYPE";
	public static final String SELECTTYPE = "SELECTTYPE";
	public static final String NEWKEY = "NEWKEY";
	public static final String OVERWRITTEN = "OVERWRITTEN";
	public static final String RENAMESUB = "RENAMESUB";
	public static final String INPUTNEWKEY = "INPUTNEWKEY";
	public static final String NEWLIST = "NEWLIST";
	public static final String LISTINPUTFORMAT = "LISTINPUTFORMAT";
	public static final String UP = "UP";
	public static final String DOWN = "DOWN";
	public static final String LISTORDER = "LISTORDER";
	public static final String HEADTAIL = "HEADTAIL";
	public static final String TAILHEAD = "TAILHEAD";
	public static final String LISTNOTEXIST = "LISTNOTEXIST";
	public static final String CREATELIST = "CREATELIST";
	public static final String DONOTHING = "DONOTHING";
	public static final String INPUTLIST = "INPUTLIST";
	public static final String LISTPROPERTY = "LISTPROPERTY";
	public static final String HOST = "HOST";
	public static final String PORT = "PORT";
	public static final String PASSWORD = "PASSWORD";
	public static final String INPUTSERVER = "INPUTSERVER";
	public static final String SERVERPROPERTY = "SERVERPROPERTY";
	public static final String GENERAL = "GENERAL";
	public static final String UPDATESERVER = "UPDATESERVER";
	public static final String NEWSET = "NEWSET";
	public static final String INPUTSET = "INPUTSET";
	public static final String SETPROPERTY = "SETPROPERTY";
	public static final String NEWSTRING = "NEWSTRING";
	public static final String INPUTSTRING = "INPUTSTRING";
	public static final String STRINGPROPERTY = "STRINGPROPERTY";
	public static final String NEWZSET = "NEWZSET";
	public static final String SCORE = "SCORE";
	public static final String MEMBER = "MEMBER";
	public static final String INPUTZSETFORMAT = "INPUTZSETFORMAT";
	public static final String ZSETPROPERTY = "ZSETPROPERTY";
	public static final String INPUTZSET = "INPUTZSET";
	public static final String HASHEXIST = "HASHEXIST";
	public static final String LISTEXIST = "LISTEXIST";
	public static final String SETEXIST = "SETEXIST";
	public static final String ZSETEXIST = "ZSETEXIST";
	public static final String KEYNOTEXIST = "KEYNOTEXIST";
	public static final String STAR = "STAR";
	public static final String TTL = "TTL";
	public static final String EXPIRE = "EXPIRE";
	public static final String TTLS = "TTLS";
	public static final String TTLEXCEPTION = "TTLEXCEPTION";
	public static final String APPLY = "APPLY";
	public static final String APPLYTTL = "APPLYTTL";
	public static final String APPLYTTLEXCEPTION = "APPLYTTLEXCEPTION";
	public static final String SCOREERROR = "SCOREERROR";
	public static final String REDISDATAEXPLORER = "REDISDATAEXPLORER";
	public static final String ORDER = "ORDER";
	public static final String ORDERBY = "ORDERBY";
	public static final String ASCEND = "ASCEND";
	public static final String DESCEND = "DESCEND";
	public static final String LANGUAGE = "LANGUAGE";
	public static final String INPUTKEY = "INPUTKEY";
	public static final String UPDATEFIELD = "UPDATEFIELD";
	public static final String DELETEHASH = "DELETEHASH";
	public static final String INSERTHEAD = "INSERTHEAD";
	public static final String APPENDTAIL = "APPENDTAIL";
	public static final String DELETEHEAD = "DELETEHEAD";
	public static final String DELETETAIL = "DELETETAIL";
	public static final String EDITING = "EDITING";
	public static final String EDITINGERROR = "EDITINGERROR";
	public static final String ADDSETVALUES = "ADDSETVALUES";
	public static final String CLOSEAPP = "CLOSEAPP";
	public static final String CLOSEAPPERROR = "CLOSEAPPERROR";
	public static final String TOOL = "TOOL";
	public static final String CONSOLE = "CONSOLE";
	public static final String COMMAND = "COMMAND";
	public static final String TIME = "TIME";
	public static final String DURATION = "DURATION";
	public static final String RESULT = "RESULT";
	public static final String CONSOLECLOSED = "CONSOLECLOSED";
	public static final String QUITCONSOLE = "QUITCONSOLE";
	public static final String RUNCURRENT = "RUNCURRENT";
	public static final String RUNSELECT = "RUNSELECT";
	public static final String RUNFOLLOW = "RUNFOLLOW";
	public static final String RUNCURRENTTIP = "RUNCURRENTTIP";
	public static final String RUNSELECTTIP = "RUNSELECTTIP";
	public static final String RUNFOLLOWTIP = "RUNFOLLOWTIP";
	public static final String SELECTALL = "SELECTALL";
	public static final String CLEAR = "CLEAR";
	public static final String VERSIONNOTSUPPORT = "VERSIONNOTSUPPORT";
	public static final String PUBLISH = "PUBLISH";
	public static final String SUBSCRIBE = "SUBSCRIBE";
	public static final String CHANNEL = "CHANNEL";
	public static final String MESSAGE = "MESSAGE";
	public static final String OPTIONS = "OPTIONS";
	public static final String CONNECTION = "CONNECTION";
	public static final String NAMESPACE = "NAMESPACE";
	public static final String PAGING = "PAGING";
	public static final String COMMANDTIMEOUT = "COMMANDTIMEOUT";
	public static final String CONSOLETIMEOUT = "CONSOLETIMEOUT";
	public static final String SEPARATOR = "SEPARATOR";
	public static final String PAGESIZE = "PAGESIZE";
	public static final String TIMEEXCEPTION = "TIMEEXCEPTION";
	public static final String SIZEEXCEPTION = "SIZEEXCEPTION";
	public static final String CMDEXCEPTION = "CMDEXCEPTION";
	public static final String WATCH = "WATCH";
	public static final String DATAWATCHER = "DATAWATCHER";
	public static final String DATATYPE = "DATATYPE";
	public static final String TEXT = "TEXT";
	public static final String PLAINTEXT = "PLAINTEXT";
	public static final String IMAGE = "IMAGE";
	public static final String BASE64IMAGE = "BASE64IMAGE";
	public static final String JSON = "JSON";
	public static final String XML = "XML";
	public static final String IMAGEEXCEPTION = "IMAGEEXCEPTION";
	public static final String JSONEXCEPTION = "JSONEXCEPTION";
	public static final String XMLEXCEPTION = "XMLEXCEPTION";
		
	
	public I18nFile(){
		propertyFile = getClass().getResourceAsStream("/i18n.properties");
		try {
			properties = getProperty(propertyFile);
		} catch (IOException e) {
			throw new RuntimeException(e.getLocalizedMessage());
		}
	}
	public String getText(String key) {
		return properties.getProperty(key + "." + RedisClient.language);
	}
}
