package h7;

import h7.i;
import java.util.Arrays;
import t8.e0;
import t8.r0;
import y6.l;
import y6.q;
import y6.r;
import y6.s;
import y6.t;
import y6.z;

/* loaded from: classes.dex */
final class b extends i {

    /* renamed from: n, reason: collision with root package name */
    private t f16483n;

    /* renamed from: o, reason: collision with root package name */
    private a f16484o;

    /* loaded from: classes.dex */
    private static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        private t f16485a;

        /* renamed from: b, reason: collision with root package name */
        private t.a f16486b;

        /* renamed from: c, reason: collision with root package name */
        private long f16487c = -1;

        /* renamed from: d, reason: collision with root package name */
        private long f16488d = -1;

        public a(t tVar, t.a aVar) {
            this.f16485a = tVar;
            this.f16486b = aVar;
        }

        @Override // h7.g
        public long a(l lVar) {
            long j10 = this.f16488d;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.f16488d = -1L;
            return j11;
        }

        @Override // h7.g
        public z b() {
            t8.a.g(this.f16487c != -1);
            return new s(this.f16485a, this.f16487c);
        }

        @Override // h7.g
        public void c(long j10) {
            long[] jArr = this.f16486b.f31784a;
            this.f16488d = jArr[r0.i(jArr, j10, true, true)];
        }

        public void d(long j10) {
            this.f16487c = j10;
        }
    }

    private int n(e0 e0Var) {
        int i10 = (e0Var.e()[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            e0Var.V(4);
            e0Var.O();
        }
        int j10 = q.j(e0Var, i10);
        e0Var.U(0);
        return j10;
    }

    private static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(e0 e0Var) {
        return e0Var.a() >= 5 && e0Var.H() == 127 && e0Var.J() == 1179402563;
    }

    @Override // h7.i
    protected long f(e0 e0Var) {
        if (o(e0Var.e())) {
            return n(e0Var);
        }
        return -1L;
    }

    @Override // h7.i
    protected boolean h(e0 e0Var, long j10, i.b bVar) {
        byte[] e10 = e0Var.e();
        t tVar = this.f16483n;
        if (tVar == null) {
            t tVar2 = new t(e10, 17);
            this.f16483n = tVar2;
            bVar.f16525a = tVar2.g(Arrays.copyOfRange(e10, 9, e0Var.g()), null);
            return true;
        }
        if ((e10[0] & Byte.MAX_VALUE) == 3) {
            t.a f10 = r.f(e0Var);
            t b10 = tVar.b(f10);
            this.f16483n = b10;
            this.f16484o = new a(b10, f10);
            return true;
        }
        if (!o(e10)) {
            return true;
        }
        a aVar = this.f16484o;
        if (aVar != null) {
            aVar.d(j10);
            bVar.f16526b = this.f16484o;
        }
        t8.a.e(bVar.f16525a);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h7.i
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f16483n = null;
            this.f16484o = null;
        }
    }
}
