package com.gcx.springbootinit.service.impl;
import java.util.Date;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gcx.springbootinit.common.ErrorCode;
import com.gcx.springbootinit.exception.BusinessException;
import com.gcx.springbootinit.exception.ThrowUtils;
import com.gcx.apicommon.entity.InterfaceInfo;
import com.gcx.springbootinit.service.InterfaceInfoService;
import com.gcx.springbootinit.mapper.InterfaceInfoMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService{

    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {


        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }


        String name = interfaceInfo.getName();
        // 创建时，参数不能为空
        if (add) {
            ThrowUtils.throwIf(StringUtils.isAnyBlank(name), ErrorCode.PARAMS_ERROR);
        }
        // 有参数则校验
        if (StringUtils.isBlank(name)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "接口名称不能为空");
        }
        if (name.length() > 50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "接口名称过长");
        }
    }
}




