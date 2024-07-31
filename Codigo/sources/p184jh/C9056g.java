package p184jh;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import p162ig.C7979k;
import p163ih.C7999p;
import p163ih.C8001r;

/* renamed from: jh.g */
/* loaded from: classes3.dex */
public class C9056g {

    /* renamed from: n */
    private static final String f21690n = "g";

    /* renamed from: a */
    private C9060k f21691a;

    /* renamed from: b */
    private C9059j f21692b;

    /* renamed from: c */
    private C9057h f21693c;

    /* renamed from: d */
    private Handler f21694d;

    /* renamed from: e */
    private C9062m f21695e;

    /* renamed from: h */
    private Handler f21698h;

    /* renamed from: f */
    private boolean f21696f = false;

    /* renamed from: g */
    private boolean f21697g = true;

    /* renamed from: i */
    private C9058i f21699i = new C9058i();

    /* renamed from: j */
    private Runnable f21700j = new a();

    /* renamed from: k */
    private Runnable f21701k = new b();

    /* renamed from: l */
    private Runnable f21702l = new c();

    /* renamed from: m */
    private Runnable f21703m = new d();

    /* renamed from: jh.g$a */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(C9056g.f21690n, "Opening camera");
                C9056g.this.f21693c.m26631l();
            } catch (Exception e10) {
                C9056g.this.m26604t(e10);
                Log.e(C9056g.f21690n, "Failed to open camera", e10);
            }
        }
    }

    /* renamed from: jh.g$b */
    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(C9056g.f21690n, "Configuring camera");
                C9056g.this.f21693c.m26626e();
                if (C9056g.this.f21694d != null) {
                    C9056g.this.f21694d.obtainMessage(C7979k.f19402j, C9056g.this.m26600o()).sendToTarget();
                }
            } catch (Exception e10) {
                C9056g.this.m26604t(e10);
                Log.e(C9056g.f21690n, "Failed to configure camera", e10);
            }
        }
    }

    /* renamed from: jh.g$c */
    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(C9056g.f21690n, "Starting preview");
                C9056g.this.f21693c.m26635s(C9056g.this.f21692b);
                C9056g.this.f21693c.m26637u();
            } catch (Exception e10) {
                C9056g.this.m26604t(e10);
                Log.e(C9056g.f21690n, "Failed to start preview", e10);
            }
        }
    }

    /* renamed from: jh.g$d */
    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(C9056g.f21690n, "Closing camera");
                C9056g.this.f21693c.m26638v();
                C9056g.this.f21693c.m26625d();
            } catch (Exception e10) {
                Log.e(C9056g.f21690n, "Failed to close camera", e10);
            }
            C9056g.this.f21697g = true;
            C9056g.this.f21694d.sendEmptyMessage(C7979k.f19395c);
            C9056g.this.f21691a.m26656b();
        }
    }

    public C9056g(Context context) {
        C8001r.m24578a();
        this.f21691a = C9060k.m26654d();
        C9057h c9057h = new C9057h(context);
        this.f21693c = c9057h;
        c9057h.m26633o(this.f21699i);
        this.f21698h = new Handler();
    }

    /* renamed from: C */
    private void m26588C() {
        if (!this.f21696f) {
            throw new IllegalStateException("CameraInstance is not open");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public C7999p m26600o() {
        return this.f21693c.m26628h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m26601q(InterfaceC9065p interfaceC9065p) {
        this.f21693c.m26632m(interfaceC9065p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m26602r(final InterfaceC9065p interfaceC9065p) {
        if (this.f21696f) {
            this.f21691a.m26657c(new Runnable() { // from class: jh.f
                @Override // java.lang.Runnable
                public final void run() {
                    C9056g.this.m26601q(interfaceC9065p);
                }
            });
        } else {
            Log.d(f21690n, "Camera is closed, not requesting preview");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m26603s(boolean z10) {
        this.f21693c.m26636t(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public void m26604t(Exception exc) {
        Handler handler = this.f21694d;
        if (handler != null) {
            handler.obtainMessage(C7979k.f19396d, exc).sendToTarget();
        }
    }

    /* renamed from: A */
    public void m26605A(final boolean z10) {
        C8001r.m24578a();
        if (this.f21696f) {
            this.f21691a.m26657c(new Runnable() { // from class: jh.d
                @Override // java.lang.Runnable
                public final void run() {
                    C9056g.this.m26603s(z10);
                }
            });
        }
    }

    /* renamed from: B */
    public void m26606B() {
        C8001r.m24578a();
        m26588C();
        this.f21691a.m26657c(this.f21702l);
    }

    /* renamed from: l */
    public void m26607l() {
        C8001r.m24578a();
        if (this.f21696f) {
            this.f21691a.m26657c(this.f21703m);
        } else {
            this.f21697g = true;
        }
        this.f21696f = false;
    }

    /* renamed from: m */
    public void m26608m() {
        C8001r.m24578a();
        m26588C();
        this.f21691a.m26657c(this.f21701k);
    }

    /* renamed from: n */
    public C9062m m26609n() {
        return this.f21695e;
    }

    /* renamed from: p */
    public boolean m26610p() {
        return this.f21697g;
    }

    /* renamed from: u */
    public void m26611u() {
        C8001r.m24578a();
        this.f21696f = true;
        this.f21697g = false;
        this.f21691a.m26658e(this.f21700j);
    }

    /* renamed from: v */
    public void m26612v(final InterfaceC9065p interfaceC9065p) {
        this.f21698h.post(new Runnable() { // from class: jh.e
            @Override // java.lang.Runnable
            public final void run() {
                C9056g.this.m26602r(interfaceC9065p);
            }
        });
    }

    /* renamed from: w */
    public void m26613w(C9058i c9058i) {
        if (this.f21696f) {
            return;
        }
        this.f21699i = c9058i;
        this.f21693c.m26633o(c9058i);
    }

    /* renamed from: x */
    public void m26614x(C9062m c9062m) {
        this.f21695e = c9062m;
        this.f21693c.m26634q(c9062m);
    }

    /* renamed from: y */
    public void m26615y(Handler handler) {
        this.f21694d = handler;
    }

    /* renamed from: z */
    public void m26616z(C9059j c9059j) {
        this.f21692b = c9059j;
    }
}
