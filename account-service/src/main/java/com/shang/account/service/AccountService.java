package com.shang.account.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shang.account.entity.Account;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zengrenshang
 * @since 2020-12-04
 */
public interface AccountService extends IService<Account> {

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
