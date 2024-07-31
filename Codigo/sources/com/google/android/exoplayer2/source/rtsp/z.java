package com.google.android.exoplayer2.source.rtsp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t6.b3;
import t8.r0;

/* loaded from: classes.dex */
final class z {

    /* renamed from: c, reason: collision with root package name */
    public static final z f8467c = new z(0, -9223372036854775807L);

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f8468d = Pattern.compile("npt=([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* renamed from: a, reason: collision with root package name */
    public final long f8469a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8470b;

    private z(long j10, long j11) {
        this.f8469a = j10;
        this.f8470b = j11;
    }

    public static String b(long j10) {
        return r0.C("npt=%.3f-", Double.valueOf(j10 / 1000.0d));
    }

    public static z d(String str) {
        long parseFloat;
        Matcher matcher = f8468d.matcher(str);
        t8.a.a(matcher.matches());
        long parseFloat2 = ((String) t8.a.e(matcher.group(1))).equals("now") ? 0L : Float.parseFloat(r1) * 1000.0f;
        String group = matcher.group(2);
        if (group != null) {
            try {
                parseFloat = Float.parseFloat(group) * 1000.0f;
                t8.a.a(parseFloat > parseFloat2);
            } catch (NumberFormatException e10) {
                throw b3.c(group, e10);
            }
        } else {
            parseFloat = -9223372036854775807L;
        }
        return new z(parseFloat2, parseFloat);
    }

    public long a() {
        return this.f8470b - this.f8469a;
    }

    public boolean c() {
        return this.f8470b == -9223372036854775807L;
    }
}
