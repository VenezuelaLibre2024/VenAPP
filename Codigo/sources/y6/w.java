package y6;

import java.io.EOFException;
import q7.h;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final t8.e0 f31790a = new t8.e0(10);

    public l7.a a(l lVar, h.a aVar) {
        l7.a aVar2 = null;
        int i10 = 0;
        while (true) {
            try {
                lVar.q(this.f31790a.e(), 0, 10);
                this.f31790a.U(0);
                if (this.f31790a.K() != 4801587) {
                    break;
                }
                this.f31790a.V(3);
                int G = this.f31790a.G();
                int i11 = G + 10;
                if (aVar2 == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f31790a.e(), 0, bArr, 0, 10);
                    lVar.q(bArr, 10, G);
                    aVar2 = new q7.h(aVar).e(bArr, i11);
                } else {
                    lVar.k(G);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        lVar.f();
        lVar.k(i10);
        return aVar2;
    }
}
