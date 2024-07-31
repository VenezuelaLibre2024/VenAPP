package am;

import am.C0148l;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p319ql.EnumC10551z;
import p450xk.C12512d;
import p450xk.C12524p;
import p495zl.C13140b;
import p495zl.C13148j;

/* renamed from: am.h */
/* loaded from: classes3.dex */
public class C0144h implements InterfaceC0149m {

    /* renamed from: f */
    public static final a f567f;

    /* renamed from: g */
    private static final C0148l.a f568g;

    /* renamed from: a */
    private final Class<? super SSLSocket> f569a;

    /* renamed from: b */
    private final Method f570b;

    /* renamed from: c */
    private final Method f571c;

    /* renamed from: d */
    private final Method f572d;

    /* renamed from: e */
    private final Method f573e;

    /* renamed from: am.h$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: am.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C13151a implements C0148l.a {

            /* renamed from: a */
            final /* synthetic */ String f574a;

            C13151a(String str) {
                this.f574a = str;
            }

            @Override // am.C0148l.a
            /* renamed from: b */
            public boolean mo652b(SSLSocket sslSocket) {
                boolean m41031E;
                C9322n.m27781e(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                C9322n.m27780d(name, "sslSocket.javaClass.name");
                m41031E = C12524p.m41031E(name, C9322n.m27787k(this.f574a, "."), false, 2, null);
                return m41031E;
            }

            @Override // am.C0148l.a
            /* renamed from: c */
            public InterfaceC0149m mo653c(SSLSocket sslSocket) {
                C9322n.m27781e(sslSocket, "sslSocket");
                return C0144h.f567f.m649b(sslSocket.getClass());
            }
        }

        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final C0144h m649b(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> cls2 = cls;
            while (cls2 != null && !C9322n.m27777a(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError(C9322n.m27787k("No OpenSSLSocketImpl superclass of socket of type ", cls));
                }
            }
            C9322n.m27778b(cls2);
            return new C0144h(cls2);
        }

        /* renamed from: c */
        public final C0148l.a m650c(String packageName) {
            C9322n.m27781e(packageName, "packageName");
            return new C13151a(packageName);
        }

        /* renamed from: d */
        public final C0148l.a m651d() {
            return C0144h.f568g;
        }
    }

    static {
        a aVar = new a(null);
        f567f = aVar;
        f568g = aVar.m650c("com.google.android.gms.org.conscrypt");
    }

    public C0144h(Class<? super SSLSocket> sslSocketClass) {
        C9322n.m27781e(sslSocketClass, "sslSocketClass");
        this.f569a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        C9322n.m27780d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f570b = declaredMethod;
        this.f571c = sslSocketClass.getMethod("setHostname", String.class);
        this.f572d = sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f573e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // am.InterfaceC0149m
    /* renamed from: a */
    public boolean mo633a() {
        return C13140b.f35508f.m43350b();
    }

    @Override // am.InterfaceC0149m
    /* renamed from: b */
    public boolean mo634b(SSLSocket sslSocket) {
        C9322n.m27781e(sslSocket, "sslSocket");
        return this.f569a.isInstance(sslSocket);
    }

    @Override // am.InterfaceC0149m
    /* renamed from: c */
    public String mo635c(SSLSocket sslSocket) {
        C9322n.m27781e(sslSocket, "sslSocket");
        if (!mo634b(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f572d.invoke(sslSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, C12512d.f33913b);
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && C9322n.m27777a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // am.InterfaceC0149m
    /* renamed from: d */
    public void mo636d(SSLSocket sslSocket, String str, List<? extends EnumC10551z> protocols) {
        C9322n.m27781e(sslSocket, "sslSocket");
        C9322n.m27781e(protocols, "protocols");
        if (mo634b(sslSocket)) {
            try {
                this.f570b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f571c.invoke(sslSocket, str);
                }
                this.f573e.invoke(sslSocket, C13148j.f35535a.m43384c(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
