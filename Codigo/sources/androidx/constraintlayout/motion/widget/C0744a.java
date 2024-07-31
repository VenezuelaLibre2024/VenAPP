package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.view.View;

/* renamed from: androidx.constraintlayout.motion.widget.a */
/* loaded from: classes.dex */
public class C0744a {
    /* renamed from: a */
    public static String m3763a(Context context, int i10) {
        if (i10 == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i10);
        } catch (Exception unused) {
            return "?" + i10;
        }
    }

    /* renamed from: b */
    public static String m3764b(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
