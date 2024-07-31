package y6;

/* loaded from: classes.dex */
public final class b {
    public static void a(long j10, t8.e0 e0Var, b0[] b0VarArr) {
        while (true) {
            if (e0Var.a() <= 1) {
                return;
            }
            int c10 = c(e0Var);
            int c11 = c(e0Var);
            int f10 = e0Var.f() + c11;
            if (c11 == -1 || c11 > e0Var.a()) {
                t8.s.i("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                f10 = e0Var.g();
            } else if (c10 == 4 && c11 >= 8) {
                int H = e0Var.H();
                int N = e0Var.N();
                int q10 = N == 49 ? e0Var.q() : 0;
                int H2 = e0Var.H();
                if (N == 47) {
                    e0Var.V(1);
                }
                boolean z10 = H == 181 && (N == 49 || N == 47) && H2 == 3;
                if (N == 49) {
                    z10 &= q10 == 1195456820;
                }
                if (z10) {
                    b(j10, e0Var, b0VarArr);
                }
            }
            e0Var.U(f10);
        }
    }

    public static void b(long j10, t8.e0 e0Var, b0[] b0VarArr) {
        int H = e0Var.H();
        if ((H & 64) != 0) {
            e0Var.V(1);
            int i10 = (H & 31) * 3;
            int f10 = e0Var.f();
            for (b0 b0Var : b0VarArr) {
                e0Var.U(f10);
                b0Var.a(e0Var, i10);
                if (j10 != -9223372036854775807L) {
                    b0Var.b(j10, 1, i10, 0, null);
                }
            }
        }
    }

    private static int c(t8.e0 e0Var) {
        int i10 = 0;
        while (e0Var.a() != 0) {
            int H = e0Var.H();
            i10 += H;
            if (H != 255) {
                return i10;
            }
        }
        return -1;
    }
}
