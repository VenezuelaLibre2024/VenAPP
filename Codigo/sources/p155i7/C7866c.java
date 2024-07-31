package p155i7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import p155i7.InterfaceC7879i0;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11144d0;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p396v6.C11633b;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12623m;

/* renamed from: i7.c */
/* loaded from: classes.dex */
public final class C7866c implements InterfaceC7885m {

    /* renamed from: a */
    private final C11144d0 f18867a;

    /* renamed from: b */
    private final C11146e0 f18868b;

    /* renamed from: c */
    private final String f18869c;

    /* renamed from: d */
    private String f18870d;

    /* renamed from: e */
    private InterfaceC12609b0 f18871e;

    /* renamed from: f */
    private int f18872f;

    /* renamed from: g */
    private int f18873g;

    /* renamed from: h */
    private boolean f18874h;

    /* renamed from: i */
    private long f18875i;

    /* renamed from: j */
    private C11108u1 f18876j;

    /* renamed from: k */
    private int f18877k;

    /* renamed from: l */
    private long f18878l;

    public C7866c() {
        this(null);
    }

    public C7866c(String str) {
        C11144d0 c11144d0 = new C11144d0(new byte[RecognitionOptions.ITF]);
        this.f18867a = c11144d0;
        this.f18868b = new C11146e0(c11144d0.f28941a);
        this.f18872f = 0;
        this.f18878l = -9223372036854775807L;
        this.f18869c = str;
    }

    /* renamed from: a */
    private boolean m24183a(C11146e0 c11146e0, byte[] bArr, int i10) {
        int min = Math.min(c11146e0.m34679a(), i10 - this.f18873g);
        c11146e0.m34688l(bArr, this.f18873g, min);
        int i11 = this.f18873g + min;
        this.f18873g = i11;
        return i11 == i10;
    }

    /* renamed from: g */
    private void m24184g() {
        this.f18867a.m34640p(0);
        C11633b.b m36474f = C11633b.m36474f(this.f18867a);
        C11108u1 c11108u1 = this.f18876j;
        if (c11108u1 == null || m36474f.f30278d != c11108u1.f28776J || m36474f.f30277c != c11108u1.f28777K || !C11172r0.m34914c(m36474f.f30275a, c11108u1.f28797w)) {
            C11108u1.b m34547b0 = new C11108u1.b().m34540U(this.f18870d).m34552g0(m36474f.f30275a).m34529J(m36474f.f30278d).m34553h0(m36474f.f30277c).m34543X(this.f18869c).m34547b0(m36474f.f30281g);
            if ("audio/ac3".equals(m36474f.f30275a)) {
                m34547b0.m34528I(m36474f.f30281g);
            }
            C11108u1 m34526G = m34547b0.m34526G();
            this.f18876j = m34526G;
            this.f18871e.mo332c(m34526G);
        }
        this.f18877k = m36474f.f30279e;
        this.f18875i = (m36474f.f30280f * 1000000) / this.f18876j.f28777K;
    }

    /* renamed from: h */
    private boolean m24185h(C11146e0 c11146e0) {
        while (true) {
            boolean z10 = false;
            if (c11146e0.m34679a() <= 0) {
                return false;
            }
            if (this.f18874h) {
                int m34664H = c11146e0.m34664H();
                if (m34664H == 119) {
                    this.f18874h = false;
                    return true;
                }
                if (m34664H != 11) {
                    this.f18874h = z10;
                }
                z10 = true;
                this.f18874h = z10;
            } else {
                if (c11146e0.m34664H() != 11) {
                    this.f18874h = z10;
                }
                z10 = true;
                this.f18874h = z10;
            }
        }
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: b */
    public void mo24186b(C11146e0 c11146e0) {
        C11137a.m34607i(this.f18871e);
        while (c11146e0.m34679a() > 0) {
            int i10 = this.f18872f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(c11146e0.m34679a(), this.f18877k - this.f18873g);
                        this.f18871e.m41511a(c11146e0, min);
                        int i11 = this.f18873g + min;
                        this.f18873g = i11;
                        int i12 = this.f18877k;
                        if (i11 == i12) {
                            long j10 = this.f18878l;
                            if (j10 != -9223372036854775807L) {
                                this.f18871e.mo331b(j10, 1, i12, 0, null);
                                this.f18878l += this.f18875i;
                            }
                            this.f18872f = 0;
                        }
                    }
                } else if (m24183a(c11146e0, this.f18868b.m34682e(), RecognitionOptions.ITF)) {
                    m24184g();
                    this.f18868b.m34677U(0);
                    this.f18871e.m41511a(this.f18868b, RecognitionOptions.ITF);
                    this.f18872f = 2;
                }
            } else if (m24185h(c11146e0)) {
                this.f18872f = 1;
                this.f18868b.m34682e()[0] = 11;
                this.f18868b.m34682e()[1] = 119;
                this.f18873g = 2;
            }
        }
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: c */
    public void mo24187c() {
        this.f18872f = 0;
        this.f18873g = 0;
        this.f18874h = false;
        this.f18878l = -9223372036854775807L;
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: d */
    public void mo24188d(InterfaceC12623m interfaceC12623m, InterfaceC7879i0.d dVar) {
        dVar.m24263a();
        this.f18870d = dVar.m24264b();
        this.f18871e = interfaceC12623m.mo308d(dVar.m24265c(), 1);
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: e */
    public void mo24189e() {
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: f */
    public void mo24190f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f18878l = j10;
        }
    }
}
