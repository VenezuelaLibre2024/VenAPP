package n9;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f21909a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21910b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f21911a = "";

        /* renamed from: b, reason: collision with root package name */
        private String f21912b = "";

        public e a() {
            return new e(this, null);
        }

        public a b(String str) {
            this.f21912b = str;
            return this;
        }

        public a c(String str) {
            this.f21911a = str;
            return this;
        }
    }

    /* synthetic */ e(a aVar, i iVar) {
        this.f21909a = aVar.f21911a;
        this.f21910b = aVar.f21912b;
    }

    public String a() {
        return this.f21910b;
    }

    public String b() {
        return this.f21909a;
    }
}
