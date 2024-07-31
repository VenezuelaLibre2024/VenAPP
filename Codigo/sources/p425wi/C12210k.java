package p425wi;

import io.grpc.internal.C8890q0;
import io.grpc.okhttp.internal.C8925g;
import io.grpc.okhttp.internal.C8926h;
import io.grpc.okhttp.internal.C8930l;
import io.grpc.okhttp.internal.EnumC8927i;
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
import p082eb.C7159o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wi.k */
/* loaded from: classes3.dex */
public class C12210k {

    /* renamed from: b */
    private static final Logger f32647b = Logger.getLogger(C12210k.class.getName());

    /* renamed from: c */
    private static final C8926h f32648c = C8926h.m26086e();

    /* renamed from: d */
    private static C12210k f32649d = m39305d(C12210k.class.getClassLoader());

    /* renamed from: a */
    protected final C8926h f32650a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wi.k$a */
    /* loaded from: classes3.dex */
    public static final class a extends C12210k {

        /* renamed from: e */
        private static final C8925g<Socket> f32651e;

        /* renamed from: f */
        private static final C8925g<Socket> f32652f;

        /* renamed from: g */
        private static final C8925g<Socket> f32653g;

        /* renamed from: h */
        private static final C8925g<Socket> f32654h;

        /* renamed from: i */
        private static final C8925g<Socket> f32655i;

        /* renamed from: j */
        private static final C8925g<Socket> f32656j;

        /* renamed from: k */
        private static final Method f32657k;

        /* renamed from: l */
        private static final Method f32658l;

        /* renamed from: m */
        private static final Method f32659m;

        /* renamed from: n */
        private static final Method f32660n;

        /* renamed from: o */
        private static final Method f32661o;

        /* renamed from: p */
        private static final Method f32662p;

