package androidx.work.impl;

import android.content.Context;
import androidx.work.AbstractC1523c;
import androidx.work.C1521a;
import androidx.work.C1522b;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.foreground.InterfaceC1561a;
import androidx.work.impl.utils.futures.C1583c;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p094f2.AbstractC7274g;
import p094f2.AbstractC7277j;
import p094f2.C7286s;
import p192k2.C9124m;
import p192k2.C9132u;
import p192k2.C9135x;
import p192k2.InterfaceC9112b;
import p192k2.InterfaceC9133v;
import p211l2.C9349c0;
import p211l2.C9351d0;
import p211l2.C9365q;
import p211l2.ExecutorC9372x;
import p211l2.RunnableC9347b0;
import p230m2.InterfaceC9536b;

/* renamed from: androidx.work.impl.h0 */
/* loaded from: classes.dex */
public class RunnableC1567h0 implements Runnable {

    /* renamed from: D */
    static final String f6700D = AbstractC7277j.m21769i("WorkerWrapper");

    /* renamed from: C */
    private volatile boolean f6703C;

    /* renamed from: a */
    Context f6704a;

    /* renamed from: b */
    private final String f6705b;

    /* renamed from: c */
    private List<InterfaceC1579t> f6706c;

    /* renamed from: d */
    private WorkerParameters.C1520a f6707d;

    /* renamed from: e */
    C9132u f6708e;

    /* renamed from: f */
    AbstractC1523c f6709f;

    /* renamed from: r */
    InterfaceC9536b f6710r;

    /* renamed from: t */
    private C1521a f6712t;

    /* renamed from: u */
    private InterfaceC1561a f6713u;

    /* renamed from: v */
    private WorkDatabase f6714v;

    /* renamed from: w */
    private InterfaceC9133v f6715w;

    /* renamed from: x */
    private InterfaceC9112b f6716x;

    /* renamed from: y */
    private List<String> f6717y;

    /* renamed from: z */
    private String f6718z;

    /* renamed from: s */
    AbstractC1523c.a f6711s = AbstractC1523c.a.m8547a();

    /* renamed from: A */
    C1583c<Boolean> f6701A = C1583c.m8801s();

    /* renamed from: B */
    final C1583c<AbstractC1523c.a> f6702B = C1583c.m8801s();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.h0$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterfaceFutureC5920f f6719a;

        a(InterfaceFutureC5920f interfaceFutureC5920f) {
            this.f6719a = interfaceFutureC5920f;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (RunnableC1567h0.this.f6702B.isCancelled()) {
                return;
            }
            try {
                this.f6719a.get();
                AbstractC7277j.m21767e().mo21770a(RunnableC1567h0.f6700D, "Starting work for " + RunnableC1567h0.this.f6708e.f22007c);
                RunnableC1567h0 runnableC1567h0 = RunnableC1567h0.this;
                runnableC1567h0.f6702B.mo8792q(runnableC1567h0.f6709f.startWork());
            } catch (Throwable th2) {
                RunnableC1567h0.this.f6702B.mo8791p(th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.h0$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f6721a;

        b(String str) {
            this.f6721a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    AbstractC1523c.a aVar = RunnableC1567h0.this.f6702B.get();
                    if (aVar == null) {
                        AbstractC7277j.m21767e().mo21772c(RunnableC1567h0.f6700D, RunnableC1567h0.this.f6708e.f22007c + " returned a null result. Treating it as a failure.");
                    } else {
                        AbstractC7277j.m21767e().mo21770a(RunnableC1567h0.f6700D, RunnableC1567h0.this.f6708e.f22007c + " returned a " + aVar + ".");
                        RunnableC1567h0.this.f6711s = aVar;
                    }
                } catch (InterruptedException e10) {
                    e = e10;
                    AbstractC7277j.m21767e().mo21773d(RunnableC1567h0.f6700D, this.f6721a + " failed because it threw an exception/error", e);
                } catch (CancellationException e11) {
                    AbstractC7277j.m21767e().mo21775g(RunnableC1567h0.f6700D, this.f6721a + " was cancelled", e11);
                } catch (ExecutionException e12) {
                    e = e12;
                    AbstractC7277j.m21767e().mo21773d(RunnableC1567h0.f6700D, this.f6721a + " failed because it threw an exception/error", e);
                }
            } finally {
                RunnableC1567h0.this.m8740j();
            }
        }
    }

    /* renamed from: androidx.work.impl.h0$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        Context f6723a;

        /* renamed from: b */
        AbstractC1523c f6724b;

        /* renamed from: c */
        InterfaceC1561a f6725c;

