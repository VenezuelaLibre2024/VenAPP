package mg;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final a f21503a;

    public c(a aVar) {
        this.f21503a = aVar;
    }

    private int[] b(b bVar) {
        int f10 = bVar.f();
        int i10 = 0;
        if (f10 == 1) {
            return new int[]{bVar.d(1)};
        }
        int[] iArr = new int[f10];
        for (int i11 = 1; i11 < this.f21503a.f() && i10 < f10; i11++) {
            if (bVar.c(i11) == 0) {
                iArr[i10] = this.f21503a.h(i11);
                i10++;
            }
        }
        if (i10 == f10) {
            return iArr;
        }
        throw new e("Error locator degree does not match number of roots");
    }

    private int[] c(b bVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            int h10 = this.f21503a.h(iArr[i10]);
            int i11 = 1;
            for (int i12 = 0; i12 < length; i12++) {
                if (i10 != i12) {
                    int j10 = this.f21503a.j(iArr[i12], h10);
                    i11 = this.f21503a.j(i11, (j10 & 1) == 0 ? j10 | 1 : j10 & (-2));
                }
            }
            iArr2[i10] = this.f21503a.j(bVar.c(h10), this.f21503a.h(i11));
            if (this.f21503a.d() != 0) {
                iArr2[i10] = this.f21503a.j(iArr2[i10], h10);
            }
        }
        return iArr2;
    }

    private b[] d(b bVar, b bVar2, int i10) {
        if (bVar.f() < bVar2.f()) {
            bVar2 = bVar;
            bVar = bVar2;
        }
        b g10 = this.f21503a.g();
        b e10 = this.f21503a.e();
        do {
            b bVar3 = bVar2;
            bVar2 = bVar;
            bVar = bVar3;
            b bVar4 = e10;
            b bVar5 = g10;
            g10 = bVar4;
            if (bVar.f() * 2 < i10) {
                int d10 = g10.d(0);
                if (d10 == 0) {
                    throw new e("sigmaTilde(0) was zero");
                }
                int h10 = this.f21503a.h(d10);
                return new b[]{g10.h(h10), bVar.h(h10)};
            }
            if (bVar.g()) {
                throw new e("r_{i-1} was zero");
            }
            b g11 = this.f21503a.g();
            int h11 = this.f21503a.h(bVar.d(bVar.f()));
            while (bVar2.f() >= bVar.f() && !bVar2.g()) {
                int f10 = bVar2.f() - bVar.f();
                int j10 = this.f21503a.j(bVar2.d(bVar2.f()), h11);
                g11 = g11.a(this.f21503a.b(f10, j10));
                bVar2 = bVar2.a(bVar.j(f10, j10));
            }
            e10 = g11.i(g10).a(bVar5);
        } while (bVar2.f() < bVar.f());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + bVar2 + ", rLast: " + bVar);
    }

    public void a(int[] iArr, int i10) {
        b bVar = new b(this.f21503a, iArr);
        int[] iArr2 = new int[i10];
        boolean z10 = true;
        for (int i11 = 0; i11 < i10; i11++) {
            a aVar = this.f21503a;
            int c10 = bVar.c(aVar.c(aVar.d() + i11));
            iArr2[(i10 - 1) - i11] = c10;
            if (c10 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            return;
        }
        b[] d10 = d(this.f21503a.b(i10, 1), new b(this.f21503a, iArr2), i10);
        b bVar2 = d10[0];
        b bVar3 = d10[1];
        int[] b10 = b(bVar2);
        int[] c11 = c(bVar3, b10);
        for (int i12 = 0; i12 < b10.length; i12++) {
            int length = (iArr.length - 1) - this.f21503a.i(b10[i12]);
            if (length < 0) {
                throw new e("Bad error location");
            }
            iArr[length] = a.a(iArr[length], c11[i12]);
        }
    }
}
