package j3;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final Map<h3.f, l<?>> f19698a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<h3.f, l<?>> f19699b = new HashMap();

    private Map<h3.f, l<?>> b(boolean z10) {
        return z10 ? this.f19699b : this.f19698a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l<?> a(h3.f fVar, boolean z10) {
        return b(z10).get(fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(h3.f fVar, l<?> lVar) {
        b(lVar.p()).put(fVar, lVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(h3.f fVar, l<?> lVar) {
        Map<h3.f, l<?>> b10 = b(lVar.p());
        if (lVar.equals(b10.get(fVar))) {
            b10.remove(fVar);
        }
    }
}
