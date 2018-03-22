package com.yanxi.service;

import com.baomidou.mybatisplus.service.IService;
import com.yanxi.commons.result.PageInfo;
import com.yanxi.model.SysLog;

/**
 *
 * SysLog 表数据服务层接口
 *
 */
public interface ISysLogService extends IService<SysLog> {

    void selectDataGrid(PageInfo pageInfo);

}