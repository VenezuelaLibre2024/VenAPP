package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* renamed from: androidx.core.widget.b */
/* loaded from: classes.dex */
public final class C1132b {

    /* renamed from: androidx.core.widget.b$a */
    /* loaded from: classes.dex */
    private static class a {
        /* renamed from: a */
        static Drawable m5538a(CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    /* renamed from: androidx.core.widget.b$b */
    /* loaded from: classes.dex */
    private static class b {
        /* renamed from: a */
        static void m5539a(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        /* renamed from: b */
        static void m5540b(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    /* renamed from: a */
    public static Drawable m5535a(CheckedTextView checkedTextView) {
        return a.m5538a(checkedTextView);
    }

    /* renamed from: b */
    public static void m5536b(CheckedTextView checkedTextView, ColorStateList colorStateList) {
        b.m5539a(checkedTextView, colorStateList);
    }

    /* renamed from: c */
    public static void m5537c(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        b.m5540b(checkedTextView, mode);
    }
}
