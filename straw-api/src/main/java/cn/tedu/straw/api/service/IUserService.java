package cn.tedu.straw.api.service;

import cn.tedu.straw.api.dto.StudentRegisterDTO;
import cn.tedu.straw.commons.model.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author tedu.cn
 * @since 2020-08-13
 */
public interface IUserService extends IService<User> {
    void regStudent(StudentRegisterDTO studentRegisterDTO);
}
