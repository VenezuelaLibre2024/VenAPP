package zk;

import gk.Continuation;

/* loaded from: classes3.dex */
public final class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {66}, m = "joinAll")
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f32869a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f32870b;

        /* renamed from: c, reason: collision with root package name */
        int f32871c;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f32870b = obj;
            this.f32871c |= Integer.MIN_VALUE;
            return e.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(java.util.Collection<? extends zk.w1> r4, gk.Continuation<? super ck.v> r5) {
        /*
            boolean r0 = r5 instanceof zk.e.a
            if (r0 == 0) goto L13
            r0 = r5
            zk.e$a r0 = (zk.e.a) r0
            int r1 = r0.f32871c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32871c = r1
            goto L18
        L13:
            zk.e$a r0 = new zk.e$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f32870b
            java.lang.Object r1 = hk.b.c()
            int r2 = r0.f32871c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f32869a
            java.util.Iterator r4 = (java.util.Iterator) r4
            ck.o.b(r5)
            goto L3e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            ck.o.b(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L3e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L55
            java.lang.Object r5 = r4.next()
            zk.w1 r5 = (zk.w1) r5
            r0.f32869a = r4
            r0.f32871c = r3
            java.lang.Object r5 = r5.B0(r0)
            if (r5 != r1) goto L3e
            return r1
        L55:
            ck.v r4 = ck.v.f7137a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: zk.e.a(java.util.Collection, gk.Continuation):java.lang.Object");
    }
}
