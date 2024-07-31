package ql;

import java.io.IOException;

/* loaded from: classes3.dex */
public enum z {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public static final a Companion = new a(null);
    private final String protocol;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final z a(String protocol) {
            kotlin.jvm.internal.n.e(protocol, "protocol");
            z zVar = z.HTTP_1_0;
            if (!kotlin.jvm.internal.n.a(protocol, zVar.protocol)) {
                zVar = z.HTTP_1_1;
                if (!kotlin.jvm.internal.n.a(protocol, zVar.protocol)) {
                    zVar = z.H2_PRIOR_KNOWLEDGE;
                    if (!kotlin.jvm.internal.n.a(protocol, zVar.protocol)) {
                        zVar = z.HTTP_2;
                        if (!kotlin.jvm.internal.n.a(protocol, zVar.protocol)) {
                            zVar = z.SPDY_3;
                            if (!kotlin.jvm.internal.n.a(protocol, zVar.protocol)) {
                                zVar = z.QUIC;
                                if (!kotlin.jvm.internal.n.a(protocol, zVar.protocol)) {
                                    throw new IOException(kotlin.jvm.internal.n.k("Unexpected protocol: ", protocol));
                                }
                            }
                        }
                    }
                }
            }
            return zVar;
        }
    }

    z(String str) {
        this.protocol = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
