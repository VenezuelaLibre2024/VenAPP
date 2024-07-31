package cl;

import ck.v;
import gk.Continuation;

/* loaded from: classes3.dex */
public final class p<T> implements c<T> {

    /* renamed from: a */
    private final c<T> f7187a;

    /* renamed from: b */
    private final ok.p<c<? super T>, Continuation<? super v>, Object> f7188b;

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {419, 423}, m = "onSubscription")
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        Object f7189a;

        /* renamed from: b */
        Object f7190b;

        /* renamed from: c */
        /* synthetic */ Object f7191c;

        /* renamed from: d */
        final /* synthetic */ p<T> f7192d;

        /* renamed from: e */
        int f7193e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p<T> pVar, Continuation<? super a> continuation) {
            super(continuation);
            this.f7192d = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7191c = obj;
            this.f7193e |= Integer.MIN_VALUE;
            return this.f7192d.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [dl.i] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(gk.Continuation<? super ck.v> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof cl.p.a
            if (r0 == 0) goto L13
            r0 = r7
            cl.p$a r0 = (cl.p.a) r0
            int r1 = r0.f7193e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7193e = r1
            goto L18
        L13:
            cl.p$a r0 = new cl.p$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f7191c
            java.lang.Object r1 = hk.b.c()
            int r2 = r0.f7193e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            ck.o.b(r7)
            goto L77
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f7190b
            dl.i r2 = (dl.i) r2
            java.lang.Object r4 = r0.f7189a
            cl.p r4 = (cl.p) r4
            ck.o.b(r7)     // Catch: java.lang.Throwable -> L7d
            goto L5e
        L40:
            ck.o.b(r7)
            dl.i r2 = new dl.i
            cl.c<T> r7 = r6.f7187a
            gk.f r5 = r0.getContext()
            r2.<init>(r7, r5)
            ok.p<cl.c<? super T>, gk.Continuation<? super ck.v>, java.lang.Object> r7 = r6.f7188b     // Catch: java.lang.Throwable -> L7d
            r0.f7189a = r6     // Catch: java.lang.Throwable -> L7d
            r0.f7190b = r2     // Catch: java.lang.Throwable -> L7d
            r0.f7193e = r4     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L7d
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r4 = r6
        L5e:
            r2.releaseIntercepted()
            cl.c<T> r7 = r4.f7187a
            boolean r2 = r7 instanceof cl.p
            if (r2 == 0) goto L7a
            cl.p r7 = (cl.p) r7
            r2 = 0
            r0.f7189a = r2
            r0.f7190b = r2
            r0.f7193e = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L77
            return r1
        L77:
            ck.v r7 = ck.v.f7137a
            return r7
        L7a:
            ck.v r7 = ck.v.f7137a
            return r7
        L7d:
            r7 = move-exception
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.p.a(gk.Continuation):java.lang.Object");
    }

    @Override // cl.c
    public Object emit(T t10, Continuation<? super v> continuation) {
        return this.f7187a.emit(t10, continuation);
    }
}
