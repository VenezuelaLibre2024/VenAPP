package p137hb;

import p082eb.C7159o;

/* renamed from: hb.g */
/* loaded from: classes2.dex */
public final class C7692g {
    /* renamed from: a */
    public static int m23425a(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 > j11 ? 1 : 0;
    }

    /* renamed from: b */
    public static int m23426b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* renamed from: c */
    public static long m23427c(long... jArr) {
        C7159o.m21301d(jArr.length > 0);
        long j10 = jArr[0];
        for (int i10 = 1; i10 < jArr.length; i10++) {
            long j11 = jArr[i10];
            if (j11 > j10) {
                j10 = j11;
            }
        }
        return j10;
    }
}
