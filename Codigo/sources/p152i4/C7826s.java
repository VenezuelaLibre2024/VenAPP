package p152i4;

import kotlin.jvm.internal.C9322n;

/* renamed from: i4.s */
/* loaded from: classes.dex */
public final class C7826s extends C7824r {

    /* renamed from: b */
    private final C7817n0 f18751b;

    public C7826s(C7817n0 c7817n0, String str) {
        super(str);
        this.f18751b = c7817n0;
    }

    @Override // p152i4.C7824r, java.lang.Throwable
    public String toString() {
        C7817n0 c7817n0 = this.f18751b;
        C7830u m24061b = c7817n0 == null ? null : c7817n0.m24061b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb2.append(message);
            sb2.append(" ");
        }
        if (m24061b != null) {
            sb2.append("httpResponseCode: ");
            sb2.append(m24061b.m24103f());
            sb2.append(", facebookErrorCode: ");
            sb2.append(m24061b.m24099b());
            sb2.append(", facebookErrorType: ");
            sb2.append(m24061b.m24101d());
            sb2.append(", message: ");
            sb2.append(m24061b.m24100c());
            sb2.append("}");
        }
        String sb3 = sb2.toString();
        C9322n.m27780d(sb3, "errorStringBuilder.toString()");
        return sb3;
    }
}
