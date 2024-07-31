package p351s8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import p363t8.C11137a;
import p363t8.C11166o0;
import p363t8.C11172r0;
import p363t8.C11173s;

/* renamed from: s8.e0 */
/* loaded from: classes.dex */
public final class C10818e0 implements InterfaceC10820f0 {

    /* renamed from: d */
    public static final c f27337d = m32976h(false, -9223372036854775807L);

    /* renamed from: e */
    public static final c f27338e = m32976h(true, -9223372036854775807L);

    /* renamed from: f */
    public static final c f27339f;

    /* renamed from: g */
    public static final c f27340g;

    /* renamed from: a */
    private final ExecutorService f27341a;

    /* renamed from: b */
    private d<? extends e> f27342b;

    /* renamed from: c */
    private IOException f27343c;

    /* renamed from: s8.e0$b */
    /* loaded from: classes.dex */
    public interface b<T extends e> {
        /* renamed from: h */
        c mo311h(T t10, long j10, long j11, IOException iOException, int i10);

        /* renamed from: i */
        void mo313i(T t10, long j10, long j11, boolean z10);

        /* renamed from: m */
        void mo317m(T t10, long j10, long j11);
    }

    /* renamed from: s8.e0$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        private final int f27344a;

        /* renamed from: b */
        private final long f27345b;

        private c(int i10, long j10) {
            this.f27344a = i10;
            this.f27345b = j10;
        }

