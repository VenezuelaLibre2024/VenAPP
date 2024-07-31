package o4;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import i4.e0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.n;
import o4.a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f22179a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final String f22180b = a.class.getCanonicalName();

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f22181c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    private static Boolean f22182d;

    /* renamed from: e, reason: collision with root package name */
    private static Boolean f22183e;

    /* renamed from: f, reason: collision with root package name */
    private static ServiceConnection f22184f;

    /* renamed from: g, reason: collision with root package name */
    private static Application.ActivityLifecycleCallbacks f22185g;

    /* renamed from: h, reason: collision with root package name */
    private static Intent f22186h;

    /* renamed from: i, reason: collision with root package name */
    private static Object f22187i;

    /* renamed from: o4.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class ServiceConnectionC0368a implements ServiceConnection {
        ServiceConnectionC0368a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            n.e(name, "name");
            n.e(service, "service");
            a aVar = a.f22179a;
            i iVar = i.f22219a;
            a.f22187i = i.a(e0.l(), service);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            n.e(name, "name");
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c() {
            Context l10 = e0.l();
            i iVar = i.f22219a;
            ArrayList<String> i10 = i.i(l10, a.f22187i);
            a aVar = a.f22179a;
            aVar.f(l10, i10, false);
            aVar.f(l10, i.j(l10, a.f22187i), true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d() {
            Context l10 = e0.l();
            i iVar = i.f22219a;
            ArrayList<String> i10 = i.i(l10, a.f22187i);
            if (i10.isEmpty()) {
                i10 = i.g(l10, a.f22187i);
            }
            a.f22179a.f(l10, i10, false);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            n.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            n.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            n.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            n.e(activity, "activity");
            try {
                e0.t().execute(new Runnable() { // from class: o4.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.b.c();
                    }
                });
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            n.e(activity, "activity");
            n.e(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            n.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            n.e(activity, "activity");
            try {
                if (n.a(a.f22183e, Boolean.TRUE) && n.a(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                    e0.t().execute(new Runnable() { // from class: o4.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.b.d();
                        }
                    });
                }
            } catch (Exception unused) {
            }
        }
    }

    private a() {
    }

    private final void e() {
        if (f22182d != null) {
            return;
        }
        Boolean valueOf = Boolean.valueOf(m.a("com.android.vending.billing.IInAppBillingService$Stub") != null);
        f22182d = valueOf;
        if (n.a(valueOf, Boolean.FALSE)) {
            return;
        }
        f22183e = Boolean.valueOf(m.a("com.android.billingclient.api.ProxyBillingActivity") != null);
        i.b();
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
        n.d(intent, "Intent(\"com.android.vending.billing.InAppBillingService.BIND\")\n            .setPackage(\"com.android.vending\")");
        f22186h = intent;
        f22184f = new ServiceConnectionC0368a();
        f22185g = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(Context context, ArrayList<String> arrayList, boolean z10) {
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
                n.d(sku, "sku");
                n.d(purchase, "purchase");
                hashMap.put(sku, purchase);
                arrayList2.add(sku);
            } catch (JSONException e10) {
                Log.e(f22180b, "Error parsing in-app purchase data.", e10);
            }
        }
        i iVar = i.f22219a;
        for (Map.Entry<String, String> entry : i.k(context, arrayList2, f22187i, z10).entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String str = (String) hashMap.get(key);
            if (str != null) {
                q4.i.f(str, value, z10);
            }
        }
    }

    public static final void g() {
        a aVar = f22179a;
        aVar.e();
        if (!n.a(f22182d, Boolean.FALSE) && q4.i.c()) {
            aVar.h();
        }
    }

    private final void h() {
        if (f22181c.compareAndSet(false, true)) {
            Context l10 = e0.l();
            if (l10 instanceof Application) {
                Application application = (Application) l10;
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = f22185g;
                if (activityLifecycleCallbacks == null) {
                    n.p("callbacks");
                    throw null;
                }
                application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                Intent intent = f22186h;
                if (intent == null) {
                    n.p("intent");
                    throw null;
                }
                ServiceConnection serviceConnection = f22184f;
                if (serviceConnection != null) {
                    l10.bindService(intent, serviceConnection, 1);
                } else {
                    n.p("serviceConnection");
                    throw null;
                }
            }
        }
    }
}
