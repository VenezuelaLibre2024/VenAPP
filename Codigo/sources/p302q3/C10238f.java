package p302q3;

import android.graphics.Bitmap;
import p036c4.C1870k;
import p036c4.C1871l;
import p171j3.InterfaceC8971r;
import p171j3.InterfaceC8975v;
import p193k3.InterfaceC9141d;

/* renamed from: q3.f */
/* loaded from: classes.dex */
public class C10238f implements InterfaceC8975v<Bitmap>, InterfaceC8971r {

    /* renamed from: a */
    private final Bitmap f25394a;

    /* renamed from: b */
    private final InterfaceC9141d f25395b;

    public C10238f(Bitmap bitmap, InterfaceC9141d interfaceC9141d) {
        this.f25394a = (Bitmap) C1870k.m9951e(bitmap, "Bitmap must not be null");
        this.f25395b = (InterfaceC9141d) C1870k.m9951e(interfaceC9141d, "BitmapPool must not be null");
    }

    /* renamed from: b */
    public static C10238f m30609b(Bitmap bitmap, InterfaceC9141d interfaceC9141d) {
        if (bitmap == null) {
            return null;
        }
        return new C10238f(bitmap, interfaceC9141d);
    }

    @Override // p171j3.InterfaceC8975v
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f25394a;
    }

    @Override // p171j3.InterfaceC8971r
    public void initialize() {
        this.f25394a.prepareToDraw();
    }

    @Override // p171j3.InterfaceC8975v
    /* renamed from: p */
    public int mo26309p() {
        return C1871l.m9959h(this.f25394a);
    }

    @Override // p171j3.InterfaceC8975v
    /* renamed from: q */
    public void mo26310q() {
        this.f25395b.mo26950c(this.f25394a);
    }

    @Override // p171j3.InterfaceC8975v
    /* renamed from: r */
    public Class<Bitmap> mo26311r() {
        return Bitmap.class;
    }
}
