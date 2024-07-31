package ql;

/* loaded from: classes3.dex */
public enum f0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    public static final a Companion = new a(null);
    private final String javaName;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final f0 a(String javaName) {
            kotlin.jvm.internal.n.e(javaName, "javaName");
            int hashCode = javaName.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (javaName.equals("TLSv1.1")) {
                                return f0.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals("TLSv1.2")) {
                                return f0.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals("TLSv1.3")) {
                                return f0.TLS_1_3;
                            }
                            break;
                    }
                } else if (javaName.equals("TLSv1")) {
                    return f0.TLS_1_0;
                }
            } else if (javaName.equals("SSLv3")) {
                return f0.SSL_3_0;
            }
            throw new IllegalArgumentException(kotlin.jvm.internal.n.k("Unexpected TLS version: ", javaName));
        }
    }

    f0(String str) {
        this.javaName = str;
    }

    public final String h() {
        return this.javaName;
    }
}
