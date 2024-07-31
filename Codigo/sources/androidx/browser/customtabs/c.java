package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import b.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final b.b f1739a;

    /* renamed from: b, reason: collision with root package name */
    private final ComponentName f1740b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f1741c;

    /* loaded from: classes.dex */
    class a extends e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f1742a;

        a(Context context) {
            this.f1742a = context;
        }

        @Override // androidx.browser.customtabs.e
        public final void onCustomTabsServiceConnected(ComponentName componentName, c cVar) {
            cVar.h(0L);
            this.f1742a.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends a.AbstractBinderC0099a {

        /* renamed from: a, reason: collision with root package name */
        private Handler f1743a = new Handler(Looper.getMainLooper());

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.browser.customtabs.b f1744b;

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1746a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f1747b;

            a(int i10, Bundle bundle) {
                this.f1746a = i10;
                this.f1747b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1744b.onNavigationEvent(this.f1746a, this.f1747b);
            }
        }

        /* renamed from: androidx.browser.customtabs.c$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0024b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f1749a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f1750b;

            RunnableC0024b(String str, Bundle bundle) {
                this.f1749a = str;
                this.f1750b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1744b.extraCallback(this.f1749a, this.f1750b);
            }
        }

        /* renamed from: androidx.browser.customtabs.c$b$c, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0025c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f1752a;

            RunnableC0025c(Bundle bundle) {
                this.f1752a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1744b.onMessageChannelReady(this.f1752a);
            }
        }

        /* loaded from: classes.dex */
        class d implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f1754a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f1755b;

            d(String str, Bundle bundle) {
                this.f1754a = str;
                this.f1755b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1744b.onPostMessage(this.f1754a, this.f1755b);
            }
        }

        /* loaded from: classes.dex */
        class e implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1757a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Uri f1758b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f1759c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f1760d;

            e(int i10, Uri uri, boolean z10, Bundle bundle) {
                this.f1757a = i10;
                this.f1758b = uri;
                this.f1759c = z10;
                this.f1760d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1744b.onRelationshipValidationResult(this.f1757a, this.f1758b, this.f1759c, this.f1760d);
            }
        }

        /* loaded from: classes.dex */
        class f implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1762a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f1763b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f1764c;

            f(int i10, int i11, Bundle bundle) {
                this.f1762a = i10;
                this.f1763b = i11;
                this.f1764c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1744b.onActivityResized(this.f1762a, this.f1763b, this.f1764c);
            }
        }

        b(androidx.browser.customtabs.b bVar) {
            this.f1744b = bVar;
        }

        @Override // b.a
        public Bundle A(String str, Bundle bundle) {
            androidx.browser.customtabs.b bVar = this.f1744b;
            if (bVar == null) {
                return null;
            }
            return bVar.extraCallbackWithResult(str, bundle);
        }

        @Override // b.a
        public void H1(int i10, Bundle bundle) {
            if (this.f1744b == null) {
                return;
            }
            this.f1743a.post(new a(i10, bundle));
        }

        @Override // b.a
        public void V(String str, Bundle bundle) {
            if (this.f1744b == null) {
                return;
            }
            this.f1743a.post(new RunnableC0024b(str, bundle));
        }

        @Override // b.a
        public void V1(String str, Bundle bundle) {
            if (this.f1744b == null) {
                return;
            }
            this.f1743a.post(new d(str, bundle));
        }

        @Override // b.a
        public void X1(Bundle bundle) {
            if (this.f1744b == null) {
                return;
            }
            this.f1743a.post(new RunnableC0025c(bundle));
        }

        @Override // b.a
        public void Z1(int i10, Uri uri, boolean z10, Bundle bundle) {
            if (this.f1744b == null) {
                return;
            }
            this.f1743a.post(new e(i10, uri, z10, bundle));
        }

        @Override // b.a
        public void r1(int i10, int i11, Bundle bundle) {
            if (this.f1744b == null) {
                return;
            }
            this.f1743a.post(new f(i10, i11, bundle));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(b.b bVar, ComponentName componentName, Context context) {
        this.f1739a = bVar;
        this.f1740b = componentName;
        this.f1741c = context;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    public static boolean b(Context context, String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return a(applicationContext, str, new a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    private a.AbstractBinderC0099a c(androidx.browser.customtabs.b bVar) {
        return new b(bVar);
    }

    public static String d(Context context, List<String> list) {
        return e(context, list, false);
    }

    public static String e(Context context, List<String> list, boolean z10) {
        ResolveInfo resolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList<>() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z10 && (resolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    private i g(androidx.browser.customtabs.b bVar, PendingIntent pendingIntent) {
        boolean h12;
        a.AbstractBinderC0099a c10 = c(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                h12 = this.f1739a.Z(c10, bundle);
            } else {
                h12 = this.f1739a.h1(c10);
            }
            if (h12) {
                return new i(this.f1739a, c10, this.f1740b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public i f(androidx.browser.customtabs.b bVar) {
        return g(bVar, null);
    }

    public boolean h(long j10) {
        try {
            return this.f1739a.b1(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
