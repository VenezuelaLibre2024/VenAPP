package com.arthenica.ffmpegkit;

/* loaded from: classes.dex */
public enum m {
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

    m(int i10) {
        this.value = i10;
    }

    public static m h(int i10) {
        m mVar = AV_LOG_STDERR;
        if (i10 == mVar.i()) {
            return mVar;
        }
        m mVar2 = AV_LOG_QUIET;
        if (i10 == mVar2.i()) {
            return mVar2;
        }
        m mVar3 = AV_LOG_PANIC;
        if (i10 == mVar3.i()) {
            return mVar3;
        }
        m mVar4 = AV_LOG_FATAL;
        if (i10 == mVar4.i()) {
            return mVar4;
        }
        m mVar5 = AV_LOG_ERROR;
        if (i10 == mVar5.i()) {
            return mVar5;
        }
        m mVar6 = AV_LOG_WARNING;
        if (i10 == mVar6.i()) {
            return mVar6;
        }
        m mVar7 = AV_LOG_INFO;
        if (i10 == mVar7.i()) {
            return mVar7;
        }
        m mVar8 = AV_LOG_VERBOSE;
        if (i10 == mVar8.i()) {
            return mVar8;
        }
        m mVar9 = AV_LOG_DEBUG;
        return i10 == mVar9.i() ? mVar9 : AV_LOG_TRACE;
    }

    public int i() {
        return this.value;
    }
}
