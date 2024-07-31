package ql;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final b f24306e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    private static final i[] f24307f;

    /* renamed from: g, reason: collision with root package name */
    private static final i[] f24308g;

    /* renamed from: h, reason: collision with root package name */
    public static final l f24309h;

    /* renamed from: i, reason: collision with root package name */
    public static final l f24310i;

    /* renamed from: j, reason: collision with root package name */
    public static final l f24311j;

    /* renamed from: k, reason: collision with root package name */
    public static final l f24312k;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f24313a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f24314b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f24315c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f24316d;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f24317a;

        /* renamed from: b, reason: collision with root package name */
        private String[] f24318b;

        /* renamed from: c, reason: collision with root package name */
        private String[] f24319c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f24320d;

        public a(l connectionSpec) {
            kotlin.jvm.internal.n.e(connectionSpec, "connectionSpec");
            this.f24317a = connectionSpec.f();
            this.f24318b = connectionSpec.f24315c;
            this.f24319c = connectionSpec.f24316d;
            this.f24320d = connectionSpec.h();
        }

        public a(boolean z10) {
            this.f24317a = z10;
        }

        public final l a() {
            return new l(this.f24317a, this.f24320d, this.f24318b, this.f24319c);
        }

        public final a b(String... cipherSuites) {
            kotlin.jvm.internal.n.e(cipherSuites, "cipherSuites");
            if (!d()) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(cipherSuites.length == 0))) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            e((String[]) cipherSuites.clone());
            return this;
        }

        public final a c(i... cipherSuites) {
            kotlin.jvm.internal.n.e(cipherSuites, "cipherSuites");
            if (!d()) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (i iVar : cipherSuites) {
                arrayList.add(iVar.c());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            return b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final boolean d() {
            return this.f24317a;
        }

        public final void e(String[] strArr) {
            this.f24318b = strArr;
        }

        public final void f(boolean z10) {
            this.f24320d = z10;
        }

        public final void g(String[] strArr) {
            this.f24319c = strArr;
        }

        public final a h(boolean z10) {
            if (!d()) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            f(z10);
            return this;
        }

        public final a i(String... tlsVersions) {
            kotlin.jvm.internal.n.e(tlsVersions, "tlsVersions");
            if (!d()) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(tlsVersions.length == 0))) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            g((String[]) tlsVersions.clone());
            return this;
        }

        public final a j(f0... tlsVersions) {
            kotlin.jvm.internal.n.e(tlsVersions, "tlsVersions");
            if (!d()) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (f0 f0Var : tlsVersions) {
                arrayList.add(f0Var.h());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            return i((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    static {
        i iVar = i.f24277o1;
        i iVar2 = i.f24280p1;
        i iVar3 = i.f24283q1;
        i iVar4 = i.f24235a1;
        i iVar5 = i.f24247e1;
        i iVar6 = i.f24238b1;
        i iVar7 = i.f24250f1;
        i iVar8 = i.f24268l1;
        i iVar9 = i.f24265k1;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9};
        f24307f = iVarArr;
        i[] iVarArr2 = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, i.L0, i.M0, i.f24261j0, i.f24264k0, i.H, i.L, i.f24266l};
        f24308g = iVarArr2;
        a c10 = new a(true).c((i[]) Arrays.copyOf(iVarArr, iVarArr.length));
        f0 f0Var = f0.TLS_1_3;
        f0 f0Var2 = f0.TLS_1_2;
        f24309h = c10.j(f0Var, f0Var2).h(true).a();
        f24310i = new a(true).c((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).j(f0Var, f0Var2).h(true).a();
        f24311j = new a(true).c((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).j(f0Var, f0Var2, f0.TLS_1_1, f0.TLS_1_0).h(true).a();
        f24312k = new a(false).a();
    }

    public l(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f24313a = z10;
        this.f24314b = z11;
        this.f24315c = strArr;
        this.f24316d = strArr2;
    }

    private final l g(SSLSocket sSLSocket, boolean z10) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        Comparator b10;
        if (this.f24315c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            kotlin.jvm.internal.n.d(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = rl.d.E(enabledCipherSuites, this.f24315c, i.f24236b.c());
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f24316d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.n.d(enabledProtocols, "sslSocket.enabledProtocols");
            String[] strArr = this.f24316d;
            b10 = fk.b.b();
            tlsVersionsIntersection = rl.d.E(enabledProtocols, strArr, b10);
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        kotlin.jvm.internal.n.d(supportedCipherSuites, "supportedCipherSuites");
        int x10 = rl.d.x(supportedCipherSuites, "TLS_FALLBACK_SCSV", i.f24236b.c());
        if (z10 && x10 != -1) {
            kotlin.jvm.internal.n.d(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[x10];
            kotlin.jvm.internal.n.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = rl.d.o(cipherSuitesIntersection, str);
        }
        a aVar = new a(this);
        kotlin.jvm.internal.n.d(cipherSuitesIntersection, "cipherSuitesIntersection");
        a b11 = aVar.b((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        kotlin.jvm.internal.n.d(tlsVersionsIntersection, "tlsVersionsIntersection");
        return b11.i((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).a();
    }

    public final void c(SSLSocket sslSocket, boolean z10) {
        kotlin.jvm.internal.n.e(sslSocket, "sslSocket");
        l g10 = g(sslSocket, z10);
        if (g10.i() != null) {
            sslSocket.setEnabledProtocols(g10.f24316d);
        }
        if (g10.d() != null) {
            sslSocket.setEnabledCipherSuites(g10.f24315c);
        }
    }

    public final List<i> d() {
        List<i> f02;
        String[] strArr = this.f24315c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(i.f24236b.b(str));
        }
        f02 = dk.z.f0(arrayList);
        return f02;
    }

    public final boolean e(SSLSocket socket) {
        Comparator b10;
        kotlin.jvm.internal.n.e(socket, "socket");
        if (!this.f24313a) {
            return false;
        }
        String[] strArr = this.f24316d;
        if (strArr != null) {
            String[] enabledProtocols = socket.getEnabledProtocols();
            b10 = fk.b.b();
            if (!rl.d.u(strArr, enabledProtocols, b10)) {
                return false;
            }
        }
        String[] strArr2 = this.f24315c;
        return strArr2 == null || rl.d.u(strArr2, socket.getEnabledCipherSuites(), i.f24236b.c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z10 = this.f24313a;
        l lVar = (l) obj;
        if (z10 != lVar.f24313a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f24315c, lVar.f24315c) && Arrays.equals(this.f24316d, lVar.f24316d) && this.f24314b == lVar.f24314b);
    }

    public final boolean f() {
        return this.f24313a;
    }

    public final boolean h() {
        return this.f24314b;
    }

    public int hashCode() {
        if (!this.f24313a) {
            return 17;
        }
        String[] strArr = this.f24315c;
        int hashCode = (527 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String[] strArr2 = this.f24316d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f24314b ? 1 : 0);
    }

    public final List<f0> i() {
        List<f0> f02;
        String[] strArr = this.f24316d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(f0.Companion.a(str));
        }
        f02 = dk.z.f0(arrayList);
        return f02;
    }

    public String toString() {
        if (!this.f24313a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + ((Object) Objects.toString(d(), "[all enabled]")) + ", tlsVersions=" + ((Object) Objects.toString(i(), "[all enabled]")) + ", supportsTlsExtensions=" + this.f24314b + ')';
    }
}
