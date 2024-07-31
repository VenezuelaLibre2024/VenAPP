package p430x0;

import ck.C2037v;
import com.google.android.gms.common.api.C5101a;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.jvm.internal.AbstractC9306l;
import kotlin.coroutines.jvm.internal.InterfaceC9300f;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9322n;
import p030bl.C1812f;
import p030bl.C1813g;
import p030bl.C1817k;
import p030bl.InterfaceC1810d;
import p124gk.Continuation;
import p280ok.InterfaceC10002p;
import p280ok.InterfaceC9998l;
import p494zk.C13071j;
import p494zk.InterfaceC13076k0;
import p494zk.InterfaceC13125w1;

/* renamed from: x0.l */
/* loaded from: classes.dex */
public final class C12261l<T> {

    /* renamed from: a */
    private final InterfaceC13076k0 f32760a;

    /* renamed from: b */
    private final InterfaceC10002p<T, Continuation<? super C2037v>, Object> f32761b;

    /* renamed from: c */
    private final InterfaceC1810d<T> f32762c;

    /* renamed from: d */
    private final AtomicInteger f32763d;

    /* renamed from: x0.l$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC9323o implements InterfaceC9998l<Throwable, C2037v> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC9998l<Throwable, C2037v> f32764a;

        /* renamed from: b */
        final /* synthetic */ C12261l<T> f32765b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC10002p<T, Throwable, C2037v> f32766c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l, C12261l<T> c12261l, InterfaceC10002p<? super T, ? super Throwable, C2037v> interfaceC10002p) {
            super(1);
            this.f32764a = interfaceC9998l;
            this.f32765b = c12261l;
            this.f32766c = interfaceC10002p;
        }

        /* renamed from: a */
        public final void m39455a(Throwable th2) {
            C2037v c2037v;
            this.f32764a.invoke(th2);
            ((C12261l) this.f32765b).f32762c.mo9739d(th2);
            do {
                Object m9796f = C1813g.m9796f(((C12261l) this.f32765b).f32762c.mo9737c());
                if (m9796f == null) {
                    c2037v = null;
                } else {
                    this.f32766c.invoke(m9796f, th2);
                    c2037v = C2037v.f8089a;
                }
            } while (c2037v != null);
        }

        @Override // p280ok.InterfaceC9998l
        public /* bridge */ /* synthetic */ C2037v invoke(Throwable th2) {
            m39455a(th2);
            return C2037v.f8089a;
        }
    }

    @InterfaceC9300f(m27742c = "androidx.datastore.core.SimpleActor$offer$2", m27743f = "SimpleActor.kt", m27744l = {122, 122}, m27745m = "invokeSuspend")
    /* renamed from: x0.l$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC9306l implements InterfaceC10002p<InterfaceC13076k0, Continuation<? super C2037v>, Object> {

        /* renamed from: a */
        Object f32767a;

        /* renamed from: b */
        int f32768b;

        /* renamed from: c */
        final /* synthetic */ C12261l<T> f32769c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C12261l<T> c12261l, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f32769c = c12261l;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        public final Continuation<C2037v> create(Object obj, Continuation<?> continuation) {
            return new b(this.f32769c, continuation);
        }

        @Override // p280ok.InterfaceC10002p
        public final Object invoke(InterfaceC13076k0 interfaceC13076k0, Continuation<? super C2037v> continuation) {
            return ((b) create(interfaceC13076k0, continuation)).invokeSuspend(C2037v.f8089a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x005a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x006b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006c -> B:6:0x006e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = hk.C7750b.m23652c()
                int r1 = r7.f32768b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                ck.C2030o.m10349b(r8)
                r8 = r7
                goto L6e
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                java.lang.Object r1 = r7.f32767a
                ok.p r1 = (p280ok.InterfaceC10002p) r1
                ck.C2030o.m10349b(r8)
                r4 = r1
                r1 = r0
                r0 = r7
                goto L60
            L26:
                ck.C2030o.m10349b(r8)
                x0.l<T> r8 = r7.f32769c
                java.util.concurrent.atomic.AtomicInteger r8 = p430x0.C12261l.m39452c(r8)
                int r8 = r8.get()
                if (r8 <= 0) goto L37
                r8 = r3
                goto L38
            L37:
                r8 = 0
            L38:
                if (r8 == 0) goto L7d
                r8 = r7
            L3b:
                x0.l<T> r1 = r8.f32769c
                zk.k0 r1 = p430x0.C12261l.m39453d(r1)
                p494zk.C13080l0.m43232f(r1)
                x0.l<T> r1 = r8.f32769c
                ok.p r1 = p430x0.C12261l.m39450a(r1)
                x0.l<T> r4 = r8.f32769c
                bl.d r4 = p430x0.C12261l.m39451b(r4)
                r8.f32767a = r1
                r8.f32768b = r3
                java.lang.Object r4 = r4.mo9736b(r8)
                if (r4 != r0) goto L5b
                return r0
            L5b:
                r6 = r0
                r0 = r8
                r8 = r4
                r4 = r1
                r1 = r6
            L60:
                r5 = 0
                r0.f32767a = r5
                r0.f32768b = r2
                java.lang.Object r8 = r4.invoke(r8, r0)
                if (r8 != r1) goto L6c
                return r1
            L6c:
                r8 = r0
                r0 = r1
            L6e:
                x0.l<T> r1 = r8.f32769c
                java.util.concurrent.atomic.AtomicInteger r1 = p430x0.C12261l.m39452c(r1)
                int r1 = r1.decrementAndGet()
                if (r1 != 0) goto L3b
                ck.v r8 = ck.C2037v.f8089a
                return r8
            L7d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p430x0.C12261l.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12261l(InterfaceC13076k0 scope, InterfaceC9998l<? super Throwable, C2037v> onComplete, InterfaceC10002p<? super T, ? super Throwable, C2037v> onUndeliveredElement, InterfaceC10002p<? super T, ? super Continuation<? super C2037v>, ? extends Object> consumeMessage) {
        C9322n.m27781e(scope, "scope");
        C9322n.m27781e(onComplete, "onComplete");
        C9322n.m27781e(onUndeliveredElement, "onUndeliveredElement");
        C9322n.m27781e(consumeMessage, "consumeMessage");
        this.f32760a = scope;
        this.f32761b = consumeMessage;
        this.f32762c = C1812f.m9790b(C5101a.e.API_PRIORITY_OTHER, null, null, 6, null);
        this.f32763d = new AtomicInteger(0);
        InterfaceC13125w1 interfaceC13125w1 = (InterfaceC13125w1) scope.mo7278h().mo20647b(InterfaceC13125w1.f35491q);
        if (interfaceC13125w1 == null) {
            return;
        }
        interfaceC13125w1.mo43109R(new a(onComplete, this, onUndeliveredElement));
    }

    /* renamed from: e */
    public final void m39454e(T t10) {
        Object mo9734a = this.f32762c.mo9734a(t10);
        if (mo9734a instanceof C1813g.a) {
            Throwable m9795e = C1813g.m9795e(mo9734a);
            if (m9795e != null) {
                throw m9795e;
            }
            throw new C1817k("Channel was closed normally");
        }
        if (!C1813g.m9799i(mo9734a)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.f32763d.getAndIncrement() == 0) {
            C13071j.m43218d(this.f32760a, null, null, new b(this, null), 3, null);
        }
    }
}
