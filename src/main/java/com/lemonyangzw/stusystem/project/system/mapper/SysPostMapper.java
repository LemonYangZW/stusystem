package com.lemonyangzw.stusystem.project.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lemonyangzw.stusystem.project.system.domain.SysPost;

import java.util.List;

public interface SysPostMapper extends BaseMapper<SysPost> {

    List<SysPost> getPostAll();

    /**
     * 根据用户ID获取岗位选择框列表
     *
     * @param userId 用户ID
     * @return 选中岗位ID列表
     */
    List<Integer> selectPostListByUserId(Long userId);
}