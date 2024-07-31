package p124gk;

import kotlin.jvm.internal.C9322n;
import p124gk.InterfaceC7587f;

/* renamed from: gk.d */
/* loaded from: classes3.dex */
public interface InterfaceC7585d extends InterfaceC7587f.b {

    /* renamed from: n */
    public static final b f17928n = b.f17929a;

    /* renamed from: gk.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        /* renamed from: a */
        public static <E extends InterfaceC7587f.b> E m23038a(InterfaceC7585d interfaceC7585d, InterfaceC7587f.c<E> key) {
            C9322n.m27781e(key, "key");
            if (!(key instanceof AbstractC7583b)) {
                if (InterfaceC7585d.f17928n != key) {
                    return null;
                }
                C9322n.m27779c(interfaceC7585d, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return interfaceC7585d;
            }
            AbstractC7583b abstractC7583b = (AbstractC7583b) key;
            if (!abstractC7583b.m23029a(interfaceC7585d.getKey())) {
                return null;
            }
            E e10 = (E) abstractC7583b.m23030b(interfaceC7585d);
            if (e10 instanceof InterfaceC7587f.b) {
                return e10;
            }
            return null;
        }

        /* renamed from: b */
        public static InterfaceC7587f m23039b(InterfaceC7585d interfaceC7585d, InterfaceC7587f.c<?> key) {
            C9322n.m27781e(key, "key");
            if (!(key instanceof AbstractC7583b)) {
                return InterfaceC7585d.f17928n == key ? C7588g.f17931a : interfaceC7585d;
            }
            AbstractC7583b abstractC7583b = (AbstractC7583b) key;
            return (!abstractC7583b.m23029a(interfaceC7585d.getKey()) || abstractC7583b.m23030b(interfaceC7585d) == null) ? interfaceC7585d : C7588g.f17931a;
        }
    }

    /* renamed from: gk.d$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC7587f.c<InterfaceC7585d> {

        /* renamed from: a */
        static final /* synthetic */ b f17929a = new b();

        private b() {
        }
    }

    /* renamed from: E */
    <T> Continuation<T> mo23036E(Continuation<? super T> continuation);

    /* renamed from: h0 */
    void mo23037h0(Continuation<?> continuation);
}
