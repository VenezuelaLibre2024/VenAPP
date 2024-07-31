package io.grpc.okhttp.internal;

import dm.C7056b;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* renamed from: io.grpc.okhttp.internal.h */
/* loaded from: classes3.dex */
public class C8926h {

    /* renamed from: b */
    public static final Logger f21195b = Logger.getLogger(C8926h.class.getName());

    /* renamed from: c */
    private static final String[] f21196c = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* renamed from: d */
    private static final C8926h f21197d = m26085d();

    /* renamed from: a */
    private final Provider f21198a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.okhttp.internal.h$a */
    /* loaded from: classes3.dex */
    public class a implements PrivilegedExceptionAction<Method> {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Method run() {
            return SSLEngine.class.getMethod("getApplicationProtocol", new Class[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.okhttp.internal.h$b */
    /* loaded from: classes3.dex */
    public class b implements PrivilegedExceptionAction<Method> {
        b() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Method run() {
            return SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.okhttp.internal.h$c */
    /* loaded from: classes3.dex */
    public class c implements PrivilegedExceptionAction<Method> {
        c() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Method run() {
            return SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.okhttp.internal.h$d */
    /* loaded from: classes3.dex */
    public static class d extends C8926h {

        /* renamed from: e */
        private final C8925g<Socket> f21199e;

        /* renamed from: f */
        private final C8925g<Socket> f21200f;

        /* renamed from: g */
        private final Method f21201g;

        /* renamed from: h */
        private final Method f21202h;

        /* renamed from: i */
        private final C8925g<Socket> f21203i;

        /* renamed from: j */
        private final C8925g<Socket> f21204j;

        /* renamed from: k */
        private final h f21205k;

        public d(C8925g<Socket> c8925g, C8925g<Socket> c8925g2, Method method, Method method2, C8925g<Socket> c8925g3, C8925g<Socket> c8925g4, Provider provider, h hVar) {
            super(provider);
            this.f21199e = c8925g;
            this.f21200f = c8925g2;
            this.f21201g = method;
            this.f21202h = method2;
            this.f21203i = c8925g3;
            this.f21204j = c8925g4;
            this.f21205k = hVar;
        }

        @Override // io.grpc.okhttp.internal.C8926h
        /* renamed from: c */
        public void mo26091c(SSLSocket sSLSocket, String str, List<EnumC8927i> list) {
            if (str != null) {
                this.f21199e.m26081e(sSLSocket, Boolean.TRUE);
                this.f21200f.m26081e(sSLSocket, str);
            }
            if (this.f21204j.m26083g(sSLSocket)) {
                this.f21204j.m26082f(sSLSocket, C8926h.m26084b(list));
            }
        }

        @Override // io.grpc.okhttp.internal.C8926h
        /* renamed from: h */
        public String mo26093h(SSLSocket sSLSocket) {
            byte[] bArr;
            if (this.f21203i.m26083g(sSLSocket) && (bArr = (byte[]) this.f21203i.m26082f(sSLSocket, new Object[0])) != null) {
                return new String(bArr, C8930l.f21220b);
            }
            return null;
        }

        @Override // io.grpc.okhttp.internal.C8926h
        /* renamed from: i */
        public h mo26094i() {
            return this.f21205k;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.okhttp.internal.h$e */
    /* loaded from: classes3.dex */
    public static class e extends C8926h {

        /* renamed from: e */
        private final Method f21206e;

        /* renamed from: f */
        private final Method f21207f;

        private e(Provider provider, Method method, Method method2) {
            super(provider);
            this.f21206e = method;
            this.f21207f = method2;
        }

        /* synthetic */ e(Provider provider, Method method, Method method2, a aVar) {
            this(provider, method, method2);
        }

        @Override // io.grpc.okhttp.internal.C8926h
        /* renamed from: c */
        public void mo26091c(SSLSocket sSLSocket, String str, List<EnumC8927i> list) {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            for (EnumC8927i enumC8927i : list) {
                if (enumC8927i != EnumC8927i.HTTP_1_0) {
                    arrayList.add(enumC8927i.toString());
                }
            }
            try {
                this.f21206e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
                sSLSocket.setSSLParameters(sSLParameters);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // io.grpc.okhttp.internal.C8926h
        /* renamed from: h */
        public String mo26093h(SSLSocket sSLSocket) {
            try {
                return (String) this.f21207f.invoke(sSLSocket, new Object[0]);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // io.grpc.okhttp.internal.C8926h
        /* renamed from: i */
        public h mo26094i() {
            return h.ALPN_AND_NPN;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.okhttp.internal.h$f */
    /* loaded from: classes3.dex */
    public static class f extends C8926h {

        /* renamed from: e */
        private final Method f21208e;

        /* renamed from: f */
        private final Method f21209f;

        /* renamed from: g */
        private final Method f21210g;

        /* renamed from: h */
        private final Class<?> f21211h;

        /* renamed from: i */
        private final Class<?> f21212i;

        public f(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2, Provider provider) {
            super(provider);
            this.f21208e = method;
            this.f21209f = method2;
            this.f21210g = method3;
            this.f21211h = cls;
            this.f21212i = cls2;
        }

        @Override // io.grpc.okhttp.internal.C8926h
        /* renamed from: a */
        public void mo26090a(SSLSocket sSLSocket) {
            try {
                this.f21210g.invoke(null, sSLSocket);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e10) {
                C8926h.f21195b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e10);
            }
        }

        @Override // io.grpc.okhttp.internal.C8926h
        /* renamed from: c */
        public void mo26091c(SSLSocket sSLSocket, String str, List<EnumC8927i> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                EnumC8927i enumC8927i = list.get(i10);
                if (enumC8927i != EnumC8927i.HTTP_1_0) {
                    arrayList.add(enumC8927i.toString());
                }
            }
            try {
                this.f21208e.invoke(null, sSLSocket, Proxy.newProxyInstance(C8926h.class.getClassLoader(), new Class[]{this.f21211h, this.f21212i}, new g(arrayList)));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // io.grpc.okhttp.internal.C8926h
        /* renamed from: h */
        public String mo26093h(SSLSocket sSLSocket) {
            try {
                g gVar = (g) Proxy.getInvocationHandler(this.f21209f.invoke(null, sSLSocket));
                if (!gVar.f21214b && gVar.f21215c == null) {
                    C8926h.f21195b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                }
                if (gVar.f21214b) {
                    return null;
                }
                return gVar.f21215c;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
                throw new AssertionError();
            }
        }

        @Override // io.grpc.okhttp.internal.C8926h
        /* renamed from: i */
        public h mo26094i() {
            return h.ALPN_AND_NPN;
        }
    }

    /* renamed from: io.grpc.okhttp.internal.h$g */
    /* loaded from: classes3.dex */
    private static class g implements InvocationHandler {

        /* renamed from: a */
        private final List<String> f21213a;

        /* renamed from: b */
        private boolean f21214b;

        /* renamed from: c */
        private String f21215c;

        public g(List<String> list) {
            this.f21213a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C8930l.f21219a;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f21214b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f21213a;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj3 = objArr[0];
                if (obj3 instanceof List) {
                    List list = (List) obj3;
                    int size = list.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            obj2 = this.f21213a.get(0);
                            break;
                        }
                        if (this.f21213a.contains(list.get(i10))) {
                            obj2 = list.get(i10);
                            break;
                        }
                        i10++;
                    }
                    String str = (String) obj2;
                    this.f21215c = str;
                    return str;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f21215c = (String) objArr[0];
            return null;
        }
    }

    /* renamed from: io.grpc.okhttp.internal.h$h */
    /* loaded from: classes3.dex */
    public enum h {
        ALPN_AND_NPN,
        NPN,
        NONE
    }

    public C8926h(Provider provider) {
        this.f21198a = provider;
    }

    /* renamed from: b */
    public static byte[] m26084b(List<EnumC8927i> list) {
        C7056b c7056b = new C7056b();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            EnumC8927i enumC8927i = list.get(i10);
            if (enumC8927i != EnumC8927i.HTTP_1_0) {
                c7056b.writeByte(enumC8927i.toString().length());
                c7056b.mo20705T(enumC8927i.toString());
            }
        }
        return c7056b.m20696H();
    }

    /* renamed from: d */
    private static C8926h m26085d() {
        Method method;
        Method method2;
        Provider m26087f = m26087f();
        a aVar = null;
        if (m26087f != null) {
            C8925g c8925g = new C8925g(null, "setUseSessionTickets", Boolean.TYPE);
            C8925g c8925g2 = new C8925g(null, "setHostname", String.class);
            C8925g c8925g3 = new C8925g(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            C8925g c8925g4 = new C8925g(null, "setAlpnProtocols", byte[].class);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                method = cls.getMethod("tagSocket", Socket.class);
                try {
                    method2 = cls.getMethod("untagSocket", Socket.class);
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    method2 = null;
                    return new d(c8925g, c8925g2, method, method2, c8925g3, c8925g4, m26087f, (!m26087f.getName().equals("GmsCore_OpenSSL") || m26087f.getName().equals("Conscrypt") || m26087f.getName().equals("Ssl_Guard") || m26089k()) ? h.ALPN_AND_NPN : m26088j() ? h.NPN : h.NONE);
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                method = null;
            }
            return new d(c8925g, c8925g2, method, method2, c8925g3, c8925g4, m26087f, (!m26087f.getName().equals("GmsCore_OpenSSL") || m26087f.getName().equals("Conscrypt") || m26087f.getName().equals("Ssl_Guard") || m26089k()) ? h.ALPN_AND_NPN : m26088j() ? h.NPN : h.NONE);
        }
        try {
            Provider provider = SSLContext.getDefault().getProvider();
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS", provider);
                sSLContext.init(null, null, null);
                ((Method) AccessController.doPrivileged(new a())).invoke(sSLContext.createSSLEngine(), new Object[0]);
                return new e(provider, (Method) AccessController.doPrivileged(new b()), (Method) AccessController.doPrivileged(new c()), aVar);
            } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused3) {
                try {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
                    return new f(cls2.getMethod("put", SSLSocket.class, cls3), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider);
                } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                    return new C8926h(provider);
                }
            }
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: e */
    public static C8926h m26086e() {
        return f21197d;
    }

    /* renamed from: f */
    private static Provider m26087f() {
        for (Provider provider : Security.getProviders()) {
            for (String str : f21196c) {
                if (str.equals(provider.getClass().getName())) {
                    f21195b.log(Level.FINE, "Found registered provider {0}", str);
                    return provider;
                }
            }
        }
        f21195b.log(Level.WARNING, "Unable to find Conscrypt");
        return null;
    }

    /* renamed from: j */
    private static boolean m26088j() {
        try {
            C8926h.class.getClassLoader().loadClass("android.app.ActivityOptions");
            return true;
        } catch (ClassNotFoundException e10) {
            f21195b.log(Level.FINE, "Can't find class", (Throwable) e10);
            return false;
        }
    }

    /* renamed from: k */
    private static boolean m26089k() {
        try {
            C8926h.class.getClassLoader().loadClass("android.net.Network");
            return true;
        } catch (ClassNotFoundException e10) {
            f21195b.log(Level.FINE, "Can't find class", (Throwable) e10);
            return false;
        }
    }

    /* renamed from: a */
    public void mo26090a(SSLSocket sSLSocket) {
    }

    /* renamed from: c */
    public void mo26091c(SSLSocket sSLSocket, String str, List<EnumC8927i> list) {
    }

    /* renamed from: g */
    public Provider m26092g() {
        return this.f21198a;
    }

    /* renamed from: h */
    public String mo26093h(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: i */
    public h mo26094i() {
        return h.NONE;
    }
}
