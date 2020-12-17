package com.shang.account.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shang.account.entity.Account;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zengrenshang
 * @since 2020-12-04
 */
public interface AccountMapper extends BaseMapper<Account> {
    /**
     * 扣减账户余额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
