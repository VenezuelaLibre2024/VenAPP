package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import f2.j;
import k2.i;
import k2.l;
import k2.m;
import l2.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5743a = j.i("Alarms");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.background.systemalarm.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0095a {
        static void a(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setExact(i10, j10, pendingIntent);
        }
    }

    public static void a(Context context, WorkDatabase workDatabase, m mVar) {
        k2.j G = workDatabase.G();
        i e10 = G.e(mVar);
        if (e10 != null) {
            b(context, mVar, e10.f20196c);
            j.e().a(f5743a, "Removing SystemIdInfo for workSpecId (" + mVar + ")");
            G.a(mVar);
        }
    }

    private static void b(Context context, m mVar, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, mVar), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        j.e().a(f5743a, "Cancelling existing alarm with (workSpecId, systemId) (" + mVar + ", " + i10 + ")");
        alarmManager.cancel(service);
    }

    public static void c(Context context, WorkDatabase workDatabase, m mVar, long j10) {
        int c10;
        k2.j G = workDatabase.G();
        i e10 = G.e(mVar);
        if (e10 != null) {
            b(context, mVar, e10.f20196c);
            c10 = e10.f20196c;
        } else {
            c10 = new k(workDatabase).c();
            G.c(l.a(mVar, c10));
        }
        d(context, mVar, c10, j10);
    }

    private static void d(Context context, m mVar, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, mVar), 201326592);
        if (alarmManager != null) {
            C0095a.a(alarmManager, 0, j10, service);
        }
    }
}
