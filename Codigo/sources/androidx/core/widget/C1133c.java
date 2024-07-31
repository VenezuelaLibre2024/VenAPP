package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* renamed from: androidx.core.widget.c */
/* loaded from: classes.dex */
public final class C1133c {

    /* renamed from: androidx.core.widget.c$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static ColorStateList m5544a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        /* renamed from: b */
        static PorterDuff.Mode m5545b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        /* renamed from: c */
        static void m5546c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        /* renamed from: d */
        static void m5547d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* renamed from: androidx.core.widget.c$b */
    /* loaded from: classes.dex */
    static class b {
        /* renamed from: a */
        static Drawable m5548a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    /* renamed from: a */
    public static Drawable m5541a(CompoundButton compoundButton) {
        return b.m5548a(compoundButton);
    }

    /* renamed from: b */
    public static void m5542b(CompoundButton compoundButton, ColorStateList colorStateList) {
        a.m5546c(compoundButton, colorStateList);
    }

    /* renamed from: c */
    public static void m5543c(CompoundButton compoundButton, PorterDuff.Mode mode) {
        a.m5547d(compoundButton, mode);
    }
}
