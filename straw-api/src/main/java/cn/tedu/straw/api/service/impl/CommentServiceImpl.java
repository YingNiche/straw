package cn.tedu.straw.api.service.impl;

import cn.tedu.straw.commons.model.Comment;
import cn.tedu.straw.api.mapper.CommentMapper;
import cn.tedu.straw.api.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tedu.cn
 * @since 2020-08-13
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
