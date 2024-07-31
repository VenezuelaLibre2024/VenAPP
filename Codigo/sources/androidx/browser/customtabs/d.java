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
import androidx.browser.customtabs.a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public final Intent f1766a;

    /* renamed from: b */
    public final Bundle f1767b;

    /* loaded from: classes.dex */
    public static class a {
        static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: c */
        private ArrayList<Bundle> f1770c;

        /* renamed from: d */
        private Bundle f1771d;

        /* renamed from: e */
        private ArrayList<Bundle> f1772e;

        /* renamed from: f */
        private SparseArray<Bundle> f1773f;

        /* renamed from: g */
        private Bundle f1774g;

        /* renamed from: a */
        private final Intent f1768a = new Intent("android.intent.action.VIEW");

        /* renamed from: b */
        private final a.C0023a f1769b = new a.C0023a();

        /* renamed from: h */
        private int f1775h = 0;

        /* renamed from: i */
        private boolean f1776i = true;

        public b() {
        }

        public b(i iVar) {
            if (iVar != null) {
                i(iVar);
            }
        }

        private void d() {
            String a10 = a.a();
            if (TextUtils.isEmpty(a10)) {
                return;
            }
            Bundle bundleExtra = this.f1768a.hasExtra("com.android.browser.headers") ? this.f1768a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", a10);
            this.f1768a.putExtra("com.android.browser.headers", bundleExtra);
        }

        private void j(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            androidx.core.app.i.b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f1768a.putExtras(bundle);
        }

        public b a(String str, PendingIntent pendingIntent) {
            if (this.f1770c == null) {
                this.f1770c = new ArrayList<>();
            }
            Bundle bundle = new Bundle();
            bundle.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", str);
            bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent);
            this.f1770c.add(bundle);
            return this;
        }

        public d b() {
            if (!this.f1768a.hasExtra("android.support.customtabs.extra.SESSION")) {
                j(null, null);
            }
            ArrayList<Bundle> arrayList = this.f1770c;
            if (arrayList != null) {
                this.f1768a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f1772e;
            if (arrayList2 != null) {
                this.f1768a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f1768a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f1776i);
            this.f1768a.putExtras(this.f1769b.a().a());
            Bundle bundle = this.f1774g;
            if (bundle != null) {
                this.f1768a.putExtras(bundle);
            }
            if (this.f1773f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f1773f);
                this.f1768a.putExtras(bundle2);
            }
            this.f1768a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f1775h);
            d();
            return new d(this.f1768a, this.f1771d);
        }

        public b c(Bitmap bitmap, String str, PendingIntent pendingIntent, boolean z10) {
            Bundle bundle = new Bundle();
            bundle.putInt("android.support.customtabs.customaction.ID", 0);
            bundle.putParcelable("android.support.customtabs.customaction.ICON", bitmap);
            bundle.putString("android.support.customtabs.customaction.DESCRIPTION", str);
            bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent);
            this.f1768a.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
            this.f1768a.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", z10);
            return this;
        }

        public b e(androidx.browser.customtabs.a aVar) {
            this.f1774g = aVar.a();
            return this;
        }

        public b f(Context context, int i10, int i11) {
            this.f1768a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", androidx.core.app.d.a(context, i10, i11).b());
            return this;
        }

        public b g(boolean z10) {
            this.f1776i = z10;
            return this;
        }

        public b h(RemoteViews remoteViews, int[] iArr, PendingIntent pendingIntent) {
            this.f1768a.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", remoteViews);
            this.f1768a.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", iArr);
            this.f1768a.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", pendingIntent);
            return this;
        }

        public b i(i iVar) {
            this.f1768a.setPackage(iVar.f().getPackageName());
            j(iVar.e(), iVar.g());
            return this;
        }

        public b k(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.f1775h = i10;
            if (i10 == 1) {
                this.f1768a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            } else if (i10 == 2) {
                this.f1768a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
            } else {
                this.f1768a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            }
            return this;
        }

        public b l(boolean z10) {
            this.f1768a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z10 ? 1 : 0);
            return this;
        }

        public b m(Context context, int i10, int i11) {
            this.f1771d = androidx.core.app.d.a(context, i10, i11).b();
            return this;
        }

        public b n(boolean z10) {
            this.f1768a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", z10);
            return this;
        }
    }

    d(Intent intent, Bundle bundle) {
        this.f1766a = intent;
        this.f1767b = bundle;
    }

    public static int a() {
        return 5;
    }

    public static Intent c(Intent intent) {
        if (intent == null) {
            intent = new Intent("android.intent.action.VIEW");
        }
        intent.addFlags(268435456);
        intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        return intent;
    }

    public void b(Context context, Uri uri) {
        this.f1766a.setData(uri);
        androidx.core.content.a.startActivity(context, this.f1766a, this.f1767b);
    }
}