        /* renamed from: c */
        public boolean m32987c() {
            int i10 = this.f27344a;
            return i10 == 0 || i10 == 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s8.e0$d */
    /* loaded from: classes.dex */
    public final class d<T extends e> extends Handler implements Runnable {

        /* renamed from: a */
        public final int f27346a;

        /* renamed from: b */
        private final T f27347b;

        /* renamed from: c */
        private final long f27348c;

        /* renamed from: d */
        private b<T> f27349d;

        /* renamed from: e */
        private IOException f27350e;

        /* renamed from: f */
        private int f27351f;

        /* renamed from: r */
        private Thread f27352r;

        /* renamed from: s */
        private boolean f27353s;

        /* renamed from: t */
        private volatile boolean f27354t;

        public d(Looper looper, T t10, b<T> bVar, int i10, long j10) {
            super(looper);
            this.f27347b = t10;
            this.f27349d = bVar;
            this.f27346a = i10;
            this.f27348c = j10;
        }

        /* renamed from: b */
        private void m32988b() {
            this.f27350e = null;
            C10818e0.this.f27341a.execute((Runnable) C11137a.m34603e(C10818e0.this.f27342b));
        }

        /* renamed from: c */
        private void m32989c() {
            C10818e0.this.f27342b = null;
        }

        /* renamed from: d */
        private long m32990d() {
            return Math.min((this.f27351f - 1) * AdError.NETWORK_ERROR_CODE, 5000);
        }

        /* renamed from: a */
        public void m32991a(boolean z10) {
            this.f27354t = z10;
            this.f27350e = null;
            if (hasMessages(0)) {
                this.f27353s = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f27353s = true;
                    this.f27347b.mo224c();
                    Thread thread = this.f27352r;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z10) {
                m32989c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((b) C11137a.m34603e(this.f27349d)).mo313i(this.f27347b, elapsedRealtime, elapsedRealtime - this.f27348c, true);
                this.f27349d = null;
            }
        }

        /* renamed from: e */
        public void m32992e(int i10) {
            IOException iOException = this.f27350e;
            if (iOException != null && this.f27351f > i10) {
                throw iOException;
            }
        }

        /* renamed from: f */
        public void m32993f(long j10) {
            C11137a.m34605g(C10818e0.this.f27342b == null);
            C10818e0.this.f27342b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
            } else {
                m32988b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f27354t) {
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                m32988b();
                return;
            }
            if (i10 == 3) {
                throw ((Error) message.obj);
            }
            m32989c();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f27348c;
            b bVar = (b) C11137a.m34603e(this.f27349d);
            if (this.f27353s) {
                bVar.mo313i(this.f27347b, elapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 1) {
                try {
                    bVar.mo317m(this.f27347b, elapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    C11173s.m34965d("LoadTask", "Unexpected exception handling load completed", e10);
                    C10818e0.this.f27343c = new h(e10);
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f27350e = iOException;
            int i12 = this.f27351f + 1;
            this.f27351f = i12;
            c mo311h = bVar.mo311h(this.f27347b, elapsedRealtime, j10, iOException, i12);
            if (mo311h.f27344a == 3) {
                C10818e0.this.f27343c = this.f27350e;
            } else if (mo311h.f27344a != 2) {
                if (mo311h.f27344a == 1) {
                    this.f27351f = 1;
                }
                m32993f(mo311h.f27345b != -9223372036854775807L ? mo311h.f27345b : m32990d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar;
            Message obtainMessage;
            boolean z10;
            try {
                synchronized (this) {
                    z10 = !this.f27353s;
                    this.f27352r = Thread.currentThread();
                }
                if (z10) {
                    C11166o0.m34831a("load:" + this.f27347b.getClass().getSimpleName());
                    try {
                        this.f27347b.mo223b();
                        C11166o0.m34833c();
                    } catch (Throwable th2) {
                        C11166o0.m34833c();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f27352r = null;
                    Thread.interrupted();
                }
                if (this.f27354t) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e10) {
                if (this.f27354t) {
                    return;
                }
                obtainMessage = obtainMessage(2, e10);
                obtainMessage.sendToTarget();
            } catch (Exception e11) {
                if (this.f27354t) {
                    return;
                }
                C11173s.m34965d("LoadTask", "Unexpected exception loading stream", e11);
                hVar = new h(e11);
                obtainMessage = obtainMessage(2, hVar);
                obtainMessage.sendToTarget();
            } catch (OutOfMemoryError e12) {
                if (this.f27354t) {
                    return;
                }
                C11173s.m34965d("LoadTask", "OutOfMemory error loading stream", e12);
                hVar = new h(e12);
                obtainMessage = obtainMessage(2, hVar);
                obtainMessage.sendToTarget();
            } catch (Error e13) {
                if (!this.f27354t) {
                    C11173s.m34965d("LoadTask", "Unexpected error loading stream", e13);
                    obtainMessage(3, e13).sendToTarget();
                }
                throw e13;
            }
        }
    }

    /* renamed from: s8.e0$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: b */
        void mo223b();

        /* renamed from: c */
        void mo224c();
    }

    /* renamed from: s8.e0$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: n */
        void mo319n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s8.e0$g */
    /* loaded from: classes.dex */
    public static final class g implements Runnable {

        /* renamed from: a */
        private final f f27356a;

        public g(f fVar) {
            this.f27356a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f27356a.mo319n();
        }
    }

    /* renamed from: s8.e0$h */
    /* loaded from: classes.dex */
    public static final class h extends IOException {
        public h(Throwable th2) {
            super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
        }
    }

    static {
        long j10 = -9223372036854775807L;
        f27339f = new c(2, j10);
        f27340g = new c(3, j10);
    }

    public C10818e0(String str) {
        this.f27341a = C11172r0.m34863D0("ExoPlayer:Loader:" + str);
    }

    /* renamed from: h */
    public static c m32976h(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    @Override // p351s8.InterfaceC10820f0
    /* renamed from: a */
    public void mo11869a() {
        m32981k(Integer.MIN_VALUE);
    }

    /* renamed from: f */
    public void m32977f() {
        ((d) C11137a.m34607i(this.f27342b)).m32991a(false);
    }

    /* renamed from: g */
    public void m32978g() {
        this.f27343c = null;
    }

    /* renamed from: i */
    public boolean m32979i() {
        return this.f27343c != null;
    }

    /* renamed from: j */
    public boolean m32980j() {
        return this.f27342b != null;
    }

    /* renamed from: k */
    public void m32981k(int i10) {
        IOException iOException = this.f27343c;
        if (iOException != null) {
            throw iOException;
        }
        d<? extends e> dVar = this.f27342b;
        if (dVar != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = dVar.f27346a;
            }
            dVar.m32992e(i10);
        }
    }

    /* renamed from: l */
    public void m32982l() {
        m32983m(null);
    }

    /* renamed from: m */
    public void m32983m(f fVar) {
        d<? extends e> dVar = this.f27342b;
        if (dVar != null) {
            dVar.m32991a(true);
        }
        if (fVar != null) {
            this.f27341a.execute(new g(fVar));
        }
        this.f27341a.shutdown();
    }

    /* renamed from: n */
    public <T extends e> long m32984n(T t10, b<T> bVar, int i10) {
        Looper looper = (Looper) C11137a.m34607i(Looper.myLooper());
        this.f27343c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, t10, bVar, i10, elapsedRealtime).m32993f(0L);
        return elapsedRealtime;
    }
}
