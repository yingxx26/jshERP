package com.dingdan.AuditState;

/**
 * 状态接口
 *
 * @author Administrator
 */
public interface State {


    public String generateEvent(Context context);

    public String paySuccessedEvent(Context context);

    public String faHuoSuccessedEvent(Context context);

    public String qianShouSuccessedEvent(Context context);

    public String tuiKuangEvent(Context context);

    public String tuiKuangSuccessedEvent(Context context);

    public String rejectTuiKuangEvent(Context context);

    public String tuiHuoEvent(Context context);

    public String tuiHuoSuccessedEvent(Context context);

    public String rejectTuiHuoEvent(Context context);

    public String closeEvent(Context context);

}
