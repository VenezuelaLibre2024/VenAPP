package el;

import ck.n;
import gk.Continuation;
import java.util.concurrent.CancellationException;
import zk.g1;
import zk.s2;
import zk.w1;
import zk.z2;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a */
    private static final h0 f14779a = new h0("UNDEFINED");

    /* renamed from: b */
    public static final h0 f14780b = new h0("REUSABLE_CLAIMED");

    /* JADX WARN: Finally extract failed */
    public static final <T> void b(Continuation<? super T> continuation, Object obj, ok.l<? super Throwable, ck.v> lVar) {
        boolean z10;
        if (!(continuation instanceof j)) {
            continuation.resumeWith(obj);
            return;
        }
        j jVar = (j) continuation;
        Object b10 = zk.e0.b(obj, lVar);
        if (jVar.f14774d.F0(jVar.getContext())) {
            jVar.f14776f = b10;
            jVar.f32943c = 1;
            jVar.f14774d.D0(jVar.getContext(), jVar);
            return;
        }
        g1 b11 = s2.f32928a.b();
        if (b11.a1()) {
            jVar.f14776f = b10;
            jVar.f32943c = 1;
            b11.R0(jVar);
            return;
        }
        b11.W0(true);
        try {
            w1 w1Var = (w1) jVar.getContext().b(w1.f32940q);
            if (w1Var == null || w1Var.a()) {
                z10 = false;
            } else {
                CancellationException n10 = w1Var.n();
                jVar.a(b10, n10);
                n.a aVar = ck.n.f7126b;
                jVar.resumeWith(ck.n.b(ck.o.a(n10)));
                z10 = true;
            }
            if (!z10) {
                Continuation<T> continuation2 = jVar.f14775e;
                Object obj2 = jVar.f14777r;
                gk.f context = continuation2.getContext();
                Object c10 = l0.c(context, obj2);
                z2<?> g10 = c10 != l0.f14782a ? zk.g0.g(continuation2, context, c10) : null;
                try {
                    jVar.f14775e.resumeWith(obj);
                    ck.v vVar = ck.v.f7137a;
                    if (g10 == null || g10.R0()) {
                        l0.a(context, c10);
                    }
                } catch (Throwable th2) {
                    if (g10 == null || g10.R0()) {
                        l0.a(context, c10);
                    }
                    throw th2;
                }
            }
            do {
            } while (b11.j1());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void c(Continuation continuation, Object obj, ok.l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        b(continuation, obj, lVar);
    }
}
