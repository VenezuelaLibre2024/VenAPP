package sd;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.browser.customtabs.d;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay;
import com.google.firebase.inappmessaging.display.FiamListener;
import com.google.firebase.inappmessaging.model.MessageType;
import de.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import qd.q;
import qd.t;
import ud.c;
import ud.e;
import ud.i;
import ud.l;
import ud.m;
import ud.n;

/* loaded from: classes.dex */
public class b extends i {

    /* renamed from: a, reason: collision with root package name */
    private final q f25480a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, bk.a<l>> f25481b;

    /* renamed from: c, reason: collision with root package name */
    private final ud.e f25482c;

    /* renamed from: d, reason: collision with root package name */
    private final n f25483d;

    /* renamed from: e, reason: collision with root package name */
    private final n f25484e;

    /* renamed from: f, reason: collision with root package name */
    private final ud.g f25485f;

    /* renamed from: r, reason: collision with root package name */
    private final ud.a f25486r;

    /* renamed from: s, reason: collision with root package name */
    private final Application f25487s;

    /* renamed from: t, reason: collision with root package name */
    private final ud.c f25488t;

    /* renamed from: u, reason: collision with root package name */
    private FiamListener f25489u;

    /* renamed from: v, reason: collision with root package name */
    private de.i f25490v;

    /* renamed from: w, reason: collision with root package name */
    private t f25491w;

    /* renamed from: x, reason: collision with root package name */
    String f25492x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f25493a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ vd.c f25494b;

