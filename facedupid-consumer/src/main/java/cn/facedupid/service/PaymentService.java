package cn.facedupid.service;

//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
//@FeignClient("FACEDUPID-PAYMENT-SERVICE")
public interface PaymentService {

    @GetMapping("/{id}")
    public String getPaymentById(@PathVariable("id") Long id);
}
