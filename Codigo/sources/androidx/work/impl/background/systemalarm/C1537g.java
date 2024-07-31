package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.C1553e0;
import androidx.work.impl.C1577r;
import androidx.work.impl.C1585w;
import androidx.work.impl.InterfaceC1552e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p094f2.AbstractC7277j;
import p192k2.C9124m;
import p211l2.C9353e0;
import p211l2.C9373y;
import p230m2.InterfaceC9536b;
import p230m2.InterfaceExecutorC9535a;

/* renamed from: androidx.work.impl.background.systemalarm.g */
/* loaded from: classes.dex */
public class C1537g implements InterfaceC1552e {

    /* renamed from: v */
    static final String f6620v = AbstractC7277j.m21769i("SystemAlarmDispatcher");

    /* renamed from: a */
    final Context f6621a;

    /* renamed from: b */
    final InterfaceC9536b f6622b;

    /* renamed from: c */
    private final C9353e0 f6623c;

    /* renamed from: d */
    private final C1577r f6624d;

    /* renamed from: e */
    private final C1553e0 f6625e;

    /* renamed from: f */
    final C1532b f6626f;

    /* renamed from: r */
    final List<Intent> f6627r;

    /* renamed from: s */
    Intent f6628s;

    /* renamed from: t */
    private c f6629t;

