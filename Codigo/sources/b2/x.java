package b2;

import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
class x {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f6139a = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v a(ViewGroup viewGroup) {
        return new u(viewGroup);
    }

    private static void b(ViewGroup viewGroup, boolean z10) {
        if (f6139a) {
            try {
                viewGroup.suppressLayout(z10);
            } catch (NoSuchMethodError unused) {
                f6139a = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z10);
        } else {
            b(viewGroup, z10);
        }
    }
}
