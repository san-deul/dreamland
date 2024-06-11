package com.dreamland.prj.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dreamland.prj.dto.AppleaveDto;
import com.dreamland.prj.dto.EmployeeDto;
import com.dreamland.prj.dto.PrincipalUser;
import com.dreamland.prj.service.dayoffService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/dayoff")
@RequiredArgsConstructor
@Controller
public class DayoffController {
  private final dayoffService dayoffService;
  
  //휴가관리 페이지이동
  @GetMapping("/info.do")
  public String dayoffPage(Model model) {
      EmployeeDto employee = getEmployeeFromSession();
      dayoffService.loadDayoffData(model, employee);
      return "dayoff/info";
  }
	
	// 휴가관리 페이지이동
//  @GetMapping("/info.do")
//  public String dayoffPage(Model model) {
//    EmployeeDto employee = getEmployeeFromSession();
//    int totalDayOff = employee.getDayOff();
//    int usedDayOff = employee.getUsedDayOff();
//    int remainingDayOff = dayoffService.calculateRemainingDayOff(totalDayOff, usedDayOff);
//    System.out.println("===== 연차 내역 =====");
//    System.out.println(totalDayOff);
//    System.out.println(usedDayOff);
//    
//    List<Integer> yearList = dayoffService.getYearList(employee.getEmpNo());
//    
//    model.addAttribute("totalDayOff", totalDayOff);
//    model.addAttribute("usedDayOff", usedDayOff);
//    model.addAttribute("remainingDayOff", remainingDayOff);
//    model.addAttribute("yearList", yearList);
//    
//    return "dayoff/info";
//  }
  
  // 휴가 리스트 조회 (연도별)
  @GetMapping("/list.do")
  public ResponseEntity<Map<String, Object>> getLeaveListByYear(@RequestParam int year) {
      EmployeeDto employee = getEmployeeFromSession();
      List<AppleaveDto> dayoffList = dayoffService.getDayoffListByYear(employee.getEmpNo(), year);
      Map<String, Object> result = new HashMap<>();
      result.put("dayoffList", dayoffList);
      return ResponseEntity.ok(result);
  }

  // 세션 정보
  private EmployeeDto getEmployeeFromSession() {
    PrincipalUser principalUser = (PrincipalUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    return principalUser.getEmployeeDto();
}
  
}