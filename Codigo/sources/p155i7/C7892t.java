package p155i7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import p155i7.InterfaceC7879i0;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11146e0;
import p396v6.C11668s0;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12623m;

/* renamed from: i7.t */
/* loaded from: classes.dex */
public final class C7892t implements InterfaceC7885m {

    /* renamed from: a */
    private final C11146e0 f19163a;

    /* renamed from: b */
    private final C11668s0.a f19164b;

    /* renamed from: c */
    private final String f19165c;

    /* renamed from: d */
    private InterfaceC12609b0 f19166d;

    /* renamed from: e */
    private String f19167e;

    /* renamed from: f */
    private int f19168f;

    /* renamed from: g */
    private int f19169g;

    /* renamed from: h */
    private boolean f19170h;

    /* renamed from: i */
    private boolean f19171i;

    /* renamed from: j */
    private long f19172j;

    /* renamed from: k */
    private int f19173k;

    /* renamed from: l */
    private long f19174l;

    public C7892t() {
        this(null);
    }

    public C7892t(String str) {
        this.f19168f = 0;
        C11146e0 c11146e0 = new C11146e0(4);
        this.f19163a = c11146e0;
        c11146e0.m34682e()[0] = -1;
        this.f19164b = new C11668s0.a();
        this.f19174l = -9223372036854775807L;
        this.f19165c = str;
    }

    /* renamed from: a */
    private void m24330a(C11146e0 c11146e0) {
        byte[] m34682e = c11146e0.m34682e();
        int m34684g = c11146e0.m34684g();
        for (int m34683f = c11146e0.m34683f(); m34683f < m34684g; m34683f++) {
            byte b10 = m34682e[m34683f];
            boolean z10 = (b10 & 255) == 255;
            boolean z11 = this.f19171i && (b10 & 224) == 224;
            this.f19171i = z10;
            if (z11) {
                c11146e0.m34677U(m34683f + 1);
                this.f19171i = false;
                this.f19163a.m34682e()[1] = m34682e[m34683f];
                this.f19169g = 2;
                this.f19168f = 1;
                return;
            }
        }
        c11146e0.m34677U(m34684g);
    }

    /* renamed from: g */
    private void m24331g(C11146e0 c11146e0) {
        int min = Math.min(c11146e0.m34679a(), this.f19173k - this.f19169g);
        this.f19166d.m41511a(c11146e0, min);
        int i10 = this.f19169g + min;
        this.f19169g = i10;
        int i11 = this.f19173k;
        if (i10 < i11) {
            return;
        }
        long j10 = this.f19174l;
        if (j10 != -9223372036854775807L) {
            this.f19166d.mo331b(j10, 1, i11, 0, null);
            this.f19174l += this.f19172j;
        }
        this.f19169g = 0;
        this.f19168f = 0;
    }

    /* renamed from: h */
    private void m24332h(C11146e0 c11146e0) {
        int min = Math.min(c11146e0.m34679a(), 4 - this.f19169g);
        c11146e0.m34688l(this.f19163a.m34682e(), this.f19169g, min);
        int i10 = this.f19169g + min;
        this.f19169g = i10;
        if (i10 < 4) {
            return;
        }
        this.f19163a.m34677U(0);
        if (!this.f19164b.m36682a(this.f19163a.m34692q())) {
            this.f19169g = 0;
            this.f19168f = 1;
            return;
        }
        this.f19173k = this.f19164b.f30476c;
        if (!this.f19170h) {
            this.f19172j = (r8.f30480g * 1000000) / r8.f30477d;
            this.f19166d.mo332c(new C11108u1.b().m34540U(this.f19167e).m34552g0(this.f19164b.f30475b).m34544Y(RecognitionOptions.AZTEC).m34529J(this.f19164b.f30478e).m34553h0(this.f19164b.f30477d).m34543X(this.f19165c).m34526G());
            this.f19170h = true;
        }
        this.f19163a.m34677U(0);
        this.f19166d.m41511a(this.f19163a, 4);
        this.f19168f = 2;
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: b */
    public void mo24186b(C11146e0 c11146e0) {
        C11137a.m34607i(this.f19166d);
        while (c11146e0.m34679a() > 0) {
            int i10 = this.f19168f;
            if (i10 == 0) {
                m24330a(c11146e0);
            } else if (i10 == 1) {
                m24332h(c11146e0);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                m24331g(c11146e0);
            }
        }
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: c */
    public void mo24187c() {
        this.f19168f = 0;
        this.f19169g = 0;
        this.f19171i = false;
        this.f19174l = -9223372036854775807L;
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: d */
    public void mo24188d(InterfaceC12623m interfaceC12623m, InterfaceC7879i0.d dVar) {
        dVar.m24263a();
        this.f19167e = dVar.m24264b();
        this.f19166d = interfaceC12623m.mo308d(dVar.m24265c(), 1);
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: e */
    public void mo24189e() {
    }

    @Override // p155i7.InterfaceC7885m
    /* renamed from: f */
    public void mo24190f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f19174l = j10;
        }
    }
}
