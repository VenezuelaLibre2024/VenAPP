package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.impl.v;
import androidx.work.impl.w;
import f2.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k2.m;
import k2.u;

/* loaded from: classes.dex */
public class b implements androidx.work.impl.e {

    /* renamed from: e */
    private static final String f5744e = j.i("CommandHandler");

    /* renamed from: a */
    private final Context f5745a;

    /* renamed from: b */
    private final Map<m, f> f5746b = new HashMap();

    /* renamed from: c */
    private final Object f5747c = new Object();

    /* renamed from: d */
    private final w f5748d;

    public b(Context context, w wVar) {
        this.f5745a = context;
        this.f5748d = wVar;
    }

    public static Intent a(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    public static Intent b(Context context, m mVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        return q(intent, mVar);
    }

    public static Intent c(Context context, m mVar, boolean z10) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        return q(intent, mVar);
    }

    public static Intent e(Context context, m mVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        return q(intent, mVar);
    }

    public static Intent f(Context context, m mVar) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        return q(intent, mVar);
    }

    private void g(Intent intent, int i10, g gVar) {
        j.e().a(f5744e, "Handling constraints changed " + intent);
        new c(this.f5745a, i10, gVar).a();
    }

    private void h(Intent intent, int i10, g gVar) {
        synchronized (this.f5747c) {
            m p10 = p(intent);
            j e10 = j.e();
            String str = f5744e;
            e10.a(str, "Handing delay met for " + p10);
            if (this.f5746b.containsKey(p10)) {
                j.e().a(str, "WorkSpec " + p10 + " is is already being handled for ACTION_DELAY_MET");
            } else {
                f fVar = new f(this.f5745a, i10, gVar, this.f5748d.d(p10));
                this.f5746b.put(p10, fVar);
                fVar.g();
            }
        }
    }

    private void i(Intent intent, int i10) {
        m p10 = p(intent);
        boolean z10 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        j.e().a(f5744e, "Handling onExecutionCompleted " + intent + ", " + i10);
        l(p10, z10);
    }

    private void j(Intent intent, int i10, g gVar) {
        j.e().a(f5744e, "Handling reschedule " + intent + ", " + i10);
        gVar.g().v();
    }

    private void k(Intent intent, int i10, g gVar) {
        m p10 = p(intent);
        j e10 = j.e();
        String str = f5744e;
        e10.a(str, "Handling schedule work for " + p10);
        WorkDatabase r10 = gVar.g().r();
        r10.e();
        try {
            u h10 = r10.J().h(p10.b());
            if (h10 == null) {
                j.e().k(str, "Skipping scheduling " + p10 + " because it's no longer in the DB");
                return;
            }
            if (h10.f20224b.h()) {
                j.e().k(str, "Skipping scheduling " + p10 + "because it is finished.");
                return;
            }
            long c10 = h10.c();
            if (h10.h()) {
                j.e().a(str, "Opportunistically setting an alarm for " + p10 + "at " + c10);
                a.c(this.f5745a, r10, p10, c10);
                gVar.f().a().execute(new g.b(gVar, a(this.f5745a), i10));
            } else {
                j.e().a(str, "Setting up Alarms for " + p10 + "at " + c10);
                a.c(this.f5745a, r10, p10, c10);
            }
            r10.B();
        } finally {
            r10.i();
        }
    }

    private void l(Intent intent, g gVar) {
        List<v> c10;
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        if (extras.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i10 = extras.getInt("KEY_WORKSPEC_GENERATION");
            c10 = new ArrayList<>(1);
            v b10 = this.f5748d.b(new m(string, i10));
            if (b10 != null) {
                c10.add(b10);
            }
        } else {
            c10 = this.f5748d.c(string);
        }
        for (v vVar : c10) {
            j.e().a(f5744e, "Handing stopWork work for " + string);
            gVar.g().A(vVar);
            a.a(this.f5745a, gVar.g().r(), vVar.a());
            gVar.l(vVar.a(), false);
        }
    }

    private static boolean m(Bundle bundle, String... strArr) {
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

    static m p(Intent intent) {
        return new m(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    private static Intent q(Intent intent, m mVar) {
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_WORKSPEC_GENERATION", mVar.a());
        return intent;
    }

    @Override // androidx.work.impl.e
    /* renamed from: d */
    public void l(m mVar, boolean z10) {
        synchronized (this.f5747c) {
            f remove = this.f5746b.remove(mVar);
            this.f5748d.b(mVar);
            if (remove != null) {
                remove.h(z10);
            }
        }
    }

    public boolean n() {
        boolean z10;
        synchronized (this.f5747c) {
            z10 = !this.f5746b.isEmpty();
        }
        return z10;
    }

    public void o(Intent intent, int i10, g gVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            g(intent, i10, gVar);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            j(intent, i10, gVar);
            return;
        }
        if (!m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            j.e().c(f5744e, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            k(intent, i10, gVar);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            h(intent, i10, gVar);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            l(intent, gVar);
            return;
        }
        if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            i(intent, i10);
            return;
        }
        j.e().k(f5744e, "Ignoring intent " + intent);
    }
}
