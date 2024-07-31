package v8;

import java.util.ArrayList;
import java.util.zip.Inflater;
import t8.d0;
import t8.e0;
import t8.r0;
import v8.e;

/* loaded from: classes.dex */
final class f {
    public static e a(byte[] bArr, int i10) {
        ArrayList<e.a> arrayList;
        e0 e0Var = new e0(bArr);
        try {
            arrayList = c(e0Var) ? f(e0Var) : e(e0Var);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            return new e(arrayList.get(0), i10);
        }
        if (size != 2) {
            return null;
        }
        return new e(arrayList.get(0), arrayList.get(1), i10);
    }

    private static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >> 1);
    }

    private static boolean c(e0 e0Var) {
        e0Var.V(4);
        int q10 = e0Var.q();
        e0Var.U(0);
        return q10 == 1886547818;
    }

    private static e.a d(e0 e0Var) {
        int q10 = e0Var.q();
        if (q10 > 10000) {
            return null;
        }
        float[] fArr = new float[q10];
        for (int i10 = 0; i10 < q10; i10++) {
            fArr[i10] = e0Var.p();
        }
        int q11 = e0Var.q();
        if (q11 > 32000) {
            return null;
        }
        double d10 = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(q10 * 2.0d) / log);
        d0 d0Var = new d0(e0Var.e());
        int i11 = 8;
        d0Var.p(e0Var.f() * 8);
        float[] fArr2 = new float[q11 * 5];
        int i12 = 5;
        int[] iArr = new int[5];
        int i13 = 0;
        int i14 = 0;
        while (i13 < q11) {
            int i15 = 0;
            while (i15 < i12) {
                int b10 = iArr[i15] + b(d0Var.h(ceil));
                if (b10 >= q10 || b10 < 0) {
                    return null;
                }
                fArr2[i14] = fArr[b10];
                iArr[i15] = b10;
                i15++;
                i14++;
                i12 = 5;
            }
            i13++;
            i12 = 5;
        }
        d0Var.p((d0Var.e() + 7) & (-8));
        int i16 = 32;
        int h10 = d0Var.h(32);
        e.b[] bVarArr = new e.b[h10];
        int i17 = 0;
        while (i17 < h10) {
            int h11 = d0Var.h(i11);
            int h12 = d0Var.h(i11);
            int h13 = d0Var.h(i16);
            if (h13 > 128000) {
                return null;
            }
            int ceil2 = (int) Math.ceil(Math.log(q11 * d10) / log);
            float[] fArr3 = new float[h13 * 3];
            float[] fArr4 = new float[h13 * 2];
            int i18 = 0;
            for (int i19 = 0; i19 < h13; i19++) {
                i18 += b(d0Var.h(ceil2));
                if (i18 < 0 || i18 >= q11) {
                    return null;
                }
                int i20 = i19 * 3;
                int i21 = i18 * 5;
                fArr3[i20] = fArr2[i21];
                fArr3[i20 + 1] = fArr2[i21 + 1];
                fArr3[i20 + 2] = fArr2[i21 + 2];
                int i22 = i19 * 2;
                fArr4[i22] = fArr2[i21 + 3];
                fArr4[i22 + 1] = fArr2[i21 + 4];
            }
            bVarArr[i17] = new e.b(h11, fArr3, fArr4, h12);
            i17++;
            i16 = 32;
            d10 = 2.0d;
            i11 = 8;
        }
        return new e.a(bVarArr);
    }

    private static ArrayList<e.a> e(e0 e0Var) {
        if (e0Var.H() != 0) {
            return null;
        }
        e0Var.V(7);
        int q10 = e0Var.q();
        if (q10 == 1684433976) {
            e0 e0Var2 = new e0();
            Inflater inflater = new Inflater(true);
            try {
                if (!r0.q0(e0Var, e0Var2, inflater)) {
                    return null;
                }
                e0Var = e0Var2;
            } finally {
                inflater.end();
            }
        } else if (q10 != 1918990112) {
            return null;
        }
        return g(e0Var);
    }

    private static ArrayList<e.a> f(e0 e0Var) {
        int q10;
        e0Var.V(8);
        int f10 = e0Var.f();
        int g10 = e0Var.g();
        while (f10 < g10 && (q10 = e0Var.q() + f10) > f10 && q10 <= g10) {
            int q11 = e0Var.q();
            if (q11 == 2037673328 || q11 == 1836279920) {
                e0Var.T(q10);
                return e(e0Var);
            }
            e0Var.U(q10);
            f10 = q10;
        }
        return null;
    }

    private static ArrayList<e.a> g(e0 e0Var) {
        ArrayList<e.a> arrayList = new ArrayList<>();
        int f10 = e0Var.f();
        int g10 = e0Var.g();
        while (f10 < g10) {
            int q10 = e0Var.q() + f10;
            if (q10 <= f10 || q10 > g10) {
                return null;
            }
            if (e0Var.q() == 1835365224) {
                e.a d10 = d(e0Var);
                if (d10 == null) {
                    return null;
                }
                arrayList.add(d10);
            }
            e0Var.U(q10);
            f10 = q10;
        }
        return arrayList;
    }
}
