package am;

import am.C0148l;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.conscrypt.Conscrypt;
import p319ql.EnumC10551z;
import p495zl.C13142d;
import p495zl.C13148j;

/* renamed from: am.k */
/* loaded from: classes3.dex */
public final class C0147k implements InterfaceC0149m {

    /* renamed from: a */
    public static final b f581a = new b(null);

    /* renamed from: b */
    private static final C0148l.a f582b = new a();

    /* renamed from: am.k$a */
    /* loaded from: classes3.dex */
    public static final class a implements C0148l.a {
        a() {
        }

        @Override // am.C0148l.a
        /* renamed from: b */
        public boolean mo652b(SSLSocket sslSocket) {
            C9322n.m27781e(sslSocket, "sslSocket");
            return C13142d.f35517e.m43360c() && Conscrypt.isConscrypt(sslSocket);
        }

        @Override // am.C0148l.a
        /* renamed from: c */
        public InterfaceC0149m mo653c(SSLSocket sslSocket) {
            C9322n.m27781e(sslSocket, "sslSocket");
            return new C0147k();
        }
    }

    /* renamed from: am.k$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C0148l.a m660a() {
            return C0147k.f582b;
        }
    }

    @Override // am.InterfaceC0149m
    /* renamed from: a */
    public boolean mo633a() {
        return C13142d.f35517e.m43360c();
    }

    @Override // am.InterfaceC0149m
    /* renamed from: b */
    public boolean mo634b(SSLSocket sslSocket) {
        C9322n.m27781e(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // am.InterfaceC0149m
    /* renamed from: c */
    public String mo635c(SSLSocket sslSocket) {
        C9322n.m27781e(sslSocket, "sslSocket");
        if (mo634b(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // am.InterfaceC0149m
    /* renamed from: d */
    public void mo636d(SSLSocket sslSocket, String str, List<? extends EnumC10551z> protocols) {
        C9322n.m27781e(sslSocket, "sslSocket");
        C9322n.m27781e(protocols, "protocols");
        if (mo634b(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Object[] array = C13148j.f35535a.m43383b(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
        }
    }
}
