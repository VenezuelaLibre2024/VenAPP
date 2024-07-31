package p067dh;

import p066dg.C6958s;

/* renamed from: dh.i */
/* loaded from: classes2.dex */
public final class C6970i {

    /* renamed from: a */
    private final boolean f15527a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6970i(boolean z10) {
        this.f15527a = z10;
    }

    /* renamed from: a */
    public void m20155a(C6958s[] c6958sArr) {
        if (!this.f15527a || c6958sArr == null || c6958sArr.length < 3) {
            return;
        }
        C6958s c6958s = c6958sArr[0];
        c6958sArr[0] = c6958sArr[2];
        c6958sArr[2] = c6958s;
    }
}
