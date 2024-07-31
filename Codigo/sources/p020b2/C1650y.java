package p020b2;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: b2.y */
/* loaded from: classes.dex */
class C1650y implements InterfaceC1651z {

    /* renamed from: a */
    private final ViewOverlay f7035a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1650y(View view) {
        this.f7035a = view.getOverlay();
    }

    @Override // p020b2.InterfaceC1651z
    /* renamed from: a */
    public void mo9099a(Drawable drawable) {
        this.f7035a.add(drawable);
    }

    @Override // p020b2.InterfaceC1651z
    /* renamed from: b */
    public void mo9100b(Drawable drawable) {
        this.f7035a.remove(drawable);
    }
}
