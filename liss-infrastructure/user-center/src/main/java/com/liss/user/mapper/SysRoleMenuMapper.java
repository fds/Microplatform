package com.liss.user.mapper;

import com.liss.common.model.SysMenu;
import com.liss.db.mapper.SuperMapper;
import com.liss.user.model.SysRoleMenu;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

/**
 * @author zlt
 * 角色菜单
 */
@Mapper
public interface SysRoleMenuMapper extends SuperMapper<SysRoleMenu> {
	@Insert("insert into sys_role_menu(role_id, menu_id) values(#{roleId}, #{menuId})")
	int save(@Param("roleId") Long roleId, @Param("menuId") Long menuId);

	int delete(@Param("roleId") Long roleId, @Param("menuId") Long menuId);

	List<SysMenu> findMenusByRoleIds(@Param("roleIds") Set<Long> roleIds, @Param("type") Integer type);

	List<SysMenu> findMenusByRoleCodes(@Param("roleCodes") Set<String> roleCodes, @Param("type") Integer type);
}
