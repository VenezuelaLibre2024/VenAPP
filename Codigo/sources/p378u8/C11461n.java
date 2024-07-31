package p378u8;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import p363t8.C11137a;
import p363t8.C11172r0;
import p363t8.C11173s;

/* renamed from: u8.n */
/* loaded from: classes.dex */
public final class C11461n {

    /* renamed from: a */
    private final C11452e f29747a = new C11452e();

    /* renamed from: b */
    private final b f29748b;

    /* renamed from: c */
    private final e f29749c;

    /* renamed from: d */
    private boolean f29750d;

    /* renamed from: e */
    private Surface f29751e;

    /* renamed from: f */
    private float f29752f;

    /* renamed from: g */
    private float f29753g;

    /* renamed from: h */
    private float f29754h;

    /* renamed from: i */
    private float f29755i;

    /* renamed from: j */
    private int f29756j;

    /* renamed from: k */
    private long f29757k;

    /* renamed from: l */
    private long f29758l;

    /* renamed from: m */
    private long f29759m;

    /* renamed from: n */
    private long f29760n;

    /* renamed from: o */
    private long f29761o;

    /* renamed from: p */
    private long f29762p;

    /* renamed from: q */
    private long f29763q;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u8.n$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        public static void m35865a(Surface surface, float f10) {
            try {
                surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e10) {
                C11173s.m34965d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u8.n$b */
    /* loaded from: classes.dex */
    public interface b {

        /* renamed from: u8.n$b$a */
        /* loaded from: classes.dex */
        public interface a {
            /* renamed from: a */
            void mo35845a(Display display);
        }

        /* renamed from: a */
        void mo35866a();

        /* renamed from: b */
        void mo35867b(a aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u8.n$c */
    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a */
        private final WindowManager f29764a;

        private c(WindowManager windowManager) {
            this.f29764a = windowManager;
        }

        /* renamed from: c */
        public static b m35868c(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager);
            }
            return null;
        }

        @Override // p378u8.C11461n.b
        /* renamed from: a */
        public void mo35866a() {
        }

        @Override // p378u8.C11461n.b
        /* renamed from: b */
        public void mo35867b(b.a aVar) {
            aVar.mo35845a(this.f29764a.getDefaultDisplay());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u8.n$d */
    /* loaded from: classes.dex */
    public static final class d implements b, DisplayManager.DisplayListener {

        /* renamed from: a */
        private final DisplayManager f29765a;

        /* renamed from: b */
        private b.a f29766b;

        private d(DisplayManager displayManager) {
            this.f29765a = displayManager;
        }

        /* renamed from: c */
        private Display m35869c() {
            return this.f29765a.getDisplay(0);
        }

        /* renamed from: d */
        public static b m35870d(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        @Override // p378u8.C11461n.b
        /* renamed from: a */
        public void mo35866a() {
            this.f29765a.unregisterDisplayListener(this);
            this.f29766b = null;
        }

        @Override // p378u8.C11461n.b
        /* renamed from: b */
        public void mo35867b(b.a aVar) {
            this.f29766b = aVar;
            this.f29765a.registerDisplayListener(this, C11172r0.m34954w());
            aVar.mo35845a(m35869c());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            b.a aVar = this.f29766b;
            if (aVar == null || i10 != 0) {
                return;
            }
            aVar.mo35845a(m35869c());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }

    /* renamed from: u8.n$e */
    /* loaded from: classes.dex */
    private static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: f */
        private static final e f29767f = new e();

        /* renamed from: a */
        public volatile long f29768a = -9223372036854775807L;

        /* renamed from: b */
        private final Handler f29769b;

        /* renamed from: c */
        private final HandlerThread f29770c;

        /* renamed from: d */
        private Choreographer f29771d;

        /* renamed from: e */
        private int f29772e;

        private e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f29770c = handlerThread;
            handlerThread.start();
            Handler m34952v = C11172r0.m34952v(handlerThread.getLooper(), this);
            this.f29769b = m34952v;
            m34952v.sendEmptyMessage(0);
        }

        /* renamed from: b */
        private void m35871b() {
            Choreographer choreographer = this.f29771d;
            if (choreographer != null) {
                int i10 = this.f29772e + 1;
                this.f29772e = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        /* renamed from: c */
        private void m35872c() {
            try {
                this.f29771d = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                C11173s.m34971j("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }

        /* renamed from: d */
        public static e m35873d() {
            return f29767f;
        }

        /* renamed from: f */
        private void m35874f() {
            Choreographer choreographer = this.f29771d;
            if (choreographer != null) {
                int i10 = this.f29772e - 1;
                this.f29772e = i10;
                if (i10 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f29768a = -9223372036854775807L;
                }
            }
        }

        /* renamed from: a */
        public void m35875a() {
            this.f29769b.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            this.f29768a = j10;
            ((Choreographer) C11137a.m34603e(this.f29771d)).postFrameCallbackDelayed(this, 500L);
        }

        /* renamed from: e */
        public void m35876e() {
            this.f29769b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                m35872c();
                return true;
            }
            if (i10 == 1) {
                m35871b();
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            m35874f();
            return true;
        }
    }

    public C11461n(Context context) {
        b m35851f = m35851f(context);
        this.f29748b = m35851f;
        this.f29749c = m35851f != null ? e.m35873d() : null;
        this.f29757k = -9223372036854775807L;
        this.f29758l = -9223372036854775807L;
        this.f29752f = -1.0f;
        this.f29755i = 1.0f;
        this.f29756j = 0;
    }

    /* renamed from: c */
    private static boolean m35848c(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    /* renamed from: d */
    private void m35849d() {
        Surface surface;
        if (C11172r0.f29040a < 30 || (surface = this.f29751e) == null || this.f29756j == Integer.MIN_VALUE || this.f29754h == 0.0f) {
            return;
        }
        this.f29754h = 0.0f;
        a.m35865a(surface, 0.0f);
    }

    /* renamed from: e */
    private static long m35850e(long j10, long j11, long j12) {
        long j13;
        long j14 = j11 + (((j10 - j11) / j12) * j12);
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            j14 = j12 + j14;
            j13 = j14;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    /* renamed from: f */
    private static b m35851f(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        b m35870d = C11172r0.f29040a >= 17 ? d.m35870d(applicationContext) : null;
        return m35870d == null ? c.m35868c(applicationContext) : m35870d;
    }

    /* renamed from: n */
    private void m35852n() {
        this.f29759m = 0L;
        this.f29762p = -1L;
        this.f29760n = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m35853p(Display display) {
        long j10;
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f29757k = refreshRate;
            j10 = (refreshRate * 80) / 100;
        } else {
            C11173s.m34970i("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j10 = -9223372036854775807L;
            this.f29757k = -9223372036854775807L;
        }
        this.f29758l = j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (java.lang.Math.abs(r0 - r7.f29753g) >= (r7.f29747a.m35781e() && (r7.f29747a.m35780d() > 5000000000L ? 1 : (r7.f29747a.m35780d() == 5000000000L ? 0 : -1)) >= 0 ? 0.02f : 1.0f)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
    
        if (r7.f29747a.m35779c() >= 30) goto L35;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m35854q() {
        /*
            r7 = this;
            int r0 = p363t8.C11172r0.f29040a
            r1 = 30
            if (r0 < r1) goto L73
            android.view.Surface r0 = r7.f29751e
            if (r0 != 0) goto Lc
            goto L73
        Lc:
            u8.e r0 = r7.f29747a
            boolean r0 = r0.m35781e()
            if (r0 == 0) goto L1b
            u8.e r0 = r7.f29747a
            float r0 = r0.m35778b()
            goto L1d
        L1b:
            float r0 = r7.f29752f
        L1d:
            float r2 = r7.f29753g
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L24
            return
        L24:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L61
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L61
            u8.e r1 = r7.f29747a
            boolean r1 = r1.m35781e()
            if (r1 == 0) goto L49
            u8.e r1 = r7.f29747a
            long r1 = r1.m35780d()
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L49
            r1 = r6
            goto L4a
        L49:
            r1 = r5
        L4a:
            if (r1 == 0) goto L50
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L52
        L50:
            r1 = 1065353216(0x3f800000, float:1.0)
        L52:
            float r2 = r7.f29753g
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L5f
            goto L6c
        L5f:
            r6 = r5
            goto L6c
        L61:
            if (r4 == 0) goto L64
            goto L6c
        L64:
            u8.e r2 = r7.f29747a
            int r2 = r2.m35779c()
            if (r2 < r1) goto L5f
        L6c:
            if (r6 == 0) goto L73
            r7.f29753g = r0
            r7.m35855r(r5)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p378u8.C11461n.m35854q():void");
    }

    /* renamed from: r */
    private void m35855r(boolean z10) {
        Surface surface;
        float f10;
        if (C11172r0.f29040a < 30 || (surface = this.f29751e) == null || this.f29756j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f29750d) {
            float f11 = this.f29753g;
            if (f11 != -1.0f) {
                f10 = f11 * this.f29755i;
                if (z10 && this.f29754h == f10) {
                    return;
                }
                this.f29754h = f10;
                a.m35865a(surface, f10);
            }
        }
        f10 = 0.0f;
        if (z10) {
        }
        this.f29754h = f10;
        a.m35865a(surface, f10);
    }

    /* renamed from: b */
    public long m35856b(long j10) {
        long j11;
        e eVar;
        if (this.f29762p != -1 && this.f29747a.m35781e()) {
            long m35777a = this.f29763q + (((float) (this.f29747a.m35777a() * (this.f29759m - this.f29762p))) / this.f29755i);
            if (m35848c(j10, m35777a)) {
                j11 = m35777a;
                this.f29760n = this.f29759m;
                this.f29761o = j11;
                eVar = this.f29749c;
                if (eVar != null || this.f29757k == -9223372036854775807L) {
                    return j11;
                }
                long j12 = eVar.f29768a;
                return j12 == -9223372036854775807L ? j11 : m35850e(j11, j12, this.f29757k) - this.f29758l;
            }
            m35852n();
        }
        j11 = j10;
        this.f29760n = this.f29759m;
        this.f29761o = j11;
        eVar = this.f29749c;
        if (eVar != null) {
        }
        return j11;
    }

    /* renamed from: g */
    public void m35857g(float f10) {
        this.f29752f = f10;
        this.f29747a.m35783g();
        m35854q();
    }

    /* renamed from: h */
    public void m35858h(long j10) {
        long j11 = this.f29760n;
        if (j11 != -1) {
            this.f29762p = j11;
            this.f29763q = this.f29761o;
        }
        this.f29759m++;
        this.f29747a.m35782f(j10 * 1000);
        m35854q();
    }

    /* renamed from: i */
    public void m35859i(float f10) {
        this.f29755i = f10;
        m35852n();
        m35855r(false);
    }

    /* renamed from: j */
    public void m35860j() {
        m35852n();
    }

    /* renamed from: k */
    public void m35861k() {
        this.f29750d = true;
        m35852n();
        if (this.f29748b != null) {
            ((e) C11137a.m34603e(this.f29749c)).m35875a();
            this.f29748b.mo35867b(new b.a() { // from class: u8.l
                @Override // p378u8.C11461n.b.a
                /* renamed from: a */
                public final void mo35845a(Display display) {
                    C11461n.this.m35853p(display);
                }
            });
        }
        m35855r(false);
    }

    /* renamed from: l */
    public void m35862l() {
        this.f29750d = false;
        b bVar = this.f29748b;
        if (bVar != null) {
            bVar.mo35866a();
            ((e) C11137a.m34603e(this.f29749c)).m35876e();
        }
        m35849d();
    }

    /* renamed from: m */
    public void m35863m(Surface surface) {
        if (surface instanceof C11457j) {
            surface = null;
        }
        if (this.f29751e == surface) {
            return;
        }
        m35849d();
        this.f29751e = surface;
        m35855r(true);
    }

    /* renamed from: o */
    public void m35864o(int i10) {
        if (this.f29756j == i10) {
            return;
        }
        this.f29756j = i10;
        m35855r(true);
    }
}
