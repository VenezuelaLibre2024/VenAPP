package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;

/* renamed from: androidx.core.widget.j */
/* loaded from: classes.dex */
public final class C1140j {

    /* renamed from: androidx.core.widget.j$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static void m5574a(PopupWindow popupWindow, View view, int i10, int i11, int i12) {
            popupWindow.showAsDropDown(view, i10, i11, i12);
        }
    }

    /* renamed from: androidx.core.widget.j$b */
    /* loaded from: classes.dex */
    static class b {
        /* renamed from: a */
        static boolean m5575a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        /* renamed from: b */
        static int m5576b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        /* renamed from: c */
        static void m5577c(PopupWindow popupWindow, boolean z10) {
            popupWindow.setOverlapAnchor(z10);
        }

        /* renamed from: d */
        static void m5578d(PopupWindow popupWindow, int i10) {
            popupWindow.setWindowLayoutType(i10);
        }
    }

    /* renamed from: a */
    public static void m5571a(PopupWindow popupWindow, boolean z10) {
        b.m5577c(popupWindow, z10);
    }

    /* renamed from: b */
    public static void m5572b(PopupWindow popupWindow, int i10) {
        b.m5578d(popupWindow, i10);
    }

    /* renamed from: c */
    public static void m5573c(PopupWindow popupWindow, View view, int i10, int i11, int i12) {
        a.m5574a(popupWindow, view, i10, i11, i12);
    }
}
