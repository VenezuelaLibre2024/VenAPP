package com.arthenica.ffmpegkit;

import android.util.Log;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class h extends b {

    /* renamed from: o, reason: collision with root package name */
    private final b0 f7263o;

    /* renamed from: p, reason: collision with root package name */
    private final i f7264p;

    /* renamed from: q, reason: collision with root package name */
    private final List<a0> f7265q;

    /* renamed from: r, reason: collision with root package name */
    private final Object f7266r;

    private h(String[] strArr, i iVar, o oVar, b0 b0Var, p pVar) {
        super(strArr, oVar, pVar);
        this.f7264p = iVar;
        this.f7263o = b0Var;
        this.f7265q = new LinkedList();
        this.f7266r = new Object();
    }

    public static h z(String[] strArr, i iVar, o oVar, b0 b0Var, p pVar) {
        return new h(strArr, iVar, oVar, b0Var, pVar);
    }

    public List<a0> A(int i10) {
        x(i10);
        if (b()) {
            Log.i("ffmpeg-kit", String.format("getAllStatistics was called to return all statistics but there are still statistics being transmitted for session id %d.", Long.valueOf(this.f7241a)));
        }
        return C();
    }

    public i B() {
        return this.f7264p;
    }

    public List<a0> C() {
        List<a0> list;
        synchronized (this.f7266r) {
            list = this.f7265q;
        }
        return list;
    }

    public b0 D() {
        return this.f7263o;
    }

    @Override // com.arthenica.ffmpegkit.x
    public boolean g() {
        return true;
    }

    @Override // com.arthenica.ffmpegkit.x
    public boolean n() {
        return false;
    }

    @Override // com.arthenica.ffmpegkit.x
    public boolean p() {
        return false;
    }

    public String toString() {
        return "FFmpegSession{sessionId=" + this.f7241a + ", createTime=" + this.f7243c + ", startTime=" + this.f7244d + ", endTime=" + this.f7245e + ", arguments=" + FFmpegKitConfig.c(this.f7246f) + ", logs=" + u() + ", state=" + this.f7250j + ", returnCode=" + this.f7251k + ", failStackTrace='" + this.f7252l + "'}";
    }

    public void y(a0 a0Var) {
        synchronized (this.f7266r) {
            this.f7265q.add(a0Var);
        }
    }
}
