package cn.tedu.straw.commons.model.vo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class R<T> {

    private Integer state;//状态码
    private String message;//出错时的错误提示信息
    private  T data;//成功时响应客户端的数据

    public R(){
        super();
    }
    public static R ok(){
        return new R().setState(1);
    }
    public static R failure(){
        return new R().setState(2);
    }

}
