package com.arthenica.ffmpegkit;

/* loaded from: classes.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    private long f7232a;

    /* renamed from: b, reason: collision with root package name */
    private int f7233b;

    /* renamed from: c, reason: collision with root package name */
    private float f7234c;

    /* renamed from: d, reason: collision with root package name */
    private float f7235d;

    /* renamed from: e, reason: collision with root package name */
    private long f7236e;

    /* renamed from: f, reason: collision with root package name */
    private double f7237f;

    /* renamed from: g, reason: collision with root package name */
    private double f7238g;

    /* renamed from: h, reason: collision with root package name */
    private double f7239h;

    public a0(long j10, int i10, float f10, float f11, long j11, double d10, double d11, double d12) {
        this.f7232a = j10;
        this.f7233b = i10;
        this.f7234c = f10;
        this.f7235d = f11;
        this.f7236e = j11;
        this.f7237f = d10;
        this.f7238g = d11;
        this.f7239h = d12;
    }

    public double a() {
        return this.f7238g;
    }

    public long b() {
        return this.f7232a;
    }

    public long c() {
        return this.f7236e;
    }

    public double d() {
        return this.f7239h;
    }

    public double e() {
        return this.f7237f;
    }

    public float f() {
        return this.f7234c;
    }

    public int g() {
        return this.f7233b;
    }

    public float h() {
        return this.f7235d;
    }

    public String toString() {
        return "Statistics{sessionId=" + this.f7232a + ", videoFrameNumber=" + this.f7233b + ", videoFps=" + this.f7234c + ", videoQuality=" + this.f7235d + ", size=" + this.f7236e + ", time=" + this.f7237f + ", bitrate=" + this.f7238g + ", speed=" + this.f7239h + '}';
    }
}
