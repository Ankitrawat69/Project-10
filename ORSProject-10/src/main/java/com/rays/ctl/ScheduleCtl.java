package com.rays.ctl;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.ScheduleDTO;
import com.rays.form.ScheduleForm;
import com.rays.service.ScheduleServiceInt;

@RestController
@RequestMapping(value = "Schedule")
public class ScheduleCtl extends BaseCtl<ScheduleForm,ScheduleDTO, ScheduleServiceInt>{

}
