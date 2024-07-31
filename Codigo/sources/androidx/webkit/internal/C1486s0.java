package androidx.webkit.internal;

import java.net.URLConnection;

/* renamed from: androidx.webkit.internal.s0 */
/* loaded from: classes.dex */
class C1486s0 {
    /* renamed from: a */
    public static String m8430a(String str) {
        if (str == null) {
            return null;
        }
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        return guessContentTypeFromName != null ? guessContentTypeFromName : m8431b(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x004f, code lost:
    
        if (r5.equals("mhtml") == false) goto L7;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String m8431b(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 1104
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.webkit.internal.C1486s0.m8431b(java.lang.String):java.lang.String");
    }
}
