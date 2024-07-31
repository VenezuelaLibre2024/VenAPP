package i4;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum q0 {
    REQUESTS,
    INCLUDE_ACCESS_TOKENS,
    INCLUDE_RAW_RESPONSES,
    CACHE,
    APP_EVENTS,
    DEVELOPER_ERRORS,
    GRAPH_API_DEBUG_WARNING,
    GRAPH_API_DEBUG_INFO;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static q0[] valuesCustom() {
        q0[] valuesCustom = values();
        return (q0[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
