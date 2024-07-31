package hk;

import ck.C2030o;
import ck.C2037v;
import kotlin.coroutines.jvm.internal.AbstractC9295a;
import kotlin.coroutines.jvm.internal.AbstractC9298d;
import kotlin.coroutines.jvm.internal.AbstractC9304j;
import kotlin.coroutines.jvm.internal.C9302h;
import kotlin.jvm.internal.C9310b0;
import kotlin.jvm.internal.C9322n;
import p124gk.C7588g;
import p124gk.Continuation;
import p124gk.InterfaceC7587f;
import p280ok.InterfaceC10002p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: hk.c */
/* loaded from: classes3.dex */
public class C7751c {

    /* renamed from: hk.c$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC9304j {

        /* renamed from: a */
        private int f18468a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC10002p f18469b;

        /* renamed from: c */
        final /* synthetic */ Object f18470c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Continuation continuation, InterfaceC10002p interfaceC10002p, Object obj) {
            super(continuation);
            this.f18469b = interfaceC10002p;
            this.f18470c = obj;
            C9322n.m27779c(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f18468a;
            if (i10 == 0) {
                this.f18468a = 1;
                C2030o.m10349b(obj);
                C9322n.m27779c(this.f18469b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((InterfaceC10002p) C9310b0.m27759c(this.f18469b, 2)).invoke(this.f18470c, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f18468a = 2;
            C2030o.m10349b(obj);
            return obj;
        }
    }

    /* renamed from: hk.c$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC9298d {

        /* renamed from: a */
        private int f18471a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC10002p f18472b;

        /* renamed from: c */
        final /* synthetic */ Object f18473c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Continuation continuation, InterfaceC7587f interfaceC7587f, InterfaceC10002p interfaceC10002p, Object obj) {
            super(continuation, interfaceC7587f);
            this.f18472b = interfaceC10002p;
            this.f18473c = obj;
            C9322n.m27779c(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f18471a;
            if (i10 == 0) {
                this.f18471a = 1;
                C2030o.m10349b(obj);
                C9322n.m27779c(this.f18472b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((InterfaceC10002p) C9310b0.m27759c(this.f18472b, 2)).invoke(this.f18473c, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f18471a = 2;
            C2030o.m10349b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static <R, T> Continuation<C2037v> m23653a(InterfaceC10002p<? super R, ? super Continuation<? super T>, ? extends Object> interfaceC10002p, R r10, Continuation<? super T> completion) {
        C9322n.m27781e(interfaceC10002p, "<this>");
        C9322n.m27781e(completion, "completion");
        Continuation<?> m27751a = C9302h.m27751a(completion);
        if (interfaceC10002p instanceof AbstractC9295a) {
            return ((AbstractC9295a) interfaceC10002p).create(r10, m27751a);
        }
        InterfaceC7587f context = m27751a.getContext();
        return context == C7588g.f17931a ? new a(m27751a, interfaceC10002p, r10) : new b(m27751a, context, interfaceC10002p, r10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static <T> Continuation<T> m23654b(Continuation<? super T> continuation) {
        Continuation<T> continuation2;
        C9322n.m27781e(continuation, "<this>");
        AbstractC9298d abstractC9298d = continuation instanceof AbstractC9298d ? (AbstractC9298d) continuation : null;
        return (abstractC9298d == null || (continuation2 = (Continuation<T>) abstractC9298d.intercepted()) == null) ? continuation : continuation2;
    }
}