        a(Activity activity, vd.c cVar) {
            this.f25493a = activity;
            this.f25494b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.w(this.f25493a, this.f25494b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sd.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC0425b implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f25496a;

        ViewOnClickListenerC0425b(Activity activity) {
            this.f25496a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (b.this.f25491w != null) {
                b.this.f25491w.b(t.a.CLICK);
            }
            b.this.s(this.f25496a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ de.a f25498a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f25499b;

        c(de.a aVar, Activity activity) {
            this.f25498a = aVar;
            this.f25499b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (b.this.f25491w != null) {
                m.f("Calling callback for click action");
                b.this.f25491w.a(this.f25498a);
            }
            b.this.A(this.f25499b, Uri.parse(this.f25498a.b()));
            b.this.C();
            b.this.F(this.f25499b);
            b.this.f25490v = null;
            b.this.f25491w = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends e.a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ vd.c f25501e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Activity f25502f;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f25503r;

        /* loaded from: classes.dex */
        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 4) {
                    return false;
                }
                if (b.this.f25491w != null) {
                    b.this.f25491w.b(t.a.UNKNOWN_DISMISS_TYPE);
                }
                d dVar = d.this;
                b.this.s(dVar.f25502f);
                return true;
            }
        }

        /* renamed from: sd.b$d$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0426b implements n.b {
            C0426b() {
            }

            @Override // ud.n.b
            public void a() {
                if (b.this.f25490v == null || b.this.f25491w == null) {
                    return;
                }
                m.f("Impression timer onFinish for: " + b.this.f25490v.a().a());
                b.this.f25491w.d();
            }
        }

        /* loaded from: classes.dex */
        class c implements n.b {
            c() {
            }

            @Override // ud.n.b
            public void a() {
                if (b.this.f25490v != null && b.this.f25491w != null) {
                    b.this.f25491w.b(t.a.AUTO);
                }
                d dVar = d.this;
                b.this.s(dVar.f25502f);
            }
        }

        /* renamed from: sd.b$d$d, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0427d implements Runnable {
            RunnableC0427d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ud.g gVar = b.this.f25485f;
                d dVar = d.this;
                gVar.i(dVar.f25501e, dVar.f25502f);
                if (d.this.f25501e.b().n().booleanValue()) {
                    b.this.f25488t.a(b.this.f25487s, d.this.f25501e.f(), c.EnumC0447c.TOP);
                }
            }
        }

        d(vd.c cVar, Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            this.f25501e = cVar;
            this.f25502f = activity;
            this.f25503r = onGlobalLayoutListener;
        }

        @Override // ud.e.a
        public void c(Exception exc) {
            m.e("Image download failure ");
            if (this.f25503r != null) {
                this.f25501e.e().getViewTreeObserver().removeGlobalOnLayoutListener(this.f25503r);
            }
            b.this.r();
            b.this.f25490v = null;
            b.this.f25491w = null;
        }

        @Override // ud.e.a
        public void k() {
            if (!this.f25501e.b().p().booleanValue()) {
                this.f25501e.f().setOnTouchListener(new a());
            }
            b.this.f25483d.b(new C0426b(), 5000L, 1000L);
            if (this.f25501e.b().o().booleanValue()) {
                b.this.f25484e.b(new c(), 20000L, 1000L);
            }
            this.f25502f.runOnUiThread(new RunnableC0427d());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25509a;

        static {
            int[] iArr = new int[MessageType.values().length];
            f25509a = iArr;
            try {
                iArr[MessageType.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25509a[MessageType.MODAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25509a[MessageType.IMAGE_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25509a[MessageType.CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(q qVar, Map<String, bk.a<l>> map, ud.e eVar, n nVar, n nVar2, ud.g gVar, Application application, ud.a aVar, ud.c cVar) {
        this.f25480a = qVar;
        this.f25481b = map;
        this.f25482c = eVar;
        this.f25483d = nVar;
        this.f25484e = nVar2;
        this.f25485f = gVar;
        this.f25487s = application;
        this.f25486r = aVar;
        this.f25488t = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(Activity activity, Uri uri) {
        if (y(uri) && H(activity)) {
            androidx.browser.customtabs.d b10 = new d.b().b();
            Intent intent = b10.f1766a;
            intent.addFlags(1073741824);
            intent.addFlags(268435456);
            b10.b(activity, uri);
            return;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW", uri);
        ResolveInfo resolveActivity = activity.getPackageManager().resolveActivity(intent2, 0);
        intent2.addFlags(1073741824);
        intent2.addFlags(268435456);
        if (resolveActivity != null) {
            activity.startActivity(intent2);
        } else {
            m.e("Device cannot resolve intent for: android.intent.action.VIEW");
        }
    }

    private void B(Activity activity, vd.c cVar, de.g gVar, e.a aVar) {
        if (x(gVar)) {
            this.f25482c.c(gVar.b()).d(activity.getClass()).c(sd.e.f25520a).b(cVar.e(), aVar);
        } else {
            aVar.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        FiamListener fiamListener = this.f25489u;
        if (fiamListener != null) {
            fiamListener.onFiamClick();
        }
    }

    private void D() {
        FiamListener fiamListener = this.f25489u;
        if (fiamListener != null) {
            fiamListener.onFiamDismiss();
        }
    }

    private void E() {
        FiamListener fiamListener = this.f25489u;
        if (fiamListener != null) {
            fiamListener.onFiamTrigger();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(Activity activity) {
        if (this.f25485f.h()) {
            this.f25482c.b(activity.getClass());
            this.f25485f.a(activity);
            r();
        }
    }

    private void G(Activity activity) {
        vd.c a10;
        if (this.f25490v == null || this.f25480a.c()) {
            m.e("No active message found to render");
            return;
        }
        if (this.f25490v.c().equals(MessageType.UNSUPPORTED)) {
            m.e("The message being triggered is not supported by this version of the sdk.");
            return;
        }
        E();
        l lVar = this.f25481b.get(xd.g.a(this.f25490v.c(), v(this.f25487s))).get();
        int i10 = e.f25509a[this.f25490v.c().ordinal()];
        if (i10 == 1) {
            a10 = this.f25486r.a(lVar, this.f25490v);
        } else if (i10 == 2) {
            a10 = this.f25486r.d(lVar, this.f25490v);
        } else if (i10 == 3) {
            a10 = this.f25486r.c(lVar, this.f25490v);
        } else {
            if (i10 != 4) {
                m.e("No bindings found for this message type");
                return;
            }
            a10 = this.f25486r.b(lVar, this.f25490v);
        }
        activity.findViewById(R.id.content).post(new a(activity, a10));
    }

    private boolean H(Activity activity) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        intent.setPackage("com.android.chrome");
        List<ResolveInfo> queryIntentServices = activity.getPackageManager().queryIntentServices(intent, 0);
        return (queryIntentServices == null || queryIntentServices.isEmpty()) ? false : true;
    }

    private void I(Activity activity) {
        String str = this.f25492x;
        if (str == null || !str.equals(activity.getLocalClassName())) {
            return;
        }
        m.f("Unbinding from activity: " + activity.getLocalClassName());
        this.f25480a.d();
        F(activity);
        this.f25492x = null;
    }

    private void q(final Activity activity) {
        String str = this.f25492x;
        if (str == null || !str.equals(activity.getLocalClassName())) {
            m.f("Binding to activity: " + activity.getLocalClassName());
            this.f25480a.i(new FirebaseInAppMessagingDisplay() { // from class: sd.a
                @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay
                public final void displayMessage(de.i iVar, t tVar) {
                    b.this.z(activity, iVar, tVar);
                }
            });
            this.f25492x = activity.getLocalClassName();
        }
        if (this.f25490v != null) {
            G(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        this.f25483d.a();
        this.f25484e.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(Activity activity) {
        m.a("Dismissing fiam");
        D();
        F(activity);
        this.f25490v = null;
        this.f25491w = null;
    }

    private List<de.a> t(de.i iVar) {
        de.a e10;
        ArrayList arrayList = new ArrayList();
        int i10 = e.f25509a[iVar.c().ordinal()];
        if (i10 == 1) {
            e10 = ((de.c) iVar).e();
        } else if (i10 == 2) {
            e10 = ((j) iVar).e();
        } else if (i10 == 3) {
            e10 = ((de.h) iVar).e();
        } else if (i10 != 4) {
            e10 = de.a.a().a();
        } else {
            de.f fVar = (de.f) iVar;
            arrayList.add(fVar.i());
            e10 = fVar.j();
        }
        arrayList.add(e10);
        return arrayList;
    }

    private de.g u(de.i iVar) {
        if (iVar.c() != MessageType.CARD) {
            return iVar.b();
        }
        de.f fVar = (de.f) iVar;
        de.g h10 = fVar.h();
        de.g g10 = fVar.g();
        return v(this.f25487s) == 1 ? x(h10) ? h10 : g10 : x(g10) ? g10 : h10;
    }

    private static int v(Application application) {
        return application.getResources().getConfiguration().orientation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(Activity activity, vd.c cVar) {
        View.OnClickListener onClickListener;
        if (this.f25490v == null) {
            return;
        }
        ViewOnClickListenerC0425b viewOnClickListenerC0425b = new ViewOnClickListenerC0425b(activity);
        HashMap hashMap = new HashMap();
        for (de.a aVar : t(this.f25490v)) {
            if (aVar == null || TextUtils.isEmpty(aVar.b())) {
                m.f("No action url found for action. Treating as dismiss.");
                onClickListener = viewOnClickListenerC0425b;
            } else {
                onClickListener = new c(aVar, activity);
            }
            hashMap.put(aVar, onClickListener);
        }
        ViewTreeObserver.OnGlobalLayoutListener g10 = cVar.g(hashMap, viewOnClickListenerC0425b);
        if (g10 != null) {
            cVar.e().getViewTreeObserver().addOnGlobalLayoutListener(g10);
        }
        B(activity, cVar, u(this.f25490v), new d(cVar, activity, g10));
    }

    private boolean x(de.g gVar) {
        return (gVar == null || TextUtils.isEmpty(gVar.b())) ? false : true;
    }

    private boolean y(Uri uri) {
        String scheme;
        if (uri == null || (scheme = uri.getScheme()) == null) {
            return false;
        }
        return scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(Activity activity, de.i iVar, t tVar) {
        if (this.f25490v != null || this.f25480a.c()) {
            m.a("Active FIAM exists. Skipping trigger");
            return;
        }
        this.f25490v = iVar;
        this.f25491w = tVar;
        G(activity);
    }

    @Override // ud.i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        I(activity);
        this.f25480a.g();
        super.onActivityPaused(activity);
    }

    @Override // ud.i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        q(activity);
    }
}
