package cn.facedupid.controller;

import cn.facedupid.entities.CommonResult;
import cn.facedupid.model.Payment;
import cn.facedupid.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("/consumer")
public class ConsumerController {
//    public static final String URL = "http://localhost:8001";
    public static final String URL = "http://FACEDUPID-PAYMENT-SERVICE";


    @Resource
    private RestTemplate restTemplate;

    @Resource
    private PaymentService paymentService;
    @GetMapping("/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        log.info("nothing");
        return paymentService.getPaymentById(id);
    }

    @PostMapping
    public CommonResult<Payment> createPayment(@RequestBody Payment payment) {
        return restTemplate.postForObject(URL, payment, CommonResult.class);
    }

    @GetMapping
    public String test(){
        return "success";
    }

}
