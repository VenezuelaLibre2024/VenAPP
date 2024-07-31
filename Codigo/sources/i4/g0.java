package i4;

/* loaded from: classes.dex */
public final class g0 extends r {

    /* renamed from: c */
    public static final a f16996c = new a(null);
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    private final u f16997b;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(u requestError, String str) {
        super(str);
        kotlin.jvm.internal.n.e(requestError, "requestError");
        this.f16997b = requestError;
    }

    public final u c() {
        return this.f16997b;
    }

    @Override // i4.r, java.lang.Throwable
    public String toString() {
        String str = "{FacebookServiceException: httpResponseCode: " + this.f16997b.f() + ", facebookErrorCode: " + this.f16997b.b() + ", facebookErrorType: " + this.f16997b.d() + ", message: " + this.f16997b.c() + "}";
        kotlin.jvm.internal.n.d(str, "StringBuilder()\n        .append(\"{FacebookServiceException: \")\n        .append(\"httpResponseCode: \")\n        .append(requestError.requestStatusCode)\n        .append(\", facebookErrorCode: \")\n        .append(requestError.errorCode)\n        .append(\", facebookErrorType: \")\n        .append(requestError.errorType)\n        .append(\", message: \")\n        .append(requestError.errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
