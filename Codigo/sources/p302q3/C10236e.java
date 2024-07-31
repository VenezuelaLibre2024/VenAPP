package p302q3;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import p129h3.C7624h;
import p129h3.InterfaceC7626j;
import p171j3.InterfaceC8975v;
import p193k3.C9142e;
import p193k3.InterfaceC9141d;
import p286p3.C10051l;

/* renamed from: q3.e */
/* loaded from: classes.dex */
public final class C10236e implements InterfaceC7626j<ImageDecoder.Source, Bitmap> {

    /* renamed from: a */
    private final InterfaceC9141d f25393a = new C9142e();

    @Override // p129h3.InterfaceC7626j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8975v<Bitmap> mo23152b(ImageDecoder.Source source, int i10, int i11, C7624h c7624h) {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new C10051l(i10, i11, c7624h));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i10 + "x" + i11 + "]");
        }
        return new C10238f(decodeBitmap, this.f25393a);
    }

    @Override // p129h3.InterfaceC7626j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo23151a(ImageDecoder.Source source, C7624h c7624h) {
        return true;
    }
}
