package b2;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private ViewGroup f6073a;

    /* renamed from: b, reason: collision with root package name */
    private Runnable f6074b;

    public static k b(ViewGroup viewGroup) {
        return (k) viewGroup.getTag(i.f6070b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(ViewGroup viewGroup, k kVar) {
        viewGroup.setTag(i.f6070b, kVar);
    }

    public void a() {
        Runnable runnable;
        if (b(this.f6073a) != this || (runnable = this.f6074b) == null) {
            return;
        }
        runnable.run();
    }
}
