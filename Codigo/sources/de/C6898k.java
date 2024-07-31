package de;

import android.text.TextUtils;
import com.google.firebase.inappmessaging.model.MessageType;
import de.C6888a;
import de.C6890c;
import de.C6891d;
import de.C6893f;
import de.C6895h;
import de.C6897j;
import de.C6901n;
import java.util.Map;
import p082eb.C7159o;
import p311qd.C10434a0;
import p311qd.C10436b0;
import p311qd.C10438c0;
import p311qd.C10440d0;
import p311qd.C10442e0;
import p311qd.C10444f0;
import p311qd.C10446g0;
import p311qd.C10466z;
import p487zd.C12940l2;

/* renamed from: de.k */
/* loaded from: classes.dex */
public class C6898k {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: de.k$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC6896i {
        a(C6892e c6892e, MessageType messageType, Map map) {
            super(c6892e, messageType, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: de.k$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f15303a;

        static {
            int[] iArr = new int[C10440d0.b.values().length];
            f15303a = iArr;
            try {
                iArr[C10440d0.b.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15303a[C10440d0.b.IMAGE_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15303a[C10440d0.b.MODAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15303a[C10440d0.b.CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    private static C6888a.b m19942a(C10466z c10466z) {
        C6888a.b m19870a = C6888a.m19870a();
        if (!TextUtils.isEmpty(c10466z.m31389b0())) {
            m19870a.m19874b(c10466z.m31389b0());
        }
        return m19870a;
    }

    /* renamed from: b */
    private static C6888a m19943b(C10466z c10466z, C10436b0 c10436b0) {
        C6888a.b m19942a = m19942a(c10466z);
        if (!c10436b0.equals(C10436b0.m31286d0())) {
            C6891d.b m19895a = C6891d.m19895a();
            if (!TextUtils.isEmpty(c10436b0.m31287b0())) {
                m19895a.m19899b(c10436b0.m31287b0());
            }
            if (c10436b0.m31289f0()) {
                C6901n.b m19955a = C6901n.m19955a();
                C10446g0 m31288e0 = c10436b0.m31288e0();
                if (!TextUtils.isEmpty(m31288e0.m31343e0())) {
                    m19955a.m19960c(m31288e0.m31343e0());
                }
                if (!TextUtils.isEmpty(m31288e0.m31342d0())) {
                    m19955a.m19959b(m31288e0.m31342d0());
                }
                m19895a.m19900c(m19955a.m19958a());
            }
            m19942a.m19875c(m19895a.m19898a());
        }
        return m19942a.m19873a();
    }

    /* renamed from: c */
    public static AbstractC6896i m19944c(C10440d0 c10440d0, String str, String str2, boolean z10, Map<String, String> map) {
        C7159o.m21313p(c10440d0, "FirebaseInAppMessaging content cannot be null.");
        C7159o.m21313p(str, "FirebaseInAppMessaging campaign id cannot be null.");
        C7159o.m21313p(str2, "FirebaseInAppMessaging campaign name cannot be null.");
        C12940l2.m42840a("Decoding message: " + c10440d0.toString());
        C6892e c6892e = new C6892e(str, str2, z10);
        int i10 = b.f15303a[c10440d0.m31315g0().ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? new a(new C6892e(str, str2, z10), MessageType.UNSUPPORTED, map) : m19947f(c10440d0.m31313d0()).m19912a(c6892e, map) : m19949h(c10440d0.m31316h0()).m19936a(c6892e, map) : m19948g(c10440d0.m31314f0()).m19926a(c6892e, map) : m19946e(c10440d0.m31312b0()).m19889a(c6892e, map);
    }

    /* renamed from: d */
    private static C6901n m19945d(C10446g0 c10446g0) {
        C6901n.b m19955a = C6901n.m19955a();
        if (!TextUtils.isEmpty(c10446g0.m31342d0())) {
            m19955a.m19959b(c10446g0.m31342d0());
        }
        if (!TextUtils.isEmpty(c10446g0.m31343e0())) {
            m19955a.m19960c(c10446g0.m31343e0());
        }
        return m19955a.m19958a();
    }

    /* renamed from: e */
    private static C6890c.b m19946e(C10434a0 c10434a0) {
        C6890c.b m19883d = C6890c.m19883d();
        if (!TextUtils.isEmpty(c10434a0.m31270d0())) {
            m19883d.m19891c(c10434a0.m31270d0());
        }
        if (!TextUtils.isEmpty(c10434a0.m31272g0())) {
            m19883d.m19893e(C6894g.m19920a().m19923b(c10434a0.m31272g0()).m19922a());
        }
        if (c10434a0.m31274i0()) {
            m19883d.m19890b(m19942a(c10434a0.m31269b0()).m19873a());
        }
        if (c10434a0.m31275j0()) {
            m19883d.m19892d(m19945d(c10434a0.m31271e0()));
        }
        if (c10434a0.m31276k0()) {
            m19883d.m19894f(m19945d(c10434a0.m31273h0()));
        }
        return m19883d;
    }

    /* renamed from: f */
    private static C6893f.b m19947f(C10438c0 c10438c0) {
        C6893f.b m19904d = C6893f.m19904d();
        if (c10438c0.m31306r0()) {
            m19904d.m19919h(m19945d(c10438c0.m31300l0()));
        }
        if (c10438c0.m31301m0()) {
            m19904d.m19914c(m19945d(c10438c0.m31293d0()));
        }
        if (!TextUtils.isEmpty(c10438c0.m31292b0())) {
            m19904d.m19913b(c10438c0.m31292b0());
        }
        if (c10438c0.m31302n0() || c10438c0.m31303o0()) {
            m19904d.m19917f(m19943b(c10438c0.m31296h0(), c10438c0.m31297i0()));
        }
        if (c10438c0.m31304p0() || c10438c0.m31305q0()) {
            m19904d.m19918g(m19943b(c10438c0.m31298j0(), c10438c0.m31299k0()));
        }
        if (!TextUtils.isEmpty(c10438c0.m31295g0())) {
            m19904d.m19916e(C6894g.m19920a().m19923b(c10438c0.m31295g0()).m19922a());
        }
        if (!TextUtils.isEmpty(c10438c0.m31294f0())) {
            m19904d.m19915d(C6894g.m19920a().m19923b(c10438c0.m31294f0()).m19922a());
        }
        return m19904d;
    }

    /* renamed from: g */
    private static C6895h.b m19948g(C10442e0 c10442e0) {
        C6895h.b m19924d = C6895h.m19924d();
        if (!TextUtils.isEmpty(c10442e0.m31324e0())) {
            m19924d.m19928c(C6894g.m19920a().m19923b(c10442e0.m31324e0()).m19922a());
        }
        if (c10442e0.m31325f0()) {
            m19924d.m19927b(m19942a(c10442e0.m31323b0()).m19873a());
        }
        return m19924d;
    }

    /* renamed from: h */
    private static C6897j.b m19949h(C10444f0 c10444f0) {
        C6897j.b m19931d = C6897j.m19931d();
        if (!TextUtils.isEmpty(c10444f0.m31332e0())) {
            m19931d.m19938c(c10444f0.m31332e0());
        }
        if (!TextUtils.isEmpty(c10444f0.m31334h0())) {
            m19931d.m19940e(C6894g.m19920a().m19923b(c10444f0.m31334h0()).m19922a());
        }
        if (c10444f0.m31336j0()) {
            m19931d.m19937b(m19943b(c10444f0.m31330b0(), c10444f0.m31331d0()));
        }
        if (c10444f0.m31337k0()) {
            m19931d.m19939d(m19945d(c10444f0.m31333f0()));
        }
        if (c10444f0.m31338l0()) {
            m19931d.m19941f(m19945d(c10444f0.m31335i0()));
        }
        return m19931d;
    }
}
