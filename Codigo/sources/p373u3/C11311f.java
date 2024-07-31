package p373u3;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C2116b;
import java.security.MessageDigest;
import p036c4.C1870k;
import p129h3.InterfaceC7628l;
import p171j3.InterfaceC8975v;
import p302q3.C10238f;

/* renamed from: u3.f */
/* loaded from: classes.dex */
public class C11311f implements InterfaceC7628l<C11308c> {

    /* renamed from: b */
    private final InterfaceC7628l<Bitmap> f29345b;

    public C11311f(InterfaceC7628l<Bitmap> interfaceC7628l) {
        this.f29345b = (InterfaceC7628l) C1870k.m9950d(interfaceC7628l);
    }

    @Override // p129h3.InterfaceC7628l
    /* renamed from: a */
    public InterfaceC8975v<C11308c> mo23154a(Context context, InterfaceC8975v<C11308c> interfaceC8975v, int i10, int i11) {
        C11308c c11308c = interfaceC8975v.get();
        InterfaceC8975v<Bitmap> c10238f = new C10238f(c11308c.m35324e(), ComponentCallbacks2C2116b.m10641d(context).m10651g());
        InterfaceC8975v<Bitmap> mo23154a = this.f29345b.mo23154a(context, c10238f, i10, i11);
        if (!c10238f.equals(mo23154a)) {
            c10238f.mo26310q();
        }
        c11308c.m35329m(this.f29345b, mo23154a.get());
        return interfaceC8975v;
    }

    @Override // p129h3.InterfaceC7622f
    /* renamed from: b */
    public void mo9110b(MessageDigest messageDigest) {
        this.f29345b.mo9110b(messageDigest);
    }

    @Override // p129h3.InterfaceC7622f
    public boolean equals(Object obj) {
        if (obj instanceof C11311f) {
            return this.f29345b.equals(((C11311f) obj).f29345b);
        }
        return false;
    }

    @Override // p129h3.InterfaceC7622f
    public int hashCode() {
        return this.f29345b.hashCode();
    }
}
