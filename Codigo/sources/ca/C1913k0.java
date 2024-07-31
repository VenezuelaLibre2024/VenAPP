package ca;

import java.util.concurrent.Callable;

/* renamed from: ca.k0 */
/* loaded from: classes.dex */
final class C1913k0 extends C1917m0 {

    /* renamed from: f */
    private final Callable f7937f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1913k0(Callable callable, C1911j0 c1911j0) {
        super();
        this.f7937f = callable;
    }

    @Override // ca.C1917m0
    /* renamed from: a */
    final String mo10107a() {
        try {
            return (String) this.f7937f.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
