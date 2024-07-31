package ca;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class k0 extends m0 {

    /* renamed from: f, reason: collision with root package name */
    private final Callable f6988f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ k0(Callable callable, j0 j0Var) {
        super();
        this.f6988f = callable;
    }

    @Override // ca.m0
    final String a() {
        try {
            return (String) this.f6988f.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
