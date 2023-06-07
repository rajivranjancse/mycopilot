package com.ex.mycopilotex;
/*create controller to get data from external uri */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class MyConEx {
    @GetMapping("/mydata")
    public String mydata() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://jsonplaceholder.typicode.com/todos/1";
        String result = restTemplate.getForObject(url, String.class);
        return result;
    }
}

