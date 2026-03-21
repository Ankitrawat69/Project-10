package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.TravelDTO;
import com.rays.form.TravelForm;
import com.rays.service.TravelServiceInt;

@RestController
@RequestMapping(value = "Travel")
public class TravelCtl extends BaseCtl<TravelForm,TravelDTO, TravelServiceInt> {

}
