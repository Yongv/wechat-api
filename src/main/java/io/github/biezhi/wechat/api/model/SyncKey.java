package io.github.biezhi.wechat.api.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * SyncKey
 *
 * @author biezhi
 * @date 2018/1/19
 */
@Data
public class SyncKey {

    @SerializedName("Count")
    private Integer count;

    @SerializedName("List")
    private List<KeyItem> list;

}
