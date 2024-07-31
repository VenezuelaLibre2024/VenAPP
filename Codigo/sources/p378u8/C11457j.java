package p378u8;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import p363t8.C11137a;
import p363t8.C11163n;
import p363t8.C11173s;
import p363t8.RunnableC11155j;

/* renamed from: u8.j */
/* loaded from: classes.dex */
public final class C11457j extends Surface {

    /* renamed from: d */
    private static int f29736d;

    /* renamed from: e */
    private static boolean f29737e;

    /* renamed from: a */
    public final boolean f29738a;

    /* renamed from: b */
    private final b f29739b;

    /* renamed from: c */
    private boolean f29740c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u8.j$b */
    /* loaded from: classes.dex */
    public static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: a */
        private RunnableC11155j f29741a;

        /* renamed from: b */
        private Handler f29742b;

        /* renamed from: c */
        private Error f29743c;

        /* renamed from: d */
        private RuntimeException f29744d;

        /* renamed from: e */
        private C11457j f29745e;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        /* renamed from: b */
        private void m35841b(int i10) {
            C11137a.m34603e(this.f29741a);
            this.f29741a.m34752h(i10);
            this.f29745e = new C11457j(this, this.f29741a.m34751g(), i10 != 0);
        }

        /* renamed from: d */
        private void m35842d() {
            C11137a.m34603e(this.f29741a);
            this.f29741a.m34753i();
        }

        /* renamed from: a */
        public C11457j m35843a(int i10) {
            boolean z10;
            start();
            this.f29742b = new Handler(getLooper(), this);
            this.f29741a = new RunnableC11155j(this.f29742b);
            synchronized (this) {
                z10 = false;
                this.f29742b.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f29745e == null && this.f29744d == null && this.f29743c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f29744d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f29743c;
            if (error == null) {
                return (C11457j) C11137a.m34603e(this.f29745e);
            }
            throw error;
        }

        /* renamed from: c */
        public void m35844c() {
            C11137a.m34603e(this.f29742b);
            this.f29742b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        m35842d();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    try {
                        m35841b(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                    } catch (Error e10) {
                        C11173s.m34965d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                        this.f29743c = e10;
                        synchronized (this) {
                            notify();
                        }
                    } catch (RuntimeException e11) {
                        C11173s.m34965d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                        this.f29744d = e11;
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (C11163n.a e12) {
                    C11173s.m34965d("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.f29744d = new IllegalStateException(e12);
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }
    }

    private C11457j(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f29739b = bVar;
        this.f29738a = z10;
    }

    /* renamed from: a */
    private static int m35838a(Context context) {
        if (C11163n.m34818h(context)) {
            return C11163n.m34819i() ? 1 : 2;
        }
        return 0;
    }

    /* renamed from: b */
    public static synchronized boolean m35839b(Context context) {
        boolean z10;
        synchronized (C11457j.class) {
            if (!f29737e) {
                f29736d = m35838a(context);
                f29737e = true;
            }
            z10 = f29736d != 0;
        }
        return z10;
    }

    /* renamed from: c */
    public static C11457j m35840c(Context context, boolean z10) {
        C11137a.m34605g(!z10 || m35839b(context));
        return new b().m35843a(z10 ? f29736d : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f29739b) {
            if (!this.f29740c) {
                this.f29739b.m35844c();
                this.f29740c = true;
            }
        }
    }
}
