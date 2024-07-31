package p020b2;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: b2.x */
/* loaded from: classes.dex */
class C1649x {

    /* renamed from: a */
    private static boolean f7034a = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC1647v m9104a(ViewGroup viewGroup) {
        return new C1646u(viewGroup);
    }

    /* renamed from: b */
    private static void m9105b(ViewGroup viewGroup, boolean z10) {
        if (f7034a) {
            try {
                viewGroup.suppressLayout(z10);
            } catch (NoSuchMethodError unused) {
                f7034a = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m9106c(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z10);
        } else {
            m9105b(viewGroup, z10);
        }
    }
}
