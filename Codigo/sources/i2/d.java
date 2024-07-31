package i2;

import android.os.Build;
import f2.k;
import k2.u;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class d extends c<h2.b> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j2.h<h2.b> tracker) {
        super(tracker);
        n.e(tracker, "tracker");
    }

    @Override // i2.c
    public boolean b(u workSpec) {
        n.e(workSpec, "workSpec");
        return workSpec.f20232j.d() == k.CONNECTED;
    }

    @Override // i2.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(h2.b value) {
        n.e(value, "value");
        if (Build.VERSION.SDK_INT >= 26) {
            if (!value.a() || !value.d()) {
                return true;
            }
        } else if (!value.a()) {
            return true;
        }
        return false;
    }
}
