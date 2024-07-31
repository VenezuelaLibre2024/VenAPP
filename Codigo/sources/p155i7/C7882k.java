package p155i7;

import p155i7.InterfaceC7879i0;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11146e0;
import p396v6.C11662p0;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12623m;

/* renamed from: i7.k */
/* loaded from: classes.dex */
public final class C7882k implements InterfaceC7885m {

    /* renamed from: b */
    private final String f18994b;

    /* renamed from: c */
    private String f18995c;

    /* renamed from: d */
    private InterfaceC12609b0 f18996d;

    /* renamed from: f */
    private int f18998f;

    /* renamed from: g */
    private int f18999g;

    /* renamed from: h */
    private long f19000h;

    /* renamed from: i */
    private C11108u1 f19001i;

    /* renamed from: j */
    private int f19002j;

    /* renamed from: a */
    private final C11146e0 f18993a = new C11146e0(new byte[18]);

    /* renamed from: e */
    private int f18997e = 0;

    /* renamed from: k */
    private long f19003k = -9223372036854775807L;

    public C7882k(String str) {
        this.f18994b = str;
    }

    /* renamed from: a */
    private boolean m24274a(C11146e0 c11146e0, byte[] bArr, int i10) {
        int min = Math.min(c11146e0.m34679a(), i10 - this.f18998f);
        c11146e0.m34688l(bArr, this.f18998f, min);
        int i11 = this.f18998f + min;
        this.f18998f = i11;
        return i11 == i10;
    }

    /* renamed from: g */
    private void m24275g() {
        byte[] m34682e = this.f18993a.m34682e();
        if (this.f19001i == null) {
            C11108u1 m36650g = C11662p0.m36650g(m34682e, this.f18995c, this.f18994b, null);
            this.f19001i = m36650g;
            this.f18996d.mo332c(m36650g);
        }
        this.f19002j = C11662p0.m36644a(m34682e);
        this.f19000h = (int) ((C11662p0.m36649f(m34682e) * 1000000) / this.f19001i.f28777K);
    }

    /* renamed from: h */
    private boolean m24276h(C11146e0 c11146e0) {
        while (c11146e0.m34679a() > 0) {
            int i10 = this.f18999g << 8;
            this.f18999g = i10;
            int m34664H = i10 | c11146e0.m34664H();
            this.f18999g = m34664H;
            if (C11662p0.m36647d(m34664H)) {
                byte[] m34682e = this.f18993a.m34682e();
                int i11 = this.f18999g;
                m34682e[0] = (byte) ((i11 >> 24) & 255);
                m34682e[1] = (byte) ((i11 >> 16) & 255);
                m34682e[2] = (byte) ((i11 >> 8) & 255);
                m34682e[3] = (byte) (i11 & 255);
                this.f18998f = 4;
                this.f18999g = 0;
                return true;
            }
        }
        return false;
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: b */
    public void mo24186b(C11146e0 c11146e0) {
        C11137a.m34607i(this.f18996d);
        while (c11146e0.m34679a() > 0) {
            int i10 = this.f18997e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    int min = Math.min(c11146e0.m34679a(), this.f19002j - this.f18998f);
                    this.f18996d.m41511a(c11146e0, min);
                    int i11 = this.f18998f + min;
                    this.f18998f = i11;
                    int i12 = this.f19002j;
                    if (i11 == i12) {
                        long j10 = this.f19003k;
                        if (j10 != -9223372036854775807L) {
                            this.f18996d.mo331b(j10, 1, i12, 0, null);
                            this.f19003k += this.f19000h;
                        }
                        this.f18997e = 0;
                    }
                } else if (m24274a(c11146e0, this.f18993a.m34682e(), 18)) {
                    m24275g();
                    this.f18993a.m34677U(0);
                    this.f18996d.m41511a(this.f18993a, 18);
                    this.f18997e = 2;
                }
            } else if (m24276h(c11146e0)) {
                this.f18997e = 1;
            }
        }
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: c */
    public void mo24187c() {
        this.f18997e = 0;
        this.f18998f = 0;
        this.f18999g = 0;
        this.f19003k = -9223372036854775807L;
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: d */
    public void mo24188d(InterfaceC12623m interfaceC12623m, InterfaceC7879i0.d dVar) {
        dVar.m24263a();
        this.f18995c = dVar.m24264b();
        this.f18996d = interfaceC12623m.mo308d(dVar.m24265c(), 1);
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: e */
    public void mo24189e() {
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: f */
    public void mo24190f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f19003k = j10;
        }
    }
}
