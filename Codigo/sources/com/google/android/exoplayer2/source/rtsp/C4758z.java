package com.google.android.exoplayer2.source.rtsp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p361t6.C11005b3;
import p363t8.C11137a;
import p363t8.C11172r0;

/* renamed from: com.google.android.exoplayer2.source.rtsp.z */
/* loaded from: classes.dex */
final class C4758z {

    /* renamed from: c */
    public static final C4758z f9522c = new C4758z(0, -9223372036854775807L);

    /* renamed from: d */
    private static final Pattern f9523d = Pattern.compile("npt=([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* renamed from: a */
    public final long f9524a;

    /* renamed from: b */
    public final long f9525b;

    private C4758z(long j10, long j11) {
        this.f9524a = j10;
        this.f9525b = j11;
    }

    /* renamed from: b */
    public static String m12248b(long j10) {
        return C11172r0.m34860C("npt=%.3f-", Double.valueOf(j10 / 1000.0d));
    }

    /* renamed from: d */
    public static C4758z m12249d(String str) {
        long parseFloat;
        Matcher matcher = f9523d.matcher(str);
        C11137a.m34599a(matcher.matches());
        long parseFloat2 = ((String) C11137a.m34603e(matcher.group(1))).equals("now") ? 0L : Float.parseFloat(r1) * 1000.0f;
        String group = matcher.group(2);
        if (group != null) {
            try {
                parseFloat = Float.parseFloat(group) * 1000.0f;
                C11137a.m34599a(parseFloat > parseFloat2);
            } catch (NumberFormatException e10) {
                throw C11005b3.m33717c(group, e10);
            }
        } else {
            parseFloat = -9223372036854775807L;
        }
        return new C4758z(parseFloat2, parseFloat);
    }

    /* renamed from: a */
    public long m12250a() {
        return this.f9525b - this.f9524a;
    }

    /* renamed from: c */
    public boolean m12251c() {
        return this.f9525b == -9223372036854775807L;
    }
}
