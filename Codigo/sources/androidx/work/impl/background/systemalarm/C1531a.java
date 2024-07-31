package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import p094f2.AbstractC7277j;
import p192k2.C9120i;
import p192k2.C9123l;
import p192k2.C9124m;
import p192k2.InterfaceC9121j;
import p211l2.C9359k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.work.impl.background.systemalarm.a */
/* loaded from: classes.dex */
public class C1531a {

    /* renamed from: a */
    private static final String f6594a = AbstractC7277j.m21769i("Alarms");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.background.systemalarm.a$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static void m8605a(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setExact(i10, j10, pendingIntent);
        }
    }

    /* renamed from: a */
    public static void m8601a(Context context, WorkDatabase workDatabase, C9124m c9124m) {
        InterfaceC9121j mo8557G = workDatabase.mo8557G();
        C9120i mo26867e = mo8557G.mo26867e(c9124m);
        if (mo26867e != null) {
            m8602b(context, c9124m, mo26867e.f21978c);
            AbstractC7277j.m21767e().mo21770a(f6594a, "Removing SystemIdInfo for workSpecId (" + c9124m + ")");
            mo8557G.mo26863a(c9124m);
        }
    }

    /* renamed from: b */
    private static void m8602b(Context context, C9124m c9124m, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, C1532b.m8607b(context, c9124m), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        AbstractC7277j.m21767e().mo21770a(f6594a, "Cancelling existing alarm with (workSpecId, systemId) (" + c9124m + ", " + i10 + ")");
        alarmManager.cancel(service);
    }

    /* renamed from: c */
    public static void m8603c(Context context, WorkDatabase workDatabase, C9124m c9124m, long j10) {
        int m27865c;
        InterfaceC9121j mo8557G = workDatabase.mo8557G();
        C9120i mo26867e = mo8557G.mo26867e(c9124m);
        if (mo26867e != null) {
            m8602b(context, c9124m, mo26867e.f21978c);
            m27865c = mo26867e.f21978c;
        } else {
            m27865c = new C9359k(workDatabase).m27865c();
            mo8557G.mo26865c(C9123l.m26874a(c9124m, m27865c));
        }
        m8604d(context, c9124m, m27865c, j10);
    }

    /* renamed from: d */
    private static void m8604d(Context context, C9124m c9124m, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, C1532b.m8607b(context, c9124m), 201326592);
        if (alarmManager != null) {
            a.m8605a(alarmManager, 0, j10, service);
        }
    }
}
