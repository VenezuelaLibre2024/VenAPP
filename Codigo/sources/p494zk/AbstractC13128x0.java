package p494zk;

import ck.C2017b;
import ck.C2029n;
import ck.C2030o;
import ck.C2037v;
import gl.AbstractRunnableC7596h;
import gl.InterfaceC7597i;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C9322n;
import p089el.C7226j;
import p089el.C7231l0;
import p124gk.Continuation;
import p124gk.InterfaceC7587f;

/* renamed from: zk.x0 */
/* loaded from: classes3.dex */
public abstract class AbstractC13128x0<T> extends AbstractRunnableC7596h {

    /* renamed from: c */
    public int f35494c;

    public AbstractC13128x0(int i10) {
        this.f35494c = i10;
    }

    /* renamed from: a */
    public void mo21584a(Object obj, Throwable th2) {
    }

    /* renamed from: b */
    public abstract Continuation<T> mo21585b();

    /* renamed from: e */
    public Throwable mo43262e(Object obj) {
        C13033a0 c13033a0 = obj instanceof C13033a0 ? (C13033a0) obj : null;
        if (c13033a0 != null) {
            return c13033a0.f35388a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public <T> T mo43263g(Object obj) {
        return obj;
    }

    /* renamed from: h */
    public final void m43321h(Throwable th2, Throwable th3) {
        if (th2 == null && th3 == null) {
            return;
        }
        if (th2 != null && th3 != null) {
            C2017b.m10328a(th2, th3);
        }
        if (th2 == null) {
            th2 = th3;
        }
        C9322n.m27778b(th2);
        C13072j0.m43220a(mo21585b().getContext(), new C13088n0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    /* renamed from: i */
    public abstract Object mo21586i();

    @Override // java.lang.Runnable
    public final void run() {
        Object m10340b;
        Object m10340b2;
        Object m10340b3;
        InterfaceC7597i interfaceC7597i = this.f17964b;
        try {
            Continuation<T> mo21585b = mo21585b();
            C9322n.m27779c(mo21585b, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C7226j c7226j = (C7226j) mo21585b;
            Continuation<T> continuation = c7226j.f16198e;
            Object obj = c7226j.f16200r;
            InterfaceC7587f context = continuation.getContext();
            Object m21612c = C7231l0.m21612c(context, obj);
            C13138z2<?> m43169g = m21612c != C7231l0.f16205a ? C13060g0.m43169g(continuation, context, m21612c) : null;
            try {
                InterfaceC7587f context2 = continuation.getContext();
                Object mo21586i = mo21586i();
                Throwable mo43262e = mo43262e(mo21586i);
                InterfaceC13125w1 interfaceC13125w1 = (mo43262e == null && C13132y0.m43326b(this.f35494c)) ? (InterfaceC13125w1) context2.mo20647b(InterfaceC13125w1.f35491q) : null;
                if (interfaceC13125w1 != null && !interfaceC13125w1.mo43033a()) {
                    CancellationException mo43123n = interfaceC13125w1.mo43123n();
                    mo21584a(mo21586i, mo43123n);
                    C2029n.a aVar = C2029n.f8078b;
                    m10340b2 = C2029n.m10340b(C2030o.m10348a(mo43123n));
                } else if (mo43262e != null) {
                    C2029n.a aVar2 = C2029n.f8078b;
                    m10340b2 = C2029n.m10340b(C2030o.m10348a(mo43262e));
                } else {
                    C2029n.a aVar3 = C2029n.f8078b;
                    m10340b2 = C2029n.m10340b(mo43263g(mo21586i));
                }
                continuation.resumeWith(m10340b2);
                C2037v c2037v = C2037v.f8089a;
                try {
                    interfaceC7597i.mo23093a();
                    m10340b3 = C2029n.m10340b(C2037v.f8089a);
                } catch (Throwable th2) {
                    C2029n.a aVar4 = C2029n.f8078b;
                    m10340b3 = C2029n.m10340b(C2030o.m10348a(th2));
                }
                m43321h(null, C2029n.m10342d(m10340b3));
            } finally {
                if (m43169g == null || m43169g.m43335R0()) {
                    C7231l0.m21610a(context, m21612c);
                }
            }
        } catch (Throwable th3) {
            try {
                C2029n.a aVar5 = C2029n.f8078b;
                interfaceC7597i.mo23093a();
                m10340b = C2029n.m10340b(C2037v.f8089a);
            } catch (Throwable th4) {
                C2029n.a aVar6 = C2029n.f8078b;
                m10340b = C2029n.m10340b(C2030o.m10348a(th4));
            }
            m43321h(th3, C2029n.m10342d(m10340b));
        }
    }
}
