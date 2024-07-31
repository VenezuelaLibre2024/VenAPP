package p110fl;

import ck.C2029n;
import ck.C2030o;
import ck.C2037v;
import hk.C7751c;
import p089el.C7228k;
import p124gk.Continuation;
import p280ok.InterfaceC10002p;
import p280ok.InterfaceC9998l;

/* renamed from: fl.a */
/* loaded from: classes3.dex */
public final class C7373a {
    /* renamed from: a */
    private static final void m22240a(Continuation<?> continuation, Throwable th2) {
        C2029n.a aVar = C2029n.f8078b;
        continuation.resumeWith(C2029n.m10340b(C2030o.m10348a(th2)));
        throw th2;
    }

    /* renamed from: b */
    public static final void m22241b(Continuation<? super C2037v> continuation, Continuation<?> continuation2) {
        Continuation m23654b;
        try {
            m23654b = C7751c.m23654b(continuation);
            C2029n.a aVar = C2029n.f8078b;
            C7228k.m21597c(m23654b, C2029n.m10340b(C2037v.f8089a), null, 2, null);
        } catch (Throwable th2) {
            m22240a(continuation2, th2);
        }
    }

    /* renamed from: c */
    public static final <R, T> void m22242c(InterfaceC10002p<? super R, ? super Continuation<? super T>, ? extends Object> interfaceC10002p, R r10, Continuation<? super T> continuation, InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l) {
        Continuation m23653a;
        Continuation m23654b;
        try {
            m23653a = C7751c.m23653a(interfaceC10002p, r10, continuation);
            m23654b = C7751c.m23654b(m23653a);
            C2029n.a aVar = C2029n.f8078b;
            C7228k.m21596b(m23654b, C2029n.m10340b(C2037v.f8089a), interfaceC9998l);
        } catch (Throwable th2) {
            m22240a(continuation, th2);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m22243d(InterfaceC10002p interfaceC10002p, Object obj, Continuation continuation, InterfaceC9998l interfaceC9998l, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            interfaceC9998l = null;
        }
        m22242c(interfaceC10002p, obj, continuation, interfaceC9998l);
    }
}
