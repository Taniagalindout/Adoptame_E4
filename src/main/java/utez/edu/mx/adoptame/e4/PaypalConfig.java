package utez.edu.mx.adoptame.e4;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.paypal.api.payments.PaymentHistory;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.OAuthTokenCredential;
import com.paypal.base.rest.PayPalRESTException;

@Configuration
public class PaypalConfig {

    @Value("ATnJT5rzFbZCvPmd66poCBEV2Z_t8mrzmxN6jqiqoHLGz7j889gwJiHq7AaTSJtcZvw0hiMurhwFGzeW")
    private String clientId;
    @Value("EHAbbw4nZ8XJwKjDyx99p4xnx2OstYdzyyQ1daGSXrQIXBnKv7MqJIB7RU_0tTHg6UU6yDRuJx5JuyPD")
    private String clientSecret;
    @Value("${paypal.mode}")
    private String mode;

    @Bean
    public Map<String, String> paypalSdkConfig() {
        Map<String, String> configMap = new HashMap<>();
        configMap.put("mode", mode);
        return configMap;
    }

    @Bean
    public OAuthTokenCredential oAuthTokenCredential() {
        return new OAuthTokenCredential(clientId, clientSecret, paypalSdkConfig());
    }

    @Bean
    public APIContext apiContext() throws PayPalRESTException {
        APIContext context = new APIContext(oAuthTokenCredential().getAccessToken());
        context.setConfigurationMap(paypalSdkConfig());
        return context;
    }

}
