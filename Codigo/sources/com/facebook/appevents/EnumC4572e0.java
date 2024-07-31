package com.facebook.appevents;

import java.util.Arrays;

/* renamed from: com.facebook.appevents.e0 */
/* loaded from: classes.dex */
public enum EnumC4572e0 {
    EXPLICIT,
    TIMER,
    SESSION_CHANGE,
    PERSISTED_EVENTS,
    EVENT_THRESHOLD,
    EAGER_FLUSHING_EVENT;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC4572e0[] valuesCustom() {
        EnumC4572e0[] valuesCustom = values();
        return (EnumC4572e0[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
