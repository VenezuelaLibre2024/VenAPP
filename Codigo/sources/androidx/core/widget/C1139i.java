package androidx.core.widget;

import android.widget.ListView;

/* renamed from: androidx.core.widget.i */
/* loaded from: classes.dex */
public final class C1139i {

    /* renamed from: androidx.core.widget.i$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static boolean m5569a(ListView listView, int i10) {
            return listView.canScrollList(i10);
        }

        /* renamed from: b */
        static void m5570b(ListView listView, int i10) {
            listView.scrollListBy(i10);
        }
    }

    /* renamed from: a */
    public static boolean m5567a(ListView listView, int i10) {
        return a.m5569a(listView, i10);
    }

    /* renamed from: b */
    public static void m5568b(ListView listView, int i10) {
        a.m5570b(listView, i10);
    }
}
