package u4;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.n;
import u4.j;

/* loaded from: classes.dex */
public final class g implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public static final a f27090d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Map<Integer, g> f27091e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<Activity> f27092a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f27093b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f27094c;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final void a(Activity activity) {
            n.e(activity, "activity");
            int hashCode = activity.hashCode();
            Map b10 = g.b();
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = b10.get(valueOf);
            if (obj == null) {
                obj = new g(activity, null);
                b10.put(valueOf, obj);
            }
            g.c((g) obj);
        }

        public final void b(Activity activity) {
            n.e(activity, "activity");
            g gVar = (g) g.b().remove(Integer.valueOf(activity.hashCode()));
            if (gVar == null) {
                return;
            }
            g.d(gVar);
        }
    }

    private g(Activity activity) {
        this.f27092a = new WeakReference<>(activity);
        this.f27093b = new Handler(Looper.getMainLooper());
        this.f27094c = new AtomicBoolean(false);
    }

    public /* synthetic */ g(Activity activity, kotlin.jvm.internal.g gVar) {
        this(activity);
    }

    public static final /* synthetic */ Map b() {
        if (a5.a.d(g.class)) {
            return null;
        }
        try {
            return f27091e;
        } catch (Throwable th2) {
            a5.a.b(th2, g.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(g gVar) {
        if (a5.a.d(g.class)) {
            return;
        }
        try {
            gVar.g();
        } catch (Throwable th2) {
            a5.a.b(th2, g.class);
        }
    }

    public static final /* synthetic */ void d(g gVar) {
        if (a5.a.d(g.class)) {
            return;
        }
        try {
            gVar.h();
        } catch (Throwable th2) {
            a5.a.b(th2, g.class);
        }
    }

    private final void e() {
        if (a5.a.d(this)) {
            return;
        }
        try {
            Runnable runnable = new Runnable() { // from class: u4.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.f(g.this);
                }
            };
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.f27093b.post(runnable);
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(g this$0) {
        if (a5.a.d(g.class)) {
            return;
        }
        try {
            n.e(this$0, "this$0");
            try {
                q4.g gVar = q4.g.f23521a;
                View e10 = q4.g.e(this$0.f27092a.get());
                Activity activity = this$0.f27092a.get();
                if (e10 != null && activity != null) {
                    for (View view : c.a(e10)) {
                        if (!m4.d.g(view)) {
                            String d10 = c.d(view);
                            if ((d10.length() > 0) && d10.length() <= 300) {
                                j.a aVar = j.f27101e;
                                String localClassName = activity.getLocalClassName();
                                n.d(localClassName, "activity.localClassName");
                                aVar.d(view, e10, localClassName);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            a5.a.b(th2, g.class);
        }
    }

    private final void g() {
        if (a5.a.d(this)) {
            return;
        }
        try {
            if (this.f27094c.getAndSet(true)) {
                return;
            }
            q4.g gVar = q4.g.f23521a;
            View e10 = q4.g.e(this.f27092a.get());
            if (e10 == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = e10.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                e();
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
            if (this.f27094c.getAndSet(false)) {
                q4.g gVar = q4.g.f23521a;
                View e10 = q4.g.e(this.f27092a.get());
                if (e10 == null) {
                    return;
                }
                ViewTreeObserver viewTreeObserver = e10.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (a5.a.d(this)) {
            return;
        }
        try {
            e();
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }
}
