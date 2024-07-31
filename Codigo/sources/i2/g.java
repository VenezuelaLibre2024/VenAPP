package i2;

import android.os.Build;
import f2.k;
import k2.u;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class g extends c<h2.b> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j2.h<h2.b> tracker) {
        super(tracker);
        n.e(tracker, "tracker");
    }

    @Override // i2.c
    public boolean b(u workSpec) {
        n.e(workSpec, "workSpec");
        k d10 = workSpec.f20232j.d();
        return d10 == k.UNMETERED || (Build.VERSION.SDK_INT >= 30 && d10 == k.TEMPORARILY_UNMETERED);
    }

    @Override // i2.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(h2.b value) {
        n.e(value, "value");
        return !value.a() || value.b();
    }
}
