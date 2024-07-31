package p319ql;

import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: ql.f0 */
/* loaded from: classes3.dex */
public enum EnumC10531f0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    public static final a Companion = new a(null);
    private final String javaName;

    /* renamed from: ql.f0$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final EnumC10531f0 m31722a(String javaName) {
            C9322n.m27781e(javaName, "javaName");
            int hashCode = javaName.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (javaName.equals("TLSv1.1")) {
                                return EnumC10531f0.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals("TLSv1.2")) {
                                return EnumC10531f0.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals("TLSv1.3")) {
                                return EnumC10531f0.TLS_1_3;
                            }
                            break;
                    }
                } else if (javaName.equals("TLSv1")) {
                    return EnumC10531f0.TLS_1_0;
                }
            } else if (javaName.equals("SSLv3")) {
                return EnumC10531f0.SSL_3_0;
            }
            throw new IllegalArgumentException(C9322n.m27787k("Unexpected TLS version: ", javaName));
        }
    }

    EnumC10531f0(String str) {
        this.javaName = str;
    }

    /* renamed from: h */
    public final String m31721h() {
        return this.javaName;
    }
}
