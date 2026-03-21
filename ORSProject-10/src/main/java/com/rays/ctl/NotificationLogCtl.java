package com.rays.ctl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.NotificationLogDTO;
import com.rays.form.NotificationLogForm;
import com.rays.service.NotificationLogServiceInt;

@RestController
@RequestMapping(value = "NotificationLog")
public class NotificationLogCtl extends BaseCtl<NotificationLogForm, NotificationLogDTO, NotificationLogServiceInt> {

    @GetMapping("preload")
    public ORSResponse preload() {
        ORSResponse res = new ORSResponse(true);
        NotificationLogDTO dto = new NotificationLogDTO();
        List<DropdownList> list = baseService.search(dto, userContext);
        res.addResult("notificationlist",list);
        return res;

    }
}