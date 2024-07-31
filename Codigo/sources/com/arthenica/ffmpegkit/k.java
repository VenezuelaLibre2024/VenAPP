package com.arthenica.ffmpegkit;

/* loaded from: classes.dex */
public class k extends b {

    /* renamed from: o, reason: collision with root package name */
    private final l f7267o;

    private k(String[] strArr, l lVar, o oVar, p pVar) {
        super(strArr, oVar, pVar);
        this.f7267o = lVar;
    }

    public static k y(String[] strArr, l lVar, o oVar, p pVar) {
        return new k(strArr, lVar, oVar, pVar);
    }

    @Override // com.arthenica.ffmpegkit.x
    public boolean g() {
        return false;
    }

    @Override // com.arthenica.ffmpegkit.x
    public boolean n() {
        return true;
    }

    @Override // com.arthenica.ffmpegkit.x
    public boolean p() {
        return false;
    }

    public String toString() {
        return "FFprobeSession{sessionId=" + this.f7241a + ", createTime=" + this.f7243c + ", startTime=" + this.f7244d + ", endTime=" + this.f7245e + ", arguments=" + FFmpegKitConfig.c(this.f7246f) + ", logs=" + u() + ", state=" + this.f7250j + ", returnCode=" + this.f7251k + ", failStackTrace='" + this.f7252l + "'}";
    }

    public l z() {
        return this.f7267o;
    }
}
