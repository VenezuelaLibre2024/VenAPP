package gk;

import gk.d;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import ok.p;

/* loaded from: classes3.dex */
public interface f {

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: gk.f$a$a */
        /* loaded from: classes3.dex */
        public static final class C0268a extends o implements p<f, b, f> {

            /* renamed from: a */
            public static final C0268a f16293a = new C0268a();

            C0268a() {
                super(2);
            }

            @Override // ok.p
            /* renamed from: a */
            public final f invoke(f acc, b element) {
                gk.c cVar;
                n.e(acc, "acc");
                n.e(element, "element");
                f Q = acc.Q(element.getKey());
                g gVar = g.f16294a;
                if (Q == gVar) {
                    return element;
                }
                d.b bVar = d.f16291n;
                d dVar = (d) Q.b(bVar);
                if (dVar == null) {
                    cVar = new gk.c(Q, element);
                } else {
                    f Q2 = Q.Q(bVar);
                    if (Q2 == gVar) {
                        return new gk.c(element, dVar);
                    }
                    cVar = new gk.c(new gk.c(Q2, element), dVar);
                }
                return cVar;
            }
        }

        public static f a(f fVar, f context) {
            n.e(context, "context");
            return context == g.f16294a ? fVar : (f) context.z0(fVar, C0268a.f16293a);
        }
    }

    /* loaded from: classes3.dex */
    public interface b extends f {

        /* loaded from: classes3.dex */
        public static final class a {
            public static <R> R a(b bVar, R r10, p<? super R, ? super b, ? extends R> operation) {
                n.e(operation, "operation");
                return operation.invoke(r10, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E b(b bVar, c<E> key) {
                n.e(key, "key");
                if (!n.a(bVar.getKey(), key)) {
                    return null;
                }
                n.c(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static f c(b bVar, c<?> key) {
                n.e(key, "key");
                return n.a(bVar.getKey(), key) ? g.f16294a : bVar;
            }

            public static f d(b bVar, f context) {
                n.e(context, "context");
                return a.a(bVar, context);
            }
        }

        @Override // gk.f
        <E extends b> E b(c<E> cVar);

        c<?> getKey();
    }

    /* loaded from: classes3.dex */
    public interface c<E extends b> {
    }

    f Q(c<?> cVar);

    f U(f fVar);

    <E extends b> E b(c<E> cVar);

    <R> R z0(R r10, p<? super R, ? super b, ? extends R> pVar);
}
