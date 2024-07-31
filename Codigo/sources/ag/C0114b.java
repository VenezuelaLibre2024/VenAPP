package ag;

import android.media.Image;

/* renamed from: ag.b */
/* loaded from: classes2.dex */
final class C0114b {

    /* renamed from: a */
    private final Image f499a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0114b(Image image) {
        this.f499a = image;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Image m544a() {
        return this.f499a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final Image.Plane[] m545b() {
        return this.f499a.getPlanes();
    }
}
