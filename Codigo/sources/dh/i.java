package dh;

import dg.s;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f14169a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(boolean z10) {
        this.f14169a = z10;
    }

    public void a(s[] sVarArr) {
        if (!this.f14169a || sVarArr == null || sVarArr.length < 3) {
            return;
        }
        s sVar = sVarArr[0];
        sVarArr[0] = sVarArr[2];
        sVarArr[2] = sVar;
    }
}
