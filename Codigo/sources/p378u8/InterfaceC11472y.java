package p378u8;

import android.os.Handler;
import android.os.SystemClock;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11172r0;
import p378u8.InterfaceC11472y;
import p414w6.C12080e;
import p414w6.C12084i;

/* renamed from: u8.y */
/* loaded from: classes.dex */
public interface InterfaceC11472y {

    /* renamed from: u8.y$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final Handler f29799a;

        /* renamed from: b */
        private final InterfaceC11472y f29800b;

        public a(Handler handler, InterfaceC11472y interfaceC11472y) {
            this.f29799a = interfaceC11472y != null ? (Handler) C11137a.m34603e(handler) : null;
            this.f29800b = interfaceC11472y;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q */
        public /* synthetic */ void m35888q(String str, long j10, long j11) {
            ((InterfaceC11472y) C11172r0.m34928j(this.f29800b)).mo33970d(str, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public /* synthetic */ void m35889r(String str) {
            ((InterfaceC11472y) C11172r0.m34928j(this.f29800b)).mo33968b(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public /* synthetic */ void m35890s(C12080e c12080e) {
            c12080e.m38806c();
            ((InterfaceC11472y) C11172r0.m34928j(this.f29800b)).mo33969c(c12080e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public /* synthetic */ void m35891t(int i10, long j10) {
            ((InterfaceC11472y) C11172r0.m34928j(this.f29800b)).mo33980n(i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u */
        public /* synthetic */ void m35892u(C12080e c12080e) {
            ((InterfaceC11472y) C11172r0.m34928j(this.f29800b)).mo33971e(c12080e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public /* synthetic */ void m35893v(C11108u1 c11108u1, C12084i c12084i) {
            ((InterfaceC11472y) C11172r0.m34928j(this.f29800b)).m35877v(c11108u1);
            ((InterfaceC11472y) C11172r0.m34928j(this.f29800b)).mo33973g(c11108u1, c12084i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public /* synthetic */ void m35894w(Object obj, long j10) {
            ((InterfaceC11472y) C11172r0.m34928j(this.f29800b)).mo33981o(obj, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x */
        public /* synthetic */ void m35895x(long j10, int i10) {
            ((InterfaceC11472y) C11172r0.m34928j(this.f29800b)).mo33984r(j10, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public /* synthetic */ void m35896y(Exception exc) {
            ((InterfaceC11472y) C11172r0.m34928j(this.f29800b)).mo33978l(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public /* synthetic */ void m35897z(C11448a0 c11448a0) {
            ((InterfaceC11472y) C11172r0.m34928j(this.f29800b)).onVideoSizeChanged(c11448a0);
        }

        /* renamed from: A */
        public void m35898A(final Object obj) {
            if (this.f29799a != null) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f29799a.post(new Runnable() { // from class: u8.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11472y.a.this.m35894w(obj, elapsedRealtime);
                    }
                });
            }
        }

        /* renamed from: B */
        public void m35899B(final long j10, final int i10) {
            Handler handler = this.f29799a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u8.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11472y.a.this.m35895x(j10, i10);
                    }
                });
            }
        }

        /* renamed from: C */
        public void m35900C(final Exception exc) {
            Handler handler = this.f29799a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u8.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11472y.a.this.m35896y(exc);
                    }
                });
            }
        }

        /* renamed from: D */
        public void m35901D(final C11448a0 c11448a0) {
            Handler handler = this.f29799a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u8.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11472y.a.this.m35897z(c11448a0);
                    }
                });
            }
        }

        /* renamed from: k */
        public void m35902k(final String str, final long j10, final long j11) {
            Handler handler = this.f29799a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u8.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11472y.a.this.m35888q(str, j10, j11);
                    }
                });
            }
        }

        /* renamed from: l */
        public void m35903l(final String str) {
            Handler handler = this.f29799a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u8.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11472y.a.this.m35889r(str);
                    }
                });
            }
        }

        /* renamed from: m */
        public void m35904m(final C12080e c12080e) {
            c12080e.m38806c();
            Handler handler = this.f29799a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u8.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11472y.a.this.m35890s(c12080e);
                    }
                });
            }
        }

        /* renamed from: n */
        public void m35905n(final int i10, final long j10) {
            Handler handler = this.f29799a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u8.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11472y.a.this.m35891t(i10, j10);
                    }
                });
            }
        }

        /* renamed from: o */
        public void m35906o(final C12080e c12080e) {
            Handler handler = this.f29799a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u8.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11472y.a.this.m35892u(c12080e);
                    }
                });
            }
        }

        /* renamed from: p */
        public void m35907p(final C11108u1 c11108u1, final C12084i c12084i) {
            Handler handler = this.f29799a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u8.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11472y.a.this.m35893v(c11108u1, c12084i);
                    }
                });
            }
        }
    }

    /* renamed from: b */
    default void mo33968b(String str) {
    }

    /* renamed from: c */
    default void mo33969c(C12080e c12080e) {
    }

    /* renamed from: d */
    default void mo33970d(String str, long j10, long j11) {
    }

    /* renamed from: e */
    default void mo33971e(C12080e c12080e) {
    }

    /* renamed from: g */
    default void mo33973g(C11108u1 c11108u1, C12084i c12084i) {
    }

    /* renamed from: l */
    default void mo33978l(Exception exc) {
    }

    /* renamed from: n */
    default void mo33980n(int i10, long j10) {
    }

    /* renamed from: o */
    default void mo33981o(Object obj, long j10) {
    }

    default void onVideoSizeChanged(C11448a0 c11448a0) {
    }

    /* renamed from: r */
    default void mo33984r(long j10, int i10) {
    }

    @Deprecated
    /* renamed from: v */
    default void m35877v(C11108u1 c11108u1) {
    }
}
