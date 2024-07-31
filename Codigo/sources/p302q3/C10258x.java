package p302q3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import p036c4.C1870k;
import p171j3.InterfaceC8971r;
import p171j3.InterfaceC8975v;

/* renamed from: q3.x */
/* loaded from: classes.dex */
public final class C10258x implements InterfaceC8975v<BitmapDrawable>, InterfaceC8971r {

    /* renamed from: a */
    private final Resources f25461a;

    /* renamed from: b */
    private final InterfaceC8975v<Bitmap> f25462b;

    private C10258x(Resources resources, InterfaceC8975v<Bitmap> interfaceC8975v) {
        this.f25461a = (Resources) C1870k.m9950d(resources);
        this.f25462b = (InterfaceC8975v) C1870k.m9950d(interfaceC8975v);
    }

    /* renamed from: b */
    public static InterfaceC8975v<BitmapDrawable> m30710b(Resources resources, InterfaceC8975v<Bitmap> interfaceC8975v) {
        if (interfaceC8975v == null) {
            return null;
        }
        return new C10258x(resources, interfaceC8975v);
    }

    @Override // p171j3.InterfaceC8975v
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f25461a, this.f25462b.get());
    }

    @Override // p171j3.InterfaceC8971r
    public void initialize() {
        InterfaceC8975v<Bitmap> interfaceC8975v = this.f25462b;
        if (interfaceC8975v instanceof InterfaceC8971r) {
            ((InterfaceC8971r) interfaceC8975v).initialize();
        }
    }

    @Override // p171j3.InterfaceC8975v
    /* renamed from: p */
    public int mo26309p() {
        return this.f25462b.mo26309p();
    }

    @Override // p171j3.InterfaceC8975v
    /* renamed from: q */
    public void mo26310q() {
        this.f25462b.mo26310q();
    }

    @Override // p171j3.InterfaceC8975v
    /* renamed from: r */
    public Class<BitmapDrawable> mo26311r() {
        return BitmapDrawable.class;
    }
}
