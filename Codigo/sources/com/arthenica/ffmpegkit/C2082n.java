package com.arthenica.ffmpegkit;

/* renamed from: com.arthenica.ffmpegkit.n */
/* loaded from: classes.dex */
public class C2082n {

    /* renamed from: a */
    private final long f8220a;

    /* renamed from: b */
    private final EnumC2081m f8221b;

    /* renamed from: c */
    private final String f8222c;

    public C2082n(long j10, EnumC2081m enumC2081m, String str) {
        this.f8220a = j10;
        this.f8221b = enumC2081m;
        this.f8222c = str;
    }

    /* renamed from: a */
    public EnumC2081m m10522a() {
        return this.f8221b;
    }

    /* renamed from: b */
    public String m10523b() {
        return this.f8222c;
    }

    /* renamed from: c */
    public long m10524c() {
        return this.f8220a;
    }

    public String toString() {
        return "Log{sessionId=" + this.f8220a + ", level=" + this.f8221b + ", message='" + this.f8222c + "'}";
    }
}
