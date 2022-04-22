package UI.dbutil;

public class SQLQueryConstatnts {

    public static String CREATE_TESTMEAPP_TABLE = "create table testmeapp (id VARCHAR(50) NOT NULL,\n" +
            "\t\tpage_details VARCHAR(50),\n"+
            "\t\talert_msg VARCHAR(50))";

    public static String SELECT_QUERY_TESTMEAPP_ID= "select id from public.testmeapp";
    public static String SELECT_QUERY_TESTMEAPP_PAGE_INFO = "select page_details from public.testmeapp";
    public static String SELECT_QUERY_TESTMEAPP_MSG= "select alert_msg from public.testmeapp";
    public static String SELECT_QUERY_TESTMEAPP_ALL="select * from public.testmeapp";
    public static String INSERT_QUERY_TESTMEAPP = "INSERT INTO \"PUBLIC\".\"TESTMEAPP\"\n" +
            "(\"ID\", \"PAGE_DETAILS\", \"ALERT_MSG\")\n" +
            "VALUES(?,?,?)";
    public static String UPDATE_QUERY_TESTMEAPP = "UPDATE \"PUBLIC\".\"TESTMEAPP\" SET page_details='Home' where id= 10";
    public static String DROP_QUERY_TESTMEAPP = "DROP TABLE testmeapp";

    public static String CREATE_WEBPAGE_TABLE = "create TABLE webpage (id VARCHAR(50) NOT NULL,\n" +
            "\t\ttitle VARCHAR(50), \n" +
            "\t\tusername VARCHAR(50) NOT NULL,\n" +
            "\t\tpasswd VARCHAR(50),\n" +
            "\t\tcomment VARCHAR(50))";
    public static String SELECT_QRY_WEBPAGE_TABLE_CREATION = "select count(*) from information_schema.tables where table_name = 'WEBPAGE'";
    public static String SELECT_QRY_WEBPAGE_TITLE = "SELECT title FROM public.webpage";
    public static String SELECT_QRY_WEBPAGE_USERNAME = "SELECT username FROM public.webpage";
    public static String SELECT_QRY_WEBPAGE_ALL = "SELECT * FROM public.webpage where id = 10";
    public static String INSERT_QRY_WEBPAGE = "INSERT INTO \"PUBLIC\".\"WEBPAGE\"\n" +
            "( \"ID\", \"TITLE\", \"USERNAME\", \"PASSWD\", \"COMMENT\" )\n" +
            "VALUES (?,?,?,?,?)";
    public static String DELETE_QRY_WEBPAGE = "DELETE * FROM webpage";
    public static String DROP_QRY_WEBPAGE = "DROP TABLE webpage";
    public static String UPDATE_QRY_WEBPAGE = "UPDATE \"PUBLIC\".\"WEBPAGE\" SET title='Home' where id = 10";



}
