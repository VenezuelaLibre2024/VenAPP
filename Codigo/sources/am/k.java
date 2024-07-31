package am;

import am.l;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import ql.z;

/* loaded from: classes3.dex */
public final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final b f516a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final l.a f517b = new a();

    /* loaded from: classes3.dex */
    public static final class a implements l.a {
        a() {
        }

        @Override // am.l.a
        public boolean b(SSLSocket sslSocket) {
            kotlin.jvm.internal.n.e(sslSocket, "sslSocket");
            return zl.d.f32966e.c() && Conscrypt.isConscrypt(sslSocket);
        }

        @Override // am.l.a
        public m c(SSLSocket sslSocket) {
            kotlin.jvm.internal.n.e(sslSocket, "sslSocket");
            return new k();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final l.a a() {
            return k.f517b;
        }
    }

    @Override // am.m
    public boolean a() {
        return zl.d.f32966e.c();
    }

    @Override // am.m
    public boolean b(SSLSocket sslSocket) {
        kotlin.jvm.internal.n.e(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // am.m
    public String c(SSLSocket sslSocket) {
        kotlin.jvm.internal.n.e(sslSocket, "sslSocket");
        if (b(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // am.m
    public void d(SSLSocket sslSocket, String str, List<? extends z> protocols) {
        kotlin.jvm.internal.n.e(sslSocket, "sslSocket");
        kotlin.jvm.internal.n.e(protocols, "protocols");
        if (b(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Object[] array = zl.j.f32984a.b(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
        }
    }
}
