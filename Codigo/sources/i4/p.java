package i4;

/* loaded from: classes.dex */
public final class p extends r {

    /* renamed from: d, reason: collision with root package name */
    public static final a f17083d = new a(null);
    public static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    private final int f17084b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17085c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public p(String str, int i10, String str2) {
        super(str);
        this.f17084b = i10;
        this.f17085c = str2;
    }

    @Override // i4.r, java.lang.Throwable
    public String toString() {
        String str = "{FacebookDialogException: errorCode: " + this.f17084b + ", message: " + getMessage() + ", url: " + this.f17085c + "}";
        kotlin.jvm.internal.n.d(str, "StringBuilder()\n        .append(\"{FacebookDialogException: \")\n        .append(\"errorCode: \")\n        .append(errorCode)\n        .append(\", message: \")\n        .append(message)\n        .append(\", url: \")\n        .append(failingUrl)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
