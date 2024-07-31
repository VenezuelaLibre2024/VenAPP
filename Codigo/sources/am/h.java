package am;

import am.l;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import ql.z;
import xk.p;

/* loaded from: classes3.dex */
public class h implements m {

    /* renamed from: f, reason: collision with root package name */
    public static final a f502f;

    /* renamed from: g, reason: collision with root package name */
    private static final l.a f503g;

    /* renamed from: a, reason: collision with root package name */
    private final Class<? super SSLSocket> f504a;

    /* renamed from: b, reason: collision with root package name */
    private final Method f505b;

    /* renamed from: c, reason: collision with root package name */
    private final Method f506c;

    /* renamed from: d, reason: collision with root package name */
    private final Method f507d;

    /* renamed from: e, reason: collision with root package name */
    private final Method f508e;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: am.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0012a implements l.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f509a;

            C0012a(String str) {
                this.f509a = str;
            }

            @Override // am.l.a
            public boolean b(SSLSocket sslSocket) {
                boolean E;
                kotlin.jvm.internal.n.e(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                kotlin.jvm.internal.n.d(name, "sslSocket.javaClass.name");
                E = p.E(name, kotlin.jvm.internal.n.k(this.f509a, "."), false, 2, null);
                return E;
            }

            @Override // am.l.a
            public m c(SSLSocket sslSocket) {
                kotlin.jvm.internal.n.e(sslSocket, "sslSocket");
                return h.f502f.b(sslSocket.getClass());
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final h b(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> cls2 = cls;
            while (cls2 != null && !kotlin.jvm.internal.n.a(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError(kotlin.jvm.internal.n.k("No OpenSSLSocketImpl superclass of socket of type ", cls));
                }
            }
            kotlin.jvm.internal.n.b(cls2);
            return new h(cls2);
        }

        public final l.a c(String packageName) {
            kotlin.jvm.internal.n.e(packageName, "packageName");
            return new C0012a(packageName);
        }

        public final l.a d() {
            return h.f503g;
        }
    }

    static {
        a aVar = new a(null);
        f502f = aVar;
        f503g = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public h(Class<? super SSLSocket> sslSocketClass) {
        kotlin.jvm.internal.n.e(sslSocketClass, "sslSocketClass");
        this.f504a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        kotlin.jvm.internal.n.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f505b = declaredMethod;
        this.f506c = sslSocketClass.getMethod("setHostname", String.class);
        this.f507d = sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f508e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // am.m
    public boolean a() {
        return zl.b.f32957f.b();
    }

    @Override // am.m
    public boolean b(SSLSocket sslSocket) {
        kotlin.jvm.internal.n.e(sslSocket, "sslSocket");
        return this.f504a.isInstance(sslSocket);
    }

    @Override // am.m
    public String c(SSLSocket sslSocket) {
        kotlin.jvm.internal.n.e(sslSocket, "sslSocket");
        if (!b(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f507d.invoke(sslSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, xk.d.f31393b);
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && kotlin.jvm.internal.n.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // am.m
    public void d(SSLSocket sslSocket, String str, List<? extends z> protocols) {
        kotlin.jvm.internal.n.e(sslSocket, "sslSocket");
        kotlin.jvm.internal.n.e(protocols, "protocols");
        if (b(sslSocket)) {
            try {
                this.f505b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f506c.invoke(sslSocket, str);
                }
                this.f508e.invoke(sslSocket, zl.j.f32984a.c(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
