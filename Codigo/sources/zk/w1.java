package zk;

import gk.Continuation;
import gk.f;
import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public interface w1 extends f.b {

    /* renamed from: q */
    public static final b f32940q = b.f32941a;

    /* loaded from: classes3.dex */
    public static final class a {
        public static /* synthetic */ void a(w1 w1Var, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            w1Var.O(cancellationException);
        }

        public static <R> R b(w1 w1Var, R r10, ok.p<? super R, ? super f.b, ? extends R> pVar) {
            return (R) f.b.a.a(w1Var, r10, pVar);
        }

        public static <E extends f.b> E c(w1 w1Var, f.c<E> cVar) {
            return (E) f.b.a.b(w1Var, cVar);
        }

        public static /* synthetic */ c1 d(w1 w1Var, boolean z10, boolean z11, ok.l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            }
            return w1Var.m0(z10, z11, lVar);
        }

        public static gk.f e(w1 w1Var, f.c<?> cVar) {
            return f.b.a.c(w1Var, cVar);
        }

        public static gk.f f(w1 w1Var, gk.f fVar) {
            return f.b.a.d(w1Var, fVar);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements f.c<w1> {

        /* renamed from: a */
        static final /* synthetic */ b f32941a = new b();

        private b() {
        }
    }

    Object B0(Continuation<? super ck.v> continuation);

    void O(CancellationException cancellationException);

    c1 R(ok.l<? super Throwable, ck.v> lVar);

    boolean a();

    w1 getParent();

    wk.d<w1> i();

    boolean isCancelled();

    s j0(u uVar);

    c1 m0(boolean z10, boolean z11, ok.l<? super Throwable, ck.v> lVar);

    CancellationException n();

    boolean start();
}
