package p152i4;

import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: i4.g0 */
/* loaded from: classes.dex */
public final class C7803g0 extends C7824r {

    /* renamed from: c */
    public static final a f18649c = new a(null);
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    private final C7830u f18650b;

    /* renamed from: i4.g0$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7803g0(C7830u requestError, String str) {
        super(str);
        C9322n.m27781e(requestError, "requestError");
        this.f18650b = requestError;
    }

    /* renamed from: c */
    public final C7830u m23916c() {
        return this.f18650b;
    }

    @Override // p152i4.C7824r, java.lang.Throwable
    public String toString() {
        String str = "{FacebookServiceException: httpResponseCode: " + this.f18650b.m24103f() + ", facebookErrorCode: " + this.f18650b.m24099b() + ", facebookErrorType: " + this.f18650b.m24101d() + ", message: " + this.f18650b.m24100c() + "}";
        C9322n.m27780d(str, "StringBuilder()\n        .append(\"{FacebookServiceException: \")\n        .append(\"httpResponseCode: \")\n        .append(requestError.requestStatusCode)\n        .append(\", facebookErrorCode: \")\n        .append(requestError.errorCode)\n        .append(\", facebookErrorType: \")\n        .append(requestError.errorType)\n        .append(\", message: \")\n        .append(requestError.errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
