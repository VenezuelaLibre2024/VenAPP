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
import java.util.ArrayList;
import java.util.List;
import p017b.InterfaceC1590a;
import p017b.InterfaceC1591b;

/* renamed from: androidx.browser.customtabs.c */
/* loaded from: classes.dex */
public class C0393c {

    /* renamed from: a */
    private final InterfaceC1591b f2042a;

    /* renamed from: b */
    private final ComponentName f2043b;

    /* renamed from: c */
    private final Context f2044c;

    /* renamed from: androidx.browser.customtabs.c$a */
    /* loaded from: classes.dex */
    class a extends AbstractServiceConnectionC0395e {

        /* renamed from: a */
        final /* synthetic */ Context f2045a;

        a(Context context) {
            this.f2045a = context;
        }

        @Override // androidx.browser.customtabs.AbstractServiceConnectionC0395e
        public final void onCustomTabsServiceConnected(ComponentName componentName, C0393c c0393c) {
            c0393c.m2098h(0L);
            this.f2045a.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.browser.customtabs.c$b */
    /* loaded from: classes.dex */
    public class b extends InterfaceC1590a.a {

        /* renamed from: a */
        private Handler f2046a = new Handler(Looper.getMainLooper());

        /* renamed from: b */
        final /* synthetic */ C0392b f2047b;

        /* renamed from: androidx.browser.customtabs.c$b$a */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f2049a;

            /* renamed from: b */
            final /* synthetic */ Bundle f2050b;

            a(int i10, Bundle bundle) {
                this.f2049a = i10;
                this.f2050b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f2047b.onNavigationEvent(this.f2049a, this.f2050b);
            }
        }

        /* renamed from: androidx.browser.customtabs.c$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC13153b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f2052a;

            /* renamed from: b */
            final /* synthetic */ Bundle f2053b;

            RunnableC13153b(String str, Bundle bundle) {
                this.f2052a = str;
                this.f2053b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f2047b.extraCallback(this.f2052a, this.f2053b);
            }
        }

        /* renamed from: androidx.browser.customtabs.c$b$c */
        /* loaded from: classes.dex */
        class c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Bundle f2055a;

            c(Bundle bundle) {
                this.f2055a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f2047b.onMessageChannelReady(this.f2055a);
            }
        }

        /* renamed from: androidx.browser.customtabs.c$b$d */
        /* loaded from: classes.dex */
        class d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f2057a;

            /* renamed from: b */
            final /* synthetic */ Bundle f2058b;

            d(String str, Bundle bundle) {
                this.f2057a = str;
                this.f2058b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f2047b.onPostMessage(this.f2057a, this.f2058b);
            }
        }

        /* renamed from: androidx.browser.customtabs.c$b$e */
        /* loaded from: classes.dex */
        class e implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f2060a;

            /* renamed from: b */
            final /* synthetic */ Uri f2061b;

            /* renamed from: c */
            final /* synthetic */ boolean f2062c;

            /* renamed from: d */
            final /* synthetic */ Bundle f2063d;

            e(int i10, Uri uri, boolean z10, Bundle bundle) {
                this.f2060a = i10;
                this.f2061b = uri;
                this.f2062c = z10;
                this.f2063d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f2047b.onRelationshipValidationResult(this.f2060a, this.f2061b, this.f2062c, this.f2063d);
            }
        }

        /* renamed from: androidx.browser.customtabs.c$b$f */
        /* loaded from: classes.dex */
        class f implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f2065a;

            /* renamed from: b */
            final /* synthetic */ int f2066b;

            /* renamed from: c */
            final /* synthetic */ Bundle f2067c;

            f(int i10, int i11, Bundle bundle) {
                this.f2065a = i10;
                this.f2066b = i11;
                this.f2067c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f2047b.onActivityResized(this.f2065a, this.f2066b, this.f2067c);
            }
        }

        b(C0392b c0392b) {
            this.f2047b = c0392b;
        }

        @Override // p017b.InterfaceC1590a
        /* renamed from: A */
        public Bundle mo2099A(String str, Bundle bundle) {
            C0392b c0392b = this.f2047b;
            if (c0392b == null) {
                return null;
            }
            return c0392b.extraCallbackWithResult(str, bundle);
        }

        @Override // p017b.InterfaceC1590a
        /* renamed from: H1 */
        public void mo2100H1(int i10, Bundle bundle) {
            if (this.f2047b == null) {
                return;
            }
            this.f2046a.post(new a(i10, bundle));
        }

        @Override // p017b.InterfaceC1590a
        /* renamed from: V */
        public void mo2101V(String str, Bundle bundle) {
            if (this.f2047b == null) {
                return;
            }
            this.f2046a.post(new RunnableC13153b(str, bundle));
        }

        @Override // p017b.InterfaceC1590a
        /* renamed from: V1 */
        public void mo2102V1(String str, Bundle bundle) {
            if (this.f2047b == null) {
                return;
            }
            this.f2046a.post(new d(str, bundle));
        }

        @Override // p017b.InterfaceC1590a
        /* renamed from: X1 */
        public void mo2103X1(Bundle bundle) {
            if (this.f2047b == null) {
                return;
            }
            this.f2046a.post(new c(bundle));
        }

        @Override // p017b.InterfaceC1590a
        /* renamed from: Z1 */
        public void mo2104Z1(int i10, Uri uri, boolean z10, Bundle bundle) {
            if (this.f2047b == null) {
                return;
            }
            this.f2046a.post(new e(i10, uri, z10, bundle));
        }

        @Override // p017b.InterfaceC1590a
        /* renamed from: r1 */
        public void mo2105r1(int i10, int i11, Bundle bundle) {
            if (this.f2047b == null) {
                return;
            }
            this.f2046a.post(new f(i10, i11, bundle));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0393c(InterfaceC1591b interfaceC1591b, ComponentName componentName, Context context) {
        this.f2042a = interfaceC1591b;
        this.f2043b = componentName;
        this.f2044c = context;
    }

    /* renamed from: a */
    public static boolean m2091a(Context context, String str, AbstractServiceConnectionC0395e abstractServiceConnectionC0395e) {
        abstractServiceConnectionC0395e.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, abstractServiceConnectionC0395e, 33);
    }

    /* renamed from: b */
    public static boolean m2092b(Context context, String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return m2091a(applicationContext, str, new a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private InterfaceC1590a.a m2093c(C0392b c0392b) {
        return new b(c0392b);
    }

    /* renamed from: d */
    public static String m2094d(Context context, List<String> list) {
        return m2095e(context, list, false);
    }

    /* renamed from: e */
    public static String m2095e(Context context, List<String> list, boolean z10) {
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

    /* renamed from: g */
    private C0399i m2096g(C0392b c0392b, PendingIntent pendingIntent) {
        boolean mo8839h1;
        InterfaceC1590a.a m2093c = m2093c(c0392b);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                mo8839h1 = this.f2042a.mo8837Z(m2093c, bundle);
            } else {
                mo8839h1 = this.f2042a.mo8839h1(m2093c);
            }
            if (mo8839h1) {
                return new C0399i(this.f2042a, m2093c, this.f2043b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public C0399i m2097f(C0392b c0392b) {
        return m2096g(c0392b, null);
    }

    /* renamed from: h */
    public boolean m2098h(long j10) {
        try {
            return this.f2042a.mo8838b1(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
