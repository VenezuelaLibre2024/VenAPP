package zd;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import qd.a;
import qd.t;

/* loaded from: classes.dex */
public class q2 {

    /* renamed from: h, reason: collision with root package name */
    private static final Map<t.b, qd.h0> f32712h;

    /* renamed from: i, reason: collision with root package name */
    private static final Map<t.a, qd.i> f32713i;

    /* renamed from: a, reason: collision with root package name */
    private final b f32714a;

    /* renamed from: b, reason: collision with root package name */
    private final zb.g f32715b;

    /* renamed from: c, reason: collision with root package name */
    private final fe.f f32716c;

    /* renamed from: d, reason: collision with root package name */
    private final ce.a f32717d;

    /* renamed from: e, reason: collision with root package name */
    private final cc.a f32718e;

    /* renamed from: f, reason: collision with root package name */
    private final s f32719f;

    /* renamed from: g, reason: collision with root package name */
    @dc.b
    private final Executor f32720g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f32721a;

        static {
            int[] iArr = new int[MessageType.values().length];
            f32721a = iArr;
            try {
                iArr[MessageType.CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32721a[MessageType.MODAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32721a[MessageType.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32721a[MessageType.IMAGE_ONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(byte[] bArr);
    }

    static {
        HashMap hashMap = new HashMap();
        f32712h = hashMap;
        HashMap hashMap2 = new HashMap();
        f32713i = hashMap2;
        hashMap.put(t.b.UNSPECIFIED_RENDER_ERROR, qd.h0.UNSPECIFIED_RENDER_ERROR);
        hashMap.put(t.b.IMAGE_FETCH_ERROR, qd.h0.IMAGE_FETCH_ERROR);
        hashMap.put(t.b.IMAGE_DISPLAY_ERROR, qd.h0.IMAGE_DISPLAY_ERROR);
        hashMap.put(t.b.IMAGE_UNSUPPORTED_FORMAT, qd.h0.IMAGE_UNSUPPORTED_FORMAT);
        hashMap2.put(t.a.AUTO, qd.i.AUTO);
        hashMap2.put(t.a.CLICK, qd.i.CLICK);
        hashMap2.put(t.a.SWIPE, qd.i.SWIPE);
        hashMap2.put(t.a.UNKNOWN_DISMISS_TYPE, qd.i.UNKNOWN_DISMISS_TYPE);
    }

    public q2(b bVar, cc.a aVar, zb.g gVar, fe.f fVar, ce.a aVar2, s sVar, @dc.b Executor executor) {
        this.f32714a = bVar;
        this.f32718e = aVar;
        this.f32715b = gVar;
        this.f32716c = fVar;
        this.f32717d = aVar2;
        this.f32719f = sVar;
        this.f32720g = executor;
    }

    private a.b f(de.i iVar, String str) {
        return qd.a.k0().N("20.4.0").O(this.f32715b.r().f()).I(iVar.a().a()).J(qd.b.e0().J(this.f32715b.r().c()).I(str)).K(this.f32717d.a());
    }

    private qd.a g(de.i iVar, String str, qd.i iVar2) {
        return f(iVar, str).L(iVar2).build();
    }

    private qd.a h(de.i iVar, String str, qd.j jVar) {
        return f(iVar, str).M(jVar).build();
    }

    private qd.a i(de.i iVar, String str, qd.h0 h0Var) {
        return f(iVar, str).P(h0Var).build();
    }

    private boolean j(de.i iVar) {
        int i10 = a.f32721a[iVar.c().ordinal()];
        if (i10 == 1) {
            de.f fVar = (de.f) iVar;
            return (l(fVar.i()) ^ true) && (l(fVar.j()) ^ true);
        }
        if (i10 == 2) {
            return !l(((de.j) iVar).e());
        }
        if (i10 == 3) {
            return !l(((de.c) iVar).e());
        }
        if (i10 == 4) {
            return !l(((de.h) iVar).e());
        }
        l2.b("Unable to determine if impression should be counted as conversion.");
        return false;
    }

    private boolean k(de.i iVar) {
        return iVar.a().c();
    }

    private boolean l(de.a aVar) {
        return (aVar == null || aVar.b() == null || aVar.b().isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(de.i iVar, t.a aVar, String str) {
        this.f32714a.a(g(iVar, str, f32713i.get(aVar)).h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(de.i iVar, String str) {
        this.f32714a.a(h(iVar, str, qd.j.IMPRESSION_EVENT_TYPE).h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(de.i iVar, String str) {
        this.f32714a.a(h(iVar, str, qd.j.CLICK_EVENT_TYPE).h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(de.i iVar, t.b bVar, String str) {
        this.f32714a.a(i(iVar, str, f32712h.get(bVar)).h());
    }

    private void r(de.i iVar, String str, boolean z10) {
        String a10 = iVar.a().a();
        Bundle e10 = e(iVar.a().b(), a10);
        l2.a("Sending event=" + str + " params=" + e10);
        cc.a aVar = this.f32718e;
        if (aVar == null) {
            l2.d("Unable to log event: analytics library is missing");
            return;
        }
        aVar.a("fiam", str, e10);
        if (z10) {
            this.f32718e.c("fiam", "_ln", "fiam:" + a10);
        }
    }

    Bundle e(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("_nmid", str2);
        bundle.putString("_nmn", str);
        try {
            bundle.putInt("_ndt", (int) (this.f32717d.a() / 1000));
        } catch (NumberFormatException e10) {
            l2.d("Error while parsing use_device_time in FIAM event: " + e10.getMessage());
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(final de.i iVar, final t.a aVar) {
        if (!k(iVar)) {
            this.f32716c.getId().addOnSuccessListener(this.f32720g, new OnSuccessListener() { // from class: zd.o2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    q2.this.m(iVar, aVar, (String) obj);
                }
            });
            r(iVar, "fiam_dismiss", false);
        }
        this.f32719f.l(iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(final de.i iVar) {
        if (!k(iVar)) {
            this.f32716c.getId().addOnSuccessListener(this.f32720g, new OnSuccessListener() { // from class: zd.m2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    q2.this.n(iVar, (String) obj);
                }
            });
            r(iVar, "fiam_impression", j(iVar));
        }
        this.f32719f.f(iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(final de.i iVar, de.a aVar) {
        if (!k(iVar)) {
            this.f32716c.getId().addOnSuccessListener(this.f32720g, new OnSuccessListener() { // from class: zd.n2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    q2.this.o(iVar, (String) obj);
                }
            });
            r(iVar, "fiam_action", true);
        }
        this.f32719f.k(iVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(final de.i iVar, final t.b bVar) {
        if (!k(iVar)) {
            this.f32716c.getId().addOnSuccessListener(this.f32720g, new OnSuccessListener() { // from class: zd.p2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    q2.this.p(iVar, bVar, (String) obj);
                }
            });
        }
        this.f32719f.e(iVar, bVar);
    }
}
