package com.liss.user.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liss.common.model.SysRole;
import com.liss.db.mapper.SuperMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
* @author zlt
 * 角色
 */
public interface SysRoleMapper extends SuperMapper<SysRole> {
	List<SysRole> findList(Page<SysRole> page, @Param("r") Map<String, Object> params);
}
