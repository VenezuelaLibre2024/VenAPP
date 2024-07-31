package p155i7;

import p155i7.InterfaceC7879i0;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11144d0;
import p363t8.C11146e0;
import p396v6.C11635c;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12623m;

/* renamed from: i7.f */
/* loaded from: classes.dex */
public final class C7872f implements InterfaceC7885m {

    /* renamed from: a */
    private final C11144d0 f18895a;

    /* renamed from: b */
    private final C11146e0 f18896b;

    /* renamed from: c */
    private final String f18897c;

    /* renamed from: d */
    private String f18898d;

    /* renamed from: e */
    private InterfaceC12609b0 f18899e;

    /* renamed from: f */
    private int f18900f;

    /* renamed from: g */
    private int f18901g;

    /* renamed from: h */
    private boolean f18902h;

    /* renamed from: i */
    private boolean f18903i;

    /* renamed from: j */
    private long f18904j;

    /* renamed from: k */
    private C11108u1 f18905k;

    /* renamed from: l */
    private int f18906l;

    /* renamed from: m */
    private long f18907m;

    public C7872f() {
        this(null);
    }

    public C7872f(String str) {
        C11144d0 c11144d0 = new C11144d0(new byte[16]);
        this.f18895a = c11144d0;
        this.f18896b = new C11146e0(c11144d0.f28941a);
        this.f18900f = 0;
        this.f18901g = 0;
        this.f18902h = false;
        this.f18903i = false;
        this.f18907m = -9223372036854775807L;
        this.f18897c = str;
    }

    /* renamed from: a */
    private boolean m24200a(C11146e0 c11146e0, byte[] bArr, int i10) {
        int min = Math.min(c11146e0.m34679a(), i10 - this.f18901g);
        c11146e0.m34688l(bArr, this.f18901g, min);
        int i11 = this.f18901g + min;
        this.f18901g = i11;
        return i11 == i10;
    }

    /* renamed from: g */
    private void m24201g() {
        this.f18895a.m34640p(0);
        C11635c.b m36483d = C11635c.m36483d(this.f18895a);
        C11108u1 c11108u1 = this.f18905k;
        if (c11108u1 == null || m36483d.f30285c != c11108u1.f28776J || m36483d.f30284b != c11108u1.f28777K || !"audio/ac4".equals(c11108u1.f28797w)) {
            C11108u1 m34526G = new C11108u1.b().m34540U(this.f18898d).m34552g0("audio/ac4").m34529J(m36483d.f30285c).m34553h0(m36483d.f30284b).m34543X(this.f18897c).m34526G();
            this.f18905k = m34526G;
            this.f18899e.mo332c(m34526G);
        }
        this.f18906l = m36483d.f30286d;
        this.f18904j = (m36483d.f30287e * 1000000) / this.f18905k.f28777K;
    }

    /* renamed from: h */
    private boolean m24202h(C11146e0 c11146e0) {
        int m34664H;
        while (true) {
            if (c11146e0.m34679a() <= 0) {
                return false;
            }
            if (this.f18902h) {
                m34664H = c11146e0.m34664H();
                this.f18902h = m34664H == 172;
                if (m34664H == 64 || m34664H == 65) {
                    break;
                }
            } else {
                this.f18902h = c11146e0.m34664H() == 172;
            }
        }
        this.f18903i = m34664H == 65;
        return true;
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: b */
    public void mo24186b(C11146e0 c11146e0) {
        C11137a.m34607i(this.f18899e);
        while (c11146e0.m34679a() > 0) {
            int i10 = this.f18900f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(c11146e0.m34679a(), this.f18906l - this.f18901g);
                        this.f18899e.m41511a(c11146e0, min);
                        int i11 = this.f18901g + min;
                        this.f18901g = i11;
                        int i12 = this.f18906l;
                        if (i11 == i12) {
                            long j10 = this.f18907m;
                            if (j10 != -9223372036854775807L) {
                                this.f18899e.mo331b(j10, 1, i12, 0, null);
                                this.f18907m += this.f18904j;
                            }
                            this.f18900f = 0;
                        }
                    }
                } else if (m24200a(c11146e0, this.f18896b.m34682e(), 16)) {
                    m24201g();
                    this.f18896b.m34677U(0);
                    this.f18899e.m41511a(this.f18896b, 16);
                    this.f18900f = 2;
                }
            } else if (m24202h(c11146e0)) {
                this.f18900f = 1;
                this.f18896b.m34682e()[0] = -84;
                this.f18896b.m34682e()[1] = (byte) (this.f18903i ? 65 : 64);
                this.f18901g = 2;
            }
        }
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: c */
    public void mo24187c() {
        this.f18900f = 0;
        this.f18901g = 0;
        this.f18902h = false;
        this.f18903i = false;
        this.f18907m = -9223372036854775807L;
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: d */
    public void mo24188d(InterfaceC12623m interfaceC12623m, InterfaceC7879i0.d dVar) {
        dVar.m24263a();
        this.f18898d = dVar.m24264b();
        this.f18899e = interfaceC12623m.mo308d(dVar.m24265c(), 1);
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: e */
    public void mo24189e() {
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: f */
    public void mo24190f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f18907m = j10;
        }
    }
}
