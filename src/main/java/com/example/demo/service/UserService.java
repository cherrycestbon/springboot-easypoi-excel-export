package com.example.demo.service;

import com.example.demo.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lenovo
 * @since 2022-10-13
 */
public interface UserService extends IService<User> {
    /**
     * excel批量用户导出
     * @param response
     */
    void exportUsers(HttpServletResponse response);

    /**
     * excel批量用户导出
     * @param response
     */
    void exportUsersImage(HttpServletResponse response);

    /**
     * excel多sheet导出
     * @param response
     */
    void exportSheetUsers(HttpServletResponse response);

    /**
     * 导出pdf文件
     * @param response
     */
    void exportPdfUsers(HttpServletResponse response);
}
