package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.widget.RemoteViews;
import java.util.List;
import p017b.InterfaceC1590a;
import p017b.InterfaceC1591b;
import p017b.InterfaceC1592c;

/* renamed from: androidx.browser.customtabs.i */
/* loaded from: classes.dex */
public final class C0399i {

    /* renamed from: a */
    private final Object f2090a = new Object();

    /* renamed from: b */
    private final InterfaceC1591b f2091b;

    /* renamed from: c */
    private final InterfaceC1590a f2092c;

    /* renamed from: d */
    private final ComponentName f2093d;

    /* renamed from: e */
    private final PendingIntent f2094e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.browser.customtabs.i$a */
    /* loaded from: classes.dex */
    public class a extends InterfaceC1592c.a {

        /* renamed from: a */
        private final Handler f2095a = new Handler(Looper.getMainLooper());

        /* renamed from: b */
        final /* synthetic */ InterfaceC0400j f2096b;

        a(InterfaceC0400j interfaceC0400j) {
            this.f2096b = interfaceC0400j;
        }

        @Override // p017b.InterfaceC1592c
        public void onGreatestScrollPercentageIncreased(final int i10, final Bundle bundle) {
            Handler handler = this.f2095a;
            final InterfaceC0400j interfaceC0400j = this.f2096b;
            handler.post(new Runnable() { // from class: androidx.browser.customtabs.h
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC0400j.this.onGreatestScrollPercentageIncreased(i10, bundle);
                }
            });
        }

        @Override // p017b.InterfaceC1592c
        public void onSessionEnded(final boolean z10, final Bundle bundle) {
            Handler handler = this.f2095a;
            final InterfaceC0400j interfaceC0400j = this.f2096b;
            handler.post(new Runnable() { // from class: androidx.browser.customtabs.g
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC0400j.this.onSessionEnded(z10, bundle);
                }
            });
        }

        @Override // p017b.InterfaceC1592c
        public void onVerticalScrollEvent(final boolean z10, final Bundle bundle) {
            Handler handler = this.f2095a;
            final InterfaceC0400j interfaceC0400j = this.f2096b;
            handler.post(new Runnable() { // from class: androidx.browser.customtabs.f
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC0400j.this.onVerticalScrollEvent(z10, bundle);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0399i(InterfaceC1591b interfaceC1591b, InterfaceC1590a interfaceC1590a, ComponentName componentName, PendingIntent pendingIntent) {
        this.f2091b = interfaceC1591b;
        this.f2092c = interfaceC1590a;
        this.f2093d = componentName;
        this.f2094e = pendingIntent;
    }

    /* renamed from: a */
    private void m2124a(Bundle bundle) {
        PendingIntent pendingIntent = this.f2094e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    /* renamed from: b */
    private Bundle m2125b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        m2124a(bundle2);
        return bundle2;
    }

    /* renamed from: c */
    private InterfaceC1592c.a m2126c(InterfaceC0400j interfaceC0400j) {
        return new a(interfaceC0400j);
    }

    /* renamed from: d */
    private Bundle m2127d(Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable("target_origin", uri);
        }
        if (this.f2094e != null) {
            m2124a(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public IBinder m2128e() {
        return this.f2092c.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public ComponentName m2129f() {
        return this.f2093d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public PendingIntent m2130g() {
        return this.f2094e;
    }

    /* renamed from: h */
    public boolean m2131h(Bundle bundle) {
        try {
            return this.f2091b.mo8843y1(this.f2092c, bundle);
        } catch (SecurityException e10) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e10);
        }
    }

    /* renamed from: i */
    public boolean m2132i(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f2091b.mo8835U0(this.f2092c, uri, m2125b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: j */
    public int m2133j(String str, Bundle bundle) {
        int mo8841m;
        Bundle m2125b = m2125b(bundle);
        synchronized (this.f2090a) {
            try {
                try {
                    mo8841m = this.f2091b.mo8841m(this.f2092c, str, m2125b);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mo8841m;
    }

    /* renamed from: k */
    public boolean m2134k(Uri uri) {
        return m2135l(uri, null, new Bundle());
    }

    /* renamed from: l */
    public boolean m2135l(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle m2127d = m2127d(uri2);
            if (m2127d == null) {
                return this.f2091b.mo8842q1(this.f2092c, uri);
            }
            bundle.putAll(m2127d);
            return this.f2091b.mo8840j(this.f2092c, uri, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: m */
    public boolean m2136m(Bitmap bitmap, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.customtabs.customaction.ICON", bitmap);
        bundle.putString("android.support.customtabs.customaction.DESCRIPTION", str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
        m2124a(bundle);
        try {
            return this.f2091b.mo8836W(this.f2092c, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: n */
    public boolean m2137n(InterfaceC0400j interfaceC0400j, Bundle bundle) {
        try {
            return this.f2091b.mo8834M(this.f2092c, m2126c(interfaceC0400j).asBinder(), bundle);
        } catch (SecurityException e10) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e10);
        }
    }

    /* renamed from: o */
    public boolean m2138o(RemoteViews remoteViews, int[] iArr, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", remoteViews);
        bundle.putIntArray("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", iArr);
        bundle.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", pendingIntent);
        m2124a(bundle);
        try {
            return this.f2091b.mo8836W(this.f2092c, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: p */
    public boolean m2139p(int i10, Uri uri, Bundle bundle) {
        if (i10 >= 1 && i10 <= 2) {
            try {
                return this.f2091b.mo8833C1(this.f2092c, i10, uri, m2125b(bundle));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }
}
