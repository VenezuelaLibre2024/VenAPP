package p069dl;

import ck.C2037v;
import cl.InterfaceC2040c;
import kotlin.jvm.internal.C9310b0;
import kotlin.jvm.internal.C9319k;
import kotlin.jvm.internal.C9322n;
import p124gk.Continuation;
import p280ok.InterfaceC10003q;

/* renamed from: dl.j */
/* loaded from: classes3.dex */
public final class C7052j {

    /* renamed from: a */
    private static final InterfaceC10003q<InterfaceC2040c<Object>, Object, Continuation<? super C2037v>, Object> f15622a;

    /* renamed from: dl.j$a */
    /* loaded from: classes3.dex */
    /* synthetic */ class a extends C9319k implements InterfaceC10003q<InterfaceC2040c<? super Object>, Object, Continuation<? super C2037v>, Object> {

        /* renamed from: a */
        public static final a f15623a = new a();

        a() {
            super(3, InterfaceC2040c.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // p280ok.InterfaceC10003q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo9756m(InterfaceC2040c<Object> interfaceC2040c, Object obj, Continuation<? super C2037v> continuation) {
            return interfaceC2040c.emit(obj, continuation);
        }
    }

    static {
        a aVar = a.f15623a;
        C9322n.m27779c(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f15622a = (InterfaceC10003q) C9310b0.m27759c(aVar, 3);
    }
}
