package u8;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import t8.r0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final u8.e f27431a = new u8.e();

    /* renamed from: b, reason: collision with root package name */
    private final b f27432b;

    /* renamed from: c, reason: collision with root package name */
    private final e f27433c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f27434d;

    /* renamed from: e, reason: collision with root package name */
    private Surface f27435e;

    /* renamed from: f, reason: collision with root package name */
    private float f27436f;

    /* renamed from: g, reason: collision with root package name */
    private float f27437g;

    /* renamed from: h, reason: collision with root package name */
    private float f27438h;

    /* renamed from: i, reason: collision with root package name */
    private float f27439i;

    /* renamed from: j, reason: collision with root package name */
    private int f27440j;

    /* renamed from: k, reason: collision with root package name */
    private long f27441k;

    /* renamed from: l, reason: collision with root package name */
    private long f27442l;

    /* renamed from: m, reason: collision with root package name */
    private long f27443m;

    /* renamed from: n, reason: collision with root package name */
    private long f27444n;

    /* renamed from: o, reason: collision with root package name */
    private long f27445o;

    /* renamed from: p, reason: collision with root package name */
    private long f27446p;

    /* renamed from: q, reason: collision with root package name */
    private long f27447q;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(Surface surface, float f10) {
            try {
                surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e10) {
                t8.s.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface b {

        /* loaded from: classes.dex */
        public interface a {
            void a(Display display);
        }

        void a();

        void b(a aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final WindowManager f27448a;

        private c(WindowManager windowManager) {
            this.f27448a = windowManager;
        }

        public static b c(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager);
            }
            return null;
        }

        @Override // u8.n.b
        public void a() {
        }

        @Override // u8.n.b
        public void b(b.a aVar) {
            aVar.a(this.f27448a.getDefaultDisplay());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d implements b, DisplayManager.DisplayListener {

        /* renamed from: a, reason: collision with root package name */
        private final DisplayManager f27449a;

        /* renamed from: b, reason: collision with root package name */
        private b.a f27450b;

        private d(DisplayManager displayManager) {
            this.f27449a = displayManager;
        }

        private Display c() {
            return this.f27449a.getDisplay(0);
        }

        public static b d(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        @Override // u8.n.b
        public void a() {
            this.f27449a.unregisterDisplayListener(this);
            this.f27450b = null;
        }

        @Override // u8.n.b
        public void b(b.a aVar) {
            this.f27450b = aVar;
            this.f27449a.registerDisplayListener(this, r0.w());
            aVar.a(c());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            b.a aVar = this.f27450b;
            if (aVar == null || i10 != 0) {
                return;
            }
            aVar.a(c());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }

    /* loaded from: classes.dex */
    private static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: f, reason: collision with root package name */
        private static final e f27451f = new e();

        /* renamed from: a, reason: collision with root package name */
        public volatile long f27452a = -9223372036854775807L;

        /* renamed from: b, reason: collision with root package name */
        private final Handler f27453b;

        /* renamed from: c, reason: collision with root package name */
        private final HandlerThread f27454c;

        /* renamed from: d, reason: collision with root package name */
        private Choreographer f27455d;

        /* renamed from: e, reason: collision with root package name */
        private int f27456e;

        private e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f27454c = handlerThread;
            handlerThread.start();
            Handler v10 = r0.v(handlerThread.getLooper(), this);
            this.f27453b = v10;
            v10.sendEmptyMessage(0);
        }

        private void b() {
            Choreographer choreographer = this.f27455d;
            if (choreographer != null) {
                int i10 = this.f27456e + 1;
                this.f27456e = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void c() {
            try {
                this.f27455d = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                t8.s.j("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }

        public static e d() {
            return f27451f;
        }

        private void f() {
            Choreographer choreographer = this.f27455d;
            if (choreographer != null) {
                int i10 = this.f27456e - 1;
                this.f27456e = i10;
                if (i10 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f27452a = -9223372036854775807L;
                }
            }
        }

        public void a() {
            this.f27453b.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            this.f27452a = j10;
            ((Choreographer) t8.a.e(this.f27455d)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f27453b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c();
                return true;
            }
            if (i10 == 1) {
                b();
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            f();
            return true;
        }
    }

    public n(Context context) {
        b f10 = f(context);
        this.f27432b = f10;
        this.f27433c = f10 != null ? e.d() : null;
        this.f27441k = -9223372036854775807L;
        this.f27442l = -9223372036854775807L;
        this.f27436f = -1.0f;
        this.f27439i = 1.0f;
        this.f27440j = 0;
    }

    private static boolean c(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    private void d() {
        Surface surface;
        if (r0.f26744a < 30 || (surface = this.f27435e) == null || this.f27440j == Integer.MIN_VALUE || this.f27438h == 0.0f) {
            return;
        }
        this.f27438h = 0.0f;
        a.a(surface, 0.0f);
    }

    private static long e(long j10, long j11, long j12) {
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

    private static b f(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        b d10 = r0.f26744a >= 17 ? d.d(applicationContext) : null;
        return d10 == null ? c.c(applicationContext) : d10;
    }

    private void n() {
        this.f27443m = 0L;
        this.f27446p = -1L;
        this.f27444n = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(Display display) {
        long j10;
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f27441k = refreshRate;
            j10 = (refreshRate * 80) / 100;
        } else {
            t8.s.i("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j10 = -9223372036854775807L;
            this.f27441k = -9223372036854775807L;
        }
        this.f27442l = j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (java.lang.Math.abs(r0 - r7.f27437g) >= (r7.f27431a.e() && (r7.f27431a.d() > 5000000000L ? 1 : (r7.f27431a.d() == 5000000000L ? 0 : -1)) >= 0 ? 0.02f : 1.0f)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
    
        if (r7.f27431a.c() >= 30) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void q() {
        /*
            r7 = this;
            int r0 = t8.r0.f26744a
            r1 = 30
            if (r0 < r1) goto L73
            android.view.Surface r0 = r7.f27435e
            if (r0 != 0) goto Lc
            goto L73
        Lc:
            u8.e r0 = r7.f27431a
            boolean r0 = r0.e()
            if (r0 == 0) goto L1b
            u8.e r0 = r7.f27431a
            float r0 = r0.b()
            goto L1d
        L1b:
            float r0 = r7.f27436f
        L1d:
            float r2 = r7.f27437g
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
            u8.e r1 = r7.f27431a
            boolean r1 = r1.e()
            if (r1 == 0) goto L49
            u8.e r1 = r7.f27431a
            long r1 = r1.d()
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
            float r2 = r7.f27437g
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
            u8.e r2 = r7.f27431a
            int r2 = r2.c()
            if (r2 < r1) goto L5f
        L6c:
            if (r6 == 0) goto L73
            r7.f27437g = r0
            r7.r(r5)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u8.n.q():void");
    }

    private void r(boolean z10) {
        Surface surface;
        float f10;
        if (r0.f26744a < 30 || (surface = this.f27435e) == null || this.f27440j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f27434d) {
            float f11 = this.f27437g;
            if (f11 != -1.0f) {
                f10 = f11 * this.f27439i;
                if (z10 && this.f27438h == f10) {
                    return;
                }
                this.f27438h = f10;
                a.a(surface, f10);
            }
        }
        f10 = 0.0f;
        if (z10) {
        }
        this.f27438h = f10;
        a.a(surface, f10);
    }

    public long b(long j10) {
        long j11;
        e eVar;
        if (this.f27446p != -1 && this.f27431a.e()) {
            long a10 = this.f27447q + (((float) (this.f27431a.a() * (this.f27443m - this.f27446p))) / this.f27439i);
            if (c(j10, a10)) {
                j11 = a10;
                this.f27444n = this.f27443m;
                this.f27445o = j11;
                eVar = this.f27433c;
                if (eVar != null || this.f27441k == -9223372036854775807L) {
                    return j11;
                }
                long j12 = eVar.f27452a;
                return j12 == -9223372036854775807L ? j11 : e(j11, j12, this.f27441k) - this.f27442l;
            }
            n();
        }
        j11 = j10;
        this.f27444n = this.f27443m;
        this.f27445o = j11;
        eVar = this.f27433c;
        if (eVar != null) {
        }
        return j11;
    }

    public void g(float f10) {
        this.f27436f = f10;
        this.f27431a.g();
        q();
    }

    public void h(long j10) {
        long j11 = this.f27444n;
        if (j11 != -1) {
            this.f27446p = j11;
            this.f27447q = this.f27445o;
        }
        this.f27443m++;
        this.f27431a.f(j10 * 1000);
        q();
    }

    public void i(float f10) {
        this.f27439i = f10;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.f27434d = true;
        n();
        if (this.f27432b != null) {
            ((e) t8.a.e(this.f27433c)).a();
            this.f27432b.b(new b.a() { // from class: u8.l
                @Override // u8.n.b.a
                public final void a(Display display) {
                    n.this.p(display);
                }
            });
        }
        r(false);
    }

    public void l() {
        this.f27434d = false;
        b bVar = this.f27432b;
        if (bVar != null) {
            bVar.a();
            ((e) t8.a.e(this.f27433c)).e();
        }
        d();
    }

    public void m(Surface surface) {
        if (surface instanceof j) {
            surface = null;
        }
        if (this.f27435e == surface) {
            return;
        }
        d();
        this.f27435e = surface;
        r(true);
    }

    public void o(int i10) {
        if (this.f27440j == i10) {
            return;
        }
        this.f27440j = i10;
        r(true);
    }
}
