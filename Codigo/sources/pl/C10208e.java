package pl;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import ck.C2037v;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9987a;

/* renamed from: pl.e */
/* loaded from: classes3.dex */
public final class C10208e {

    /* renamed from: pl.e$a */
    /* loaded from: classes3.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        final /* synthetic */ Activity f25234a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC9987a<C2037v> f25235b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC9987a<C2037v> f25236c;

        a(Activity activity, InterfaceC9987a<C2037v> interfaceC9987a, InterfaceC9987a<C2037v> interfaceC9987a2) {
            this.f25234a = activity;
            this.f25235b = interfaceC9987a;
            this.f25236c = interfaceC9987a2;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity p02, Bundle bundle) {
            C9322n.m27781e(p02, "p0");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity p02) {
            C9322n.m27781e(p02, "p0");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity p02) {
            InterfaceC9987a<C2037v> interfaceC9987a;
            C9322n.m27781e(p02, "p0");
            if (!C9322n.m27777a(p02, this.f25234a) || (interfaceC9987a = this.f25235b) == null) {
                return;
            }
            interfaceC9987a.invoke();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity p02) {
            InterfaceC9987a<C2037v> interfaceC9987a;
            C9322n.m27781e(p02, "p0");
            if (!C9322n.m27777a(p02, this.f25234a) || (interfaceC9987a = this.f25236c) == null) {
                return;
            }
            interfaceC9987a.invoke();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity p02, Bundle p12) {
            C9322n.m27781e(p02, "p0");
            C9322n.m27781e(p12, "p1");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity p02) {
            C9322n.m27781e(p02, "p0");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity p02) {
            C9322n.m27781e(p02, "p0");
        }
    }

    /* renamed from: a */
    public static final C10210g m30548a(Activity activity, InterfaceC9987a<C2037v> interfaceC9987a, InterfaceC9987a<C2037v> interfaceC9987a2) {
        C9322n.m27781e(activity, "<this>");
        a aVar = new a(activity, interfaceC9987a, interfaceC9987a2);
        activity.getApplication().registerActivityLifecycleCallbacks(aVar);
        Application application = activity.getApplication();
        C9322n.m27780d(application, "getApplication(...)");
        return new C10210g(application, aVar);
    }
}
