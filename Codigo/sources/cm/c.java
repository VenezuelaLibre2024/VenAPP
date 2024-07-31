package cm;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import zl.j;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7198a = new a(null);

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final c a(X509TrustManager trustManager) {
            n.e(trustManager, "trustManager");
            return j.f32984a.g().c(trustManager);
        }
    }

    public abstract List<Certificate> a(List<? extends Certificate> list, String str);
}
