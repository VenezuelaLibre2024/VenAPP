package wb;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import wb.j;

/* loaded from: classes2.dex */
public final class i<T_WRAPPER extends j<JcePrimitiveT>, JcePrimitiveT> {

    /* renamed from: b, reason: collision with root package name */
    public static final i<j.a, Cipher> f29799b = new i<>(new j.a());

    /* renamed from: c, reason: collision with root package name */
    public static final i<j.e, Mac> f29800c = new i<>(new j.e());

    /* renamed from: d, reason: collision with root package name */
    public static final i<j.g, Signature> f29801d = new i<>(new j.g());

    /* renamed from: e, reason: collision with root package name */
    public static final i<j.f, MessageDigest> f29802e = new i<>(new j.f());

    /* renamed from: f, reason: collision with root package name */
    public static final i<j.b, KeyAgreement> f29803f = new i<>(new j.b());

    /* renamed from: g, reason: collision with root package name */
    public static final i<j.d, KeyPairGenerator> f29804g = new i<>(new j.d());

    /* renamed from: h, reason: collision with root package name */
    public static final i<j.c, KeyFactory> f29805h = new i<>(new j.c());

    /* renamed from: a, reason: collision with root package name */
    private final e<JcePrimitiveT> f29806a;

    /* loaded from: classes2.dex */
    private static class b<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* renamed from: a, reason: collision with root package name */
        private final j<JcePrimitiveT> f29807a;

        private b(j<JcePrimitiveT> jVar) {
            this.f29807a = jVar;
        }

        @Override // wb.i.e
        public JcePrimitiveT a(String str) {
            Iterator<Provider> it = i.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f29807a.a(str, it.next());
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            return this.f29807a.a(str, null);
        }
    }

    /* loaded from: classes2.dex */
    private static class c<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* renamed from: a, reason: collision with root package name */
        private final j<JcePrimitiveT> f29808a;

        private c(j<JcePrimitiveT> jVar) {
            this.f29808a = jVar;
        }

        @Override // wb.i.e
        public JcePrimitiveT a(String str) {
            return this.f29808a.a(str, null);
        }
    }

    /* loaded from: classes2.dex */
    private static class d<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* renamed from: a, reason: collision with root package name */
        private final j<JcePrimitiveT> f29809a;

        private d(j<JcePrimitiveT> jVar) {
            this.f29809a = jVar;
        }

        @Override // wb.i.e
        public JcePrimitiveT a(String str) {
            Iterator<Provider> it = i.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f29809a.a(str, it.next());
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }
    }

    /* loaded from: classes2.dex */
    private interface e<JcePrimitiveT> {
        JcePrimitiveT a(String str);
    }

    public i(T_WRAPPER t_wrapper) {
        this.f29806a = ob.b.c() ? new d<>(t_wrapper) : q.b() ? new b<>(t_wrapper) : new c<>(t_wrapper);
    }

    public static List<Provider> b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public JcePrimitiveT a(String str) {
        return this.f29806a.a(str);
    }
}
