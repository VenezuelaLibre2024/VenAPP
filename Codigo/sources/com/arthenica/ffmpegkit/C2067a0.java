package com.arthenica.ffmpegkit;

/* renamed from: com.arthenica.ffmpegkit.a0 */
/* loaded from: classes.dex */
public class C2067a0 {

    /* renamed from: a */
    private long f8184a;

    /* renamed from: b */
    private int f8185b;

    /* renamed from: c */
    private float f8186c;

    /* renamed from: d */
    private float f8187d;

    /* renamed from: e */
    private long f8188e;

    /* renamed from: f */
    private double f8189f;

    /* renamed from: g */
    private double f8190g;

    /* renamed from: h */
    private double f8191h;

    public C2067a0(long j10, int i10, float f10, float f11, long j11, double d10, double d11, double d12) {
        this.f8184a = j10;
        this.f8185b = i10;
        this.f8186c = f10;
        this.f8187d = f11;
        this.f8188e = j11;
        this.f8189f = d10;
        this.f8190g = d11;
        this.f8191h = d12;
    }

    /* renamed from: a */
    public double m10471a() {
        return this.f8190g;
    }

    /* renamed from: b */
    public long m10472b() {
        return this.f8184a;
    }

    /* renamed from: c */
    public long m10473c() {
        return this.f8188e;
    }

    /* renamed from: d */
    public double m10474d() {
        return this.f8191h;
    }

    /* renamed from: e */
    public double m10475e() {
        return this.f8189f;
    }

    /* renamed from: f */
    public float m10476f() {
        return this.f8186c;
    }

    /* renamed from: g */
    public int m10477g() {
        return this.f8185b;
    }

    /* renamed from: h */
    public float m10478h() {
        return this.f8187d;
    }

    public String toString() {
        return "Statistics{sessionId=" + this.f8184a + ", videoFrameNumber=" + this.f8185b + ", videoFps=" + this.f8186c + ", videoQuality=" + this.f8187d + ", size=" + this.f8188e + ", time=" + this.f8189f + ", bitrate=" + this.f8190g + ", speed=" + this.f8191h + '}';
    }
}
