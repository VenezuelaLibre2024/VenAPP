package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.j */
/* loaded from: classes2.dex */
enum EnumC5538j {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    FAILSAFE('9');

    private final char zzj;

    EnumC5538j(char c10) {
        this.zzj = c10;
    }

    /* renamed from: h */
    public static EnumC5538j m14055h(char c10) {
        for (EnumC5538j enumC5538j : values()) {
            if (enumC5538j.zzj == c10) {
                return enumC5538j;
            }
        }
        return UNSET;
    }
}
