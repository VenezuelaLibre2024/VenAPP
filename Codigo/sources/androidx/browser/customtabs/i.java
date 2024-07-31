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
import b.c;
import java.util.List;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final Object f1787a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final b.b f1788b;

    /* renamed from: c, reason: collision with root package name */
    private final b.a f1789c;

    /* renamed from: d, reason: collision with root package name */
    private final ComponentName f1790d;

    /* renamed from: e, reason: collision with root package name */
    private final PendingIntent f1791e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends c.a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f1792a = new Handler(Looper.getMainLooper());

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f1793b;

        a(j jVar) {
            this.f1793b = jVar;
        }

        @Override // b.c
        public void onGreatestScrollPercentageIncreased(final int i10, final Bundle bundle) {
            Handler handler = this.f1792a;
            final j jVar = this.f1793b;
            handler.post(new Runnable() { // from class: androidx.browser.customtabs.h
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.onGreatestScrollPercentageIncreased(i10, bundle);
                }
            });
        }

        @Override // b.c
        public void onSessionEnded(final boolean z10, final Bundle bundle) {
            Handler handler = this.f1792a;
            final j jVar = this.f1793b;
            handler.post(new Runnable() { // from class: androidx.browser.customtabs.g
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.onSessionEnded(z10, bundle);
                }
            });
        }

        @Override // b.c
        public void onVerticalScrollEvent(final boolean z10, final Bundle bundle) {
            Handler handler = this.f1792a;
            final j jVar = this.f1793b;
            handler.post(new Runnable() { // from class: androidx.browser.customtabs.f
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.onVerticalScrollEvent(z10, bundle);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(b.b bVar, b.a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.f1788b = bVar;
        this.f1789c = aVar;
        this.f1790d = componentName;
        this.f1791e = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f1791e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    private c.a c(j jVar) {
        return new a(jVar);
    }

    private Bundle d(Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable("target_origin", uri);
        }
        if (this.f1791e != null) {
            a(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IBinder e() {
        return this.f1789c.asBinder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ComponentName f() {
        return this.f1790d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PendingIntent g() {
        return this.f1791e;
    }

    public boolean h(Bundle bundle) {
        try {
            return this.f1788b.y1(this.f1789c, bundle);
        } catch (SecurityException e10) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e10);
        }
    }

    public boolean i(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f1788b.U0(this.f1789c, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int j(String str, Bundle bundle) {
        int m10;
        Bundle b10 = b(bundle);
        synchronized (this.f1787a) {
            try {
                try {
                    m10 = this.f1788b.m(this.f1789c, str, b10);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m10;
    }

    public boolean k(Uri uri) {
        return l(uri, null, new Bundle());
    }

    public boolean l(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle d10 = d(uri2);
            if (d10 == null) {
                return this.f1788b.q1(this.f1789c, uri);
            }
            bundle.putAll(d10);
            return this.f1788b.j(this.f1789c, uri, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean m(Bitmap bitmap, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.customtabs.customaction.ICON", bitmap);
        bundle.putString("android.support.customtabs.customaction.DESCRIPTION", str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
        a(bundle);
        try {
            return this.f1788b.W(this.f1789c, bundle2);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean n(j jVar, Bundle bundle) {
        try {
            return this.f1788b.M(this.f1789c, c(jVar).asBinder(), bundle);
        } catch (SecurityException e10) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e10);
        }
    }

    public boolean o(RemoteViews remoteViews, int[] iArr, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", remoteViews);
        bundle.putIntArray("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", iArr);
        bundle.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", pendingIntent);
        a(bundle);
        try {
            return this.f1788b.W(this.f1789c, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean p(int i10, Uri uri, Bundle bundle) {
        if (i10 >= 1 && i10 <= 2) {
            try {
                return this.f1788b.C1(this.f1789c, i10, uri, b(bundle));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }
}
