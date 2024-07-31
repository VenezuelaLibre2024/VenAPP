package s8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import t8.o0;
import t8.r0;

/* loaded from: classes.dex */
public final class e0 implements f0 {

    /* renamed from: d, reason: collision with root package name */
    public static final c f25218d = h(false, -9223372036854775807L);

    /* renamed from: e, reason: collision with root package name */
    public static final c f25219e = h(true, -9223372036854775807L);

    /* renamed from: f, reason: collision with root package name */
    public static final c f25220f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f25221g;

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f25222a;

    /* renamed from: b, reason: collision with root package name */
    private d<? extends e> f25223b;

    /* renamed from: c, reason: collision with root package name */
    private IOException f25224c;

    /* loaded from: classes.dex */
    public interface b<T extends e> {
        c h(T t10, long j10, long j11, IOException iOException, int i10);

        void i(T t10, long j10, long j11, boolean z10);

        void m(T t10, long j10, long j11);
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final int f25225a;

        /* renamed from: b, reason: collision with root package name */
        private final long f25226b;

        private c(int i10, long j10) {
            this.f25225a = i10;
            this.f25226b = j10;
        }

        public boolean c() {
            int i10 = this.f25225a;
            return i10 == 0 || i10 == 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class d<T extends e> extends Handler implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final int f25227a;

        /* renamed from: b, reason: collision with root package name */
        private final T f25228b;

        /* renamed from: c, reason: collision with root package name */
        private final long f25229c;

        /* renamed from: d, reason: collision with root package name */
        private b<T> f25230d;

        /* renamed from: e, reason: collision with root package name */
        private IOException f25231e;

        /* renamed from: f, reason: collision with root package name */
        private int f25232f;

        /* renamed from: r, reason: collision with root package name */
        private Thread f25233r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f25234s;

        /* renamed from: t, reason: collision with root package name */
        private volatile boolean f25235t;

        public d(Looper looper, T t10, b<T> bVar, int i10, long j10) {
            super(looper);
            this.f25228b = t10;
            this.f25230d = bVar;
            this.f25227a = i10;
            this.f25229c = j10;
        }

        private void b() {
            this.f25231e = null;
            e0.this.f25222a.execute((Runnable) t8.a.e(e0.this.f25223b));
        }

        private void c() {
            e0.this.f25223b = null;
        }

        private long d() {
            return Math.min((this.f25232f - 1) * AdError.NETWORK_ERROR_CODE, 5000);
        }

        public void a(boolean z10) {
            this.f25235t = z10;
            this.f25231e = null;
            if (hasMessages(0)) {
                this.f25234s = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f25234s = true;
                    this.f25228b.c();
                    Thread thread = this.f25233r;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z10) {
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((b) t8.a.e(this.f25230d)).i(this.f25228b, elapsedRealtime, elapsedRealtime - this.f25229c, true);
                this.f25230d = null;
            }
        }

        public void e(int i10) {
            IOException iOException = this.f25231e;
            if (iOException != null && this.f25232f > i10) {
                throw iOException;
            }
        }

        public void f(long j10) {
            t8.a.g(e0.this.f25223b == null);
            e0.this.f25223b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f25235t) {
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                b();
                return;
            }
            if (i10 == 3) {
                throw ((Error) message.obj);
            }
            c();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f25229c;
            b bVar = (b) t8.a.e(this.f25230d);
            if (this.f25234s) {
                bVar.i(this.f25228b, elapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 1) {
                try {
                    bVar.m(this.f25228b, elapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    t8.s.d("LoadTask", "Unexpected exception handling load completed", e10);
                    e0.this.f25224c = new h(e10);
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f25231e = iOException;
            int i12 = this.f25232f + 1;
            this.f25232f = i12;
            c h10 = bVar.h(this.f25228b, elapsedRealtime, j10, iOException, i12);
            if (h10.f25225a == 3) {
                e0.this.f25224c = this.f25231e;
            } else if (h10.f25225a != 2) {
                if (h10.f25225a == 1) {
                    this.f25232f = 1;
                }
                f(h10.f25226b != -9223372036854775807L ? h10.f25226b : d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar;
            Message obtainMessage;
            boolean z10;
            try {
                synchronized (this) {
                    z10 = !this.f25234s;
                    this.f25233r = Thread.currentThread();
                }
                if (z10) {
                    o0.a("load:" + this.f25228b.getClass().getSimpleName());
                    try {
                        this.f25228b.b();
                        o0.c();
                    } catch (Throwable th2) {
                        o0.c();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f25233r = null;
                    Thread.interrupted();
                }
                if (this.f25235t) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e10) {
                if (this.f25235t) {
                    return;
                }
                obtainMessage = obtainMessage(2, e10);
                obtainMessage.sendToTarget();
            } catch (Exception e11) {
                if (this.f25235t) {
                    return;
                }
                t8.s.d("LoadTask", "Unexpected exception loading stream", e11);
                hVar = new h(e11);
                obtainMessage = obtainMessage(2, hVar);
                obtainMessage.sendToTarget();
            } catch (OutOfMemoryError e12) {
                if (this.f25235t) {
                    return;
                }
                t8.s.d("LoadTask", "OutOfMemory error loading stream", e12);
                hVar = new h(e12);
                obtainMessage = obtainMessage(2, hVar);
                obtainMessage.sendToTarget();
            } catch (Error e13) {
                if (!this.f25235t) {
                    t8.s.d("LoadTask", "Unexpected error loading stream", e13);
                    obtainMessage(3, e13).sendToTarget();
                }
                throw e13;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void b();

        void c();
    }

    /* loaded from: classes.dex */
    public interface f {
        void n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final f f25237a;

        public g(f fVar) {
            this.f25237a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f25237a.n();
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends IOException {
        public h(Throwable th2) {
            super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
        }
    }

    static {
        long j10 = -9223372036854775807L;
        f25220f = new c(2, j10);
        f25221g = new c(3, j10);
    }

    public e0(String str) {
        this.f25222a = r0.D0("ExoPlayer:Loader:" + str);
    }

    public static c h(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    @Override // s8.f0
    public void a() {
        k(Integer.MIN_VALUE);
    }

    public void f() {
        ((d) t8.a.i(this.f25223b)).a(false);
    }

    public void g() {
        this.f25224c = null;
    }

    public boolean i() {
        return this.f25224c != null;
    }

    public boolean j() {
        return this.f25223b != null;
    }

    public void k(int i10) {
        IOException iOException = this.f25224c;
        if (iOException != null) {
            throw iOException;
        }
        d<? extends e> dVar = this.f25223b;
        if (dVar != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = dVar.f25227a;
            }
            dVar.e(i10);
        }
    }

    public void l() {
        m(null);
    }

    public void m(f fVar) {
        d<? extends e> dVar = this.f25223b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f25222a.execute(new g(fVar));
        }
        this.f25222a.shutdown();
    }

    public <T extends e> long n(T t10, b<T> bVar, int i10) {
        Looper looper = (Looper) t8.a.i(Looper.myLooper());
        this.f25224c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, t10, bVar, i10, elapsedRealtime).f(0L);
        return elapsedRealtime;
    }
}
