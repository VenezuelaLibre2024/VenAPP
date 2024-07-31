package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.AbstractC0243b;
import androidx.appcompat.view.C0245d;
import androidx.appcompat.view.C0247f;
import androidx.appcompat.view.C0248g;
import androidx.appcompat.view.WindowCallbackC0250i;
import androidx.appcompat.view.menu.C0258e;
import androidx.appcompat.view.menu.C0260g;
import androidx.appcompat.view.menu.InterfaceC0266m;
import androidx.appcompat.view.menu.InterfaceC0267n;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0341j;
import androidx.appcompat.widget.C0349l1;
import androidx.appcompat.widget.C0382w1;
import androidx.appcompat.widget.C0385x1;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.InterfaceC0354n0;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.C0738h;
import androidx.core.app.C0812m;
import androidx.core.content.C0854a;
import androidx.core.content.res.C0871f;
import androidx.core.os.C0949h;
import androidx.core.view.C1074n2;
import androidx.core.view.C1084p2;
import androidx.core.view.C1094r2;
import androidx.core.view.C1095s;
import androidx.core.view.C1099t;
import androidx.core.view.C1116x0;
import androidx.core.view.InterfaceC1096s0;
import androidx.lifecycle.AbstractC1300f;
import androidx.lifecycle.InterfaceC1310k;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import p111g.C7377a;
import p111g.C7379c;
import p111g.C7382f;
import p111g.C7383g;
import p111g.C7385i;
import p111g.C7386j;
import p125h.C7605a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.app.h */
/* loaded from: classes.dex */
public class LayoutInflaterFactory2C0225h extends AbstractC0224g implements C0260g.a, LayoutInflater.Factory2 {

    /* renamed from: u0 */
    private static final C0738h<String, Integer> f873u0 = new C0738h<>();

    /* renamed from: v0 */
    private static final boolean f874v0 = false;

    /* renamed from: w0 */
    private static final int[] f875w0 = {R.attr.windowBackground};

    /* renamed from: x0 */
    private static final boolean f876x0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: y0 */
    private static final boolean f877y0 = true;

    /* renamed from: A */
    MenuInflater f878A;

    /* renamed from: B */
    private CharSequence f879B;

    /* renamed from: C */
    private InterfaceC0354n0 f880C;

    /* renamed from: D */
    private h f881D;

    /* renamed from: E */
    private v f882E;

    /* renamed from: F */
    AbstractC0243b f883F;

    /* renamed from: G */
    ActionBarContextView f884G;

    /* renamed from: H */
    PopupWindow f885H;

    /* renamed from: I */
    Runnable f886I;

    /* renamed from: J */
    C1074n2 f887J;

    /* renamed from: K */
    private boolean f888K;

    /* renamed from: L */
    private boolean f889L;

    /* renamed from: M */
    ViewGroup f890M;

    /* renamed from: N */
    private TextView f891N;

    /* renamed from: O */
    private View f892O;

    /* renamed from: P */
    private boolean f893P;

    /* renamed from: Q */
    private boolean f894Q;

    /* renamed from: R */
    boolean f895R;

    /* renamed from: S */
    boolean f896S;

    /* renamed from: T */
    boolean f897T;

    /* renamed from: U */
    boolean f898U;

    /* renamed from: V */
    boolean f899V;

    /* renamed from: W */
    private boolean f900W;

    /* renamed from: X */
    private u[] f901X;

    /* renamed from: Y */
    private u f902Y;

    /* renamed from: Z */
    private boolean f903Z;

    /* renamed from: a0 */
    private boolean f904a0;

    /* renamed from: b0 */
    private boolean f905b0;

    /* renamed from: c0 */
    boolean f906c0;

    /* renamed from: d0 */
    private Configuration f907d0;

    /* renamed from: e0 */
    private int f908e0;

    /* renamed from: f0 */
    private int f909f0;

    /* renamed from: g0 */
    private int f910g0;

    /* renamed from: h0 */
    private boolean f911h0;

    /* renamed from: i0 */
    private q f912i0;

    /* renamed from: j0 */
    private q f913j0;

    /* renamed from: k0 */
    boolean f914k0;

    /* renamed from: l0 */
    int f915l0;

    /* renamed from: m0 */
    private final Runnable f916m0;

    /* renamed from: n0 */
    private boolean f917n0;

    /* renamed from: o0 */
    private Rect f918o0;

    /* renamed from: p0 */
    private Rect f919p0;

    /* renamed from: q0 */
    private C0231n f920q0;

    /* renamed from: r0 */
    private C0235r f921r0;

    /* renamed from: s0 */
    private OnBackInvokedDispatcher f922s0;

    /* renamed from: t0 */
    private OnBackInvokedCallback f923t0;

    /* renamed from: u */
    final Object f924u;

    /* renamed from: v */
    final Context f925v;

    /* renamed from: w */
    Window f926w;

    /* renamed from: x */
    private o f927x;

    /* renamed from: y */
    final InterfaceC0222e f928y;

    /* renamed from: z */
    AbstractC0218a f929z;

