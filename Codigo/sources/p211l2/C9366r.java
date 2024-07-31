package p211l2;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import p192k2.C9115d;
import p391v1.InterfaceC11610i;

/* renamed from: l2.r */
/* loaded from: classes.dex */
public class C9366r {

    /* renamed from: a */
    private final WorkDatabase f22685a;

    public C9366r(WorkDatabase workDatabase) {
        this.f22685a = workDatabase;
    }

    /* renamed from: c */
    public static void m27879c(Context context, InterfaceC11610i interfaceC11610i) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j11 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            interfaceC11610i.mo32142t();
            try {
                interfaceC11610i.mo32132N("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                interfaceC11610i.mo32132N("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j11)});
                sharedPreferences.edit().clear().apply();
                interfaceC11610i.mo32131M();
            } finally {
                interfaceC11610i.mo32136X();
            }
        }
    }

    /* renamed from: a */
    public long m27880a() {
        Long mo26858b = this.f22685a.mo8556F().mo26858b("last_force_stop_ms");
        if (mo26858b != null) {
            return mo26858b.longValue();
        }
        return 0L;
    }

    /* renamed from: b */
    public boolean m27881b() {
        Long mo26858b = this.f22685a.mo8556F().mo26858b("reschedule_needed");
        return mo26858b != null && mo26858b.longValue() == 1;
    }

    /* renamed from: d */
    public void m27882d(long j10) {
        this.f22685a.mo8556F().mo26857a(new C9115d("last_force_stop_ms", Long.valueOf(j10)));
    }

    /* renamed from: e */
    public void m27883e(boolean z10) {
        this.f22685a.mo8556F().mo26857a(new C9115d("reschedule_needed", z10));
    }
}
