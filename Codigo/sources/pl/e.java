package pl;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import ck.v;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class e {

    /* loaded from: classes3.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f23295a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ok.a<v> f23296b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ok.a<v> f23297c;

        a(Activity activity, ok.a<v> aVar, ok.a<v> aVar2) {
            this.f23295a = activity;
            this.f23296b = aVar;
            this.f23297c = aVar2;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity p02, Bundle bundle) {
            n.e(p02, "p0");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity p02) {
            n.e(p02, "p0");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity p02) {
            ok.a<v> aVar;
            n.e(p02, "p0");
            if (!n.a(p02, this.f23295a) || (aVar = this.f23296b) == null) {
                return;
            }
            aVar.invoke();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity p02) {
            ok.a<v> aVar;
            n.e(p02, "p0");
            if (!n.a(p02, this.f23295a) || (aVar = this.f23297c) == null) {
                return;
            }
            aVar.invoke();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity p02, Bundle p12) {
            n.e(p02, "p0");
            n.e(p12, "p1");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity p02) {
            n.e(p02, "p0");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity p02) {
            n.e(p02, "p0");
        }
    }

    public static final g a(Activity activity, ok.a<v> aVar, ok.a<v> aVar2) {
        n.e(activity, "<this>");
        a aVar3 = new a(activity, aVar, aVar2);
        activity.getApplication().registerActivityLifecycleCallbacks(aVar3);
        Application application = activity.getApplication();
        n.d(application, "getApplication(...)");
        return new g(application, aVar3);
    }
}
