package d7;

import y6.a0;
import y6.b0;
import y6.m;
import y6.z;

/* loaded from: classes.dex */
public final class d implements m {

    /* renamed from: a, reason: collision with root package name */
    private final long f13819a;

    /* renamed from: b, reason: collision with root package name */
    private final m f13820b;

    /* loaded from: classes.dex */
    class a implements z {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z f13821a;

        a(z zVar) {
            this.f13821a = zVar;
        }

        @Override // y6.z
        public z.a d(long j10) {
            z.a d10 = this.f13821a.d(j10);
            a0 a0Var = d10.f31796a;
            a0 a0Var2 = new a0(a0Var.f31687a, a0Var.f31688b + d.this.f13819a);
            a0 a0Var3 = d10.f31797b;
            return new z.a(a0Var2, new a0(a0Var3.f31687a, a0Var3.f31688b + d.this.f13819a));
        }

        @Override // y6.z
        public boolean h() {
            return this.f13821a.h();
        }

        @Override // y6.z
        public long i() {
            return this.f13821a.i();
        }
    }

    public d(long j10, m mVar) {
        this.f13819a = j10;
        this.f13820b = mVar;
    }

    @Override // y6.m
    public b0 d(int i10, int i11) {
        return this.f13820b.d(i10, i11);
    }

    @Override // y6.m
    public void p(z zVar) {
        this.f13820b.p(new a(zVar));
    }

    @Override // y6.m
    public void q() {
        this.f13820b.q();
    }
}
