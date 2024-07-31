package b2;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* loaded from: classes.dex */
class u implements v {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroupOverlay f6138a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(ViewGroup viewGroup) {
        this.f6138a = viewGroup.getOverlay();
    }

    @Override // b2.z
    public void a(Drawable drawable) {
        this.f6138a.add(drawable);
    }

    @Override // b2.z
    public void b(Drawable drawable) {
        this.f6138a.remove(drawable);
    }

    @Override // b2.v
    public void c(View view) {
        this.f6138a.add(view);
    }

    @Override // b2.v
    public void d(View view) {
        this.f6138a.remove(view);
    }
}
