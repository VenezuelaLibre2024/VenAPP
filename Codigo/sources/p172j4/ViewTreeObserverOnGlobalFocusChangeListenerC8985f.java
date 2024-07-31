package p172j4;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.facebook.appevents.C4578h0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;
import p303q4.C10267g;
import p450xk.C12514f;
import p450xk.C12525q;

/* renamed from: j4.f */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalFocusChangeListenerC8985f implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: e */
    public static final a f21529e = new a(null);

    /* renamed from: f */
    private static final Map<Integer, ViewTreeObserverOnGlobalFocusChangeListenerC8985f> f21530f = new HashMap();

    /* renamed from: a */
    private final Set<String> f21531a;

    /* renamed from: b */
    private final Handler f21532b;

    /* renamed from: c */
    private final WeakReference<Activity> f21533c;

    /* renamed from: d */
    private final AtomicBoolean f21534d;

    /* renamed from: j4.f$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final String m26373c(String str, String str2) {
            return C9322n.m27777a("r2", str) ? new C12514f("[^\\d.]").m40970b(str2, "") : str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (r7.equals("r5") == false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
        
            r8 = new p450xk.C12514f("[^a-z]+").m40970b(r8, "");
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        
            if (r7.equals("r4") == false) goto L34;
         */
        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m26374d(java.util.Map<java.lang.String, java.lang.String> r6, java.lang.String r7, java.lang.String r8) {
            /*
                r5 = this;
                int r0 = r7.hashCode()
                r1 = 0
                r2 = 2
                r3 = 0
                switch(r0) {
                    case 3585: goto L5e;
                    case 3586: goto L47;
                    case 3587: goto L3e;
                    case 3588: goto Lc;
                    default: goto La;
                }
            La:
                goto L84
            Lc:
                java.lang.String r0 = "r6"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L16
                goto L84
            L16:
                java.lang.String r0 = "-"
                boolean r1 = p450xk.C12515g.m40983J(r8, r0, r3, r2, r1)
                if (r1 == 0) goto L84
                xk.f r1 = new xk.f
                r1.<init>(r0)
                java.util.List r8 = r1.m40971c(r8, r3)
                java.util.Collection r8 = (java.util.Collection) r8
                java.lang.String[] r0 = new java.lang.String[r3]
                java.lang.Object[] r8 = r8.toArray(r0)
                if (r8 == 0) goto L36
                java.lang.String[] r8 = (java.lang.String[]) r8
                r8 = r8[r3]
                goto L84
            L36:
                java.lang.NullPointerException r6 = new java.lang.NullPointerException
                java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<T>"
                r6.<init>(r7)
                throw r6
            L3e:
                java.lang.String r0 = "r5"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L50
                goto L84
            L47:
                java.lang.String r0 = "r4"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L50
                goto L84
            L50:
                xk.f r0 = new xk.f
                java.lang.String r1 = "[^a-z]+"
                r0.<init>(r1)
                java.lang.String r1 = ""
                java.lang.String r8 = r0.m40970b(r8, r1)
                goto L84
            L5e:
                java.lang.String r0 = "r3"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L67
                goto L84
            L67:
                java.lang.String r0 = "m"
                boolean r4 = p450xk.C12515g.m40978E(r8, r0, r3, r2, r1)
                if (r4 != 0) goto L83
                java.lang.String r4 = "b"
                boolean r4 = p450xk.C12515g.m40978E(r8, r4, r3, r2, r1)
                if (r4 != 0) goto L83
                java.lang.String r4 = "ge"
                boolean r8 = p450xk.C12515g.m40978E(r8, r4, r3, r2, r1)
                if (r8 == 0) goto L80
                goto L83
            L80:
                java.lang.String r8 = "f"
                goto L84
            L83:
                r8 = r0
            L84:
                r6.put(r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p172j4.ViewTreeObserverOnGlobalFocusChangeListenerC8985f.a.m26374d(java.util.Map, java.lang.String, java.lang.String):void");
        }

        /* renamed from: e */
        public final void m26375e(Activity activity) {
            C9322n.m27781e(activity, "activity");
            int hashCode = activity.hashCode();
            Map m26364b = ViewTreeObserverOnGlobalFocusChangeListenerC8985f.m26364b();
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = m26364b.get(valueOf);
            if (obj == null) {
                obj = new ViewTreeObserverOnGlobalFocusChangeListenerC8985f(activity, null);
                m26364b.put(valueOf, obj);
            }
            ViewTreeObserverOnGlobalFocusChangeListenerC8985f.m26365c((ViewTreeObserverOnGlobalFocusChangeListenerC8985f) obj);
        }
    }

    private ViewTreeObserverOnGlobalFocusChangeListenerC8985f(Activity activity) {
        this.f21531a = new LinkedHashSet();
        this.f21532b = new Handler(Looper.getMainLooper());
        this.f21533c = new WeakReference<>(activity);
        this.f21534d = new AtomicBoolean(false);
    }

    public /* synthetic */ ViewTreeObserverOnGlobalFocusChangeListenerC8985f(Activity activity, C9315g c9315g) {
        this(activity);
    }

    /* renamed from: b */
    public static final /* synthetic */ Map m26364b() {
        if (C0033a.m107d(ViewTreeObserverOnGlobalFocusChangeListenerC8985f.class)) {
            return null;
        }
        try {
            return f21530f;
        } catch (Throwable th2) {
            C0033a.m105b(th2, ViewTreeObserverOnGlobalFocusChangeListenerC8985f.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ void m26365c(ViewTreeObserverOnGlobalFocusChangeListenerC8985f viewTreeObserverOnGlobalFocusChangeListenerC8985f) {
        if (C0033a.m107d(ViewTreeObserverOnGlobalFocusChangeListenerC8985f.class)) {
            return;
        }
        try {
            viewTreeObserverOnGlobalFocusChangeListenerC8985f.m26370h();
        } catch (Throwable th2) {
            C0033a.m105b(th2, ViewTreeObserverOnGlobalFocusChangeListenerC8985f.class);
        }
    }

    /* renamed from: d */
    private final void m26366d(final View view) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            m26369g(new Runnable() { // from class: j4.e
                @Override // java.lang.Runnable
                public final void run() {
                    ViewTreeObserverOnGlobalFocusChangeListenerC8985f.m26367e(view, this);
                }
            });
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m26367e(View view, ViewTreeObserverOnGlobalFocusChangeListenerC8985f this$0) {
        if (C0033a.m107d(ViewTreeObserverOnGlobalFocusChangeListenerC8985f.class)) {
            return;
        }
        try {
            C9322n.m27781e(view, "$view");
            C9322n.m27781e(this$0, "this$0");
            if (view instanceof EditText) {
                this$0.m26368f(view);
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, ViewTreeObserverOnGlobalFocusChangeListenerC8985f.class);
        }
    }

    /* renamed from: f */
    private final void m26368f(View view) {
        CharSequence m41062K0;
        String m26357c;
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            String obj = ((EditText) view).getText().toString();
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            m41062K0 = C12525q.m41062K0(obj);
            String obj2 = m41062K0.toString();
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = obj2.toLowerCase();
            C9322n.m27780d(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (!(lowerCase.length() == 0) && !this.f21531a.contains(lowerCase) && lowerCase.length() <= 100) {
                this.f21531a.add(lowerCase);
                HashMap hashMap = new HashMap();
                List<String> m26350b = C8982c.m26350b(view);
                List<String> list = null;
                for (C8983d c8983d : C8983d.f21522d.m26361c()) {
                    a aVar = f21529e;
                    String m26373c = aVar.m26373c(c8983d.m26357c(), lowerCase);
                    if (c8983d.m26358d().length() > 0) {
                        C8982c c8982c = C8982c.f21521a;
                        if (!C8982c.m26354f(m26373c, c8983d.m26358d())) {
                        }
                    }
                    C8982c c8982c2 = C8982c.f21521a;
                    if (C8982c.m26353e(m26350b, c8983d.m26356b())) {
                        m26357c = c8983d.m26357c();
                    } else {
                        if (list == null) {
                            list = C8982c.m26349a(view);
                        }
                        if (C8982c.m26353e(list, c8983d.m26356b())) {
                            m26357c = c8983d.m26357c();
                        }
                    }
                    aVar.m26374d(hashMap, m26357c, m26373c);
                }
                C4578h0.f8597b.m11007e(hashMap);
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: g */
    private final void m26369g(Runnable runnable) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.f21532b.post(runnable);
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: h */
    private final void m26370h() {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            if (this.f21534d.getAndSet(true)) {
                return;
            }
            C10267g c10267g = C10267g.f25489a;
            View m30748e = C10267g.m30748e(this.f21533c.get());
            if (m30748e == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = m30748e.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalFocusChangeListener(this);
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        if (C0033a.m107d(this)) {
            return;
        }
        if (view != null) {
            try {
                m26366d(view);
            } catch (Throwable th2) {
                C0033a.m105b(th2, this);
                return;
            }
        }
        if (view2 != null) {
            m26366d(view2);
        }
    }
}
