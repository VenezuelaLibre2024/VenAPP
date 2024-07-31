package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.core.text.C0976n;
import androidx.core.util.C0984h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.core.widget.k */
/* loaded from: classes.dex */
public final class C1141k {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.k$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static boolean m5593a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        /* renamed from: b */
        static int m5594b(TextView textView) {
            return textView.getMaxLines();
        }

        /* renamed from: c */
        static int m5595c(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.k$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        static Drawable[] m5596a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: b */
        static int m5597b(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: c */
        static int m5598c(View view) {
            return view.getTextDirection();
        }

        /* renamed from: d */
        static Locale m5599d(TextView textView) {
            return textView.getTextLocale();
        }

        /* renamed from: e */
        static void m5600e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: f */
        static void m5601f(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
        }

        /* renamed from: g */
        static void m5602g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: h */
        static void m5603h(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.k$c */
    /* loaded from: classes.dex */
    public static class c {
        /* renamed from: a */
        static int m5604a(TextView textView) {
            return textView.getBreakStrategy();
        }

        /* renamed from: b */
        static ColorStateList m5605b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        /* renamed from: c */
        static PorterDuff.Mode m5606c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        /* renamed from: d */
        static int m5607d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        /* renamed from: e */
        static void m5608e(TextView textView, int i10) {
            textView.setBreakStrategy(i10);
        }

        /* renamed from: f */
        static void m5609f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        /* renamed from: g */
        static void m5610g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        /* renamed from: h */
        static void m5611h(TextView textView, int i10) {
            textView.setHyphenationFrequency(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.k$d */
    /* loaded from: classes.dex */
    public static class d {
        /* renamed from: a */
        static DecimalFormatSymbols m5612a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.k$e */
    /* loaded from: classes.dex */
    public static class e {
        /* renamed from: a */
        static String[] m5613a(DecimalFormatSymbols decimalFormatSymbols) {
            String[] digitStrings;
            digitStrings = decimalFormatSymbols.getDigitStrings();
            return digitStrings;
        }

        /* renamed from: b */
        static PrecomputedText.Params m5614b(TextView textView) {
            PrecomputedText.Params textMetricsParams;
            textMetricsParams = textView.getTextMetricsParams();
            return textMetricsParams;
        }

        /* renamed from: c */
        static void m5615c(TextView textView, int i10) {
            textView.setFirstBaselineToTopHeight(i10);
        }
    }

    /* renamed from: androidx.core.widget.k$f */
    /* loaded from: classes.dex */
    private static class f implements ActionMode.Callback {

        /* renamed from: a */
        private final ActionMode.Callback f4783a;

        /* renamed from: b */
        private final TextView f4784b;

        /* renamed from: c */
        private Class<?> f4785c;

        /* renamed from: d */
        private Method f4786d;

        /* renamed from: e */
        private boolean f4787e;

        /* renamed from: f */
        private boolean f4788f = false;

        f(ActionMode.Callback callback, TextView textView) {
            this.f4783a = callback;
            this.f4784b = textView;
        }

        /* renamed from: a */
        private Intent m5616a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* renamed from: b */
        private Intent m5617b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = m5616a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m5619e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* renamed from: c */
        private List<ResolveInfo> m5618c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m5616a(), 0)) {
                if (m5620f(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        /* renamed from: e */
        private boolean m5619e(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        /* renamed from: f */
        private boolean m5620f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        /* renamed from: g */
        private void m5621g(Menu menu) {
            Context context = this.f4784b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f4788f) {
                this.f4788f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f4785c = cls;
                    this.f4786d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f4787e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f4785c = null;
                    this.f4786d = null;
                    this.f4787e = false;
                }
            }
            try {
                Method declaredMethod = (this.f4787e && this.f4785c.isInstance(menu)) ? this.f4786d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> m5618c = m5618c(context, packageManager);
                for (int i10 = 0; i10 < m5618c.size(); i10++) {
                    ResolveInfo resolveInfo = m5618c.get(i10);
                    menu.add(0, 0, i10 + 100, resolveInfo.loadLabel(packageManager)).setIntent(m5617b(resolveInfo, this.f4784b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        /* renamed from: d */
        ActionMode.Callback m5622d() {
            return this.f4783a;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f4783a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f4783a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f4783a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m5621g(menu);
            return this.f4783a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: a */
    public static int m5579a(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: b */
    public static int m5580b(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: c */
    private static int m5581c(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    /* renamed from: d */
    private static TextDirectionHeuristic m5582d(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(e.m5613a(d.m5612a(b.m5599d(textView)))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z10 = b.m5597b(textView) == 1;
        switch (b.m5598c(textView)) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                return z10 ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    /* renamed from: e */
    public static C0976n.a m5583e(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new C0976n.a(e.m5614b(textView));
        }
        C0976n.a.C13161a c13161a = new C0976n.a.C13161a(new TextPaint(textView.getPaint()));
        c13161a.m4808b(c.m5604a(textView));
        c13161a.m4809c(c.m5607d(textView));
        c13161a.m4810d(m5582d(textView));
        return c13161a.m4807a();
    }

    /* renamed from: f */
    public static void m5584f(TextView textView, ColorStateList colorStateList) {
        C0984h.m4833k(textView);
        c.m5609f(textView, colorStateList);
    }

    /* renamed from: g */
    public static void m5585g(TextView textView, PorterDuff.Mode mode) {
        C0984h.m4833k(textView);
        c.m5610g(textView, mode);
    }

    /* renamed from: h */
    public static void m5586h(TextView textView, int i10) {
        C0984h.m4830h(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            e.m5615c(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = a.m5593a(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: i */
    public static void m5587i(TextView textView, int i10) {
        C0984h.m4830h(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = a.m5593a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    /* renamed from: j */
    public static void m5588j(TextView textView, int i10) {
        C0984h.m4830h(i10);
        if (i10 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i10 - r0, 1.0f);
        }
    }

    /* renamed from: k */
    public static void m5589k(TextView textView, C0976n c0976n) {
        PrecomputedText precomputedText;
        if (Build.VERSION.SDK_INT >= 29) {
            precomputedText = c0976n.m4801b();
        } else {
            boolean m4802a = m5583e(textView).m4802a(c0976n.m4800a());
            precomputedText = c0976n;
            if (!m4802a) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
        }
        textView.setText(precomputedText);
    }

    /* renamed from: l */
    public static void m5590l(TextView textView, C0976n.a aVar) {
        b.m5603h(textView, m5581c(aVar.m4805d()));
        textView.getPaint().set(aVar.m4806e());
        c.m5608e(textView, aVar.m4803b());
        c.m5611h(textView, aVar.m4804c());
    }

    /* renamed from: m */
    public static ActionMode.Callback m5591m(ActionMode.Callback callback) {
        return (!(callback instanceof f) || Build.VERSION.SDK_INT < 26) ? callback : ((f) callback).m5622d();
    }

    /* renamed from: n */
    public static ActionMode.Callback m5592n(TextView textView, ActionMode.Callback callback) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || i10 > 27 || (callback instanceof f) || callback == null) ? callback : new f(callback, textView);
    }
}
