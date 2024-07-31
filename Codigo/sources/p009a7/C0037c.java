package p009a7;

import p363t8.C11146e0;

/* renamed from: a7.c */
/* loaded from: classes.dex */
final class C0037c implements InterfaceC0035a {

    /* renamed from: a */
    public final int f88a;

    /* renamed from: b */
    public final int f89b;

    /* renamed from: c */
    public final int f90c;

    /* renamed from: d */
    public final int f91d;

    private C0037c(int i10, int i11, int i12, int i13) {
        this.f88a = i10;
        this.f89b = i11;
        this.f90c = i12;
        this.f91d = i13;
    }

    /* renamed from: b */
    public static C0037c m130b(C11146e0 c11146e0) {
        int m34696u = c11146e0.m34696u();
        c11146e0.m34678V(8);
        int m34696u2 = c11146e0.m34696u();
        int m34696u3 = c11146e0.m34696u();
        c11146e0.m34678V(4);
        int m34696u4 = c11146e0.m34696u();
        c11146e0.m34678V(12);
        return new C0037c(m34696u, m34696u2, m34696u3, m34696u4);
    }

    /* renamed from: a */
    public boolean m131a() {
        return (this.f89b & 16) == 16;
    }

    @Override // p009a7.InterfaceC0035a
    public int getType() {
        return 1751742049;
    }
}
