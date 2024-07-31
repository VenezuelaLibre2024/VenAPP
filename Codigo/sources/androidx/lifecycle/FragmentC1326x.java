package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1300f;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: androidx.lifecycle.x */
/* loaded from: classes.dex */
public class FragmentC1326x extends Fragment {

    /* renamed from: b */
    public static final b f5737b = new b(null);

    /* renamed from: a */
    private a f5738a;

    /* renamed from: androidx.lifecycle.x$a */
    /* loaded from: classes.dex */
    public interface a {
        void onCreate();

        void onResume();

        void onStart();
    }

    /* renamed from: androidx.lifecycle.x$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final void m7400a(Activity activity, AbstractC1300f.a event) {
            C9322n.m27781e(activity, "activity");
            C9322n.m27781e(event, "event");
            if (activity instanceof InterfaceC1314m) {
                ((InterfaceC1314m) activity).getLifecycle().m7360h(event);
            } else if (activity instanceof InterfaceC1310k) {
                AbstractC1300f lifecycle = ((InterfaceC1310k) activity).getLifecycle();
                if (lifecycle instanceof C1312l) {
                    ((C1312l) lifecycle).m7360h(event);
                }
            }
        }

        /* renamed from: b */
        public final FragmentC1326x m7401b(Activity activity) {
            C9322n.m27781e(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            C9322n.m27779c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (FragmentC1326x) findFragmentByTag;
        }

        /* renamed from: c */
        public final void m7402c(Activity activity) {
            C9322n.m27781e(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.m7403a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new FragmentC1326x(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    /* renamed from: androidx.lifecycle.x$c */
    /* loaded from: classes.dex */
    public static final class c implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a(null);

        /* renamed from: androidx.lifecycle.x$c$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9315g c9315g) {
                this();
            }

            /* renamed from: a */
            public final void m7403a(Activity activity) {
                C9322n.m27781e(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new c());
            }
        }

        public static final void registerIn(Activity activity) {
            Companion.m7403a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C9322n.m27781e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            C9322n.m27781e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            C9322n.m27781e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            C9322n.m27781e(activity, "activity");
            FragmentC1326x.f5737b.m7400a(activity, AbstractC1300f.a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            C9322n.m27781e(activity, "activity");
            FragmentC1326x.f5737b.m7400a(activity, AbstractC1300f.a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            C9322n.m27781e(activity, "activity");
            FragmentC1326x.f5737b.m7400a(activity, AbstractC1300f.a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            C9322n.m27781e(activity, "activity");
            FragmentC1326x.f5737b.m7400a(activity, AbstractC1300f.a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            C9322n.m27781e(activity, "activity");
            FragmentC1326x.f5737b.m7400a(activity, AbstractC1300f.a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            C9322n.m27781e(activity, "activity");
            FragmentC1326x.f5737b.m7400a(activity, AbstractC1300f.a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            C9322n.m27781e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C9322n.m27781e(activity, "activity");
            C9322n.m27781e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            C9322n.m27781e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            C9322n.m27781e(activity, "activity");
        }
    }

    /* renamed from: a */
    private final void m7394a(AbstractC1300f.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            b bVar = f5737b;
            Activity activity = getActivity();
            C9322n.m27780d(activity, "activity");
            bVar.m7400a(activity, aVar);
        }
    }

    /* renamed from: b */
    private final void m7395b(a aVar) {
        if (aVar != null) {
            aVar.onCreate();
        }
    }

    /* renamed from: c */
    private final void m7396c(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    /* renamed from: d */
    private final void m7397d(a aVar) {
        if (aVar != null) {
            aVar.onStart();
        }
    }

    /* renamed from: e */
    public static final void m7398e(Activity activity) {
        f5737b.m7402c(activity);
    }

    /* renamed from: f */
    public final void m7399f(a aVar) {
        this.f5738a = aVar;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m7395b(this.f5738a);
        m7394a(AbstractC1300f.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m7394a(AbstractC1300f.a.ON_DESTROY);
        this.f5738a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m7394a(AbstractC1300f.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m7396c(this.f5738a);
        m7394a(AbstractC1300f.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m7397d(this.f5738a);
        m7394a(AbstractC1300f.a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m7394a(AbstractC1300f.a.ON_STOP);
    }
}
