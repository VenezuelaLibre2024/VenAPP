package p393v3;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import p129h3.C7624h;
import p171j3.InterfaceC8975v;
import p324r3.C10612b;

/* renamed from: v3.a */
/* loaded from: classes.dex */
public class C11619a implements InterfaceC11623e<Bitmap, byte[]> {

    /* renamed from: a */
    private final Bitmap.CompressFormat f30220a;

    /* renamed from: b */
    private final int f30221b;

    public C11619a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public C11619a(Bitmap.CompressFormat compressFormat, int i10) {
        this.f30220a = compressFormat;
        this.f30221b = i10;
    }

    @Override // p393v3.InterfaceC11623e
    /* renamed from: a */
    public InterfaceC8975v<byte[]> mo36414a(InterfaceC8975v<Bitmap> interfaceC8975v, C7624h c7624h) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        interfaceC8975v.get().compress(this.f30220a, this.f30221b, byteArrayOutputStream);
        interfaceC8975v.mo26310q();
        return new C10612b(byteArrayOutputStream.toByteArray());
    }
}
