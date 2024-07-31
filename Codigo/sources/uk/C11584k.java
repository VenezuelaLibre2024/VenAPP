package uk;

import kotlin.jvm.internal.C9322n;

/* renamed from: uk.k */
/* loaded from: classes3.dex */
class C11584k {
    /* renamed from: a */
    public static final void m36292a(boolean z10, Number step) {
        C9322n.m27781e(step, "step");
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }
}
