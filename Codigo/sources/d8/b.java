package d8;

import com.google.android.exoplayer2.source.rtsp.h;
import t8.d0;
import t8.e0;
import t8.r0;
import y6.b0;
import y6.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: a */
    private final h f13826a;

    /* renamed from: b */
    private final d0 f13827b = new d0();

    /* renamed from: c */
    private final int f13828c;

    /* renamed from: d */
    private final int f13829d;

    /* renamed from: e */
    private final int f13830e;

    /* renamed from: f */
    private final int f13831f;

    /* renamed from: g */
    private long f13832g;

    /* renamed from: h */
    private b0 f13833h;

    /* renamed from: i */
    private long f13834i;

    public b(h hVar) {
        int i10;
        this.f13826a = hVar;
        this.f13828c = hVar.f8349b;
        String str = (String) t8.a.e(hVar.f8351d.get("mode"));
        if (eb.c.a(str, "AAC-hbr")) {
            this.f13829d = 13;
            i10 = 3;
        } else {
            if (!eb.c.a(str, "AAC-lbr")) {
                throw new UnsupportedOperationException("AAC mode not supported");
            }
            this.f13829d = 6;
            i10 = 2;
        }
        this.f13830e = i10;
        this.f13831f = this.f13830e + this.f13829d;
    }

    private static void e(b0 b0Var, long j10, int i10) {
        b0Var.b(j10, 1, i10, 0, null);
    }

    private static long f(long j10, long j11, long j12, int i10) {
        return j10 + r0.O0(j11 - j12, 1000000L, i10);
    }

    @Override // d8.e
    public void a(long j10, long j11) {
        this.f13832g = j10;
        this.f13834i = j11;
    }

    @Override // d8.e
    public void b(e0 e0Var, long j10, int i10, boolean z10) {
        t8.a.e(this.f13833h);
        short D = e0Var.D();
        int i11 = D / this.f13831f;
        long f10 = f(this.f13834i, j10, this.f13832g, this.f13828c);
        this.f13827b.m(e0Var);
        if (i11 == 1) {
            int h10 = this.f13827b.h(this.f13829d);
            this.f13827b.r(this.f13830e);
            this.f13833h.a(e0Var, e0Var.a());
            if (z10) {
                e(this.f13833h, f10, h10);
                return;
            }
            return;
        }
        e0Var.V((D + 7) / 8);
        for (int i12 = 0; i12 < i11; i12++) {
            int h11 = this.f13827b.h(this.f13829d);
            this.f13827b.r(this.f13830e);
            this.f13833h.a(e0Var, h11);
            e(this.f13833h, f10, h11);
            f10 += r0.O0(i11, 1000000L, this.f13828c);
        }
    }

    @Override // d8.e
    public void c(m mVar, int i10) {
        b0 d10 = mVar.d(i10, 1);
        this.f13833h = d10;
        d10.c(this.f13826a.f8350c);
    }

    @Override // d8.e
    public void d(long j10, int i10) {
        this.f13832g = j10;
    }
}
