package com.ych.cloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@RestController
//@EnableFeignClients
public class ZookeeperApplication {

//    @Value("${spring.application.name:zookeeper-server}")
//    private String appName;
//
//    @Autowired
//    private LoadBalancerClient loadBalancer;
//
//    @Autowired
//    private DiscoveryClient discovery;
//
//    @Autowired
//    private Environment env;
//
//    @Autowired
//    private AppClient appClient;
//
//    @Autowired(required = false)
//    private Registration registration;
//
//    @Autowired
//    private RestTemplate rest;
//
//    @RequestMapping("/")
//    public ServiceInstance lb() {
//        return this.loadBalancer.choose(this.appName);
//    }

    @RequestMapping("/hi")
    public String hi() {
        return "Hello World! from ";
    }

//    @RequestMapping("/self")
//    public String self() {
//        return this.appClient.hi();
//    }
//
//    @RequestMapping("/myenv")
//    public String env(@RequestParam("prop") String prop) {
//        return this.env.getProperty(prop, "Not Found");
//    }
//
//    public String rt() {
//        return this.rest.getForObject("http://" + this.appName + "/hi", String.class);
//    }
//
//    @Bean
//    @LoadBalanced
//    RestTemplate loadBalancedRestTemplate() {
//        return new RestTemplate();
//    }

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperApplication.class, args);
    }

//    @FeignClient("testZookeeperApp")
//    interface AppClient {
//
//        @RequestMapping(path = "/hi", method = RequestMethod.GET)
//        String hi();
//
//    }

}
