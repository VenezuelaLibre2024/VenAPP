package am;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p495zl.C13148j;

/* renamed from: am.n */
/* loaded from: classes3.dex */
public final class C0150n extends C0144h {

    /* renamed from: j */
    public static final a f585j = new a(null);

    /* renamed from: h */
    private final Class<? super SSLSocketFactory> f586h;

    /* renamed from: i */
    private final Class<?> f587i;

    /* renamed from: am.n$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ InterfaceC0149m m662b(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.m663a(str);
        }

        /* renamed from: a */
        public final InterfaceC0149m m663a(String packageName) {
            C9322n.m27781e(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(C9322n.m27787k(packageName, ".OpenSSLSocketImpl"));
                Class<?> cls2 = Class.forName(C9322n.m27787k(packageName, ".OpenSSLSocketFactoryImpl"));
                Class<?> paramsClass = Class.forName(C9322n.m27787k(packageName, ".SSLParametersImpl"));
                C9322n.m27780d(paramsClass, "paramsClass");
                return new C0150n(cls, cls2, paramsClass);
            } catch (Exception e10) {
                C13148j.f35535a.m43385g().m43375j("unable to load android socket classes", 5, e10);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0150n(Class<? super SSLSocket> sslSocketClass, Class<? super SSLSocketFactory> sslSocketFactoryClass, Class<?> paramClass) {
        super(sslSocketClass);
        C9322n.m27781e(sslSocketClass, "sslSocketClass");
        C9322n.m27781e(sslSocketFactoryClass, "sslSocketFactoryClass");
        C9322n.m27781e(paramClass, "paramClass");
        this.f586h = sslSocketFactoryClass;
        this.f587i = paramClass;
    }
}
