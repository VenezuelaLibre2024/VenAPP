package p459y6;

import p363t8.C11137a;
import p396v6.C11633b;
import p459y6.InterfaceC12609b0;

/* renamed from: y6.c0 */
/* loaded from: classes.dex */
public final class C12611c0 {

    /* renamed from: a */
    private final byte[] f34235a = new byte[10];

    /* renamed from: b */
    private boolean f34236b;

    /* renamed from: c */
    private int f34237c;

    /* renamed from: d */
    private long f34238d;

    /* renamed from: e */
    private int f34239e;

    /* renamed from: f */
    private int f34240f;

    /* renamed from: g */
    private int f34241g;

    /* renamed from: a */
    public void m41514a(InterfaceC12609b0 interfaceC12609b0, InterfaceC12609b0.a aVar) {
        if (this.f34237c > 0) {
            interfaceC12609b0.mo331b(this.f34238d, this.f34239e, this.f34240f, this.f34241g, aVar);
            this.f34237c = 0;
        }
    }

    /* renamed from: b */
    public void m41515b() {
        this.f34236b = false;
        this.f34237c = 0;
    }

    /* renamed from: c */
    public void m41516c(InterfaceC12609b0 interfaceC12609b0, long j10, int i10, int i11, int i12, InterfaceC12609b0.a aVar) {
        C11137a.m34606h(this.f34241g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f34236b) {
            int i13 = this.f34237c;
            int i14 = i13 + 1;
            this.f34237c = i14;
            if (i13 == 0) {
                this.f34238d = j10;
                this.f34239e = i10;
                this.f34240f = 0;
            }
            this.f34240f += i11;
            this.f34241g = i12;
            if (i14 >= 16) {
                m41514a(interfaceC12609b0, aVar);
            }
        }
    }

    /* renamed from: d */
    public void m41517d(InterfaceC12622l interfaceC12622l) {
        if (this.f34236b) {
            return;
        }
        interfaceC12622l.mo41540q(this.f34235a, 0, 10);
        interfaceC12622l.mo41534f();
        if (C11633b.m36478j(this.f34235a) == 0) {
            return;
        }
        this.f34236b = true;
    }
}
