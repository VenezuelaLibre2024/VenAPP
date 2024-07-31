package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* renamed from: androidx.core.widget.g */
/* loaded from: classes.dex */
public class C1137g {

    /* renamed from: androidx.core.widget.g$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static ColorStateList m5563a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        /* renamed from: b */
        static PorterDuff.Mode m5564b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        /* renamed from: c */
        static void m5565c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        /* renamed from: d */
        static void m5566d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    /* renamed from: a */
    public static ColorStateList m5559a(ImageView imageView) {
        return a.m5563a(imageView);
    }

    /* renamed from: b */
    public static PorterDuff.Mode m5560b(ImageView imageView) {
        return a.m5564b(imageView);
    }

    /* renamed from: c */
    public static void m5561c(ImageView imageView, ColorStateList colorStateList) {
        a.m5565c(imageView, colorStateList);
    }

    /* renamed from: d */
    public static void m5562d(ImageView imageView, PorterDuff.Mode mode) {
        a.m5566d(imageView, mode);
    }
}
