package p319ql;

import dk.C7042z;
import fk.C7368b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p341rl.C10727d;

/* renamed from: ql.l */
/* loaded from: classes3.dex */
public final class C10537l {

    /* renamed from: e */
    public static final b f26400e = new b(null);

    /* renamed from: f */
    private static final C10534i[] f26401f;

    /* renamed from: g */
    private static final C10534i[] f26402g;

    /* renamed from: h */
    public static final C10537l f26403h;

    /* renamed from: i */
    public static final C10537l f26404i;

    /* renamed from: j */
    public static final C10537l f26405j;

    /* renamed from: k */
    public static final C10537l f26406k;

    /* renamed from: a */
    private final boolean f26407a;

    /* renamed from: b */
    private final boolean f26408b;

    /* renamed from: c */
    private final String[] f26409c;

    /* renamed from: d */
    private final String[] f26410d;

    /* renamed from: ql.l$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private boolean f26411a;

        /* renamed from: b */
        private String[] f26412b;

        /* renamed from: c */
        private String[] f26413c;

        /* renamed from: d */
        private boolean f26414d;

        public a(C10537l connectionSpec) {
            C9322n.m27781e(connectionSpec, "connectionSpec");
            this.f26411a = connectionSpec.m31755f();
            this.f26412b = connectionSpec.f26409c;
            this.f26413c = connectionSpec.f26410d;
            this.f26414d = connectionSpec.m31756h();
        }

        public a(boolean z10) {
            this.f26411a = z10;
        }

        /* renamed from: a */
        public final C10537l m31758a() {
            return new C10537l(this.f26411a, this.f26414d, this.f26412b, this.f26413c);
        }

