package com.lemonyangzw.stusystem.project.system.mapper;

import com.lemonyangzw.stusystem.project.system.domain.SysRole;

import java.util.List;

public interface SysRoleMapper {

    List<SysRole> selectByUserId(Long userId);
}