package u8;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import t8.n;

/* loaded from: classes.dex */
public final class j extends Surface {

    /* renamed from: d, reason: collision with root package name */
    private static int f27420d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f27421e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f27422a;

    /* renamed from: b, reason: collision with root package name */
    private final b f27423b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f27424c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        private t8.j f27425a;

        /* renamed from: b, reason: collision with root package name */
        private Handler f27426b;

        /* renamed from: c, reason: collision with root package name */
        private Error f27427c;

        /* renamed from: d, reason: collision with root package name */
        private RuntimeException f27428d;

        /* renamed from: e, reason: collision with root package name */
        private j f27429e;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void b(int i10) {
            t8.a.e(this.f27425a);
            this.f27425a.h(i10);
            this.f27429e = new j(this, this.f27425a.g(), i10 != 0);
        }

        private void d() {
            t8.a.e(this.f27425a);
            this.f27425a.i();
        }

        public j a(int i10) {
            boolean z10;
            start();
            this.f27426b = new Handler(getLooper(), this);
            this.f27425a = new t8.j(this.f27426b);
            synchronized (this) {
                z10 = false;
                this.f27426b.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f27429e == null && this.f27428d == null && this.f27427c == null) {
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
            RuntimeException runtimeException = this.f27428d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f27427c;
            if (error == null) {
                return (j) t8.a.e(this.f27429e);
            }
            throw error;
        }

        public void c() {
            t8.a.e(this.f27426b);
            this.f27426b.sendEmptyMessage(2);
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
                        d();
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
                        b(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                    } catch (Error e10) {
                        t8.s.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                        this.f27427c = e10;
                        synchronized (this) {
                            notify();
                        }
                    } catch (RuntimeException e11) {
                        t8.s.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                        this.f27428d = e11;
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (n.a e12) {
                    t8.s.d("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.f27428d = new IllegalStateException(e12);
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

    private j(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f27423b = bVar;
        this.f27422a = z10;
    }

    private static int a(Context context) {
        if (t8.n.h(context)) {
            return t8.n.i() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (j.class) {
            if (!f27421e) {
                f27420d = a(context);
                f27421e = true;
            }
            z10 = f27420d != 0;
        }
        return z10;
    }

    public static j c(Context context, boolean z10) {
        t8.a.g(!z10 || b(context));
        return new b().a(z10 ? f27420d : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f27423b) {
            if (!this.f27424c) {
                this.f27423b.c();
                this.f27424c = true;
            }
        }
    }
}
