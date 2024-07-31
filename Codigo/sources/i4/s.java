package i4;

/* loaded from: classes.dex */
public final class s extends r {

    /* renamed from: b, reason: collision with root package name */
    private final n0 f17092b;

    public s(n0 n0Var, String str) {
        super(str);
        this.f17092b = n0Var;
    }

    @Override // i4.r, java.lang.Throwable
    public String toString() {
        n0 n0Var = this.f17092b;
        u b10 = n0Var == null ? null : n0Var.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb2.append(message);
            sb2.append(" ");
        }
        if (b10 != null) {
            sb2.append("httpResponseCode: ");
            sb2.append(b10.f());
            sb2.append(", facebookErrorCode: ");
            sb2.append(b10.b());
            sb2.append(", facebookErrorType: ");
            sb2.append(b10.d());
            sb2.append(", message: ");
            sb2.append(b10.c());
            sb2.append("}");
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.n.d(sb3, "errorStringBuilder.toString()");
        return sb3;
    }
}
