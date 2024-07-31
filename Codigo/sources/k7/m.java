package k7;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public class m extends w6.f {

    /* renamed from: a, reason: collision with root package name */
    public final p f20457a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20458b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m(java.lang.Throwable r4, k7.p r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Decoder failed: "
            r0.append(r1)
            r1 = 0
            if (r5 != 0) goto Lf
            r2 = r1
            goto L11
        Lf:
            java.lang.String r2 = r5.f20459a
        L11:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r4)
            r3.f20457a = r5
            int r5 = t8.r0.f26744a
            r0 = 21
            if (r5 < r0) goto L27
            java.lang.String r1 = a(r4)
        L27:
            r3.f20458b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.m.<init>(java.lang.Throwable, k7.p):void");
    }

    private static String a(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
        }
        return null;
    }
}
