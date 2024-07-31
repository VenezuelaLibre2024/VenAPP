package p494zk;

import ck.C2029n;
import ck.C2030o;
import ck.C2037v;
import kotlin.jvm.internal.C9322n;
import p089el.C7226j;
import p089el.C7231l0;
import p124gk.Continuation;
import p124gk.InterfaceC7587f;

/* renamed from: zk.y0 */
/* loaded from: classes3.dex */
public final class C13132y0 {
    /* renamed from: a */
    public static final <T> void m43325a(AbstractC13128x0<? super T> abstractC13128x0, int i10) {
        Continuation<? super T> mo21585b = abstractC13128x0.mo21585b();
        boolean z10 = i10 == 4;
        if (z10 || !(mo21585b instanceof C7226j) || m43326b(i10) != m43326b(abstractC13128x0.f35494c)) {
            m43328d(abstractC13128x0, mo21585b, z10);
            return;
        }
        AbstractC13064h0 abstractC13064h0 = ((C7226j) mo21585b).f16197d;
        InterfaceC7587f context = mo21585b.getContext();
        if (abstractC13064h0.mo626F0(context)) {
            abstractC13064h0.mo625D0(context, abstractC13128x0);
        } else {
            m43329e(abstractC13128x0);
        }
    }

    /* renamed from: b */
    public static final boolean m43326b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    /* renamed from: c */
    public static final boolean m43327c(int i10) {
        return i10 == 2;
    }

    /* renamed from: d */
    public static final <T> void m43328d(AbstractC13128x0<? super T> abstractC13128x0, Continuation<? super T> continuation, boolean z10) {
        Object mo43263g;
        Object mo21586i = abstractC13128x0.mo21586i();
        Throwable mo43262e = abstractC13128x0.mo43262e(mo21586i);
        if (mo43262e != null) {
            C2029n.a aVar = C2029n.f8078b;
            mo43263g = C2030o.m10348a(mo43262e);
        } else {
            C2029n.a aVar2 = C2029n.f8078b;
            mo43263g = abstractC13128x0.mo43263g(mo21586i);
        }
        Object m10340b = C2029n.m10340b(mo43263g);
        if (!z10) {
            continuation.resumeWith(m10340b);
            return;
        }
        C9322n.m27779c(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C7226j c7226j = (C7226j) continuation;
        Continuation<T> continuation2 = c7226j.f16198e;
        Object obj = c7226j.f16200r;
        InterfaceC7587f context = continuation2.getContext();
        Object m21612c = C7231l0.m21612c(context, obj);
        C13138z2<?> m43169g = m21612c != C7231l0.f16205a ? C13060g0.m43169g(continuation2, context, m21612c) : null;
        try {
            c7226j.f16198e.resumeWith(m10340b);
            C2037v c2037v = C2037v.f8089a;
        } finally {
            if (m43169g == null || m43169g.m43335R0()) {
                C7231l0.m21610a(context, m21612c);
            }
        }
    }

    /* renamed from: e */
    private static final void m43329e(AbstractC13128x0<?> abstractC13128x0) {
        AbstractC13061g1 m43297b = C13110s2.f35479a.m43297b();
        if (m43297b.m43180a1()) {
            m43297b.m43177R0(abstractC13128x0);
            return;
        }
        m43297b.m43179W0(true);
        try {
            m43328d(abstractC13128x0, abstractC13128x0.mo21585b(), true);
            do {
            } while (m43297b.m43183j1());
        } finally {
            try {
            } finally {
            }
        }
    }
}
