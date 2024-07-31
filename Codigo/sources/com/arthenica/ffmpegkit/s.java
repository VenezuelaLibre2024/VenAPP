package com.arthenica.ffmpegkit;

/* loaded from: classes.dex */
public class s extends b {

    /* renamed from: o, reason: collision with root package name */
    private q f7274o;

    /* renamed from: p, reason: collision with root package name */
    private final t f7275p;

    private s(String[] strArr, t tVar, o oVar) {
        super(strArr, oVar, p.NEVER_PRINT_LOGS);
        this.f7275p = tVar;
    }

    public static s y(String[] strArr, t tVar, o oVar) {
        return new s(strArr, tVar, oVar);
    }

    public q A() {
        return this.f7274o;
    }

    public void B(q qVar) {
        this.f7274o = qVar;
    }

    @Override // com.arthenica.ffmpegkit.x
    public boolean g() {
        return false;
    }

    @Override // com.arthenica.ffmpegkit.x
    public boolean n() {
        return false;
    }

    @Override // com.arthenica.ffmpegkit.x
    public boolean p() {
        return true;
    }

    public String toString() {
        return "MediaInformationSession{sessionId=" + this.f7241a + ", createTime=" + this.f7243c + ", startTime=" + this.f7244d + ", endTime=" + this.f7245e + ", arguments=" + FFmpegKitConfig.c(this.f7246f) + ", logs=" + u() + ", state=" + this.f7250j + ", returnCode=" + this.f7251k + ", failStackTrace='" + this.f7252l + "'}";
    }

    public t z() {
        return this.f7275p;
    }
}
