package cl;

import ck.v;
import gk.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final /* synthetic */ class i {

    /* loaded from: classes3.dex */
    public static final class a<T> implements cl.b<T> {

        /* renamed from: a */
        final /* synthetic */ cl.b f7158a;

        /* renamed from: b */
        final /* synthetic */ ok.p f7159b;

        public a(cl.b bVar, ok.p pVar) {
            this.f7158a = bVar;
            this.f7159b = pVar;
        }

        @Override // cl.b
        public Object a(c<? super T> cVar, Continuation<? super v> continuation) {
            Object c10;
            Object a10 = this.f7158a.a(new b(new kotlin.jvm.internal.v(), cVar, this.f7159b), continuation);
            c10 = hk.d.c();
            return a10 == c10 ? a10 : v.f7137a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T> implements c {

        /* renamed from: a */
        final /* synthetic */ kotlin.jvm.internal.v f7160a;

        /* renamed from: b */
        final /* synthetic */ c<T> f7161b;

        /* renamed from: c */
        final /* synthetic */ ok.p<T, Continuation<? super Boolean>, Object> f7162c;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {37, 38, 40}, m = "emit")
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a */
            Object f7163a;

            /* renamed from: b */
            Object f7164b;

            /* renamed from: c */
            /* synthetic */ Object f7165c;

            /* renamed from: d */
            final /* synthetic */ b<T> f7166d;

            /* renamed from: e */
            int f7167e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(b<? super T> bVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f7166d = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f7165c = obj;
                this.f7167e |= Integer.MIN_VALUE;
                return this.f7166d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(kotlin.jvm.internal.v vVar, c<? super T> cVar, ok.p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar) {
            this.f7160a = vVar;
            this.f7161b = cVar;
            this.f7162c = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // cl.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r7, gk.Continuation<? super ck.v> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof cl.i.b.a
                if (r0 == 0) goto L13
                r0 = r8
                cl.i$b$a r0 = (cl.i.b.a) r0
                int r1 = r0.f7167e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f7167e = r1
                goto L18
            L13:
                cl.i$b$a r0 = new cl.i$b$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f7165c
                java.lang.Object r1 = hk.b.c()
                int r2 = r0.f7167e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                ck.o.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f7164b
                java.lang.Object r2 = r0.f7163a
                cl.i$b r2 = (cl.i.b) r2
                ck.o.b(r8)
                goto L6c
            L41:
                ck.o.b(r8)
                goto L59
            L45:
                ck.o.b(r8)
                kotlin.jvm.internal.v r8 = r6.f7160a
                boolean r8 = r8.f20757a
                if (r8 == 0) goto L5c
                cl.c<T> r8 = r6.f7161b
                r0.f7167e = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                ck.v r7 = ck.v.f7137a
                return r7
            L5c:
                ok.p<T, gk.Continuation<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f7162c
                r0.f7163a = r6
                r0.f7164b = r7
                r0.f7167e = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.v r8 = r2.f7160a
                r8.f20757a = r5
                cl.c<T> r8 = r2.f7161b
                r2 = 0
                r0.f7163a = r2
                r0.f7164b = r2
                r0.f7167e = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
                return r1
            L88:
                ck.v r7 = ck.v.f7137a
                return r7
            L8b:
                ck.v r7 = ck.v.f7137a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: cl.i.b.emit(java.lang.Object, gk.Continuation):java.lang.Object");
        }
    }

    public static final <T> cl.b<T> a(cl.b<? extends T> bVar, ok.p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar) {
        return new a(bVar, pVar);
    }
}
