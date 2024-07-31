package p197k7;

import android.media.MediaCodec;
import p414w6.C12081f;

/* renamed from: k7.m */
/* loaded from: classes.dex */
public class C9192m extends C12081f {

    /* renamed from: a */
    public final C9195p f22239a;

    /* renamed from: b */
    public final String f22240b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C9192m(java.lang.Throwable r4, p197k7.C9195p r5) {
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
            java.lang.String r2 = r5.f22241a
        L11:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r4)
            r3.f22239a = r5
            int r5 = p363t8.C11172r0.f29040a
            r0 = 21
            if (r5 < r0) goto L27
            java.lang.String r1 = m27261a(r4)
        L27:
            r3.f22240b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p197k7.C9192m.<init>(java.lang.Throwable, k7.p):void");
    }

    /* renamed from: a */
    private static String m27261a(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
        }
        return null;
    }
}
