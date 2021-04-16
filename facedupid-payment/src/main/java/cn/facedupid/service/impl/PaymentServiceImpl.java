package cn.facedupid.service.impl;

import cn.facedupid.mapper.PaymentMapper;
import cn.facedupid.model.Payment;
import cn.facedupid.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.insert(payment);
    }

    @Override
    public Payment GetById(Long id) {
        return paymentMapper.selectByPrimaryKey(id);
    }
}
