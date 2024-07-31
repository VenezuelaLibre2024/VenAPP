package p3;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import q3.q;
import q3.u;

/* loaded from: classes.dex */
public final class l implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a */
    private final u f22747a = u.b();

    /* renamed from: b */
    private final int f22748b;

    /* renamed from: c */
    private final int f22749c;

    /* renamed from: d */
    private final h3.b f22750d;

    /* renamed from: e */
    private final q3.k f22751e;

    /* renamed from: f */
    private final boolean f22752f;

    /* renamed from: g */
    private final h3.i f22753g;

    /* loaded from: classes.dex */
    class a implements ImageDecoder.OnPartialImageListener {
        a() {
        }

        @Override // android.graphics.ImageDecoder.OnPartialImageListener
        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public l(int i10, int i11, h3.h hVar) {
        this.f22748b = i10;
        this.f22749c = i11;
        this.f22750d = (h3.b) hVar.c(q.f23455f);
        this.f22751e = (q3.k) hVar.c(q3.k.f23453h);
        h3.g<Boolean> gVar = q.f23459j;
        this.f22752f = hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue();
        this.f22753g = (h3.i) hVar.c(q.f23456g);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        boolean z10 = false;
        if (this.f22747a.e(this.f22748b, this.f22749c, this.f22752f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f22750d == h3.b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        size = imageInfo.getSize();
        int i10 = this.f22748b;
        if (i10 == Integer.MIN_VALUE) {
            i10 = size.getWidth();
        }
        int i11 = this.f22749c;
        if (i11 == Integer.MIN_VALUE) {
            i11 = size.getHeight();
        }
        float b10 = this.f22751e.b(size.getWidth(), size.getHeight(), i10, i11);
        int round = Math.round(size.getWidth() * b10);
        int round2 = Math.round(size.getHeight() * b10);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b10);
        }
        imageDecoder.setTargetSize(round, round2);
        h3.i iVar = this.f22753g;
        if (iVar != null) {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 < 28) {
                if (i12 >= 26) {
                    named = ColorSpace.Named.SRGB;
                    colorSpace = ColorSpace.get(named);
                    imageDecoder.setTargetColorSpace(colorSpace);
                    return;
                }
                return;
            }
            if (iVar == h3.i.DISPLAY_P3) {
                colorSpace3 = imageInfo.getColorSpace();
                if (colorSpace3 != null) {
                    colorSpace4 = imageInfo.getColorSpace();
                    isWideGamut = colorSpace4.isWideGamut();
                    if (isWideGamut) {
                        z10 = true;
                    }
                }
            }
            colorSpace2 = ColorSpace.get(z10 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            imageDecoder.setTargetColorSpace(colorSpace2);
        }
    }
}
