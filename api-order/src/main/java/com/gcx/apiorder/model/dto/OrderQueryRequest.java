package com.gcx.apiorder.model.dto;


import com.gcx.apicommon.common.PageRequest;
import lombok.Data;

import java.io.Serializable;


@Data
public class OrderQueryRequest extends PageRequest implements Serializable {
    private String type;
}
