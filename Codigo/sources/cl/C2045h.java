package cl;

import ck.C2037v;
import kotlin.coroutines.jvm.internal.AbstractC9298d;
import kotlin.coroutines.jvm.internal.InterfaceC9300f;
import kotlin.jvm.internal.C9322n;
import kotlin.jvm.internal.C9332x;
import p124gk.Continuation;
import p124gk.InterfaceC7587f;
import p280ok.InterfaceC10003q;
import p494zk.InterfaceC13125w1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cl.h */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2045h {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: cl.h$a */
    /* loaded from: classes3.dex */
    public static final class a<T> implements InterfaceC2039b<T> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC2039b f8094a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC10003q f8095b;

        @InterfaceC9300f(m27742c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", m27743f = "Errors.kt", m27744l = {113, 114}, m27745m = "collect")
        /* renamed from: cl.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C13177a extends AbstractC9298d {

            /* renamed from: a */
            /* synthetic */ Object f8096a;

            /* renamed from: b */
            int f8097b;

            /* renamed from: d */
            Object f8099d;

            /* renamed from: e */
            Object f8100e;

            public C13177a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
            public final Object invokeSuspend(Object obj) {
                this.f8096a = obj;
                this.f8097b |= Integer.MIN_VALUE;
                return a.this.mo10355a(null, this);
            }
        }

        public a(InterfaceC2039b interfaceC2039b, InterfaceC10003q interfaceC10003q) {
            this.f8094a = interfaceC2039b;
            this.f8095b = interfaceC10003q;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // cl.InterfaceC2039b
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object mo10355a(cl.InterfaceC2040c<? super T> r6, p124gk.Continuation<? super ck.C2037v> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof cl.C2045h.a.C13177a
                if (r0 == 0) goto L13
                r0 = r7
                cl.h$a$a r0 = (cl.C2045h.a.C13177a) r0
                int r1 = r0.f8097b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f8097b = r1
                goto L18
            L13:
                cl.h$a$a r0 = new cl.h$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f8096a
                java.lang.Object r1 = hk.C7750b.m23652c()
                int r2 = r0.f8097b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                ck.C2030o.m10349b(r7)
                goto L6f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.f8100e
                cl.c r6 = (cl.InterfaceC2040c) r6
                java.lang.Object r2 = r0.f8099d
                cl.h$a r2 = (cl.C2045h.a) r2
                ck.C2030o.m10349b(r7)
                goto L53
            L40:
                ck.C2030o.m10349b(r7)
                cl.b r7 = r5.f8094a
                r0.f8099d = r5
                r0.f8100e = r6
                r0.f8097b = r4
                java.lang.Object r7 = cl.C2041d.m10358b(r7, r6, r0)
                if (r7 != r1) goto L52
                return r1
            L52:
                r2 = r5
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                ok.q r2 = r2.f8095b
                r4 = 0
                r0.f8099d = r4
                r0.f8100e = r4
                r0.f8097b = r3
                r3 = 6
                kotlin.jvm.internal.C9320l.m27776a(r3)
                java.lang.Object r6 = r2.mo9756m(r6, r7, r0)
                r7 = 7
                kotlin.jvm.internal.C9320l.m27776a(r7)
                if (r6 != r1) goto L6f
                return r1
            L6f:
                ck.v r6 = ck.C2037v.f8089a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: cl.C2045h.a.mo10355a(cl.c, gk.Continuation):java.lang.Object");
        }
    }

    @InterfaceC9300f(m27742c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", m27743f = "Errors.kt", m27744l = {156}, m27745m = "catchImpl")
    /* renamed from: cl.h$b */
    /* loaded from: classes3.dex */
    static final class b<T> extends AbstractC9298d {

        /* renamed from: a */
        Object f8101a;

        /* renamed from: b */
        /* synthetic */ Object f8102b;

        /* renamed from: c */
        int f8103c;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            this.f8102b = obj;
            this.f8103c |= Integer.MIN_VALUE;
            return C2041d.m10358b(null, null, this);
        }
    }

    /* renamed from: cl.h$c */
    /* loaded from: classes3.dex */
    static final class c<T> implements InterfaceC2040c {

        /* renamed from: a */
        final /* synthetic */ InterfaceC2040c<T> f8104a;

        /* renamed from: b */
        final /* synthetic */ C9332x<Throwable> f8105b;

        /* JADX INFO: Access modifiers changed from: package-private */
        @InterfaceC9300f(m27742c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", m27743f = "Errors.kt", m27744l = {158}, m27745m = "emit")
        /* renamed from: cl.h$c$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC9298d {

            /* renamed from: a */
            Object f8106a;

            /* renamed from: b */
            /* synthetic */ Object f8107b;

            /* renamed from: c */
            final /* synthetic */ c<T> f8108c;

            /* renamed from: d */
            int f8109d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(c<? super T> cVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f8108c = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
            public final Object invokeSuspend(Object obj) {
                this.f8107b = obj;
                this.f8109d |= Integer.MIN_VALUE;
                return this.f8108c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(InterfaceC2040c<? super T> interfaceC2040c, C9332x<Throwable> c9332x) {
            this.f8104a = interfaceC2040c;
            this.f8105b = c9332x;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // cl.InterfaceC2040c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r5, p124gk.Continuation<? super ck.C2037v> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof cl.C2045h.c.a
                if (r0 == 0) goto L13
                r0 = r6
                cl.h$c$a r0 = (cl.C2045h.c.a) r0
                int r1 = r0.f8109d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f8109d = r1
                goto L18
            L13:
                cl.h$c$a r0 = new cl.h$c$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f8107b
                java.lang.Object r1 = hk.C7750b.m23652c()
                int r2 = r0.f8109d
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f8106a
                cl.h$c r5 = (cl.C2045h.c) r5
                ck.C2030o.m10349b(r6)     // Catch: java.lang.Throwable -> L2d
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
                ck.C2030o.m10349b(r6)
                cl.c<T> r6 = r4.f8104a     // Catch: java.lang.Throwable -> L4a
                r0.f8106a = r4     // Catch: java.lang.Throwable -> L4a
                r0.f8109d = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r1) goto L47
                return r1
            L47:
                ck.v r5 = ck.C2037v.f8089a
                return r5
            L4a:
                r6 = move-exception
                r5 = r4
            L4c:
                kotlin.jvm.internal.x<java.lang.Throwable> r5 = r5.f8105b
                r5.f22581a = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: cl.C2045h.c.emit(java.lang.Object, gk.Continuation):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final <T> InterfaceC2039b<T> m10367a(InterfaceC2039b<? extends T> interfaceC2039b, InterfaceC10003q<? super InterfaceC2040c<? super T>, ? super Throwable, ? super Continuation<? super C2037v>, ? extends Object> interfaceC10003q) {
        return new a(interfaceC2039b, interfaceC10003q);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object m10368b(cl.InterfaceC2039b<? extends T> r4, cl.InterfaceC2040c<? super T> r5, p124gk.Continuation<? super java.lang.Throwable> r6) {
        /*
            boolean r0 = r6 instanceof cl.C2045h.b
            if (r0 == 0) goto L13
            r0 = r6
            cl.h$b r0 = (cl.C2045h.b) r0
            int r1 = r0.f8103c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8103c = r1
            goto L18
        L13:
            cl.h$b r0 = new cl.h$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f8102b
            java.lang.Object r1 = hk.C7750b.m23652c()
            int r2 = r0.f8103c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f8101a
            kotlin.jvm.internal.x r4 = (kotlin.jvm.internal.C9332x) r4
            ck.C2030o.m10349b(r6)     // Catch: java.lang.Throwable -> L2d
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
            ck.C2030o.m10349b(r6)
            kotlin.jvm.internal.x r6 = new kotlin.jvm.internal.x
            r6.<init>()
            cl.h$c r2 = new cl.h$c     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.f8101a = r6     // Catch: java.lang.Throwable -> L51
            r0.f8103c = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.mo10355a(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r5 = move-exception
            r4 = r6
        L53:
            T r4 = r4.f22581a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = m10370d(r5, r4)
            if (r6 != 0) goto L76
            gk.f r6 = r0.getContext()
            boolean r6 = m10369c(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            ck.C2016a.m10326a(r4, r5)
            throw r4
        L72:
            ck.C2016a.m10326a(r5, r4)
            throw r5
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.C2045h.m10368b(cl.b, cl.c, gk.Continuation):java.lang.Object");
    }

    /* renamed from: c */
    private static final boolean m10369c(Throwable th2, InterfaceC7587f interfaceC7587f) {
        InterfaceC13125w1 interfaceC13125w1 = (InterfaceC13125w1) interfaceC7587f.mo20647b(InterfaceC13125w1.f35491q);
        if (interfaceC13125w1 == null || !interfaceC13125w1.isCancelled()) {
            return false;
        }
        return m10370d(th2, interfaceC13125w1.mo43123n());
    }

    /* renamed from: d */
    private static final boolean m10370d(Throwable th2, Throwable th3) {
        return th3 != null && C9322n.m27777a(th3, th2);
    }
}
