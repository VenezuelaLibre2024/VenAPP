package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.impl.C1584v;
import androidx.work.impl.background.systemalarm.C1537g;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p094f2.AbstractC7277j;
import p128h2.C7615e;
import p128h2.InterfaceC7613c;
import p170j2.C8953n;
import p192k2.C9124m;
import p192k2.C9132u;
import p192k2.C9135x;
import p211l2.C9353e0;
import p211l2.C9373y;

/* renamed from: androidx.work.impl.background.systemalarm.f */
/* loaded from: classes.dex */
public class C1536f implements InterfaceC7613c, C9353e0.a {

    /* renamed from: x */
    private static final String f6607x = AbstractC7277j.m21769i("DelayMetCommandHandler");

    /* renamed from: a */
    private final Context f6608a;

    /* renamed from: b */
    private final int f6609b;

    /* renamed from: c */
    private final C9124m f6610c;

    /* renamed from: d */
    private final C1537g f6611d;

    /* renamed from: e */
    private final C7615e f6612e;

    /* renamed from: f */
    private final Object f6613f;

    /* renamed from: r */
    private int f6614r;

    /* renamed from: s */
    private final Executor f6615s;

    /* renamed from: t */
    private final Executor f6616t;

    /* renamed from: u */
    private PowerManager.WakeLock f6617u;

    /* renamed from: v */
    private boolean f6618v;

    /* renamed from: w */
    private final C1584v f6619w;

    public C1536f(Context context, int i10, C1537g c1537g, C1584v c1584v) {
        this.f6608a = context;
        this.f6609b = i10;
        this.f6611d = c1537g;
        this.f6610c = c1584v.m8802a();
        this.f6619w = c1584v;
        C8953n m8691q = c1537g.m8641g().m8691q();
        this.f6615s = c1537g.m8640f().mo28364b();
        this.f6616t = c1537g.m8640f().mo28363a();
        this.f6612e = new C7615e(m8691q, this);
        this.f6618v = false;
        this.f6614r = 0;
        this.f6613f = new Object();
    }

    /* renamed from: e */
    private void m8626e() {
        synchronized (this.f6613f) {
            this.f6612e.reset();
            this.f6611d.m8642h().m27857b(this.f6610c);
            PowerManager.WakeLock wakeLock = this.f6617u;
            if (wakeLock != null && wakeLock.isHeld()) {
                AbstractC7277j.m21767e().mo21770a(f6607x, "Releasing wakelock " + this.f6617u + "for WorkSpec " + this.f6610c);
                this.f6617u.release();
            }
        }
    }

    /* renamed from: i */
    public void m8627i() {
        if (this.f6614r != 0) {
            AbstractC7277j.m21767e().mo21770a(f6607x, "Already started work for " + this.f6610c);
            return;
        }
        this.f6614r = 1;
        AbstractC7277j.m21767e().mo21770a(f6607x, "onAllConstraintsMet for " + this.f6610c);
        if (this.f6611d.m8639e().m8759p(this.f6619w)) {
            this.f6611d.m8642h().m27856a(this.f6610c, 600000L, this);
        } else {
            m8626e();
        }
    }

    /* renamed from: j */
    public void m8628j() {
        AbstractC7277j m21767e;
        String str;
        StringBuilder sb2;
        String m26876b = this.f6610c.m26876b();
        if (this.f6614r < 2) {
            this.f6614r = 2;
            AbstractC7277j m21767e2 = AbstractC7277j.m21767e();
            str = f6607x;
            m21767e2.mo21770a(str, "Stopping work for WorkSpec " + m26876b);
            this.f6616t.execute(new C1537g.b(this.f6611d, C1532b.m8610f(this.f6608a, this.f6610c), this.f6609b));
            if (this.f6611d.m8639e().m8757k(this.f6610c.m26876b())) {
                AbstractC7277j.m21767e().mo21770a(str, "WorkSpec " + m26876b + " needs to be rescheduled");
                this.f6616t.execute(new C1537g.b(this.f6611d, C1532b.m8609e(this.f6608a, this.f6610c), this.f6609b));
                return;
            }
            m21767e = AbstractC7277j.m21767e();
            sb2 = new StringBuilder();
            sb2.append("Processor does not have WorkSpec ");
            sb2.append(m26876b);
            m26876b = ". No need to reschedule";
        } else {
            m21767e = AbstractC7277j.m21767e();
            str = f6607x;
            sb2 = new StringBuilder();
            sb2.append("Already stopped work for ");
        }
        sb2.append(m26876b);
        m21767e.mo21770a(str, sb2.toString());
    }

    @Override // p211l2.C9353e0.a
    /* renamed from: a */
    public void mo8629a(C9124m c9124m) {
        AbstractC7277j.m21767e().mo21770a(f6607x, "Exceeded time limits on execution for " + c9124m);
        this.f6615s.execute(new RunnableC1534d(this));
    }

    @Override // p128h2.InterfaceC7613c
    /* renamed from: b */
    public void mo8630b(List<C9132u> list) {
        this.f6615s.execute(new RunnableC1534d(this));
    }

    @Override // p128h2.InterfaceC7613c
    /* renamed from: f */
    public void mo8631f(List<C9132u> list) {
        Iterator<C9132u> it = list.iterator();
        while (it.hasNext()) {
            if (C9135x.m26934a(it.next()).equals(this.f6610c)) {
                this.f6615s.execute(new Runnable() { // from class: androidx.work.impl.background.systemalarm.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1536f.this.m8627i();
                    }
                });
                return;
            }
        }
    }

    /* renamed from: g */
    public void m8632g() {
        String m26876b = this.f6610c.m26876b();
        this.f6617u = C9373y.m27890b(this.f6608a, m26876b + " (" + this.f6609b + ")");
        AbstractC7277j m21767e = AbstractC7277j.m21767e();
        String str = f6607x;
        m21767e.mo21770a(str, "Acquiring wakelock " + this.f6617u + "for WorkSpec " + m26876b);
        this.f6617u.acquire();
        C9132u mo26909h = this.f6611d.m8641g().m8692r().mo8560J().mo26909h(m26876b);
        if (mo26909h == null) {
            this.f6615s.execute(new RunnableC1534d(this));
            return;
        }
        boolean m26897h = mo26909h.m26897h();
        this.f6618v = m26897h;
        if (m26897h) {
            this.f6612e.mo23132a(Collections.singletonList(mo26909h));
            return;
        }
        AbstractC7277j.m21767e().mo21770a(str, "No constraints for " + m26876b);
        mo8631f(Collections.singletonList(mo26909h));
    }

    /* renamed from: h */
    public void m8633h(boolean z10) {
        AbstractC7277j.m21767e().mo21770a(f6607x, "onExecuted " + this.f6610c + ", " + z10);
        m8626e();
        if (z10) {
            this.f6616t.execute(new C1537g.b(this.f6611d, C1532b.m8609e(this.f6608a, this.f6610c), this.f6609b));
        }
        if (this.f6618v) {
            this.f6616t.execute(new C1537g.b(this.f6611d, C1532b.m8606a(this.f6608a), this.f6609b));
        }
    }
}
