package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p321r0.InterfaceMenuItemC10576b;

/* renamed from: androidx.core.view.l0 */
/* loaded from: classes.dex */
public final class C1062l0 {

    /* renamed from: androidx.core.view.l0$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static int m5026a(MenuItem menuItem) {
            int alphabeticModifiers;
            alphabeticModifiers = menuItem.getAlphabeticModifiers();
            return alphabeticModifiers;
        }

        /* renamed from: b */
        static CharSequence m5027b(MenuItem menuItem) {
            CharSequence contentDescription;
            contentDescription = menuItem.getContentDescription();
            return contentDescription;
        }

        /* renamed from: c */
        static ColorStateList m5028c(MenuItem menuItem) {
            ColorStateList iconTintList;
            iconTintList = menuItem.getIconTintList();
            return iconTintList;
        }

        /* renamed from: d */
        static PorterDuff.Mode m5029d(MenuItem menuItem) {
            PorterDuff.Mode iconTintMode;
            iconTintMode = menuItem.getIconTintMode();
            return iconTintMode;
        }

        /* renamed from: e */
        static int m5030e(MenuItem menuItem) {
            int numericModifiers;
            numericModifiers = menuItem.getNumericModifiers();
            return numericModifiers;
        }

        /* renamed from: f */
        static CharSequence m5031f(MenuItem menuItem) {
            CharSequence tooltipText;
            tooltipText = menuItem.getTooltipText();
            return tooltipText;
        }

        /* renamed from: g */
        static MenuItem m5032g(MenuItem menuItem, char c10, int i10) {
            MenuItem alphabeticShortcut;
            alphabeticShortcut = menuItem.setAlphabeticShortcut(c10, i10);
            return alphabeticShortcut;
        }

        /* renamed from: h */
        static MenuItem m5033h(MenuItem menuItem, CharSequence charSequence) {
            MenuItem contentDescription;
            contentDescription = menuItem.setContentDescription(charSequence);
            return contentDescription;
        }

        /* renamed from: i */
        static MenuItem m5034i(MenuItem menuItem, ColorStateList colorStateList) {
            MenuItem iconTintList;
            iconTintList = menuItem.setIconTintList(colorStateList);
            return iconTintList;
        }

        /* renamed from: j */
        static MenuItem m5035j(MenuItem menuItem, PorterDuff.Mode mode) {
            MenuItem iconTintMode;
            iconTintMode = menuItem.setIconTintMode(mode);
            return iconTintMode;
        }

        /* renamed from: k */
        static MenuItem m5036k(MenuItem menuItem, char c10, int i10) {
            MenuItem numericShortcut;
            numericShortcut = menuItem.setNumericShortcut(c10, i10);
            return numericShortcut;
        }

        /* renamed from: l */
        static MenuItem m5037l(MenuItem menuItem, char c10, char c11, int i10, int i11) {
            MenuItem shortcut;
            shortcut = menuItem.setShortcut(c10, c11, i10, i11);
            return shortcut;
        }

        /* renamed from: m */
        static MenuItem m5038m(MenuItem menuItem, CharSequence charSequence) {
            MenuItem tooltipText;
            tooltipText = menuItem.setTooltipText(charSequence);
            return tooltipText;
        }
    }

    /* renamed from: a */
    public static MenuItem m5019a(MenuItem menuItem, AbstractC1011b abstractC1011b) {
        if (menuItem instanceof InterfaceMenuItemC10576b) {
            return ((InterfaceMenuItemC10576b) menuItem).mo1237b(abstractC1011b);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: b */
    public static void m5020b(MenuItem menuItem, char c10, int i10) {
        if (menuItem instanceof InterfaceMenuItemC10576b) {
            ((InterfaceMenuItemC10576b) menuItem).setAlphabeticShortcut(c10, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m5032g(menuItem, c10, i10);
        }
    }

    /* renamed from: c */
    public static void m5021c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC10576b) {
            ((InterfaceMenuItemC10576b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m5033h(menuItem, charSequence);
        }
    }

    /* renamed from: d */
    public static void m5022d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC10576b) {
            ((InterfaceMenuItemC10576b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m5034i(menuItem, colorStateList);
        }
    }

    /* renamed from: e */
    public static void m5023e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC10576b) {
            ((InterfaceMenuItemC10576b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m5035j(menuItem, mode);
        }
    }

    /* renamed from: f */
    public static void m5024f(MenuItem menuItem, char c10, int i10) {
        if (menuItem instanceof InterfaceMenuItemC10576b) {
            ((InterfaceMenuItemC10576b) menuItem).setNumericShortcut(c10, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m5036k(menuItem, c10, i10);
        }
    }

    /* renamed from: g */
    public static void m5025g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC10576b) {
            ((InterfaceMenuItemC10576b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m5038m(menuItem, charSequence);
        }
    }
}
