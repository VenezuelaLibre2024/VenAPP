package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.a0;
import androidx.work.impl.background.systemjob.g;
import androidx.work.impl.e0;
import f2.j;
import f2.s;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k2.u;
import k2.v;
import l2.r;

/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private static final String f5910e = j.i("ForceStopRunnable");

    /* renamed from: f, reason: collision with root package name */
    private static final long f5911f = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a, reason: collision with root package name */
    private final Context f5912a;

    /* renamed from: b, reason: collision with root package name */
    private final e0 f5913b;

    /* renamed from: c, reason: collision with root package name */
    private final r f5914c;

    /* renamed from: d, reason: collision with root package name */
    private int f5915d = 0;

    /* loaded from: classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private static final String f5916a = j.i("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            j.e().j(f5916a, "Rescheduling alarm that keeps track of force-stops.");
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, e0 e0Var) {
        this.f5912a = context.getApplicationContext();
        this.f5913b = e0Var;
        this.f5914c = e0Var.n();
    }

    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent d(Context context, int i10) {
        return PendingIntent.getBroadcast(context, -1, c(context), i10);
    }

    static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent d10 = d(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f5911f;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, d10);
        }
    }

    public boolean a() {
        boolean i10 = g.i(this.f5912a, this.f5913b);
        WorkDatabase r10 = this.f5913b.r();
        v J = r10.J();
        k2.r I = r10.I();
        r10.e();
        try {
            List<u> r11 = J.r();
            boolean z10 = (r11 == null || r11.isEmpty()) ? false : true;
            if (z10) {
                for (u uVar : r11) {
                    J.w(s.a.ENQUEUED, uVar.f20223a);
                    J.n(uVar.f20223a, -1L);
                }
            }
            I.b();
            r10.B();
            return z10 || i10;
        } finally {
            r10.i();
        }
    }

    public void b() {
        boolean a10 = a();
        if (h()) {
            j.e().a(f5910e, "Rescheduling Workers.");
            this.f5913b.v();
            this.f5913b.n().e(false);
        } else if (e()) {
            j.e().a(f5910e, "Application was force-stopped, rescheduling.");
            this.f5913b.v();
            this.f5914c.d(System.currentTimeMillis());
        } else if (a10) {
            j.e().a(f5910e, "Found unfinished work, scheduling it.");
            androidx.work.impl.u.b(this.f5913b.k(), this.f5913b.r(), this.f5913b.p());
        }
    }

    public boolean e() {
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        try {
            int i10 = Build.VERSION.SDK_INT;
            PendingIntent d10 = d(this.f5912a, i10 >= 31 ? 570425344 : 536870912);
            if (i10 >= 30) {
                if (d10 != null) {
                    d10.cancel();
                }
                historicalProcessExitReasons = ((ActivityManager) this.f5912a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long a10 = this.f5914c.a();
                    for (int i11 = 0; i11 < historicalProcessExitReasons.size(); i11++) {
                        ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) historicalProcessExitReasons.get(i11);
                        reason = applicationExitInfo.getReason();
                        if (reason == 10) {
                            timestamp = applicationExitInfo.getTimestamp();
                            if (timestamp >= a10) {
                                return true;
                            }
                        }
                    }
                }
            } else if (d10 == null) {
                g(this.f5912a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e10) {
            j.e().l(f5910e, "Ignoring exception", e10);
            return true;
        }
    }

    public boolean f() {
        a k10 = this.f5913b.k();
        if (TextUtils.isEmpty(k10.c())) {
            j.e().a(f5910e, "The default process name was not specified.");
            return true;
        }
        boolean b10 = l2.s.b(this.f5912a, k10);
        j.e().a(f5910e, "Is default app process = " + b10);
        return b10;
    }

    public boolean h() {
        return this.f5913b.n().b();
    }

    public void i(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IllegalStateException illegalStateException;
        androidx.core.util.a<Throwable> e10;
        int i10;
        try {
            if (f()) {
                while (true) {
                    try {
                        a0.d(this.f5912a);
                        j.e().a(f5910e, "Performing cleanup operations.");
                        try {
                            b();
                            break;
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e11) {
                            i10 = this.f5915d + 1;
                            this.f5915d = i10;
                            if (i10 >= 3) {
                                j e12 = j.e();
                                String str = f5910e;
                                e12.d(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e11);
                                illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e11);
                                e10 = this.f5913b.k().e();
                                if (e10 == null) {
                                    throw illegalStateException;
                                }
                                j.e().b(str, "Routing exception to the specified exception handler", illegalStateException);
                                e10.accept(illegalStateException);
                            }
                            j.e().b(f5910e, "Retrying after " + (i10 * 300), e11);
                            i(((long) this.f5915d) * 300);
                        }
                        j.e().b(f5910e, "Retrying after " + (i10 * 300), e11);
                        i(((long) this.f5915d) * 300);
                    } catch (SQLiteException e13) {
                        j.e().c(f5910e, "Unexpected SQLite exception during migrations");
                        illegalStateException = new IllegalStateException("Unexpected SQLite exception during migrations", e13);
                        e10 = this.f5913b.k().e();
                        if (e10 == null) {
                            throw illegalStateException;
                        }
                    }
                }
            }
        } finally {
            this.f5913b.u();
        }
    }
}
