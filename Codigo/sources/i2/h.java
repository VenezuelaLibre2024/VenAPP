package i2;

import k2.u;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class h extends c<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j2.h<Boolean> tracker) {
        super(tracker);
        n.e(tracker, "tracker");
    }

    @Override // i2.c
    public boolean b(u workSpec) {
        n.e(workSpec, "workSpec");
        return workSpec.f20232j.i();
    }

    @Override // i2.c
    public /* bridge */ /* synthetic */ boolean c(Boolean bool) {
        return i(bool.booleanValue());
    }

    public boolean i(boolean z10) {
        return !z10;
    }
}
