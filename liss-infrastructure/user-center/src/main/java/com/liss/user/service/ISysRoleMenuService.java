package com.liss.user.service;

import com.liss.common.model.SysMenu;
import com.liss.common.service.ISuperService;
import com.liss.user.model.SysRoleMenu;

import java.util.List;
import java.util.Set;

/**
 * @author zlt
 */
public interface ISysRoleMenuService extends ISuperService<SysRoleMenu> {
	int save(Long roleId, Long menuId);

	int delete(Long roleId, Long menuId);

	List<SysMenu> findMenusByRoleIds(Set<Long> roleIds, Integer type);

	List<SysMenu> findMenusByRoleCodes(Set<String> roleCodes, Integer type);
}
