package androidx.work.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class s extends s1.b {

    /* renamed from: c, reason: collision with root package name */
    private final Context f5908c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context mContext, int i10, int i11) {
        super(i10, i11);
        kotlin.jvm.internal.n.e(mContext, "mContext");
        this.f5908c = mContext;
    }

    @Override // s1.b
    public void a(v1.i db2) {
        kotlin.jvm.internal.n.e(db2, "db");
        if (this.f25076b >= 10) {
            db2.N("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
        } else {
            this.f5908c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