        /* renamed from: d */
        InterfaceC9536b f6726d;

        /* renamed from: e */
        C1521a f6727e;

        /* renamed from: f */
        WorkDatabase f6728f;

        /* renamed from: g */
        C9132u f6729g;

        /* renamed from: h */
        List<InterfaceC1579t> f6730h;

        /* renamed from: i */
        private final List<String> f6731i;

        /* renamed from: j */
        WorkerParameters.C1520a f6732j = new WorkerParameters.C1520a();

        public c(Context context, C1521a c1521a, InterfaceC9536b interfaceC9536b, InterfaceC1561a interfaceC1561a, WorkDatabase workDatabase, C9132u c9132u, List<String> list) {
            this.f6723a = context.getApplicationContext();
            this.f6726d = interfaceC9536b;
            this.f6725c = interfaceC1561a;
            this.f6727e = c1521a;
            this.f6728f = workDatabase;
            this.f6729g = c9132u;
            this.f6731i = list;
        }

        /* renamed from: b */
        public RunnableC1567h0 m8743b() {
            return new RunnableC1567h0(this);
        }

        /* renamed from: c */
        public c m8744c(WorkerParameters.C1520a c1520a) {
            if (c1520a != null) {
                this.f6732j = c1520a;
            }
            return this;
        }

