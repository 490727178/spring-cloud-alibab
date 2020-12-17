package com.shang.storage.mapper;

import com.shang.storage.entity.Storage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zengrenshang
 * @since 2020-12-04
 */
public interface StorageMapper extends BaseMapper<Storage> {
    /**
     *  扣减库存
     */
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
