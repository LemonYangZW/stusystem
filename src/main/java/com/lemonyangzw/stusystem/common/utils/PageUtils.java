package com.lemonyangzw.stusystem.common.utils;

import com.github.pagehelper.PageHelper;

/**
 * pageHelper分页
 *
 * @author Yang
 * @date 2020/11/9 14:06
 */
public class PageUtils {
    /**
     * @apiNote 从Request 获取pageNum,pageSize
     */
    public static void startPageByRequest() {
        PageHelper.startPage(RequstHelper.getRequest());
    }
}
