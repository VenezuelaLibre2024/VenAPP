package p211l2;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import kotlin.jvm.internal.C9322n;
import p192k2.C9115d;
import p391v1.InterfaceC11610i;

/* renamed from: l2.l */
/* loaded from: classes.dex */
public final class C9360l {
    /* renamed from: c */
    public static final void m27869c(Context context, InterfaceC11610i sqLiteDatabase) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(sqLiteDatabase, "sqLiteDatabase");
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i10 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i11 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            sqLiteDatabase.mo32142t();
            try {
                sqLiteDatabase.mo32132N("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                sqLiteDatabase.mo32132N("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                sharedPreferences.edit().clear().apply();
                sqLiteDatabase.mo32131M();
            } finally {
                sqLiteDatabase.mo32136X();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final int m27870d(WorkDatabase workDatabase, String str) {
        Long mo26858b = workDatabase.mo8556F().mo26858b(str);
        int longValue = mo26858b != null ? (int) mo26858b.longValue() : 0;
        m27871e(workDatabase, str, longValue != Integer.MAX_VALUE ? longValue + 1 : 0);
        return longValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m27871e(WorkDatabase workDatabase, String str, int i10) {
        workDatabase.mo8556F().mo26857a(new C9115d(str, Long.valueOf(i10)));
    }
}
