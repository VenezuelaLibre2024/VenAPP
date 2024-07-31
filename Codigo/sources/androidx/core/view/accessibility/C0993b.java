package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

/* renamed from: androidx.core.view.accessibility.b */
/* loaded from: classes.dex */
public final class C0993b {

    /* renamed from: androidx.core.view.accessibility.b$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static int m4867a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        /* renamed from: b */
        static void m4868b(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    /* renamed from: a */
    public static int m4865a(AccessibilityEvent accessibilityEvent) {
        return a.m4867a(accessibilityEvent);
    }

    /* renamed from: b */
    public static void m4866b(AccessibilityEvent accessibilityEvent, int i10) {
        a.m4868b(accessibilityEvent, i10);
    }
}
