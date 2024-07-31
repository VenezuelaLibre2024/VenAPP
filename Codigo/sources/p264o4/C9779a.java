package p264o4;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9322n;
import org.json.JSONException;
import org.json.JSONObject;
import p152i4.C7799e0;
import p264o4.C9779a;
import p303q4.C10269i;

/* renamed from: o4.a */
/* loaded from: classes.dex */
public final class C9779a {

    /* renamed from: a */
    public static final C9779a f24112a = new C9779a();

    /* renamed from: b */
    private static final String f24113b = C9779a.class.getCanonicalName();

    /* renamed from: c */
    private static final AtomicBoolean f24114c = new AtomicBoolean(false);

    /* renamed from: d */
    private static Boolean f24115d;

    /* renamed from: e */
    private static Boolean f24116e;

    /* renamed from: f */
    private static ServiceConnection f24117f;

    /* renamed from: g */
    private static Application.ActivityLifecycleCallbacks f24118g;

    /* renamed from: h */
    private static Intent f24119h;

    /* renamed from: i */
    private static Object f24120i;

    /* renamed from: o4.a$a */
    /* loaded from: classes.dex */
    public static final class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            C9322n.m27781e(name, "name");
            C9322n.m27781e(service, "service");
            C9779a c9779a = C9779a.f24112a;
            C9787i c9787i = C9787i.f24152a;
            C9779a.f24120i = C9787i.m29385a(C7799e0.m23860l(), service);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            C9322n.m27781e(name, "name");
        }
    }

    /* renamed from: o4.a$b */
    /* loaded from: classes.dex */
    public static final class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m29349c() {
            Context m23860l = C7799e0.m23860l();
            C9787i c9787i = C9787i.f24152a;
            ArrayList<String> m29393i = C9787i.m29393i(m23860l, C9779a.f24120i);
            C9779a c9779a = C9779a.f24112a;
            c9779a.m29344f(m23860l, m29393i, false);
            c9779a.m29344f(m23860l, C9787i.m29394j(m23860l, C9779a.f24120i), true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m29350d() {
            Context m23860l = C7799e0.m23860l();
            C9787i c9787i = C9787i.f24152a;
            ArrayList<String> m29393i = C9787i.m29393i(m23860l, C9779a.f24120i);
            if (m29393i.isEmpty()) {
                m29393i = C9787i.m29391g(m23860l, C9779a.f24120i);
            }
            C9779a.f24112a.m29344f(m23860l, m29393i, false);
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
        public void onActivityResumed(Activity activity) {
            C9322n.m27781e(activity, "activity");
            try {
                C7799e0.m23868t().execute(new Runnable() { // from class: o4.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9779a.b.m29349c();
                    }
                });
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            C9322n.m27781e(activity, "activity");
            C9322n.m27781e(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            C9322n.m27781e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            C9322n.m27781e(activity, "activity");
            try {
                if (C9322n.m27777a(C9779a.f24116e, Boolean.TRUE) && C9322n.m27777a(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                    C7799e0.m23868t().execute(new Runnable() { // from class: o4.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            C9779a.b.m29350d();
                        }
                    });
                }
            } catch (Exception unused) {
            }
        }
    }

    private C9779a() {
    }

    /* renamed from: e */
    private final void m29343e() {
        if (f24115d != null) {
            return;
        }
        Boolean valueOf = Boolean.valueOf(C9791m.m29419a("com.android.vending.billing.IInAppBillingService$Stub") != null);
        f24115d = valueOf;
        if (C9322n.m27777a(valueOf, Boolean.FALSE)) {
            return;
        }
        f24116e = Boolean.valueOf(C9791m.m29419a("com.android.billingclient.api.ProxyBillingActivity") != null);
        C9787i.m29386b();
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
        C9322n.m27780d(intent, "Intent(\"com.android.vending.billing.InAppBillingService.BIND\")\n            .setPackage(\"com.android.vending\")");
        f24119h = intent;
        f24117f = new a();
        f24118g = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final void m29344f(Context context, ArrayList<String> arrayList, boolean z10) {
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String purchase = it.next();
            try {
                String sku = new JSONObject(purchase).getString("productId");
                C9322n.m27780d(sku, "sku");
                C9322n.m27780d(purchase, "purchase");
                hashMap.put(sku, purchase);
                arrayList2.add(sku);
            } catch (JSONException e10) {
                Log.e(f24113b, "Error parsing in-app purchase data.", e10);
            }
        }
        C9787i c9787i = C9787i.f24152a;
        for (Map.Entry<String, String> entry : C9787i.m29395k(context, arrayList2, f24120i, z10).entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String str = (String) hashMap.get(key);
            if (str != null) {
                C10269i.m30758f(str, value, z10);
            }
        }
    }

    /* renamed from: g */
    public static final void m29345g() {
        C9779a c9779a = f24112a;
        c9779a.m29343e();
        if (!C9322n.m27777a(f24115d, Boolean.FALSE) && C10269i.m30755c()) {
            c9779a.m29346h();
        }
    }

    /* renamed from: h */
    private final void m29346h() {
        if (f24114c.compareAndSet(false, true)) {
            Context m23860l = C7799e0.m23860l();
            if (m23860l instanceof Application) {
                Application application = (Application) m23860l;
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = f24118g;
                if (activityLifecycleCallbacks == null) {
                    C9322n.m27792p("callbacks");
                    throw null;
                }
                application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                Intent intent = f24119h;
                if (intent == null) {
                    C9322n.m27792p("intent");
                    throw null;
                }
                ServiceConnection serviceConnection = f24117f;
                if (serviceConnection != null) {
                    m23860l.bindService(intent, serviceConnection, 1);
                } else {
                    C9322n.m27792p("serviceConnection");
                    throw null;
                }
            }
        }
    }
}
