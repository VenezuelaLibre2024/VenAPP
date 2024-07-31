package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.core.graphics.drawable.a */
/* loaded from: classes.dex */
public final class C0888a {

    /* renamed from: androidx.core.graphics.drawable.a$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static int m4546a(Drawable drawable) {
            return drawable.getAlpha();
        }

        /* renamed from: b */
        static Drawable m4547b(DrawableContainer.DrawableContainerState drawableContainerState, int i10) {
            return drawableContainerState.getChild(i10);
        }

        /* renamed from: c */
        static Drawable m4548c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        /* renamed from: d */
        static boolean m4549d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        /* renamed from: e */
        static void m4550e(Drawable drawable, boolean z10) {
            drawable.setAutoMirrored(z10);
        }
    }

    /* renamed from: androidx.core.graphics.drawable.a$b */
    /* loaded from: classes.dex */
    static class b {
        /* renamed from: a */
        static void m4551a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        /* renamed from: b */
        static boolean m4552b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        /* renamed from: c */
        static ColorFilter m4553c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        /* renamed from: d */
        static void m4554d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        /* renamed from: e */
        static void m4555e(Drawable drawable, float f10, float f11) {
            drawable.setHotspot(f10, f11);
        }

        /* renamed from: f */
        static void m4556f(Drawable drawable, int i10, int i11, int i12, int i13) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }

        /* renamed from: g */
        static void m4557g(Drawable drawable, int i10) {
            drawable.setTint(i10);
        }

        /* renamed from: h */
        static void m4558h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        /* renamed from: i */
        static void m4559i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* renamed from: androidx.core.graphics.drawable.a$c */
    /* loaded from: classes.dex */
    static class c {
        /* renamed from: a */
        static int m4560a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        /* renamed from: b */
        static boolean m4561b(Drawable drawable, int i10) {
            return drawable.setLayoutDirection(i10);
        }
    }

    /* renamed from: a */
    public static boolean m4537a(Drawable drawable) {
        return a.m4549d(drawable);
    }

    /* renamed from: b */
    public static void m4538b(Drawable drawable, boolean z10) {
        a.m4550e(drawable, z10);
    }

    /* renamed from: c */
    public static void m4539c(Drawable drawable, float f10, float f11) {
        b.m4555e(drawable, f10, f11);
    }

    /* renamed from: d */
    public static void m4540d(Drawable drawable, int i10, int i11, int i12, int i13) {
        b.m4556f(drawable, i10, i11, i12, i13);
    }

    /* renamed from: e */
    public static boolean m4541e(Drawable drawable, int i10) {
        return c.m4561b(drawable, i10);
    }

    /* renamed from: f */
    public static void m4542f(Drawable drawable, int i10) {
        b.m4557g(drawable, i10);
    }

    /* renamed from: g */
    public static void m4543g(Drawable drawable, ColorStateList colorStateList) {
        b.m4558h(drawable, colorStateList);
    }

    /* renamed from: h */
    public static void m4544h(Drawable drawable, PorterDuff.Mode mode) {
        b.m4559i(drawable, mode);
    }

    /* renamed from: i */
    public static Drawable m4545i(Drawable drawable) {
        return drawable;
    }
}
