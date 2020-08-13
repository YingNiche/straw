package cn.tedu.straw.api.service.impl;

import cn.tedu.straw.commons.model.Question;
import cn.tedu.straw.api.mapper.QuestionMapper;
import cn.tedu.straw.api.service.IQuestionService;
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
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question> implements IQuestionService {

}
