package bd;

import android.content.Context;
import cd.InterfaceC1952i;
import com.google.android.datatransport.cct.C4702a;
import com.google.android.gms.tasks.Task;
import java.nio.charset.Charset;
import p098f6.C7298b;
import p098f6.InterfaceC7301e;
import p098f6.InterfaceC7303g;
import p132h6.C7651u;
import p442xc.AbstractC12426f0;
import p465yc.C12670j;
import vc.AbstractC11863u;
import vc.C11836g0;

/* renamed from: bd.b */
/* loaded from: classes.dex */
public class C1723b {

    /* renamed from: c */
    private static final C12670j f7318c = new C12670j();

    /* renamed from: d */
    private static final String f7319d = m9333e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: e */
    private static final String f7320e = m9333e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: f */
    private static final InterfaceC7301e<AbstractC12426f0, byte[]> f7321f = new InterfaceC7301e() { // from class: bd.a
        @Override // p098f6.InterfaceC7301e
        public final Object apply(Object obj) {
            byte[] m9332d;
            m9332d = C1723b.m9332d((AbstractC12426f0) obj);
            return m9332d;
        }
    };

    /* renamed from: a */
    private final C1726e f7322a;

    /* renamed from: b */
    private final InterfaceC7301e<AbstractC12426f0, byte[]> f7323b;

    C1723b(C1726e c1726e, InterfaceC7301e<AbstractC12426f0, byte[]> interfaceC7301e) {
        this.f7322a = c1726e;
        this.f7323b = interfaceC7301e;
    }

    /* renamed from: b */
    public static C1723b m9331b(Context context, InterfaceC1952i interfaceC1952i, C11836g0 c11836g0) {
        C7651u.m23235f(context);
        InterfaceC7303g m23237g = C7651u.m23233c().m23237g(new C4702a(f7319d, f7320e));
        C7298b m21878b = C7298b.m21878b("json");
        InterfaceC7301e<AbstractC12426f0, byte[]> interfaceC7301e = f7321f;
        return new C1723b(new C1726e(m23237g.mo21886b("FIREBASE_CRASHLYTICS_REPORT", AbstractC12426f0.class, m21878b, interfaceC7301e), interfaceC1952i.mo10188b(), c11836g0), interfaceC7301e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ byte[] m9332d(AbstractC12426f0 abstractC12426f0) {
        return f7318c.m41692M(abstractC12426f0).getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: e */
    private static String m9333e(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }

    /* renamed from: c */
    public Task<AbstractC11863u> m9334c(AbstractC11863u abstractC11863u, boolean z10) {
        return this.f7322a.m9351i(abstractC11863u, z10).getTask();
    }
}
