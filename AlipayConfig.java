package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016092200566568";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDebE09Pq1vPcQeNna5YzmjPG7fnPPxjyp6Sv7o6OyN1KTknMB/dlcoA9yToffZBpK0FG11WvEAV3YmKMxIo3OTnN5tBZuHYynudNUEYtZusOjFJgFxdqVg+xLhDBy6y0/ytKQ6bFwnhZBwxEzqHmZ0h2aqyUIq8hbKClUMUQOjSphDVQ649MndoEI25CIrMHMMQOt/euQ7CVLaQ/MsF6dHw6uzNvcBo+I4ecH07EsLw8Tpg1g3WFfBP1Ux48QJHhsouVWHSmCtwOzgmDxwNdu2F+xPmB0Gxsi1j5DfM50xDfT+h55nEMj2UYIgrFRrySfC5fpV08qu2NS8+a72WCiLAgMBAAECggEBAIo5k+azxOSU5gRApJehanhfXifpSlCcQDGv2aq01g1uUOsh3x9XU+KyQ6obxgNBanovF7cOxScJM4uTXyDlMzZRDomCKp2AqtZeFOOc6NXxazbZ35u7uBsE7T6eYFxVbWHPkSAdp0eIYbMyyvnT2qggXVVVraEywabdtOzqi/A1imZrjxZN7igK/gE9cukaXCagfddI6bk71mtmwGFWvYfSXuRm2RH/ye1tzpaAwdClyQyZt5TtAxm10e1Ioz1nZwVQNGYkmxNYtzZvRlyuLT/GA/9BURsvpjygFt5V4LSg6edtRfGE/JQf2Rs5Wzc/7oXLlBCXYNoaAa4lwEhdHUECgYEA+sZWwo2BzXJHXwiO+mchFrhWECQiwemjwh4RoJF8qSiNMShSUitb7dTxWsIZaPt2YsiML/6uJVkZg7fElGwK7HYX8jzPiUzPEaI1ct0me9hY+x+YIh9zT3urCGe7pPrEbdFcmntMaTPff+3tEf2pDIrSp6kauu/n3Srg3gvFuc8CgYEA4w67SJZ5WBntywSGNQzW25esEsWneibr4Nf4uQiVd+u4xlRZK3G0vw3ZYv9v0enWP3ewewyJQptIFvN+RXMSDF+3M2FAp3UiqrlkXcoLCbDfDOld3Az8EdBOG/ZB0aC64RVjc4+TnBgnM8J+9HwilZOHxVkgvV66fB7ZA7c/YIUCgYBFiNFtyMcBLHrVww3CKO5n2l0ixKJOmnYp0SSaHT0vumrMAp4w4ozu+Wii/ccF8RP2eB1HAZtQB9CnUUFU1lCBGI2zQWFadM3F2fBwFRoipO6nUy9f5tCWbXgTMJA7Qr1MpgzDWQTq9tM2KcbegjNpouSeUKl0xCjKjqUjbKg6yQKBgAY9XGY1RGZoaAGBQVLp5GmqdF8bsWuI8EiAhuRG2RyvjKdeoAiymj352nR/AoqpO2sJFf97q7X54HRJArpT3DYc10MBNC6l6Gr6p0hwifcdNjP7ocmvTaoLqGnaTZq+KQSQeugtFOhgPYuNl8GOO8ESidOhjGXH2aYZjussOQClAoGBAJh93OoZA+Iz183biTZ1RvBOIBvLT/LOCowACtIefdM1C6Suoa7+/SjU+KA5NS1PNsH8/p1j1F0DHyJTyYn8QlfQZEBmy/CVKNFPPSgOku4BkEw0agR40hLptpYf97HYVntBAZiLyAUC293mn2msSqLY9OZoWd3cPThqjFpf8XUR";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvIO8XI5kTIooYjqC+rUL36p4xt5RjHH+A4euOdCvK+1BnltWSki4T11xDCp2RACDDrZTG3iJxgXQZm9RfCg+nYYcg7NHqipYSHYPS1/Sk+5SrM1mRQoAkaZkknQToIy/3MIA2CLOLnzN9pCjA9AsyoMnV+CJNtOAsmuWlQhAZg4UdMbobFSj3FTj7GtHWP1SSpC5Qdj7Jnn4tyHOI0tfAgixAVZLc37KrTDLp74yWSpNqJnA5HORYfMIlM55hs15qyDn7Fu61IOPDtTMmOEuPO97DJTgH2Bn1YbtksGPABxrzhh69QNT4jgWimMQl88+uSFyP3N+8fISHBueCac2JwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/shopmall/oldorders/update1";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/shopmall/oldorders/update1";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

