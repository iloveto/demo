package UDP2;

/**
 * 发现模式
 *
 * A发送消息，搜索局域网里面的设备bcd，bcd回应a
 */
public class MessageCreator {
    private static final String SN_HEADER = "SN:";
    private static final String SEARCH_HEADER = "PORT";

    //创建搜索时发送的报文
    public static String createSearchInfo(int port) {
        return SEARCH_HEADER + port;
    }

    public static int parsePort(String data) {
        if (data.startsWith(SEARCH_HEADER)) {
            return Integer.parseInt(data.substring(SEARCH_HEADER.length()));
        }
        return -1;
    }

    public static String createResponseInfo(String sn) {
        return SN_HEADER+sn;
    }

    public static String parseSn(String data) {
        if (data.startsWith(SN_HEADER)) {
            return data.substring(SN_HEADER.length());
        }
        return "-1";
    }

//    private static class Provider extends
}
