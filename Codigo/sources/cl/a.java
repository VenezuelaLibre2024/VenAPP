package cl;

import ck.v;
import gk.Continuation;

/* loaded from: classes3.dex */
public abstract class a<T> implements b<T> {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {230}, m = "collect")
    /* renamed from: cl.a$a */
    /* loaded from: classes3.dex */
    public static final class C0123a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        Object f7138a;

        /* renamed from: b */
        /* synthetic */ Object f7139b;

        /* renamed from: c */
        final /* synthetic */ a<T> f7140c;

        /* renamed from: d */
        int f7141d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0123a(a<T> aVar, Continuation<? super C0123a> continuation) {
            super(continuation);
            this.f7140c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7139b = obj;
            this.f7141d |= Integer.MIN_VALUE;
            return this.f7140c.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // cl.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(cl.c<? super T> r6, gk.Continuation<? super ck.v> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof cl.a.C0123a
            if (r0 == 0) goto L13
            r0 = r7
            cl.a$a r0 = (cl.a.C0123a) r0
            int r1 = r0.f7141d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7141d = r1
            goto L18
        L13:
            cl.a$a r0 = new cl.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f7139b
            java.lang.Object r1 = hk.b.c()
            int r2 = r0.f7141d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f7138a
            dl.i r6 = (dl.i) r6
            ck.o.b(r7)     // Catch: java.lang.Throwable -> L2d
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
            ck.o.b(r7)
            dl.i r7 = new dl.i
            gk.f r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f7138a = r7     // Catch: java.lang.Throwable -> L55
            r0.f7141d = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.b(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            ck.v r6 = ck.v.f7137a
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
        throw new UnsupportedOperationException("Method not decompiled: cl.a.a(cl.c, gk.Continuation):java.lang.Object");
    }

    public abstract Object b(c<? super T> cVar, Continuation<? super v> continuation);
}
