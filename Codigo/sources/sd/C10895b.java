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
import androidx.browser.customtabs.C0394d;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay;
import com.google.firebase.inappmessaging.display.FiamListener;
import com.google.firebase.inappmessaging.model.MessageType;
import de.AbstractC6896i;
import de.C6888a;
import de.C6890c;
import de.C6893f;
import de.C6894g;
import de.C6895h;
import de.C6897j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p029bk.InterfaceC1806a;
import p311qd.C10457q;
import p311qd.InterfaceC10460t;
import p382ud.C11532a;
import p382ud.C11534c;
import p382ud.C11536e;
import p382ud.C11538g;
import p382ud.C11540i;
import p382ud.C11543l;
import p382ud.C11544m;
import p382ud.C11545n;
import p401vd.AbstractC11875c;
import p443xd.C12454g;

/* renamed from: sd.b */
/* loaded from: classes.dex */
public class C10895b extends C11540i {

    /* renamed from: a */
    private final C10457q f27599a;

    /* renamed from: b */
    private final Map<String, InterfaceC1806a<C11543l>> f27600b;

    /* renamed from: c */
    private final C11536e f27601c;

    /* renamed from: d */
    private final C11545n f27602d;

    /* renamed from: e */
    private final C11545n f27603e;

    /* renamed from: f */
    private final C11538g f27604f;

    /* renamed from: r */
    private final C11532a f27605r;

    /* renamed from: s */
    private final Application f27606s;

    /* renamed from: t */
    private final C11534c f27607t;

    /* renamed from: u */
    private FiamListener f27608u;

    /* renamed from: v */
    private AbstractC6896i f27609v;

    /* renamed from: w */
    private InterfaceC10460t f27610w;

    /* renamed from: x */
    String f27611x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sd.b$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f27612a;

        /* renamed from: b */
        final /* synthetic */ AbstractC11875c f27613b;

        a(Activity activity, AbstractC11875c abstractC11875c) {
            this.f27612a = activity;
            this.f27613b = abstractC11875c;
        }

