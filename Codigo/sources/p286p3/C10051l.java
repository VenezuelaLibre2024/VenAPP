package p286p3;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import p129h3.C7623g;
import p129h3.C7624h;
import p129h3.EnumC7618b;
import p129h3.EnumC7625i;
import p302q3.AbstractC10245k;
import p302q3.C10251q;
import p302q3.C10255u;

/* renamed from: p3.l */
/* loaded from: classes.dex */
public final class C10051l implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a */
    private final C10255u f24680a = C10255u.m30695b();

    /* renamed from: b */
    private final int f24681b;

    /* renamed from: c */
    private final int f24682c;

    /* renamed from: d */
    private final EnumC7618b f24683d;

    /* renamed from: e */
    private final AbstractC10245k f24684e;

    /* renamed from: f */
    private final boolean f24685f;

    /* renamed from: g */
    private final EnumC7625i f24686g;

    /* renamed from: p3.l$a */
    /* loaded from: classes.dex */
    class a implements ImageDecoder.OnPartialImageListener {
        a() {
        }

        @Override // android.graphics.ImageDecoder.OnPartialImageListener
        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public C10051l(int i10, int i11, C7624h c7624h) {
        this.f24681b = i10;
        this.f24682c = i11;
        this.f24683d = (EnumC7618b) c7624h.m23147c(C10251q.f25423f);
        this.f24684e = (AbstractC10245k) c7624h.m23147c(AbstractC10245k.f25421h);
        C7623g<Boolean> c7623g = C10251q.f25427j;
        this.f24685f = c7624h.m23147c(c7623g) != null && ((Boolean) c7624h.m23147c(c7623g)).booleanValue();
        this.f24686g = (EnumC7625i) c7624h.m23147c(C10251q.f25424g);
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
        if (this.f24680a.m30701e(this.f24681b, this.f24682c, this.f24685f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f24683d == EnumC7618b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        size = imageInfo.getSize();
        int i10 = this.f24681b;
        if (i10 == Integer.MIN_VALUE) {
            i10 = size.getWidth();
        }
        int i11 = this.f24682c;
        if (i11 == Integer.MIN_VALUE) {
            i11 = size.getHeight();
        }
        float mo30658b = this.f24684e.mo30658b(size.getWidth(), size.getHeight(), i10, i11);
        int round = Math.round(size.getWidth() * mo30658b);
        int round2 = Math.round(size.getHeight() * mo30658b);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + mo30658b);
        }
        imageDecoder.setTargetSize(round, round2);
        EnumC7625i enumC7625i = this.f24686g;
        if (enumC7625i != null) {
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
            if (enumC7625i == EnumC7625i.DISPLAY_P3) {
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
