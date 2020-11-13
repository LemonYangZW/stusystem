package com.lemonyangzw.stusystem.project.system.mapper;

import com.lemonyangzw.stusystem.project.system.domain.SysUserPost;

import java.util.List;

/**
 * @author Yang
 * @date 2020/11/12 14:02
 */
public interface SysUserPostMapper {
    /**
     * 批量新增用户岗位信息
     *
     * @param userPostList 用户角色列表
     * @return 结果
     */
   int batchUserPost(List<SysUserPost> userPostList);
}