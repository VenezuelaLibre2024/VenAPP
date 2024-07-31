package aj;

import aj.a;
import aj.b;
import aj.c;

/* loaded from: classes3.dex */
public abstract class a<S extends a<S>> extends b<S> {
    /* JADX INFO: Access modifiers changed from: protected */
    public a(vi.d dVar, vi.c cVar) {
        super(dVar, cVar);
    }

    public static <T extends b<T>> T e(b.a<T> aVar, vi.d dVar) {
        return (T) f(aVar, dVar, vi.c.f29047k);
    }

    public static <T extends b<T>> T f(b.a<T> aVar, vi.d dVar, vi.c cVar) {
        return aVar.a(dVar, cVar.q(c.f459c, c.d.BLOCKING));
    }
}
