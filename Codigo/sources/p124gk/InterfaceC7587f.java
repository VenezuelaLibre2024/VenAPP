package p124gk;

import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9322n;
import p124gk.InterfaceC7585d;
import p280ok.InterfaceC10002p;

/* renamed from: gk.f */
/* loaded from: classes3.dex */
public interface InterfaceC7587f {

    /* renamed from: gk.f$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: gk.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C13211a extends AbstractC9323o implements InterfaceC10002p<InterfaceC7587f, b, InterfaceC7587f> {

            /* renamed from: a */
            public static final C13211a f17930a = new C13211a();

            C13211a() {
                super(2);
            }

            @Override // p280ok.InterfaceC10002p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC7587f invoke(InterfaceC7587f acc, b element) {
                C7584c c7584c;
                C9322n.m27781e(acc, "acc");
                C9322n.m27781e(element, "element");
                InterfaceC7587f mo20645Q = acc.mo20645Q(element.getKey());
                C7588g c7588g = C7588g.f17931a;
                if (mo20645Q == c7588g) {
                    return element;
                }
                InterfaceC7585d.b bVar = InterfaceC7585d.f17928n;
                InterfaceC7585d interfaceC7585d = (InterfaceC7585d) mo20645Q.mo20647b(bVar);
                if (interfaceC7585d == null) {
                    c7584c = new C7584c(mo20645Q, element);
                } else {
                    InterfaceC7587f mo20645Q2 = mo20645Q.mo20645Q(bVar);
                    if (mo20645Q2 == c7588g) {
                        return new C7584c(element, interfaceC7585d);
                    }
                    c7584c = new C7584c(new C7584c(mo20645Q2, element), interfaceC7585d);
                }
                return c7584c;
            }
        }

        /* renamed from: a */
        public static InterfaceC7587f m23041a(InterfaceC7587f interfaceC7587f, InterfaceC7587f context) {
            C9322n.m27781e(context, "context");
            return context == C7588g.f17931a ? interfaceC7587f : (InterfaceC7587f) context.mo20648z0(interfaceC7587f, C13211a.f17930a);
        }
    }

    /* renamed from: gk.f$b */
    /* loaded from: classes3.dex */
    public interface b extends InterfaceC7587f {

        /* renamed from: gk.f$b$a */
        /* loaded from: classes3.dex */
        public static final class a {
            /* renamed from: a */
            public static <R> R m23043a(b bVar, R r10, InterfaceC10002p<? super R, ? super b, ? extends R> operation) {
                C9322n.m27781e(operation, "operation");
                return operation.invoke(r10, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: b */
            public static <E extends b> E m23044b(b bVar, c<E> key) {
                C9322n.m27781e(key, "key");
                if (!C9322n.m27777a(bVar.getKey(), key)) {
                    return null;
                }
                C9322n.m27779c(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            /* renamed from: c */
            public static InterfaceC7587f m23045c(b bVar, c<?> key) {
                C9322n.m27781e(key, "key");
                return C9322n.m27777a(bVar.getKey(), key) ? C7588g.f17931a : bVar;
            }

            /* renamed from: d */
            public static InterfaceC7587f m23046d(b bVar, InterfaceC7587f context) {
                C9322n.m27781e(context, "context");
                return a.m23041a(bVar, context);
            }
        }

        @Override // p124gk.InterfaceC7587f
        /* renamed from: b */
        <E extends b> E mo20647b(c<E> cVar);

        c<?> getKey();
    }

    /* renamed from: gk.f$c */
    /* loaded from: classes3.dex */
    public interface c<E extends b> {
    }

    /* renamed from: Q */
    InterfaceC7587f mo20645Q(c<?> cVar);

    /* renamed from: U */
    InterfaceC7587f mo20646U(InterfaceC7587f interfaceC7587f);

    /* renamed from: b */
    <E extends b> E mo20647b(c<E> cVar);

    /* renamed from: z0 */
    <R> R mo20648z0(R r10, InterfaceC10002p<? super R, ? super b, ? extends R> interfaceC10002p);
}
