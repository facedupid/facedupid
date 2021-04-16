package cn.facedupid.service;

import cn.facedupid.model.Payment;
import org.springframework.stereotype.Service;


@Service
public interface PaymentService {

    int create(Payment payment);

    Payment GetById(Long id);
}
