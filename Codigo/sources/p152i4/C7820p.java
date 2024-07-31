package p152i4;

import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: i4.p */
/* loaded from: classes.dex */
public final class C7820p extends C7824r {

    /* renamed from: d */
    public static final a f18742d = new a(null);
    public static final long serialVersionUID = 1;

    /* renamed from: b */
    private final int f18743b;

    /* renamed from: c */
    private final String f18744c;

    /* renamed from: i4.p$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    public C7820p(String str, int i10, String str2) {
        super(str);
        this.f18743b = i10;
        this.f18744c = str2;
    }

    @Override // p152i4.C7824r, java.lang.Throwable
    public String toString() {
        String str = "{FacebookDialogException: errorCode: " + this.f18743b + ", message: " + getMessage() + ", url: " + this.f18744c + "}";
        C9322n.m27780d(str, "StringBuilder()\n        .append(\"{FacebookDialogException: \")\n        .append(\"errorCode: \")\n        .append(errorCode)\n        .append(\", message: \")\n        .append(message)\n        .append(\", url: \")\n        .append(failingUrl)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