        /* renamed from: q */
        private static final Constructor<?> f32663q;

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
            f32651e = new C8925g<>(null, "setUseSessionTickets", cls2);
            f32652f = new C8925g<>(null, "setHostname", String.class);
            f32653g = new C8925g<>(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            f32654h = new C8925g<>(null, "setAlpnProtocols", byte[].class);
            f32655i = new C8925g<>(byte[].class, "getNpnSelectedProtocol", new Class[0]);
            f32656j = new C8925g<>(null, "setNpnProtocols", byte[].class);
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
                C12210k.f32647b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                method5 = null;
                f32659m = method;
                f32660n = method2;
                f32661o = method3;
                f32657k = method4;
                f32658l = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                try {
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                } catch (ClassNotFoundException e13) {
                    e = e13;
                    C12210k.f32647b.log(Level.FINER, "Failed to find Android 7.0+ APIs", e);
                    f32662p = method6;
                    f32663q = constructor;
                } catch (NoSuchMethodException e14) {
                    e = e14;
                    C12210k.f32647b.log(Level.FINER, "Failed to find Android 7.0+ APIs", e);
                    f32662p = method6;
                    f32663q = constructor;
                }
                f32662p = method6;
                f32663q = constructor;
            } catch (NoSuchMethodException e15) {
                e = e15;
                method2 = null;
                method3 = method2;
                method4 = method3;
                C12210k.f32647b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                method5 = null;
                f32659m = method;
                f32660n = method2;
                f32661o = method3;
                f32657k = method4;
                f32658l = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f32662p = method6;
                f32663q = constructor;
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
                    C12210k.f32647b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                    method5 = null;
                    f32659m = method;
                    f32660n = method2;
                    f32661o = method3;
                    f32657k = method4;
                    f32658l = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f32662p = method6;
                    f32663q = constructor;
                } catch (NoSuchMethodException e18) {
                    e = e18;
                    C12210k.f32647b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                    method5 = null;
                    f32659m = method;
                    f32660n = method2;
                    f32661o = method3;
                    f32657k = method4;
                    f32658l = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f32662p = method6;
                    f32663q = constructor;
                }
            } catch (ClassNotFoundException e19) {
                e = e19;
                method3 = null;
                method4 = method3;
                C12210k.f32647b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                method5 = null;
                f32659m = method;
                f32660n = method2;
                f32661o = method3;
                f32657k = method4;
                f32658l = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f32662p = method6;
                f32663q = constructor;
            } catch (NoSuchMethodException e20) {
                e = e20;
                method3 = null;
                method4 = method3;
                C12210k.f32647b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                method5 = null;
                f32659m = method;
                f32660n = method2;
                f32661o = method3;
                f32657k = method4;
                f32658l = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f32662p = method6;
                f32663q = constructor;
            }
            f32659m = method;
            f32660n = method2;
            f32661o = method3;
            f32657k = method4;
            f32658l = method5;
            try {
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            } catch (ClassNotFoundException | NoSuchMethodException e21) {
                e = e21;
                method6 = null;
            }
            f32662p = method6;
            f32663q = constructor;
        }

        a(C8926h c8926h) {
            super(c8926h);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00d4  */
        @Override // p425wi.C12210k
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        protected void mo39309c(javax.net.ssl.SSLSocket r9, java.lang.String r10, java.util.List<io.grpc.okhttp.internal.EnumC8927i> r11) {
            /*
                Method dump skipped, instructions count: 241
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p425wi.C12210k.a.mo39309c(javax.net.ssl.SSLSocket, java.lang.String, java.util.List):void");
        }

        @Override // p425wi.C12210k
        /* renamed from: f */
        public String mo39310f(SSLSocket sSLSocket) {
            Method method = f32661o;
            if (method != null) {
                try {
                    return (String) method.invoke(sSLSocket, new Object[0]);
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                } catch (InvocationTargetException e11) {
                    if (!(e11.getTargetException() instanceof UnsupportedOperationException)) {
                        throw new RuntimeException(e11);
                    }
                    C12210k.f32647b.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
                }
            }
            if (this.f32650a.mo26094i() == C8926h.h.ALPN_AND_NPN) {
                try {
                    byte[] bArr = (byte[]) f32653g.m26082f(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, C8930l.f21220b);
                    }
                } catch (Exception e12) {
                    C12210k.f32647b.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e12);
                }
            }
            if (this.f32650a.mo26094i() == C8926h.h.NONE) {
                return null;
            }
            try {
                byte[] bArr2 = (byte[]) f32655i.m26082f(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, C8930l.f21220b);
                }
                return null;
            } catch (Exception e13) {
                C12210k.f32647b.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e13);
                return null;
            }
        }

        @Override // p425wi.C12210k
        /* renamed from: h */
        public String mo39311h(SSLSocket sSLSocket, String str, List<EnumC8927i> list) {
            String mo39310f = mo39310f(sSLSocket);
            return mo39310f == null ? super.mo39311h(sSLSocket, str, list) : mo39310f;
        }
    }

    C12210k(C8926h c8926h) {
        this.f32650a = (C8926h) C7159o.m21313p(c8926h, "platform");
    }

    /* renamed from: d */
    static C12210k m39305d(ClassLoader classLoader) {
        boolean z10;
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e10) {
            f32647b.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e10);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e11) {
                f32647b.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e11);
                z10 = false;
            }
        }
        z10 = true;
        return z10 ? new a(f32648c) : new C12210k(f32648c);
    }

    /* renamed from: e */
    public static C12210k m39306e() {
        return f32649d;
    }

    /* renamed from: g */
    static boolean m39307g(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            C8890q0.m25746c(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static String[] m39308i(List<EnumC8927i> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<EnumC8927i> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: c */
    protected void mo39309c(SSLSocket sSLSocket, String str, List<EnumC8927i> list) {
        this.f32650a.mo26091c(sSLSocket, str, list);
    }

    /* renamed from: f */
    public String mo39310f(SSLSocket sSLSocket) {
        return this.f32650a.mo26093h(sSLSocket);
    }

    /* renamed from: h */
    public String mo39311h(SSLSocket sSLSocket, String str, List<EnumC8927i> list) {
        if (list != null) {
            mo39309c(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String mo39310f = mo39310f(sSLSocket);
            if (mo39310f != null) {
                return mo39310f;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            this.f32650a.mo26090a(sSLSocket);
        }
    }
}
