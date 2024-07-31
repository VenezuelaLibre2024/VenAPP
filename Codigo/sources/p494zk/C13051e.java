package p494zk;

import kotlin.coroutines.jvm.internal.AbstractC9298d;
import kotlin.coroutines.jvm.internal.InterfaceC9300f;
import p124gk.Continuation;

/* renamed from: zk.e */
/* loaded from: classes3.dex */
public final class C13051e {

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC9300f(m27742c = "kotlinx.coroutines.AwaitKt", m27743f = "Await.kt", m27744l = {66}, m27745m = "joinAll")
    /* renamed from: zk.e$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC9298d {

        /* renamed from: a */
        Object f35420a;

        /* renamed from: b */
        /* synthetic */ Object f35421b;

        /* renamed from: c */
        int f35422c;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            this.f35421b = obj;
            this.f35422c |= Integer.MIN_VALUE;
            return C13051e.m43146a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m43146a(java.util.Collection<? extends p494zk.InterfaceC13125w1> r4, p124gk.Continuation<? super ck.C2037v> r5) {
        /*
            boolean r0 = r5 instanceof p494zk.C13051e.a
            if (r0 == 0) goto L13
            r0 = r5
            zk.e$a r0 = (p494zk.C13051e.a) r0
            int r1 = r0.f35422c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35422c = r1
            goto L18
        L13:
            zk.e$a r0 = new zk.e$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f35421b
            java.lang.Object r1 = hk.C7750b.m23652c()
            int r2 = r0.f35422c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f35420a
            java.util.Iterator r4 = (java.util.Iterator) r4
            ck.C2030o.m10349b(r5)
            goto L3e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            ck.C2030o.m10349b(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L3e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L55
            java.lang.Object r5 = r4.next()
            zk.w1 r5 = (p494zk.InterfaceC13125w1) r5
            r0.f35420a = r4
            r0.f35422c = r3
            java.lang.Object r5 = r5.mo43101B0(r0)
            if (r5 != r1) goto L3e
            return r1
        L55:
            ck.v r4 = ck.C2037v.f8089a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p494zk.C13051e.m43146a(java.util.Collection, gk.Continuation):java.lang.Object");
    }
}
