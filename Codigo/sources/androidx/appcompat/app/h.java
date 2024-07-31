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
import androidx.appcompat.view.b;
import androidx.appcompat.view.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.l1;
import androidx.appcompat.widget.n0;
import androidx.appcompat.widget.w1;
import androidx.appcompat.widget.x1;
import androidx.core.content.res.f;
import androidx.core.view.n2;
import androidx.core.view.p2;
import androidx.core.view.r2;
import androidx.core.view.s;
import androidx.core.view.s0;
import androidx.core.view.x0;
import androidx.lifecycle.f;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class h extends androidx.appcompat.app.g implements g.a, LayoutInflater.Factory2 {

    /* renamed from: u0 */
    private static final androidx.collection.h<String, Integer> f774u0 = new androidx.collection.h<>();

    /* renamed from: v0 */
    private static final boolean f775v0 = false;

    /* renamed from: w0 */
    private static final int[] f776w0 = {R.attr.windowBackground};

    /* renamed from: x0 */
    private static final boolean f777x0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: y0 */
    private static final boolean f778y0 = true;
    MenuInflater A;
    private CharSequence B;
    private n0 C;
    private C0019h D;
    private v E;
    androidx.appcompat.view.b F;
    ActionBarContextView G;
    PopupWindow H;
    Runnable I;
    n2 J;
    private boolean K;
    private boolean L;
    ViewGroup M;
    private TextView N;
    private View O;
    private boolean P;
    private boolean Q;
    boolean R;
    boolean S;
    boolean T;
    boolean U;
    boolean V;
    private boolean W;
    private u[] X;
    private u Y;
    private boolean Z;

    /* renamed from: a0 */
    private boolean f779a0;

    /* renamed from: b0 */
    private boolean f780b0;

    /* renamed from: c0 */
    boolean f781c0;

    /* renamed from: d0 */
    private Configuration f782d0;

    /* renamed from: e0 */
    private int f783e0;

    /* renamed from: f0 */
    private int f784f0;

    /* renamed from: g0 */
    private int f785g0;

    /* renamed from: h0 */
    private boolean f786h0;

    /* renamed from: i0 */
    private q f787i0;

    /* renamed from: j0 */
    private q f788j0;

    /* renamed from: k0 */
    boolean f789k0;

    /* renamed from: l0 */
    int f790l0;

    /* renamed from: m0 */
    private final Runnable f791m0;

    /* renamed from: n0 */
    private boolean f792n0;

    /* renamed from: o0 */
    private Rect f793o0;

    /* renamed from: p0 */
    private Rect f794p0;

    /* renamed from: q0 */
    private androidx.appcompat.app.n f795q0;

    /* renamed from: r0 */
    private androidx.appcompat.app.r f796r0;

    /* renamed from: s0 */
    private OnBackInvokedDispatcher f797s0;

    /* renamed from: t0 */
    private OnBackInvokedCallback f798t0;

    /* renamed from: u */
    final Object f799u;

    /* renamed from: v */
    final Context f800v;

    /* renamed from: w */
    Window f801w;

    /* renamed from: x */
    private o f802x;

    /* renamed from: y */
    final androidx.appcompat.app.e f803y;

    /* renamed from: z */
    androidx.appcompat.app.a f804z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            if ((hVar.f790l0 & 1) != 0) {
                hVar.j0(0);
            }
            h hVar2 = h.this;
            if ((hVar2.f790l0 & RecognitionOptions.AZTEC) != 0) {
                hVar2.j0(108);
            }
            h hVar3 = h.this;
            hVar3.f789k0 = false;
            hVar3.f790l0 = 0;
        }
    }

    /* loaded from: classes.dex */
    public class b implements s0 {
        b() {
        }

        @Override // androidx.core.view.s0
        public r2 a(View view, r2 r2Var) {
            int k10 = r2Var.k();
            int f12 = h.this.f1(r2Var, null);
            if (k10 != f12) {
                r2Var = r2Var.o(r2Var.i(), f12, r2Var.j(), r2Var.h());
            }
            return x0.N(view, r2Var);
        }
    }

    /* loaded from: classes.dex */
    public class c implements ContentFrameLayout.a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            h.this.h0();
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* loaded from: classes.dex */
        class a extends p2 {
            a() {
            }

            @Override // androidx.core.view.o2
            public void b(View view) {
                h.this.G.setAlpha(1.0f);
                h.this.J.h(null);
                h.this.J = null;
            }

            @Override // androidx.core.view.p2, androidx.core.view.o2
            public void c(View view) {
                h.this.G.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.H.showAtLocation(hVar.G, 55, 0, 0);
            h.this.k0();
            if (!h.this.V0()) {
                h.this.G.setAlpha(1.0f);
                h.this.G.setVisibility(0);
            } else {
                h.this.G.setAlpha(0.0f);
                h hVar2 = h.this;
                hVar2.J = x0.c(hVar2.G).b(1.0f);
                h.this.J.h(new a());
            }
        }
    }

    /* loaded from: classes.dex */
    public class e extends p2 {
        e() {
        }

        @Override // androidx.core.view.o2
        public void b(View view) {
            h.this.G.setAlpha(1.0f);
            h.this.J.h(null);
            h.this.J = null;
        }

        @Override // androidx.core.view.p2, androidx.core.view.o2
        public void c(View view) {
            h.this.G.setVisibility(0);
            if (h.this.G.getParent() instanceof View) {
                x0.T((View) h.this.G.getParent());
            }
        }
    }

    /* loaded from: classes.dex */
    private class f implements androidx.appcompat.app.b {
        f() {
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        boolean a(int i10);

        View onCreatePanelView(int i10);
    }

    /* renamed from: androidx.appcompat.app.h$h */
    /* loaded from: classes.dex */
    public final class C0019h implements m.a {
        C0019h() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void b(androidx.appcompat.view.menu.g gVar, boolean z10) {
            h.this.a0(gVar);
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean c(androidx.appcompat.view.menu.g gVar) {
            Window.Callback w02 = h.this.w0();
            if (w02 == null) {
                return true;
            }
            w02.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class i implements b.a {

        /* renamed from: a */
        private b.a f813a;

        /* loaded from: classes.dex */
        class a extends p2 {
            a() {
            }

            @Override // androidx.core.view.o2
            public void b(View view) {
                h.this.G.setVisibility(8);
                h hVar = h.this;
                PopupWindow popupWindow = hVar.H;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.G.getParent() instanceof View) {
                    x0.T((View) h.this.G.getParent());
                }
                h.this.G.k();
                h.this.J.h(null);
                h hVar2 = h.this;
                hVar2.J = null;
                x0.T(hVar2.M);
            }
        }

        public i(b.a aVar) {
            this.f813a = aVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(androidx.appcompat.view.b bVar) {
            this.f813a.a(bVar);
            h hVar = h.this;
            if (hVar.H != null) {
                hVar.f801w.getDecorView().removeCallbacks(h.this.I);
            }
            h hVar2 = h.this;
            if (hVar2.G != null) {
                hVar2.k0();
                h hVar3 = h.this;
                hVar3.J = x0.c(hVar3.G).b(0.0f);
                h.this.J.h(new a());
            }
            h hVar4 = h.this;
            androidx.appcompat.app.e eVar = hVar4.f803y;
            if (eVar != null) {
                eVar.onSupportActionModeFinished(hVar4.F);
            }
            h hVar5 = h.this;
            hVar5.F = null;
            x0.T(hVar5.M);
            h.this.d1();
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f813a.b(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f813a.c(bVar, menuItem);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(androidx.appcompat.view.b bVar, Menu menu) {
            x0.T(h.this.M);
            return this.f813a.d(bVar, menu);
        }
    }

    /* loaded from: classes.dex */
    public static class j {
        static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.densityDpi;
            int i11 = configuration2.densityDpi;
            if (i10 != i11) {
                configuration3.densityDpi = i11;
            }
        }

        static void c(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        static void d(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    /* loaded from: classes.dex */
    static class k {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* loaded from: classes.dex */
    public static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        static androidx.core.os.h b(Configuration configuration) {
            return androidx.core.os.h.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(androidx.core.os.h hVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(hVar.h()));
        }

        static void d(Configuration configuration, androidx.core.os.h hVar) {
            configuration.setLocales(LocaleList.forLanguageTags(hVar.h()));
        }
    }

    /* loaded from: classes.dex */
    public static class m {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
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

    /* loaded from: classes.dex */
    public static class n {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Object obj, h hVar) {
            Objects.requireNonNull(hVar);
            androidx.appcompat.app.k kVar = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.k
                public /* synthetic */ k() {
                }

                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    h.this.E0();
                }
            };
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, kVar);
            return kVar;
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* loaded from: classes.dex */
    public class o extends androidx.appcompat.view.i {

        /* renamed from: b */
        private g f816b;

        /* renamed from: c */
        private boolean f817c;

        /* renamed from: d */
        private boolean f818d;

        /* renamed from: e */
        private boolean f819e;

        o(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f818d = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f818d = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f817c = true;
                callback.onContentChanged();
            } finally {
                this.f817c = false;
            }
        }

        public void d(Window.Callback callback, int i10, Menu menu) {
            try {
                this.f819e = true;
                callback.onPanelClosed(i10, menu);
            } finally {
                this.f819e = false;
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f818d ? a().dispatchKeyEvent(keyEvent) : h.this.i0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || h.this.H0(keyEvent.getKeyCode(), keyEvent);
        }

        void e(g gVar) {
            this.f816b = gVar;
        }

        final ActionMode f(ActionMode.Callback callback) {
            f.a aVar = new f.a(h.this.f800v, callback);
            androidx.appcompat.view.b Q = h.this.Q(aVar);
            if (Q != null) {
                return aVar.e(Q);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f817c) {
                a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            View onCreatePanelView;
            g gVar = this.f816b;
            return (gVar == null || (onCreatePanelView = gVar.onCreatePanelView(i10)) == null) ? super.onCreatePanelView(i10) : onCreatePanelView;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            h.this.K0(i10);
            return true;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            if (this.f819e) {
                a().onPanelClosed(i10, menu);
            } else {
                super.onPanelClosed(i10, menu);
                h.this.L0(i10);
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i10 == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.b0(true);
            }
            g gVar2 = this.f816b;
            boolean z10 = gVar2 != null && gVar2.a(i10);
            if (!z10) {
                z10 = super.onPreparePanel(i10, view, menu);
            }
            if (gVar != null) {
                gVar.b0(false);
            }
            return z10;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.g gVar;
            u u02 = h.this.u0(0, true);
            if (u02 == null || (gVar = u02.f838j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i10);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (h.this.C0() && i10 == 0) ? f(callback) : super.onWindowStartingActionMode(callback, i10);
        }
    }

    /* loaded from: classes.dex */
    public class p extends q {

        /* renamed from: c */
        private final PowerManager f821c;

        p(Context context) {
            super();
            this.f821c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.h.q
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.h.q
        public int c() {
            return k.a(this.f821c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.h.q
        public void d() {
            h.this.U();
        }
    }

    /* loaded from: classes.dex */
    public abstract class q {

        /* renamed from: a */
        private BroadcastReceiver f823a;

        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                q.this.d();
            }
        }

        q() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f823a;
            if (broadcastReceiver != null) {
                try {
                    h.this.f800v.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f823a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter b10 = b();
            if (b10 == null || b10.countActions() == 0) {
                return;
            }
            if (this.f823a == null) {
                this.f823a = new a();
            }
            h.this.f800v.registerReceiver(this.f823a, b10);
        }
    }

    /* loaded from: classes.dex */
    public class r extends q {

        /* renamed from: c */
        private final w f826c;

        r(w wVar) {
            super();
            this.f826c = wVar;
        }

        @Override // androidx.appcompat.app.h.q
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.h.q
        public int c() {
            return this.f826c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.h.q
        public void d() {
            h.this.U();
        }
    }

    /* loaded from: classes.dex */
    private static class s {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* loaded from: classes.dex */
    public class t extends ContentFrameLayout {
        public t(Context context) {
            super(context);
        }

        private boolean b(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.i0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            h.this.c0(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(h.a.b(getContext(), i10));
        }
    }

    /* loaded from: classes.dex */
    public static final class u {

        /* renamed from: a */
        int f829a;

        /* renamed from: b */
        int f830b;

        /* renamed from: c */
        int f831c;

        /* renamed from: d */
        int f832d;

        /* renamed from: e */
        int f833e;

        /* renamed from: f */
        int f834f;

        /* renamed from: g */
        ViewGroup f835g;

        /* renamed from: h */
        View f836h;

        /* renamed from: i */
        View f837i;

        /* renamed from: j */
        androidx.appcompat.view.menu.g f838j;

        /* renamed from: k */
        androidx.appcompat.view.menu.e f839k;

        /* renamed from: l */
        Context f840l;

        /* renamed from: m */
        boolean f841m;

        /* renamed from: n */
        boolean f842n;

        /* renamed from: o */
        boolean f843o;

        /* renamed from: p */
        public boolean f844p;

        /* renamed from: q */
        boolean f845q = false;

        /* renamed from: r */
        boolean f846r;

        /* renamed from: s */
        Bundle f847s;

        u(int i10) {
            this.f829a = i10;
        }

        androidx.appcompat.view.menu.n a(m.a aVar) {
            if (this.f838j == null) {
                return null;
            }
            if (this.f839k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.f840l, g.g.f15373j);
                this.f839k = eVar;
                eVar.d(aVar);
                this.f838j.b(this.f839k);
            }
            return this.f839k.j(this.f835g);
        }

        public boolean b() {
            if (this.f836h == null) {
                return false;
            }
            return this.f837i != null || this.f839k.a().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.f838j;
            if (gVar == gVar2) {
                return;
            }
            if (gVar2 != null) {
                gVar2.O(this.f839k);
            }
            this.f838j = gVar;
            if (gVar == null || (eVar = this.f839k) == null) {
                return;
            }
            gVar.b(eVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(g.a.f15261a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                newTheme.applyStyle(i10, true);
            }
            newTheme.resolveAttribute(g.a.E, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 == 0) {
                i11 = g.i.f15397b;
            }
            newTheme.applyStyle(i11, true);
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f840l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(g.j.f15522y0);
            this.f830b = obtainStyledAttributes.getResourceId(g.j.B0, 0);
            this.f834f = obtainStyledAttributes.getResourceId(g.j.A0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public final class v implements m.a {
        v() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void b(androidx.appcompat.view.menu.g gVar, boolean z10) {
            androidx.appcompat.view.menu.g D = gVar.D();
            boolean z11 = D != gVar;
            h hVar = h.this;
            if (z11) {
                gVar = D;
            }
            u n02 = hVar.n0(gVar);
            if (n02 != null) {
                if (!z11) {
                    h.this.d0(n02, z10);
                } else {
                    h.this.Z(n02.f829a, n02, D);
                    h.this.d0(n02, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean c(androidx.appcompat.view.menu.g gVar) {
            Window.Callback w02;
            if (gVar != gVar.D()) {
                return true;
            }
            h hVar = h.this;
            if (!hVar.R || (w02 = hVar.w0()) == null || h.this.f781c0) {
                return true;
            }
            w02.onMenuOpened(108, gVar);
            return true;
        }
    }

    public h(Activity activity, androidx.appcompat.app.e eVar) {
        this(activity, null, eVar, activity);
    }

    public h(Dialog dialog, androidx.appcompat.app.e eVar) {
        this(dialog.getContext(), dialog.getWindow(), eVar, dialog);
    }

    private h(Context context, Window window, androidx.appcompat.app.e eVar, Object obj) {
        androidx.collection.h<String, Integer> hVar;
        Integer num;
        androidx.appcompat.app.d a12;
        this.J = null;
        this.K = true;
        this.f783e0 = -100;
        this.f791m0 = new a();
        this.f800v = context;
        this.f803y = eVar;
        this.f799u = obj;
        if (this.f783e0 == -100 && (obj instanceof Dialog) && (a12 = a1()) != null) {
            this.f783e0 = a12.getDelegate().o();
        }
        if (this.f783e0 == -100 && (num = (hVar = f774u0).get(obj.getClass().getName())) != null) {
            this.f783e0 = num.intValue();
            hVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            W(window);
        }
        androidx.appcompat.widget.j.h();
    }

    private boolean A0(u uVar) {
        Resources.Theme theme;
        Context context = this.f800v;
        int i10 = uVar.f829a;
        if ((i10 == 0 || i10 == 108) && this.C != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(g.a.f15266f, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(g.a.f15267g, typedValue, true);
            } else {
                theme2.resolveAttribute(g.a.f15267g, typedValue, true);
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
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(theme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.R(this);
        uVar.c(gVar);
        return true;
    }

    private void B0(int i10) {
        this.f790l0 = (1 << i10) | this.f790l0;
        if (this.f789k0) {
            return;
        }
        x0.R(this.f801w.getDecorView(), this.f791m0);
        this.f789k0 = true;
    }

    private boolean G0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        u u02 = u0(i10, true);
        if (u02.f843o) {
            return false;
        }
        return Q0(u02, keyEvent);
    }

    private boolean J0(int i10, KeyEvent keyEvent) {
        boolean z10;
        n0 n0Var;
        if (this.F != null) {
            return false;
        }
        boolean z11 = true;
        u u02 = u0(i10, true);
        if (i10 != 0 || (n0Var = this.C) == null || !n0Var.a() || ViewConfiguration.get(this.f800v).hasPermanentMenuKey()) {
            boolean z12 = u02.f843o;
            if (z12 || u02.f842n) {
                d0(u02, true);
                z11 = z12;
            } else {
                if (u02.f841m) {
                    if (u02.f846r) {
                        u02.f841m = false;
                        z10 = Q0(u02, keyEvent);
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        N0(u02, keyEvent);
                    }
                }
                z11 = false;
            }
        } else if (this.C.e()) {
            z11 = this.C.b();
        } else {
            if (!this.f781c0 && Q0(u02, keyEvent)) {
                z11 = this.C.c();
            }
            z11 = false;
        }
        if (z11) {
            AudioManager audioManager = (AudioManager) this.f800v.getApplicationContext().getSystemService("audio");
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void N0(androidx.appcompat.app.h.u r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.N0(androidx.appcompat.app.h$u, android.view.KeyEvent):void");
    }

    private boolean P0(u uVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.g gVar;
        boolean z10 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((uVar.f841m || Q0(uVar, keyEvent)) && (gVar = uVar.f838j) != null) {
            z10 = gVar.performShortcut(i10, keyEvent, i11);
        }
        if (z10 && (i11 & 1) == 0 && this.C == null) {
            d0(uVar, true);
        }
        return z10;
    }

    private boolean Q0(u uVar, KeyEvent keyEvent) {
        n0 n0Var;
        n0 n0Var2;
        n0 n0Var3;
        if (this.f781c0) {
            return false;
        }
        if (uVar.f841m) {
            return true;
        }
        u uVar2 = this.Y;
        if (uVar2 != null && uVar2 != uVar) {
            d0(uVar2, false);
        }
        Window.Callback w02 = w0();
        if (w02 != null) {
            uVar.f837i = w02.onCreatePanelView(uVar.f829a);
        }
        int i10 = uVar.f829a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (n0Var3 = this.C) != null) {
            n0Var3.f();
        }
        if (uVar.f837i == null && (!z10 || !(O0() instanceof androidx.appcompat.app.u))) {
            androidx.appcompat.view.menu.g gVar = uVar.f838j;
            if (gVar == null || uVar.f846r) {
                if (gVar == null && (!A0(uVar) || uVar.f838j == null)) {
                    return false;
                }
                if (z10 && this.C != null) {
                    if (this.D == null) {
                        this.D = new C0019h();
                    }
                    this.C.d(uVar.f838j, this.D);
                }
                uVar.f838j.e0();
                if (!w02.onCreatePanelMenu(uVar.f829a, uVar.f838j)) {
                    uVar.c(null);
                    if (z10 && (n0Var = this.C) != null) {
                        n0Var.d(null, this.D);
                    }
                    return false;
                }
                uVar.f846r = false;
            }
            uVar.f838j.e0();
            Bundle bundle = uVar.f847s;
            if (bundle != null) {
                uVar.f838j.P(bundle);
                uVar.f847s = null;
            }
            if (!w02.onPreparePanel(0, uVar.f837i, uVar.f838j)) {
                if (z10 && (n0Var2 = this.C) != null) {
                    n0Var2.d(null, this.D);
                }
                uVar.f838j.d0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            uVar.f844p = z11;
            uVar.f838j.setQwertyMode(z11);
            uVar.f838j.d0();
        }
        uVar.f841m = true;
        uVar.f842n = false;
        this.Y = uVar;
        return true;
    }

    private void R0(boolean z10) {
        n0 n0Var = this.C;
        if (n0Var == null || !n0Var.a() || (ViewConfiguration.get(this.f800v).hasPermanentMenuKey() && !this.C.h())) {
            u u02 = u0(0, true);
            u02.f845q = true;
            d0(u02, false);
            N0(u02, null);
            return;
        }
        Window.Callback w02 = w0();
        if (this.C.e() && z10) {
            this.C.b();
            if (this.f781c0) {
                return;
            }
            w02.onPanelClosed(108, u0(0, true).f838j);
            return;
        }
        if (w02 == null || this.f781c0) {
            return;
        }
        if (this.f789k0 && (this.f790l0 & 1) != 0) {
            this.f801w.getDecorView().removeCallbacks(this.f791m0);
            this.f791m0.run();
        }
        u u03 = u0(0, true);
        androidx.appcompat.view.menu.g gVar = u03.f838j;
        if (gVar == null || u03.f846r || !w02.onPreparePanel(0, u03.f837i, gVar)) {
            return;
        }
        w02.onMenuOpened(108, u03.f838j);
        this.C.c();
    }

    private boolean S(boolean z10) {
        return T(z10, true);
    }

    private int S0(int i10) {
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

    private boolean T(boolean z10, boolean z11) {
        if (this.f781c0) {
            return false;
        }
        int Y = Y();
        int D0 = D0(this.f800v, Y);
        androidx.core.os.h X = Build.VERSION.SDK_INT < 33 ? X(this.f800v) : null;
        if (!z11 && X != null) {
            X = t0(this.f800v.getResources().getConfiguration());
        }
        boolean c12 = c1(D0, X, z10);
        if (Y == 0) {
            s0(this.f800v).e();
        } else {
            q qVar = this.f787i0;
            if (qVar != null) {
                qVar.a();
            }
        }
        if (Y == 3) {
            r0(this.f800v).e();
        } else {
            q qVar2 = this.f788j0;
            if (qVar2 != null) {
                qVar2.a();
            }
        }
        return c12;
    }

    private void V() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.M.findViewById(R.id.content);
        View decorView = this.f801w.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f800v.obtainStyledAttributes(g.j.f15522y0);
        obtainStyledAttributes.getValue(g.j.K0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(g.j.L0, contentFrameLayout.getMinWidthMinor());
        int i10 = g.j.I0;
        if (obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = g.j.J0;
        if (obtainStyledAttributes.hasValue(i11)) {
            obtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = g.j.G0;
        if (obtainStyledAttributes.hasValue(i12)) {
            obtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = g.j.H0;
        if (obtainStyledAttributes.hasValue(i13)) {
            obtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void W(Window window) {
        if (this.f801w != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof o) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        o oVar = new o(callback);
        this.f802x = oVar;
        window.setCallback(oVar);
        l1 t10 = l1.t(this.f800v, null, f776w0);
        Drawable g10 = t10.g(0);
        if (g10 != null) {
            window.setBackgroundDrawable(g10);
        }
        t10.v();
        this.f801w = window;
        if (Build.VERSION.SDK_INT < 33 || this.f797s0 != null) {
            return;
        }
        M(null);
    }

    private boolean W0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f801w.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || x0.G((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int Y() {
        int i10 = this.f783e0;
        return i10 != -100 ? i10 : androidx.appcompat.app.g.m();
    }

    private void Z0() {
        if (this.L) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private androidx.appcompat.app.d a1() {
        for (Context context = this.f800v; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof androidx.appcompat.app.d) {
                return (androidx.appcompat.app.d) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void b0() {
        q qVar = this.f787i0;
        if (qVar != null) {
            qVar.a();
        }
        q qVar2 = this.f788j0;
        if (qVar2 != null) {
            qVar2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b1(Configuration configuration) {
        Activity activity = (Activity) this.f799u;
        if (activity instanceof androidx.lifecycle.k) {
            if (!((androidx.lifecycle.k) activity).getLifecycle().b().h(f.b.CREATED)) {
                return;
            }
        } else if (!this.f780b0 || this.f781c0) {
            return;
        }
        activity.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean c1(int r9, androidx.core.os.h r10, boolean r11) {
        /*
            r8 = this;
            android.content.Context r1 = r8.f800v
            r4 = 0
            r5 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            android.content.res.Configuration r0 = r0.e0(r1, r2, r3, r4, r5)
            android.content.Context r1 = r8.f800v
            int r1 = r8.q0(r1)
            android.content.res.Configuration r2 = r8.f782d0
            if (r2 != 0) goto L1f
            android.content.Context r2 = r8.f800v
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L1f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            androidx.core.os.h r2 = r8.t0(r2)
            r5 = 0
            if (r10 != 0) goto L30
            r0 = r5
            goto L34
        L30:
            androidx.core.os.h r0 = r8.t0(r0)
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
            boolean r11 = r8.f779a0
            if (r11 == 0) goto L71
            boolean r11 = androidx.appcompat.app.h.f777x0
            if (r11 != 0) goto L5a
            boolean r11 = r8.f780b0
            if (r11 == 0) goto L71
        L5a:
            java.lang.Object r11 = r8.f799u
            boolean r2 = r11 instanceof android.app.Activity
            if (r2 == 0) goto L71
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r11 = r11.isChild()
            if (r11 != 0) goto L71
            java.lang.Object r11 = r8.f799u
            android.app.Activity r11 = (android.app.Activity) r11
            androidx.core.app.b.f(r11)
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
            r8.e1(r4, r0, r6, r5)
            goto L80
        L7f:
            r7 = r11
        L80:
            if (r7 == 0) goto L9c
            java.lang.Object r11 = r8.f799u
            boolean r1 = r11 instanceof androidx.appcompat.app.d
            if (r1 == 0) goto L9c
            r1 = r3 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L91
            androidx.appcompat.app.d r11 = (androidx.appcompat.app.d) r11
            r11.onNightModeChanged(r9)
        L91:
            r9 = r3 & 4
            if (r9 == 0) goto L9c
            java.lang.Object r9 = r8.f799u
            androidx.appcompat.app.d r9 = (androidx.appcompat.app.d) r9
            r9.onLocalesChanged(r10)
        L9c:
            if (r7 == 0) goto Lb1
            if (r0 == 0) goto Lb1
            android.content.Context r9 = r8.f800v
            android.content.res.Resources r9 = r9.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            androidx.core.os.h r9 = r8.t0(r9)
            r8.U0(r9)
        Lb1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.c1(int, androidx.core.os.h, boolean):boolean");
    }

    private Configuration e0(Context context, int i10, androidx.core.os.h hVar, Configuration configuration, boolean z10) {
        int i11 = i10 != 1 ? i10 != 2 ? z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (hVar != null) {
            T0(configuration2, hVar);
        }
        return configuration2;
    }

    private void e1(int i10, androidx.core.os.h hVar, boolean z10, Configuration configuration) {
        Resources resources = this.f800v.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        if (hVar != null) {
            T0(configuration2, hVar);
        }
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            androidx.appcompat.app.t.a(resources);
        }
        int i11 = this.f784f0;
        if (i11 != 0) {
            this.f800v.setTheme(i11);
            this.f800v.getTheme().applyStyle(this.f784f0, true);
        }
        if (z10 && (this.f799u instanceof Activity)) {
            b1(configuration2);
        }
    }

    private ViewGroup f0() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f800v.obtainStyledAttributes(g.j.f15522y0);
        int i10 = g.j.D0;
        if (!obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(g.j.M0, false)) {
            H(1);
        } else if (obtainStyledAttributes.getBoolean(i10, false)) {
            H(108);
        }
        if (obtainStyledAttributes.getBoolean(g.j.E0, false)) {
            H(109);
        }
        if (obtainStyledAttributes.getBoolean(g.j.F0, false)) {
            H(10);
        }
        this.U = obtainStyledAttributes.getBoolean(g.j.f15527z0, false);
        obtainStyledAttributes.recycle();
        m0();
        this.f801w.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f800v);
        if (this.V) {
            viewGroup = (ViewGroup) from.inflate(this.T ? g.g.f15378o : g.g.f15377n, (ViewGroup) null);
        } else if (this.U) {
            viewGroup = (ViewGroup) from.inflate(g.g.f15369f, (ViewGroup) null);
            this.S = false;
            this.R = false;
        } else if (this.R) {
            TypedValue typedValue = new TypedValue();
            this.f800v.getTheme().resolveAttribute(g.a.f15266f, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.d(this.f800v, typedValue.resourceId) : this.f800v).inflate(g.g.f15379p, (ViewGroup) null);
            n0 n0Var = (n0) viewGroup.findViewById(g.f.f15353p);
            this.C = n0Var;
            n0Var.setWindowCallback(w0());
            if (this.S) {
                this.C.i(109);
            }
            if (this.P) {
                this.C.i(2);
            }
            if (this.Q) {
                this.C.i(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.R + ", windowActionBarOverlay: " + this.S + ", android:windowIsFloating: " + this.U + ", windowActionModeOverlay: " + this.T + ", windowNoTitle: " + this.V + " }");
        }
        x0.h0(viewGroup, new b());
        if (this.C == null) {
            this.N = (TextView) viewGroup.findViewById(g.f.M);
        }
        x1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(g.f.f15339b);
        ViewGroup viewGroup2 = (ViewGroup) this.f801w.findViewById(R.id.content);
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
        this.f801w.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void g1(View view) {
        Context context;
        int i10;
        if ((x0.B(view) & 8192) != 0) {
            context = this.f800v;
            i10 = g.c.f15290b;
        } else {
            context = this.f800v;
            i10 = g.c.f15289a;
        }
        view.setBackgroundColor(androidx.core.content.a.getColor(context, i10));
    }

    private void l0() {
        if (this.L) {
            return;
        }
        this.M = f0();
        CharSequence v02 = v0();
        if (!TextUtils.isEmpty(v02)) {
            n0 n0Var = this.C;
            if (n0Var != null) {
                n0Var.setWindowTitle(v02);
            } else if (O0() != null) {
                O0().x(v02);
            } else {
                TextView textView = this.N;
                if (textView != null) {
                    textView.setText(v02);
                }
            }
        }
        V();
        M0(this.M);
        this.L = true;
        u u02 = u0(0, false);
        if (this.f781c0) {
            return;
        }
        if (u02 == null || u02.f838j == null) {
            B0(108);
        }
    }

    private void m0() {
        if (this.f801w == null) {
            Object obj = this.f799u;
            if (obj instanceof Activity) {
                W(((Activity) obj).getWindow());
            }
        }
        if (this.f801w == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration o0(Configuration configuration, Configuration configuration2) {
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
            l.a(configuration, configuration2, configuration3);
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
                m.a(configuration, configuration2, configuration3);
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
            j.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    private int q0(Context context) {
        if (!this.f786h0 && (this.f799u instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f799u.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f785g0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.f785g0 = 0;
            }
        }
        this.f786h0 = true;
        return this.f785g0;
    }

    private q r0(Context context) {
        if (this.f788j0 == null) {
            this.f788j0 = new p(context);
        }
        return this.f788j0;
    }

    private q s0(Context context) {
        if (this.f787i0 == null) {
            this.f787i0 = new r(w.a(context));
        }
        return this.f787i0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void x0() {
        /*
            r3 = this;
            r3.l0()
            boolean r0 = r3.R
            if (r0 == 0) goto L37
            androidx.appcompat.app.a r0 = r3.f804z
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            java.lang.Object r0 = r3.f799u
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            androidx.appcompat.app.x r0 = new androidx.appcompat.app.x
            java.lang.Object r1 = r3.f799u
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.S
            r0.<init>(r1, r2)
        L1d:
            r3.f804z = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            androidx.appcompat.app.x r0 = new androidx.appcompat.app.x
            java.lang.Object r1 = r3.f799u
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            androidx.appcompat.app.a r0 = r3.f804z
            if (r0 == 0) goto L37
            boolean r1 = r3.f792n0
            r0.t(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.x0():void");
    }

    private boolean y0(u uVar) {
        View view = uVar.f837i;
        if (view != null) {
            uVar.f836h = view;
            return true;
        }
        if (uVar.f838j == null) {
            return false;
        }
        if (this.E == null) {
            this.E = new v();
        }
        View view2 = (View) uVar.a(this.E);
        uVar.f836h = view2;
        return view2 != null;
    }

    private boolean z0(u uVar) {
        uVar.d(p0());
        uVar.f835g = new t(uVar.f840l);
        uVar.f831c = 81;
        return true;
    }

    @Override // androidx.appcompat.app.g
    public void A(Bundle bundle) {
        l0();
    }

    @Override // androidx.appcompat.app.g
    public void B() {
        androidx.appcompat.app.a s10 = s();
        if (s10 != null) {
            s10.v(true);
        }
    }

    @Override // androidx.appcompat.app.g
    public void C(Bundle bundle) {
    }

    public boolean C0() {
        return this.K;
    }

    @Override // androidx.appcompat.app.g
    public void D() {
        T(true, false);
    }

    int D0(Context context, int i10) {
        q s02;
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    s02 = r0(context);
                }
            } else {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                s02 = s0(context);
            }
            return s02.c();
        }
        return i10;
    }

    @Override // androidx.appcompat.app.g
    public void E() {
        androidx.appcompat.app.a s10 = s();
        if (s10 != null) {
            s10.v(false);
        }
    }

    public boolean E0() {
        boolean z10 = this.Z;
        this.Z = false;
        u u02 = u0(0, false);
        if (u02 != null && u02.f843o) {
            if (!z10) {
                d0(u02, true);
            }
            return true;
        }
        androidx.appcompat.view.b bVar = this.F;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a s10 = s();
        return s10 != null && s10.g();
    }

    boolean F0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.Z = (keyEvent.getFlags() & RecognitionOptions.ITF) != 0;
        } else if (i10 == 82) {
            G0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.g
    public boolean H(int i10) {
        int S0 = S0(i10);
        if (this.V && S0 == 108) {
            return false;
        }
        if (this.R && S0 == 1) {
            this.R = false;
        }
        if (S0 == 1) {
            Z0();
            this.V = true;
            return true;
        }
        if (S0 == 2) {
            Z0();
            this.P = true;
            return true;
        }
        if (S0 == 5) {
            Z0();
            this.Q = true;
            return true;
        }
        if (S0 == 10) {
            Z0();
            this.T = true;
            return true;
        }
        if (S0 == 108) {
            Z0();
            this.R = true;
            return true;
        }
        if (S0 != 109) {
            return this.f801w.requestFeature(S0);
        }
        Z0();
        this.S = true;
        return true;
    }

    boolean H0(int i10, KeyEvent keyEvent) {
        androidx.appcompat.app.a s10 = s();
        if (s10 != null && s10.p(i10, keyEvent)) {
            return true;
        }
        u uVar = this.Y;
        if (uVar != null && P0(uVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            u uVar2 = this.Y;
            if (uVar2 != null) {
                uVar2.f842n = true;
            }
            return true;
        }
        if (this.Y == null) {
            u u02 = u0(0, true);
            Q0(u02, keyEvent);
            boolean P0 = P0(u02, keyEvent.getKeyCode(), keyEvent, 1);
            u02.f841m = false;
            if (P0) {
                return true;
            }
        }
        return false;
    }

    boolean I0(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            if (i10 == 82) {
                J0(0, keyEvent);
                return true;
            }
        } else if (E0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.g
    public void J(int i10) {
        l0();
        ViewGroup viewGroup = (ViewGroup) this.M.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f800v).inflate(i10, viewGroup);
        this.f802x.c(this.f801w.getCallback());
    }

    @Override // androidx.appcompat.app.g
    public void K(View view) {
        l0();
        ViewGroup viewGroup = (ViewGroup) this.M.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f802x.c(this.f801w.getCallback());
    }

    void K0(int i10) {
        androidx.appcompat.app.a s10;
        if (i10 != 108 || (s10 = s()) == null) {
            return;
        }
        s10.h(true);
    }

    @Override // androidx.appcompat.app.g
    public void L(View view, ViewGroup.LayoutParams layoutParams) {
        l0();
        ViewGroup viewGroup = (ViewGroup) this.M.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f802x.c(this.f801w.getCallback());
    }

    void L0(int i10) {
        if (i10 == 108) {
            androidx.appcompat.app.a s10 = s();
            if (s10 != null) {
                s10.h(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            u u02 = u0(i10, true);
            if (u02.f843o) {
                d0(u02, false);
            }
        }
    }

    @Override // androidx.appcompat.app.g
    public void M(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.M(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f797s0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f798t0) != null) {
            n.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f798t0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f799u;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                onBackInvokedDispatcher = n.a((Activity) this.f799u);
            }
        }
        this.f797s0 = onBackInvokedDispatcher;
        d1();
    }

    void M0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.g
    public void N(Toolbar toolbar) {
        if (this.f799u instanceof Activity) {
            androidx.appcompat.app.a s10 = s();
            if (s10 instanceof x) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.A = null;
            if (s10 != null) {
                s10.o();
            }
            this.f804z = null;
            if (toolbar != null) {
                androidx.appcompat.app.u uVar = new androidx.appcompat.app.u(toolbar, v0(), this.f802x);
                this.f804z = uVar;
                this.f802x.e(uVar.f882c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f802x.e(null);
            }
            u();
        }
    }

    @Override // androidx.appcompat.app.g
    public void O(int i10) {
        this.f784f0 = i10;
    }

    final androidx.appcompat.app.a O0() {
        return this.f804z;
    }

    @Override // androidx.appcompat.app.g
    public final void P(CharSequence charSequence) {
        this.B = charSequence;
        n0 n0Var = this.C;
        if (n0Var != null) {
            n0Var.setWindowTitle(charSequence);
            return;
        }
        if (O0() != null) {
            O0().x(charSequence);
            return;
        }
        TextView textView = this.N;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.g
    public androidx.appcompat.view.b Q(b.a aVar) {
        androidx.appcompat.app.e eVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.b bVar = this.F;
        if (bVar != null) {
            bVar.c();
        }
        i iVar = new i(aVar);
        androidx.appcompat.app.a s10 = s();
        if (s10 != null) {
            androidx.appcompat.view.b z10 = s10.z(iVar);
            this.F = z10;
            if (z10 != null && (eVar = this.f803y) != null) {
                eVar.onSupportActionModeStarted(z10);
            }
        }
        if (this.F == null) {
            this.F = Y0(iVar);
        }
        d1();
        return this.F;
    }

    void T0(Configuration configuration, androidx.core.os.h hVar) {
        l.d(configuration, hVar);
    }

    public boolean U() {
        return S(true);
    }

    void U0(androidx.core.os.h hVar) {
        l.c(hVar);
    }

    final boolean V0() {
        ViewGroup viewGroup;
        return this.L && (viewGroup = this.M) != null && x0.H(viewGroup);
    }

    androidx.core.os.h X(Context context) {
        androidx.core.os.h r10;
        if (Build.VERSION.SDK_INT >= 33 || (r10 = androidx.appcompat.app.g.r()) == null) {
            return null;
        }
        androidx.core.os.h t02 = t0(context.getApplicationContext().getResources().getConfiguration());
        androidx.core.os.h b10 = androidx.appcompat.app.s.b(r10, t02);
        return b10.f() ? t02 : b10;
    }

    boolean X0() {
        if (this.f797s0 == null) {
            return false;
        }
        u u02 = u0(0, false);
        return (u02 != null && u02.f843o) || this.F != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.appcompat.view.b Y0(androidx.appcompat.view.b.a r8) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.Y0(androidx.appcompat.view.b$a):androidx.appcompat.view.b");
    }

    void Z(int i10, u uVar, Menu menu) {
        if (menu == null) {
            if (uVar == null && i10 >= 0) {
                u[] uVarArr = this.X;
                if (i10 < uVarArr.length) {
                    uVar = uVarArr[i10];
                }
            }
            if (uVar != null) {
                menu = uVar.f838j;
            }
        }
        if ((uVar == null || uVar.f843o) && !this.f781c0) {
            this.f802x.d(this.f801w.getCallback(), i10, menu);
        }
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        u n02;
        Window.Callback w02 = w0();
        if (w02 == null || this.f781c0 || (n02 = n0(gVar.D())) == null) {
            return false;
        }
        return w02.onMenuItemSelected(n02.f829a, menuItem);
    }

    void a0(androidx.appcompat.view.menu.g gVar) {
        if (this.W) {
            return;
        }
        this.W = true;
        this.C.j();
        Window.Callback w02 = w0();
        if (w02 != null && !this.f781c0) {
            w02.onPanelClosed(108, gVar);
        }
        this.W = false;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(androidx.appcompat.view.menu.g gVar) {
        R0(true);
    }

    void c0(int i10) {
        d0(u0(i10, true), true);
    }

    void d0(u uVar, boolean z10) {
        ViewGroup viewGroup;
        n0 n0Var;
        if (z10 && uVar.f829a == 0 && (n0Var = this.C) != null && n0Var.e()) {
            a0(uVar.f838j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f800v.getSystemService("window");
        if (windowManager != null && uVar.f843o && (viewGroup = uVar.f835g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                Z(uVar.f829a, uVar, null);
            }
        }
        uVar.f841m = false;
        uVar.f842n = false;
        uVar.f843o = false;
        uVar.f836h = null;
        uVar.f845q = true;
        if (this.Y == uVar) {
            this.Y = null;
        }
        if (uVar.f829a == 0) {
            d1();
        }
    }

    void d1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean X0 = X0();
            if (X0 && this.f798t0 == null) {
                this.f798t0 = n.b(this.f797s0, this);
            } else {
                if (X0 || (onBackInvokedCallback = this.f798t0) == null) {
                    return;
                }
                n.c(this.f797s0, onBackInvokedCallback);
            }
        }
    }

    @Override // androidx.appcompat.app.g
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        l0();
        ((ViewGroup) this.M.findViewById(R.id.content)).addView(view, layoutParams);
        this.f802x.c(this.f801w.getCallback());
    }

    final int f1(r2 r2Var, Rect rect) {
        boolean z10;
        boolean z11;
        int k10 = r2Var != null ? r2Var.k() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.G;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.G.getLayoutParams();
            if (this.G.isShown()) {
                if (this.f793o0 == null) {
                    this.f793o0 = new Rect();
                    this.f794p0 = new Rect();
                }
                Rect rect2 = this.f793o0;
                Rect rect3 = this.f794p0;
                if (r2Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(r2Var.i(), r2Var.k(), r2Var.j(), r2Var.h());
                }
                x1.a(this.M, rect2, rect3);
                int i10 = rect2.top;
                int i11 = rect2.left;
                int i12 = rect2.right;
                r2 y10 = x0.y(this.M);
                int i13 = y10 == null ? 0 : y10.i();
                int j10 = y10 == null ? 0 : y10.j();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || this.O != null) {
                    View view = this.O;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i14 = marginLayoutParams2.height;
                        int i15 = marginLayoutParams.topMargin;
                        if (i14 != i15 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != j10) {
                            marginLayoutParams2.height = i15;
                            marginLayoutParams2.leftMargin = i13;
                            marginLayoutParams2.rightMargin = j10;
                            this.O.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f800v);
                    this.O = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i13;
                    layoutParams.rightMargin = j10;
                    this.M.addView(this.O, -1, layoutParams);
                }
                View view3 = this.O;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    g1(this.O);
                }
                if (!this.T && r5) {
                    k10 = 0;
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
                this.G.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.O;
        if (view4 != null) {
            view4.setVisibility(z10 ? 0 : 8);
        }
        return k10;
    }

    @Override // androidx.appcompat.app.g
    public Context g(Context context) {
        this.f779a0 = true;
        int D0 = D0(context, Y());
        if (androidx.appcompat.app.g.v(context)) {
            androidx.appcompat.app.g.R(context);
        }
        androidx.core.os.h X = X(context);
        if (f778y0 && (context instanceof ContextThemeWrapper)) {
            try {
                s.a((ContextThemeWrapper) context, e0(context, D0, X, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context).a(e0(context, D0, X, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f777x0) {
            return super.g(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = j.a(context, configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration e02 = e0(context, D0, X, !configuration2.equals(configuration3) ? o0(configuration2, configuration3) : null, true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, g.i.f15399d);
        dVar.a(e02);
        boolean z10 = false;
        try {
            z10 = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z10) {
            f.C0043f.a(dVar.getTheme());
        }
        return super.g(dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View g0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        androidx.appcompat.app.n nVar;
        boolean z11 = false;
        if (this.f795q0 == null) {
            String string = this.f800v.obtainStyledAttributes(g.j.f15522y0).getString(g.j.C0);
            if (string == null) {
                nVar = new androidx.appcompat.app.n();
            } else {
                try {
                    this.f795q0 = (androidx.appcompat.app.n) this.f800v.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    nVar = new androidx.appcompat.app.n();
                }
            }
            this.f795q0 = nVar;
        }
        boolean z12 = f775v0;
        if (z12) {
            if (this.f796r0 == null) {
                this.f796r0 = new androidx.appcompat.app.r();
            }
            if (this.f796r0.a(attributeSet)) {
                z10 = true;
                return this.f795q0.r(view, str, context, attributeSet, z10, z12, true, w1.d());
            }
            if (!(attributeSet instanceof XmlPullParser)) {
                z11 = W0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z11 = true;
            }
        }
        z10 = z11;
        return this.f795q0.r(view, str, context, attributeSet, z10, z12, true, w1.d());
    }

    void h0() {
        androidx.appcompat.view.menu.g gVar;
        n0 n0Var = this.C;
        if (n0Var != null) {
            n0Var.j();
        }
        if (this.H != null) {
            this.f801w.getDecorView().removeCallbacks(this.I);
            if (this.H.isShowing()) {
                try {
                    this.H.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.H = null;
        }
        k0();
        u u02 = u0(0, false);
        if (u02 == null || (gVar = u02.f838j) == null) {
            return;
        }
        gVar.close();
    }

    boolean i0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f799u;
        if (((obj instanceof s.a) || (obj instanceof androidx.appcompat.app.m)) && (decorView = this.f801w.getDecorView()) != null && androidx.core.view.s.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f802x.b(this.f801w.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? F0(keyCode, keyEvent) : I0(keyCode, keyEvent);
    }

    @Override // androidx.appcompat.app.g
    public <T extends View> T j(int i10) {
        l0();
        return (T) this.f801w.findViewById(i10);
    }

    void j0(int i10) {
        u u02;
        u u03 = u0(i10, true);
        if (u03.f838j != null) {
            Bundle bundle = new Bundle();
            u03.f838j.Q(bundle);
            if (bundle.size() > 0) {
                u03.f847s = bundle;
            }
            u03.f838j.e0();
            u03.f838j.clear();
        }
        u03.f846r = true;
        u03.f845q = true;
        if ((i10 != 108 && i10 != 0) || this.C == null || (u02 = u0(0, false)) == null) {
            return;
        }
        u02.f841m = false;
        Q0(u02, null);
    }

    void k0() {
        n2 n2Var = this.J;
        if (n2Var != null) {
            n2Var.c();
        }
    }

    @Override // androidx.appcompat.app.g
    public Context l() {
        return this.f800v;
    }

    @Override // androidx.appcompat.app.g
    public final androidx.appcompat.app.b n() {
        return new f();
    }

    u n0(Menu menu) {
        u[] uVarArr = this.X;
        int length = uVarArr != null ? uVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            u uVar = uVarArr[i10];
            if (uVar != null && uVar.f838j == menu) {
                return uVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.g
    public int o() {
        return this.f783e0;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return g0(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    final Context p0() {
        androidx.appcompat.app.a s10 = s();
        Context j10 = s10 != null ? s10.j() : null;
        return j10 == null ? this.f800v : j10;
    }

    @Override // androidx.appcompat.app.g
    public MenuInflater q() {
        if (this.A == null) {
            x0();
            androidx.appcompat.app.a aVar = this.f804z;
            this.A = new androidx.appcompat.view.g(aVar != null ? aVar.j() : this.f800v);
        }
        return this.A;
    }

    @Override // androidx.appcompat.app.g
    public androidx.appcompat.app.a s() {
        x0();
        return this.f804z;
    }

    @Override // androidx.appcompat.app.g
    public void t() {
        LayoutInflater from = LayoutInflater.from(this.f800v);
        if (from.getFactory() == null) {
            androidx.core.view.t.a(from, this);
        } else {
            if (from.getFactory2() instanceof h) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    androidx.core.os.h t0(Configuration configuration) {
        return l.b(configuration);
    }

    @Override // androidx.appcompat.app.g
    public void u() {
        if (O0() == null || s().l()) {
            return;
        }
        B0(0);
    }

    protected u u0(int i10, boolean z10) {
        u[] uVarArr = this.X;
        if (uVarArr == null || uVarArr.length <= i10) {
            u[] uVarArr2 = new u[i10 + 1];
            if (uVarArr != null) {
                System.arraycopy(uVarArr, 0, uVarArr2, 0, uVarArr.length);
            }
            this.X = uVarArr2;
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

    final CharSequence v0() {
        Object obj = this.f799u;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.B;
    }

    final Window.Callback w0() {
        return this.f801w.getCallback();
    }

    @Override // androidx.appcompat.app.g
    public void x(Configuration configuration) {
        androidx.appcompat.app.a s10;
        if (this.R && this.L && (s10 = s()) != null) {
            s10.n(configuration);
        }
        androidx.appcompat.widget.j.b().g(this.f800v);
        this.f782d0 = new Configuration(this.f800v.getResources().getConfiguration());
        T(false, false);
    }

    @Override // androidx.appcompat.app.g
    public void y(Bundle bundle) {
        String str;
        this.f779a0 = true;
        S(false);
        m0();
        Object obj = this.f799u;
        if (obj instanceof Activity) {
            try {
                str = androidx.core.app.m.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                androidx.appcompat.app.a O0 = O0();
                if (O0 == null) {
                    this.f792n0 = true;
                } else {
                    O0.t(true);
                }
            }
            androidx.appcompat.app.g.d(this);
        }
        this.f782d0 = new Configuration(this.f800v.getResources().getConfiguration());
        this.f780b0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @Override // androidx.appcompat.app.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void z() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f799u
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.g.F(r3)
        L9:
            boolean r0 = r3.f789k0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f801w
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f791m0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.f781c0 = r0
            int r0 = r3.f783e0
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f799u
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            androidx.collection.h<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.h.f774u0
            java.lang.Object r1 = r3.f799u
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f783e0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            androidx.collection.h<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.h.f774u0
            java.lang.Object r1 = r3.f799u
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.a r0 = r3.f804z
            if (r0 == 0) goto L5b
            r0.o()
        L5b:
            r3.b0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.z():void");
    }
}
