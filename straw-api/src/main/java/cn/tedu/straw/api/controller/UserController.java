package cn.tedu.straw.api.controller;


import cn.tedu.straw.api.dto.StudentRegisterDTO;
import cn.tedu.straw.api.ex.InsertException;
import cn.tedu.straw.api.ex.InviteCodeException;
import cn.tedu.straw.api.ex.PhoneDuplicateException;
import cn.tedu.straw.api.service.IUserService;
import cn.tedu.straw.commons.model.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author tedu.cn
 * @since 2020-08-13
 */
@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("/student/register")
    public R regStudent(StudentRegisterDTO studentRegisterDTO){
        R r = new R();
        try{
            userService.regStudent(studentRegisterDTO);
            r.setMessage("注册成功！");
            return r;
        }catch(InviteCodeException e){
            r.setMessage("注册失败！邀请码错误!");
            return r;
        }catch (PhoneDuplicateException e){
            r.setMessage("注册失败！手机号已被注册！");
            return r;
        }catch (InsertException e){
            r.setMessage("注册失败！服务器繁忙！");
            return r;
        }catch (Throwable e){
            return r.setMessage("注册失败！出现预期以外的异常"
                    +e.getClass().getName()+
                    ","+e.getMessage());
        }
    }
}
