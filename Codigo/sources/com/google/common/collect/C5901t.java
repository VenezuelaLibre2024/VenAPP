package com.google.common.collect;

/* renamed from: com.google.common.collect.t */
/* loaded from: classes2.dex */
final class C5901t {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m15049a(int i10, double d10) {
        int max = Math.max(i10, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (d10 * highestOneBit))) {
            return highestOneBit;
        }
        int i11 = highestOneBit << 1;
        if (i11 > 0) {
            return i11;
        }
        return 1073741824;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m15050b(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m15051c(Object obj) {
        return m15050b(obj == null ? 0 : obj.hashCode());
    }
}
