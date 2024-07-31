package p069dl;

import ck.C2029n;
import ck.C2037v;
import java.util.Arrays;
import kotlin.jvm.internal.C9322n;
import p069dl.AbstractC7046d;
import p124gk.Continuation;

/* renamed from: dl.b */
/* loaded from: classes3.dex */
public abstract class AbstractC7044b<S extends AbstractC7046d<?>> {

    /* renamed from: a */
    private S[] f15605a;

    /* renamed from: b */
    private int f15606b;

    /* renamed from: c */
    private int f15607c;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final S m20642b() {
        S s10;
        synchronized (this) {
            S[] sArr = this.f15605a;
            if (sArr == null) {
                sArr = mo10375d(2);
                this.f15605a = sArr;
            } else if (this.f15606b >= sArr.length) {
                Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                C9322n.m27780d(copyOf, "copyOf(this, newSize)");
                this.f15605a = (S[]) ((AbstractC7046d[]) copyOf);
                sArr = (S[]) ((AbstractC7046d[]) copyOf);
            }
            int i10 = this.f15607c;
            do {
                s10 = sArr[i10];
                if (s10 == null) {
                    s10 = mo10374c();
                    sArr[i10] = s10;
                }
                i10++;
                if (i10 >= sArr.length) {
                    i10 = 0;
                }
                C9322n.m27779c(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            } while (!s10.mo10382a(this));
            this.f15607c = i10;
            this.f15606b++;
        }
        return s10;
    }

    /* renamed from: c */
    protected abstract S mo10374c();

    /* renamed from: d */
    protected abstract S[] mo10375d(int i10);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final void m20643e(S s10) {
        int i10;
        Continuation<C2037v>[] mo10383b;
        synchronized (this) {
            int i11 = this.f15606b - 1;
            this.f15606b = i11;
            if (i11 == 0) {
                this.f15607c = 0;
            }
            C9322n.m27779c(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            mo10383b = s10.mo10383b(this);
        }
        for (Continuation<C2037v> continuation : mo10383b) {
            if (continuation != null) {
                C2029n.a aVar = C2029n.f8078b;
                continuation.resumeWith(C2029n.m10340b(C2037v.f8089a));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final S[] m20644f() {
        return this.f15605a;
    }
}
