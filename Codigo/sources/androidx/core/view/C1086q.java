package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import androidx.core.util.C0979c;
import java.util.List;

/* renamed from: androidx.core.view.q */
/* loaded from: classes.dex */
public final class C1086q {

    /* renamed from: a */
    private final DisplayCutout f4647a;

    /* renamed from: androidx.core.view.q$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static DisplayCutout m5119a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        /* renamed from: b */
        static List<Rect> m5120b(DisplayCutout displayCutout) {
            List<Rect> boundingRects;
            boundingRects = displayCutout.getBoundingRects();
            return boundingRects;
        }

        /* renamed from: c */
        static int m5121c(DisplayCutout displayCutout) {
            int safeInsetBottom;
            safeInsetBottom = displayCutout.getSafeInsetBottom();
            return safeInsetBottom;
        }

        /* renamed from: d */
        static int m5122d(DisplayCutout displayCutout) {
            int safeInsetLeft;
            safeInsetLeft = displayCutout.getSafeInsetLeft();
            return safeInsetLeft;
        }

        /* renamed from: e */
        static int m5123e(DisplayCutout displayCutout) {
            int safeInsetRight;
            safeInsetRight = displayCutout.getSafeInsetRight();
            return safeInsetRight;
        }

        /* renamed from: f */
        static int m5124f(DisplayCutout displayCutout) {
            int safeInsetTop;
            safeInsetTop = displayCutout.getSafeInsetTop();
            return safeInsetTop;
        }
    }

    private C1086q(DisplayCutout displayCutout) {
        this.f4647a = displayCutout;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C1086q m5114e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C1086q(displayCutout);
    }

    /* renamed from: a */
    public int m5115a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m5121c(this.f4647a);
        }
        return 0;
    }

    /* renamed from: b */
    public int m5116b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m5122d(this.f4647a);
        }
        return 0;
    }

    /* renamed from: c */
    public int m5117c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m5123e(this.f4647a);
        }
        return 0;
    }

    /* renamed from: d */
    public int m5118d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m5124f(this.f4647a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1086q.class != obj.getClass()) {
            return false;
        }
        return C0979c.m4812a(this.f4647a, ((C1086q) obj).f4647a);
    }

    public int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.f4647a;
        if (displayCutout == null) {
            return 0;
        }
        hashCode = displayCutout.hashCode();
        return hashCode;
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f4647a + "}";
    }
}
