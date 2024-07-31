package cl;

import ck.C2037v;
import kotlin.coroutines.jvm.internal.AbstractC9298d;
import kotlin.coroutines.jvm.internal.InterfaceC9300f;
import p124gk.Continuation;

/* renamed from: cl.a */
/* loaded from: classes3.dex */
public abstract class AbstractC2038a<T> implements InterfaceC2039b<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC9300f(m27742c = "kotlinx.coroutines.flow.AbstractFlow", m27743f = "Flow.kt", m27744l = {230}, m27745m = "collect")
    /* renamed from: cl.a$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC9298d {

        /* renamed from: a */
        Object f8090a;

        /* renamed from: b */
        /* synthetic */ Object f8091b;

        /* renamed from: c */
        final /* synthetic */ AbstractC2038a<T> f8092c;

        /* renamed from: d */
        int f8093d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC2038a<T> abstractC2038a, Continuation<? super a> continuation) {
            super(continuation);
            this.f8092c = abstractC2038a;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            this.f8091b = obj;
            this.f8093d |= Integer.MIN_VALUE;
            return this.f8092c.mo10355a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // cl.InterfaceC2039b
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo10355a(cl.InterfaceC2040c<? super T> r6, p124gk.Continuation<? super ck.C2037v> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof cl.AbstractC2038a.a
            if (r0 == 0) goto L13
            r0 = r7
            cl.a$a r0 = (cl.AbstractC2038a.a) r0
            int r1 = r0.f8093d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8093d = r1
            goto L18
        L13:
            cl.a$a r0 = new cl.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f8091b
            java.lang.Object r1 = hk.C7750b.m23652c()
            int r2 = r0.f8093d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f8090a
            dl.i r6 = (p069dl.C7051i) r6
            ck.C2030o.m10349b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            ck.C2030o.m10349b(r7)
            dl.i r7 = new dl.i
            gk.f r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f8090a = r7     // Catch: java.lang.Throwable -> L55
            r0.f8093d = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.mo10356b(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            ck.v r6 = ck.C2037v.f8089a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.AbstractC2038a.mo10355a(cl.c, gk.Continuation):java.lang.Object");
    }

    /* renamed from: b */
    public abstract Object mo10356b(InterfaceC2040c<? super T> interfaceC2040c, Continuation<? super C2037v> continuation);
}
