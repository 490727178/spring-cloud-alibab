package com.shang.account.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shang.account.entity.Account;
import com.shang.account.mapper.AccountMapper;
import com.shang.account.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zengrenshang
 * @since 2020-12-04
 */
@Service
@Slf4j
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

    @Resource
    AccountMapper accountMapper;

    /**
     * 扣减账户余额
     */

    @Override
    public void decrease(Long userId, BigDecimal money) {
        log.info("------->account-service中扣减账户余额开始");
        //模拟超时异常，全局事务回滚
        //暂停几秒钟线程

        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
        accountMapper.decrease(userId, money);
        log.info("------->account-service中扣减账户余额结束");
    }
}
