package d7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import l7.a;
import t6.u1;
import t8.e0;
import y6.k;
import y6.l;
import y6.m;
import y6.y;
import y6.z;

/* loaded from: classes.dex */
public final class a implements k {

    /* renamed from: b, reason: collision with root package name */
    private m f13803b;

    /* renamed from: c, reason: collision with root package name */
    private int f13804c;

    /* renamed from: d, reason: collision with root package name */
    private int f13805d;

    /* renamed from: e, reason: collision with root package name */
    private int f13806e;

    /* renamed from: g, reason: collision with root package name */
    private r7.b f13808g;

    /* renamed from: h, reason: collision with root package name */
    private l f13809h;

    /* renamed from: i, reason: collision with root package name */
    private c f13810i;

    /* renamed from: j, reason: collision with root package name */
    private g7.k f13811j;

    /* renamed from: a, reason: collision with root package name */
    private final e0 f13802a = new e0(6);

    /* renamed from: f, reason: collision with root package name */
    private long f13807f = -1;

    private void c(l lVar) {
        this.f13802a.Q(2);
        lVar.q(this.f13802a.e(), 0, 2);
        lVar.k(this.f13802a.N() - 2);
    }

    private void d() {
        h(new a.b[0]);
        ((m) t8.a.e(this.f13803b)).q();
        this.f13803b.p(new z.b(-9223372036854775807L));
        this.f13804c = 6;
    }

    private static r7.b g(String str, long j10) {
        b a10;
        if (j10 == -1 || (a10 = e.a(str)) == null) {
            return null;
        }
        return a10.a(j10);
    }

    private void h(a.b... bVarArr) {
        ((m) t8.a.e(this.f13803b)).d(RecognitionOptions.UPC_E, 4).c(new u1.b().M("image/jpeg").Z(new l7.a(bVarArr)).G());
    }

    private int i(l lVar) {
        this.f13802a.Q(2);
        lVar.q(this.f13802a.e(), 0, 2);
        return this.f13802a.N();
    }

    private void j(l lVar) {
        int i10;
        this.f13802a.Q(2);
        lVar.readFully(this.f13802a.e(), 0, 2);
        int N = this.f13802a.N();
        this.f13805d = N;
        if (N == 65498) {
            if (this.f13807f == -1) {
                d();
                return;
            }
            i10 = 4;
        } else if ((N >= 65488 && N <= 65497) || N == 65281) {
            return;
        } else {
            i10 = 1;
        }
        this.f13804c = i10;
    }

    private void k(l lVar) {
        String B;
        if (this.f13805d == 65505) {
            e0 e0Var = new e0(this.f13806e);
            lVar.readFully(e0Var.e(), 0, this.f13806e);
            if (this.f13808g == null && "http://ns.adobe.com/xap/1.0/".equals(e0Var.B()) && (B = e0Var.B()) != null) {
                r7.b g10 = g(B, lVar.getLength());
                this.f13808g = g10;
                if (g10 != null) {
                    this.f13807f = g10.f24752d;
                }
            }
        } else {
            lVar.n(this.f13806e);
        }
        this.f13804c = 0;
    }

    private void l(l lVar) {
        this.f13802a.Q(2);
        lVar.readFully(this.f13802a.e(), 0, 2);
        this.f13806e = this.f13802a.N() - 2;
        this.f13804c = 2;
    }

    private void m(l lVar) {
        if (lVar.d(this.f13802a.e(), 0, 1, true)) {
            lVar.f();
            if (this.f13811j == null) {
                this.f13811j = new g7.k();
            }
            c cVar = new c(lVar, this.f13807f);
            this.f13810i = cVar;
            if (this.f13811j.e(cVar)) {
                this.f13811j.b(new d(this.f13807f, (m) t8.a.e(this.f13803b)));
                n();
                return;
            }
        }
        d();
    }

    private void n() {
        h((a.b) t8.a.e(this.f13808g));
        this.f13804c = 5;
    }

    @Override // y6.k
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f13804c = 0;
            this.f13811j = null;
        } else if (this.f13804c == 5) {
            ((g7.k) t8.a.e(this.f13811j)).a(j10, j11);
        }
    }

    @Override // y6.k
    public void b(m mVar) {
        this.f13803b = mVar;
    }

    @Override // y6.k
    public boolean e(l lVar) {
        if (i(lVar) != 65496) {
            return false;
        }
        int i10 = i(lVar);
        this.f13805d = i10;
        if (i10 == 65504) {
            c(lVar);
            this.f13805d = i(lVar);
        }
        if (this.f13805d != 65505) {
            return false;
        }
        lVar.k(2);
        this.f13802a.Q(6);
        lVar.q(this.f13802a.e(), 0, 6);
        return this.f13802a.J() == 1165519206 && this.f13802a.N() == 0;
    }

    @Override // y6.k
    public int f(l lVar, y yVar) {
        int i10 = this.f13804c;
        if (i10 == 0) {
            j(lVar);
            return 0;
        }
        if (i10 == 1) {
            l(lVar);
            return 0;
        }
        if (i10 == 2) {
            k(lVar);
            return 0;
        }
        if (i10 == 4) {
            long position = lVar.getPosition();
            long j10 = this.f13807f;
            if (position != j10) {
                yVar.f31795a = j10;
                return 1;
            }
            m(lVar);
            return 0;
        }
        if (i10 != 5) {
            if (i10 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f13810i == null || lVar != this.f13809h) {
            this.f13809h = lVar;
            this.f13810i = new c(lVar, this.f13807f);
        }
        int f10 = ((g7.k) t8.a.e(this.f13811j)).f(this.f13810i, yVar);
        if (f10 == 1) {
            yVar.f31795a += this.f13807f;
        }
        return f10;
    }

    @Override // y6.k
    public void release() {
        g7.k kVar = this.f13811j;
        if (kVar != null) {
            kVar.release();
        }
    }
}
