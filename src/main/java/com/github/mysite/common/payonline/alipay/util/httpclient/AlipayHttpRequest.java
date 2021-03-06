package com.github.mysite.common.payonline.alipay.util.httpclient;

import org.apache.commons.httpclient.NameValuePair;

/**
 * description:Http请求对象的封装
 *
 * @author : jy.chen
 * @version : 1.0
 * @since : 2015-11-30 11:00
 */
public class AliPayHttpRequest {


    /**
     * HTTP GET method
     */
    public static final String METHOD_GET = "GET";

    /**
     * HTTP POST method
     */
    public static final String METHOD_POST = "POST";

    /**
     * 待请求的url
     */
    private String url = null;

    /**
     * 默认的请求方式
     */
    private String method = METHOD_POST;

    private int timeout = 0;

    private int connectionTimeout = 0;

    /**
     * Post方式请求时组装好的参数值对
     */
    private NameValuePair[] parameters = null;

    /**
     * Get方式请求时对应的参数
     */
    private String queryString = null;

    /**
     * 默认的请求编码方式
     */
    private String charset = "GBK";

    /**
     * 请求发起方的ip地址
     */
    private String clientIp;

    /**
     * 请求返回的方式
     */
    private AliPayHttpResultType resultType = AliPayHttpResultType.BYTES;

    public AliPayHttpRequest(AliPayHttpResultType resultType) {
        super();
        this.resultType = resultType;
    }

    /**
     * @return Returns the clientIp.
     */
    public String getClientIp() {
        return clientIp;
    }

    /**
     * @param clientIp The clientIp to set.
     */
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public NameValuePair[] getParameters() {
        return parameters;
    }

    public void setParameters(NameValuePair[] parameters) {
        this.parameters = parameters;
    }

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    /**
     * @return Returns the charset.
     */
    public String getCharset() {
        return charset;
    }

    /**
     * @param charset The charset to set.
     */
    public void setCharset(String charset) {
        this.charset = charset;
    }

    public AliPayHttpResultType getResultType() {
        return resultType;
    }

    public void setResultType(AliPayHttpResultType resultType) {
        this.resultType = resultType;
    }
}
