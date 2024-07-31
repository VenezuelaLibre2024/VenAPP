package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.a;
import com.google.android.exoplayer2.source.rtsp.c0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t6.b3;

/* loaded from: classes.dex */
final class d0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f8319a = Pattern.compile("([a-z])=\\s?(.+)");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f8320b = Pattern.compile("([\\x21\\x23-\\x27\\x2a\\x2b\\x2d\\x2e\\x30-\\x39\\x41-\\x5a\\x5e-\\x7e]+)(?::(.*))?");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f8321c = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");

    private static void a(c0.b bVar, a.b bVar2) {
        try {
            bVar.n(bVar2.j());
        } catch (IllegalArgumentException | IllegalStateException e10) {
            throw b3.c(null, e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d0, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.source.rtsp.c0 b(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.rtsp.d0.b(java.lang.String):com.google.android.exoplayer2.source.rtsp.c0");
    }

    private static a.b c(String str) {
        Matcher matcher = f8321c.matcher(str);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(str);
            throw b3.c(valueOf.length() != 0 ? "Malformed SDP media description line: ".concat(valueOf) : new String("Malformed SDP media description line: "), null);
        }
        try {
            return new a.b((String) t8.a.e(matcher.group(1)), Integer.parseInt((String) t8.a.e(matcher.group(2))), (String) t8.a.e(matcher.group(3)), Integer.parseInt((String) t8.a.e(matcher.group(4))));
        } catch (NumberFormatException e10) {
            String valueOf2 = String.valueOf(str);
            throw b3.c(valueOf2.length() != 0 ? "Malformed SDP media description line: ".concat(valueOf2) : new String("Malformed SDP media description line: "), e10);
        }
    }
}
