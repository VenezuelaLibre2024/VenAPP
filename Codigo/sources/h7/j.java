package h7;

import com.google.common.collect.w;
import h7.i;
import java.util.ArrayList;
import java.util.Arrays;
import t6.b3;
import t6.u1;
import y6.e0;

/* loaded from: classes.dex */
final class j extends i {

    /* renamed from: n, reason: collision with root package name */
    private a f16527n;

    /* renamed from: o, reason: collision with root package name */
    private int f16528o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f16529p;

    /* renamed from: q, reason: collision with root package name */
    private e0.d f16530q;

    /* renamed from: r, reason: collision with root package name */
    private e0.b f16531r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final e0.d f16532a;

        /* renamed from: b, reason: collision with root package name */
        public final e0.b f16533b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f16534c;

        /* renamed from: d, reason: collision with root package name */
        public final e0.c[] f16535d;

        /* renamed from: e, reason: collision with root package name */
        public final int f16536e;

        public a(e0.d dVar, e0.b bVar, byte[] bArr, e0.c[] cVarArr, int i10) {
            this.f16532a = dVar;
            this.f16533b = bVar;
            this.f16534c = bArr;
            this.f16535d = cVarArr;
            this.f16536e = i10;
        }
    }

    static void n(t8.e0 e0Var, long j10) {
        if (e0Var.b() < e0Var.g() + 4) {
            e0Var.R(Arrays.copyOf(e0Var.e(), e0Var.g() + 4));
        } else {
            e0Var.T(e0Var.g() + 4);
        }
        byte[] e10 = e0Var.e();
        e10[e0Var.g() - 4] = (byte) (j10 & 255);
        e10[e0Var.g() - 3] = (byte) ((j10 >>> 8) & 255);
        e10[e0Var.g() - 2] = (byte) ((j10 >>> 16) & 255);
        e10[e0Var.g() - 1] = (byte) ((j10 >>> 24) & 255);
    }

    private static int o(byte b10, a aVar) {
        return !aVar.f16535d[p(b10, aVar.f16536e, 1)].f31732a ? aVar.f16532a.f31742g : aVar.f16532a.f31743h;
    }

    static int p(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static boolean r(t8.e0 e0Var) {
        try {
            return e0.m(1, e0Var, true);
        } catch (b3 unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h7.i
    public void e(long j10) {
        super.e(j10);
        this.f16529p = j10 != 0;
        e0.d dVar = this.f16530q;
        this.f16528o = dVar != null ? dVar.f31742g : 0;
    }

    @Override // h7.i
    protected long f(t8.e0 e0Var) {
        if ((e0Var.e()[0] & 1) == 1) {
            return -1L;
        }
        int o10 = o(e0Var.e()[0], (a) t8.a.i(this.f16527n));
        long j10 = this.f16529p ? (this.f16528o + o10) / 4 : 0;
        n(e0Var, j10);
        this.f16529p = true;
        this.f16528o = o10;
        return j10;
    }

    @Override // h7.i
    protected boolean h(t8.e0 e0Var, long j10, i.b bVar) {
        if (this.f16527n != null) {
            t8.a.e(bVar.f16525a);
            return false;
        }
        a q10 = q(e0Var);
        this.f16527n = q10;
        if (q10 == null) {
            return true;
        }
        e0.d dVar = q10.f16532a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f31745j);
        arrayList.add(q10.f16534c);
        bVar.f16525a = new u1.b().g0("audio/vorbis").I(dVar.f31740e).b0(dVar.f31739d).J(dVar.f31737b).h0(dVar.f31738c).V(arrayList).Z(e0.c(w.s(q10.f16533b.f31730b))).G();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h7.i
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f16527n = null;
            this.f16530q = null;
            this.f16531r = null;
        }
        this.f16528o = 0;
        this.f16529p = false;
    }

    a q(t8.e0 e0Var) {
        e0.d dVar = this.f16530q;
        if (dVar == null) {
            this.f16530q = e0.k(e0Var);
            return null;
        }
        e0.b bVar = this.f16531r;
        if (bVar == null) {
            this.f16531r = e0.i(e0Var);
            return null;
        }
        byte[] bArr = new byte[e0Var.g()];
        System.arraycopy(e0Var.e(), 0, bArr, 0, e0Var.g());
        return new a(dVar, bVar, bArr, e0.l(e0Var, dVar.f31737b), e0.a(r4.length - 1));
    }
}