    /* renamed from: u */
    private C1585w f6630u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.background.systemalarm.g$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor mo28363a;
            d dVar;
            synchronized (C1537g.this.f6627r) {
                C1537g c1537g = C1537g.this;
                c1537g.f6628s = c1537g.f6627r.get(0);
            }
            Intent intent = C1537g.this.f6628s;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = C1537g.this.f6628s.getIntExtra("KEY_START_ID", 0);
                AbstractC7277j m21767e = AbstractC7277j.m21767e();
                String str = C1537g.f6620v;
                m21767e.mo21770a(str, "Processing command " + C1537g.this.f6628s + ", " + intExtra);
                PowerManager.WakeLock m27890b = C9373y.m27890b(C1537g.this.f6621a, action + " (" + intExtra + ")");
                try {
                    AbstractC7277j.m21767e().mo21770a(str, "Acquiring operation wake lock (" + action + ") " + m27890b);
                    m27890b.acquire();
                    C1537g c1537g2 = C1537g.this;
                    c1537g2.f6626f.m8622o(c1537g2.f6628s, intExtra, c1537g2);
                    AbstractC7277j.m21767e().mo21770a(str, "Releasing operation wake lock (" + action + ") " + m27890b);
                    m27890b.release();
                    mo28363a = C1537g.this.f6622b.mo28363a();
                    dVar = new d(C1537g.this);
                } catch (Throwable th2) {
                    try {
                        AbstractC7277j m21767e2 = AbstractC7277j.m21767e();
                        String str2 = C1537g.f6620v;
                        m21767e2.mo21773d(str2, "Unexpected error in onHandleIntent", th2);
                        AbstractC7277j.m21767e().mo21770a(str2, "Releasing operation wake lock (" + action + ") " + m27890b);
                        m27890b.release();
                        mo28363a = C1537g.this.f6622b.mo28363a();
                        dVar = new d(C1537g.this);
                    } catch (Throwable th3) {
                        AbstractC7277j.m21767e().mo21770a(C1537g.f6620v, "Releasing operation wake lock (" + action + ") " + m27890b);
                        m27890b.release();
                        C1537g.this.f6622b.mo28363a().execute(new d(C1537g.this));
                        throw th3;
                    }
                }
                mo28363a.execute(dVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.background.systemalarm.g$b */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: a */
        private final C1537g f6632a;

        /* renamed from: b */
        private final Intent f6633b;

        /* renamed from: c */
        private final int f6634c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(C1537g c1537g, Intent intent, int i10) {
            this.f6632a = c1537g;
            this.f6633b = intent;
            this.f6634c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6632a.m8637a(this.f6633b, this.f6634c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.background.systemalarm.g$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: b */
        void mo8600b();
    }

    /* renamed from: androidx.work.impl.background.systemalarm.g$d */
    /* loaded from: classes.dex */
    static class d implements Runnable {

        /* renamed from: a */
        private final C1537g f6635a;

        d(C1537g c1537g) {
            this.f6635a = c1537g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6635a.m8638c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1537g(Context context) {
        this(context, null, null);
    }

    C1537g(Context context, C1577r c1577r, C1553e0 c1553e0) {
        Context applicationContext = context.getApplicationContext();
        this.f6621a = applicationContext;
        this.f6630u = new C1585w();
        this.f6626f = new C1532b(applicationContext, this.f6630u);
        c1553e0 = c1553e0 == null ? C1553e0.m8677m(context) : c1553e0;
        this.f6625e = c1553e0;
        this.f6623c = new C9353e0(c1553e0.m8687k().m8516k());
        c1577r = c1577r == null ? c1553e0.m8689o() : c1577r;
        this.f6624d = c1577r;
        this.f6622b = c1553e0.m8693s();
        c1577r.m8754g(this);
        this.f6627r = new ArrayList();
        this.f6628s = null;
    }

    /* renamed from: b */
    private void m8634b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* renamed from: i */
    private boolean m8635i(String str) {
        m8634b();
        synchronized (this.f6627r) {
            Iterator<Intent> it = this.f6627r.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: k */
    private void m8636k() {
        m8634b();
        PowerManager.WakeLock m27890b = C9373y.m27890b(this.f6621a, "ProcessCommand");
        try {
            m27890b.acquire();
            this.f6625e.m8693s().m28365c(new a());
        } finally {
            m27890b.release();
        }
    }

    /* renamed from: a */
    public boolean m8637a(Intent intent, int i10) {
        AbstractC7277j m21767e = AbstractC7277j.m21767e();
        String str = f6620v;
        m21767e.mo21770a(str, "Adding command " + intent + " (" + i10 + ")");
        m8634b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            AbstractC7277j.m21767e().mo21777k(str, "Unknown command. Ignoring");
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && m8635i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f6627r) {
            boolean z10 = this.f6627r.isEmpty() ? false : true;
            this.f6627r.add(intent);
            if (!z10) {
                m8636k();
            }
        }
        return true;
    }

    /* renamed from: c */
    void m8638c() {
        AbstractC7277j m21767e = AbstractC7277j.m21767e();
        String str = f6620v;
        m21767e.mo21770a(str, "Checking if commands are complete.");
        m8634b();
        synchronized (this.f6627r) {
            if (this.f6628s != null) {
                AbstractC7277j.m21767e().mo21770a(str, "Removing command " + this.f6628s);
                if (!this.f6627r.remove(0).equals(this.f6628s)) {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
                this.f6628s = null;
            }
            InterfaceExecutorC9535a mo28364b = this.f6622b.mo28364b();
            if (!this.f6626f.m8621n() && this.f6627r.isEmpty() && !mo28364b.mo27888a0()) {
                AbstractC7277j.m21767e().mo21770a(str, "No more commands & intents.");
                c cVar = this.f6629t;
                if (cVar != null) {
                    cVar.mo8600b();
                }
            } else if (!this.f6627r.isEmpty()) {
                m8636k();
            }
        }
    }

    @Override // androidx.work.impl.InterfaceC1552e
    /* renamed from: d */
    public void m8750l(C9124m c9124m, boolean z10) {
        this.f6622b.mo28363a().execute(new b(this, C1532b.m8608c(this.f6621a, c9124m, z10), 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C1577r m8639e() {
        return this.f6624d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public InterfaceC9536b m8640f() {
        return this.f6622b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C1553e0 m8641g() {
        return this.f6625e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C9353e0 m8642h() {
        return this.f6623c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m8643j() {
        AbstractC7277j.m21767e().mo21770a(f6620v, "Destroying SystemAlarmDispatcher");
        this.f6624d.m8758n(this);
        this.f6629t = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m8644l(c cVar) {
        if (this.f6629t != null) {
            AbstractC7277j.m21767e().mo21772c(f6620v, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.f6629t = cVar;
        }
    }
}
