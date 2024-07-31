package p110fl;

import ck.C2029n;
import ck.C2030o;
import hk.C7752d;
import kotlin.coroutines.jvm.internal.C9302h;
import kotlin.jvm.internal.C9310b0;
import p089el.C7215d0;
import p089el.C7231l0;
import p124gk.Continuation;
import p124gk.InterfaceC7587f;
import p280ok.InterfaceC10002p;
import p494zk.C13033a0;
import p494zk.C13054e2;
import p494zk.C13122v2;

/* renamed from: fl.b */
/* loaded from: classes3.dex */
public final class C7374b {
    /* renamed from: a */
    public static final <R, T> void m22244a(InterfaceC10002p<? super R, ? super Continuation<? super T>, ? extends Object> interfaceC10002p, R r10, Continuation<? super T> continuation) {
        Object m10348a;
        Object m23655c;
        Continuation m27751a = C9302h.m27751a(continuation);
        try {
            InterfaceC7587f context = continuation.getContext();
            Object m21612c = C7231l0.m21612c(context, null);
            try {
                m10348a = ((InterfaceC10002p) C9310b0.m27759c(interfaceC10002p, 2)).invoke(r10, m27751a);
                m23655c = C7752d.m23655c();
                if (m10348a == m23655c) {
                    return;
                }
            } finally {
                C7231l0.m21610a(context, m21612c);
            }
        } catch (Throwable th2) {
            C2029n.a aVar = C2029n.f8078b;
            m10348a = C2030o.m10348a(th2);
        }
        m27751a.resumeWith(C2029n.m10340b(m10348a));
    }

    /* renamed from: b */
    public static final <T, R> Object m22245b(C7215d0<? super T> c7215d0, R r10, InterfaceC10002p<? super R, ? super Continuation<? super T>, ? extends Object> interfaceC10002p) {
        Object c13033a0;
        Object m23655c;
        Object m43124n0;
        Object m23655c2;
        try {
            c13033a0 = ((InterfaceC10002p) C9310b0.m27759c(interfaceC10002p, 2)).invoke(r10, c7215d0);
        } catch (Throwable th2) {
            c13033a0 = new C13033a0(th2, false, 2, null);
        }
        m23655c = C7752d.m23655c();
        if (c13033a0 == m23655c || (m43124n0 = c7215d0.m43124n0(c13033a0)) == C13054e2.f35425b) {
            m23655c2 = C7752d.m23655c();
            return m23655c2;
        }
        if (m43124n0 instanceof C13033a0) {
            throw ((C13033a0) m43124n0).f35388a;
        }
        return C13054e2.m43158h(m43124n0);
    }

    /* renamed from: c */
    public static final <T, R> Object m22246c(C7215d0<? super T> c7215d0, R r10, InterfaceC10002p<? super R, ? super Continuation<? super T>, ? extends Object> interfaceC10002p) {
        Object c13033a0;
        Object m23655c;
        Object m43124n0;
        Object m23655c2;
        try {
            c13033a0 = ((InterfaceC10002p) C9310b0.m27759c(interfaceC10002p, 2)).invoke(r10, c7215d0);
        } catch (Throwable th2) {
            c13033a0 = new C13033a0(th2, false, 2, null);
        }
        m23655c = C7752d.m23655c();
        if (c13033a0 == m23655c || (m43124n0 = c7215d0.m43124n0(c13033a0)) == C13054e2.f35425b) {
            m23655c2 = C7752d.m23655c();
            return m23655c2;
        }
        if (m43124n0 instanceof C13033a0) {
            Throwable th3 = ((C13033a0) m43124n0).f35388a;
            if (((th3 instanceof C13122v2) && ((C13122v2) th3).f35489a == c7215d0) ? false : true) {
                throw th3;
            }
            if (c13033a0 instanceof C13033a0) {
                throw ((C13033a0) c13033a0).f35388a;
            }
        } else {
            c13033a0 = C13054e2.m43158h(m43124n0);
        }
        return c13033a0;
    }
}
