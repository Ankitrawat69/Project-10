package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.ParkingSlotDTO;
import com.rays.form.ParkingSlotForm;
import com.rays.service.ParkingSlotServiceInt;

@RestController
@RequestMapping(value = "Parking")
public class ParkingSlotCtl extends BaseCtl<ParkingSlotForm, ParkingSlotDTO,ParkingSlotServiceInt> {

}
