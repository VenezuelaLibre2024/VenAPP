package cl;

import ck.C2037v;
import kotlin.coroutines.jvm.internal.AbstractC9298d;
import kotlin.coroutines.jvm.internal.InterfaceC9300f;
import kotlin.jvm.internal.C9332x;
import p069dl.C7043a;
import p124gk.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cl.j */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2047j {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: cl.j$a */
    /* loaded from: classes3.dex */
    public static final class a<T> implements InterfaceC2040c<T> {

        /* renamed from: a */
        final /* synthetic */ C9332x f8120a;

        public a(C9332x c9332x) {
            this.f8120a = c9332x;
        }

        @Override // cl.InterfaceC2040c
        public Object emit(T t10, Continuation<? super C2037v> continuation) {
            this.f8120a.f22581a = t10;
            throw new C7043a(this);
        }
    }

    @InterfaceC9300f(m27742c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m27743f = "Reduce.kt", m27744l = {183}, m27745m = "first")
    /* renamed from: cl.j$b */
    /* loaded from: classes3.dex */
    static final class b<T> extends AbstractC9298d {

        /* renamed from: a */
        Object f8121a;

        /* renamed from: b */
        Object f8122b;

        /* renamed from: c */
        /* synthetic */ Object f8123c;

        /* renamed from: d */
        int f8124d;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Object invokeSuspend(Object obj) {
            this.f8123c = obj;
            this.f8124d |= Integer.MIN_VALUE;
            return C2041d.m10362f(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object m10372a(cl.InterfaceC2039b<? extends T> r4, p124gk.Continuation<? super T> r5) {
        /*
            boolean r0 = r5 instanceof cl.C2047j.b
            if (r0 == 0) goto L13
            r0 = r5
            cl.j$b r0 = (cl.C2047j.b) r0
            int r1 = r0.f8124d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8124d = r1
            goto L18
        L13:
            cl.j$b r0 = new cl.j$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f8123c
            java.lang.Object r1 = hk.C7750b.m23652c()
            int r2 = r0.f8124d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f8122b
            cl.j$a r4 = (cl.C2047j.a) r4
            java.lang.Object r0 = r0.f8121a
            kotlin.jvm.internal.x r0 = (kotlin.jvm.internal.C9332x) r0
            ck.C2030o.m10349b(r5)     // Catch: p069dl.C7043a -> L31
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
            ck.C2030o.m10349b(r5)
            kotlin.jvm.internal.x r5 = new kotlin.jvm.internal.x
            r5.<init>()
            el.h0 r2 = p069dl.C7050h.f15613a
            r5.f22581a = r2
            cl.j$a r2 = new cl.j$a
            r2.<init>(r5)
            r0.f8121a = r5     // Catch: p069dl.C7043a -> L5b
            r0.f8122b = r2     // Catch: p069dl.C7043a -> L5b
            r0.f8124d = r3     // Catch: p069dl.C7043a -> L5b
            java.lang.Object r4 = r4.mo10355a(r2, r0)     // Catch: p069dl.C7043a -> L5b
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
            p069dl.C7048f.m20649a(r5, r4)
        L62:
            T r4 = r0.f22581a
            el.h0 r5 = p069dl.C7050h.f15613a
            if (r4 == r5) goto L69
            return r4
        L69:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.C2047j.m10372a(cl.b, gk.Continuation):java.lang.Object");
    }
}
