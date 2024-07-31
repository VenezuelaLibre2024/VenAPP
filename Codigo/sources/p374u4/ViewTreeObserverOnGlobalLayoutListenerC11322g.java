package p374u4;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;
import p232m4.C9543d;
import p303q4.C10267g;
import p374u4.ViewOnClickListenerC11325j;

/* renamed from: u4.g */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC11322g implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public static final a f29392d = new a(null);

    /* renamed from: e */
    private static final Map<Integer, ViewTreeObserverOnGlobalLayoutListenerC11322g> f29393e = new HashMap();

    /* renamed from: a */
    private final WeakReference<Activity> f29394a;

    /* renamed from: b */
    private final Handler f29395b;

    /* renamed from: c */
    private final AtomicBoolean f29396c;

    /* renamed from: u4.g$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final void m35398a(Activity activity) {
            C9322n.m27781e(activity, "activity");
            int hashCode = activity.hashCode();
            Map m35391b = ViewTreeObserverOnGlobalLayoutListenerC11322g.m35391b();
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = m35391b.get(valueOf);
            if (obj == null) {
                obj = new ViewTreeObserverOnGlobalLayoutListenerC11322g(activity, null);
                m35391b.put(valueOf, obj);
            }
            ViewTreeObserverOnGlobalLayoutListenerC11322g.m35392c((ViewTreeObserverOnGlobalLayoutListenerC11322g) obj);
        }

        /* renamed from: b */
        public final void m35399b(Activity activity) {
            C9322n.m27781e(activity, "activity");
            ViewTreeObserverOnGlobalLayoutListenerC11322g viewTreeObserverOnGlobalLayoutListenerC11322g = (ViewTreeObserverOnGlobalLayoutListenerC11322g) ViewTreeObserverOnGlobalLayoutListenerC11322g.m35391b().remove(Integer.valueOf(activity.hashCode()));
            if (viewTreeObserverOnGlobalLayoutListenerC11322g == null) {
                return;
            }
            ViewTreeObserverOnGlobalLayoutListenerC11322g.m35393d(viewTreeObserverOnGlobalLayoutListenerC11322g);
        }
    }

    private ViewTreeObserverOnGlobalLayoutListenerC11322g(Activity activity) {
        this.f29394a = new WeakReference<>(activity);
        this.f29395b = new Handler(Looper.getMainLooper());
        this.f29396c = new AtomicBoolean(false);
    }

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC11322g(Activity activity, C9315g c9315g) {
        this(activity);
    }

    /* renamed from: b */
    public static final /* synthetic */ Map m35391b() {
        if (C0033a.m107d(ViewTreeObserverOnGlobalLayoutListenerC11322g.class)) {
            return null;
        }
        try {
            return f29393e;
        } catch (Throwable th2) {
            C0033a.m105b(th2, ViewTreeObserverOnGlobalLayoutListenerC11322g.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ void m35392c(ViewTreeObserverOnGlobalLayoutListenerC11322g viewTreeObserverOnGlobalLayoutListenerC11322g) {
        if (C0033a.m107d(ViewTreeObserverOnGlobalLayoutListenerC11322g.class)) {
            return;
        }
        try {
            viewTreeObserverOnGlobalLayoutListenerC11322g.m35396g();
        } catch (Throwable th2) {
            C0033a.m105b(th2, ViewTreeObserverOnGlobalLayoutListenerC11322g.class);
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ void m35393d(ViewTreeObserverOnGlobalLayoutListenerC11322g viewTreeObserverOnGlobalLayoutListenerC11322g) {
        if (C0033a.m107d(ViewTreeObserverOnGlobalLayoutListenerC11322g.class)) {
            return;
        }
        try {
            viewTreeObserverOnGlobalLayoutListenerC11322g.m35397h();
        } catch (Throwable th2) {
            C0033a.m105b(th2, ViewTreeObserverOnGlobalLayoutListenerC11322g.class);
        }
    }

    /* renamed from: e */
    private final void m35394e() {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            Runnable runnable = new Runnable() { // from class: u4.f
                @Override // java.lang.Runnable
                public final void run() {
                    ViewTreeObserverOnGlobalLayoutListenerC11322g.m35395f(ViewTreeObserverOnGlobalLayoutListenerC11322g.this);
                }
            };
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.f29395b.post(runnable);
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m35395f(ViewTreeObserverOnGlobalLayoutListenerC11322g this$0) {
        if (C0033a.m107d(ViewTreeObserverOnGlobalLayoutListenerC11322g.class)) {
            return;
        }
        try {
            C9322n.m27781e(this$0, "this$0");
            try {
                C10267g c10267g = C10267g.f25489a;
                View m30748e = C10267g.m30748e(this$0.f29394a.get());
                Activity activity = this$0.f29394a.get();
                if (m30748e != null && activity != null) {
                    for (View view : C11318c.m35377a(m30748e)) {
                        if (!C9543d.m28409g(view)) {
                            String m35380d = C11318c.m35380d(view);
                            if ((m35380d.length() > 0) && m35380d.length() <= 300) {
                                ViewOnClickListenerC11325j.a aVar = ViewOnClickListenerC11325j.f29403e;
                                String localClassName = activity.getLocalClassName();
                                C9322n.m27780d(localClassName, "activity.localClassName");
                                aVar.m35412d(view, m30748e, localClassName);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, ViewTreeObserverOnGlobalLayoutListenerC11322g.class);
        }
    }

    /* renamed from: g */
    private final void m35396g() {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            if (this.f29396c.getAndSet(true)) {
                return;
            }
            C10267g c10267g = C10267g.f25489a;
            View m30748e = C10267g.m30748e(this.f29394a.get());
            if (m30748e == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = m30748e.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                m35394e();
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: h */
    private final void m35397h() {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            if (this.f29396c.getAndSet(false)) {
                C10267g c10267g = C10267g.f25489a;
                View m30748e = C10267g.m30748e(this.f29394a.get());
                if (m30748e == null) {
                    return;
                }
                ViewTreeObserver viewTreeObserver = m30748e.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            m35394e();
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }
}
