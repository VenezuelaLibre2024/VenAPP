package p020b2;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: b2.u */
/* loaded from: classes.dex */
class C1646u implements InterfaceC1647v {

    /* renamed from: a */
    private final ViewGroupOverlay f7033a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1646u(ViewGroup viewGroup) {
        this.f7033a = viewGroup.getOverlay();
    }

    @Override // p020b2.InterfaceC1651z
    /* renamed from: a */
    public void mo9099a(Drawable drawable) {
        this.f7033a.add(drawable);
    }

    @Override // p020b2.InterfaceC1651z
    /* renamed from: b */
    public void mo9100b(Drawable drawable) {
        this.f7033a.remove(drawable);
    }

    @Override // p020b2.InterfaceC1647v
    /* renamed from: c */
    public void mo9101c(View view) {
        this.f7033a.add(view);
    }

    @Override // p020b2.InterfaceC1647v
    /* renamed from: d */
    public void mo9102d(View view) {
        this.f7033a.remove(view);
    }
}
