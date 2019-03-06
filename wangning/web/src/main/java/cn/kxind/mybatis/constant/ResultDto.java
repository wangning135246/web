package cn.kxind.mybatis.constant;


/**
 * @Author: kxind
 * @Version: V1.0
 * @Description:  返回Json结果封装
 * @Date: 2017/3/27.
 */
public class ResultDto {

    private Integer code;
    private String msg;
    private Object data;

    public Integer getCode() {
        return code;
    }

    public static ResultDto toSuccess(String msg){
        ResultDto dto = new ResultDto();
        dto.setCode(0);
        dto.setMsg(msg);
        return dto;
    }

    public static ResultDto toSuccess(Object data){
        ResultDto dto = new ResultDto();
        dto.setCode(0);
        dto.setData(data);
        return dto;
    }

    public static ResultDto toError(String msg){
        ResultDto dto = new ResultDto();
        dto.setCode(1);
        dto.setMsg(msg);
        return dto;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
