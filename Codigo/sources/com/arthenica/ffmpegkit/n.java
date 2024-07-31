package com.arthenica.ffmpegkit;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final long f7268a;

    /* renamed from: b, reason: collision with root package name */
    private final m f7269b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7270c;

    public n(long j10, m mVar, String str) {
        this.f7268a = j10;
        this.f7269b = mVar;
        this.f7270c = str;
    }

    public m a() {
        return this.f7269b;
    }

    public String b() {
        return this.f7270c;
    }

    public long c() {
        return this.f7268a;
    }

    public String toString() {
        return "Log{sessionId=" + this.f7268a + ", level=" + this.f7269b + ", message='" + this.f7270c + "'}";
    }
}
