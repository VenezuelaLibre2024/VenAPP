package cl;

import ck.C2037v;
import hk.C7752d;
import kotlin.coroutines.jvm.internal.AbstractC9298d;
import kotlin.coroutines.jvm.internal.InterfaceC9300f;
import kotlin.jvm.internal.C9330v;
import p124gk.Continuation;
import p280ok.InterfaceC10002p;

/* renamed from: cl.i */
/* loaded from: classes3.dex */
final /* synthetic */ class C2046i {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: cl.i$a */
    /* loaded from: classes3.dex */
    public static final class a<T> implements InterfaceC2039b<T> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC2039b f8110a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC10002p f8111b;

        public a(InterfaceC2039b interfaceC2039b, InterfaceC10002p interfaceC10002p) {
            this.f8110a = interfaceC2039b;
            this.f8111b = interfaceC10002p;
        }

        @Override // cl.InterfaceC2039b
        /* renamed from: a */
        public Object mo10355a(InterfaceC2040c<? super T> interfaceC2040c, Continuation<? super C2037v> continuation) {
            Object m23655c;
            Object mo10355a = this.f8110a.mo10355a(new b(new C9330v(), interfaceC2040c, this.f8111b), continuation);
            m23655c = C7752d.m23655c();
            return mo10355a == m23655c ? mo10355a : C2037v.f8089a;
        }
    }

    /* renamed from: cl.i$b */
    /* loaded from: classes3.dex */
    static final class b<T> implements InterfaceC2040c {

        /* renamed from: a */
        final /* synthetic */ C9330v f8112a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC2040c<T> f8113b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC10002p<T, Continuation<? super Boolean>, Object> f8114c;

        /* JADX INFO: Access modifiers changed from: package-private */
        @InterfaceC9300f(m27742c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", m27743f = "Limit.kt", m27744l = {37, 38, 40}, m27745m = "emit")
        /* renamed from: cl.i$b$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC9298d {

            /* renamed from: a */
            Object f8115a;

            /* renamed from: b */
            Object f8116b;

            /* renamed from: c */
            /* synthetic */ Object f8117c;

            /* renamed from: d */
            final /* synthetic */ b<T> f8118d;

            /* renamed from: e */
            int f8119e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(b<? super T> bVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f8118d = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
            public final Object invokeSuspend(Object obj) {
                this.f8117c = obj;
                this.f8119e |= Integer.MIN_VALUE;
                return this.f8118d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(C9330v c9330v, InterfaceC2040c<? super T> interfaceC2040c, InterfaceC10002p<? super T, ? super Continuation<? super Boolean>, ? extends Object> interfaceC10002p) {
            this.f8112a = c9330v;
            this.f8113b = interfaceC2040c;
            this.f8114c = interfaceC10002p;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // cl.InterfaceC2040c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r7, p124gk.Continuation<? super ck.C2037v> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof cl.C2046i.b.a
                if (r0 == 0) goto L13
                r0 = r8
                cl.i$b$a r0 = (cl.C2046i.b.a) r0
                int r1 = r0.f8119e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f8119e = r1
                goto L18
            L13:
                cl.i$b$a r0 = new cl.i$b$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f8117c
                java.lang.Object r1 = hk.C7750b.m23652c()
                int r2 = r0.f8119e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                ck.C2030o.m10349b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f8116b
                java.lang.Object r2 = r0.f8115a
                cl.i$b r2 = (cl.C2046i.b) r2
                ck.C2030o.m10349b(r8)
                goto L6c
            L41:
                ck.C2030o.m10349b(r8)
                goto L59
            L45:
                ck.C2030o.m10349b(r8)
                kotlin.jvm.internal.v r8 = r6.f8112a
                boolean r8 = r8.f22579a
                if (r8 == 0) goto L5c
                cl.c<T> r8 = r6.f8113b
                r0.f8119e = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                ck.v r7 = ck.C2037v.f8089a
                return r7
            L5c:
                ok.p<T, gk.Continuation<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f8114c
                r0.f8115a = r6
                r0.f8116b = r7
                r0.f8119e = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.v r8 = r2.f8112a
                r8.f22579a = r5
                cl.c<T> r8 = r2.f8113b
                r2 = 0
                r0.f8115a = r2
                r0.f8116b = r2
                r0.f8119e = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
                return r1
            L88:
                ck.v r7 = ck.C2037v.f8089a
                return r7
            L8b:
                ck.v r7 = ck.C2037v.f8089a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: cl.C2046i.b.emit(java.lang.Object, gk.Continuation):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final <T> InterfaceC2039b<T> m10371a(InterfaceC2039b<? extends T> interfaceC2039b, InterfaceC10002p<? super T, ? super Continuation<? super Boolean>, ? extends Object> interfaceC10002p) {
        return new a(interfaceC2039b, interfaceC10002p);
    }
}
