package p319ql;

import java.io.IOException;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: ql.z */
/* loaded from: classes3.dex */
public enum EnumC10551z {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public static final a Companion = new a(null);
    private final String protocol;

    /* renamed from: ql.z$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final EnumC10551z m32035a(String protocol) {
            C9322n.m27781e(protocol, "protocol");
            EnumC10551z enumC10551z = EnumC10551z.HTTP_1_0;
            if (!C9322n.m27777a(protocol, enumC10551z.protocol)) {
                enumC10551z = EnumC10551z.HTTP_1_1;
                if (!C9322n.m27777a(protocol, enumC10551z.protocol)) {
                    enumC10551z = EnumC10551z.H2_PRIOR_KNOWLEDGE;
                    if (!C9322n.m27777a(protocol, enumC10551z.protocol)) {
                        enumC10551z = EnumC10551z.HTTP_2;
                        if (!C9322n.m27777a(protocol, enumC10551z.protocol)) {
                            enumC10551z = EnumC10551z.SPDY_3;
                            if (!C9322n.m27777a(protocol, enumC10551z.protocol)) {
                                enumC10551z = EnumC10551z.QUIC;
                                if (!C9322n.m27777a(protocol, enumC10551z.protocol)) {
                                    throw new IOException(C9322n.m27787k("Unexpected protocol: ", protocol));
                                }
                            }
                        }
                    }
                }
            }
            return enumC10551z;
        }
    }

    EnumC10551z(String str) {
        this.protocol = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
