package zl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.n;
import ql.z;

/* loaded from: classes3.dex */
public final class e extends j {

    /* renamed from: i, reason: collision with root package name */
    public static final b f32970i = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private final Method f32971d;

    /* renamed from: e, reason: collision with root package name */
    private final Method f32972e;

    /* renamed from: f, reason: collision with root package name */
    private final Method f32973f;

    /* renamed from: g, reason: collision with root package name */
    private final Class<?> f32974g;

    /* renamed from: h, reason: collision with root package name */
    private final Class<?> f32975h;

    /* loaded from: classes3.dex */
    private static final class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private final List<String> f32976a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f32977b;

        /* renamed from: c, reason: collision with root package name */
        private String f32978c;

        public a(List<String> protocols) {
            n.e(protocols, "protocols");
            this.f32976a = protocols;
        }

        public final String a() {
            return this.f32978c;
        }

        public final boolean b() {
            return this.f32977b;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] objArr) {
            n.e(proxy, "proxy");
            n.e(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (n.a(name, "supports") && n.a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (n.a(name, "unsupported") && n.a(Void.TYPE, returnType)) {
                this.f32977b = true;
                return null;
            }
            if (n.a(name, "protocols")) {
                if (objArr.length == 0) {
                    return this.f32976a;
                }
            }
            if ((n.a(name, "selectProtocol") || n.a(name, "select")) && n.a(String.class, returnType) && objArr.length == 1) {
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
                            if (this.f32976a.contains(str)) {
                                this.f32978c = str;
                                return str;
                            }
                            if (i10 == size) {
                                break;
                            }
                            i10 = i11;
                        }
                    }
                    String str2 = this.f32976a.get(0);
                    this.f32978c = str2;
                    return str2;
                }
            }
            if ((!n.a(name, "protocolSelected") && !n.a(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.f32978c = (String) obj3;
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final j a() {
            String jvmVersion = System.getProperty("java.specification.version", "unknown");
            try {
                n.d(jvmVersion, "jvmVersion");
                if (Integer.parseInt(jvmVersion) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName(n.k("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                Class<?> clientProviderClass = Class.forName(n.k("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                Class<?> serverProviderClass = Class.forName(n.k("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                Method getMethod = cls.getMethod("get", SSLSocket.class);
                Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                n.d(putMethod, "putMethod");
                n.d(getMethod, "getMethod");
                n.d(removeMethod, "removeMethod");
                n.d(clientProviderClass, "clientProviderClass");
                n.d(serverProviderClass, "serverProviderClass");
                return new e(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public e(Method putMethod, Method getMethod, Method removeMethod, Class<?> clientProviderClass, Class<?> serverProviderClass) {
        n.e(putMethod, "putMethod");
        n.e(getMethod, "getMethod");
        n.e(removeMethod, "removeMethod");
        n.e(clientProviderClass, "clientProviderClass");
        n.e(serverProviderClass, "serverProviderClass");
        this.f32971d = putMethod;
        this.f32972e = getMethod;
        this.f32973f = removeMethod;
        this.f32974g = clientProviderClass;
        this.f32975h = serverProviderClass;
    }

    @Override // zl.j
    public void b(SSLSocket sslSocket) {
        n.e(sslSocket, "sslSocket");
        try {
            this.f32973f.invoke(null, sslSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // zl.j
    public void e(SSLSocket sslSocket, String str, List<? extends z> protocols) {
        n.e(sslSocket, "sslSocket");
        n.e(protocols, "protocols");
        try {
            this.f32971d.invoke(null, sslSocket, Proxy.newProxyInstance(j.class.getClassLoader(), new Class[]{this.f32974g, this.f32975h}, new a(j.f32984a.b(protocols))));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // zl.j
    public String g(SSLSocket sslSocket) {
        n.e(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f32972e.invoke(null, sslSocket));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            a aVar = (a) invocationHandler;
            if (!aVar.b() && aVar.a() == null) {
                j.k(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (aVar.b()) {
                return null;
            }
            return aVar.a();
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
