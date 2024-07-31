package p163ih;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import p066dg.AbstractC6949j;
import p066dg.C6956q;
import p162ig.C7979k;
import p184jh.C9056g;
import p184jh.InterfaceC9065p;

/* renamed from: ih.i */
/* loaded from: classes3.dex */
public class C7992i {

    /* renamed from: k */
    private static final String f19441k = "i";

    /* renamed from: a */
    private C9056g f19442a;

    /* renamed from: b */
    private HandlerThread f19443b;

    /* renamed from: c */
    private Handler f19444c;

    /* renamed from: d */
    private C7989f f19445d;

    /* renamed from: e */
    private Handler f19446e;

    /* renamed from: f */
    private Rect f19447f;

    /* renamed from: g */
    private boolean f19448g = false;

    /* renamed from: h */
    private final Object f19449h = new Object();

    /* renamed from: i */
    private final Handler.Callback f19450i = new a();

    /* renamed from: j */
    private final InterfaceC9065p f19451j = new b();

    /* renamed from: ih.i$a */
    /* loaded from: classes3.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == C7979k.f19397e) {
                C7992i.this.m24545g((C8000q) message.obj);
                return true;
            }
            if (i10 != C7979k.f19401i) {
                return true;
            }
            C7992i.this.m24546h();
            return true;
        }
    }

    /* renamed from: ih.i$b */
    /* loaded from: classes3.dex */
    class b implements InterfaceC9065p {
        b() {
        }

        @Override // p184jh.InterfaceC9065p
        /* renamed from: a */
        public void mo24552a(C8000q c8000q) {
            synchronized (C7992i.this.f19449h) {
                if (C7992i.this.f19448g) {
                    C7992i.this.f19444c.obtainMessage(C7979k.f19397e, c8000q).sendToTarget();
                }
            }
        }

        @Override // p184jh.InterfaceC9065p
        /* renamed from: b */
        public void mo24553b(Exception exc) {
            synchronized (C7992i.this.f19449h) {
                if (C7992i.this.f19448g) {
                    C7992i.this.f19444c.obtainMessage(C7979k.f19401i).sendToTarget();
                }
            }
        }
    }

    public C7992i(C9056g c9056g, C7989f c7989f, Handler handler) {
        C8001r.m24578a();
        this.f19442a = c9056g;
        this.f19445d = c7989f;
        this.f19446e = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m24545g(C8000q c8000q) {
        Message obtain;
        long currentTimeMillis = System.currentTimeMillis();
        c8000q.m24575d(this.f19447f);
        AbstractC6949j m24547f = m24547f(c8000q);
        C6956q m24535c = m24547f != null ? this.f19445d.m24535c(m24547f) : null;
        if (m24535c != null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            Log.d(f19441k, "Found barcode in " + (currentTimeMillis2 - currentTimeMillis) + " ms");
            if (this.f19446e != null) {
                obtain = Message.obtain(this.f19446e, C7979k.f19399g, new C7985b(m24535c, c8000q));
                obtain.setData(new Bundle());
                obtain.sendToTarget();
            }
        } else {
            Handler handler = this.f19446e;
            if (handler != null) {
                obtain = Message.obtain(handler, C7979k.f19398f);
                obtain.sendToTarget();
            }
        }
        if (this.f19446e != null) {
            Message.obtain(this.f19446e, C7979k.f19400h, C7985b.m24528f(this.f19445d.m24536d(), c8000q)).sendToTarget();
        }
        m24546h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m24546h() {
        this.f19442a.m26612v(this.f19451j);
    }

    /* renamed from: f */
    protected AbstractC6949j m24547f(C8000q c8000q) {
        if (this.f19447f == null) {
            return null;
        }
        return c8000q.m24572a();
    }

    /* renamed from: i */
    public void m24548i(Rect rect) {
        this.f19447f = rect;
    }

    /* renamed from: j */
    public void m24549j(C7989f c7989f) {
        this.f19445d = c7989f;
    }

    /* renamed from: k */
    public void m24550k() {
        C8001r.m24578a();
        HandlerThread handlerThread = new HandlerThread(f19441k);
        this.f19443b = handlerThread;
        handlerThread.start();
        this.f19444c = new Handler(this.f19443b.getLooper(), this.f19450i);
        this.f19448g = true;
        m24546h();
    }

    /* renamed from: l */
    public void m24551l() {
        C8001r.m24578a();
        synchronized (this.f19449h) {
            this.f19448g = false;
            this.f19444c.removeCallbacksAndMessages(null);
            this.f19443b.quit();
        }
    }
}
