package x7;

import t8.s;
import v7.u0;
import x7.g;
import y6.b0;

/* loaded from: classes.dex */
public final class c implements g.b {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f30581a;

    /* renamed from: b, reason: collision with root package name */
    private final u0[] f30582b;

    public c(int[] iArr, u0[] u0VarArr) {
        this.f30581a = iArr;
        this.f30582b = u0VarArr;
    }

    public int[] a() {
        int[] iArr = new int[this.f30582b.length];
        int i10 = 0;
        while (true) {
            u0[] u0VarArr = this.f30582b;
            if (i10 >= u0VarArr.length) {
                return iArr;
            }
            iArr[i10] = u0VarArr[i10].G();
            i10++;
        }
    }

    public void b(long j10) {
        for (u0 u0Var : this.f30582b) {
            u0Var.a0(j10);
        }
    }

    @Override // x7.g.b
    public b0 d(int i10, int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.f30581a;
            if (i12 >= iArr.length) {
                s.c("BaseMediaChunkOutput", "Unmatched track of type: " + i11);
                return new y6.j();
            }
            if (i11 == iArr[i12]) {
                return this.f30582b[i12];
            }
            i12++;
        }
    }
}
