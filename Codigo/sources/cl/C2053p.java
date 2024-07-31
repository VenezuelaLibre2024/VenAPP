package cl;

import ck.C2037v;
import kotlin.coroutines.jvm.internal.AbstractC9298d;
import kotlin.coroutines.jvm.internal.InterfaceC9300f;
import p124gk.Continuation;
import p280ok.InterfaceC10002p;

/* renamed from: cl.p */
/* loaded from: classes3.dex */
public final class C2053p<T> implements InterfaceC2040c<T> {

    /* renamed from: a */
    private final InterfaceC2040c<T> f8139a;

    /* renamed from: b */
    private final InterfaceC10002p<InterfaceC2040c<? super T>, Continuation<? super C2037v>, Object> f8140b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC9300f(m27742c = "kotlinx.coroutines.flow.SubscribedFlowCollector", m27743f = "Share.kt", m27744l = {419, 423}, m27745m = "onSubscription")
    /* renamed from: cl.p$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC9298d {

        /* renamed from: a */
        Object f8141a;

        /* renamed from: b */
        Object f8142b;

        /* renamed from: c */
        /* synthetic */ Object f8143c;

        /* renamed from: d */
        final /* synthetic */ C2053p<T> f8144d;

        /* renamed from: e */
        int f8145e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C2053p<T> c2053p, Continuation<? super a> continuation) {
            super(continuation);
            this.f8144d = c2053p;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            this.f8143c = obj;
            this.f8145e |= Integer.MIN_VALUE;
            return this.f8144d.m10389a(this);
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
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m10389a(p124gk.Continuation<? super ck.C2037v> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof cl.C2053p.a
            if (r0 == 0) goto L13
            r0 = r7
            cl.p$a r0 = (cl.C2053p.a) r0
            int r1 = r0.f8145e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8145e = r1
            goto L18
        L13:
            cl.p$a r0 = new cl.p$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f8143c
            java.lang.Object r1 = hk.C7750b.m23652c()
            int r2 = r0.f8145e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            ck.C2030o.m10349b(r7)
            goto L77
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f8142b
            dl.i r2 = (p069dl.C7051i) r2
            java.lang.Object r4 = r0.f8141a
            cl.p r4 = (cl.C2053p) r4
            ck.C2030o.m10349b(r7)     // Catch: java.lang.Throwable -> L7d
            goto L5e
        L40:
            ck.C2030o.m10349b(r7)
            dl.i r2 = new dl.i
            cl.c<T> r7 = r6.f8139a
            gk.f r5 = r0.getContext()
            r2.<init>(r7, r5)
            ok.p<cl.c<? super T>, gk.Continuation<? super ck.v>, java.lang.Object> r7 = r6.f8140b     // Catch: java.lang.Throwable -> L7d
            r0.f8141a = r6     // Catch: java.lang.Throwable -> L7d
            r0.f8142b = r2     // Catch: java.lang.Throwable -> L7d
            r0.f8145e = r4     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L7d
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r4 = r6
        L5e:
            r2.releaseIntercepted()
            cl.c<T> r7 = r4.f8139a
            boolean r2 = r7 instanceof cl.C2053p
            if (r2 == 0) goto L7a
            cl.p r7 = (cl.C2053p) r7
            r2 = 0
            r0.f8141a = r2
            r0.f8142b = r2
            r0.f8145e = r3
            java.lang.Object r7 = r7.m10389a(r0)
            if (r7 != r1) goto L77
            return r1
        L77:
            ck.v r7 = ck.C2037v.f8089a
            return r7
        L7a:
            ck.v r7 = ck.C2037v.f8089a
            return r7
        L7d:
            r7 = move-exception
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.C2053p.m10389a(gk.Continuation):java.lang.Object");
    }

    @Override // cl.InterfaceC2040c
    public Object emit(T t10, Continuation<? super C2037v> continuation) {
        return this.f8139a.emit(t10, continuation);
    }
}
