package cm;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p495zl.C13148j;

/* renamed from: cm.c */
/* loaded from: classes3.dex */
public abstract class AbstractC2057c {

    /* renamed from: a */
    public static final a f8150a = new a(null);

    /* renamed from: cm.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final AbstractC2057c m10392a(X509TrustManager trustManager) {
            C9322n.m27781e(trustManager, "trustManager");
            return C13148j.f35535a.m43385g().mo43338c(trustManager);
        }
    }

    /* renamed from: a */
    public abstract List<Certificate> mo639a(List<? extends Certificate> list, String str);
}
