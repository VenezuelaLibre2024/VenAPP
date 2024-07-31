package hk;

import ck.o;
import ck.v;
import gk.Continuation;
import gk.f;
import gk.g;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.n;
import ok.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class c {

    /* loaded from: classes3.dex */
    public static final class a extends j {

        /* renamed from: a, reason: collision with root package name */
        private int f16818a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f16819b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f16820c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Continuation continuation, p pVar, Object obj) {
            super(continuation);
            this.f16819b = pVar;
            this.f16820c = obj;
            n.c(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f16818a;
            if (i10 == 0) {
                this.f16818a = 1;
                o.b(obj);
                n.c(this.f16819b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) b0.c(this.f16819b, 2)).invoke(this.f16820c, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f16818a = 2;
            o.b(obj);
            return obj;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        private int f16821a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f16822b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f16823c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Continuation continuation, f fVar, p pVar, Object obj) {
            super(continuation, fVar);
            this.f16822b = pVar;
            this.f16823c = obj;
            n.c(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f16821a;
            if (i10 == 0) {
                this.f16821a = 1;
                o.b(obj);
                n.c(this.f16822b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) b0.c(this.f16822b, 2)).invoke(this.f16823c, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f16821a = 2;
            o.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, T> Continuation<v> a(p<? super R, ? super Continuation<? super T>, ? extends Object> pVar, R r10, Continuation<? super T> completion) {
        n.e(pVar, "<this>");
        n.e(completion, "completion");
        Continuation<?> a10 = h.a(completion);
        if (pVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) pVar).create(r10, a10);
        }
        f context = a10.getContext();
        return context == g.f16294a ? new a(a10, pVar, r10) : new b(a10, context, pVar, r10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Continuation<T> b(Continuation<? super T> continuation) {
        Continuation<T> continuation2;
        n.e(continuation, "<this>");
        kotlin.coroutines.jvm.internal.d dVar = continuation instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) continuation : null;
        return (dVar == null || (continuation2 = (Continuation<T>) dVar.intercepted()) == null) ? continuation : continuation2;
    }
}
