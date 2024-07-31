package ih;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;

/* loaded from: classes3.dex */
public class i {

    /* renamed from: k */
    private static final String f17778k = "i";

    /* renamed from: a */
    private jh.g f17779a;

    /* renamed from: b */
    private HandlerThread f17780b;

    /* renamed from: c */
    private Handler f17781c;

    /* renamed from: d */
    private f f17782d;

    /* renamed from: e */
    private Handler f17783e;

    /* renamed from: f */
    private Rect f17784f;

    /* renamed from: g */
    private boolean f17785g = false;

    /* renamed from: h */
    private final Object f17786h = new Object();

    /* renamed from: i */
    private final Handler.Callback f17787i = new a();

    /* renamed from: j */
    private final jh.p f17788j = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == ig.k.f17734e) {
                i.this.g((q) message.obj);
                return true;
            }
            if (i10 != ig.k.f17738i) {
                return true;
            }
            i.this.h();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements jh.p {
        b() {
        }

        @Override // jh.p
        public void a(q qVar) {
            synchronized (i.this.f17786h) {
                if (i.this.f17785g) {
                    i.this.f17781c.obtainMessage(ig.k.f17734e, qVar).sendToTarget();
                }
            }
        }

        @Override // jh.p
        public void b(Exception exc) {
            synchronized (i.this.f17786h) {
                if (i.this.f17785g) {
                    i.this.f17781c.obtainMessage(ig.k.f17738i).sendToTarget();
                }
            }
        }
    }

    public i(jh.g gVar, f fVar, Handler handler) {
        r.a();
        this.f17779a = gVar;
        this.f17782d = fVar;
        this.f17783e = handler;
    }

    public void g(q qVar) {
        Message obtain;
        long currentTimeMillis = System.currentTimeMillis();
        qVar.d(this.f17784f);
        dg.j f10 = f(qVar);
        dg.q c10 = f10 != null ? this.f17782d.c(f10) : null;
        if (c10 != null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            Log.d(f17778k, "Found barcode in " + (currentTimeMillis2 - currentTimeMillis) + " ms");
            if (this.f17783e != null) {
                obtain = Message.obtain(this.f17783e, ig.k.f17736g, new ih.b(c10, qVar));
                obtain.setData(new Bundle());
                obtain.sendToTarget();
            }
        } else {
            Handler handler = this.f17783e;
            if (handler != null) {
                obtain = Message.obtain(handler, ig.k.f17735f);
                obtain.sendToTarget();
            }
        }
        if (this.f17783e != null) {
            Message.obtain(this.f17783e, ig.k.f17737h, ih.b.f(this.f17782d.d(), qVar)).sendToTarget();
        }
        h();
    }

    public void h() {
        this.f17779a.v(this.f17788j);
    }

    protected dg.j f(q qVar) {
        if (this.f17784f == null) {
            return null;
        }
        return qVar.a();
    }

    public void i(Rect rect) {
        this.f17784f = rect;
    }

    public void j(f fVar) {
        this.f17782d = fVar;
    }

    public void k() {
        r.a();
        HandlerThread handlerThread = new HandlerThread(f17778k);
        this.f17780b = handlerThread;
        handlerThread.start();
        this.f17781c = new Handler(this.f17780b.getLooper(), this.f17787i);
        this.f17785g = true;
        h();
    }

    public void l() {
        r.a();
        synchronized (this.f17786h) {
            this.f17785g = false;
            this.f17781c.removeCallbacksAndMessages(null);
            this.f17780b.quit();
        }
    }
}
