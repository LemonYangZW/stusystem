package com.lemonyangzw.stusystem.project.system.service.impl;

import com.lemonyangzw.stusystem.project.system.domain.SysPost;
import com.lemonyangzw.stusystem.project.system.mapper.SysPostMapper;
import com.lemonyangzw.stusystem.project.system.service.SysPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Yang
 * @date 2020/11/12 9:15
 */
@Service
public class SysPostServiceImpl implements SysPostService {
    @Autowired
    private SysPostMapper sysPostMapper;

    @Override
    public List<SysPost> getPostAll() {
        return sysPostMapper.getPostAll();
    }

    /**
     * 根据用户ID获取岗位选择框列表
     *
     * @param userId 用户ID
     * @return 选中岗位ID列表
     */
    public List<Integer> selectPostListByUserId(Long userId) {
        return sysPostMapper.selectPostListByUserId(userId);
    }
}
