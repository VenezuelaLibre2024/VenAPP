package cl;

import ck.v;
import gk.Continuation;
import kotlin.jvm.internal.x;
import zk.w1;

/* loaded from: classes3.dex */
public final /* synthetic */ class h {

    /* loaded from: classes3.dex */
    public static final class a<T> implements cl.b<T> {

        /* renamed from: a */
        final /* synthetic */ cl.b f7142a;

        /* renamed from: b */
        final /* synthetic */ ok.q f7143b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {113, 114}, m = "collect")
        /* renamed from: cl.h$a$a */
        /* loaded from: classes3.dex */
        public static final class C0124a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a */
            /* synthetic */ Object f7144a;

            /* renamed from: b */
            int f7145b;

            /* renamed from: d */
            Object f7147d;

            /* renamed from: e */
            Object f7148e;

            public C0124a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f7144a = obj;
                this.f7145b |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(cl.b bVar, ok.q qVar) {
            this.f7142a = bVar;
            this.f7143b = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // cl.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object a(cl.c<? super T> r6, gk.Continuation<? super ck.v> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof cl.h.a.C0124a
                if (r0 == 0) goto L13
                r0 = r7
                cl.h$a$a r0 = (cl.h.a.C0124a) r0
                int r1 = r0.f7145b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f7145b = r1
                goto L18
            L13:
                cl.h$a$a r0 = new cl.h$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f7144a
                java.lang.Object r1 = hk.b.c()
                int r2 = r0.f7145b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                ck.o.b(r7)
                goto L6f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.f7148e
                cl.c r6 = (cl.c) r6
                java.lang.Object r2 = r0.f7147d
                cl.h$a r2 = (cl.h.a) r2
                ck.o.b(r7)
                goto L53
            L40:
                ck.o.b(r7)
                cl.b r7 = r5.f7142a
                r0.f7147d = r5
                r0.f7148e = r6
                r0.f7145b = r4
                java.lang.Object r7 = cl.d.b(r7, r6, r0)
                if (r7 != r1) goto L52
                return r1
            L52:
                r2 = r5
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                ok.q r2 = r2.f7143b
                r4 = 0
                r0.f7147d = r4
                r0.f7148e = r4
                r0.f7145b = r3
                r3 = 6
                kotlin.jvm.internal.l.a(r3)
                java.lang.Object r6 = r2.m(r6, r7, r0)
                r7 = 7
                kotlin.jvm.internal.l.a(r7)
                if (r6 != r1) goto L6f
                return r1
            L6f:
                ck.v r6 = ck.v.f7137a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: cl.h.a.a(cl.c, gk.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", l = {156}, m = "catchImpl")
    /* loaded from: classes3.dex */
    public static final class b<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        Object f7149a;

        /* renamed from: b */
        /* synthetic */ Object f7150b;

        /* renamed from: c */
        int f7151c;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7150b = obj;
            this.f7151c |= Integer.MIN_VALUE;
            return d.b(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c<T> implements cl.c {

        /* renamed from: a */
        final /* synthetic */ cl.c<T> f7152a;

        /* renamed from: b */
        final /* synthetic */ x<Throwable> f7153b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", l = {158}, m = "emit")
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a */
            Object f7154a;

            /* renamed from: b */
            /* synthetic */ Object f7155b;

            /* renamed from: c */
            final /* synthetic */ c<T> f7156c;

            /* renamed from: d */
            int f7157d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(c<? super T> cVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f7156c = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f7155b = obj;
                this.f7157d |= Integer.MIN_VALUE;
                return this.f7156c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(cl.c<? super T> cVar, x<Throwable> xVar) {
            this.f7152a = cVar;
            this.f7153b = xVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // cl.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r5, gk.Continuation<? super ck.v> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof cl.h.c.a
                if (r0 == 0) goto L13
                r0 = r6
                cl.h$c$a r0 = (cl.h.c.a) r0
                int r1 = r0.f7157d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f7157d = r1
                goto L18
            L13:
                cl.h$c$a r0 = new cl.h$c$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f7155b
                java.lang.Object r1 = hk.b.c()
                int r2 = r0.f7157d
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f7154a
                cl.h$c r5 = (cl.h.c) r5
                ck.o.b(r6)     // Catch: java.lang.Throwable -> L2d
                goto L47
            L2d:
                r6 = move-exception
                goto L4c
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                ck.o.b(r6)
                cl.c<T> r6 = r4.f7152a     // Catch: java.lang.Throwable -> L4a
                r0.f7154a = r4     // Catch: java.lang.Throwable -> L4a
                r0.f7157d = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r1) goto L47
                return r1
            L47:
                ck.v r5 = ck.v.f7137a
                return r5
            L4a:
                r6 = move-exception
                r5 = r4
            L4c:
                kotlin.jvm.internal.x<java.lang.Throwable> r5 = r5.f7153b
                r5.f20759a = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: cl.h.c.emit(java.lang.Object, gk.Continuation):java.lang.Object");
        }
    }

    public static final <T> cl.b<T> a(cl.b<? extends T> bVar, ok.q<? super cl.c<? super T>, ? super Throwable, ? super Continuation<? super v>, ? extends Object> qVar) {
        return new a(bVar, qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object b(cl.b<? extends T> r4, cl.c<? super T> r5, gk.Continuation<? super java.lang.Throwable> r6) {
        /*
            boolean r0 = r6 instanceof cl.h.b
            if (r0 == 0) goto L13
            r0 = r6
            cl.h$b r0 = (cl.h.b) r0
            int r1 = r0.f7151c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7151c = r1
            goto L18
        L13:
            cl.h$b r0 = new cl.h$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f7150b
            java.lang.Object r1 = hk.b.c()
            int r2 = r0.f7151c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f7149a
            kotlin.jvm.internal.x r4 = (kotlin.jvm.internal.x) r4
            ck.o.b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            ck.o.b(r6)
            kotlin.jvm.internal.x r6 = new kotlin.jvm.internal.x
            r6.<init>()
            cl.h$c r2 = new cl.h$c     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.f7149a = r6     // Catch: java.lang.Throwable -> L51
            r0.f7151c = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r5 = move-exception
            r4 = r6
        L53:
            T r4 = r4.f20759a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L76
            gk.f r6 = r0.getContext()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            ck.a.a(r4, r5)
            throw r4
        L72:
            ck.a.a(r5, r4)
            throw r5
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.h.b(cl.b, cl.c, gk.Continuation):java.lang.Object");
    }

    private static final boolean c(Throwable th2, gk.f fVar) {
        w1 w1Var = (w1) fVar.b(w1.f32940q);
        if (w1Var == null || !w1Var.isCancelled()) {
            return false;
        }
        return d(th2, w1Var.n());
    }

    private static final boolean d(Throwable th2, Throwable th3) {
        return th3 != null && kotlin.jvm.internal.n.a(th3, th2);
    }
}
