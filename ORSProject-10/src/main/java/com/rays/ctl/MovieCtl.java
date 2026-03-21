package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.MovieDTO;
import com.rays.form.MovieForm;
import com.rays.service.MovieServiceInt;

@RestController
@RequestMapping(value = "Movie")
public class MovieCtl extends BaseCtl<MovieForm,MovieDTO,MovieServiceInt> {

}
