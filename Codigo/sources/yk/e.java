package yk;

import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
class e {
    public static final long a(long j10, d sourceUnit, d targetUnit) {
        n.e(sourceUnit, "sourceUnit");
        n.e(targetUnit, "targetUnit");
        return targetUnit.h().convert(j10, sourceUnit.h());
    }

    public static final long b(long j10, d sourceUnit, d targetUnit) {
        n.e(sourceUnit, "sourceUnit");
        n.e(targetUnit, "targetUnit");
        return targetUnit.h().convert(j10, sourceUnit.h());
    }
}
