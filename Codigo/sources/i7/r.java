package i7;

import i7.i0;
import t6.u1;

/* loaded from: classes.dex */
public final class r implements m {

    /* renamed from: b, reason: collision with root package name */
    private y6.b0 f17476b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f17477c;

    /* renamed from: e, reason: collision with root package name */
    private int f17479e;

    /* renamed from: f, reason: collision with root package name */
    private int f17480f;

    /* renamed from: a, reason: collision with root package name */
    private final t8.e0 f17475a = new t8.e0(10);

    /* renamed from: d, reason: collision with root package name */
    private long f17478d = -9223372036854775807L;

    @Override // i7.m
    public void b(t8.e0 e0Var) {
        t8.a.i(this.f17476b);
        if (this.f17477c) {
            int a10 = e0Var.a();
            int i10 = this.f17480f;
            if (i10 < 10) {
                int min = Math.min(a10, 10 - i10);
                System.arraycopy(e0Var.e(), e0Var.f(), this.f17475a.e(), this.f17480f, min);
                if (this.f17480f + min == 10) {
                    this.f17475a.U(0);
                    if (73 != this.f17475a.H() || 68 != this.f17475a.H() || 51 != this.f17475a.H()) {
                        t8.s.i("Id3Reader", "Discarding invalid ID3 tag");
                        this.f17477c = false;
                        return;
                    } else {
                        this.f17475a.V(3);
                        this.f17479e = this.f17475a.G() + 10;
                    }
                }
            }
            int min2 = Math.min(a10, this.f17479e - this.f17480f);
            this.f17476b.a(e0Var, min2);
            this.f17480f += min2;
        }
    }

    @Override // i7.m
    public void c() {
        this.f17477c = false;
        this.f17478d = -9223372036854775807L;
    }

    @Override // i7.m
    public void d(y6.m mVar, i0.d dVar) {
        dVar.a();
        y6.b0 d10 = mVar.d(dVar.c(), 5);
        this.f17476b = d10;
        d10.c(new u1.b().U(dVar.b()).g0("application/id3").G());
    }

    @Override // i7.m
    public void e() {
        int i10;
        t8.a.i(this.f17476b);
        if (this.f17477c && (i10 = this.f17479e) != 0 && this.f17480f == i10) {
            long j10 = this.f17478d;
            if (j10 != -9223372036854775807L) {
                this.f17476b.b(j10, 1, i10, 0, null);
            }
            this.f17477c = false;
        }
    }

    @Override // i7.m
    public void f(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f17477c = true;
        if (j10 != -9223372036854775807L) {
            this.f17478d = j10;
        }
        this.f17479e = 0;
        this.f17480f = 0;
    }
}
