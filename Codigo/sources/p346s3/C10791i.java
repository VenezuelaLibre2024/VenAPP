package p346s3;

import android.graphics.drawable.Drawable;
import p171j3.InterfaceC8975v;

/* renamed from: s3.i */
/* loaded from: classes.dex */
final class C10791i extends AbstractC10790h<Drawable> {
    private C10791i(Drawable drawable) {
        super(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static InterfaceC8975v<Drawable> m32881b(Drawable drawable) {
        if (drawable != null) {
            return new C10791i(drawable);
        }
        return null;
    }

    @Override // p171j3.InterfaceC8975v
    /* renamed from: p */
    public int mo26309p() {
        return Math.max(1, this.f27244a.getIntrinsicWidth() * this.f27244a.getIntrinsicHeight() * 4);
    }

    @Override // p171j3.InterfaceC8975v
    /* renamed from: q */
    public void mo26310q() {
    }

    @Override // p171j3.InterfaceC8975v
    /* renamed from: r */
    public Class<Drawable> mo26311r() {
        return this.f27244a.getClass();
    }
}