        @Override // java.lang.Runnable
        public void run() {
            C10895b.this.m33267w(this.f27612a, this.f27613b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sd.b$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f27615a;

        b(Activity activity) {
            this.f27615a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C10895b.this.f27610w != null) {
                C10895b.this.f27610w.mo31381b(InterfaceC10460t.a.CLICK);
            }
            C10895b.this.m33263s(this.f27615a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sd.b$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6888a f27617a;

        /* renamed from: b */
        final /* synthetic */ Activity f27618b;

        c(C6888a c6888a, Activity activity) {
            this.f27617a = c6888a;
            this.f27618b = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C10895b.this.f27610w != null) {
                C11544m.m36187f("Calling callback for click action");
                C10895b.this.f27610w.mo31380a(this.f27617a);
            }
            C10895b.this.m33236A(this.f27618b, Uri.parse(this.f27617a.m19871b()));
            C10895b.this.m33238C();
            C10895b.this.m33241F(this.f27618b);
            C10895b.this.f27609v = null;
            C10895b.this.f27610w = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sd.b$d */
    /* loaded from: classes.dex */
    public class d extends C11536e.a {

        /* renamed from: e */
        final /* synthetic */ AbstractC11875c f27620e;

        /* renamed from: f */
        final /* synthetic */ Activity f27621f;

        /* renamed from: r */
        final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f27622r;

        /* renamed from: sd.b$d$a */
        /* loaded from: classes.dex */
        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 4) {
                    return false;
                }
                if (C10895b.this.f27610w != null) {
                    C10895b.this.f27610w.mo31381b(InterfaceC10460t.a.UNKNOWN_DISMISS_TYPE);
                }
                d dVar = d.this;
                C10895b.this.m33263s(dVar.f27621f);
                return true;
            }
        }

        /* renamed from: sd.b$d$b */
        /* loaded from: classes.dex */
        class b implements C11545n.b {
            b() {
            }

            @Override // p382ud.C11545n.b
            /* renamed from: a */
            public void mo33273a() {
                if (C10895b.this.f27609v == null || C10895b.this.f27610w == null) {
                    return;
                }
                C11544m.m36187f("Impression timer onFinish for: " + C10895b.this.f27609v.m19929a().m19901a());
                C10895b.this.f27610w.mo31383d();
            }
        }

        /* renamed from: sd.b$d$c */
        /* loaded from: classes.dex */
        class c implements C11545n.b {
            c() {
            }

            @Override // p382ud.C11545n.b
            /* renamed from: a */
            public void mo33273a() {
                if (C10895b.this.f27609v != null && C10895b.this.f27610w != null) {
                    C10895b.this.f27610w.mo31381b(InterfaceC10460t.a.AUTO);
                }
                d dVar = d.this;
                C10895b.this.m33263s(dVar.f27621f);
            }
        }

        /* renamed from: sd.b$d$d, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC13251d implements Runnable {
            RunnableC13251d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C11538g c11538g = C10895b.this.f27604f;
                d dVar = d.this;
                c11538g.m36126i(dVar.f27620e, dVar.f27621f);
                if (d.this.f27620e.mo37967b().m36156n().booleanValue()) {
                    C10895b.this.f27607t.m36097a(C10895b.this.f27606s, d.this.f27620e.mo37971f(), C11534c.c.TOP);
                }
            }
        }

        d(AbstractC11875c abstractC11875c, Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            this.f27620e = abstractC11875c;
            this.f27621f = activity;
            this.f27622r = onGlobalLayoutListener;
        }

        @Override // p382ud.C11536e.a
        /* renamed from: c */
        public void mo33271c(Exception exc) {
            C11544m.m36186e("Image download failure ");
            if (this.f27622r != null) {
                this.f27620e.mo37970e().getViewTreeObserver().removeGlobalOnLayoutListener(this.f27622r);
            }
            C10895b.this.m33262r();
            C10895b.this.f27609v = null;
            C10895b.this.f27610w = null;
        }

        @Override // p382ud.C11536e.a
        /* renamed from: k */
        public void mo33272k() {
            if (!this.f27620e.mo37967b().m36158p().booleanValue()) {
                this.f27620e.mo37971f().setOnTouchListener(new a());
            }
            C10895b.this.f27602d.m36189b(new b(), 5000L, 1000L);
            if (this.f27620e.mo37967b().m36157o().booleanValue()) {
                C10895b.this.f27603e.m36189b(new c(), 20000L, 1000L);
            }
            this.f27621f.runOnUiThread(new RunnableC13251d());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sd.b$e */
    /* loaded from: classes.dex */
    public static /* synthetic */ class e {

        /* renamed from: a */
        static final /* synthetic */ int[] f27628a;

        static {
            int[] iArr = new int[MessageType.values().length];
            f27628a = iArr;
            try {
                iArr[MessageType.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27628a[MessageType.MODAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27628a[MessageType.IMAGE_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27628a[MessageType.CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10895b(C10457q c10457q, Map<String, InterfaceC1806a<C11543l>> map, C11536e c11536e, C11545n c11545n, C11545n c11545n2, C11538g c11538g, Application application, C11532a c11532a, C11534c c11534c) {
        this.f27599a = c10457q;
        this.f27600b = map;
        this.f27601c = c11536e;
        this.f27602d = c11545n;
        this.f27603e = c11545n2;
        this.f27604f = c11538g;
        this.f27606s = application;
        this.f27605r = c11532a;
        this.f27607t = c11534c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public void m33236A(Activity activity, Uri uri) {
        if (m33269y(uri) && m33243H(activity)) {
            C0394d m2113b = new C0394d.b().m2113b();
            Intent intent = m2113b.f2069a;
            intent.addFlags(1073741824);
            intent.addFlags(268435456);
            m2113b.m2108b(activity, uri);
            return;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW", uri);
        ResolveInfo resolveActivity = activity.getPackageManager().resolveActivity(intent2, 0);
        intent2.addFlags(1073741824);
        intent2.addFlags(268435456);
        if (resolveActivity != null) {
            activity.startActivity(intent2);
        } else {
            C11544m.m36186e("Device cannot resolve intent for: android.intent.action.VIEW");
        }
    }

    /* renamed from: B */
    private void m33237B(Activity activity, AbstractC11875c abstractC11875c, C6894g c6894g, C11536e.a aVar) {
        if (m33268x(c6894g)) {
            this.f27601c.m36106c(c6894g.m19921b()).m36114d(activity.getClass()).m36113c(C10898e.f27639a).m36112b(abstractC11875c.mo37970e(), aVar);
        } else {
            aVar.mo33272k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public void m33238C() {
        FiamListener fiamListener = this.f27608u;
        if (fiamListener != null) {
            fiamListener.onFiamClick();
        }
    }

    /* renamed from: D */
    private void m33239D() {
        FiamListener fiamListener = this.f27608u;
        if (fiamListener != null) {
            fiamListener.onFiamDismiss();
        }
    }

    /* renamed from: E */
    private void m33240E() {
        FiamListener fiamListener = this.f27608u;
        if (fiamListener != null) {
            fiamListener.onFiamTrigger();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public void m33241F(Activity activity) {
        if (this.f27604f.m36125h()) {
            this.f27601c.m36105b(activity.getClass());
            this.f27604f.m36124a(activity);
            m33262r();
        }
    }

    /* renamed from: G */
    private void m33242G(Activity activity) {
        AbstractC11875c m36090a;
        if (this.f27609v == null || this.f27599a.m31373c()) {
            C11544m.m36186e("No active message found to render");
            return;
        }
        if (this.f27609v.m19930c().equals(MessageType.UNSUPPORTED)) {
            C11544m.m36186e("The message being triggered is not supported by this version of the sdk.");
            return;
        }
        m33240E();
        C11543l c11543l = this.f27600b.get(C12454g.m40439a(this.f27609v.m19930c(), m33266v(this.f27606s))).get();
        int i10 = e.f27628a[this.f27609v.m19930c().ordinal()];
        if (i10 == 1) {
            m36090a = this.f27605r.m36090a(c11543l, this.f27609v);
        } else if (i10 == 2) {
            m36090a = this.f27605r.m36093d(c11543l, this.f27609v);
        } else if (i10 == 3) {
            m36090a = this.f27605r.m36092c(c11543l, this.f27609v);
        } else {
            if (i10 != 4) {
                C11544m.m36186e("No bindings found for this message type");
                return;
            }
            m36090a = this.f27605r.m36091b(c11543l, this.f27609v);
        }
        activity.findViewById(R.id.content).post(new a(activity, m36090a));
    }

    /* renamed from: H */
    private boolean m33243H(Activity activity) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        intent.setPackage("com.android.chrome");
        List<ResolveInfo> queryIntentServices = activity.getPackageManager().queryIntentServices(intent, 0);
        return (queryIntentServices == null || queryIntentServices.isEmpty()) ? false : true;
    }

    /* renamed from: I */
    private void m33244I(Activity activity) {
        String str = this.f27611x;
        if (str == null || !str.equals(activity.getLocalClassName())) {
            return;
        }
        C11544m.m36187f("Unbinding from activity: " + activity.getLocalClassName());
        this.f27599a.m31374d();
        m33241F(activity);
        this.f27611x = null;
    }

    /* renamed from: q */
    private void m33261q(final Activity activity) {
        String str = this.f27611x;
        if (str == null || !str.equals(activity.getLocalClassName())) {
            C11544m.m36187f("Binding to activity: " + activity.getLocalClassName());
            this.f27599a.m31377i(new FirebaseInAppMessagingDisplay() { // from class: sd.a
                @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay
                public final void displayMessage(AbstractC6896i abstractC6896i, InterfaceC10460t interfaceC10460t) {
                    C10895b.this.m33270z(activity, abstractC6896i, interfaceC10460t);
                }
            });
            this.f27611x = activity.getLocalClassName();
        }
        if (this.f27609v != null) {
            m33242G(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m33262r() {
        this.f27602d.m36188a();
        this.f27603e.m36188a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m33263s(Activity activity) {
        C11544m.m36182a("Dismissing fiam");
        m33239D();
        m33241F(activity);
        this.f27609v = null;
        this.f27610w = null;
    }

    /* renamed from: t */
    private List<C6888a> m33264t(AbstractC6896i abstractC6896i) {
        C6888a m19885e;
        ArrayList arrayList = new ArrayList();
        int i10 = e.f27628a[abstractC6896i.m19930c().ordinal()];
        if (i10 == 1) {
            m19885e = ((C6890c) abstractC6896i).m19885e();
        } else if (i10 == 2) {
            m19885e = ((C6897j) abstractC6896i).m19932e();
        } else if (i10 == 3) {
            m19885e = ((C6895h) abstractC6896i).m19925e();
        } else if (i10 != 4) {
            m19885e = C6888a.m19870a().m19873a();
        } else {
            C6893f c6893f = (C6893f) abstractC6896i;
            arrayList.add(c6893f.m19909i());
            m19885e = c6893f.m19910j();
        }
        arrayList.add(m19885e);
        return arrayList;
    }

    /* renamed from: u */
    private C6894g m33265u(AbstractC6896i abstractC6896i) {
        if (abstractC6896i.m19930c() != MessageType.CARD) {
            return abstractC6896i.mo19884b();
        }
        C6893f c6893f = (C6893f) abstractC6896i;
        C6894g m19908h = c6893f.m19908h();
        C6894g m19907g = c6893f.m19907g();
        return m33266v(this.f27606s) == 1 ? m33268x(m19908h) ? m19908h : m19907g : m33268x(m19907g) ? m19907g : m19908h;
    }

    /* renamed from: v */
    private static int m33266v(Application application) {
        return application.getResources().getConfiguration().orientation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m33267w(Activity activity, AbstractC11875c abstractC11875c) {
        View.OnClickListener onClickListener;
        if (this.f27609v == null) {
            return;
        }
        b bVar = new b(activity);
        HashMap hashMap = new HashMap();
        for (C6888a c6888a : m33264t(this.f27609v)) {
            if (c6888a == null || TextUtils.isEmpty(c6888a.m19871b())) {
                C11544m.m36187f("No action url found for action. Treating as dismiss.");
                onClickListener = bVar;
            } else {
                onClickListener = new c(c6888a, activity);
            }
            hashMap.put(c6888a, onClickListener);
        }
        ViewTreeObserver.OnGlobalLayoutListener mo37972g = abstractC11875c.mo37972g(hashMap, bVar);
        if (mo37972g != null) {
            abstractC11875c.mo37970e().getViewTreeObserver().addOnGlobalLayoutListener(mo37972g);
        }
        m33237B(activity, abstractC11875c, m33265u(this.f27609v), new d(abstractC11875c, activity, mo37972g));
    }

    /* renamed from: x */
    private boolean m33268x(C6894g c6894g) {
        return (c6894g == null || TextUtils.isEmpty(c6894g.m19921b())) ? false : true;
    }

    /* renamed from: y */
    private boolean m33269y(Uri uri) {
        String scheme;
        if (uri == null || (scheme = uri.getScheme()) == null) {
            return false;
        }
        return scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m33270z(Activity activity, AbstractC6896i abstractC6896i, InterfaceC10460t interfaceC10460t) {
        if (this.f27609v != null || this.f27599a.m31373c()) {
            C11544m.m36182a("Active FIAM exists. Skipping trigger");
            return;
        }
        this.f27609v = abstractC6896i;
        this.f27610w = interfaceC10460t;
        m33242G(activity);
    }

    @Override // p382ud.C11540i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        m33244I(activity);
        this.f27599a.m31375g();
        super.onActivityPaused(activity);
    }

    @Override // p382ud.C11540i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        m33261q(activity);
    }
}
