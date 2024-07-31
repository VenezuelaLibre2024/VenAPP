package com.facebook.appevents;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum e0 {
    EXPLICIT,
    TIMER,
    SESSION_CHANGE,
    PERSISTED_EVENTS,
    EVENT_THRESHOLD,
    EAGER_FLUSHING_EVENT;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static e0[] valuesCustom() {
        e0[] valuesCustom = values();
        return (e0[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
