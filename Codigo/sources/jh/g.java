package jh;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import ih.r;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: n */
    private static final String f19911n = "g";

    /* renamed from: a */
    private k f19912a;

    /* renamed from: b */
    private j f19913b;

    /* renamed from: c */
    private h f19914c;

    /* renamed from: d */
    private Handler f19915d;

    /* renamed from: e */
    private m f19916e;

    /* renamed from: h */
    private Handler f19919h;

    /* renamed from: f */
    private boolean f19917f = false;

    /* renamed from: g */
    private boolean f19918g = true;

    /* renamed from: i */
    private i f19920i = new i();

    /* renamed from: j */
    private Runnable f19921j = new a();

    /* renamed from: k */
    private Runnable f19922k = new b();

    /* renamed from: l */
    private Runnable f19923l = new c();

    /* renamed from: m */
    private Runnable f19924m = new d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(g.f19911n, "Opening camera");
                g.this.f19914c.l();
            } catch (Exception e10) {
                g.this.t(e10);
                Log.e(g.f19911n, "Failed to open camera", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(g.f19911n, "Configuring camera");
                g.this.f19914c.e();
                if (g.this.f19915d != null) {
                    g.this.f19915d.obtainMessage(ig.k.f17739j, g.this.o()).sendToTarget();
                }
            } catch (Exception e10) {
                g.this.t(e10);
                Log.e(g.f19911n, "Failed to configure camera", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(g.f19911n, "Starting preview");
                g.this.f19914c.s(g.this.f19913b);
                g.this.f19914c.u();
            } catch (Exception e10) {
                g.this.t(e10);
                Log.e(g.f19911n, "Failed to start preview", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(g.f19911n, "Closing camera");
                g.this.f19914c.v();
                g.this.f19914c.d();
            } catch (Exception e10) {
                Log.e(g.f19911n, "Failed to close camera", e10);
            }
            g.this.f19918g = true;
            g.this.f19915d.sendEmptyMessage(ig.k.f17732c);
            g.this.f19912a.b();
        }
    }

    public g(Context context) {
        r.a();
        this.f19912a = k.d();
        h hVar = new h(context);
        this.f19914c = hVar;
        hVar.o(this.f19920i);
        this.f19919h = new Handler();
    }

    private void C() {
        if (!this.f19917f) {
            throw new IllegalStateException("CameraInstance is not open");
        }
    }

    public ih.p o() {
        return this.f19914c.h();
    }

    public /* synthetic */ void q(p pVar) {
        this.f19914c.m(pVar);
    }

    public /* synthetic */ void r(p pVar) {
        if (this.f19917f) {
            this.f19912a.c(new Runnable() { // from class: jh.f

                /* renamed from: b */
                public final /* synthetic */ p f19910b;

                public /* synthetic */ f(p pVar2) {
                    r2 = pVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    g.this.q(r2);
                }
            });
        } else {
            Log.d(f19911n, "Camera is closed, not requesting preview");
        }
    }

    public /* synthetic */ void s(boolean z10) {
        this.f19914c.t(z10);
    }

    public void t(Exception exc) {
        Handler handler = this.f19915d;
        if (handler != null) {
            handler.obtainMessage(ig.k.f17733d, exc).sendToTarget();
        }
    }

    public void A(boolean z10) {
        r.a();
        if (this.f19917f) {
            this.f19912a.c(new Runnable() { // from class: jh.d

                /* renamed from: b */
                public final /* synthetic */ boolean f19906b;

                public /* synthetic */ d(boolean z102) {
                    r2 = z102;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    g.this.s(r2);
                }
            });
        }
    }

    public void B() {
        r.a();
        C();
        this.f19912a.c(this.f19923l);
    }

    public void l() {
        r.a();
        if (this.f19917f) {
            this.f19912a.c(this.f19924m);
        } else {
            this.f19918g = true;
        }
        this.f19917f = false;
    }

    public void m() {
        r.a();
        C();
        this.f19912a.c(this.f19922k);
    }

    public m n() {
        return this.f19916e;
    }

    public boolean p() {
        return this.f19918g;
    }

    public void u() {
        r.a();
        this.f19917f = true;
        this.f19918g = false;
        this.f19912a.e(this.f19921j);
    }

    public void v(p pVar) {
        this.f19919h.post(new Runnable() { // from class: jh.e

            /* renamed from: b */
            public final /* synthetic */ p f19908b;

            public /* synthetic */ e(p pVar2) {
                r2 = pVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                g.this.r(r2);
            }
        });
    }

    public void w(i iVar) {
        if (this.f19917f) {
            return;
        }
        this.f19920i = iVar;
        this.f19914c.o(iVar);
    }

    public void x(m mVar) {
        this.f19916e = mVar;
        this.f19914c.q(mVar);
    }

    public void y(Handler handler) {
        this.f19915d = handler;
    }

    public void z(j jVar) {
        this.f19913b = jVar;
    }
}
