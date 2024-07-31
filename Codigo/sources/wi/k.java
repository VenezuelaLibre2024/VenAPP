package wi;

import io.grpc.internal.q0;
import io.grpc.okhttp.internal.h;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f30135b = Logger.getLogger(k.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final io.grpc.okhttp.internal.h f30136c = io.grpc.okhttp.internal.h.e();

    /* renamed from: d, reason: collision with root package name */
    private static k f30137d = d(k.class.getClassLoader());

    /* renamed from: a, reason: collision with root package name */
    protected final io.grpc.okhttp.internal.h f30138a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends k {

        /* renamed from: e, reason: collision with root package name */
        private static final io.grpc.okhttp.internal.g<Socket> f30139e;

        /* renamed from: f, reason: collision with root package name */
        private static final io.grpc.okhttp.internal.g<Socket> f30140f;

        /* renamed from: g, reason: collision with root package name */
        private static final io.grpc.okhttp.internal.g<Socket> f30141g;

        /* renamed from: h, reason: collision with root package name */
        private static final io.grpc.okhttp.internal.g<Socket> f30142h;

        /* renamed from: i, reason: collision with root package name */
        private static final io.grpc.okhttp.internal.g<Socket> f30143i;

        /* renamed from: j, reason: collision with root package name */
        private static final io.grpc.okhttp.internal.g<Socket> f30144j;

        /* renamed from: k, reason: collision with root package name */
        private static final Method f30145k;

        /* renamed from: l, reason: collision with root package name */
        private static final Method f30146l;

        /* renamed from: m, reason: collision with root package name */
        private static final Method f30147m;

        /* renamed from: n, reason: collision with root package name */
        private static final Method f30148n;

        /* renamed from: o, reason: collision with root package name */
        private static final Method f30149o;

        /* renamed from: p, reason: collision with root package name */
        private static final Method f30150p;

        /* renamed from: q, reason: collision with root package name */
        private static final Constructor<?> f30151q;

        static {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Method method5;
            Method method6;
            Class<?> cls;
            Class<?> cls2 = Boolean.TYPE;
            Constructor<?> constructor = null;
            f30139e = new io.grpc.okhttp.internal.g<>(null, "setUseSessionTickets", cls2);
            f30140f = new io.grpc.okhttp.internal.g<>(null, "setHostname", String.class);
            f30141g = new io.grpc.okhttp.internal.g<>(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            f30142h = new io.grpc.okhttp.internal.g<>(null, "setAlpnProtocols", byte[].class);
            f30143i = new io.grpc.okhttp.internal.g<>(byte[].class, "getNpnSelectedProtocol", new Class[0]);
            f30144j = new io.grpc.okhttp.internal.g<>(null, "setNpnProtocols", byte[].class);
            try {
                method = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            } catch (ClassNotFoundException e10) {
                e = e10;
                method = null;
                method2 = null;
            } catch (NoSuchMethodException e11) {
                e = e11;
                method = null;
                method2 = null;
            }
            try {
                method2 = SSLParameters.class.getMethod("getApplicationProtocols", new Class[0]);
            } catch (ClassNotFoundException e12) {
                e = e12;
                method2 = null;
                method3 = method2;
                method4 = method3;
                k.f30135b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                method5 = null;
                f30147m = method;
                f30148n = method2;
                f30149o = method3;
                f30145k = method4;
                f30146l = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                try {
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                } catch (ClassNotFoundException e13) {
                    e = e13;
                    k.f30135b.log(Level.FINER, "Failed to find Android 7.0+ APIs", e);
                    f30150p = method6;
                    f30151q = constructor;
                } catch (NoSuchMethodException e14) {
                    e = e14;
                    k.f30135b.log(Level.FINER, "Failed to find Android 7.0+ APIs", e);
                    f30150p = method6;
                    f30151q = constructor;
                }
                f30150p = method6;
                f30151q = constructor;
            } catch (NoSuchMethodException e15) {
                e = e15;
                method2 = null;
                method3 = method2;
                method4 = method3;
                k.f30135b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                method5 = null;
                f30147m = method;
                f30148n = method2;
                f30149o = method3;
                f30145k = method4;
                f30146l = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f30150p = method6;
                f30151q = constructor;
            }
            try {
                method3 = SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                try {
                    cls = Class.forName("android.net.ssl.SSLSockets");
                    method4 = cls.getMethod("isSupportedSocket", SSLSocket.class);
                } catch (ClassNotFoundException | NoSuchMethodException e16) {
                    e = e16;
                    method4 = null;
                }
                try {
                    method5 = cls.getMethod("setUseSessionTickets", SSLSocket.class, cls2);
                } catch (ClassNotFoundException e17) {
                    e = e17;
                    k.f30135b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                    method5 = null;
                    f30147m = method;
                    f30148n = method2;
                    f30149o = method3;
                    f30145k = method4;
                    f30146l = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f30150p = method6;
                    f30151q = constructor;
                } catch (NoSuchMethodException e18) {
                    e = e18;
                    k.f30135b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                    method5 = null;
                    f30147m = method;
                    f30148n = method2;
                    f30149o = method3;
                    f30145k = method4;
                    f30146l = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f30150p = method6;
                    f30151q = constructor;
                }
            } catch (ClassNotFoundException e19) {
                e = e19;
                method3 = null;
                method4 = method3;
                k.f30135b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                method5 = null;
                f30147m = method;
                f30148n = method2;
                f30149o = method3;
                f30145k = method4;
                f30146l = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f30150p = method6;
                f30151q = constructor;
            } catch (NoSuchMethodException e20) {
                e = e20;
                method3 = null;
                method4 = method3;
                k.f30135b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                method5 = null;
                f30147m = method;
                f30148n = method2;
                f30149o = method3;
                f30145k = method4;
                f30146l = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f30150p = method6;
                f30151q = constructor;
            }
            f30147m = method;
            f30148n = method2;
            f30149o = method3;
            f30145k = method4;
            f30146l = method5;
            try {
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            } catch (ClassNotFoundException | NoSuchMethodException e21) {
                e = e21;
                method6 = null;
            }
            f30150p = method6;
            f30151q = constructor;
        }

        a(io.grpc.okhttp.internal.h hVar) {
            super(hVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00d4  */
        @Override // wi.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        protected void c(javax.net.ssl.SSLSocket r9, java.lang.String r10, java.util.List<io.grpc.okhttp.internal.i> r11) {
            /*
                Method dump skipped, instructions count: 241
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: wi.k.a.c(javax.net.ssl.SSLSocket, java.lang.String, java.util.List):void");
        }

        @Override // wi.k
        public String f(SSLSocket sSLSocket) {
            Method method = f30149o;
            if (method != null) {
                try {
                    return (String) method.invoke(sSLSocket, new Object[0]);
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                } catch (InvocationTargetException e11) {
                    if (!(e11.getTargetException() instanceof UnsupportedOperationException)) {
                        throw new RuntimeException(e11);
                    }
                    k.f30135b.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
                }
            }
            if (this.f30138a.i() == h.EnumC0303h.ALPN_AND_NPN) {
                try {
                    byte[] bArr = (byte[]) f30141g.f(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, io.grpc.okhttp.internal.l.f19469b);
                    }
                } catch (Exception e12) {
                    k.f30135b.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e12);
                }
            }
            if (this.f30138a.i() == h.EnumC0303h.NONE) {
                return null;
            }
            try {
                byte[] bArr2 = (byte[]) f30143i.f(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, io.grpc.okhttp.internal.l.f19469b);
                }
                return null;
            } catch (Exception e13) {
                k.f30135b.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e13);
                return null;
            }
        }

        @Override // wi.k
        public String h(SSLSocket sSLSocket, String str, List<io.grpc.okhttp.internal.i> list) {
            String f10 = f(sSLSocket);
            return f10 == null ? super.h(sSLSocket, str, list) : f10;
        }
    }

    k(io.grpc.okhttp.internal.h hVar) {
        this.f30138a = (io.grpc.okhttp.internal.h) eb.o.p(hVar, "platform");
    }

    static k d(ClassLoader classLoader) {
        boolean z10;
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e10) {
            f30135b.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e10);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e11) {
                f30135b.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e11);
                z10 = false;
            }
        }
        z10 = true;
        return z10 ? new a(f30136c) : new k(f30136c);
    }

    public static k e() {
        return f30137d;
    }

    static boolean g(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            q0.c(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] i(List<io.grpc.okhttp.internal.i> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<io.grpc.okhttp.internal.i> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    protected void c(SSLSocket sSLSocket, String str, List<io.grpc.okhttp.internal.i> list) {
        this.f30138a.c(sSLSocket, str, list);
    }

    public String f(SSLSocket sSLSocket) {
        return this.f30138a.h(sSLSocket);
    }

    public String h(SSLSocket sSLSocket, String str, List<io.grpc.okhttp.internal.i> list) {
        if (list != null) {
            c(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String f10 = f(sSLSocket);
            if (f10 != null) {
                return f10;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            this.f30138a.a(sSLSocket);
        }
    }
}
