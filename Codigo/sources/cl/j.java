package cl;

import ck.v;
import gk.Continuation;
import kotlin.jvm.internal.x;

/* loaded from: classes3.dex */
public final /* synthetic */ class j {

    /* loaded from: classes3.dex */
    public static final class a<T> implements c<T> {

        /* renamed from: a */
        final /* synthetic */ x f7168a;

        public a(x xVar) {
            this.f7168a = xVar;
        }

        @Override // cl.c
        public Object emit(T t10, Continuation<? super v> continuation) {
            this.f7168a.f20759a = t10;
            throw new dl.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "first")
    /* loaded from: classes3.dex */
    public static final class b<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        Object f7169a;

        /* renamed from: b */
        Object f7170b;

        /* renamed from: c */
        /* synthetic */ Object f7171c;

        /* renamed from: d */
        int f7172d;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7171c = obj;
            this.f7172d |= Integer.MIN_VALUE;
            return d.f(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object a(cl.b<? extends T> r4, gk.Continuation<? super T> r5) {
        /*
            boolean r0 = r5 instanceof cl.j.b
            if (r0 == 0) goto L13
            r0 = r5
            cl.j$b r0 = (cl.j.b) r0
            int r1 = r0.f7172d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7172d = r1
            goto L18
        L13:
            cl.j$b r0 = new cl.j$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f7171c
            java.lang.Object r1 = hk.b.c()
            int r2 = r0.f7172d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f7170b
            cl.j$a r4 = (cl.j.a) r4
            java.lang.Object r0 = r0.f7169a
            kotlin.jvm.internal.x r0 = (kotlin.jvm.internal.x) r0
            ck.o.b(r5)     // Catch: dl.a -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            ck.o.b(r5)
            kotlin.jvm.internal.x r5 = new kotlin.jvm.internal.x
            r5.<init>()
            el.h0 r2 = dl.h.f14255a
            r5.f20759a = r2
            cl.j$a r2 = new cl.j$a
            r2.<init>(r5)
            r0.f7169a = r5     // Catch: dl.a -> L5b
            r0.f7170b = r2     // Catch: dl.a -> L5b
            r0.f7172d = r3     // Catch: dl.a -> L5b
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: dl.a -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            dl.f.a(r5, r4)
        L62:
            T r4 = r0.f20759a
            el.h0 r5 = dl.h.f14255a
            if (r4 == r5) goto L69
            return r4
        L69:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.j.a(cl.b, gk.Continuation):java.lang.Object");
    }
}
