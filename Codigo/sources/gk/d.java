package gk;

import gk.f;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public interface d extends f.b {

    /* renamed from: n, reason: collision with root package name */
    public static final b f16291n = b.f16292a;

    /* loaded from: classes3.dex */
    public static final class a {
        public static <E extends f.b> E a(d dVar, f.c<E> key) {
            n.e(key, "key");
            if (!(key instanceof gk.b)) {
                if (d.f16291n != key) {
                    return null;
                }
                n.c(dVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return dVar;
            }
            gk.b bVar = (gk.b) key;
            if (!bVar.a(dVar.getKey())) {
                return null;
            }
            E e10 = (E) bVar.b(dVar);
            if (e10 instanceof f.b) {
                return e10;
            }
            return null;
        }

        public static f b(d dVar, f.c<?> key) {
            n.e(key, "key");
            if (!(key instanceof gk.b)) {
                return d.f16291n == key ? g.f16294a : dVar;
            }
            gk.b bVar = (gk.b) key;
            return (!bVar.a(dVar.getKey()) || bVar.b(dVar) == null) ? dVar : g.f16294a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements f.c<d> {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f16292a = new b();

        private b() {
        }
    }

    <T> Continuation<T> E(Continuation<? super T> continuation);

    void h0(Continuation<?> continuation);
}
