package hc;

import ic.a;

/* loaded from: classes.dex */
public class p {

    /* renamed from: b, reason: collision with root package name */
    private long f16698b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f16699c = -1;

    /* renamed from: a, reason: collision with root package name */
    private final ic.a f16697a = new a.C0286a();

    private static int b(int i10) {
        return (i10 == 400 || i10 == 404) ? 1 : 0;
    }

    public boolean a() {
        return this.f16699c <= this.f16697a.a();
    }

    public void c() {
        this.f16698b = 0L;
        this.f16699c = -1L;
    }

    public void d(int i10) {
        this.f16698b++;
        if (b(i10) == 1) {
            this.f16699c = this.f16697a.a() + 86400000;
            return;
        }
        this.f16699c = this.f16697a.a() + Math.min((long) (Math.pow(2.0d, this.f16698b * ((Math.random() * 0.5d) + 1.0d)) * 1000.0d), 14400000L);
    }
}
