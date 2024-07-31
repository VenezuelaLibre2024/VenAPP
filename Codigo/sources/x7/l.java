package x7;

import java.util.Arrays;
import t6.u1;
import t8.r0;

/* loaded from: classes.dex */
public abstract class l extends f {

    /* renamed from: j, reason: collision with root package name */
    private byte[] f30638j;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f30639k;

    public l(s8.j jVar, s8.n nVar, int i10, u1 u1Var, int i11, Object obj, byte[] bArr) {
        super(jVar, nVar, i10, u1Var, i11, obj, -9223372036854775807L, -9223372036854775807L);
        l lVar;
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = r0.f26749f;
            lVar = this;
        } else {
            lVar = this;
            bArr2 = bArr;
        }
        lVar.f30638j = bArr2;
    }

    private void i(int i10) {
        byte[] bArr = this.f30638j;
        if (bArr.length < i10 + 16384) {
            this.f30638j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    @Override // s8.e0.e
    public final void b() {
        try {
            this.f30609i.o(this.f30602b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f30639k) {
                i(i11);
                i10 = this.f30609i.read(this.f30638j, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f30639k) {
                g(this.f30638j, i11);
            }
        } finally {
            s8.m.a(this.f30609i);
        }
    }

    @Override // s8.e0.e
    public final void c() {
        this.f30639k = true;
    }

    protected abstract void g(byte[] bArr, int i10);

    public byte[] h() {
        return this.f30638j;
    }
}
