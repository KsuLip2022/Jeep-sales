/**
 * 
 */
package com.promineotech.jeep.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;

/**
 * @author kdubrovskaya
 *
 */
@RequestMapping("/jeeps")
public interface JeepSalesController {
  @GetMapping
  @ResponseStatus(code = HttpStatus.OK)

  List<Jeep> fetchJeeps(JeepModel model, String trim);
}
