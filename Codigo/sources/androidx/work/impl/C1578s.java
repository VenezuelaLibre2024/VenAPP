package androidx.work.impl;

import android.content.Context;
import kotlin.jvm.internal.C9322n;
import p344s1.AbstractC10767b;
import p391v1.InterfaceC11610i;

/* renamed from: androidx.work.impl.s */
/* loaded from: classes.dex */
public final class C1578s extends AbstractC10767b {

    /* renamed from: c */
    private final Context f6763c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1578s(Context mContext, int i10, int i11) {
        super(i10, i11);
        C9322n.m27781e(mContext, "mContext");
        this.f6763c = mContext;
    }

    @Override // p344s1.AbstractC10767b
    /* renamed from: a */
    public void mo8672a(InterfaceC11610i db2) {
        C9322n.m27781e(db2, "db");
        if (this.f27195b >= 10) {
            db2.mo32132N("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
        } else {
            this.f6763c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
