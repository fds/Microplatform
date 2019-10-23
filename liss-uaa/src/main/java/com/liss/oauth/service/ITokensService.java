package com.liss.oauth.service;

import com.liss.common.model.PageResult;
import com.liss.oauth.model.TokenVo;

import java.util.Map;

/**
 * @author liss
 */
public interface ITokensService {
    /**
     * 查询token列表
     * @param params 请求参数
     * @param clientId 应用id
     */
    PageResult<TokenVo> listTokens(Map<String, Object> params, String clientId);
}
