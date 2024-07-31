package p302q3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C2116b;
import java.security.MessageDigest;
import p129h3.InterfaceC7628l;
import p171j3.InterfaceC8975v;
import p193k3.InterfaceC9141d;

/* renamed from: q3.s */
/* loaded from: classes.dex */
public class C10253s implements InterfaceC7628l<Drawable> {

    /* renamed from: b */
    private final InterfaceC7628l<Bitmap> f25438b;

    /* renamed from: c */
    private final boolean f25439c;

    public C10253s(InterfaceC7628l<Bitmap> interfaceC7628l, boolean z10) {
        this.f25438b = interfaceC7628l;
        this.f25439c = z10;
    }

    /* renamed from: d */
    private InterfaceC8975v<Drawable> m30692d(Context context, InterfaceC8975v<Bitmap> interfaceC8975v) {
        return C10258x.m30710b(context.getResources(), interfaceC8975v);
    }

    @Override // p129h3.InterfaceC7628l
    /* renamed from: a */
    public InterfaceC8975v<Drawable> mo23154a(Context context, InterfaceC8975v<Drawable> interfaceC8975v, int i10, int i11) {
        InterfaceC9141d m10651g = ComponentCallbacks2C2116b.m10641d(context).m10651g();
        Drawable drawable = interfaceC8975v.get();
        InterfaceC8975v<Bitmap> m30690a = C10252r.m30690a(m10651g, drawable, i10, i11);
        if (m30690a != null) {
            InterfaceC8975v<Bitmap> mo23154a = this.f25438b.mo23154a(context, m30690a, i10, i11);
            if (!mo23154a.equals(m30690a)) {
                return m30692d(context, mo23154a);
            }
            mo23154a.mo26310q();
            return interfaceC8975v;
        }
        if (!this.f25439c) {
            return interfaceC8975v;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // p129h3.InterfaceC7622f
    /* renamed from: b */
    public void mo9110b(MessageDigest messageDigest) {
        this.f25438b.mo9110b(messageDigest);
    }

    /* renamed from: c */
    public InterfaceC7628l<BitmapDrawable> m30693c() {
        return this;
    }

    @Override // p129h3.InterfaceC7622f
    public boolean equals(Object obj) {
        if (obj instanceof C10253s) {
            return this.f25438b.equals(((C10253s) obj).f25438b);
        }
        return false;
    }

    @Override // p129h3.InterfaceC7622f
    public int hashCode() {
        return this.f25438b.hashCode();
    }
}
