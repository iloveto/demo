import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class HttpPostDemo {


    public static void main(String[] args) {
        String data =
                "<Data>\n" +
                        "<RequestNo>TK123127893456798765491</RequestNo>\n" +
                        "<PayType>3</PayType>\n" +
                        "<Amt>25.00</Amt>\n" +
                        "<TradeNo>YMP011494322477660</TradeNo>\n" +
                        "</Data>";
        List<NameValuePair> list = new ArrayList<NameValuePair>();
        NameValuePair valu1 = new BasicNameValuePair("data",data);
        NameValuePair valu2 = new BasicNameValuePair("developerId","30819");
        NameValuePair valu3 = new BasicNameValuePair("funcId","P2008");
        NameValuePair valu4 = new BasicNameValuePair("sign","d1NSBtajLOd3ovfG3gLAUBCG7Ksz89QJq0/yr+N6ZkROTbGBrRrp0inFyNCCNv3O3ty+DsHwEEnBOnQYaLjY8g==");
        list.add(valu1);
        list.add(valu2);
        list.add(valu3);
        list.add(valu4);
        Map<String, String> map = new HashMap<String, String>();
        map.put("data",data);
        map.put("developerId","30819");
        map.put("funcId","P2008");
//        CloseableHttpResponse response = httpPost("http://116.7.255.40:53501/gatewayOffline/pay/offline/execute",map);

        postWithParamsForString("http://116.7.255.40:53501/gatewayOffline/pay/offline/execute",list);
    }
    private static final Logger logger = LoggerFactory.getLogger(HttpPostDemo.class);
    /**
     * post方法
     * @param url
     * @param params
     * @return
     */
    public static CloseableHttpResponse httpPost(String url,
                                                 Map<String, String> params)
    {

        logger.info("开始下发接口 {}", url);
        String uri = url;
        HttpPost post = new HttpPost(uri);
        if(params != null && !params.isEmpty())
        {
            List<NameValuePair> list = new ArrayList<NameValuePair>();
            Iterator<Map.Entry<String, String>> iterator = params.entrySet().iterator();
            while (iterator.hasNext())
            {
                Map.Entry<String, String> elem = iterator.next();
                list.add(new BasicNameValuePair(elem.getKey(), elem.getValue()));
            }
            if (list.size() > 0)
            {
                try
                {
                    post.setEntity(new UrlEncodedFormEntity(list, "utf-8"));
                } catch (UnsupportedEncodingException e)
                {
                    logger.error("接口{}组合参数失败", url, e);
                }
            }
        }
        CloseableHttpClient httpClient = HttpClients.createDefault();

        try {
            CloseableHttpResponse httpResponse = httpClient.execute(post);

            return httpResponse;
        } catch (ClientProtocolException e)
        {
            logger.error("下发http接口失败", e);
        } catch (IOException e)
        {
            logger.error("下发http接口失败", e);
        }
        return null;
    }

    public static String postWithParamsForString(String url, List<NameValuePair> params){
        logger.info("开始下发接口 {}", url);
        HttpClient client = HttpClients.createDefault();
        HttpPost httpPost =   new HttpPost(url);
        String s = "";
        try {
            httpPost.setEntity(new UrlEncodedFormEntity(params,"UTF-8"));
            httpPost.setHeader("Content-type", "application/x-www-form-urlencoded");
            HttpResponse response = client.execute(httpPost);
            int statusCode = response.getStatusLine().getStatusCode();
            if(statusCode==200){
                HttpEntity entity = response.getEntity();
                s = EntityUtils.toString(entity);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }
}
