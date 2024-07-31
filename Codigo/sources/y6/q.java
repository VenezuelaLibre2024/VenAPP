package y6;

import com.facebook.ads.AdError;
import com.google.android.libraries.barhopper.RecognitionOptions;
import t6.b3;
import t8.r0;

/* loaded from: classes.dex */
public final class q {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f31768a;
    }

    private static boolean a(t8.e0 e0Var, t tVar, int i10) {
        int j10 = j(e0Var, i10);
        return j10 != -1 && j10 <= tVar.f31773b;
    }

    private static boolean b(t8.e0 e0Var, int i10) {
        return e0Var.H() == r0.u(e0Var.e(), i10, e0Var.f() - 1, 0);
    }

    private static boolean c(t8.e0 e0Var, t tVar, boolean z10, a aVar) {
        try {
            long O = e0Var.O();
            if (!z10) {
                O *= tVar.f31773b;
            }
            aVar.f31768a = O;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(t8.e0 e0Var, t tVar, int i10, a aVar) {
        int f10 = e0Var.f();
        long J = e0Var.J();
        long j10 = J >>> 16;
        if (j10 != i10) {
            return false;
        }
        return g((int) ((J >> 4) & 15), tVar) && f((int) ((J >> 1) & 7), tVar) && !(((J & 1) > 1L ? 1 : ((J & 1) == 1L ? 0 : -1)) == 0) && c(e0Var, tVar, ((j10 & 1) > 1L ? 1 : ((j10 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(e0Var, tVar, (int) ((J >> 12) & 15)) && e(e0Var, tVar, (int) ((J >> 8) & 15)) && b(e0Var, f10);
    }

    private static boolean e(t8.e0 e0Var, t tVar, int i10) {
        int i11 = tVar.f31776e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == tVar.f31777f;
        }
        if (i10 == 12) {
            return e0Var.H() * AdError.NETWORK_ERROR_CODE == i11;
        }
        if (i10 > 14) {
            return false;
        }
        int N = e0Var.N();
        if (i10 == 14) {
            N *= 10;
        }
        return N == i11;
    }

    private static boolean f(int i10, t tVar) {
        return i10 == 0 || i10 == tVar.f31780i;
    }

    private static boolean g(int i10, t tVar) {
        return i10 <= 7 ? i10 == tVar.f31778g - 1 : i10 <= 10 && tVar.f31778g == 2;
    }

    public static boolean h(l lVar, t tVar, int i10, a aVar) {
        long i11 = lVar.i();
        byte[] bArr = new byte[2];
        lVar.q(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            lVar.f();
            lVar.k((int) (i11 - lVar.getPosition()));
            return false;
        }
        t8.e0 e0Var = new t8.e0(16);
        System.arraycopy(bArr, 0, e0Var.e(), 0, 2);
        e0Var.T(n.c(lVar, e0Var.e(), 2, 14));
        lVar.f();
        lVar.k((int) (i11 - lVar.getPosition()));
        return d(e0Var, tVar, i10, aVar);
    }

    public static long i(l lVar, t tVar) {
        lVar.f();
        lVar.k(1);
        byte[] bArr = new byte[1];
        lVar.q(bArr, 0, 1);
        boolean z10 = (bArr[0] & 1) == 1;
        lVar.k(2);
        int i10 = z10 ? 7 : 6;
        t8.e0 e0Var = new t8.e0(i10);
        e0Var.T(n.c(lVar, e0Var.e(), 0, i10));
        lVar.f();
        a aVar = new a();
        if (c(e0Var, tVar, z10, aVar)) {
            return aVar.f31768a;
        }
        throw b3.a(null, null);
    }

    public static int j(t8.e0 e0Var, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return e0Var.H() + 1;
            case 7:
                return e0Var.N() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return RecognitionOptions.QR_CODE << (i10 - 8);
            default:
                return -1;
        }
    }
}
