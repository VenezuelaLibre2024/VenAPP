package p137hb;

import p082eb.C7159o;

/* renamed from: hb.b */
/* loaded from: classes2.dex */
public final class C7687b {
    /* renamed from: a */
    public static char m23406a(long j10) {
        char c10 = (char) j10;
        C7159o.m21307j(((long) c10) == j10, "Out of range: %s", j10);
        return c10;
    }

    /* renamed from: b */
    public static boolean m23407b(char[] cArr, char c10) {
        for (char c11 : cArr) {
            if (c11 == c10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static char m23408c(byte b10, byte b11) {
        return (char) ((b10 << 8) | (b11 & 255));
    }
}
