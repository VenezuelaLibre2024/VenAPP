package p009a7;

import p363t8.C11146e0;
import p363t8.C11172r0;
import p363t8.C11173s;

/* renamed from: a7.d */
/* loaded from: classes.dex */
final class C0038d implements InterfaceC0035a {

    /* renamed from: a */
    public final int f92a;

    /* renamed from: b */
    public final int f93b;

    /* renamed from: c */
    public final int f94c;

    /* renamed from: d */
    public final int f95d;

    /* renamed from: e */
    public final int f96e;

    /* renamed from: f */
    public final int f97f;

    private C0038d(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f92a = i10;
        this.f93b = i11;
        this.f94c = i12;
        this.f95d = i13;
        this.f96e = i14;
        this.f97f = i15;
    }

    /* renamed from: c */
    public static C0038d m132c(C11146e0 c11146e0) {
        int m34696u = c11146e0.m34696u();
        c11146e0.m34678V(12);
        int m34696u2 = c11146e0.m34696u();
        int m34696u3 = c11146e0.m34696u();
        int m34696u4 = c11146e0.m34696u();
        c11146e0.m34678V(4);
        int m34696u5 = c11146e0.m34696u();
        int m34696u6 = c11146e0.m34696u();
        c11146e0.m34678V(8);
        return new C0038d(m34696u, m34696u2, m34696u3, m34696u4, m34696u5, m34696u6);
    }

    /* renamed from: a */
    public long m133a() {
        return C11172r0.m34885O0(this.f96e, this.f94c * 1000000, this.f95d);
    }

    /* renamed from: b */
    public int m134b() {
        int i10 = this.f92a;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        C11173s.m34970i("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f92a));
        return -1;
    }

    @Override // p009a7.InterfaceC0035a
    public int getType() {
        return 1752331379;
    }
}
