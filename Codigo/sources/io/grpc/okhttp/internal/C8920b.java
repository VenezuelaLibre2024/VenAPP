package io.grpc.okhttp.internal;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: io.grpc.okhttp.internal.b */
/* loaded from: classes3.dex */
public final class C8920b {

    /* renamed from: e */
    private static final EnumC8919a[] f21169e;

    /* renamed from: f */
    public static final C8920b f21170f;

    /* renamed from: g */
    public static final C8920b f21171g;

    /* renamed from: h */
    public static final C8920b f21172h;

    /* renamed from: a */
    final boolean f21173a;

    /* renamed from: b */
    private final String[] f21174b;

    /* renamed from: c */
    private final String[] f21175c;

    /* renamed from: d */
    final boolean f21176d;

    /* renamed from: io.grpc.okhttp.internal.b$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private boolean f21177a;

        /* renamed from: b */
        private String[] f21178b;

        /* renamed from: c */
        private String[] f21179c;

        /* renamed from: d */
        private boolean f21180d;

        public b(C8920b c8920b) {
            this.f21177a = c8920b.f21173a;
            this.f21178b = c8920b.f21174b;
            this.f21179c = c8920b.f21175c;
            this.f21180d = c8920b.f21176d;
        }

        public b(boolean z10) {
            this.f21177a = z10;
        }

        /* renamed from: e */
        public C8920b m26047e() {
            return new C8920b(this);
        }

        /* renamed from: f */
        public b m26048f(EnumC8919a... enumC8919aArr) {
            if (!this.f21177a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[enumC8919aArr.length];
            for (int i10 = 0; i10 < enumC8919aArr.length; i10++) {
                strArr[i10] = enumC8919aArr[i10].javaName;
            }
            this.f21178b = strArr;
            return this;
        }

        /* renamed from: g */
        public b m26049g(String... strArr) {
            if (!this.f21177a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr == null) {
                this.f21178b = null;
            } else {
                this.f21178b = (String[]) strArr.clone();
            }
            return this;
        }

        /* renamed from: h */
        public b m26050h(boolean z10) {
            if (!this.f21177a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.f21180d = z10;
            return this;
        }

        /* renamed from: i */
        public b m26051i(EnumC8929k... enumC8929kArr) {
            if (!this.f21177a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (enumC8929kArr.length == 0) {
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
            String[] strArr = new String[enumC8929kArr.length];
            for (int i10 = 0; i10 < enumC8929kArr.length; i10++) {
                strArr[i10] = enumC8929kArr[i10].javaName;
            }
            this.f21179c = strArr;
            return this;
        }

        /* renamed from: j */
        public b m26052j(String... strArr) {
            if (!this.f21177a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr == null) {
                this.f21179c = null;
            } else {
                this.f21179c = (String[]) strArr.clone();
            }
            return this;
        }
    }

    static {
        EnumC8919a[] enumC8919aArr = {EnumC8919a.TLS_AES_128_GCM_SHA256, EnumC8919a.TLS_AES_256_GCM_SHA384, EnumC8919a.TLS_CHACHA20_POLY1305_SHA256, EnumC8919a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, EnumC8919a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, EnumC8919a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, EnumC8919a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, EnumC8919a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, EnumC8919a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, EnumC8919a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, EnumC8919a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, EnumC8919a.TLS_RSA_WITH_AES_128_GCM_SHA256, EnumC8919a.TLS_RSA_WITH_AES_256_GCM_SHA384, EnumC8919a.TLS_RSA_WITH_AES_128_CBC_SHA, EnumC8919a.TLS_RSA_WITH_AES_256_CBC_SHA, EnumC8919a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f21169e = enumC8919aArr;
        b m26048f = new b(true).m26048f(enumC8919aArr);
        EnumC8929k enumC8929k = EnumC8929k.TLS_1_3;
        EnumC8929k enumC8929k2 = EnumC8929k.TLS_1_2;
        C8920b m26047e = m26048f.m26051i(enumC8929k, enumC8929k2).m26050h(true).m26047e();
        f21170f = m26047e;
        f21171g = new b(m26047e).m26051i(enumC8929k, enumC8929k2, EnumC8929k.TLS_1_1, EnumC8929k.TLS_1_0).m26050h(true).m26047e();
        f21172h = new b(false).m26047e();
    }

    private C8920b(b bVar) {
        this.f21173a = bVar.f21177a;
        this.f21174b = bVar.f21178b;
        this.f21175c = bVar.f21179c;
        this.f21176d = bVar.f21180d;
    }

    /* renamed from: e */
    private C8920b m26038e(SSLSocket sSLSocket, boolean z10) {
        String[] strArr;
        if (this.f21174b != null) {
            strArr = (String[]) C8930l.m26105c(String.class, this.f21174b, sSLSocket.getEnabledCipherSuites());
        } else {
            strArr = null;
        }
        if (z10 && Arrays.asList(sSLSocket.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV")) {
            if (strArr == null) {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            int length = strArr.length + 1;
            String[] strArr2 = new String[length];
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            strArr2[length - 1] = "TLS_FALLBACK_SCSV";
            strArr = strArr2;
        }
        return new b(this).m26049g(strArr).m26052j((String[]) C8930l.m26105c(String.class, this.f21175c, sSLSocket.getEnabledProtocols())).m26047e();
    }

    /* renamed from: c */
    public void m26039c(SSLSocket sSLSocket, boolean z10) {
        C8920b m26038e = m26038e(sSLSocket, z10);
        sSLSocket.setEnabledProtocols(m26038e.f21175c);
        String[] strArr = m26038e.f21174b;
        if (strArr != null) {
            sSLSocket.setEnabledCipherSuites(strArr);
        }
    }

    /* renamed from: d */
    public List<EnumC8919a> m26040d() {
        String[] strArr = this.f21174b;
        if (strArr == null) {
            return null;
        }
        EnumC8919a[] enumC8919aArr = new EnumC8919a[strArr.length];
        int i10 = 0;
        while (true) {
            String[] strArr2 = this.f21174b;
            if (i10 >= strArr2.length) {
                return C8930l.m26103a(enumC8919aArr);
            }
            enumC8919aArr[i10] = EnumC8919a.m26035b(strArr2[i10]);
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8920b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C8920b c8920b = (C8920b) obj;
        boolean z10 = this.f21173a;
        if (z10 != c8920b.f21173a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f21174b, c8920b.f21174b) && Arrays.equals(this.f21175c, c8920b.f21175c) && this.f21176d == c8920b.f21176d);
    }

    /* renamed from: f */
    public boolean m26041f() {
        return this.f21176d;
    }

    /* renamed from: g */
    public List<EnumC8929k> m26042g() {
        EnumC8929k[] enumC8929kArr = new EnumC8929k[this.f21175c.length];
        int i10 = 0;
        while (true) {
            String[] strArr = this.f21175c;
            if (i10 >= strArr.length) {
                return C8930l.m26103a(enumC8929kArr);
            }
            enumC8929kArr[i10] = EnumC8929k.m26102b(strArr[i10]);
            i10++;
        }
    }

    public int hashCode() {
        if (this.f21173a) {
            return ((((527 + Arrays.hashCode(this.f21174b)) * 31) + Arrays.hashCode(this.f21175c)) * 31) + (!this.f21176d ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f21173a) {
            return "ConnectionSpec()";
        }
        List<EnumC8919a> m26040d = m26040d();
        return "ConnectionSpec(cipherSuites=" + (m26040d == null ? "[use default]" : m26040d.toString()) + ", tlsVersions=" + m26042g() + ", supportsTlsExtensions=" + this.f21176d + ")";
    }
}
