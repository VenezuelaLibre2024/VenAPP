package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityRecord;

/* renamed from: androidx.core.view.accessibility.r */
/* loaded from: classes.dex */
public class C1009r {

    /* renamed from: androidx.core.view.accessibility.r$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static int m4936a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        /* renamed from: b */
        static int m4937b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        /* renamed from: c */
        static void m4938c(AccessibilityRecord accessibilityRecord, int i10) {
            accessibilityRecord.setMaxScrollX(i10);
        }

        /* renamed from: d */
        static void m4939d(AccessibilityRecord accessibilityRecord, int i10) {
            accessibilityRecord.setMaxScrollY(i10);
        }
    }

    /* renamed from: a */
    public static void m4934a(AccessibilityRecord accessibilityRecord, int i10) {
        a.m4938c(accessibilityRecord, i10);
    }

    /* renamed from: b */
    public static void m4935b(AccessibilityRecord accessibilityRecord, int i10) {
        a.m4939d(accessibilityRecord, i10);
    }
}
