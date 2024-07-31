package androidx.privacysandbox.ads.adservices.topics;

import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f5020a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f5021b;

    /* renamed from: androidx.privacysandbox.ads.adservices.topics.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0076a {

        /* renamed from: a, reason: collision with root package name */
        private String f5022a = "";

        /* renamed from: b, reason: collision with root package name */
        private boolean f5023b = true;

        public final a a() {
            if (this.f5022a.length() > 0) {
                return new a(this.f5022a, this.f5023b);
            }
            throw new IllegalStateException("adsSdkName must be set".toString());
        }

        public final C0076a b(String adsSdkName) {
            n.e(adsSdkName, "adsSdkName");
            this.f5022a = adsSdkName;
            return this;
        }

        public final C0076a c(boolean z10) {
            this.f5023b = z10;
            return this;
        }
    }

    public a() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public a(String adsSdkName, boolean z10) {
        n.e(adsSdkName, "adsSdkName");
        this.f5020a = adsSdkName;
        this.f5021b = z10;
    }

    public /* synthetic */ a(String str, boolean z10, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? false : z10);
    }

    public final String a() {
        return this.f5020a;
    }

    public final boolean b() {
        return this.f5021b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return n.a(this.f5020a, aVar.f5020a) && this.f5021b == aVar.f5021b;
    }

    public int hashCode() {
        return (this.f5020a.hashCode() * 31) + Boolean.hashCode(this.f5021b);
    }

    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f5020a + ", shouldRecordObservation=" + this.f5021b;
    }
}
