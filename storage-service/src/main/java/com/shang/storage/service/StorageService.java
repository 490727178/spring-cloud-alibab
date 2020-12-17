package com.shang.storage.service;

import com.shang.storage.entity.Storage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zengrenshang
 * @since 2020-12-04
 */
public interface StorageService extends IService<Storage> {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
