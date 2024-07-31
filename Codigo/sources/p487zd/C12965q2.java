package p487zd;

import android.os.Bundle;
import cc.InterfaceC1940a;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.inappmessaging.model.MessageType;
import de.AbstractC6896i;
import de.C6888a;
import de.C6890c;
import de.C6893f;
import de.C6895h;
import de.C6897j;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p043ce.InterfaceC1956a;
import p063dc.InterfaceC6880b;
import p106fe.InterfaceC7337f;
import p311qd.C10433a;
import p311qd.C10435b;
import p311qd.EnumC10448h0;
import p311qd.EnumC10449i;
import p311qd.EnumC10450j;
import p311qd.InterfaceC10460t;
import p485zb.C12867g;

/* renamed from: zd.q2 */
/* loaded from: classes.dex */
public class C12965q2 {

    /* renamed from: h */
    private static final Map<InterfaceC10460t.b, EnumC10448h0> f35263h;

    /* renamed from: i */
    private static final Map<InterfaceC10460t.a, EnumC10449i> f35264i;

    /* renamed from: a */
    private final b f35265a;

    /* renamed from: b */
    private final C12867g f35266b;

    /* renamed from: c */
    private final InterfaceC7337f f35267c;

    /* renamed from: d */
    private final InterfaceC1956a f35268d;

    /* renamed from: e */
    private final InterfaceC1940a f35269e;

    /* renamed from: f */
    private final C12972s f35270f;

    /* renamed from: g */
    @InterfaceC6880b
    private final Executor f35271g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zd.q2$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35272a;

