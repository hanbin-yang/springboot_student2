package com.qf.controller;

import com.qf.entity.Student;
import com.qf.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("stu")
public class StudentController {

    @Autowired
    IStudentService studentService;

    @RequestMapping("list")
    public String getList(Model model){
        List<Student> list = studentService.getStuList();

        model.addAttribute("list",list);

        return "student_list";
    }

    @RequestMapping("/deleteOne")
    public  String  deleteOne(Integer id){
        studentService.removeById(id);
        return "redirect:/stu/list";
    }
}
