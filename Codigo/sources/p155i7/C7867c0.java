package p155i7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import p155i7.InterfaceC7879i0;
import p363t8.C11146e0;
import p363t8.C11164n0;
import p363t8.C11172r0;
import p459y6.InterfaceC12623m;

/* renamed from: i7.c0 */
/* loaded from: classes.dex */
public final class C7867c0 implements InterfaceC7879i0 {

    /* renamed from: a */
    private final InterfaceC7865b0 f18879a;

    /* renamed from: b */
    private final C11146e0 f18880b = new C11146e0(32);

    /* renamed from: c */
    private int f18881c;

    /* renamed from: d */
    private int f18882d;

    /* renamed from: e */
    private boolean f18883e;

    /* renamed from: f */
    private boolean f18884f;

    public C7867c0(InterfaceC7865b0 interfaceC7865b0) {
        this.f18879a = interfaceC7865b0;
    }

    @Override // p155i7.InterfaceC7879i0
    /* renamed from: a */
    public void mo24191a(C11164n0 c11164n0, InterfaceC12623m interfaceC12623m, InterfaceC7879i0.d dVar) {
        this.f18879a.mo24181a(c11164n0, interfaceC12623m, dVar);
        this.f18884f = true;
    }

    @Override // p155i7.InterfaceC7879i0
    /* renamed from: b */
    public void mo24192b(C11146e0 c11146e0, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int m34683f = z10 ? c11146e0.m34683f() + c11146e0.m34664H() : -1;
        if (this.f18884f) {
            if (!z10) {
                return;
            }
            this.f18884f = false;
            c11146e0.m34677U(m34683f);
            this.f18882d = 0;
        }
        while (c11146e0.m34679a() > 0) {
            int i11 = this.f18882d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int m34664H = c11146e0.m34664H();
                    c11146e0.m34677U(c11146e0.m34683f() - 1);
                    if (m34664H == 255) {
                        this.f18884f = true;
                        return;
                    }
                }
                int min = Math.min(c11146e0.m34679a(), 3 - this.f18882d);
                c11146e0.m34688l(this.f18880b.m34682e(), this.f18882d, min);
                int i12 = this.f18882d + min;
                this.f18882d = i12;
                if (i12 == 3) {
                    this.f18880b.m34677U(0);
                    this.f18880b.m34676T(3);
                    this.f18880b.m34678V(1);
                    int m34664H2 = this.f18880b.m34664H();
                    int m34664H3 = this.f18880b.m34664H();
                    this.f18883e = (m34664H2 & RecognitionOptions.ITF) != 0;
                    this.f18881c = (((m34664H2 & 15) << 8) | m34664H3) + 3;
                    int m34680b = this.f18880b.m34680b();
                    int i13 = this.f18881c;
                    if (m34680b < i13) {
                        this.f18880b.m34681c(Math.min(4098, Math.max(i13, this.f18880b.m34680b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(c11146e0.m34679a(), this.f18881c - this.f18882d);
                c11146e0.m34688l(this.f18880b.m34682e(), this.f18882d, min2);
                int i14 = this.f18882d + min2;
                this.f18882d = i14;
                int i15 = this.f18881c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f18883e) {
                        this.f18880b.m34676T(i15);
                    } else {
                        if (C11172r0.m34948t(this.f18880b.m34682e(), 0, this.f18881c, -1) != 0) {
                            this.f18884f = true;
                            return;
                        }
                        this.f18880b.m34676T(this.f18881c - 4);
                    }
                    this.f18880b.m34677U(0);
                    this.f18879a.mo24182b(this.f18880b);
                    this.f18882d = 0;
                }
            }
        }
    }

    @Override // p155i7.InterfaceC7879i0
    /* renamed from: c */
    public void mo24193c() {
        this.f18884f = true;
    }
}
