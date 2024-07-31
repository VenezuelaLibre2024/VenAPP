package am;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class n extends h {

    /* renamed from: j, reason: collision with root package name */
    public static final a f520j = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private final Class<? super SSLSocketFactory> f521h;

    /* renamed from: i, reason: collision with root package name */
    private final Class<?> f522i;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public static /* synthetic */ m b(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.a(str);
        }

        public final m a(String packageName) {
            kotlin.jvm.internal.n.e(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(kotlin.jvm.internal.n.k(packageName, ".OpenSSLSocketImpl"));
                Class<?> cls2 = Class.forName(kotlin.jvm.internal.n.k(packageName, ".OpenSSLSocketFactoryImpl"));
                Class<?> paramsClass = Class.forName(kotlin.jvm.internal.n.k(packageName, ".SSLParametersImpl"));
                kotlin.jvm.internal.n.d(paramsClass, "paramsClass");
                return new n(cls, cls2, paramsClass);
            } catch (Exception e10) {
                zl.j.f32984a.g().j("unable to load android socket classes", 5, e10);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Class<? super SSLSocket> sslSocketClass, Class<? super SSLSocketFactory> sslSocketFactoryClass, Class<?> paramClass) {
        super(sslSocketClass);
        kotlin.jvm.internal.n.e(sslSocketClass, "sslSocketClass");
        kotlin.jvm.internal.n.e(sslSocketFactoryClass, "sslSocketFactoryClass");
        kotlin.jvm.internal.n.e(paramClass, "paramClass");
        this.f521h = sslSocketFactoryClass;
        this.f522i = paramClass;
    }
}
