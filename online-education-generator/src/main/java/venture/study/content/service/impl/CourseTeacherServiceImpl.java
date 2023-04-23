package venture.study.content.service.impl;

import venture.study.content.model.po.CourseTeacher;
import venture.study.content.mapper.CourseTeacherMapper;
import venture.study.content.service.CourseTeacherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 课程-教师关系表 服务实现类
 * </p>
 *
 * @author venture
 */
@Slf4j
@Service
public class CourseTeacherServiceImpl extends ServiceImpl<CourseTeacherMapper, CourseTeacher> implements CourseTeacherService {

}
