package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.browser.customtabs.C0391a;
import androidx.core.app.C0785d;
import androidx.core.app.C0800i;
import androidx.core.content.C0854a;
import java.util.ArrayList;

/* renamed from: androidx.browser.customtabs.d */
/* loaded from: classes.dex */
public final class C0394d {

    /* renamed from: a */
    public final Intent f2069a;

    /* renamed from: b */
    public final Bundle f2070b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.browser.customtabs.d$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static String m2109a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    /* renamed from: androidx.browser.customtabs.d$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: c */
        private ArrayList<Bundle> f2073c;

        /* renamed from: d */
        private Bundle f2074d;

        /* renamed from: e */
        private ArrayList<Bundle> f2075e;

        /* renamed from: f */
        private SparseArray<Bundle> f2076f;

        /* renamed from: g */
        private Bundle f2077g;

        /* renamed from: a */
        private final Intent f2071a = new Intent("android.intent.action.VIEW");

        /* renamed from: b */
        private final C0391a.a f2072b = new C0391a.a();

        /* renamed from: h */
        private int f2078h = 0;

        /* renamed from: i */
        private boolean f2079i = true;

        public b() {
        }

        public b(C0399i c0399i) {
            if (c0399i != null) {
                m2119i(c0399i);
            }
        }

        /* renamed from: d */
        private void m2110d() {
            String m2109a = a.m2109a();
            if (TextUtils.isEmpty(m2109a)) {
                return;
            }
            Bundle bundleExtra = this.f2071a.hasExtra("com.android.browser.headers") ? this.f2071a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", m2109a);
            this.f2071a.putExtra("com.android.browser.headers", bundleExtra);
        }

        /* renamed from: j */
        private void m2111j(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            C0800i.m4040b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f2071a.putExtras(bundle);
        }

        /* renamed from: a */
        public b m2112a(String str, PendingIntent pendingIntent) {
            if (this.f2073c == null) {
                this.f2073c = new ArrayList<>();
            }
            Bundle bundle = new Bundle();
            bundle.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", str);
            bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent);
            this.f2073c.add(bundle);
            return this;
        }

        /* renamed from: b */
        public C0394d m2113b() {
            if (!this.f2071a.hasExtra("android.support.customtabs.extra.SESSION")) {
                m2111j(null, null);
            }
            ArrayList<Bundle> arrayList = this.f2073c;
            if (arrayList != null) {
                this.f2071a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f2075e;
            if (arrayList2 != null) {
                this.f2071a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f2071a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f2079i);
            this.f2071a.putExtras(this.f2072b.m2086a().m2085a());
            Bundle bundle = this.f2077g;
            if (bundle != null) {
                this.f2071a.putExtras(bundle);
            }
            if (this.f2076f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f2076f);
                this.f2071a.putExtras(bundle2);
            }
            this.f2071a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f2078h);
            m2110d();
            return new C0394d(this.f2071a, this.f2074d);
        }

        /* renamed from: c */
        public b m2114c(Bitmap bitmap, String str, PendingIntent pendingIntent, boolean z10) {
            Bundle bundle = new Bundle();
            bundle.putInt("android.support.customtabs.customaction.ID", 0);
            bundle.putParcelable("android.support.customtabs.customaction.ICON", bitmap);
            bundle.putString("android.support.customtabs.customaction.DESCRIPTION", str);
            bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent);
            this.f2071a.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
            this.f2071a.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", z10);
            return this;
        }

        /* renamed from: e */
        public b m2115e(C0391a c0391a) {
            this.f2077g = c0391a.m2085a();
            return this;
        }

        /* renamed from: f */
        public b m2116f(Context context, int i10, int i11) {
            this.f2071a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", C0785d.m3948a(context, i10, i11).mo3949b());
            return this;
        }

        /* renamed from: g */
        public b m2117g(boolean z10) {
            this.f2079i = z10;
            return this;
        }

        /* renamed from: h */
        public b m2118h(RemoteViews remoteViews, int[] iArr, PendingIntent pendingIntent) {
            this.f2071a.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", remoteViews);
            this.f2071a.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", iArr);
            this.f2071a.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", pendingIntent);
            return this;
        }

        /* renamed from: i */
        public b m2119i(C0399i c0399i) {
            this.f2071a.setPackage(c0399i.m2129f().getPackageName());
            m2111j(c0399i.m2128e(), c0399i.m2130g());
            return this;
        }

        /* renamed from: k */
        public b m2120k(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.f2078h = i10;
            if (i10 == 1) {
                this.f2071a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            } else if (i10 == 2) {
                this.f2071a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
            } else {
                this.f2071a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            }
            return this;
        }

        /* renamed from: l */
        public b m2121l(boolean z10) {
            this.f2071a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z10 ? 1 : 0);
            return this;
        }

        /* renamed from: m */
        public b m2122m(Context context, int i10, int i11) {
            this.f2074d = C0785d.m3948a(context, i10, i11).mo3949b();
            return this;
        }

        /* renamed from: n */
        public b m2123n(boolean z10) {
            this.f2071a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", z10);
            return this;
        }
    }

    C0394d(Intent intent, Bundle bundle) {
        this.f2069a = intent;
        this.f2070b = bundle;
    }

    /* renamed from: a */
    public static int m2106a() {
        return 5;
    }

    /* renamed from: c */
    public static Intent m2107c(Intent intent) {
        if (intent == null) {
            intent = new Intent("android.intent.action.VIEW");
        }
        intent.addFlags(268435456);
        intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        return intent;
    }

    /* renamed from: b */
    public void m2108b(Context context, Uri uri) {
        this.f2069a.setData(uri);
        C0854a.startActivity(context, this.f2069a, this.f2070b);
    }
}
