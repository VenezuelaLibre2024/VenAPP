package j7;

import android.util.Pair;
import t6.b3;
import t8.e0;
import t8.r0;
import t8.s;
import y6.l;

/* loaded from: classes.dex */
final class d {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f19801a;

        /* renamed from: b, reason: collision with root package name */
        public final long f19802b;

        private a(int i10, long j10) {
            this.f19801a = i10;
            this.f19802b = j10;
        }

        public static a a(l lVar, e0 e0Var) {
            lVar.q(e0Var.e(), 0, 8);
            e0Var.U(0);
            return new a(e0Var.q(), e0Var.x());
        }
    }

    public static boolean a(l lVar) {
        e0 e0Var = new e0(8);
        int i10 = a.a(lVar, e0Var).f19801a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        lVar.q(e0Var.e(), 0, 4);
        e0Var.U(0);
        int q10 = e0Var.q();
        if (q10 == 1463899717) {
            return true;
        }
        s.c("WavHeaderReader", "Unsupported form type: " + q10);
        return false;
    }

    public static c b(l lVar) {
        byte[] bArr;
        e0 e0Var = new e0(16);
        a d10 = d(1718449184, lVar, e0Var);
        t8.a.g(d10.f19802b >= 16);
        lVar.q(e0Var.e(), 0, 16);
        e0Var.U(0);
        int z10 = e0Var.z();
        int z11 = e0Var.z();
        int y10 = e0Var.y();
        int y11 = e0Var.y();
        int z12 = e0Var.z();
        int z13 = e0Var.z();
        int i10 = ((int) d10.f19802b) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            lVar.q(bArr2, 0, i10);
            bArr = bArr2;
        } else {
            bArr = r0.f26749f;
        }
        lVar.n((int) (lVar.i() - lVar.getPosition()));
        return new c(z10, z11, y10, y11, z12, z13, bArr);
    }

    public static long c(l lVar) {
        e0 e0Var = new e0(8);
        a a10 = a.a(lVar, e0Var);
        if (a10.f19801a != 1685272116) {
            lVar.f();
            return -1L;
        }
        lVar.k(8);
        e0Var.U(0);
        lVar.q(e0Var.e(), 0, 8);
        long v10 = e0Var.v();
        lVar.n(((int) a10.f19802b) + 8);
        return v10;
    }

    private static a d(int i10, l lVar, e0 e0Var) {
        while (true) {
            a a10 = a.a(lVar, e0Var);
            if (a10.f19801a == i10) {
                return a10;
            }
            s.i("WavHeaderReader", "Ignoring unknown WAV chunk: " + a10.f19801a);
            long j10 = a10.f19802b + 8;
            if (j10 > 2147483647L) {
                throw b3.e("Chunk is too large (~2GB+) to skip; id: " + a10.f19801a);
            }
            lVar.n((int) j10);
        }
    }

    public static Pair<Long, Long> e(l lVar) {
        lVar.f();
        a d10 = d(1684108385, lVar, new e0(8));
        lVar.n(8);
        return Pair.create(Long.valueOf(lVar.getPosition()), Long.valueOf(d10.f19802b));
    }
}
