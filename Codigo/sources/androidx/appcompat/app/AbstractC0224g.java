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
import androidx.appcompat.app.C0234q;
import androidx.appcompat.view.AbstractC0243b;
import androidx.appcompat.widget.C0382w1;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.C0732b;
import androidx.core.os.C0942a;
import androidx.core.os.C0949h;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: androidx.appcompat.app.g */
/* loaded from: classes.dex */
public abstract class AbstractC0224g {

    /* renamed from: a */
    static C0234q.a f864a = new C0234q.a(new C0234q.b());

    /* renamed from: b */
    private static int f865b = -100;

    /* renamed from: c */
    private static C0949h f866c = null;

    /* renamed from: d */
    private static C0949h f867d = null;

    /* renamed from: e */
    private static Boolean f868e = null;

    /* renamed from: f */
    private static boolean f869f = false;

    /* renamed from: r */
    private static final C0732b<WeakReference<AbstractC0224g>> f870r = new C0732b<>();

    /* renamed from: s */
    private static final Object f871s = new Object();

    /* renamed from: t */
    private static final Object f872t = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.g$a */
    /* loaded from: classes.dex */
    public static class a {
        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static LocaleList m958a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.g$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        static LocaleList m959a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public static void m960b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static void m916F(AbstractC0224g abstractC0224g) {
        synchronized (f871s) {
            m917G(abstractC0224g);
        }
    }

    /* renamed from: G */
    private static void m917G(AbstractC0224g abstractC0224g) {
        synchronized (f871s) {
            Iterator<WeakReference<AbstractC0224g>> it = f870r.iterator();
            while (it.hasNext()) {
                AbstractC0224g abstractC0224g2 = it.next().get();
                if (abstractC0224g2 == abstractC0224g || abstractC0224g2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: I */
    public static void m918I(boolean z10) {
        C0382w1.m2039c(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public static void m919R(final Context context) {
        if (m928v(context)) {
            if (C0942a.m4700d()) {
                if (f869f) {
                    return;
                }
                f864a.execute(new Runnable() { // from class: androidx.appcompat.app.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC0224g.m929w(context);
                    }
                });
                return;
            }
            synchronized (f872t) {
                C0949h c0949h = f866c;
                if (c0949h == null) {
                    if (f867d == null) {
                        f867d = C0949h.m4717b(C0234q.m1103b(context));
                    }
                    if (f867d.m4722f()) {
                    } else {
                        f866c = f867d;
                    }
                } else if (!c0949h.equals(f867d)) {
                    C0949h c0949h2 = f866c;
                    f867d = c0949h2;
                    C0234q.m1102a(context, c0949h2.m4724h());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m921d(AbstractC0224g abstractC0224g) {
        synchronized (f871s) {
            m917G(abstractC0224g);
            f870r.add(new WeakReference<>(abstractC0224g));
        }
    }

    /* renamed from: h */
    public static AbstractC0224g m922h(Activity activity, InterfaceC0222e interfaceC0222e) {
        return new LayoutInflaterFactory2C0225h(activity, interfaceC0222e);
    }

    /* renamed from: i */
    public static AbstractC0224g m923i(Dialog dialog, InterfaceC0222e interfaceC0222e) {
        return new LayoutInflaterFactory2C0225h(dialog, interfaceC0222e);
    }

    /* renamed from: k */
    public static C0949h m924k() {
        if (C0942a.m4700d()) {
            Object m926p = m926p();
            if (m926p != null) {
                return C0949h.m4720i(b.m959a(m926p));
            }
        } else {
            C0949h c0949h = f866c;
            if (c0949h != null) {
                return c0949h;
            }
        }
        return C0949h.m4719e();
    }

    /* renamed from: m */
    public static int m925m() {
        return f865b;
    }

    /* renamed from: p */
    static Object m926p() {
        Context mo948l;
        Iterator<WeakReference<AbstractC0224g>> it = f870r.iterator();
        while (it.hasNext()) {
            AbstractC0224g abstractC0224g = it.next().get();
            if (abstractC0224g != null && (mo948l = abstractC0224g.mo948l()) != null) {
                return mo948l.getSystemService("locale");
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static C0949h m927r() {
        return f866c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static boolean m928v(Context context) {
        if (f868e == null) {
            try {
                Bundle bundle = ServiceC0232o.m1100a(context).metaData;
                if (bundle != null) {
                    f868e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f868e = Boolean.FALSE;
            }
        }
        return f868e.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static /* synthetic */ void m929w(Context context) {
        C0234q.m1104c(context);
        f869f = true;
    }

    /* renamed from: A */
    public abstract void mo930A(Bundle bundle);

    /* renamed from: B */
    public abstract void mo931B();

    /* renamed from: C */
    public abstract void mo932C(Bundle bundle);

    /* renamed from: D */
    public abstract void mo933D();

    /* renamed from: E */
    public abstract void mo934E();

    /* renamed from: H */
    public abstract boolean mo935H(int i10);

    /* renamed from: J */
    public abstract void mo936J(int i10);

    /* renamed from: K */
    public abstract void mo937K(View view);

    /* renamed from: L */
    public abstract void mo938L(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: M */
    public void mo939M(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    /* renamed from: N */
    public abstract void mo940N(Toolbar toolbar);

    /* renamed from: O */
    public void mo941O(int i10) {
    }

    /* renamed from: P */
    public abstract void mo942P(CharSequence charSequence);

    /* renamed from: Q */
    public abstract AbstractC0243b mo943Q(AbstractC0243b.a aVar);

    /* renamed from: e */
    public abstract void mo944e(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    /* renamed from: f */
    public void m945f(Context context) {
    }

    /* renamed from: g */
    public Context mo946g(Context context) {
        m945f(context);
        return context;
    }

    /* renamed from: j */
    public abstract <T extends View> T mo947j(int i10);

    /* renamed from: l */
    public Context mo948l() {
        return null;
    }

    /* renamed from: n */
    public abstract InterfaceC0219b mo949n();

    /* renamed from: o */
    public int mo950o() {
        return -100;
    }

    /* renamed from: q */
    public abstract MenuInflater mo951q();

    /* renamed from: s */
    public abstract AbstractC0218a mo952s();

    /* renamed from: t */
    public abstract void mo953t();

    /* renamed from: u */
    public abstract void mo954u();

    /* renamed from: x */
    public abstract void mo955x(Configuration configuration);

    /* renamed from: y */
    public abstract void mo956y(Bundle bundle);

    /* renamed from: z */
    public abstract void mo957z();
}
