package cn.facedupid.controller;

import cn.facedupid.entities.CommonResult;
import cn.facedupid.model.Payment;
import cn.facedupid.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @PostMapping
    public CommonResult create(@RequestBody Payment payment) {
        int count = paymentService.create(payment);
        log.info("插入结果：" + count);
        if (count > 0) {
            return new CommonResult(200, "插入成功:" + port, count);
        }
        return new CommonResult(400, "插入失败:" + port, count);
    }

    @GetMapping("/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        Payment payment = paymentService.GetById(id);
        if (payment != null)
            return new CommonResult(200, "查询成功:" + port, payment);
        else
            return new CommonResult(400, "没有查到:" + port + id, null);
    }
}
