package yg;

import java.util.Formatter;

/* loaded from: classes2.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private final a f31865a;

    /* renamed from: b, reason: collision with root package name */
    private final g[] f31866b;

    /* renamed from: c, reason: collision with root package name */
    private c f31867c;

    /* renamed from: d, reason: collision with root package name */
    private final int f31868d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(a aVar, c cVar) {
        this.f31865a = aVar;
        int a10 = aVar.a();
        this.f31868d = a10;
        this.f31867c = cVar;
        this.f31866b = new g[a10 + 2];
    }

    private void a(g gVar) {
        if (gVar != null) {
            ((h) gVar).g(this.f31865a);
        }
    }

    private static boolean b(d dVar, d dVar2) {
        if (dVar2 == null || !dVar2.g() || dVar2.a() != dVar.a()) {
            return false;
        }
        dVar.i(dVar2.c());
        return true;
    }

    private static int c(int i10, int i11, d dVar) {
        if (dVar == null || dVar.g()) {
            return i11;
        }
        if (!dVar.h(i10)) {
            return i11 + 1;
        }
        dVar.i(i10);
        return 0;
    }

    private int d() {
        int f10 = f();
        if (f10 == 0) {
            return 0;
        }
        for (int i10 = 1; i10 < this.f31868d + 1; i10++) {
            d[] d10 = this.f31866b[i10].d();
            for (int i11 = 0; i11 < d10.length; i11++) {
                d dVar = d10[i11];
                if (dVar != null && !dVar.g()) {
                    e(i10, i11, d10);
                }
            }
        }
        return f10;
    }

    private void e(int i10, int i11, d[] dVarArr) {
        d dVar = dVarArr[i11];
        d[] d10 = this.f31866b[i10 - 1].d();
        g gVar = this.f31866b[i10 + 1];
        d[] d11 = gVar != null ? gVar.d() : d10;
        d[] dVarArr2 = new d[14];
        dVarArr2[2] = d10[i11];
        dVarArr2[3] = d11[i11];
        if (i11 > 0) {
            int i12 = i11 - 1;
            dVarArr2[0] = dVarArr[i12];
            dVarArr2[4] = d10[i12];
            dVarArr2[5] = d11[i12];
        }
        if (i11 > 1) {
            int i13 = i11 - 2;
            dVarArr2[8] = dVarArr[i13];
            dVarArr2[10] = d10[i13];
            dVarArr2[11] = d11[i13];
        }
        if (i11 < dVarArr.length - 1) {
            int i14 = i11 + 1;
            dVarArr2[1] = dVarArr[i14];
            dVarArr2[6] = d10[i14];
            dVarArr2[7] = d11[i14];
        }
        if (i11 < dVarArr.length - 2) {
            int i15 = i11 + 2;
            dVarArr2[9] = dVarArr[i15];
            dVarArr2[12] = d10[i15];
            dVarArr2[13] = d11[i15];
        }
        for (int i16 = 0; i16 < 14 && !b(dVar, dVarArr2[i16]); i16++) {
        }
    }

    private int f() {
        g();
        return h() + i();
    }

    private void g() {
        g[] gVarArr = this.f31866b;
        g gVar = gVarArr[0];
        if (gVar == null || gVarArr[this.f31868d + 1] == null) {
            return;
        }
        d[] d10 = gVar.d();
        d[] d11 = this.f31866b[this.f31868d + 1].d();
        for (int i10 = 0; i10 < d10.length; i10++) {
            d dVar = d10[i10];
            if (dVar != null && d11[i10] != null && dVar.c() == d11[i10].c()) {
                for (int i11 = 1; i11 <= this.f31868d; i11++) {
                    d dVar2 = this.f31866b[i11].d()[i10];
                    if (dVar2 != null) {
                        dVar2.i(d10[i10].c());
                        if (!dVar2.g()) {
                            this.f31866b[i11].d()[i10] = null;
                        }
                    }
                }
            }
        }
    }

    private int h() {
        g gVar = this.f31866b[0];
        if (gVar == null) {
            return 0;
        }
        d[] d10 = gVar.d();
        int i10 = 0;
        for (int i11 = 0; i11 < d10.length; i11++) {
            d dVar = d10[i11];
            if (dVar != null) {
                int c10 = dVar.c();
                int i12 = 0;
                for (int i13 = 1; i13 < this.f31868d + 1 && i12 < 2; i13++) {
                    d dVar2 = this.f31866b[i13].d()[i11];
                    if (dVar2 != null) {
                        i12 = c(c10, i12, dVar2);
                        if (!dVar2.g()) {
                            i10++;
                        }
                    }
                }
            }
        }
        return i10;
    }

    private int i() {
        g[] gVarArr = this.f31866b;
        int i10 = this.f31868d;
        if (gVarArr[i10 + 1] == null) {
            return 0;
        }
        d[] d10 = gVarArr[i10 + 1].d();
        int i11 = 0;
        for (int i12 = 0; i12 < d10.length; i12++) {
            d dVar = d10[i12];
            if (dVar != null) {
                int c10 = dVar.c();
                int i13 = 0;
                for (int i14 = this.f31868d + 1; i14 > 0 && i13 < 2; i14--) {
                    d dVar2 = this.f31866b[i14].d()[i12];
                    if (dVar2 != null) {
                        i13 = c(c10, i13, dVar2);
                        if (!dVar2.g()) {
                            i11++;
                        }
                    }
                }
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.f31868d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.f31865a.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l() {
        return this.f31865a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c m() {
        return this.f31867c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g n(int i10) {
        return this.f31866b[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g[] o() {
        a(this.f31866b[0]);
        a(this.f31866b[this.f31868d + 1]);
        int i10 = 928;
        while (true) {
            int d10 = d();
            if (d10 <= 0 || d10 >= i10) {
                break;
            }
            i10 = d10;
        }
        return this.f31866b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(c cVar) {
        this.f31867c = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(int i10, g gVar) {
        this.f31866b[i10] = gVar;
    }

    public String toString() {
        g[] gVarArr = this.f31866b;
        g gVar = gVarArr[0];
        if (gVar == null) {
            gVar = gVarArr[this.f31868d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i10 = 0; i10 < gVar.d().length; i10++) {
            try {
                formatter.format("CW %3d:", Integer.valueOf(i10));
                for (int i11 = 0; i11 < this.f31868d + 2; i11++) {
                    g gVar2 = this.f31866b[i11];
                    if (gVar2 == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        d dVar = gVar2.d()[i10];
                        if (dVar == null) {
                            formatter.format("    |   ", new Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", Integer.valueOf(dVar.c()), Integer.valueOf(dVar.e()));
                        }
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        formatter.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
