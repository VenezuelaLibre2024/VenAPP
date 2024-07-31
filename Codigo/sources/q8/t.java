package q8;

import android.util.Pair;
import java.util.Arrays;
import t6.d4;
import t6.r3;
import t6.s3;
import t8.r0;
import v7.a0;
import v7.d1;
import v7.f1;

/* loaded from: classes.dex */
public abstract class t extends a0 {

    /* renamed from: c, reason: collision with root package name */
    private a f23722c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f23723a;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f23724b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f23725c;

        /* renamed from: d, reason: collision with root package name */
        private final f1[] f23726d;

        /* renamed from: e, reason: collision with root package name */
        private final int[] f23727e;

        /* renamed from: f, reason: collision with root package name */
        private final int[][][] f23728f;

        /* renamed from: g, reason: collision with root package name */
        private final f1 f23729g;

        a(String[] strArr, int[] iArr, f1[] f1VarArr, int[] iArr2, int[][][] iArr3, f1 f1Var) {
            this.f23724b = strArr;
            this.f23725c = iArr;
            this.f23726d = f1VarArr;
            this.f23728f = iArr3;
            this.f23727e = iArr2;
            this.f23729g = f1Var;
            this.f23723a = iArr.length;
        }

        public int a(int i10, int i11, boolean z10) {
            int i12 = this.f23726d[i10].c(i11).f28288a;
            int[] iArr = new int[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                int g10 = g(i10, i11, i14);
                if (g10 == 4 || (z10 && g10 == 3)) {
                    iArr[i13] = i14;
                    i13++;
                }
            }
            return b(i10, i11, Arrays.copyOf(iArr, i13));
        }

        public int b(int i10, int i11, int[] iArr) {
            int i12 = 0;
            int i13 = 16;
            String str = null;
            boolean z10 = false;
            int i14 = 0;
            while (i12 < iArr.length) {
                String str2 = this.f23726d[i10].c(i11).d(iArr[i12]).f26517w;
                int i15 = i14 + 1;
                if (i14 == 0) {
                    str = str2;
                } else {
                    z10 |= !r0.c(str, str2);
                }
                i13 = Math.min(i13, r3.n(this.f23728f[i10][i11][i12]));
                i12++;
                i14 = i15;
            }
            return z10 ? Math.min(i13, this.f23727e[i10]) : i13;
        }

        public int c(int i10, int i11, int i12) {
            return this.f23728f[i10][i11][i12];
        }

        public int d() {
            return this.f23723a;
        }

        public int e(int i10) {
            return this.f23725c[i10];
        }

        public f1 f(int i10) {
            return this.f23726d[i10];
        }

        public int g(int i10, int i11, int i12) {
            return r3.F(c(i10, i11, i12));
        }

        public f1 h() {
            return this.f23729g;
        }
    }

    private static int i(r3[] r3VarArr, d1 d1Var, int[] iArr, boolean z10) {
        int length = r3VarArr.length;
        int i10 = 0;
        boolean z11 = true;
        for (int i11 = 0; i11 < r3VarArr.length; i11++) {
            r3 r3Var = r3VarArr[i11];
            int i12 = 0;
            for (int i13 = 0; i13 < d1Var.f28288a; i13++) {
                i12 = Math.max(i12, r3.F(r3Var.a(d1Var.d(i13))));
            }
            boolean z12 = iArr[i11] == 0;
            if (i12 > i10 || (i12 == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = i12;
            }
        }
        return length;
    }

    private static int[] j(r3 r3Var, d1 d1Var) {
        int[] iArr = new int[d1Var.f28288a];
        for (int i10 = 0; i10 < d1Var.f28288a; i10++) {
            iArr[i10] = r3Var.a(d1Var.d(i10));
        }
        return iArr;
    }

    private static int[] k(r3[] r3VarArr) {
        int length = r3VarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = r3VarArr[i10].y();
        }
        return iArr;
    }

    @Override // q8.a0
    public final void e(Object obj) {
        this.f23722c = (a) obj;
    }

    @Override // q8.a0
    public final b0 g(r3[] r3VarArr, f1 f1Var, a0.b bVar, d4 d4Var) {
        int[] iArr = new int[r3VarArr.length + 1];
        int length = r3VarArr.length + 1;
        d1[][] d1VarArr = new d1[length];
        int[][][] iArr2 = new int[r3VarArr.length + 1][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = f1Var.f28314a;
            d1VarArr[i10] = new d1[i11];
            iArr2[i10] = new int[i11];
        }
        int[] k10 = k(r3VarArr);
        for (int i12 = 0; i12 < f1Var.f28314a; i12++) {
            d1 c10 = f1Var.c(i12);
            int i13 = i(r3VarArr, c10, iArr, c10.f28290c == 5);
            int[] j10 = i13 == r3VarArr.length ? new int[c10.f28288a] : j(r3VarArr[i13], c10);
            int i14 = iArr[i13];
            d1VarArr[i13][i14] = c10;
            iArr2[i13][i14] = j10;
            iArr[i13] = i14 + 1;
        }
        f1[] f1VarArr = new f1[r3VarArr.length];
        String[] strArr = new String[r3VarArr.length];
        int[] iArr3 = new int[r3VarArr.length];
        for (int i15 = 0; i15 < r3VarArr.length; i15++) {
            int i16 = iArr[i15];
            f1VarArr[i15] = new f1((d1[]) r0.H0(d1VarArr[i15], i16));
            iArr2[i15] = (int[][]) r0.H0(iArr2[i15], i16);
            strArr[i15] = r3VarArr[i15].getName();
            iArr3[i15] = r3VarArr[i15].g();
        }
        a aVar = new a(strArr, iArr3, f1VarArr, k10, iArr2, new f1((d1[]) r0.H0(d1VarArr[r3VarArr.length], iArr[r3VarArr.length])));
        Pair<s3[], r[]> l10 = l(aVar, iArr2, k10, bVar, d4Var);
        return new b0((s3[]) l10.first, (r[]) l10.second, z.b(aVar, (u[]) l10.second), aVar);
    }

    protected abstract Pair<s3[], r[]> l(a aVar, int[][][] iArr, int[] iArr2, a0.b bVar, d4 d4Var);
}
