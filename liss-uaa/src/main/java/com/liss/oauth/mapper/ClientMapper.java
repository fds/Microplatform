package com.liss.oauth.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liss.db.mapper.SuperMapper;
import com.liss.oauth.model.Client;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author liss
 */
public interface ClientMapper extends SuperMapper<Client> {
    List<Client> findList(Page<Client> page, @Param("params") Map<String, Object> params);
}
