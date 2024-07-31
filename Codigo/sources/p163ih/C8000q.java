package p163ih;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import java.io.ByteArrayOutputStream;
import p066dg.C6953n;
import p066dg.C6958s;

/* renamed from: ih.q */
/* loaded from: classes3.dex */
public class C8000q {

    /* renamed from: a */
    private C7996m f19469a;

    /* renamed from: b */
    private int f19470b;

    /* renamed from: c */
    private int f19471c;

    /* renamed from: d */
    private Rect f19472d;

    /* renamed from: e */
    private int f19473e = 1;

    /* renamed from: f */
    private boolean f19474f;

    public C8000q(byte[] bArr, int i10, int i11, int i12, int i13) {
        this.f19469a = new C7996m(bArr, i10, i11);
        this.f19471c = i13;
        this.f19470b = i12;
        if (i10 * i11 <= bArr.length) {
            return;
        }
        throw new IllegalArgumentException("Image data does not match the resolution. " + i10 + "x" + i11 + " > " + bArr.length);
    }

    /* renamed from: a */
    public C6953n m24572a() {
        C7996m m24557a = this.f19469a.m24561h(this.f19471c).m24557a(this.f19472d, this.f19473e);
        return new C6953n(m24557a.m24558b(), m24557a.m24560d(), m24557a.m24559c(), 0, 0, m24557a.m24560d(), m24557a.m24559c(), false);
    }

    /* renamed from: b */
    public Bitmap m24573b(Rect rect, int i10) {
        if (rect == null) {
            rect = new Rect(0, 0, this.f19469a.m24560d(), this.f19469a.m24559c());
        } else if (m24574c()) {
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        }
        YuvImage yuvImage = new YuvImage(this.f19469a.m24558b(), this.f19470b, this.f19469a.m24560d(), this.f19469a.m24559c(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i10;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        if (this.f19471c == 0) {
            return decodeByteArray;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(this.f19471c);
        return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
    }

    /* renamed from: c */
    public boolean m24574c() {
        return this.f19471c % 180 != 0;
    }

    /* renamed from: d */
    public void m24575d(Rect rect) {
        this.f19472d = rect;
    }

    /* renamed from: e */
    public void m24576e(boolean z10) {
        this.f19474f = z10;
    }

    /* renamed from: f */
    public C6958s m24577f(C6958s c6958s) {
        float m20119c = (c6958s.m20119c() * this.f19473e) + this.f19472d.left;
        float m20120d = (c6958s.m20120d() * this.f19473e) + this.f19472d.top;
        if (this.f19474f) {
            m20119c = this.f19469a.m24560d() - m20119c;
        }
        return new C6958s(m20119c, m20120d);
    }
}
