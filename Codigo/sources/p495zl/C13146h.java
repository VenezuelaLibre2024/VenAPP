package p495zl;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p319ql.EnumC10551z;

/* renamed from: zl.h */
/* loaded from: classes3.dex */
public class C13146h extends C13148j {

    /* renamed from: d */
    public static final a f35530d = new a(0 == true ? 1 : 0);

    /* renamed from: e */
    private static final boolean f35531e;

    /* renamed from: zl.h$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C13146h m43368a() {
            if (m43369b()) {
                return new C13146h();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m43369b() {
            return C13146h.f35531e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r1.intValue() >= 9) goto L13;
     */
    static {
        /*
            zl.h$a r0 = new zl.h$a
            r1 = 0
            r0.<init>(r1)
            p495zl.C13146h.f35530d = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 != 0) goto L11
            goto L15
        L11:
            java.lang.Integer r1 = p450xk.C12515g.m40997i(r0)
        L15:
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L24
            int r1 = r1.intValue()
            r3 = 9
            if (r1 < r3) goto L22
            goto L2d
        L22:
            r0 = r2
            goto L2d
        L24:
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L22
            r1.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L22
        L2d:
            p495zl.C13146h.f35531e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p495zl.C13146h.<clinit>():void");
    }

    @Override // p495zl.C13148j
    /* renamed from: e */
    public void mo43339e(SSLSocket sslSocket, String str, List<EnumC10551z> protocols) {
        C9322n.m27781e(sslSocket, "sslSocket");
        C9322n.m27781e(protocols, "protocols");
        SSLParameters sSLParameters = sslSocket.getSSLParameters();
        Object[] array = C13148j.f35535a.m43383b(protocols).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        sSLParameters.setApplicationProtocols((String[]) array);
        sslSocket.setSSLParameters(sSLParameters);
    }

    @Override // p495zl.C13148j
    /* renamed from: g */
    public String mo43340g(SSLSocket sslSocket) {
        String applicationProtocol;
        C9322n.m27781e(sslSocket, "sslSocket");
        try {
            applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : C9322n.m27777a(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