    /* renamed from: androidx.appcompat.app.h$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C0225h layoutInflaterFactory2C0225h = LayoutInflaterFactory2C0225h.this;
            if ((layoutInflaterFactory2C0225h.f915l0 & 1) != 0) {
                layoutInflaterFactory2C0225h.m1022j0(0);
            }
            LayoutInflaterFactory2C0225h layoutInflaterFactory2C0225h2 = LayoutInflaterFactory2C0225h.this;
            if ((layoutInflaterFactory2C0225h2.f915l0 & RecognitionOptions.AZTEC) != 0) {
                layoutInflaterFactory2C0225h2.m1022j0(108);
            }
            LayoutInflaterFactory2C0225h layoutInflaterFactory2C0225h3 = LayoutInflaterFactory2C0225h.this;
            layoutInflaterFactory2C0225h3.f914k0 = false;
            layoutInflaterFactory2C0225h3.f915l0 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.h$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC1096s0 {
        b() {
        }

        @Override // androidx.core.view.InterfaceC1096s0
        /* renamed from: a */
        public C1094r2 mo1030a(View view, C1094r2 c1094r2) {
            int m5147k = c1094r2.m5147k();
            int m1018f1 = LayoutInflaterFactory2C0225h.this.m1018f1(c1094r2, null);
            if (m5147k != m1018f1) {
                c1094r2 = c1094r2.m5150o(c1094r2.m5145i(), m1018f1, c1094r2.m5146j(), c1094r2.m5144h());
            }
            return C1116x0.m5249N(view, c1094r2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.h$c */
    /* loaded from: classes.dex */
    public class c implements ContentFrameLayout.InterfaceC0285a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0285a
        /* renamed from: a */
        public void mo1031a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0285a
        public void onDetachedFromWindow() {
            LayoutInflaterFactory2C0225h.this.m1020h0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.h$d */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: androidx.appcompat.app.h$d$a */
        /* loaded from: classes.dex */
        class a extends C1084p2 {
            a() {
            }

            @Override // androidx.core.view.InterfaceC1079o2
            /* renamed from: b */
            public void mo1032b(View view) {
                LayoutInflaterFactory2C0225h.this.f884G.setAlpha(1.0f);
                LayoutInflaterFactory2C0225h.this.f887J.m5073h(null);
                LayoutInflaterFactory2C0225h.this.f887J = null;
            }

            @Override // androidx.core.view.C1084p2, androidx.core.view.InterfaceC1079o2
            /* renamed from: c */
            public void mo1033c(View view) {
                LayoutInflaterFactory2C0225h.this.f884G.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C0225h layoutInflaterFactory2C0225h = LayoutInflaterFactory2C0225h.this;
            layoutInflaterFactory2C0225h.f885H.showAtLocation(layoutInflaterFactory2C0225h.f884G, 55, 0, 0);
            LayoutInflaterFactory2C0225h.this.m1023k0();
            if (!LayoutInflaterFactory2C0225h.this.m1007V0()) {
                LayoutInflaterFactory2C0225h.this.f884G.setAlpha(1.0f);
                LayoutInflaterFactory2C0225h.this.f884G.setVisibility(0);
            } else {
                LayoutInflaterFactory2C0225h.this.f884G.setAlpha(0.0f);
                LayoutInflaterFactory2C0225h layoutInflaterFactory2C0225h2 = LayoutInflaterFactory2C0225h.this;
                layoutInflaterFactory2C0225h2.f887J = C1116x0.m5266c(layoutInflaterFactory2C0225h2.f884G).m5068b(1.0f);
                LayoutInflaterFactory2C0225h.this.f887J.m5073h(new a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.h$e */
    /* loaded from: classes.dex */
    public class e extends C1084p2 {
        e() {
        }

        @Override // androidx.core.view.InterfaceC1079o2
        /* renamed from: b */
        public void mo1032b(View view) {
            LayoutInflaterFactory2C0225h.this.f884G.setAlpha(1.0f);
            LayoutInflaterFactory2C0225h.this.f887J.m5073h(null);
            LayoutInflaterFactory2C0225h.this.f887J = null;
        }

        @Override // androidx.core.view.C1084p2, androidx.core.view.InterfaceC1079o2
        /* renamed from: c */
        public void mo1033c(View view) {
            LayoutInflaterFactory2C0225h.this.f884G.setVisibility(0);
            if (LayoutInflaterFactory2C0225h.this.f884G.getParent() instanceof View) {
                C1116x0.m5255T((View) LayoutInflaterFactory2C0225h.this.f884G.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.h$f */
    /* loaded from: classes.dex */
    private class f implements InterfaceC0219b {
        f() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.h$g */
    /* loaded from: classes.dex */
    public interface g {
        /* renamed from: a */
        boolean mo1034a(int i10);

        View onCreatePanelView(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.h$h */
    /* loaded from: classes.dex */
    public final class h implements InterfaceC0266m.a {
        h() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0266m.a
        /* renamed from: b */
        public void mo1035b(C0260g c0260g, boolean z10) {
            LayoutInflaterFactory2C0225h.this.m1013a0(c0260g);
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0266m.a
        /* renamed from: c */
        public boolean mo1036c(C0260g c0260g) {
            Window.Callback m1029w0 = LayoutInflaterFactory2C0225h.this.m1029w0();
            if (m1029w0 == null) {
                return true;
            }
            m1029w0.onMenuOpened(108, c0260g);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.h$i */
    /* loaded from: classes.dex */
    public class i implements AbstractC0243b.a {

        /* renamed from: a */
        private AbstractC0243b.a f938a;

        /* renamed from: androidx.appcompat.app.h$i$a */
        /* loaded from: classes.dex */
        class a extends C1084p2 {
            a() {
            }

            @Override // androidx.core.view.InterfaceC1079o2
            /* renamed from: b */
            public void mo1032b(View view) {
                LayoutInflaterFactory2C0225h.this.f884G.setVisibility(8);
                LayoutInflaterFactory2C0225h layoutInflaterFactory2C0225h = LayoutInflaterFactory2C0225h.this;
                PopupWindow popupWindow = layoutInflaterFactory2C0225h.f885H;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0225h.f884G.getParent() instanceof View) {
                    C1116x0.m5255T((View) LayoutInflaterFactory2C0225h.this.f884G.getParent());
                }
                LayoutInflaterFactory2C0225h.this.f884G.m1417k();
                LayoutInflaterFactory2C0225h.this.f887J.m5073h(null);
                LayoutInflaterFactory2C0225h layoutInflaterFactory2C0225h2 = LayoutInflaterFactory2C0225h.this;
                layoutInflaterFactory2C0225h2.f887J = null;
                C1116x0.m5255T(layoutInflaterFactory2C0225h2.f890M);
            }
        }

        public i(AbstractC0243b.a aVar) {
            this.f938a = aVar;
        }

        @Override // androidx.appcompat.view.AbstractC0243b.a
        /* renamed from: a */
        public void mo1037a(AbstractC0243b abstractC0243b) {
            this.f938a.mo1037a(abstractC0243b);
            LayoutInflaterFactory2C0225h layoutInflaterFactory2C0225h = LayoutInflaterFactory2C0225h.this;
            if (layoutInflaterFactory2C0225h.f885H != null) {
                layoutInflaterFactory2C0225h.f926w.getDecorView().removeCallbacks(LayoutInflaterFactory2C0225h.this.f886I);
            }
            LayoutInflaterFactory2C0225h layoutInflaterFactory2C0225h2 = LayoutInflaterFactory2C0225h.this;
            if (layoutInflaterFactory2C0225h2.f884G != null) {
                layoutInflaterFactory2C0225h2.m1023k0();
                LayoutInflaterFactory2C0225h layoutInflaterFactory2C0225h3 = LayoutInflaterFactory2C0225h.this;
                layoutInflaterFactory2C0225h3.f887J = C1116x0.m5266c(layoutInflaterFactory2C0225h3.f884G).m5068b(0.0f);
                LayoutInflaterFactory2C0225h.this.f887J.m5073h(new a());
            }
            LayoutInflaterFactory2C0225h layoutInflaterFactory2C0225h4 = LayoutInflaterFactory2C0225h.this;
            InterfaceC0222e interfaceC0222e = layoutInflaterFactory2C0225h4.f928y;
            if (interfaceC0222e != null) {
                interfaceC0222e.onSupportActionModeFinished(layoutInflaterFactory2C0225h4.f883F);
            }
            LayoutInflaterFactory2C0225h layoutInflaterFactory2C0225h5 = LayoutInflaterFactory2C0225h.this;
            layoutInflaterFactory2C0225h5.f883F = null;
            C1116x0.m5255T(layoutInflaterFactory2C0225h5.f890M);
            LayoutInflaterFactory2C0225h.this.m1017d1();
        }

        @Override // androidx.appcompat.view.AbstractC0243b.a
        /* renamed from: b */
        public boolean mo1038b(AbstractC0243b abstractC0243b, Menu menu) {
            return this.f938a.mo1038b(abstractC0243b, menu);
        }

        @Override // androidx.appcompat.view.AbstractC0243b.a
        /* renamed from: c */
        public boolean mo1039c(AbstractC0243b abstractC0243b, MenuItem menuItem) {
            return this.f938a.mo1039c(abstractC0243b, menuItem);
        }

        @Override // androidx.appcompat.view.AbstractC0243b.a
        /* renamed from: d */
        public boolean mo1040d(AbstractC0243b abstractC0243b, Menu menu) {
            C1116x0.m5255T(LayoutInflaterFactory2C0225h.this.f890M);
            return this.f938a.mo1040d(abstractC0243b, menu);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.h$j */
    /* loaded from: classes.dex */
    public static class j {
        /* renamed from: a */
        static Context m1041a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        /* renamed from: b */
        static void m1042b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.densityDpi;
            int i11 = configuration2.densityDpi;
            if (i10 != i11) {
                configuration3.densityDpi = i11;
            }
        }

        /* renamed from: c */
        static void m1043c(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        /* renamed from: d */
        static void m1044d(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    /* renamed from: androidx.appcompat.app.h$k */
    /* loaded from: classes.dex */
    static class k {
        /* renamed from: a */
        static boolean m1045a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        /* renamed from: b */
        static String m1046b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.h$l */
    /* loaded from: classes.dex */
    public static class l {
        /* renamed from: a */
        static void m1047a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        /* renamed from: b */
        static C0949h m1048b(Configuration configuration) {
            return C0949h.m4717b(configuration.getLocales().toLanguageTags());
        }

        /* renamed from: c */
        public static void m1049c(C0949h c0949h) {
            LocaleList.setDefault(LocaleList.forLanguageTags(c0949h.m4724h()));
        }

        /* renamed from: d */
        static void m1050d(Configuration configuration, C0949h c0949h) {
            configuration.setLocales(LocaleList.forLanguageTags(c0949h.m4724h()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.h$m */
    /* loaded from: classes.dex */
    public static class m {
        /* renamed from: a */
        static void m1051a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            i10 = configuration.colorMode;
            int i18 = i10 & 3;
            i11 = configuration2.colorMode;
            if (i18 != (i11 & 3)) {
                i16 = configuration3.colorMode;
                i17 = configuration2.colorMode;
                configuration3.colorMode = i16 | (i17 & 3);
            }
            i12 = configuration.colorMode;
            int i19 = i12 & 12;
            i13 = configuration2.colorMode;
            if (i19 != (i13 & 12)) {
                i14 = configuration3.colorMode;
                i15 = configuration2.colorMode;
                configuration3.colorMode = i14 | (i15 & 12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.h$n */
    /* loaded from: classes.dex */
    public static class n {
        /* renamed from: a */
        static OnBackInvokedDispatcher m1052a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        /* renamed from: b */
        static OnBackInvokedCallback m1053b(Object obj, final LayoutInflaterFactory2C0225h layoutInflaterFactory2C0225h) {
            Objects.requireNonNull(layoutInflaterFactory2C0225h);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.k
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    LayoutInflaterFactory2C0225h.this.m996E0();
                }
            };
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        /* renamed from: c */
        static void m1054c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.h$o */
    /* loaded from: classes.dex */
    public class o extends WindowCallbackC0250i {

        /* renamed from: b */
        private g f941b;

        /* renamed from: c */
        private boolean f942c;

        /* renamed from: d */
        private boolean f943d;

        /* renamed from: e */
        private boolean f944e;

        o(Window.Callback callback) {
            super(callback);
        }

        /* renamed from: b */
        public boolean m1055b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f943d = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f943d = false;
            }
        }

        /* renamed from: c */
        public void m1056c(Window.Callback callback) {
            try {
                this.f942c = true;
                callback.onContentChanged();
            } finally {
                this.f942c = false;
            }
        }

        /* renamed from: d */
        public void m1057d(Window.Callback callback, int i10, Menu menu) {
            try {
                this.f944e = true;
                callback.onPanelClosed(i10, menu);
            } finally {
                this.f944e = false;
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackC0250i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f943d ? m1211a().dispatchKeyEvent(keyEvent) : LayoutInflaterFactory2C0225h.this.m1021i0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.WindowCallbackC0250i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || LayoutInflaterFactory2C0225h.this.m998H0(keyEvent.getKeyCode(), keyEvent);
        }

        /* renamed from: e */
        void m1058e(g gVar) {
            this.f941b = gVar;
        }

        /* renamed from: f */
        final ActionMode m1059f(ActionMode.Callback callback) {
            C0247f.a aVar = new C0247f.a(LayoutInflaterFactory2C0225h.this.f925v, callback);
            AbstractC0243b mo943Q = LayoutInflaterFactory2C0225h.this.mo943Q(aVar);
            if (mo943Q != null) {
                return aVar.m1189e(mo943Q);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f942c) {
                m1211a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackC0250i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof C0260g)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.WindowCallbackC0250i, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            View onCreatePanelView;
            g gVar = this.f941b;
            return (gVar == null || (onCreatePanelView = gVar.onCreatePanelView(i10)) == null) ? super.onCreatePanelView(i10) : onCreatePanelView;
        }

        @Override // androidx.appcompat.view.WindowCallbackC0250i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            LayoutInflaterFactory2C0225h.this.m1000K0(i10);
            return true;
        }

        @Override // androidx.appcompat.view.WindowCallbackC0250i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            if (this.f944e) {
                m1211a().onPanelClosed(i10, menu);
            } else {
                super.onPanelClosed(i10, menu);
                LayoutInflaterFactory2C0225h.this.m1001L0(i10);
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackC0250i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            C0260g c0260g = menu instanceof C0260g ? (C0260g) menu : null;
            if (i10 == 0 && c0260g == null) {
                return false;
            }
            if (c0260g != null) {
                c0260g.m1326b0(true);
            }
            g gVar = this.f941b;
            boolean z10 = gVar != null && gVar.mo1034a(i10);
            if (!z10) {
                z10 = super.onPreparePanel(i10, view, menu);
            }
            if (c0260g != null) {
                c0260g.m1326b0(false);
            }
            return z10;
        }

        @Override // androidx.appcompat.view.WindowCallbackC0250i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            C0260g c0260g;
            u m1027u0 = LayoutInflaterFactory2C0225h.this.m1027u0(0, true);
            if (m1027u0 == null || (c0260g = m1027u0.f963j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, c0260g, i10);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.WindowCallbackC0250i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (LayoutInflaterFactory2C0225h.this.m994C0() && i10 == 0) ? m1059f(callback) : super.onWindowStartingActionMode(callback, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.h$p */
    /* loaded from: classes.dex */
    public class p extends q {

        /* renamed from: c */
        private final PowerManager f946c;

        p(Context context) {
            super();
            this.f946c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0225h.q
        /* renamed from: b */
        IntentFilter mo1060b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0225h.q
        /* renamed from: c */
        public int mo1061c() {
            return k.m1045a(this.f946c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0225h.q
        /* renamed from: d */
        public void mo1062d() {
            LayoutInflaterFactory2C0225h.this.m1005U();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.h$q */
    /* loaded from: classes.dex */
    public abstract class q {

        /* renamed from: a */
        private BroadcastReceiver f948a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.h$q$a */
        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                q.this.mo1062d();
            }
        }

        q() {
        }

        /* renamed from: a */
        void m1063a() {
            BroadcastReceiver broadcastReceiver = this.f948a;
            if (broadcastReceiver != null) {
                try {
                    LayoutInflaterFactory2C0225h.this.f925v.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f948a = null;
            }
        }

        /* renamed from: b */
        abstract IntentFilter mo1060b();

        /* renamed from: c */
        abstract int mo1061c();

        /* renamed from: d */
        abstract void mo1062d();

        /* renamed from: e */
        void m1064e() {
            m1063a();
            IntentFilter mo1060b = mo1060b();
            if (mo1060b == null || mo1060b.countActions() == 0) {
                return;
            }
            if (this.f948a == null) {
                this.f948a = new a();
            }
            LayoutInflaterFactory2C0225h.this.f925v.registerReceiver(this.f948a, mo1060b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.h$r */
    /* loaded from: classes.dex */
    public class r extends q {

        /* renamed from: c */
        private final C0240w f951c;

        r(C0240w c0240w) {
            super();
            this.f951c = c0240w;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0225h.q
        /* renamed from: b */
        IntentFilter mo1060b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0225h.q
        /* renamed from: c */
        public int mo1061c() {
            return this.f951c.m1128d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0225h.q
        /* renamed from: d */
        public void mo1062d() {
            LayoutInflaterFactory2C0225h.this.m1005U();
        }
    }

    /* renamed from: androidx.appcompat.app.h$s */
    /* loaded from: classes.dex */
    private static class s {
        /* renamed from: a */
        static void m1065a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.h$t */
    /* loaded from: classes.dex */
    public class t extends ContentFrameLayout {
        public t(Context context) {
            super(context);
        }

        /* renamed from: b */
        private boolean m1066b(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C0225h.this.m1021i0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m1066b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            LayoutInflaterFactory2C0225h.this.m1015c0(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(C7605a.m23112b(getContext(), i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.appcompat.app.h$u */
    /* loaded from: classes.dex */
    public static final class u {

        /* renamed from: a */
        int f954a;

        /* renamed from: b */
        int f955b;

        /* renamed from: c */
        int f956c;

        /* renamed from: d */
        int f957d;

        /* renamed from: e */
        int f958e;

        /* renamed from: f */
        int f959f;

        /* renamed from: g */
        ViewGroup f960g;

        /* renamed from: h */
        View f961h;

        /* renamed from: i */
        View f962i;

        /* renamed from: j */
        C0260g f963j;

        /* renamed from: k */
        C0258e f964k;

        /* renamed from: l */
        Context f965l;

        /* renamed from: m */
        boolean f966m;

        /* renamed from: n */
        boolean f967n;

        /* renamed from: o */
        boolean f968o;

        /* renamed from: p */
        public boolean f969p;

        /* renamed from: q */
        boolean f970q = false;

        /* renamed from: r */
        boolean f971r;

        /* renamed from: s */
        Bundle f972s;

        u(int i10) {
            this.f954a = i10;
        }

        /* renamed from: a */
        InterfaceC0267n m1067a(InterfaceC0266m.a aVar) {
            if (this.f963j == null) {
                return null;
            }
            if (this.f964k == null) {
                C0258e c0258e = new C0258e(this.f965l, C7383g.f16844j);
                this.f964k = c0258e;
                c0258e.mo1244d(aVar);
                this.f963j.m1325b(this.f964k);
            }
            return this.f964k.m1285j(this.f960g);
        }

        /* renamed from: b */
        public boolean m1068b() {
            if (this.f961h == null) {
                return false;
            }
            return this.f962i != null || this.f964k.m1284a().getCount() > 0;
        }

        /* renamed from: c */
        void m1069c(C0260g c0260g) {
            C0258e c0258e;
            C0260g c0260g2 = this.f963j;
            if (c0260g == c0260g2) {
                return;
            }
            if (c0260g2 != null) {
                c0260g2.m1312O(this.f964k);
            }
            this.f963j = c0260g;
            if (c0260g == null || (c0258e = this.f964k) == null) {
                return;
            }
            c0260g.m1325b(c0258e);
        }

        /* renamed from: d */
        void m1070d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C7377a.f16697a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                newTheme.applyStyle(i10, true);
            }
            newTheme.resolveAttribute(C7377a.f16688E, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 == 0) {
                i11 = C7385i.f16868b;
            }
            newTheme.applyStyle(i11, true);
            C0245d c0245d = new C0245d(context, 0);
            c0245d.getTheme().setTo(newTheme);
            this.f965l = c0245d;
            TypedArray obtainStyledAttributes = c0245d.obtainStyledAttributes(C7386j.f17100y0);
            this.f955b = obtainStyledAttributes.getResourceId(C7386j.f16878B0, 0);
            this.f959f = obtainStyledAttributes.getResourceId(C7386j.f16873A0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.h$v */
    /* loaded from: classes.dex */
    public final class v implements InterfaceC0266m.a {
        v() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0266m.a
        /* renamed from: b */
        public void mo1035b(C0260g c0260g, boolean z10) {
            C0260g mo1302D = c0260g.mo1302D();
            boolean z11 = mo1302D != c0260g;
            LayoutInflaterFactory2C0225h layoutInflaterFactory2C0225h = LayoutInflaterFactory2C0225h.this;
            if (z11) {
                c0260g = mo1302D;
            }
            u m1024n0 = layoutInflaterFactory2C0225h.m1024n0(c0260g);
            if (m1024n0 != null) {
                if (!z11) {
                    LayoutInflaterFactory2C0225h.this.m1016d0(m1024n0, z10);
                } else {
                    LayoutInflaterFactory2C0225h.this.m1011Z(m1024n0.f954a, m1024n0, mo1302D);
                    LayoutInflaterFactory2C0225h.this.m1016d0(m1024n0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0266m.a
        /* renamed from: c */
        public boolean mo1036c(C0260g c0260g) {
            Window.Callback m1029w0;
            if (c0260g != c0260g.mo1302D()) {
                return true;
            }
            LayoutInflaterFactory2C0225h layoutInflaterFactory2C0225h = LayoutInflaterFactory2C0225h.this;
            if (!layoutInflaterFactory2C0225h.f895R || (m1029w0 = layoutInflaterFactory2C0225h.m1029w0()) == null || LayoutInflaterFactory2C0225h.this.f906c0) {
                return true;
            }
            m1029w0.onMenuOpened(108, c0260g);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflaterFactory2C0225h(Activity activity, InterfaceC0222e interfaceC0222e) {
        this(activity, null, interfaceC0222e, activity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflaterFactory2C0225h(Dialog dialog, InterfaceC0222e interfaceC0222e) {
        this(dialog.getContext(), dialog.getWindow(), interfaceC0222e, dialog);
    }

    private LayoutInflaterFactory2C0225h(Context context, Window window, InterfaceC0222e interfaceC0222e, Object obj) {
        C0738h<String, Integer> c0738h;
        Integer num;
        ActivityC0221d m977a1;
        this.f887J = null;
        this.f888K = true;
        this.f908e0 = -100;
        this.f916m0 = new a();
        this.f925v = context;
        this.f928y = interfaceC0222e;
        this.f924u = obj;
        if (this.f908e0 == -100 && (obj instanceof Dialog) && (m977a1 = m977a1()) != null) {
            this.f908e0 = m977a1.getDelegate().mo950o();
        }
        if (this.f908e0 == -100 && (num = (c0738h = f873u0).get(obj.getClass().getName())) != null) {
            this.f908e0 = num.intValue();
            c0738h.remove(obj.getClass().getName());
        }
        if (window != null) {
            m973W(window);
        }
        C0341j.m1783h();
    }

    /* renamed from: A0 */
    private boolean m961A0(u uVar) {
        Resources.Theme theme;
        Context context = this.f925v;
        int i10 = uVar.f954a;
        if ((i10 == 0 || i10 == 108) && this.f880C != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(C7377a.f16702f, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(C7377a.f16703g, typedValue, true);
            } else {
                theme2.resolveAttribute(C7377a.f16703g, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                C0245d c0245d = new C0245d(context, 0);
                c0245d.getTheme().setTo(theme);
                context = c0245d;
            }
        }
        C0260g c0260g = new C0260g(context);
        c0260g.mo1315R(this);
        uVar.m1069c(c0260g);
        return true;
    }

    /* renamed from: B0 */
    private void m962B0(int i10) {
        this.f915l0 = (1 << i10) | this.f915l0;
        if (this.f914k0) {
            return;
        }
        C1116x0.m5253R(this.f926w.getDecorView(), this.f916m0);
        this.f914k0 = true;
    }

    /* renamed from: G0 */
    private boolean m963G0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        u m1027u0 = m1027u0(i10, true);
        if (m1027u0.f968o) {
            return false;
        }
        return m967Q0(m1027u0, keyEvent);
    }

    /* renamed from: J0 */
    private boolean m964J0(int i10, KeyEvent keyEvent) {
        boolean z10;
        InterfaceC0354n0 interfaceC0354n0;
        if (this.f883F != null) {
            return false;
        }
        boolean z11 = true;
        u m1027u0 = m1027u0(i10, true);
        if (i10 != 0 || (interfaceC0354n0 = this.f880C) == null || !interfaceC0354n0.mo1427a() || ViewConfiguration.get(this.f925v).hasPermanentMenuKey()) {
            boolean z12 = m1027u0.f968o;
            if (z12 || m1027u0.f967n) {
                m1016d0(m1027u0, true);
                z11 = z12;
            } else {
                if (m1027u0.f966m) {
                    if (m1027u0.f971r) {
                        m1027u0.f966m = false;
                        z10 = m967Q0(m1027u0, keyEvent);
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        m965N0(m1027u0, keyEvent);
                    }
                }
                z11 = false;
            }
        } else if (this.f880C.mo1431e()) {
            z11 = this.f880C.mo1428b();
        } else {
            if (!this.f906c0 && m967Q0(m1027u0, keyEvent)) {
                z11 = this.f880C.mo1429c();
            }
            z11 = false;
        }
        if (z11) {
            AudioManager audioManager = (AudioManager) this.f925v.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* renamed from: N0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m965N0(androidx.appcompat.app.LayoutInflaterFactory2C0225h.u r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0225h.m965N0(androidx.appcompat.app.h$u, android.view.KeyEvent):void");
    }

    /* renamed from: P0 */
    private boolean m966P0(u uVar, int i10, KeyEvent keyEvent, int i11) {
        C0260g c0260g;
        boolean z10 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((uVar.f966m || m967Q0(uVar, keyEvent)) && (c0260g = uVar.f963j) != null) {
            z10 = c0260g.performShortcut(i10, keyEvent, i11);
        }
        if (z10 && (i11 & 1) == 0 && this.f880C == null) {
            m1016d0(uVar, true);
        }
        return z10;
    }

    /* renamed from: Q0 */
    private boolean m967Q0(u uVar, KeyEvent keyEvent) {
        InterfaceC0354n0 interfaceC0354n0;
        InterfaceC0354n0 interfaceC0354n02;
        InterfaceC0354n0 interfaceC0354n03;
        if (this.f906c0) {
            return false;
        }
        if (uVar.f966m) {
            return true;
        }
        u uVar2 = this.f902Y;
        if (uVar2 != null && uVar2 != uVar) {
            m1016d0(uVar2, false);
        }
        Window.Callback m1029w0 = m1029w0();
        if (m1029w0 != null) {
            uVar.f962i = m1029w0.onCreatePanelView(uVar.f954a);
        }
        int i10 = uVar.f954a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (interfaceC0354n03 = this.f880C) != null) {
            interfaceC0354n03.mo1432f();
        }
        if (uVar.f962i == null && (!z10 || !(m1003O0() instanceof C0238u))) {
            C0260g c0260g = uVar.f963j;
            if (c0260g == null || uVar.f971r) {
                if (c0260g == null && (!m961A0(uVar) || uVar.f963j == null)) {
                    return false;
                }
                if (z10 && this.f880C != null) {
                    if (this.f881D == null) {
                        this.f881D = new h();
                    }
                    this.f880C.mo1430d(uVar.f963j, this.f881D);
                }
                uVar.f963j.m1331e0();
                if (!m1029w0.onCreatePanelMenu(uVar.f954a, uVar.f963j)) {
                    uVar.m1069c(null);
                    if (z10 && (interfaceC0354n0 = this.f880C) != null) {
                        interfaceC0354n0.mo1430d(null, this.f881D);
                    }
                    return false;
                }
                uVar.f971r = false;
            }
            uVar.f963j.m1331e0();
            Bundle bundle = uVar.f972s;
            if (bundle != null) {
                uVar.f963j.m1313P(bundle);
                uVar.f972s = null;
            }
            if (!m1029w0.onPreparePanel(0, uVar.f962i, uVar.f963j)) {
                if (z10 && (interfaceC0354n02 = this.f880C) != null) {
                    interfaceC0354n02.mo1430d(null, this.f881D);
                }
                uVar.f963j.m1329d0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            uVar.f969p = z11;
            uVar.f963j.setQwertyMode(z11);
            uVar.f963j.m1329d0();
        }
        uVar.f966m = true;
        uVar.f967n = false;
        this.f902Y = uVar;
        return true;
    }

    /* renamed from: R0 */
    private void m968R0(boolean z10) {
        InterfaceC0354n0 interfaceC0354n0 = this.f880C;
        if (interfaceC0354n0 == null || !interfaceC0354n0.mo1427a() || (ViewConfiguration.get(this.f925v).hasPermanentMenuKey() && !this.f880C.mo1433h())) {
            u m1027u0 = m1027u0(0, true);
            m1027u0.f970q = true;
            m1016d0(m1027u0, false);
            m965N0(m1027u0, null);
            return;
        }
        Window.Callback m1029w0 = m1029w0();
        if (this.f880C.mo1431e() && z10) {
            this.f880C.mo1428b();
            if (this.f906c0) {
                return;
            }
            m1029w0.onPanelClosed(108, m1027u0(0, true).f963j);
            return;
        }
        if (m1029w0 == null || this.f906c0) {
            return;
        }
        if (this.f914k0 && (this.f915l0 & 1) != 0) {
            this.f926w.getDecorView().removeCallbacks(this.f916m0);
            this.f916m0.run();
        }
        u m1027u02 = m1027u0(0, true);
        C0260g c0260g = m1027u02.f963j;
        if (c0260g == null || m1027u02.f971r || !m1029w0.onPreparePanel(0, m1027u02.f962i, c0260g)) {
            return;
        }
        m1029w0.onMenuOpened(108, m1027u02.f963j);
        this.f880C.mo1429c();
    }

    /* renamed from: S */
    private boolean m969S(boolean z10) {
        return m971T(z10, true);
    }

    /* renamed from: S0 */
    private int m970S0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i10 != 9) {
            return i10;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    /* renamed from: T */
    private boolean m971T(boolean z10, boolean z11) {
        if (this.f906c0) {
            return false;
        }
        int m975Y = m975Y();
        int m995D0 = m995D0(this.f925v, m975Y);
        C0949h m1008X = Build.VERSION.SDK_INT < 33 ? m1008X(this.f925v) : null;
        if (!z11 && m1008X != null) {
            m1008X = m1026t0(this.f925v.getResources().getConfiguration());
        }
        boolean m980c1 = m980c1(m995D0, m1008X, z10);
        if (m975Y == 0) {
            m990s0(this.f925v).m1064e();
        } else {
            q qVar = this.f912i0;
            if (qVar != null) {
                qVar.m1063a();
            }
        }
        if (m975Y == 3) {
            m989r0(this.f925v).m1064e();
        } else {
            q qVar2 = this.f913j0;
            if (qVar2 != null) {
                qVar2.m1063a();
            }
        }
        return m980c1;
    }

    /* renamed from: V */
    private void m972V() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f890M.findViewById(R.id.content);
        View decorView = this.f926w.getDecorView();
        contentFrameLayout.m1465a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f925v.obtainStyledAttributes(C7386j.f17100y0);
        obtainStyledAttributes.getValue(C7386j.f16916K0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C7386j.f16920L0, contentFrameLayout.getMinWidthMinor());
        int i10 = C7386j.f16908I0;
        if (obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = C7386j.f16912J0;
        if (obtainStyledAttributes.hasValue(i11)) {
            obtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = C7386j.f16900G0;
        if (obtainStyledAttributes.hasValue(i12)) {
            obtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = C7386j.f16904H0;
        if (obtainStyledAttributes.hasValue(i13)) {
            obtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: W */
    private void m973W(Window window) {
        if (this.f926w != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof o) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        o oVar = new o(callback);
        this.f927x = oVar;
        window.setCallback(oVar);
        C0349l1 m1844t = C0349l1.m1844t(this.f925v, null, f875w0);
        Drawable m1852g = m1844t.m1852g(0);
        if (m1852g != null) {
            window.setBackgroundDrawable(m1852g);
        }
        m1844t.m1864v();
        this.f926w = window;
        if (Build.VERSION.SDK_INT < 33 || this.f922s0 != null) {
            return;
        }
        mo939M(null);
    }

    /* renamed from: W0 */
    private boolean m974W0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f926w.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C1116x0.m5242G((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: Y */
    private int m975Y() {
        int i10 = this.f908e0;
        return i10 != -100 ? i10 : AbstractC0224g.m925m();
    }

    /* renamed from: Z0 */
    private void m976Z0() {
        if (this.f889L) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: a1 */
    private ActivityC0221d m977a1() {
        for (Context context = this.f925v; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof ActivityC0221d) {
                return (ActivityC0221d) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* renamed from: b0 */
    private void m978b0() {
        q qVar = this.f912i0;
        if (qVar != null) {
            qVar.m1063a();
        }
        q qVar2 = this.f913j0;
        if (qVar2 != null) {
            qVar2.m1063a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b1 */
    private void m979b1(Configuration configuration) {
        Activity activity = (Activity) this.f924u;
        if (activity instanceof InterfaceC1310k) {
            if (!((InterfaceC1310k) activity).getLifecycle().mo7315b().m7325h(AbstractC1300f.b.CREATED)) {
                return;
            }
        } else if (!this.f905b0 || this.f906c0) {
            return;
        }
        activity.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* renamed from: c1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m980c1(int r9, androidx.core.os.C0949h r10, boolean r11) {
        /*
            r8 = this;
            android.content.Context r1 = r8.f925v
            r4 = 0
            r5 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            android.content.res.Configuration r0 = r0.m981e0(r1, r2, r3, r4, r5)
            android.content.Context r1 = r8.f925v
            int r1 = r8.m988q0(r1)
            android.content.res.Configuration r2 = r8.f907d0
            if (r2 != 0) goto L1f
            android.content.Context r2 = r8.f925v
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L1f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            androidx.core.os.h r2 = r8.m1026t0(r2)
            r5 = 0
            if (r10 != 0) goto L30
            r0 = r5
            goto L34
        L30:
            androidx.core.os.h r0 = r8.m1026t0(r0)
        L34:
            r6 = 0
            if (r3 == r4) goto L3a
            r3 = 512(0x200, float:7.17E-43)
            goto L3b
        L3a:
            r3 = r6
        L3b:
            if (r0 == 0) goto L47
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L47
            r2 = r3 | 4
            r3 = r2 | 8192(0x2000, float:1.148E-41)
        L47:
            int r2 = ~r1
            r2 = r2 & r3
            r7 = 1
            if (r2 == 0) goto L71
            if (r11 == 0) goto L71
            boolean r11 = r8.f904a0
            if (r11 == 0) goto L71
            boolean r11 = androidx.appcompat.app.LayoutInflaterFactory2C0225h.f876x0
            if (r11 != 0) goto L5a
            boolean r11 = r8.f905b0
            if (r11 == 0) goto L71
        L5a:
            java.lang.Object r11 = r8.f924u
            boolean r2 = r11 instanceof android.app.Activity
            if (r2 == 0) goto L71
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r11 = r11.isChild()
            if (r11 != 0) goto L71
            java.lang.Object r11 = r8.f924u
            android.app.Activity r11 = (android.app.Activity) r11
            androidx.core.app.C0777b.m3915f(r11)
            r11 = r7
            goto L72
        L71:
            r11 = r6
        L72:
            if (r11 != 0) goto L7f
            if (r3 == 0) goto L7f
            r11 = r3 & r1
            if (r11 != r3) goto L7b
            r6 = r7
        L7b:
            r8.m982e1(r4, r0, r6, r5)
            goto L80
        L7f:
            r7 = r11
        L80:
            if (r7 == 0) goto L9c
            java.lang.Object r11 = r8.f924u
            boolean r1 = r11 instanceof androidx.appcompat.app.ActivityC0221d
            if (r1 == 0) goto L9c
            r1 = r3 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L91
            androidx.appcompat.app.d r11 = (androidx.appcompat.app.ActivityC0221d) r11
            r11.onNightModeChanged(r9)
        L91:
            r9 = r3 & 4
            if (r9 == 0) goto L9c
            java.lang.Object r9 = r8.f924u
            androidx.appcompat.app.d r9 = (androidx.appcompat.app.ActivityC0221d) r9
            r9.onLocalesChanged(r10)
        L9c:
            if (r7 == 0) goto Lb1
            if (r0 == 0) goto Lb1
            android.content.Context r9 = r8.f925v
            android.content.res.Resources r9 = r9.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            androidx.core.os.h r9 = r8.m1026t0(r9)
            r8.m1006U0(r9)
        Lb1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0225h.m980c1(int, androidx.core.os.h, boolean):boolean");
    }

    /* renamed from: e0 */
    private Configuration m981e0(Context context, int i10, C0949h c0949h, Configuration configuration, boolean z10) {
        int i11 = i10 != 1 ? i10 != 2 ? z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (c0949h != null) {
            m1004T0(configuration2, c0949h);
        }
        return configuration2;
    }

    /* renamed from: e1 */
    private void m982e1(int i10, C0949h c0949h, boolean z10, Configuration configuration) {
        Resources resources = this.f925v.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        if (c0949h != null) {
            m1004T0(configuration2, c0949h);
        }
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            C0237t.m1114a(resources);
        }
        int i11 = this.f909f0;
        if (i11 != 0) {
            this.f925v.setTheme(i11);
            this.f925v.getTheme().applyStyle(this.f909f0, true);
        }
        if (z10 && (this.f924u instanceof Activity)) {
            m979b1(configuration2);
        }
    }

    /* renamed from: f0 */
    private ViewGroup m983f0() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f925v.obtainStyledAttributes(C7386j.f17100y0);
        int i10 = C7386j.f16888D0;
        if (!obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(C7386j.f16924M0, false)) {
            mo935H(1);
        } else if (obtainStyledAttributes.getBoolean(i10, false)) {
            mo935H(108);
        }
        if (obtainStyledAttributes.getBoolean(C7386j.f16892E0, false)) {
            mo935H(109);
        }
        if (obtainStyledAttributes.getBoolean(C7386j.f16896F0, false)) {
            mo935H(10);
        }
        this.f898U = obtainStyledAttributes.getBoolean(C7386j.f17105z0, false);
        obtainStyledAttributes.recycle();
        m986m0();
        this.f926w.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f925v);
        if (this.f899V) {
            viewGroup = (ViewGroup) from.inflate(this.f897T ? C7383g.f16849o : C7383g.f16848n, (ViewGroup) null);
        } else if (this.f898U) {
            viewGroup = (ViewGroup) from.inflate(C7383g.f16840f, (ViewGroup) null);
            this.f896S = false;
            this.f895R = false;
        } else if (this.f895R) {
            TypedValue typedValue = new TypedValue();
            this.f925v.getTheme().resolveAttribute(C7377a.f16702f, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0245d(this.f925v, typedValue.resourceId) : this.f925v).inflate(C7383g.f16850p, (ViewGroup) null);
            InterfaceC0354n0 interfaceC0354n0 = (InterfaceC0354n0) viewGroup.findViewById(C7382f.f16824p);
            this.f880C = interfaceC0354n0;
            interfaceC0354n0.setWindowCallback(m1029w0());
            if (this.f896S) {
                this.f880C.mo1434i(109);
            }
            if (this.f893P) {
                this.f880C.mo1434i(2);
            }
            if (this.f894Q) {
                this.f880C.mo1434i(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f895R + ", windowActionBarOverlay: " + this.f896S + ", android:windowIsFloating: " + this.f898U + ", windowActionModeOverlay: " + this.f897T + ", windowNoTitle: " + this.f899V + " }");
        }
        C1116x0.m5277h0(viewGroup, new b());
        if (this.f880C == null) {
            this.f891N = (TextView) viewGroup.findViewById(C7382f.f16805M);
        }
        C0385x1.m2048c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C7382f.f16810b);
        ViewGroup viewGroup2 = (ViewGroup) this.f926w.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f926w.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    /* renamed from: g1 */
    private void m984g1(View view) {
        Context context;
        int i10;
        if ((C1116x0.m5237B(view) & 8192) != 0) {
            context = this.f925v;
            i10 = C7379c.f16726b;
        } else {
            context = this.f925v;
            i10 = C7379c.f16725a;
        }
        view.setBackgroundColor(C0854a.getColor(context, i10));
    }

    /* renamed from: l0 */
    private void m985l0() {
        if (this.f889L) {
            return;
        }
        this.f890M = m983f0();
        CharSequence m1028v0 = m1028v0();
        if (!TextUtils.isEmpty(m1028v0)) {
            InterfaceC0354n0 interfaceC0354n0 = this.f880C;
            if (interfaceC0354n0 != null) {
                interfaceC0354n0.setWindowTitle(m1028v0);
            } else if (m1003O0() != null) {
                m1003O0().mo896x(m1028v0);
            } else {
                TextView textView = this.f891N;
                if (textView != null) {
                    textView.setText(m1028v0);
                }
            }
        }
        m972V();
        m1002M0(this.f890M);
        this.f889L = true;
        u m1027u0 = m1027u0(0, false);
        if (this.f906c0) {
            return;
        }
        if (m1027u0 == null || m1027u0.f963j == null) {
            m962B0(108);
        }
    }

    /* renamed from: m0 */
    private void m986m0() {
        if (this.f926w == null) {
            Object obj = this.f924u;
            if (obj instanceof Activity) {
                m973W(((Activity) obj).getWindow());
            }
        }
        if (this.f926w == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: o0 */
    private static Configuration m987o0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            int i14 = Build.VERSION.SDK_INT;
            l.m1047a(configuration, configuration2, configuration3);
            int i15 = configuration.touchscreen;
            int i16 = configuration2.touchscreen;
            if (i15 != i16) {
                configuration3.touchscreen = i16;
            }
            int i17 = configuration.keyboard;
            int i18 = configuration2.keyboard;
            if (i17 != i18) {
                configuration3.keyboard = i18;
            }
            int i19 = configuration.keyboardHidden;
            int i20 = configuration2.keyboardHidden;
            if (i19 != i20) {
                configuration3.keyboardHidden = i20;
            }
            int i21 = configuration.navigation;
            int i22 = configuration2.navigation;
            if (i21 != i22) {
                configuration3.navigation = i22;
            }
            int i23 = configuration.navigationHidden;
            int i24 = configuration2.navigationHidden;
            if (i23 != i24) {
                configuration3.navigationHidden = i24;
            }
            int i25 = configuration.orientation;
            int i26 = configuration2.orientation;
            if (i25 != i26) {
                configuration3.orientation = i26;
            }
            int i27 = configuration.screenLayout & 15;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 15)) {
                configuration3.screenLayout |= i28 & 15;
            }
            int i29 = configuration.screenLayout & 192;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 192)) {
                configuration3.screenLayout |= i30 & 192;
            }
            int i31 = configuration.screenLayout & 48;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 48)) {
                configuration3.screenLayout |= i32 & 48;
            }
            int i33 = configuration.screenLayout & 768;
            int i34 = configuration2.screenLayout;
            if (i33 != (i34 & 768)) {
                configuration3.screenLayout |= i34 & 768;
            }
            if (i14 >= 26) {
                m.m1051a(configuration, configuration2, configuration3);
            }
            int i35 = configuration.uiMode & 15;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 15)) {
                configuration3.uiMode |= i36 & 15;
            }
            int i37 = configuration.uiMode & 48;
            int i38 = configuration2.uiMode;
            if (i37 != (i38 & 48)) {
                configuration3.uiMode |= i38 & 48;
            }
            int i39 = configuration.screenWidthDp;
            int i40 = configuration2.screenWidthDp;
            if (i39 != i40) {
                configuration3.screenWidthDp = i40;
            }
            int i41 = configuration.screenHeightDp;
            int i42 = configuration2.screenHeightDp;
            if (i41 != i42) {
                configuration3.screenHeightDp = i42;
            }
            int i43 = configuration.smallestScreenWidthDp;
            int i44 = configuration2.smallestScreenWidthDp;
            if (i43 != i44) {
                configuration3.smallestScreenWidthDp = i44;
            }
            j.m1042b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    /* renamed from: q0 */
    private int m988q0(Context context) {
        if (!this.f911h0 && (this.f924u instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f924u.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f910g0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.f910g0 = 0;
            }
        }
        this.f911h0 = true;
        return this.f910g0;
    }

    /* renamed from: r0 */
    private q m989r0(Context context) {
        if (this.f913j0 == null) {
            this.f913j0 = new p(context);
        }
        return this.f913j0;
    }

    /* renamed from: s0 */
    private q m990s0(Context context) {
        if (this.f912i0 == null) {
            this.f912i0 = new r(C0240w.m1123a(context));
        }
        return this.f912i0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: x0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m991x0() {
        /*
            r3 = this;
            r3.m985l0()
            boolean r0 = r3.f895R
            if (r0 == 0) goto L37
            androidx.appcompat.app.a r0 = r3.f929z
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            java.lang.Object r0 = r3.f924u
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            androidx.appcompat.app.x r0 = new androidx.appcompat.app.x
            java.lang.Object r1 = r3.f924u
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.f896S
            r0.<init>(r1, r2)
        L1d:
            r3.f929z = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            androidx.appcompat.app.x r0 = new androidx.appcompat.app.x
            java.lang.Object r1 = r3.f924u
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            androidx.appcompat.app.a r0 = r3.f929z
            if (r0 == 0) goto L37
            boolean r1 = r3.f917n0
            r0.mo892t(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0225h.m991x0():void");
    }

    /* renamed from: y0 */
    private boolean m992y0(u uVar) {
        View view = uVar.f962i;
        if (view != null) {
            uVar.f961h = view;
            return true;
        }
        if (uVar.f963j == null) {
            return false;
        }
        if (this.f882E == null) {
            this.f882E = new v();
        }
        View view2 = (View) uVar.m1067a(this.f882E);
        uVar.f961h = view2;
        return view2 != null;
    }

    /* renamed from: z0 */
    private boolean m993z0(u uVar) {
        uVar.m1070d(m1025p0());
        uVar.f960g = new t(uVar.f965l);
        uVar.f956c = 81;
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0224g
    /* renamed from: A */
    public void mo930A(Bundle bundle) {
        m985l0();
    }

    @Override // androidx.appcompat.app.AbstractC0224g
    /* renamed from: B */
    public void mo931B() {
        AbstractC0218a mo952s = mo952s();
        if (mo952s != null) {
            mo952s.mo894v(true);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0224g
    /* renamed from: C */
    public void mo932C(Bundle bundle) {
    }

    /* renamed from: C0 */
    public boolean m994C0() {
        return this.f888K;
    }

    @Override // androidx.appcompat.app.AbstractC0224g
    /* renamed from: D */
    public void mo933D() {
        m971T(true, false);
    }

    /* renamed from: D0 */
    int m995D0(Context context, int i10) {
        q m990s0;
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    m990s0 = m989r0(context);
                }
            } else {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                m990s0 = m990s0(context);
            }
            return m990s0.mo1061c();
        }
        return i10;
    }

    @Override // androidx.appcompat.app.AbstractC0224g
    /* renamed from: E */
    public void mo934E() {
        AbstractC0218a mo952s = mo952s();
        if (mo952s != null) {
            mo952s.mo894v(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E0 */
    public boolean m996E0() {
        boolean z10 = this.f903Z;
        this.f903Z = false;
        u m1027u0 = m1027u0(0, false);
        if (m1027u0 != null && m1027u0.f968o) {
            if (!z10) {
                m1016d0(m1027u0, true);
            }
            return true;
        }
        AbstractC0243b abstractC0243b = this.f883F;
        if (abstractC0243b != null) {
            abstractC0243b.mo1155c();
            return true;
        }
        AbstractC0218a mo952s = mo952s();
        return mo952s != null && mo952s.mo879g();
    }

    /* renamed from: F0 */
    boolean m997F0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.f903Z = (keyEvent.getFlags() & RecognitionOptions.ITF) != 0;
        } else if (i10 == 82) {
            m963G0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0224g
    /* renamed from: H */
    public boolean mo935H(int i10) {
        int m970S0 = m970S0(i10);
        if (this.f899V && m970S0 == 108) {
            return false;
        }
        if (this.f895R && m970S0 == 1) {
            this.f895R = false;
        }
        if (m970S0 == 1) {
            m976Z0();
            this.f899V = true;
            return true;
        }
        if (m970S0 == 2) {
            m976Z0();
            this.f893P = true;
            return true;
        }
        if (m970S0 == 5) {
            m976Z0();
            this.f894Q = true;
            return true;
        }
        if (m970S0 == 10) {
            m976Z0();
            this.f897T = true;
            return true;
        }
        if (m970S0 == 108) {
            m976Z0();
            this.f895R = true;
            return true;
        }
        if (m970S0 != 109) {
            return this.f926w.requestFeature(m970S0);
        }
        m976Z0();
        this.f896S = true;
        return true;
    }

    /* renamed from: H0 */
    boolean m998H0(int i10, KeyEvent keyEvent) {
        AbstractC0218a mo952s = mo952s();
        if (mo952s != null && mo952s.mo888p(i10, keyEvent)) {
            return true;
        }
        u uVar = this.f902Y;
        if (uVar != null && m966P0(uVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            u uVar2 = this.f902Y;
            if (uVar2 != null) {
                uVar2.f967n = true;
            }
            return true;
        }
        if (this.f902Y == null) {
            u m1027u0 = m1027u0(0, true);
            m967Q0(m1027u0, keyEvent);
            boolean m966P0 = m966P0(m1027u0, keyEvent.getKeyCode(), keyEvent, 1);
            m1027u0.f966m = false;
            if (m966P0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: I0 */
    boolean m999I0(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            if (i10 == 82) {
                m964J0(0, keyEvent);
                return true;
            }
        } else if (m996E0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0224g
    /* renamed from: J */
    public void mo936J(int i10) {
        m985l0();
        ViewGroup viewGroup = (ViewGroup) this.f890M.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f925v).inflate(i10, viewGroup);
        this.f927x.m1056c(this.f926w.getCallback());
    }

    @Override // androidx.appcompat.app.AbstractC0224g
    /* renamed from: K */
    public void mo937K(View view) {
        m985l0();
        ViewGroup viewGroup = (ViewGroup) this.f890M.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f927x.m1056c(this.f926w.getCallback());
    }

    /* renamed from: K0 */
    void m1000K0(int i10) {
        AbstractC0218a mo952s;
        if (i10 != 108 || (mo952s = mo952s()) == null) {
            return;
        }
        mo952s.mo880h(true);
    }

    @Override // androidx.appcompat.app.AbstractC0224g
    /* renamed from: L */
    public void mo938L(View view, ViewGroup.LayoutParams layoutParams) {
        m985l0();
        ViewGroup viewGroup = (ViewGroup) this.f890M.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f927x.m1056c(this.f926w.getCallback());
    }

    /* renamed from: L0 */
    void m1001L0(int i10) {
        if (i10 == 108) {
            AbstractC0218a mo952s = mo952s();
            if (mo952s != null) {
                mo952s.mo880h(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            u m1027u0 = m1027u0(i10, true);
            if (m1027u0.f968o) {
                m1016d0(m1027u0, false);
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC0224g
    /* renamed from: M */
    public void mo939M(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.mo939M(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f922s0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f923t0) != null) {
            n.m1054c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f923t0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f924u;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                onBackInvokedDispatcher = n.m1052a((Activity) this.f924u);
            }
        }
        this.f922s0 = onBackInvokedDispatcher;
        m1017d1();
    }

    /* renamed from: M0 */
    void m1002M0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.AbstractC0224g
    /* renamed from: N */
    public void mo940N(Toolbar toolbar) {
        if (this.f924u instanceof Activity) {
            AbstractC0218a mo952s = mo952s();
            if (mo952s instanceof C0241x) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f878A = null;
            if (mo952s != null) {
                mo952s.mo887o();
            }
            this.f929z = null;
            if (toolbar != null) {
                C0238u c0238u = new C0238u(toolbar, m1028v0(), this.f927x);
                this.f929z = c0238u;
                this.f927x.m1058e(c0238u.f1007c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f927x.m1058e(null);
            }
            mo954u();
        }
    }

    @Override // androidx.appcompat.app.AbstractC0224g
    /* renamed from: O */
    public void mo941O(int i10) {
        this.f909f0 = i10;
    }

    /* renamed from: O0 */
    final AbstractC0218a m1003O0() {
        return this.f929z;
    }

    @Override // androidx.appcompat.app.AbstractC0224g
    /* renamed from: P */
    public final void mo942P(CharSequence charSequence) {
        this.f879B = charSequence;
        InterfaceC0354n0 interfaceC0354n0 = this.f880C;
        if (interfaceC0354n0 != null) {
            interfaceC0354n0.setWindowTitle(charSequence);
            return;
        }
        if (m1003O0() != null) {
            m1003O0().mo896x(charSequence);
            return;
        }
        TextView textView = this.f891N;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0224g
    /* renamed from: Q */
    public AbstractC0243b mo943Q(AbstractC0243b.a aVar) {
        InterfaceC0222e interfaceC0222e;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        AbstractC0243b abstractC0243b = this.f883F;
        if (abstractC0243b != null) {
            abstractC0243b.mo1155c();
        }
        i iVar = new i(aVar);
        AbstractC0218a mo952s = mo952s();
        if (mo952s != null) {
            AbstractC0243b mo898z = mo952s.mo898z(iVar);
            this.f883F = mo898z;
            if (mo898z != null && (interfaceC0222e = this.f928y) != null) {
                interfaceC0222e.onSupportActionModeStarted(mo898z);
            }
        }
        if (this.f883F == null) {
            this.f883F = m1010Y0(iVar);
        }
        m1017d1();
        return this.f883F;
    }

    /* renamed from: T0 */
    void m1004T0(Configuration configuration, C0949h c0949h) {
        l.m1050d(configuration, c0949h);
    }

    /* renamed from: U */
    public boolean m1005U() {
        return m969S(true);
    }

    /* renamed from: U0 */
    void m1006U0(C0949h c0949h) {
        l.m1049c(c0949h);
    }

    /* renamed from: V0 */
    final boolean m1007V0() {
        ViewGroup viewGroup;
        return this.f889L && (viewGroup = this.f890M) != null && C1116x0.m5243H(viewGroup);
    }

    /* renamed from: X */
    C0949h m1008X(Context context) {
        C0949h m927r;
        if (Build.VERSION.SDK_INT >= 33 || (m927r = AbstractC0224g.m927r()) == null) {
            return null;
        }
        C0949h m1026t0 = m1026t0(context.getApplicationContext().getResources().getConfiguration());
        C0949h m1113b = C0236s.m1113b(m927r, m1026t0);
        return m1113b.m4722f() ? m1026t0 : m1113b;
    }

    /* renamed from: X0 */
    boolean m1009X0() {
        if (this.f922s0 == null) {
            return false;
        }
        u m1027u0 = m1027u0(0, false);
        return (m1027u0 != null && m1027u0.f968o) || this.f883F != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0029  */
    /* renamed from: Y0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.appcompat.view.AbstractC0243b m1010Y0(androidx.appcompat.view.AbstractC0243b.a r8) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0225h.m1010Y0(androidx.appcompat.view.b$a):androidx.appcompat.view.b");
    }

    /* renamed from: Z */
    void m1011Z(int i10, u uVar, Menu menu) {
        if (menu == null) {
            if (uVar == null && i10 >= 0) {
                u[] uVarArr = this.f901X;
                if (i10 < uVarArr.length) {
                    uVar = uVarArr[i10];
                }
            }
            if (uVar != null) {
                menu = uVar.f963j;
            }
        }
        if ((uVar == null || uVar.f968o) && !this.f906c0) {
            this.f927x.m1057d(this.f926w.getCallback(), i10, menu);
        }
    }

    @Override // androidx.appcompat.view.menu.C0260g.a
    /* renamed from: a */
    public boolean mo1012a(C0260g c0260g, MenuItem menuItem) {
        u m1024n0;
        Window.Callback m1029w0 = m1029w0();
        if (m1029w0 == null || this.f906c0 || (m1024n0 = m1024n0(c0260g.mo1302D())) == null) {
            return false;
        }
        return m1029w0.onMenuItemSelected(m1024n0.f954a, menuItem);
    }

    /* renamed from: a0 */
    void m1013a0(C0260g c0260g) {
        if (this.f900W) {
            return;
        }
        this.f900W = true;
        this.f880C.mo1435j();
        Window.Callback m1029w0 = m1029w0();
        if (m1029w0 != null && !this.f906c0) {
            m1029w0.onPanelClosed(108, c0260g);
        }
        this.f900W = false;
    }

    @Override // androidx.appcompat.view.menu.C0260g.a
    /* renamed from: b */
    public void mo1014b(C0260g c0260g) {
        m968R0(true);
    }

    /* renamed from: c0 */
    void m1015c0(int i10) {
        m1016d0(m1027u0(i10, true), true);
    }

    /* renamed from: d0 */
    void m1016d0(u uVar, boolean z10) {
        ViewGroup viewGroup;
        InterfaceC0354n0 interfaceC0354n0;
        if (z10 && uVar.f954a == 0 && (interfaceC0354n0 = this.f880C) != null && interfaceC0354n0.mo1431e()) {
            m1013a0(uVar.f963j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f925v.getSystemService("window");
        if (windowManager != null && uVar.f968o && (viewGroup = uVar.f960g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                m1011Z(uVar.f954a, uVar, null);
            }
        }
        uVar.f966m = false;
        uVar.f967n = false;
        uVar.f968o = false;
        uVar.f961h = null;
        uVar.f970q = true;
        if (this.f902Y == uVar) {
            this.f902Y = null;
        }
        if (uVar.f954a == 0) {
            m1017d1();
        }
    }

    /* renamed from: d1 */
    void m1017d1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean m1009X0 = m1009X0();
            if (m1009X0 && this.f923t0 == null) {
                this.f923t0 = n.m1053b(this.f922s0, this);
            } else {
                if (m1009X0 || (onBackInvokedCallback = this.f923t0) == null) {
                    return;
                }
                n.m1054c(this.f922s0, onBackInvokedCallback);
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC0224g
    /* renamed from: e */
    public void mo944e(View view, ViewGroup.LayoutParams layoutParams) {
        m985l0();
        ((ViewGroup) this.f890M.findViewById(R.id.content)).addView(view, layoutParams);
        this.f927x.m1056c(this.f926w.getCallback());
    }

    /* renamed from: f1 */
    final int m1018f1(C1094r2 c1094r2, Rect rect) {
        boolean z10;
        boolean z11;
        int m5147k = c1094r2 != null ? c1094r2.m5147k() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f884G;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f884G.getLayoutParams();
            if (this.f884G.isShown()) {
                if (this.f918o0 == null) {
                    this.f918o0 = new Rect();
                    this.f919p0 = new Rect();
                }
                Rect rect2 = this.f918o0;
                Rect rect3 = this.f919p0;
                if (c1094r2 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c1094r2.m5145i(), c1094r2.m5147k(), c1094r2.m5146j(), c1094r2.m5144h());
                }
                C0385x1.m2046a(this.f890M, rect2, rect3);
                int i10 = rect2.top;
                int i11 = rect2.left;
                int i12 = rect2.right;
                C1094r2 m5300y = C1116x0.m5300y(this.f890M);
                int m5145i = m5300y == null ? 0 : m5300y.m5145i();
                int m5146j = m5300y == null ? 0 : m5300y.m5146j();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || this.f892O != null) {
                    View view = this.f892O;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != m5145i || marginLayoutParams2.rightMargin != m5146j) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = m5145i;
                            marginLayoutParams2.rightMargin = m5146j;
                            this.f892O.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f925v);
                    this.f892O = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = m5145i;
                    layoutParams.rightMargin = m5146j;
                    this.f890M.addView(this.f892O, -1, layoutParams);
                }
                View view3 = this.f892O;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    m984g1(this.f892O);
                }
                if (!this.f897T && r5) {
                    m5147k = 0;
                }
                z10 = r5;
                r5 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                r5 = false;
            }
            if (r5) {
                this.f884G.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f892O;
        if (view4 != null) {
            view4.setVisibility(z10 ? 0 : 8);
        }
        return m5147k;
    }

    @Override // androidx.appcompat.app.AbstractC0224g
    /* renamed from: g */
    public Context mo946g(Context context) {
        this.f904a0 = true;
        int m995D0 = m995D0(context, m975Y());
        if (AbstractC0224g.m928v(context)) {
            AbstractC0224g.m919R(context);
        }
        C0949h m1008X = m1008X(context);
        if (f877y0 && (context instanceof ContextThemeWrapper)) {
            try {
                s.m1065a((ContextThemeWrapper) context, m981e0(context, m995D0, m1008X, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C0245d) {
            try {
                ((C0245d) context).m1184a(m981e0(context, m995D0, m1008X, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f876x0) {
            return super.mo946g(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = j.m1041a(context, configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration m981e0 = m981e0(context, m995D0, m1008X, !configuration2.equals(configuration3) ? m987o0(configuration2, configuration3) : null, true);
        C0245d c0245d = new C0245d(context, C7385i.f16870d);
        c0245d.m1184a(m981e0);
        boolean z10 = false;
        try {
            z10 = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z10) {
            C0871f.f.m4472a(c0245d.getTheme());
        }
        return super.mo946g(c0245d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g0 */
    public View m1019g0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        C0231n c0231n;
        boolean z11 = false;
        if (this.f920q0 == null) {
            String string = this.f925v.obtainStyledAttributes(C7386j.f17100y0).getString(C7386j.f16883C0);
            if (string == null) {
                c0231n = new C0231n();
            } else {
                try {
                    this.f920q0 = (C0231n) this.f925v.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    c0231n = new C0231n();
                }
            }
            this.f920q0 = c0231n;
        }
        boolean z12 = f874v0;
        if (z12) {
            if (this.f921r0 == null) {
                this.f921r0 = new C0235r();
            }
            if (this.f921r0.m1111a(attributeSet)) {
                z10 = true;
                return this.f920q0.m1098r(view, str, context, attributeSet, z10, z12, true, C0382w1.m2040d());
            }
            if (!(attributeSet instanceof XmlPullParser)) {
                z11 = m974W0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z11 = true;
            }
        }
        z10 = z11;
        return this.f920q0.m1098r(view, str, context, attributeSet, z10, z12, true, C0382w1.m2040d());
    }

    /* renamed from: h0 */
    void m1020h0() {
        C0260g c0260g;
        InterfaceC0354n0 interfaceC0354n0 = this.f880C;
        if (interfaceC0354n0 != null) {
            interfaceC0354n0.mo1435j();
        }
        if (this.f885H != null) {
            this.f926w.getDecorView().removeCallbacks(this.f886I);
            if (this.f885H.isShowing()) {
                try {
                    this.f885H.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f885H = null;
        }
        m1023k0();
        u m1027u0 = m1027u0(0, false);
        if (m1027u0 == null || (c0260g = m1027u0.f963j) == null) {
            return;
        }
        c0260g.close();
    }

    /* renamed from: i0 */
    boolean m1021i0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f924u;
        if (((obj instanceof C1095s.a) || (obj instanceof DialogC0230m)) && (decorView = this.f926w.getDecorView()) != null && C1095s.m5197d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f927x.m1055b(this.f926w.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? m997F0(keyCode, keyEvent) : m999I0(keyCode, keyEvent);
    }

    @Override // androidx.appcompat.app.AbstractC0224g
    /* renamed from: j */
    public <T extends View> T mo947j(int i10) {
        m985l0();
        return (T) this.f926w.findViewById(i10);
    }

    /* renamed from: j0 */
    void m1022j0(int i10) {
        u m1027u0;
        u m1027u02 = m1027u0(i10, true);
        if (m1027u02.f963j != null) {
            Bundle bundle = new Bundle();
            m1027u02.f963j.m1314Q(bundle);
            if (bundle.size() > 0) {
                m1027u02.f972s = bundle;
            }
            m1027u02.f963j.m1331e0();
            m1027u02.f963j.clear();
        }
        m1027u02.f971r = true;
        m1027u02.f970q = true;
        if ((i10 != 108 && i10 != 0) || this.f880C == null || (m1027u0 = m1027u0(0, false)) == null) {
            return;
        }
        m1027u0.f966m = false;
        m967Q0(m1027u0, null);
    }

    /* renamed from: k0 */
    void m1023k0() {
        C1074n2 c1074n2 = this.f887J;
        if (c1074n2 != null) {
            c1074n2.m5069c();
        }
    }

    @Override // androidx.appcompat.app.AbstractC0224g
    /* renamed from: l */
    public Context mo948l() {
        return this.f925v;
    }

    @Override // androidx.appcompat.app.AbstractC0224g
    /* renamed from: n */
    public final InterfaceC0219b mo949n() {
        return new f();
    }

    /* renamed from: n0 */
    u m1024n0(Menu menu) {
        u[] uVarArr = this.f901X;
        int length = uVarArr != null ? uVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            u uVar = uVarArr[i10];
            if (uVar != null && uVar.f963j == menu) {
                return uVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.AbstractC0224g
    /* renamed from: o */
    public int mo950o() {
        return this.f908e0;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m1019g0(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* renamed from: p0 */
    final Context m1025p0() {
        AbstractC0218a mo952s = mo952s();
        Context mo882j = mo952s != null ? mo952s.mo882j() : null;
        return mo882j == null ? this.f925v : mo882j;
    }

    @Override // androidx.appcompat.app.AbstractC0224g
    /* renamed from: q */
    public MenuInflater mo951q() {
        if (this.f878A == null) {
            m991x0();
            AbstractC0218a abstractC0218a = this.f929z;
            this.f878A = new C0248g(abstractC0218a != null ? abstractC0218a.mo882j() : this.f925v);
        }
        return this.f878A;
    }

    @Override // androidx.appcompat.app.AbstractC0224g
    /* renamed from: s */
    public AbstractC0218a mo952s() {
        m991x0();
        return this.f929z;
    }

    @Override // androidx.appcompat.app.AbstractC0224g
    /* renamed from: t */
    public void mo953t() {
        LayoutInflater from = LayoutInflater.from(this.f925v);
        if (from.getFactory() == null) {
            C1099t.m5202a(from, this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C0225h) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* renamed from: t0 */
    C0949h m1026t0(Configuration configuration) {
        return l.m1048b(configuration);
    }

    @Override // androidx.appcompat.app.AbstractC0224g
    /* renamed from: u */
    public void mo954u() {
        if (m1003O0() == null || mo952s().mo884l()) {
            return;
        }
        m962B0(0);
    }

    /* renamed from: u0 */
    protected u m1027u0(int i10, boolean z10) {
        u[] uVarArr = this.f901X;
        if (uVarArr == null || uVarArr.length <= i10) {
            u[] uVarArr2 = new u[i10 + 1];
            if (uVarArr != null) {
                System.arraycopy(uVarArr, 0, uVarArr2, 0, uVarArr.length);
            }
            this.f901X = uVarArr2;
            uVarArr = uVarArr2;
        }
        u uVar = uVarArr[i10];
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(i10);
        uVarArr[i10] = uVar2;
        return uVar2;
    }

    /* renamed from: v0 */
    final CharSequence m1028v0() {
        Object obj = this.f924u;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f879B;
    }

    /* renamed from: w0 */
    final Window.Callback m1029w0() {
        return this.f926w.getCallback();
    }

    @Override // androidx.appcompat.app.AbstractC0224g
    /* renamed from: x */
    public void mo955x(Configuration configuration) {
        AbstractC0218a mo952s;
        if (this.f895R && this.f889L && (mo952s = mo952s()) != null) {
            mo952s.mo886n(configuration);
        }
        C0341j.m1781b().m1788g(this.f925v);
        this.f907d0 = new Configuration(this.f925v.getResources().getConfiguration());
        m971T(false, false);
    }

    @Override // androidx.appcompat.app.AbstractC0224g
    /* renamed from: y */
    public void mo956y(Bundle bundle) {
        String str;
        this.f904a0 = true;
        m969S(false);
        m986m0();
        Object obj = this.f924u;
        if (obj instanceof Activity) {
            try {
                str = C0812m.m4062c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                AbstractC0218a m1003O0 = m1003O0();
                if (m1003O0 == null) {
                    this.f917n0 = true;
                } else {
                    m1003O0.mo892t(true);
                }
            }
            AbstractC0224g.m921d(this);
        }
        this.f907d0 = new Configuration(this.f925v.getResources().getConfiguration());
        this.f905b0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @Override // androidx.appcompat.app.AbstractC0224g
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo957z() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f924u
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.AbstractC0224g.m916F(r3)
        L9:
            boolean r0 = r3.f914k0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f926w
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f916m0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.f906c0 = r0
            int r0 = r3.f908e0
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f924u
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            androidx.collection.h<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.LayoutInflaterFactory2C0225h.f873u0
            java.lang.Object r1 = r3.f924u
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f908e0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            androidx.collection.h<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.LayoutInflaterFactory2C0225h.f873u0
            java.lang.Object r1 = r3.f924u
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.a r0 = r3.f929z
            if (r0 == 0) goto L5b
            r0.mo887o()
        L5b:
            r3.m978b0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0225h.mo957z():void");
    }
}
