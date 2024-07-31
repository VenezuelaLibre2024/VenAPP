package h7;

import com.google.common.collect.w;
import h7.i;
import java.util.Arrays;
import java.util.List;
import t6.u1;
import t8.e0;
import v6.t0;

/* loaded from: classes.dex */
final class h extends i {

    /* renamed from: o, reason: collision with root package name */
    private static final byte[] f16509o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    private static final byte[] f16510p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    private boolean f16511n;

    private static boolean n(e0 e0Var, byte[] bArr) {
        if (e0Var.a() < bArr.length) {
            return false;
        }
        int f10 = e0Var.f();
        byte[] bArr2 = new byte[bArr.length];
        e0Var.l(bArr2, 0, bArr.length);
        e0Var.U(f10);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean o(e0 e0Var) {
        return n(e0Var, f16509o);
    }

    @Override // h7.i
    protected long f(e0 e0Var) {
        return c(t0.e(e0Var.e()));
    }

    @Override // h7.i
    protected boolean h(e0 e0Var, long j10, i.b bVar) {
        u1.b Z;
        if (n(e0Var, f16509o)) {
            byte[] copyOf = Arrays.copyOf(e0Var.e(), e0Var.g());
            int c10 = t0.c(copyOf);
            List<byte[]> a10 = t0.a(copyOf);
            if (bVar.f16525a != null) {
                return true;
            }
            Z = new u1.b().g0("audio/opus").J(c10).h0(48000).V(a10);
        } else {
            byte[] bArr = f16510p;
            if (!n(e0Var, bArr)) {
                t8.a.i(bVar.f16525a);
                return false;
            }
            t8.a.i(bVar.f16525a);
            if (this.f16511n) {
                return true;
            }
            this.f16511n = true;
            e0Var.V(bArr.length);
            l7.a c11 = y6.e0.c(w.s(y6.e0.j(e0Var, false, false).f31730b));
            if (c11 == null) {
                return true;
            }
            Z = bVar.f16525a.c().Z(c11.b(bVar.f16525a.f26515u));
        }
        bVar.f16525a = Z.G();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h7.i
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f16511n = false;
        }
    }
}
