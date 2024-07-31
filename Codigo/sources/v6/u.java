package v6;

import android.os.Handler;
import t6.u1;
import v6.u;

/* loaded from: classes.dex */
public interface u {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f28123a;

        /* renamed from: b, reason: collision with root package name */
        private final u f28124b;

        public a(Handler handler, u uVar) {
            this.f28123a = uVar != null ? (Handler) t8.a.e(handler) : null;
            this.f28124b = uVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void A(int i10, long j10, long j11) {
            ((u) t8.r0.j(this.f28124b)).q(i10, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(Exception exc) {
            ((u) t8.r0.j(this.f28124b)).p(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(Exception exc) {
            ((u) t8.r0.j(this.f28124b)).a(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t(String str, long j10, long j11) {
            ((u) t8.r0.j(this.f28124b)).j(str, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void u(String str) {
            ((u) t8.r0.j(this.f28124b)).i(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void v(w6.e eVar) {
            eVar.c();
            ((u) t8.r0.j(this.f28124b)).h(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void w(w6.e eVar) {
            ((u) t8.r0.j(this.f28124b)).m(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void x(u1 u1Var, w6.i iVar) {
            ((u) t8.r0.j(this.f28124b)).t(u1Var);
            ((u) t8.r0.j(this.f28124b)).f(u1Var, iVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void y(long j10) {
            ((u) t8.r0.j(this.f28124b)).k(j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void z(boolean z10) {
            ((u) t8.r0.j(this.f28124b)).onSkipSilenceEnabledChanged(z10);
        }

        public void B(final long j10) {
            Handler handler = this.f28123a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v6.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        u.a.this.y(j10);
                    }
                });
            }
        }

        public void C(final boolean z10) {
            Handler handler = this.f28123a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v6.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        u.a.this.z(z10);
                    }
                });
            }
        }

        public void D(final int i10, final long j10, final long j11) {
            Handler handler = this.f28123a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v6.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        u.a.this.A(i10, j10, j11);
                    }
                });
            }
        }

        public void k(final Exception exc) {
            Handler handler = this.f28123a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v6.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        u.a.this.r(exc);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Handler handler = this.f28123a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v6.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        u.a.this.s(exc);
                    }
                });
            }
        }

        public void m(final String str, final long j10, final long j11) {
            Handler handler = this.f28123a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v6.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        u.a.this.t(str, j10, j11);
                    }
                });
            }
        }

        public void n(final String str) {
            Handler handler = this.f28123a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v6.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        u.a.this.u(str);
                    }
                });
            }
        }

        public void o(final w6.e eVar) {
            eVar.c();
            Handler handler = this.f28123a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v6.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        u.a.this.v(eVar);
                    }
                });
            }
        }

        public void p(final w6.e eVar) {
            Handler handler = this.f28123a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v6.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        u.a.this.w(eVar);
                    }
                });
            }
        }

        public void q(final u1 u1Var, final w6.i iVar) {
            Handler handler = this.f28123a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v6.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        u.a.this.x(u1Var, iVar);
                    }
                });
            }
        }
    }

    default void a(Exception exc) {
    }

    default void f(u1 u1Var, w6.i iVar) {
    }

    default void h(w6.e eVar) {
    }

    default void i(String str) {
    }

    default void j(String str, long j10, long j11) {
    }

    default void k(long j10) {
    }

    default void m(w6.e eVar) {
    }

    default void onSkipSilenceEnabledChanged(boolean z10) {
    }

    default void p(Exception exc) {
    }

    default void q(int i10, long j10, long j11) {
    }

    @Deprecated
    default void t(u1 u1Var) {
    }
}
