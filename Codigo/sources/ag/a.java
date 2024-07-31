package ag;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.net.Uri;
import android.os.SystemClock;
import bg.c;
import bg.d;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.google.android.gms.internal.mlkit_vision_common.zzmu;
import com.google.mlkit.common.sdkinternal.h;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class a implements h {

    /* renamed from: a, reason: collision with root package name */
    private volatile Bitmap f426a;

    /* renamed from: b, reason: collision with root package name */
    private volatile ByteBuffer f427b;

    /* renamed from: c, reason: collision with root package name */
    private volatile b f428c;

    /* renamed from: d, reason: collision with root package name */
    private final int f429d;

    /* renamed from: e, reason: collision with root package name */
    private final int f430e;

    /* renamed from: f, reason: collision with root package name */
    private final int f431f;

    /* renamed from: g, reason: collision with root package name */
    private final int f432g;

    /* renamed from: h, reason: collision with root package name */
    private final Matrix f433h;

    private a(Bitmap bitmap, int i10) {
        this.f426a = (Bitmap) s.j(bitmap);
        this.f429d = bitmap.getWidth();
        this.f430e = bitmap.getHeight();
        l(i10);
        this.f431f = i10;
        this.f432g = -1;
        this.f433h = null;
    }

    private a(Image image, int i10, int i11, int i12, Matrix matrix) {
        s.j(image);
        this.f428c = new b(image);
        this.f429d = i10;
        this.f430e = i11;
        l(i12);
        this.f431f = i12;
        this.f432g = 35;
        this.f433h = matrix;
    }

    public static a a(Context context, Uri uri) {
        s.k(context, "Please provide a valid Context");
        s.k(uri, "Please provide a valid imageUri");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap e10 = d.b().e(context.getContentResolver(), uri);
        a aVar = new a(e10, 0);
        n(-1, 4, elapsedRealtime, e10.getHeight(), e10.getWidth(), e10.getAllocationByteCount(), 0);
        return aVar;
    }

    public static a b(Image image, int i10) {
        return m(image, i10, null);
    }

    private static int l(int i10) {
        boolean z10 = true;
        if (i10 != 0 && i10 != 90 && i10 != 180) {
            if (i10 == 270) {
                i10 = 270;
            } else {
                z10 = false;
            }
        }
        s.b(z10, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        return i10;
    }

    private static a m(Image image, int i10, Matrix matrix) {
        a aVar;
        int limit;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        s.k(image, "Please provide a valid image");
        l(i10);
        boolean z10 = true;
        if (image.getFormat() != 256 && image.getFormat() != 35) {
            z10 = false;
        }
        s.b(z10, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            limit = image.getPlanes()[0].getBuffer().limit();
            aVar = new a(c.d().b(image, i10), 0);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            aVar = new a(image, image.getWidth(), image.getHeight(), i10, matrix);
            limit = (image.getPlanes()[0].getBuffer().limit() * 3) / 2;
        }
        int i11 = limit;
        a aVar2 = aVar;
        n(image.getFormat(), 5, elapsedRealtime, image.getHeight(), image.getWidth(), i11, i10);
        return aVar2;
    }

    private static void n(int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        zzmu.zza(zzms.zzb("vision-common"), i10, i11, j10, i12, i13, i14, i15);
    }

    public Bitmap c() {
        return this.f426a;
    }

    public ByteBuffer d() {
        return this.f427b;
    }

    public Matrix e() {
        return this.f433h;
    }

    public int f() {
        return this.f432g;
    }

    public int g() {
        return this.f430e;
    }

    public Image h() {
        if (this.f428c == null) {
            return null;
        }
        return this.f428c.a();
    }

    public Image.Plane[] i() {
        if (this.f428c == null) {
            return null;
        }
        return this.f428c.b();
    }

    public int j() {
        return this.f431f;
    }

    public int k() {
        return this.f429d;
    }
}
