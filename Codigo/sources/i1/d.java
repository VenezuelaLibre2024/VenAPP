package i1;

import i1.a;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class d extends a {
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public d(a initialExtras) {
        n.e(initialExtras, "initialExtras");
        b().putAll(initialExtras.b());
    }

    public /* synthetic */ d(a aVar, int i10, g gVar) {
        this((i10 & 1) != 0 ? a.C0281a.f16871b : aVar);
    }

    @Override // i1.a
    public <T> T a(a.b<T> key) {
        n.e(key, "key");
        return (T) b().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void c(a.b<T> key, T t10) {
        n.e(key, "key");
        b().put(key, t10);
    }
}
