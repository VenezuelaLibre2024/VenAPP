package p020b2;

import android.view.ViewGroup;

/* renamed from: b2.k */
/* loaded from: classes.dex */
public class C1630k {

    /* renamed from: a */
    private ViewGroup f6942a;

    /* renamed from: b */
    private Runnable f6943b;

    /* renamed from: b */
    public static C1630k m9017b(ViewGroup viewGroup) {
        return (C1630k) viewGroup.getTag(C1626i.f6939b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m9018c(ViewGroup viewGroup, C1630k c1630k) {
        viewGroup.setTag(C1626i.f6939b, c1630k);
    }

    /* renamed from: a */
    public void m9019a() {
        Runnable runnable;
        if (m9017b(this.f6942a) != this || (runnable = this.f6943b) == null) {
            return;
        }
        runnable.run();
    }
}
