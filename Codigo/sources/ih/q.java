package ih;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import dg.s;
import java.io.ByteArrayOutputStream;

/* loaded from: classes3.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private m f17806a;

    /* renamed from: b, reason: collision with root package name */
    private int f17807b;

    /* renamed from: c, reason: collision with root package name */
    private int f17808c;

    /* renamed from: d, reason: collision with root package name */
    private Rect f17809d;

    /* renamed from: e, reason: collision with root package name */
    private int f17810e = 1;

    /* renamed from: f, reason: collision with root package name */
    private boolean f17811f;

    public q(byte[] bArr, int i10, int i11, int i12, int i13) {
        this.f17806a = new m(bArr, i10, i11);
        this.f17808c = i13;
        this.f17807b = i12;
        if (i10 * i11 <= bArr.length) {
            return;
        }
        throw new IllegalArgumentException("Image data does not match the resolution. " + i10 + "x" + i11 + " > " + bArr.length);
    }

    public dg.n a() {
        m a10 = this.f17806a.h(this.f17808c).a(this.f17809d, this.f17810e);
        return new dg.n(a10.b(), a10.d(), a10.c(), 0, 0, a10.d(), a10.c(), false);
    }

    public Bitmap b(Rect rect, int i10) {
        if (rect == null) {
            rect = new Rect(0, 0, this.f17806a.d(), this.f17806a.c());
        } else if (c()) {
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        }
        YuvImage yuvImage = new YuvImage(this.f17806a.b(), this.f17807b, this.f17806a.d(), this.f17806a.c(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i10;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        if (this.f17808c == 0) {
            return decodeByteArray;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(this.f17808c);
        return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
    }

    public boolean c() {
        return this.f17808c % 180 != 0;
    }

    public void d(Rect rect) {
        this.f17809d = rect;
    }

    public void e(boolean z10) {
        this.f17811f = z10;
    }

    public s f(s sVar) {
        float c10 = (sVar.c() * this.f17810e) + this.f17809d.left;
        float d10 = (sVar.d() * this.f17810e) + this.f17809d.top;
        if (this.f17811f) {
            c10 = this.f17806a.d() - c10;
        }
        return new s(c10, d10);
    }
}
