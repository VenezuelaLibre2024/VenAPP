package p419wb;

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
import p271ob.C9830b;
import p419wb.InterfaceC12138j;

/* renamed from: wb.i */
/* loaded from: classes2.dex */
public final class C12137i<T_WRAPPER extends InterfaceC12138j<JcePrimitiveT>, JcePrimitiveT> {

    /* renamed from: b */
    public static final C12137i<InterfaceC12138j.a, Cipher> f32264b = new C12137i<>(new InterfaceC12138j.a());

    /* renamed from: c */
    public static final C12137i<InterfaceC12138j.e, Mac> f32265c = new C12137i<>(new InterfaceC12138j.e());

    /* renamed from: d */
    public static final C12137i<InterfaceC12138j.g, Signature> f32266d = new C12137i<>(new InterfaceC12138j.g());

    /* renamed from: e */
    public static final C12137i<InterfaceC12138j.f, MessageDigest> f32267e = new C12137i<>(new InterfaceC12138j.f());

    /* renamed from: f */
    public static final C12137i<InterfaceC12138j.b, KeyAgreement> f32268f = new C12137i<>(new InterfaceC12138j.b());

    /* renamed from: g */
    public static final C12137i<InterfaceC12138j.d, KeyPairGenerator> f32269g = new C12137i<>(new InterfaceC12138j.d());

    /* renamed from: h */
    public static final C12137i<InterfaceC12138j.c, KeyFactory> f32270h = new C12137i<>(new InterfaceC12138j.c());

    /* renamed from: a */
    private final e<JcePrimitiveT> f32271a;

    /* renamed from: wb.i$b */
    /* loaded from: classes2.dex */
    private static class b<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* renamed from: a */
        private final InterfaceC12138j<JcePrimitiveT> f32272a;

        private b(InterfaceC12138j<JcePrimitiveT> interfaceC12138j) {
            this.f32272a = interfaceC12138j;
        }

        @Override // p419wb.C12137i.e
        /* renamed from: a */
        public JcePrimitiveT mo38889a(String str) {
            Iterator<Provider> it = C12137i.m38887b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f32272a.mo38890a(str, it.next());
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            return this.f32272a.mo38890a(str, null);
        }
    }

    /* renamed from: wb.i$c */
    /* loaded from: classes2.dex */
    private static class c<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* renamed from: a */
        private final InterfaceC12138j<JcePrimitiveT> f32273a;

        private c(InterfaceC12138j<JcePrimitiveT> interfaceC12138j) {
            this.f32273a = interfaceC12138j;
        }

        @Override // p419wb.C12137i.e
        /* renamed from: a */
        public JcePrimitiveT mo38889a(String str) {
            return this.f32273a.mo38890a(str, null);
        }
    }

    /* renamed from: wb.i$d */
    /* loaded from: classes2.dex */
    private static class d<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* renamed from: a */
        private final InterfaceC12138j<JcePrimitiveT> f32274a;

        private d(InterfaceC12138j<JcePrimitiveT> interfaceC12138j) {
            this.f32274a = interfaceC12138j;
        }

        @Override // p419wb.C12137i.e
        /* renamed from: a */
        public JcePrimitiveT mo38889a(String str) {
            Iterator<Provider> it = C12137i.m38887b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f32274a.mo38890a(str, it.next());
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }
    }

    /* renamed from: wb.i$e */
    /* loaded from: classes2.dex */
    private interface e<JcePrimitiveT> {
        /* renamed from: a */
        JcePrimitiveT mo38889a(String str);
    }

    public C12137i(T_WRAPPER t_wrapper) {
        this.f32271a = C9830b.m29501c() ? new d<>(t_wrapper) : C12145q.m38910b() ? new b<>(t_wrapper) : new c<>(t_wrapper);
    }

    /* renamed from: b */
    public static List<Provider> m38887b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public JcePrimitiveT m38888a(String str) {
        return this.f32271a.mo38889a(str);
    }
}
