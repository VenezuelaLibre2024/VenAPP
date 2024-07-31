package p494zk;

import hk.C7752d;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.C9302h;
import p089el.C7215d0;
import p089el.C7218f;
import p110fl.C7374b;
import p124gk.Continuation;
import p124gk.InterfaceC7587f;
import p280ok.InterfaceC10002p;

/* renamed from: zk.l0 */
/* loaded from: classes3.dex */
public final class C13080l0 {
    /* renamed from: a */
    public static final InterfaceC13076k0 m43227a(InterfaceC7587f interfaceC7587f) {
        if (interfaceC7587f.mo20647b(InterfaceC13125w1.f35491q) == null) {
            interfaceC7587f = interfaceC7587f.mo20646U(C13035a2.m43043b(null, 1, null));
        }
        return new C7218f(interfaceC7587f);
    }

    /* renamed from: b */
    public static final InterfaceC13076k0 m43228b() {
        return new C7218f(C13102q2.m43290b(null, 1, null).mo20646U(C13034a1.m43041c()));
    }

    /* renamed from: c */
    public static final void m43229c(InterfaceC13076k0 interfaceC13076k0, CancellationException cancellationException) {
        InterfaceC13125w1 interfaceC13125w1 = (InterfaceC13125w1) interfaceC13076k0.mo7278h().mo20647b(InterfaceC13125w1.f35491q);
        if (interfaceC13125w1 != null) {
            interfaceC13125w1.mo43108O(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC13076k0).toString());
    }

    /* renamed from: d */
    public static /* synthetic */ void m43230d(InterfaceC13076k0 interfaceC13076k0, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        m43229c(interfaceC13076k0, cancellationException);
    }

    /* renamed from: e */
    public static final <R> Object m43231e(InterfaceC10002p<? super InterfaceC13076k0, ? super Continuation<? super R>, ? extends Object> interfaceC10002p, Continuation<? super R> continuation) {
        Object m23655c;
        C7215d0 c7215d0 = new C7215d0(continuation.getContext(), continuation);
        Object m22245b = C7374b.m22245b(c7215d0, c7215d0, interfaceC10002p);
        m23655c = C7752d.m23655c();
        if (m22245b == m23655c) {
            C9302h.m27753c(continuation);
        }
        return m22245b;
    }

    /* renamed from: f */
    public static final void m43232f(InterfaceC13076k0 interfaceC13076k0) {
        C13035a2.m43049h(interfaceC13076k0.mo7278h());
    }

    /* renamed from: g */
    public static final boolean m43233g(InterfaceC13076k0 interfaceC13076k0) {
        InterfaceC13125w1 interfaceC13125w1 = (InterfaceC13125w1) interfaceC13076k0.mo7278h().mo20647b(InterfaceC13125w1.f35491q);
        if (interfaceC13125w1 != null) {
            return interfaceC13125w1.mo43033a();
        }
        return true;
    }
}
