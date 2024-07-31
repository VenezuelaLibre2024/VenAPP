package androidx.core.app;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* renamed from: androidx.core.app.f */
/* loaded from: classes.dex */
public final class C0791f {

    /* renamed from: androidx.core.app.f$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static void m3968a(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setExact(i10, j10, pendingIntent);
        }
    }

    /* renamed from: androidx.core.app.f$b */
    /* loaded from: classes.dex */
    static class b {
        /* renamed from: a */
        static void m3969a(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i10, j10, pendingIntent);
        }

        /* renamed from: b */
        static void m3970b(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i10, j10, pendingIntent);
        }
    }

    /* renamed from: a */
    public static void m3966a(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
        a.m3968a(alarmManager, i10, j10, pendingIntent);
    }

    /* renamed from: b */
    public static void m3967b(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
        b.m3970b(alarmManager, i10, j10, pendingIntent);
    }
}