        /* renamed from: b */
        public final a m31759b(String... cipherSuites) {
            C9322n.m27781e(cipherSuites, "cipherSuites");
            if (!m31761d()) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(cipherSuites.length == 0))) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            m31762e((String[]) cipherSuites.clone());
            return this;
        }

        /* renamed from: c */
        public final a m31760c(C10534i... cipherSuites) {
            C9322n.m27781e(cipherSuites, "cipherSuites");
            if (!m31761d()) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (C10534i c10534i : cipherSuites) {
                arrayList.add(c10534i.m31741c());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            return m31759b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        /* renamed from: d */
        public final boolean m31761d() {
            return this.f26411a;
        }

        /* renamed from: e */
        public final void m31762e(String[] strArr) {
            this.f26412b = strArr;
        }

        /* renamed from: f */
        public final void m31763f(boolean z10) {
            this.f26414d = z10;
        }

        /* renamed from: g */
        public final void m31764g(String[] strArr) {
            this.f26413c = strArr;
        }

        /* renamed from: h */
        public final a m31765h(boolean z10) {
            if (!m31761d()) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            m31763f(z10);
            return this;
        }

        /* renamed from: i */
        public final a m31766i(String... tlsVersions) {
            C9322n.m27781e(tlsVersions, "tlsVersions");
            if (!m31761d()) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(tlsVersions.length == 0))) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            m31764g((String[]) tlsVersions.clone());
            return this;
        }

        /* renamed from: j */
        public final a m31767j(EnumC10531f0... tlsVersions) {
            C9322n.m27781e(tlsVersions, "tlsVersions");
            if (!m31761d()) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (EnumC10531f0 enumC10531f0 : tlsVersions) {
                arrayList.add(enumC10531f0.m31721h());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            return m31766i((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    /* renamed from: ql.l$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }
    }

    static {
        C10534i c10534i = C10534i.f26371o1;
        C10534i c10534i2 = C10534i.f26374p1;
        C10534i c10534i3 = C10534i.f26377q1;
        C10534i c10534i4 = C10534i.f26329a1;
        C10534i c10534i5 = C10534i.f26341e1;
        C10534i c10534i6 = C10534i.f26332b1;
        C10534i c10534i7 = C10534i.f26344f1;
        C10534i c10534i8 = C10534i.f26362l1;
        C10534i c10534i9 = C10534i.f26359k1;
        C10534i[] c10534iArr = {c10534i, c10534i2, c10534i3, c10534i4, c10534i5, c10534i6, c10534i7, c10534i8, c10534i9};
        f26401f = c10534iArr;
        C10534i[] c10534iArr2 = {c10534i, c10534i2, c10534i3, c10534i4, c10534i5, c10534i6, c10534i7, c10534i8, c10534i9, C10534i.f26299L0, C10534i.f26301M0, C10534i.f26355j0, C10534i.f26358k0, C10534i.f26290H, C10534i.f26298L, C10534i.f26360l};
        f26402g = c10534iArr2;
        a m31760c = new a(true).m31760c((C10534i[]) Arrays.copyOf(c10534iArr, c10534iArr.length));
        EnumC10531f0 enumC10531f0 = EnumC10531f0.TLS_1_3;
        EnumC10531f0 enumC10531f02 = EnumC10531f0.TLS_1_2;
        f26403h = m31760c.m31767j(enumC10531f0, enumC10531f02).m31765h(true).m31758a();
        f26404i = new a(true).m31760c((C10534i[]) Arrays.copyOf(c10534iArr2, c10534iArr2.length)).m31767j(enumC10531f0, enumC10531f02).m31765h(true).m31758a();
        f26405j = new a(true).m31760c((C10534i[]) Arrays.copyOf(c10534iArr2, c10534iArr2.length)).m31767j(enumC10531f0, enumC10531f02, EnumC10531f0.TLS_1_1, EnumC10531f0.TLS_1_0).m31765h(true).m31758a();
        f26406k = new a(false).m31758a();
    }

    public C10537l(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f26407a = z10;
        this.f26408b = z11;
        this.f26409c = strArr;
        this.f26410d = strArr2;
    }

    /* renamed from: g */
    private final C10537l m31751g(SSLSocket sSLSocket, boolean z10) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        Comparator m22237b;
        if (this.f26409c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            C9322n.m27780d(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = C10727d.m32619E(enabledCipherSuites, this.f26409c, C10534i.f26330b.m31747c());
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f26410d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            C9322n.m27780d(enabledProtocols, "sslSocket.enabledProtocols");
            String[] strArr = this.f26410d;
            m22237b = C7368b.m22237b();
            tlsVersionsIntersection = C10727d.m32619E(enabledProtocols, strArr, m22237b);
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        C9322n.m27780d(supportedCipherSuites, "supportedCipherSuites");
        int m32664x = C10727d.m32664x(supportedCipherSuites, "TLS_FALLBACK_SCSV", C10534i.f26330b.m31747c());
        if (z10 && m32664x != -1) {
            C9322n.m27780d(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[m32664x];
            C9322n.m27780d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = C10727d.m32655o(cipherSuitesIntersection, str);
        }
        a aVar = new a(this);
        C9322n.m27780d(cipherSuitesIntersection, "cipherSuitesIntersection");
        a m31759b = aVar.m31759b((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        C9322n.m27780d(tlsVersionsIntersection, "tlsVersionsIntersection");
        return m31759b.m31766i((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).m31758a();
    }

    /* renamed from: c */
    public final void m31752c(SSLSocket sslSocket, boolean z10) {
        C9322n.m27781e(sslSocket, "sslSocket");
        C10537l m31751g = m31751g(sslSocket, z10);
        if (m31751g.m31757i() != null) {
            sslSocket.setEnabledProtocols(m31751g.f26410d);
        }
        if (m31751g.m31753d() != null) {
            sslSocket.setEnabledCipherSuites(m31751g.f26409c);
        }
    }

    /* renamed from: d */
    public final List<C10534i> m31753d() {
        List<C10534i> m20630f0;
        String[] strArr = this.f26409c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C10534i.f26330b.m31746b(str));
        }
        m20630f0 = C7042z.m20630f0(arrayList);
        return m20630f0;
    }

    /* renamed from: e */
    public final boolean m31754e(SSLSocket socket) {
        Comparator m22237b;
        C9322n.m27781e(socket, "socket");
        if (!this.f26407a) {
            return false;
        }
        String[] strArr = this.f26410d;
        if (strArr != null) {
            String[] enabledProtocols = socket.getEnabledProtocols();
            m22237b = C7368b.m22237b();
            if (!C10727d.m32661u(strArr, enabledProtocols, m22237b)) {
                return false;
            }
        }
        String[] strArr2 = this.f26409c;
        return strArr2 == null || C10727d.m32661u(strArr2, socket.getEnabledCipherSuites(), C10534i.f26330b.m31747c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10537l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z10 = this.f26407a;
        C10537l c10537l = (C10537l) obj;
        if (z10 != c10537l.f26407a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f26409c, c10537l.f26409c) && Arrays.equals(this.f26410d, c10537l.f26410d) && this.f26408b == c10537l.f26408b);
    }

    /* renamed from: f */
    public final boolean m31755f() {
        return this.f26407a;
    }

    /* renamed from: h */
    public final boolean m31756h() {
        return this.f26408b;
    }

    public int hashCode() {
        if (!this.f26407a) {
            return 17;
        }
        String[] strArr = this.f26409c;
        int hashCode = (527 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String[] strArr2 = this.f26410d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f26408b ? 1 : 0);
    }

    /* renamed from: i */
    public final List<EnumC10531f0> m31757i() {
        List<EnumC10531f0> m20630f0;
        String[] strArr = this.f26410d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(EnumC10531f0.Companion.m31722a(str));
        }
        m20630f0 = C7042z.m20630f0(arrayList);
        return m20630f0;
    }

    public String toString() {
        if (!this.f26407a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + ((Object) Objects.toString(m31753d(), "[all enabled]")) + ", tlsVersions=" + ((Object) Objects.toString(m31757i(), "[all enabled]")) + ", supportsTlsExtensions=" + this.f26408b + ')';
    }
}
