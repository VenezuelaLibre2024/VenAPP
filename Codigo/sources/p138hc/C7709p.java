package p138hc;

import p160ic.InterfaceC7957a;

/* renamed from: hc.p */
/* loaded from: classes.dex */
public class C7709p {

    /* renamed from: b */
    private long f18348b = 0;

    /* renamed from: c */
    private long f18349c = -1;

    /* renamed from: a */
    private final InterfaceC7957a f18347a = new InterfaceC7957a.a();

    /* renamed from: b */
    private static int m23481b(int i10) {
        return (i10 == 400 || i10 == 404) ? 1 : 0;
    }

    /* renamed from: a */
    public boolean m23482a() {
        return this.f18349c <= this.f18347a.mo24442a();
    }

    /* renamed from: c */
    public void m23483c() {
        this.f18348b = 0L;
        this.f18349c = -1L;
    }

    /* renamed from: d */
    public void m23484d(int i10) {
        this.f18348b++;
        if (m23481b(i10) == 1) {
            this.f18349c = this.f18347a.mo24442a() + 86400000;
            return;
        }
        this.f18349c = this.f18347a.mo24442a() + Math.min((long) (Math.pow(2.0d, this.f18348b * ((Math.random() * 0.5d) + 1.0d)) * 1000.0d), 14400000L);
    }
}
