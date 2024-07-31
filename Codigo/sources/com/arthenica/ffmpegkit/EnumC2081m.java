package com.arthenica.ffmpegkit;

/* renamed from: com.arthenica.ffmpegkit.m */
/* loaded from: classes.dex */
public enum EnumC2081m {
    AV_LOG_STDERR(-16),
    AV_LOG_QUIET(-8),
    AV_LOG_PANIC(0),
    AV_LOG_FATAL(8),
    AV_LOG_ERROR(16),
    AV_LOG_WARNING(24),
    AV_LOG_INFO(32),
    AV_LOG_VERBOSE(40),
    AV_LOG_DEBUG(48),
    AV_LOG_TRACE(56);

    private final int value;

    EnumC2081m(int i10) {
        this.value = i10;
    }

    /* renamed from: h */
    public static EnumC2081m m10520h(int i10) {
        EnumC2081m enumC2081m = AV_LOG_STDERR;
        if (i10 == enumC2081m.m10521i()) {
            return enumC2081m;
        }
        EnumC2081m enumC2081m2 = AV_LOG_QUIET;
        if (i10 == enumC2081m2.m10521i()) {
            return enumC2081m2;
        }
        EnumC2081m enumC2081m3 = AV_LOG_PANIC;
        if (i10 == enumC2081m3.m10521i()) {
            return enumC2081m3;
        }
        EnumC2081m enumC2081m4 = AV_LOG_FATAL;
        if (i10 == enumC2081m4.m10521i()) {
            return enumC2081m4;
        }
        EnumC2081m enumC2081m5 = AV_LOG_ERROR;
        if (i10 == enumC2081m5.m10521i()) {
            return enumC2081m5;
        }
        EnumC2081m enumC2081m6 = AV_LOG_WARNING;
        if (i10 == enumC2081m6.m10521i()) {
            return enumC2081m6;
        }
        EnumC2081m enumC2081m7 = AV_LOG_INFO;
        if (i10 == enumC2081m7.m10521i()) {
            return enumC2081m7;
        }
        EnumC2081m enumC2081m8 = AV_LOG_VERBOSE;
        if (i10 == enumC2081m8.m10521i()) {
            return enumC2081m8;
        }
        EnumC2081m enumC2081m9 = AV_LOG_DEBUG;
        return i10 == enumC2081m9.m10521i() ? enumC2081m9 : AV_LOG_TRACE;
    }

    /* renamed from: i */
    public int m10521i() {
        return this.value;
    }
}
