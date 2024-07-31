package b2;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* loaded from: classes.dex */
class y implements z {

    /* renamed from: a, reason: collision with root package name */
    private final ViewOverlay f6140a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(View view) {
        this.f6140a = view.getOverlay();
    }

    @Override // b2.z
    public void a(Drawable drawable) {
        this.f6140a.add(drawable);
    }

    @Override // b2.z
    public void b(Drawable drawable) {
        this.f6140a.remove(drawable);
    }
}
