package androidx.privacysandbox.ads.adservices.topics;

import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: androidx.privacysandbox.ads.adservices.topics.a */
/* loaded from: classes.dex */
public final class C1333a {

    /* renamed from: a */
    private final String f5774a;

    /* renamed from: b */
    private final boolean f5775b;

    /* renamed from: androidx.privacysandbox.ads.adservices.topics.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private String f5776a = "";

        /* renamed from: b */
        private boolean f5777b = true;

        /* renamed from: a */
        public final C1333a m7450a() {
            if (this.f5776a.length() > 0) {
                return new C1333a(this.f5776a, this.f5777b);
            }
            throw new IllegalStateException("adsSdkName must be set".toString());
        }

        /* renamed from: b */
        public final a m7451b(String adsSdkName) {
            C9322n.m27781e(adsSdkName, "adsSdkName");
            this.f5776a = adsSdkName;
            return this;
        }

        /* renamed from: c */
        public final a m7452c(boolean z10) {
            this.f5777b = z10;
            return this;
        }
    }

    public C1333a() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public C1333a(String adsSdkName, boolean z10) {
        C9322n.m27781e(adsSdkName, "adsSdkName");
        this.f5774a = adsSdkName;
        this.f5775b = z10;
    }

    public /* synthetic */ C1333a(String str, boolean z10, int i10, C9315g c9315g) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? false : z10);
    }

    /* renamed from: a */
    public final String m7448a() {
        return this.f5774a;
    }

    /* renamed from: b */
    public final boolean m7449b() {
        return this.f5775b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1333a)) {
            return false;
        }
        C1333a c1333a = (C1333a) obj;
        return C9322n.m27777a(this.f5774a, c1333a.f5774a) && this.f5775b == c1333a.f5775b;
    }

    public int hashCode() {
        return (this.f5774a.hashCode() * 31) + Boolean.hashCode(this.f5775b);
    }

    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f5774a + ", shouldRecordObservation=" + this.f5775b;
    }
}