        /* renamed from: d */
        public c m8745d(List<InterfaceC1579t> list) {
            this.f6730h = list;
            return this;
        }
    }

    RunnableC1567h0(c cVar) {
        this.f6704a = cVar.f6723a;
        this.f6710r = cVar.f6726d;
        this.f6713u = cVar.f6725c;
        C9132u c9132u = cVar.f6729g;
        this.f6708e = c9132u;
        this.f6705b = c9132u.f22005a;
        this.f6706c = cVar.f6730h;
        this.f6707d = cVar.f6732j;
        this.f6709f = cVar.f6724b;
        this.f6712t = cVar.f6727e;
        WorkDatabase workDatabase = cVar.f6728f;
        this.f6714v = workDatabase;
        this.f6715w = workDatabase.mo8560J();
        this.f6716x = this.f6714v.mo8555E();
        this.f6717y = cVar.f6731i;
    }

    /* renamed from: b */
    private String m8724b(List<String> list) {
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        sb2.append(this.f6705b);
        sb2.append(", tags={ ");
        boolean z10 = true;
        for (String str : list) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        sb2.append(" } ]");
        return sb2.toString();
    }

    /* renamed from: f */
    private void m8725f(AbstractC1523c.a aVar) {
        if (aVar instanceof AbstractC1523c.a.c) {
            AbstractC7277j.m21767e().mo21774f(f6700D, "Worker result SUCCESS for " + this.f6718z);
            if (!this.f6708e.m26899j()) {
                m8733q();
                return;
            }
        } else {
            if (aVar instanceof AbstractC1523c.a.b) {
                AbstractC7277j.m21767e().mo21774f(f6700D, "Worker result RETRY for " + this.f6718z);
                m8728k();
                return;
            }
            AbstractC7277j.m21767e().mo21774f(f6700D, "Worker result FAILURE for " + this.f6718z);
            if (!this.f6708e.m26899j()) {
                m8741p();
                return;
            }
        }
        m8729l();
    }

    /* renamed from: h */
    private void m8726h(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f6715w.mo26908g(str2) != C7286s.a.CANCELLED) {
                this.f6715w.mo26924w(C7286s.a.FAILED, str2);
            }
            linkedList.addAll(this.f6716x.mo26839a(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m8727i(InterfaceFutureC5920f interfaceFutureC5920f) {
        if (this.f6702B.isCancelled()) {
            interfaceFutureC5920f.cancel(true);
        }
    }

    /* renamed from: k */
    private void m8728k() {
        this.f6714v.m32253e();
        try {
            this.f6715w.mo26924w(C7286s.a.ENQUEUED, this.f6705b);
            this.f6715w.mo26910i(this.f6705b, System.currentTimeMillis());
            this.f6715w.mo26915n(this.f6705b, -1L);
            this.f6714v.m32250B();
        } finally {
            this.f6714v.m32255i();
            m8730m(true);
        }
    }

    /* renamed from: l */
    private void m8729l() {
        this.f6714v.m32253e();
        try {
            this.f6715w.mo26910i(this.f6705b, System.currentTimeMillis());
            this.f6715w.mo26924w(C7286s.a.ENQUEUED, this.f6705b);
            this.f6715w.mo26922u(this.f6705b);
            this.f6715w.mo26904c(this.f6705b);
            this.f6715w.mo26915n(this.f6705b, -1L);
            this.f6714v.m32250B();
        } finally {
            this.f6714v.m32255i();
            m8730m(false);
        }
    }

    /* renamed from: m */
    private void m8730m(boolean z10) {
        this.f6714v.m32253e();
        try {
            if (!this.f6714v.mo8560J().mo26921t()) {
                C9365q.m27878a(this.f6704a, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.f6715w.mo26924w(C7286s.a.ENQUEUED, this.f6705b);
                this.f6715w.mo26915n(this.f6705b, -1L);
            }
            if (this.f6708e != null && this.f6709f != null && this.f6713u.mo8709b(this.f6705b)) {
                this.f6713u.mo8708a(this.f6705b);
            }
            this.f6714v.m32250B();
            this.f6714v.m32255i();
            this.f6701A.mo8790o(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            this.f6714v.m32255i();
            throw th2;
        }
    }

    /* renamed from: n */
    private void m8731n() {
        boolean z10;
        C7286s.a mo26908g = this.f6715w.mo26908g(this.f6705b);
        if (mo26908g == C7286s.a.RUNNING) {
            AbstractC7277j.m21767e().mo21770a(f6700D, "Status for " + this.f6705b + " is RUNNING; not doing any work and rescheduling for later execution");
            z10 = true;
        } else {
            AbstractC7277j.m21767e().mo21770a(f6700D, "Status for " + this.f6705b + " is " + mo26908g + " ; not doing any work");
            z10 = false;
        }
        m8730m(z10);
    }

    /* renamed from: o */
    private void m8732o() {
        C1522b mo8485b;
        if (m8734r()) {
            return;
        }
        this.f6714v.m32253e();
        try {
            C9132u c9132u = this.f6708e;
            if (c9132u.f22006b != C7286s.a.ENQUEUED) {
                m8731n();
                this.f6714v.m32250B();
                AbstractC7277j.m21767e().mo21770a(f6700D, this.f6708e.f22007c + " is not in ENQUEUED state. Nothing more to do");
                return;
            }
            if ((c9132u.m26899j() || this.f6708e.m26898i()) && System.currentTimeMillis() < this.f6708e.m26893c()) {
                AbstractC7277j.m21767e().mo21770a(f6700D, String.format("Delaying execution for %s because it is being executed before schedule.", this.f6708e.f22007c));
                m8730m(true);
                this.f6714v.m32250B();
                return;
            }
            this.f6714v.m32250B();
            this.f6714v.m32255i();
            if (this.f6708e.m26899j()) {
                mo8485b = this.f6708e.f22009e;
            } else {
                AbstractC7274g m21763b = this.f6712t.m8511f().m21763b(this.f6708e.f22008d);
                if (m21763b == null) {
                    AbstractC7277j.m21767e().mo21772c(f6700D, "Could not create Input Merger " + this.f6708e.f22008d);
                    m8741p();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f6708e.f22009e);
                arrayList.addAll(this.f6715w.mo26912k(this.f6705b));
                mo8485b = m21763b.mo8485b(arrayList);
            }
            C1522b c1522b = mo8485b;
            UUID fromString = UUID.fromString(this.f6705b);
            List<String> list = this.f6717y;
            WorkerParameters.C1520a c1520a = this.f6707d;
            C9132u c9132u2 = this.f6708e;
            WorkerParameters workerParameters = new WorkerParameters(fromString, c1522b, list, c1520a, c9132u2.f22015k, c9132u2.m26895f(), this.f6712t.m8509d(), this.f6710r, this.f6712t.m8519n(), new C9351d0(this.f6714v, this.f6710r), new C9349c0(this.f6714v, this.f6713u, this.f6710r));
            if (this.f6709f == null) {
                this.f6709f = this.f6712t.m8519n().m21814b(this.f6704a, this.f6708e.f22007c, workerParameters);
            }
            AbstractC1523c abstractC1523c = this.f6709f;
            if (abstractC1523c == null) {
                AbstractC7277j.m21767e().mo21772c(f6700D, "Could not create Worker " + this.f6708e.f22007c);
                m8741p();
                return;
            }
            if (abstractC1523c.isUsed()) {
                AbstractC7277j.m21767e().mo21772c(f6700D, "Received an already-used Worker " + this.f6708e.f22007c + "; Worker Factory should return new instances");
                m8741p();
                return;
            }
            this.f6709f.setUsed();
            if (!m8735s()) {
                m8731n();
                return;
            }
            if (m8734r()) {
                return;
            }
            RunnableC9347b0 runnableC9347b0 = new RunnableC9347b0(this.f6704a, this.f6708e, this.f6709f, workerParameters.m8495b(), this.f6710r);
            this.f6710r.mo28363a().execute(runnableC9347b0);
            final InterfaceFutureC5920f<Void> m27839b = runnableC9347b0.m27839b();
            this.f6702B.addListener(new Runnable() { // from class: androidx.work.impl.g0
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC1567h0.this.m8727i(m27839b);
                }
            }, new ExecutorC9372x());
            m27839b.addListener(new a(m27839b), this.f6710r.mo28363a());
            this.f6702B.addListener(new b(this.f6718z), this.f6710r.mo28364b());
        } finally {
            this.f6714v.m32255i();
        }
    }

    /* renamed from: q */
    private void m8733q() {
        this.f6714v.m32253e();
        try {
            this.f6715w.mo26924w(C7286s.a.SUCCEEDED, this.f6705b);
            this.f6715w.mo26918q(this.f6705b, ((AbstractC1523c.a.c) this.f6711s).m8553f());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.f6716x.mo26839a(this.f6705b)) {
                if (this.f6715w.mo26908g(str) == C7286s.a.BLOCKED && this.f6716x.mo26840b(str)) {
                    AbstractC7277j.m21767e().mo21774f(f6700D, "Setting status to enqueued for " + str);
                    this.f6715w.mo26924w(C7286s.a.ENQUEUED, str);
                    this.f6715w.mo26910i(str, currentTimeMillis);
                }
            }
            this.f6714v.m32250B();
        } finally {
            this.f6714v.m32255i();
            m8730m(false);
        }
    }

    /* renamed from: r */
    private boolean m8734r() {
        if (!this.f6703C) {
            return false;
        }
        AbstractC7277j.m21767e().mo21770a(f6700D, "Work interrupted for " + this.f6718z);
        if (this.f6715w.mo26908g(this.f6705b) == null) {
            m8730m(false);
        } else {
            m8730m(!r0.m21794h());
        }
        return true;
    }

    /* renamed from: s */
    private boolean m8735s() {
        boolean z10;
        this.f6714v.m32253e();
        try {
            if (this.f6715w.mo26908g(this.f6705b) == C7286s.a.ENQUEUED) {
                this.f6715w.mo26924w(C7286s.a.RUNNING, this.f6705b);
                this.f6715w.mo26925x(this.f6705b);
                z10 = true;
            } else {
                z10 = false;
            }
            this.f6714v.m32250B();
            return z10;
        } finally {
            this.f6714v.m32255i();
        }
    }

    /* renamed from: c */
    public InterfaceFutureC5920f<Boolean> m8736c() {
        return this.f6701A;
    }

    /* renamed from: d */
    public C9124m m8737d() {
        return C9135x.m26934a(this.f6708e);
    }

    /* renamed from: e */
    public C9132u m8738e() {
        return this.f6708e;
    }

    /* renamed from: g */
    public void m8739g() {
        this.f6703C = true;
        m8734r();
        this.f6702B.cancel(true);
        if (this.f6709f != null && this.f6702B.isCancelled()) {
            this.f6709f.stop();
            return;
        }
        AbstractC7277j.m21767e().mo21770a(f6700D, "WorkSpec " + this.f6708e + " is already done. Not interrupting.");
    }

    /* renamed from: j */
    void m8740j() {
        if (!m8734r()) {
            this.f6714v.m32253e();
            try {
                C7286s.a mo26908g = this.f6715w.mo26908g(this.f6705b);
                this.f6714v.mo8559I().mo26885a(this.f6705b);
                if (mo26908g == null) {
                    m8730m(false);
                } else if (mo26908g == C7286s.a.RUNNING) {
                    m8725f(this.f6711s);
                } else if (!mo26908g.m21794h()) {
                    m8728k();
                }
                this.f6714v.m32250B();
            } finally {
                this.f6714v.m32255i();
            }
        }
        List<InterfaceC1579t> list = this.f6706c;
        if (list != null) {
            Iterator<InterfaceC1579t> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo8665c(this.f6705b);
            }
            C1580u.m8765b(this.f6712t, this.f6714v, this.f6706c);
        }
    }

    /* renamed from: p */
    void m8741p() {
        this.f6714v.m32253e();
        try {
            m8726h(this.f6705b);
            this.f6715w.mo26918q(this.f6705b, ((AbstractC1523c.a.C13172a) this.f6711s).m8552f());
            this.f6714v.m32250B();
        } finally {
            this.f6714v.m32255i();
            m8730m(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f6718z = m8724b(this.f6717y);
        m8732o();
    }
}
