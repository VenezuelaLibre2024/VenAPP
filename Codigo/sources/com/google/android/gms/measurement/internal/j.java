package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
enum j {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    FAILSAFE('9');

    private final char zzj;

    j(char c10) {
        this.zzj = c10;
    }

    public static j h(char c10) {
        for (j jVar : values()) {
            if (jVar.zzj == c10) {
                return jVar;
            }
        }
        return UNSET;
    }
}
