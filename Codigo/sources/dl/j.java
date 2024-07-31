package dl;

import ck.v;
import gk.Continuation;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.n;
import ok.q;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final q<cl.c<Object>, Object, Continuation<? super v>, Object> f14264a;

    /* loaded from: classes3.dex */
    /* synthetic */ class a extends kotlin.jvm.internal.k implements q<cl.c<? super Object>, Object, Continuation<? super v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14265a = new a();

        a() {
            super(3, cl.c.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // ok.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object m(cl.c<Object> cVar, Object obj, Continuation<? super v> continuation) {
            return cVar.emit(obj, continuation);
        }
    }

    static {
        a aVar = a.f14265a;
        n.c(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f14264a = (q) b0.c(aVar, 3);
    }
}
