package p396v6;

import android.os.Handler;
import p361t6.C11108u1;
import p363t8.C11137a;
import p363t8.C11172r0;
import p396v6.InterfaceC11671u;
import p414w6.C12080e;
import p414w6.C12084i;

/* renamed from: v6.u */
/* loaded from: classes.dex */
public interface InterfaceC11671u {

    /* renamed from: v6.u$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final Handler f30485a;

        /* renamed from: b */
        private final InterfaceC11671u f30486b;

        public a(Handler handler, InterfaceC11671u interfaceC11671u) {
            this.f30485a = interfaceC11671u != null ? (Handler) C11137a.m34603e(handler) : null;
            this.f30486b = interfaceC11671u;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: A */
        public /* synthetic */ void m36692A(int i10, long j10, long j11) {
            ((InterfaceC11671u) C11172r0.m34928j(this.f30486b)).mo33983q(i10, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public /* synthetic */ void m36703r(Exception exc) {
            ((InterfaceC11671u) C11172r0.m34928j(this.f30486b)).mo33982p(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public /* synthetic */ void m36704s(Exception exc) {
            ((InterfaceC11671u) C11172r0.m34928j(this.f30486b)).mo33967a(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public /* synthetic */ void m36705t(String str, long j10, long j11) {
            ((InterfaceC11671u) C11172r0.m34928j(this.f30486b)).mo33976j(str, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u */
        public /* synthetic */ void m36706u(String str) {
            ((InterfaceC11671u) C11172r0.m34928j(this.f30486b)).mo33975i(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public /* synthetic */ void m36707v(C12080e c12080e) {
            c12080e.m38806c();
            ((InterfaceC11671u) C11172r0.m34928j(this.f30486b)).mo33974h(c12080e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public /* synthetic */ void m36708w(C12080e c12080e) {
            ((InterfaceC11671u) C11172r0.m34928j(this.f30486b)).mo33979m(c12080e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x */
        public /* synthetic */ void m36709x(C11108u1 c11108u1, C12084i c12084i) {
            ((InterfaceC11671u) C11172r0.m34928j(this.f30486b)).m36691t(c11108u1);
            ((InterfaceC11671u) C11172r0.m34928j(this.f30486b)).mo33972f(c11108u1, c12084i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public /* synthetic */ void m36710y(long j10) {
            ((InterfaceC11671u) C11172r0.m34928j(this.f30486b)).mo33977k(j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public /* synthetic */ void m36711z(boolean z10) {
            ((InterfaceC11671u) C11172r0.m34928j(this.f30486b)).onSkipSilenceEnabledChanged(z10);
        }

        /* renamed from: B */
        public void m36712B(final long j10) {
            Handler handler = this.f30485a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v6.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11671u.a.this.m36710y(j10);
                    }
                });
            }
        }

        /* renamed from: C */
        public void m36713C(final boolean z10) {
            Handler handler = this.f30485a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v6.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11671u.a.this.m36711z(z10);
                    }
                });
            }
        }

        /* renamed from: D */
        public void m36714D(final int i10, final long j10, final long j11) {
            Handler handler = this.f30485a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v6.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11671u.a.this.m36692A(i10, j10, j11);
                    }
                });
            }
        }

        /* renamed from: k */
        public void m36715k(final Exception exc) {
            Handler handler = this.f30485a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v6.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11671u.a.this.m36703r(exc);
                    }
                });
            }
        }

        /* renamed from: l */
        public void m36716l(final Exception exc) {
            Handler handler = this.f30485a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v6.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11671u.a.this.m36704s(exc);
                    }
                });
            }
        }

        /* renamed from: m */
        public void m36717m(final String str, final long j10, final long j11) {
            Handler handler = this.f30485a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v6.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11671u.a.this.m36705t(str, j10, j11);
                    }
                });
            }
        }

        /* renamed from: n */
        public void m36718n(final String str) {
            Handler handler = this.f30485a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v6.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11671u.a.this.m36706u(str);
                    }
                });
            }
        }

        /* renamed from: o */
        public void m36719o(final C12080e c12080e) {
            c12080e.m38806c();
            Handler handler = this.f30485a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v6.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11671u.a.this.m36707v(c12080e);
                    }
                });
            }
        }

        /* renamed from: p */
        public void m36720p(final C12080e c12080e) {
            Handler handler = this.f30485a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v6.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11671u.a.this.m36708w(c12080e);
                    }
                });
            }
        }

        /* renamed from: q */
        public void m36721q(final C11108u1 c11108u1, final C12084i c12084i) {
            Handler handler = this.f30485a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: v6.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11671u.a.this.m36709x(c11108u1, c12084i);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    default void mo33967a(Exception exc) {
    }

    /* renamed from: f */
    default void mo33972f(C11108u1 c11108u1, C12084i c12084i) {
    }

    /* renamed from: h */
    default void mo33974h(C12080e c12080e) {
    }

    /* renamed from: i */
    default void mo33975i(String str) {
    }

    /* renamed from: j */
    default void mo33976j(String str, long j10, long j11) {
    }

    /* renamed from: k */
    default void mo33977k(long j10) {
    }

    /* renamed from: m */
    default void mo33979m(C12080e c12080e) {
    }

    default void onSkipSilenceEnabledChanged(boolean z10) {
    }

    /* renamed from: p */
    default void mo33982p(Exception exc) {
    }

    /* renamed from: q */
    default void mo33983q(int i10, long j10, long j11) {
    }

    @Deprecated
    /* renamed from: t */
    default void m36691t(C11108u1 c11108u1) {
    }
}
