package dl;

import ck.n;
import ck.v;
import dl.d;
import gk.Continuation;
import java.util.Arrays;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public abstract class b<S extends d<?>> {

    /* renamed from: a, reason: collision with root package name */
    private S[] f14247a;

    /* renamed from: b, reason: collision with root package name */
    private int f14248b;

    /* renamed from: c, reason: collision with root package name */
    private int f14249c;

    /* JADX INFO: Access modifiers changed from: protected */
    public final S b() {
        S s10;
        synchronized (this) {
            S[] sArr = this.f14247a;
            if (sArr == null) {
                sArr = d(2);
                this.f14247a = sArr;
            } else if (this.f14248b >= sArr.length) {
                Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                n.d(copyOf, "copyOf(this, newSize)");
                this.f14247a = (S[]) ((d[]) copyOf);
                sArr = (S[]) ((d[]) copyOf);
            }
            int i10 = this.f14249c;
            do {
                s10 = sArr[i10];
                if (s10 == null) {
                    s10 = c();
                    sArr[i10] = s10;
                }
                i10++;
                if (i10 >= sArr.length) {
                    i10 = 0;
                }
                n.c(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            } while (!s10.a(this));
            this.f14249c = i10;
            this.f14248b++;
        }
        return s10;
    }

    protected abstract S c();

    protected abstract S[] d(int i10);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(S s10) {
        int i10;
        Continuation<v>[] b10;
        synchronized (this) {
            int i11 = this.f14248b - 1;
            this.f14248b = i11;
            if (i11 == 0) {
                this.f14249c = 0;
            }
            n.c(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            b10 = s10.b(this);
        }
        for (Continuation<v> continuation : b10) {
            if (continuation != null) {
                n.a aVar = ck.n.f7126b;
                continuation.resumeWith(ck.n.b(v.f7137a));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final S[] f() {
        return this.f14247a;
    }
}
