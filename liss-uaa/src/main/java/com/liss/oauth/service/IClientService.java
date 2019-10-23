package com.liss.oauth.service;

import com.liss.common.model.PageResult;
import com.liss.common.model.Result;
import com.liss.common.service.ISuperService;
import com.liss.oauth.model.Client;

import java.util.Map;

/**
 * @author liss
 */
public interface IClientService extends ISuperService<Client> {
    Result saveClient(Client clientDto);

    /**
     * 查询应用列表
     * @param params
     * @param isPage 是否分页
     */
    PageResult<Client> listClent(Map<String, Object> params, boolean isPage);

    void delClient(long id);
}
