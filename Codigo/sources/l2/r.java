package l2;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final WorkDatabase f20863a;

    public r(WorkDatabase workDatabase) {
        this.f20863a = workDatabase;
    }

    public static void c(Context context, v1.i iVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j11 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            iVar.t();
            try {
                iVar.N("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                iVar.N("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j11)});
                sharedPreferences.edit().clear().apply();
                iVar.M();
            } finally {
                iVar.X();
            }
        }
    }

    public long a() {
        Long b10 = this.f20863a.F().b("last_force_stop_ms");
        if (b10 != null) {
            return b10.longValue();
        }
        return 0L;
    }

    public boolean b() {
        Long b10 = this.f20863a.F().b("reschedule_needed");
        return b10 != null && b10.longValue() == 1;
    }

    public void d(long j10) {
        this.f20863a.F().a(new k2.d("last_force_stop_ms", Long.valueOf(j10)));
    }

    public void e(boolean z10) {
        this.f20863a.F().a(new k2.d("reschedule_needed", z10));
    }
}
