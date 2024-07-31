package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.q;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.w1;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    static q.a f765a = new q.a(new q.b());

    /* renamed from: b, reason: collision with root package name */
    private static int f766b = -100;

    /* renamed from: c, reason: collision with root package name */
    private static androidx.core.os.h f767c = null;

    /* renamed from: d, reason: collision with root package name */
    private static androidx.core.os.h f768d = null;

    /* renamed from: e, reason: collision with root package name */
    private static Boolean f769e = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f770f = false;

    /* renamed from: r, reason: collision with root package name */
    private static final androidx.collection.b<WeakReference<g>> f771r = new androidx.collection.b<>();

    /* renamed from: s, reason: collision with root package name */
    private static final Object f772s = new Object();

    /* renamed from: t, reason: collision with root package name */
    private static final Object f773t = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void F(g gVar) {
        synchronized (f772s) {
            G(gVar);
        }
    }

    private static void G(g gVar) {
        synchronized (f772s) {
            Iterator<WeakReference<g>> it = f771r.iterator();
            while (it.hasNext()) {
                g gVar2 = it.next().get();
                if (gVar2 == gVar || gVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public static void I(boolean z10) {
        w1.c(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void R(final Context context) {
        if (v(context)) {
            if (androidx.core.os.a.d()) {
                if (f770f) {
                    return;
                }
                f765a.execute(new Runnable() { // from class: androidx.appcompat.app.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.w(context);
                    }
                });
                return;
            }
            synchronized (f773t) {
                androidx.core.os.h hVar = f767c;
                if (hVar == null) {
                    if (f768d == null) {
                        f768d = androidx.core.os.h.b(q.b(context));
                    }
                    if (f768d.f()) {
                    } else {
                        f767c = f768d;
                    }
                } else if (!hVar.equals(f768d)) {
                    androidx.core.os.h hVar2 = f767c;
                    f768d = hVar2;
                    q.a(context, hVar2.h());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(g gVar) {
        synchronized (f772s) {
            G(gVar);
            f771r.add(new WeakReference<>(gVar));
        }
    }

    public static g h(Activity activity, e eVar) {
        return new h(activity, eVar);
    }

    public static g i(Dialog dialog, e eVar) {
        return new h(dialog, eVar);
    }

    public static androidx.core.os.h k() {
        if (androidx.core.os.a.d()) {
            Object p10 = p();
            if (p10 != null) {
                return androidx.core.os.h.i(b.a(p10));
            }
        } else {
            androidx.core.os.h hVar = f767c;
            if (hVar != null) {
                return hVar;
            }
        }
        return androidx.core.os.h.e();
    }

    public static int m() {
        return f766b;
    }

    static Object p() {
        Context l10;
        Iterator<WeakReference<g>> it = f771r.iterator();
        while (it.hasNext()) {
            g gVar = it.next().get();
            if (gVar != null && (l10 = gVar.l()) != null) {
                return l10.getSystemService("locale");
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static androidx.core.os.h r() {
        return f767c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean v(Context context) {
        if (f769e == null) {
            try {
                Bundle bundle = o.a(context).metaData;
                if (bundle != null) {
                    f769e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f769e = Boolean.FALSE;
            }
        }
        return f769e.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(Context context) {
        q.c(context);
        f770f = true;
    }

    public abstract void A(Bundle bundle);

    public abstract void B();

    public abstract void C(Bundle bundle);

    public abstract void D();

    public abstract void E();

    public abstract boolean H(int i10);

    public abstract void J(int i10);

    public abstract void K(View view);

    public abstract void L(View view, ViewGroup.LayoutParams layoutParams);

    public void M(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void N(Toolbar toolbar);

    public void O(int i10) {
    }

    public abstract void P(CharSequence charSequence);

    public abstract androidx.appcompat.view.b Q(b.a aVar);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    public void f(Context context) {
    }

    public Context g(Context context) {
        f(context);
        return context;
    }

    public abstract <T extends View> T j(int i10);

    public Context l() {
        return null;
    }

    public abstract androidx.appcompat.app.b n();

    public int o() {
        return -100;
    }

    public abstract MenuInflater q();

    public abstract androidx.appcompat.app.a s();

    public abstract void t();

    public abstract void u();

    public abstract void x(Configuration configuration);

    public abstract void y(Bundle bundle);

    public abstract void z();
}
