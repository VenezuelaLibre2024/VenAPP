package p089el;

import ck.C2029n;
import ck.C2030o;
import ck.C2037v;
import java.util.concurrent.CancellationException;
import p124gk.Continuation;
import p124gk.InterfaceC7587f;
import p280ok.InterfaceC9998l;
import p494zk.AbstractC13061g1;
import p494zk.C13052e0;
import p494zk.C13060g0;
import p494zk.C13110s2;
import p494zk.C13138z2;
import p494zk.InterfaceC13125w1;

/* renamed from: el.k */
/* loaded from: classes3.dex */
public final class C7228k {

    /* renamed from: a */
    private static final C7223h0 f16202a = new C7223h0("UNDEFINED");

    /* renamed from: b */
    public static final C7223h0 f16203b = new C7223h0("REUSABLE_CLAIMED");

    /* JADX WARN: Finally extract failed */
    /* renamed from: b */
    public static final <T> void m21596b(Continuation<? super T> continuation, Object obj, InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l) {
        boolean z10;
        if (!(continuation instanceof C7226j)) {
            continuation.resumeWith(obj);
            return;
        }
        C7226j c7226j = (C7226j) continuation;
        Object m43148b = C13052e0.m43148b(obj, interfaceC9998l);
        if (c7226j.f16197d.mo626F0(c7226j.getContext())) {
            c7226j.f16199f = m43148b;
            c7226j.f35494c = 1;
            c7226j.f16197d.mo625D0(c7226j.getContext(), c7226j);
            return;
        }
        AbstractC13061g1 m43297b = C13110s2.f35479a.m43297b();
        if (m43297b.m43180a1()) {
            c7226j.f16199f = m43148b;
            c7226j.f35494c = 1;
            m43297b.m43177R0(c7226j);
            return;
        }
        m43297b.m43179W0(true);
        try {
            InterfaceC13125w1 interfaceC13125w1 = (InterfaceC13125w1) c7226j.getContext().mo20647b(InterfaceC13125w1.f35491q);
            if (interfaceC13125w1 == null || interfaceC13125w1.mo43033a()) {
                z10 = false;
            } else {
                CancellationException mo43123n = interfaceC13125w1.mo43123n();
                c7226j.mo21584a(m43148b, mo43123n);
                C2029n.a aVar = C2029n.f8078b;
                c7226j.resumeWith(C2029n.m10340b(C2030o.m10348a(mo43123n)));
                z10 = true;
            }
            if (!z10) {
                Continuation<T> continuation2 = c7226j.f16198e;
                Object obj2 = c7226j.f16200r;
                InterfaceC7587f context = continuation2.getContext();
                Object m21612c = C7231l0.m21612c(context, obj2);
                C13138z2<?> m43169g = m21612c != C7231l0.f16205a ? C13060g0.m43169g(continuation2, context, m21612c) : null;
                try {
                    c7226j.f16198e.resumeWith(obj);
                    C2037v c2037v = C2037v.f8089a;
                    if (m43169g == null || m43169g.m43335R0()) {
                        C7231l0.m21610a(context, m21612c);
                    }
                } catch (Throwable th2) {
                    if (m43169g == null || m43169g.m43335R0()) {
                        C7231l0.m21610a(context, m21612c);
                    }
                    throw th2;
                }
            }
            do {
            } while (m43297b.m43183j1());
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m21597c(Continuation continuation, Object obj, InterfaceC9998l interfaceC9998l, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            interfaceC9998l = null;
        }
        m21596b(continuation, obj, interfaceC9998l);
    }
}
