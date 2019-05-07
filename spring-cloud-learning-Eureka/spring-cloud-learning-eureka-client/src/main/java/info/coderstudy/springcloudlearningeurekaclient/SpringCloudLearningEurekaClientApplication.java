package info.coderstudy.springcloudlearningeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RestController
public class SpringCloudLearningEurekaClientApplication {

    @GetMapping("/hi")
    public String hi(){
        return "hello,Eureka";
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringCloudLearningEurekaClientApplication.class, args);
    }

}
