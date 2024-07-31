package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import p363t8.C11137a;
import p363t8.C11168p0;

/* renamed from: com.google.android.exoplayer2.source.rtsp.b0 */
/* loaded from: classes.dex */
final class C4728b0 {

    /* renamed from: a */
    public final long f9323a;

    /* renamed from: b */
    public final int f9324b;

    /* renamed from: c */
    public final Uri f9325c;

    private C4728b0(long j10, int i10, Uri uri) {
        this.f9323a = j10;
        this.f9324b = i10;
        this.f9325c = uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081 A[Catch: Exception -> 0x008d, TRY_LEAVE, TryCatch #0 {Exception -> 0x008d, blocks: (B:7:0x0027, B:19:0x006f, B:24:0x0074, B:25:0x0079, B:28:0x007a, B:29:0x0081, B:31:0x0049, B:34:0x0053, B:37:0x005d), top: B:6:0x0027 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.common.collect.AbstractC5907w<com.google.android.exoplayer2.source.rtsp.C4728b0> m12002a(java.lang.String r18, android.net.Uri r19) {
        /*
            com.google.common.collect.w$a r0 = new com.google.common.collect.w$a
            r0.<init>()
            java.lang.String r1 = ","
            r2 = r18
            java.lang.String[] r1 = p363t8.C11172r0.m34891R0(r2, r1)
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L10:
            if (r4 >= r2) goto Lc1
            r5 = r1[r4]
            java.lang.String r6 = ";"
            java.lang.String[] r6 = p363t8.C11172r0.m34891R0(r5, r6)
            int r7 = r6.length
            r12 = r3
            r13 = 0
            r14 = -1
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L23:
            if (r12 >= r7) goto L93
            r8 = r6[r12]
            java.lang.String r9 = "="
            java.lang.String[] r9 = p363t8.C11172r0.m34893S0(r8, r9)     // Catch: java.lang.Exception -> L8d
            r11 = r9[r3]     // Catch: java.lang.Exception -> L8d
            r3 = 1
            r9 = r9[r3]     // Catch: java.lang.Exception -> L8d
            int r10 = r11.hashCode()     // Catch: java.lang.Exception -> L8d
            r3 = 113759(0x1bc5f, float:1.5941E-40)
            r17 = r1
            r1 = 2
            if (r10 == r3) goto L5d
            r3 = 116079(0x1c56f, float:1.62661E-40)
            if (r10 == r3) goto L53
            r3 = 1524180539(0x5ad9263b, float:3.0561052E16)
            if (r10 == r3) goto L49
            goto L67
        L49:
            java.lang.String r3 = "rtptime"
            boolean r3 = r11.equals(r3)     // Catch: java.lang.Exception -> L8d
            if (r3 == 0) goto L67
            r3 = r1
            goto L68
        L53:
            java.lang.String r3 = "url"
            boolean r3 = r11.equals(r3)     // Catch: java.lang.Exception -> L8d
            if (r3 == 0) goto L67
            r3 = 0
            goto L68
        L5d:
            java.lang.String r3 = "seq"
            boolean r3 = r11.equals(r3)     // Catch: java.lang.Exception -> L8d
            if (r3 == 0) goto L67
            r3 = 1
            goto L68
        L67:
            r3 = -1
        L68:
            if (r3 == 0) goto L81
            r10 = 1
            if (r3 == r10) goto L7a
            if (r3 != r1) goto L74
            long r15 = java.lang.Long.parseLong(r9)     // Catch: java.lang.Exception -> L8d
            goto L7e
        L74:
            r0 = 0
            t6.b3 r0 = p361t6.C11005b3.m33717c(r11, r0)     // Catch: java.lang.Exception -> L8d
            throw r0     // Catch: java.lang.Exception -> L8d
        L7a:
            int r14 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.Exception -> L8d
        L7e:
            r1 = r19
            goto L87
        L81:
            r1 = r19
            android.net.Uri r13 = m12003b(r9, r1)     // Catch: java.lang.Exception -> L8d
        L87:
            int r12 = r12 + 1
            r1 = r17
            r3 = 0
            goto L23
        L8d:
            r0 = move-exception
            t6.b3 r0 = p361t6.C11005b3.m33717c(r8, r0)
            throw r0
        L93:
            r17 = r1
            r1 = r19
            if (r13 == 0) goto Lbb
            java.lang.String r3 = r13.getScheme()
            if (r3 == 0) goto Lbb
            r3 = -1
            r8 = r15
            if (r14 != r3) goto Lac
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 == 0) goto Lbb
        Lac:
            com.google.android.exoplayer2.source.rtsp.b0 r3 = new com.google.android.exoplayer2.source.rtsp.b0
            r3.<init>(r8, r14, r13)
            r0.mo14724a(r3)
            int r4 = r4 + 1
            r1 = r17
            r3 = 0
            goto L10
        Lbb:
            r0 = 0
            t6.b3 r0 = p361t6.C11005b3.m33717c(r5, r0)
            throw r0
        Lc1:
            com.google.common.collect.w r0 = r0.m15094k()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.rtsp.C4728b0.m12002a(java.lang.String, android.net.Uri):com.google.common.collect.w");
    }

    /* renamed from: b */
    static Uri m12003b(String str, Uri uri) {
        C11137a.m34599a(((String) C11137a.m34603e(uri.getScheme())).equals("rtsp"));
        Uri parse = Uri.parse(str);
        if (parse.isAbsolute()) {
            return parse;
        }
        String valueOf = String.valueOf(str);
        Uri parse2 = Uri.parse(valueOf.length() != 0 ? "rtsp://".concat(valueOf) : new String("rtsp://"));
        String uri2 = uri.toString();
        return ((String) C11137a.m34603e(parse2.getHost())).equals(uri.getHost()) ? parse2 : uri2.endsWith("/") ? C11168p0.m34839e(uri2, str) : C11168p0.m34839e(uri2.concat("/"), str);
    }
}
