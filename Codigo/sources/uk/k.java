package uk;

import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
class k {
    public static final void a(boolean z10, Number step) {
        n.e(step, "step");
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }
}
