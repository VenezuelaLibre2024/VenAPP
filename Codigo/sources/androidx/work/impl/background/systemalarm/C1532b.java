package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.C1584v;
import androidx.work.impl.C1585w;
import androidx.work.impl.InterfaceC1552e;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C1537g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p094f2.AbstractC7277j;
import p192k2.C9124m;
import p192k2.C9132u;

/* renamed from: androidx.work.impl.background.systemalarm.b */
/* loaded from: classes.dex */
public class C1532b implements InterfaceC1552e {

    /* renamed from: e */
    private static final String f6595e = AbstractC7277j.m21769i("CommandHandler");

    /* renamed from: a */
    private final Context f6596a;

    /* renamed from: b */
    private final Map<C9124m, C1536f> f6597b = new HashMap();

    /* renamed from: c */
    private final Object f6598c = new Object();

    /* renamed from: d */
    private final C1585w f6599d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1532b(Context context, C1585w c1585w) {
        this.f6596a = context;
        this.f6599d = c1585w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Intent m8606a(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Intent m8607b(Context context, C9124m c9124m) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        return m8619q(intent, c9124m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Intent m8608c(Context context, C9124m c9124m, boolean z10) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        return m8619q(intent, c9124m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static Intent m8609e(Context context, C9124m c9124m) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        return m8619q(intent, c9124m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static Intent m8610f(Context context, C9124m c9124m) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        return m8619q(intent, c9124m);
    }

    /* renamed from: g */
    private void m8611g(Intent intent, int i10, C1537g c1537g) {
        AbstractC7277j.m21767e().mo21770a(f6595e, "Handling constraints changed " + intent);
        new C1533c(this.f6596a, i10, c1537g).m8623a();
    }

    /* renamed from: h */
    private void m8612h(Intent intent, int i10, C1537g c1537g) {
        synchronized (this.f6598c) {
            C9124m m8618p = m8618p(intent);
            AbstractC7277j m21767e = AbstractC7277j.m21767e();
            String str = f6595e;
            m21767e.mo21770a(str, "Handing delay met for " + m8618p);
            if (this.f6597b.containsKey(m8618p)) {
                AbstractC7277j.m21767e().mo21770a(str, "WorkSpec " + m8618p + " is is already being handled for ACTION_DELAY_MET");
            } else {
                C1536f c1536f = new C1536f(this.f6596a, i10, c1537g, this.f6599d.m8806d(m8618p));
                this.f6597b.put(m8618p, c1536f);
                c1536f.m8632g();
            }
        }
    }

    /* renamed from: i */
    private void m8613i(Intent intent, int i10) {
        C9124m m8618p = m8618p(intent);
        boolean z10 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        AbstractC7277j.m21767e().mo21770a(f6595e, "Handling onExecutionCompleted " + intent + ", " + i10);
        m8750l(m8618p, z10);
    }

    /* renamed from: j */
    private void m8614j(Intent intent, int i10, C1537g c1537g) {
        AbstractC7277j.m21767e().mo21770a(f6595e, "Handling reschedule " + intent + ", " + i10);
        c1537g.m8641g().m8695v();
    }

    /* renamed from: k */
    private void m8615k(Intent intent, int i10, C1537g c1537g) {
        C9124m m8618p = m8618p(intent);
        AbstractC7277j m21767e = AbstractC7277j.m21767e();
        String str = f6595e;
        m21767e.mo21770a(str, "Handling schedule work for " + m8618p);
        WorkDatabase m8692r = c1537g.m8641g().m8692r();
        m8692r.m32253e();
        try {
            C9132u mo26909h = m8692r.mo8560J().mo26909h(m8618p.m26876b());
            if (mo26909h == null) {
                AbstractC7277j.m21767e().mo21777k(str, "Skipping scheduling " + m8618p + " because it's no longer in the DB");
                return;
            }
            if (mo26909h.f22006b.m21794h()) {
                AbstractC7277j.m21767e().mo21777k(str, "Skipping scheduling " + m8618p + "because it is finished.");
                return;
            }
            long m26893c = mo26909h.m26893c();
            if (mo26909h.m26897h()) {
                AbstractC7277j.m21767e().mo21770a(str, "Opportunistically setting an alarm for " + m8618p + "at " + m26893c);
                C1531a.m8603c(this.f6596a, m8692r, m8618p, m26893c);
                c1537g.m8640f().mo28363a().execute(new C1537g.b(c1537g, m8606a(this.f6596a), i10));
            } else {
                AbstractC7277j.m21767e().mo21770a(str, "Setting up Alarms for " + m8618p + "at " + m26893c);
                C1531a.m8603c(this.f6596a, m8692r, m8618p, m26893c);
            }
            m8692r.m32250B();
        } finally {
            m8692r.m32255i();
        }
    }

    /* renamed from: l */
    private void m8616l(Intent intent, C1537g c1537g) {
        List<C1584v> m8805c;
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        if (extras.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i10 = extras.getInt("KEY_WORKSPEC_GENERATION");
            m8805c = new ArrayList<>(1);
            C1584v m8804b = this.f6599d.m8804b(new C9124m(string, i10));
            if (m8804b != null) {
                m8805c.add(m8804b);
            }
        } else {
            m8805c = this.f6599d.m8805c(string);
        }
        for (C1584v c1584v : m8805c) {
            AbstractC7277j.m21767e().mo21770a(f6595e, "Handing stopWork work for " + string);
            c1537g.m8641g().m8679A(c1584v);
            C1531a.m8601a(this.f6596a, c1537g.m8641g().m8692r(), c1584v.m8802a());
            c1537g.m8750l(c1584v.m8802a(), false);
        }
    }

    /* renamed from: m */
    private static boolean m8617m(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    static C9124m m8618p(Intent intent) {
        return new C9124m(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    /* renamed from: q */
    private static Intent m8619q(Intent intent, C9124m c9124m) {
        intent.putExtra("KEY_WORKSPEC_ID", c9124m.m26876b());
        intent.putExtra("KEY_WORKSPEC_GENERATION", c9124m.m26875a());
        return intent;
    }

    @Override // androidx.work.impl.InterfaceC1552e
    /* renamed from: d */
    public void m8750l(C9124m c9124m, boolean z10) {
        synchronized (this.f6598c) {
            C1536f remove = this.f6597b.remove(c9124m);
            this.f6599d.m8804b(c9124m);
            if (remove != null) {
                remove.m8633h(z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean m8621n() {
        boolean z10;
        synchronized (this.f6598c) {
            z10 = !this.f6597b.isEmpty();
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m8622o(Intent intent, int i10, C1537g c1537g) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m8611g(intent, i10, c1537g);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            m8614j(intent, i10, c1537g);
            return;
        }
        if (!m8617m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            AbstractC7277j.m21767e().mo21772c(f6595e, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            m8615k(intent, i10, c1537g);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            m8612h(intent, i10, c1537g);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            m8616l(intent, c1537g);
            return;
        }
        if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            m8613i(intent, i10);
            return;
        }
        AbstractC7277j.m21767e().mo21777k(f6595e, "Ignoring intent " + intent);
    }
}
