package j4;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.facebook.appevents.h0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import xk.q;

/* loaded from: classes.dex */
public final class f implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: e, reason: collision with root package name */
    public static final a f19750e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Map<Integer, f> f19751f = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Set<String> f19752a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f19753b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference<Activity> f19754c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f19755d;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(String str, String str2) {
            return n.a("r2", str) ? new xk.f("[^\\d.]").b(str2, "") : str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (r7.equals("r5") == false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
        
            r8 = new xk.f("[^a-z]+").b(r8, "");
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
        
            if (r7.equals("r4") == false) goto L34;
         */
        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d(java.util.Map<java.lang.String, java.lang.String> r6, java.lang.String r7, java.lang.String r8) {
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
                boolean r1 = xk.g.J(r8, r0, r3, r2, r1)
                if (r1 == 0) goto L84
                xk.f r1 = new xk.f
                r1.<init>(r0)
                java.util.List r8 = r1.c(r8, r3)
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
                java.lang.String r8 = r0.b(r8, r1)
                goto L84
            L5e:
                java.lang.String r0 = "r3"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L67
                goto L84
            L67:
                java.lang.String r0 = "m"
                boolean r4 = xk.g.E(r8, r0, r3, r2, r1)
                if (r4 != 0) goto L83
                java.lang.String r4 = "b"
                boolean r4 = xk.g.E(r8, r4, r3, r2, r1)
                if (r4 != 0) goto L83
                java.lang.String r4 = "ge"
                boolean r8 = xk.g.E(r8, r4, r3, r2, r1)
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
            throw new UnsupportedOperationException("Method not decompiled: j4.f.a.d(java.util.Map, java.lang.String, java.lang.String):void");
        }

        public final void e(Activity activity) {
            n.e(activity, "activity");
            int hashCode = activity.hashCode();
            Map b10 = f.b();
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = b10.get(valueOf);
            if (obj == null) {
                obj = new f(activity, null);
                b10.put(valueOf, obj);
            }
            f.c((f) obj);
        }
    }

    private f(Activity activity) {
        this.f19752a = new LinkedHashSet();
        this.f19753b = new Handler(Looper.getMainLooper());
        this.f19754c = new WeakReference<>(activity);
        this.f19755d = new AtomicBoolean(false);
    }

    public /* synthetic */ f(Activity activity, g gVar) {
        this(activity);
    }

    public static final /* synthetic */ Map b() {
        if (a5.a.d(f.class)) {
            return null;
        }
        try {
            return f19751f;
        } catch (Throwable th2) {
            a5.a.b(th2, f.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(f fVar) {
        if (a5.a.d(f.class)) {
            return;
        }
        try {
            fVar.h();
        } catch (Throwable th2) {
            a5.a.b(th2, f.class);
        }
    }

    private final void d(final View view) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            g(new Runnable() { // from class: j4.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.e(view, this);
                }
            });
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(View view, f this$0) {
        if (a5.a.d(f.class)) {
            return;
        }
        try {
            n.e(view, "$view");
            n.e(this$0, "this$0");
            if (view instanceof EditText) {
                this$0.f(view);
            }
        } catch (Throwable th2) {
            a5.a.b(th2, f.class);
        }
    }

    private final void f(View view) {
        CharSequence K0;
        String c10;
        if (a5.a.d(this)) {
            return;
        }
        try {
            String obj = ((EditText) view).getText().toString();
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            K0 = q.K0(obj);
            String obj2 = K0.toString();
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = obj2.toLowerCase();
            n.d(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (!(lowerCase.length() == 0) && !this.f19752a.contains(lowerCase) && lowerCase.length() <= 100) {
                this.f19752a.add(lowerCase);
                HashMap hashMap = new HashMap();
                List<String> b10 = c.b(view);
                List<String> list = null;
                for (d dVar : d.f19743d.c()) {
                    a aVar = f19750e;
                    String c11 = aVar.c(dVar.c(), lowerCase);
                    if (dVar.d().length() > 0) {
                        c cVar = c.f19742a;
                        if (!c.f(c11, dVar.d())) {
                        }
                    }
                    c cVar2 = c.f19742a;
                    if (c.e(b10, dVar.b())) {
                        c10 = dVar.c();
                    } else {
                        if (list == null) {
                            list = c.a(view);
                        }
                        if (c.e(list, dVar.b())) {
                            c10 = dVar.c();
                        }
                    }
                    aVar.d(hashMap, c10, c11);
                }
                h0.f7622b.e(hashMap);
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    private final void g(Runnable runnable) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.f19753b.post(runnable);
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    private final void h() {
        if (a5.a.d(this)) {
            return;
        }
        try {
            if (this.f19755d.getAndSet(true)) {
                return;
            }
            q4.g gVar = q4.g.f23521a;
            View e10 = q4.g.e(this.f19754c.get());
            if (e10 == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = e10.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalFocusChangeListener(this);
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        if (a5.a.d(this)) {
            return;
        }
        if (view != null) {
            try {
                d(view);
            } catch (Throwable th2) {
                a5.a.b(th2, this);
                return;
            }
        }
        if (view2 != null) {
            d(view2);
        }
    }
}
