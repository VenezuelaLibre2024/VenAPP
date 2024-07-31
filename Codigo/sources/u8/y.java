package u8;

import android.os.Handler;
import android.os.SystemClock;
import t6.u1;
import t8.r0;
import u8.y;

/* loaded from: classes.dex */
public interface y {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f27483a;

        /* renamed from: b, reason: collision with root package name */
        private final y f27484b;

        public a(Handler handler, y yVar) {
            this.f27483a = yVar != null ? (Handler) t8.a.e(handler) : null;
            this.f27484b = yVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(String str, long j10, long j11) {
            ((y) r0.j(this.f27484b)).d(str, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(String str) {
            ((y) r0.j(this.f27484b)).b(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(w6.e eVar) {
            eVar.c();
            ((y) r0.j(this.f27484b)).c(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t(int i10, long j10) {
            ((y) r0.j(this.f27484b)).n(i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void u(w6.e eVar) {
            ((y) r0.j(this.f27484b)).e(eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void v(u1 u1Var, w6.i iVar) {
            ((y) r0.j(this.f27484b)).v(u1Var);
            ((y) r0.j(this.f27484b)).g(u1Var, iVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void w(Object obj, long j10) {
            ((y) r0.j(this.f27484b)).o(obj, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void x(long j10, int i10) {
            ((y) r0.j(this.f27484b)).r(j10, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void y(Exception exc) {
            ((y) r0.j(this.f27484b)).l(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void z(a0 a0Var) {
            ((y) r0.j(this.f27484b)).onVideoSizeChanged(a0Var);
        }

        public void A(final Object obj) {
            if (this.f27483a != null) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f27483a.post(new Runnable() { // from class: u8.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        y.a.this.w(obj, elapsedRealtime);
                    }
                });
            }
        }

        public void B(final long j10, final int i10) {
            Handler handler = this.f27483a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u8.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        y.a.this.x(j10, i10);
                    }
                });
            }
        }

        public void C(final Exception exc) {
            Handler handler = this.f27483a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u8.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        y.a.this.y(exc);
                    }
                });
            }
        }

        public void D(final a0 a0Var) {
            Handler handler = this.f27483a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u8.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        y.a.this.z(a0Var);
                    }
                });
            }
        }

        public void k(final String str, final long j10, final long j11) {
            Handler handler = this.f27483a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u8.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        y.a.this.q(str, j10, j11);
                    }
                });
            }
        }

        public void l(final String str) {
            Handler handler = this.f27483a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u8.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        y.a.this.r(str);
                    }
                });
            }
        }

        public void m(final w6.e eVar) {
            eVar.c();
            Handler handler = this.f27483a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u8.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        y.a.this.s(eVar);
                    }
                });
            }
        }

        public void n(final int i10, final long j10) {
            Handler handler = this.f27483a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u8.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        y.a.this.t(i10, j10);
                    }
                });
            }
        }

        public void o(final w6.e eVar) {
            Handler handler = this.f27483a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u8.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        y.a.this.u(eVar);
                    }
                });
            }
        }

        public void p(final u1 u1Var, final w6.i iVar) {
            Handler handler = this.f27483a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u8.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        y.a.this.v(u1Var, iVar);
                    }
                });
            }
        }
    }

    default void b(String str) {
    }

    default void c(w6.e eVar) {
    }

    default void d(String str, long j10, long j11) {
    }

    default void e(w6.e eVar) {
    }

    default void g(u1 u1Var, w6.i iVar) {
    }

    default void l(Exception exc) {
    }

    default void n(int i10, long j10) {
    }

    default void o(Object obj, long j10) {
    }

    default void onVideoSizeChanged(a0 a0Var) {
    }

    default void r(long j10, int i10) {
    }

    @Deprecated
    default void v(u1 u1Var) {
    }
}
