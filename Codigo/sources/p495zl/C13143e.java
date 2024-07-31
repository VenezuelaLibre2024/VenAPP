package p495zl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p319ql.EnumC10551z;

/* renamed from: zl.e */
/* loaded from: classes3.dex */
public final class C13143e extends C13148j {

    /* renamed from: i */
    public static final b f35521i = new b(null);

    /* renamed from: d */
    private final Method f35522d;

    /* renamed from: e */
    private final Method f35523e;

    /* renamed from: f */
    private final Method f35524f;

    /* renamed from: g */
    private final Class<?> f35525g;

    /* renamed from: h */
    private final Class<?> f35526h;

    /* renamed from: zl.e$a */
    /* loaded from: classes3.dex */
    private static final class a implements InvocationHandler {

        /* renamed from: a */
        private final List<String> f35527a;

        /* renamed from: b */
        private boolean f35528b;

        /* renamed from: c */
        private String f35529c;

        public a(List<String> protocols) {
            C9322n.m27781e(protocols, "protocols");
            this.f35527a = protocols;
        }

        /* renamed from: a */
        public final String m43362a() {
            return this.f35529c;
        }

        /* renamed from: b */
        public final boolean m43363b() {
            return this.f35528b;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] objArr) {
            C9322n.m27781e(proxy, "proxy");
            C9322n.m27781e(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (C9322n.m27777a(name, "supports") && C9322n.m27777a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (C9322n.m27777a(name, "unsupported") && C9322n.m27777a(Void.TYPE, returnType)) {
                this.f35528b = true;
                return null;
            }
            if (C9322n.m27777a(name, "protocols")) {
                if (objArr.length == 0) {
                    return this.f35527a;
                }
            }
            if ((C9322n.m27777a(name, "selectProtocol") || C9322n.m27777a(name, "select")) && C9322n.m27777a(String.class, returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i10 = 0;
                        while (true) {
                            int i11 = i10 + 1;
                            Object obj2 = list.get(i10);
                            if (obj2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            String str = (String) obj2;
                            if (this.f35527a.contains(str)) {
                                this.f35529c = str;
                                return str;
                            }
                            if (i10 == size) {
                                break;
                            }
                            i10 = i11;
                        }
                    }
                    String str2 = this.f35527a.get(0);
                    this.f35529c = str2;
                    return str2;
                }
            }
            if ((!C9322n.m27777a(name, "protocolSelected") && !C9322n.m27777a(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.f35529c = (String) obj3;
            return null;
        }
    }

    /* renamed from: zl.e$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C13148j m43364a() {
            String jvmVersion = System.getProperty("java.specification.version", "unknown");
            try {
                C9322n.m27780d(jvmVersion, "jvmVersion");
                if (Integer.parseInt(jvmVersion) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName(C9322n.m27787k("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                Class<?> clientProviderClass = Class.forName(C9322n.m27787k("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                Class<?> serverProviderClass = Class.forName(C9322n.m27787k("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                Method getMethod = cls.getMethod("get", SSLSocket.class);
                Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                C9322n.m27780d(putMethod, "putMethod");
                C9322n.m27780d(getMethod, "getMethod");
                C9322n.m27780d(removeMethod, "removeMethod");
                C9322n.m27780d(clientProviderClass, "clientProviderClass");
                C9322n.m27780d(serverProviderClass, "serverProviderClass");
                return new C13143e(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public C13143e(Method putMethod, Method getMethod, Method removeMethod, Class<?> clientProviderClass, Class<?> serverProviderClass) {
        C9322n.m27781e(putMethod, "putMethod");
        C9322n.m27781e(getMethod, "getMethod");
        C9322n.m27781e(removeMethod, "removeMethod");
        C9322n.m27781e(clientProviderClass, "clientProviderClass");
        C9322n.m27781e(serverProviderClass, "serverProviderClass");
        this.f35522d = putMethod;
        this.f35523e = getMethod;
        this.f35524f = removeMethod;
        this.f35525g = clientProviderClass;
        this.f35526h = serverProviderClass;
    }

    @Override // p495zl.C13148j
    /* renamed from: b */
    public void mo43361b(SSLSocket sslSocket) {
        C9322n.m27781e(sslSocket, "sslSocket");
        try {
            this.f35524f.invoke(null, sslSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // p495zl.C13148j
    /* renamed from: e */
    public void mo43339e(SSLSocket sslSocket, String str, List<? extends EnumC10551z> protocols) {
        C9322n.m27781e(sslSocket, "sslSocket");
        C9322n.m27781e(protocols, "protocols");
        try {
            this.f35522d.invoke(null, sslSocket, Proxy.newProxyInstance(C13148j.class.getClassLoader(), new Class[]{this.f35525g, this.f35526h}, new a(C13148j.f35535a.m43383b(protocols))));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // p495zl.C13148j
    /* renamed from: g */
    public String mo43340g(SSLSocket sslSocket) {
        C9322n.m27781e(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f35523e.invoke(null, sslSocket));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            a aVar = (a) invocationHandler;
            if (!aVar.m43363b() && aVar.m43362a() == null) {
                C13148j.m43374k(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (aVar.m43363b()) {
                return null;
            }
            return aVar.m43362a();
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