        static {
            int[] iArr = new int[MessageType.values().length];
            f35272a = iArr;
            try {
                iArr[MessageType.CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35272a[MessageType.MODAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35272a[MessageType.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35272a[MessageType.IMAGE_ONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: zd.q2$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo9464a(byte[] bArr);
    }

    static {
        HashMap hashMap = new HashMap();
        f35263h = hashMap;
        HashMap hashMap2 = new HashMap();
        f35264i = hashMap2;
        hashMap.put(InterfaceC10460t.b.UNSPECIFIED_RENDER_ERROR, EnumC10448h0.UNSPECIFIED_RENDER_ERROR);
        hashMap.put(InterfaceC10460t.b.IMAGE_FETCH_ERROR, EnumC10448h0.IMAGE_FETCH_ERROR);
        hashMap.put(InterfaceC10460t.b.IMAGE_DISPLAY_ERROR, EnumC10448h0.IMAGE_DISPLAY_ERROR);
        hashMap.put(InterfaceC10460t.b.IMAGE_UNSUPPORTED_FORMAT, EnumC10448h0.IMAGE_UNSUPPORTED_FORMAT);
        hashMap2.put(InterfaceC10460t.a.AUTO, EnumC10449i.AUTO);
        hashMap2.put(InterfaceC10460t.a.CLICK, EnumC10449i.CLICK);
        hashMap2.put(InterfaceC10460t.a.SWIPE, EnumC10449i.SWIPE);
        hashMap2.put(InterfaceC10460t.a.UNKNOWN_DISMISS_TYPE, EnumC10449i.UNKNOWN_DISMISS_TYPE);
    }

    public C12965q2(b bVar, InterfaceC1940a interfaceC1940a, C12867g c12867g, InterfaceC7337f interfaceC7337f, InterfaceC1956a interfaceC1956a, C12972s c12972s, @InterfaceC6880b Executor executor) {
        this.f35265a = bVar;
        this.f35269e = interfaceC1940a;
        this.f35266b = c12867g;
        this.f35267c = interfaceC7337f;
        this.f35268d = interfaceC1956a;
        this.f35270f = c12972s;
        this.f35271g = executor;
    }

    /* renamed from: f */
    private C10433a.b m42890f(AbstractC6896i abstractC6896i, String str) {
        return C10433a.m31250k0().m31264N("20.4.0").m31265O(this.f35266b.m42632r().m42647f()).m31259I(abstractC6896i.m19929a().m19901a()).m31260J(C10435b.m31280e0().m31284J(this.f35266b.m42632r().m42644c()).m31283I(str)).m31261K(this.f35268d.mo10198a());
    }

    /* renamed from: g */
    private C10433a m42891g(AbstractC6896i abstractC6896i, String str, EnumC10449i enumC10449i) {
        return m42890f(abstractC6896i, str).m31262L(enumC10449i).build();
    }

    /* renamed from: h */
    private C10433a m42892h(AbstractC6896i abstractC6896i, String str, EnumC10450j enumC10450j) {
        return m42890f(abstractC6896i, str).m31263M(enumC10450j).build();
    }

    /* renamed from: i */
    private C10433a m42893i(AbstractC6896i abstractC6896i, String str, EnumC10448h0 enumC10448h0) {
        return m42890f(abstractC6896i, str).m31266P(enumC10448h0).build();
    }

    /* renamed from: j */
    private boolean m42894j(AbstractC6896i abstractC6896i) {
        int i10 = a.f35272a[abstractC6896i.m19930c().ordinal()];
        if (i10 == 1) {
            C6893f c6893f = (C6893f) abstractC6896i;
            return (m42896l(c6893f.m19909i()) ^ true) && (m42896l(c6893f.m19910j()) ^ true);
        }
        if (i10 == 2) {
            return !m42896l(((C6897j) abstractC6896i).m19932e());
        }
        if (i10 == 3) {
            return !m42896l(((C6890c) abstractC6896i).m19885e());
        }
        if (i10 == 4) {
            return !m42896l(((C6895h) abstractC6896i).m19925e());
        }
        C12940l2.m42841b("Unable to determine if impression should be counted as conversion.");
        return false;
    }

    /* renamed from: k */
    private boolean m42895k(AbstractC6896i abstractC6896i) {
        return abstractC6896i.m19929a().m19903c();
    }

    /* renamed from: l */
    private boolean m42896l(C6888a c6888a) {
        return (c6888a == null || c6888a.m19871b() == null || c6888a.m19871b().isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m42897m(AbstractC6896i abstractC6896i, InterfaceC10460t.a aVar, String str) {
        this.f35265a.mo9464a(m42891g(abstractC6896i, str, f35264i.get(aVar)).mo18375h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m42898n(AbstractC6896i abstractC6896i, String str) {
        this.f35265a.mo9464a(m42892h(abstractC6896i, str, EnumC10450j.IMPRESSION_EVENT_TYPE).mo18375h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m42899o(AbstractC6896i abstractC6896i, String str) {
        this.f35265a.mo9464a(m42892h(abstractC6896i, str, EnumC10450j.CLICK_EVENT_TYPE).mo18375h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m42900p(AbstractC6896i abstractC6896i, InterfaceC10460t.b bVar, String str) {
        this.f35265a.mo9464a(m42893i(abstractC6896i, str, f35263h.get(bVar)).mo18375h());
    }

    /* renamed from: r */
    private void m42901r(AbstractC6896i abstractC6896i, String str, boolean z10) {
        String m19901a = abstractC6896i.m19929a().m19901a();
        Bundle m42902e = m42902e(abstractC6896i.m19929a().m19902b(), m19901a);
        C12940l2.m42840a("Sending event=" + str + " params=" + m42902e);
        InterfaceC1940a interfaceC1940a = this.f35269e;
        if (interfaceC1940a == null) {
            C12940l2.m42843d("Unable to log event: analytics library is missing");
            return;
        }
        interfaceC1940a.mo10146a("fiam", str, m42902e);
        if (z10) {
            this.f35269e.mo10148c("fiam", "_ln", "fiam:" + m19901a);
        }
    }

    /* renamed from: e */
    Bundle m42902e(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("_nmid", str2);
        bundle.putString("_nmn", str);
        try {
            bundle.putInt("_ndt", (int) (this.f35268d.mo10198a() / 1000));
        } catch (NumberFormatException e10) {
            C12940l2.m42843d("Error while parsing use_device_time in FIAM event: " + e10.getMessage());
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m42903q(final AbstractC6896i abstractC6896i, final InterfaceC10460t.a aVar) {
        if (!m42895k(abstractC6896i)) {
            this.f35267c.getId().addOnSuccessListener(this.f35271g, new OnSuccessListener() { // from class: zd.o2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    C12965q2.this.m42897m(abstractC6896i, aVar, (String) obj);
                }
            });
            m42901r(abstractC6896i, "fiam_dismiss", false);
        }
        this.f35270f.m42935l(abstractC6896i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m42904s(final AbstractC6896i abstractC6896i) {
        if (!m42895k(abstractC6896i)) {
            this.f35267c.getId().addOnSuccessListener(this.f35271g, new OnSuccessListener() { // from class: zd.m2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    C12965q2.this.m42898n(abstractC6896i, (String) obj);
                }
            });
            m42901r(abstractC6896i, "fiam_impression", m42894j(abstractC6896i));
        }
        this.f35270f.m42933f(abstractC6896i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m42905t(final AbstractC6896i abstractC6896i, C6888a c6888a) {
        if (!m42895k(abstractC6896i)) {
            this.f35267c.getId().addOnSuccessListener(this.f35271g, new OnSuccessListener() { // from class: zd.n2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    C12965q2.this.m42899o(abstractC6896i, (String) obj);
                }
            });
            m42901r(abstractC6896i, "fiam_action", true);
        }
        this.f35270f.m42934k(abstractC6896i, c6888a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m42906u(final AbstractC6896i abstractC6896i, final InterfaceC10460t.b bVar) {
        if (!m42895k(abstractC6896i)) {
            this.f35267c.getId().addOnSuccessListener(this.f35271g, new OnSuccessListener() { // from class: zd.p2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    C12965q2.this.m42900p(abstractC6896i, bVar, (String) obj);
                }
            });
        }
        this.f35270f.m42932e(abstractC6896i, bVar);
    }
}
