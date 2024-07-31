package io.grpc.okhttp.internal;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    private static final io.grpc.okhttp.internal.a[] f19418e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f19419f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f19420g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f19421h;

    /* renamed from: a, reason: collision with root package name */
    final boolean f19422a;

    /* renamed from: b, reason: collision with root package name */
    private final String[] f19423b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f19424c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f19425d;

    /* renamed from: io.grpc.okhttp.internal.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0302b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f19426a;

        /* renamed from: b, reason: collision with root package name */
        private String[] f19427b;

        /* renamed from: c, reason: collision with root package name */
        private String[] f19428c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f19429d;

        public C0302b(b bVar) {
            this.f19426a = bVar.f19422a;
            this.f19427b = bVar.f19423b;
            this.f19428c = bVar.f19424c;
            this.f19429d = bVar.f19425d;
        }

        public C0302b(boolean z10) {
            this.f19426a = z10;
        }

        public b e() {
            return new b(this);
        }

        public C0302b f(io.grpc.okhttp.internal.a... aVarArr) {
            if (!this.f19426a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[aVarArr.length];
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                strArr[i10] = aVarArr[i10].javaName;
            }
            this.f19427b = strArr;
            return this;
        }

        public C0302b g(String... strArr) {
            if (!this.f19426a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr == null) {
                this.f19427b = null;
            } else {
                this.f19427b = (String[]) strArr.clone();
            }
            return this;
        }

        public C0302b h(boolean z10) {
            if (!this.f19426a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.f19429d = z10;
            return this;
        }

        public C0302b i(k... kVarArr) {
            if (!this.f19426a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (kVarArr.length == 0) {
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
            String[] strArr = new String[kVarArr.length];
            for (int i10 = 0; i10 < kVarArr.length; i10++) {
                strArr[i10] = kVarArr[i10].javaName;
            }
            this.f19428c = strArr;
            return this;
        }

        public C0302b j(String... strArr) {
            if (!this.f19426a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr == null) {
                this.f19428c = null;
            } else {
                this.f19428c = (String[]) strArr.clone();
            }
            return this;
        }
    }

    static {
        io.grpc.okhttp.internal.a[] aVarArr = {io.grpc.okhttp.internal.a.TLS_AES_128_GCM_SHA256, io.grpc.okhttp.internal.a.TLS_AES_256_GCM_SHA384, io.grpc.okhttp.internal.a.TLS_CHACHA20_POLY1305_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, io.grpc.okhttp.internal.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, io.grpc.okhttp.internal.a.TLS_RSA_WITH_AES_128_GCM_SHA256, io.grpc.okhttp.internal.a.TLS_RSA_WITH_AES_256_GCM_SHA384, io.grpc.okhttp.internal.a.TLS_RSA_WITH_AES_128_CBC_SHA, io.grpc.okhttp.internal.a.TLS_RSA_WITH_AES_256_CBC_SHA, io.grpc.okhttp.internal.a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f19418e = aVarArr;
        C0302b f10 = new C0302b(true).f(aVarArr);
        k kVar = k.TLS_1_3;
        k kVar2 = k.TLS_1_2;
        b e10 = f10.i(kVar, kVar2).h(true).e();
        f19419f = e10;
        f19420g = new C0302b(e10).i(kVar, kVar2, k.TLS_1_1, k.TLS_1_0).h(true).e();
        f19421h = new C0302b(false).e();
    }

    private b(C0302b c0302b) {
        this.f19422a = c0302b.f19426a;
        this.f19423b = c0302b.f19427b;
        this.f19424c = c0302b.f19428c;
        this.f19425d = c0302b.f19429d;
    }

    private b e(SSLSocket sSLSocket, boolean z10) {
        String[] strArr;
        if (this.f19423b != null) {
            strArr = (String[]) l.c(String.class, this.f19423b, sSLSocket.getEnabledCipherSuites());
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
        return new C0302b(this).g(strArr).j((String[]) l.c(String.class, this.f19424c, sSLSocket.getEnabledProtocols())).e();
    }

    public void c(SSLSocket sSLSocket, boolean z10) {
        b e10 = e(sSLSocket, z10);
        sSLSocket.setEnabledProtocols(e10.f19424c);
        String[] strArr = e10.f19423b;
        if (strArr != null) {
            sSLSocket.setEnabledCipherSuites(strArr);
        }
    }

    public List<io.grpc.okhttp.internal.a> d() {
        String[] strArr = this.f19423b;
        if (strArr == null) {
            return null;
        }
        io.grpc.okhttp.internal.a[] aVarArr = new io.grpc.okhttp.internal.a[strArr.length];
        int i10 = 0;
        while (true) {
            String[] strArr2 = this.f19423b;
            if (i10 >= strArr2.length) {
                return l.a(aVarArr);
            }
            aVarArr[i10] = io.grpc.okhttp.internal.a.b(strArr2[i10]);
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        b bVar = (b) obj;
        boolean z10 = this.f19422a;
        if (z10 != bVar.f19422a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f19423b, bVar.f19423b) && Arrays.equals(this.f19424c, bVar.f19424c) && this.f19425d == bVar.f19425d);
    }

    public boolean f() {
        return this.f19425d;
    }

    public List<k> g() {
        k[] kVarArr = new k[this.f19424c.length];
        int i10 = 0;
        while (true) {
            String[] strArr = this.f19424c;
            if (i10 >= strArr.length) {
                return l.a(kVarArr);
            }
            kVarArr[i10] = k.b(strArr[i10]);
            i10++;
        }
    }

    public int hashCode() {
        if (this.f19422a) {
            return ((((527 + Arrays.hashCode(this.f19423b)) * 31) + Arrays.hashCode(this.f19424c)) * 31) + (!this.f19425d ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f19422a) {
            return "ConnectionSpec()";
        }
        List<io.grpc.okhttp.internal.a> d10 = d();
        return "ConnectionSpec(cipherSuites=" + (d10 == null ? "[use default]" : d10.toString()) + ", tlsVersions=" + g() + ", supportsTlsExtensions=" + this.f19425d + ")";
    }
}
