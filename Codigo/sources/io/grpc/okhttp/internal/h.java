package io.grpc.okhttp.internal;

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

/* loaded from: classes3.dex */
public class h {

    /* renamed from: b */
    public static final Logger f19444b = Logger.getLogger(h.class.getName());

    /* renamed from: c */
    private static final String[] f19445c = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* renamed from: d */
    private static final h f19446d = d();

    /* renamed from: a */
    private final Provider f19447a;

    /* loaded from: classes3.dex */
    public class a implements PrivilegedExceptionAction<Method> {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a */
        public Method run() {
            return SSLEngine.class.getMethod("getApplicationProtocol", new Class[0]);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements PrivilegedExceptionAction<Method> {
        b() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a */
        public Method run() {
            return SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements PrivilegedExceptionAction<Method> {
        c() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a */
        public Method run() {
            return SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
        }
    }

    /* loaded from: classes3.dex */
    public static class d extends h {

        /* renamed from: e */
        private final io.grpc.okhttp.internal.g<Socket> f19448e;

        /* renamed from: f */
        private final io.grpc.okhttp.internal.g<Socket> f19449f;

        /* renamed from: g */
        private final Method f19450g;

        /* renamed from: h */
        private final Method f19451h;

        /* renamed from: i */
        private final io.grpc.okhttp.internal.g<Socket> f19452i;

        /* renamed from: j */
        private final io.grpc.okhttp.internal.g<Socket> f19453j;

        /* renamed from: k */
        private final EnumC0303h f19454k;

        public d(io.grpc.okhttp.internal.g<Socket> gVar, io.grpc.okhttp.internal.g<Socket> gVar2, Method method, Method method2, io.grpc.okhttp.internal.g<Socket> gVar3, io.grpc.okhttp.internal.g<Socket> gVar4, Provider provider, EnumC0303h enumC0303h) {
            super(provider);
            this.f19448e = gVar;
            this.f19449f = gVar2;
            this.f19450g = method;
            this.f19451h = method2;
            this.f19452i = gVar3;
            this.f19453j = gVar4;
            this.f19454k = enumC0303h;
        }

        @Override // io.grpc.okhttp.internal.h
        public void c(SSLSocket sSLSocket, String str, List<i> list) {
            if (str != null) {
                this.f19448e.e(sSLSocket, Boolean.TRUE);
                this.f19449f.e(sSLSocket, str);
            }
            if (this.f19453j.g(sSLSocket)) {
                this.f19453j.f(sSLSocket, h.b(list));
            }
        }

        @Override // io.grpc.okhttp.internal.h
        public String h(SSLSocket sSLSocket) {
            byte[] bArr;
            if (this.f19452i.g(sSLSocket) && (bArr = (byte[]) this.f19452i.f(sSLSocket, new Object[0])) != null) {
                return new String(bArr, l.f19469b);
            }
            return null;
        }

        @Override // io.grpc.okhttp.internal.h
        public EnumC0303h i() {
            return this.f19454k;
        }
    }

    /* loaded from: classes3.dex */
    public static class e extends h {

        /* renamed from: e */
        private final Method f19455e;

        /* renamed from: f */
        private final Method f19456f;

        private e(Provider provider, Method method, Method method2) {
            super(provider);
            this.f19455e = method;
            this.f19456f = method2;
        }

        /* synthetic */ e(Provider provider, Method method, Method method2, a aVar) {
            this(provider, method, method2);
        }

        @Override // io.grpc.okhttp.internal.h
        public void c(SSLSocket sSLSocket, String str, List<i> list) {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            for (i iVar : list) {
                if (iVar != i.HTTP_1_0) {
                    arrayList.add(iVar.toString());
                }
            }
            try {
                this.f19455e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
                sSLSocket.setSSLParameters(sSLParameters);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // io.grpc.okhttp.internal.h
        public String h(SSLSocket sSLSocket) {
            try {
                return (String) this.f19456f.invoke(sSLSocket, new Object[0]);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // io.grpc.okhttp.internal.h
        public EnumC0303h i() {
            return EnumC0303h.ALPN_AND_NPN;
        }
    }

    /* loaded from: classes3.dex */
    public static class f extends h {

        /* renamed from: e */
        private final Method f19457e;

        /* renamed from: f */
        private final Method f19458f;

        /* renamed from: g */
        private final Method f19459g;

        /* renamed from: h */
        private final Class<?> f19460h;

        /* renamed from: i */
        private final Class<?> f19461i;

        public f(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2, Provider provider) {
            super(provider);
            this.f19457e = method;
            this.f19458f = method2;
            this.f19459g = method3;
            this.f19460h = cls;
            this.f19461i = cls2;
        }

        @Override // io.grpc.okhttp.internal.h
        public void a(SSLSocket sSLSocket) {
            try {
                this.f19459g.invoke(null, sSLSocket);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e10) {
                h.f19444b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e10);
            }
        }

        @Override // io.grpc.okhttp.internal.h
        public void c(SSLSocket sSLSocket, String str, List<i> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                i iVar = list.get(i10);
                if (iVar != i.HTTP_1_0) {
                    arrayList.add(iVar.toString());
                }
            }
            try {
                this.f19457e.invoke(null, sSLSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f19460h, this.f19461i}, new g(arrayList)));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // io.grpc.okhttp.internal.h
        public String h(SSLSocket sSLSocket) {
            try {
                g gVar = (g) Proxy.getInvocationHandler(this.f19458f.invoke(null, sSLSocket));
                if (!gVar.f19463b && gVar.f19464c == null) {
                    h.f19444b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                }
                if (gVar.f19463b) {
                    return null;
                }
                return gVar.f19464c;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
                throw new AssertionError();
            }
        }

        @Override // io.grpc.okhttp.internal.h
        public EnumC0303h i() {
            return EnumC0303h.ALPN_AND_NPN;
        }
    }

    /* loaded from: classes3.dex */
    private static class g implements InvocationHandler {

        /* renamed from: a */
        private final List<String> f19462a;

        /* renamed from: b */
        private boolean f19463b;

        /* renamed from: c */
        private String f19464c;

        public g(List<String> list) {
            this.f19462a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = l.f19468a;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f19463b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f19462a;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj3 = objArr[0];
                if (obj3 instanceof List) {
                    List list = (List) obj3;
                    int size = list.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            obj2 = this.f19462a.get(0);
                            break;
                        }
                        if (this.f19462a.contains(list.get(i10))) {
                            obj2 = list.get(i10);
                            break;
                        }
                        i10++;
                    }
                    String str = (String) obj2;
                    this.f19464c = str;
                    return str;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f19464c = (String) objArr[0];
            return null;
        }
    }

    /* renamed from: io.grpc.okhttp.internal.h$h */
    /* loaded from: classes3.dex */
    public enum EnumC0303h {
        ALPN_AND_NPN,
        NPN,
        NONE
    }

    public h(Provider provider) {
        this.f19447a = provider;
    }

    public static byte[] b(List<i> list) {
        dm.b bVar = new dm.b();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = list.get(i10);
            if (iVar != i.HTTP_1_0) {
                bVar.writeByte(iVar.toString().length());
                bVar.T(iVar.toString());
            }
        }
        return bVar.H();
    }

    private static h d() {
        Method method;
        Method method2;
        Provider f10 = f();
        if (f10 != null) {
            io.grpc.okhttp.internal.g gVar = new io.grpc.okhttp.internal.g(null, "setUseSessionTickets", Boolean.TYPE);
            io.grpc.okhttp.internal.g gVar2 = new io.grpc.okhttp.internal.g(null, "setHostname", String.class);
            io.grpc.okhttp.internal.g gVar3 = new io.grpc.okhttp.internal.g(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            io.grpc.okhttp.internal.g gVar4 = new io.grpc.okhttp.internal.g(null, "setAlpnProtocols", byte[].class);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                method = cls.getMethod("tagSocket", Socket.class);
                try {
                    method2 = cls.getMethod("untagSocket", Socket.class);
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    method2 = null;
                    return new d(gVar, gVar2, method, method2, gVar3, gVar4, f10, (!f10.getName().equals("GmsCore_OpenSSL") || f10.getName().equals("Conscrypt") || f10.getName().equals("Ssl_Guard") || k()) ? EnumC0303h.ALPN_AND_NPN : j() ? EnumC0303h.NPN : EnumC0303h.NONE);
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                method = null;
            }
            return new d(gVar, gVar2, method, method2, gVar3, gVar4, f10, (!f10.getName().equals("GmsCore_OpenSSL") || f10.getName().equals("Conscrypt") || f10.getName().equals("Ssl_Guard") || k()) ? EnumC0303h.ALPN_AND_NPN : j() ? EnumC0303h.NPN : EnumC0303h.NONE);
        }
        try {
            Provider provider = SSLContext.getDefault().getProvider();
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS", provider);
                sSLContext.init(null, null, null);
                ((Method) AccessController.doPrivileged(new a())).invoke(sSLContext.createSSLEngine(), new Object[0]);
                return new e(provider, (Method) AccessController.doPrivileged(new b()), (Method) AccessController.doPrivileged(new c()), null);
            } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused3) {
                try {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
                    return new f(cls2.getMethod("put", SSLSocket.class, cls3), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider);
                } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                    return new h(provider);
                }
            }
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static h e() {
        return f19446d;
    }

    private static Provider f() {
        for (Provider provider : Security.getProviders()) {
            for (String str : f19445c) {
                if (str.equals(provider.getClass().getName())) {
                    f19444b.log(Level.FINE, "Found registered provider {0}", str);
                    return provider;
                }
            }
        }
        f19444b.log(Level.WARNING, "Unable to find Conscrypt");
        return null;
    }

    private static boolean j() {
        try {
            h.class.getClassLoader().loadClass("android.app.ActivityOptions");
            return true;
        } catch (ClassNotFoundException e10) {
            f19444b.log(Level.FINE, "Can't find class", (Throwable) e10);
            return false;
        }
    }

    private static boolean k() {
        try {
            h.class.getClassLoader().loadClass("android.net.Network");
            return true;
        } catch (ClassNotFoundException e10) {
            f19444b.log(Level.FINE, "Can't find class", (Throwable) e10);
            return false;
        }
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void c(SSLSocket sSLSocket, String str, List<i> list) {
    }

    public Provider g() {
        return this.f19447a;
    }

    public String h(SSLSocket sSLSocket) {
        return null;
    }

    public EnumC0303h i() {
        return EnumC0303h.NONE;
    }
}
