package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.C4725a;
import com.google.android.exoplayer2.source.rtsp.C4730c0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p361t6.C11005b3;
import p363t8.C11137a;

/* renamed from: com.google.android.exoplayer2.source.rtsp.d0 */
/* loaded from: classes.dex */
final class C4732d0 {

    /* renamed from: a */
    private static final Pattern f9363a = Pattern.compile("([a-z])=\\s?(.+)");

    /* renamed from: b */
    private static final Pattern f9364b = Pattern.compile("([\\x21\\x23-\\x27\\x2a\\x2b\\x2d\\x2e\\x30-\\x39\\x41-\\x5a\\x5e-\\x7e]+)(?::(.*))?");

    /* renamed from: c */
    private static final Pattern f9365c = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");

    /* renamed from: a */
    private static void m12036a(C4730c0.b bVar, C4725a.b bVar2) {
        try {
            bVar.m12017n(bVar2.m11991j());
        } catch (IllegalArgumentException | IllegalStateException e10) {
            throw C11005b3.m33717c(null, e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d0, code lost:
    
        continue;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.source.rtsp.C4730c0 m12037b(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.rtsp.C4732d0.m12037b(java.lang.String):com.google.android.exoplayer2.source.rtsp.c0");
    }

    /* renamed from: c */
    private static C4725a.b m12038c(String str) {
        Matcher matcher = f9365c.matcher(str);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(str);
            throw C11005b3.m33717c(valueOf.length() != 0 ? "Malformed SDP media description line: ".concat(valueOf) : new String("Malformed SDP media description line: "), null);
        }
        try {
            return new C4725a.b((String) C11137a.m34603e(matcher.group(1)), Integer.parseInt((String) C11137a.m34603e(matcher.group(2))), (String) C11137a.m34603e(matcher.group(3)), Integer.parseInt((String) C11137a.m34603e(matcher.group(4))));
        } catch (NumberFormatException e10) {
            String valueOf2 = String.valueOf(str);
            throw C11005b3.m33717c(valueOf2.length() != 0 ? "Malformed SDP media description line: ".concat(valueOf2) : new String("Malformed SDP media description line: "), e10);
        }
    }
}
