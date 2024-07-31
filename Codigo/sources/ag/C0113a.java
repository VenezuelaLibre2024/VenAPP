package ag;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.net.Uri;
import android.os.SystemClock;
import bg.C1779c;
import bg.C1780d;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.google.android.gms.internal.mlkit_vision_common.zzmu;
import com.google.mlkit.common.sdkinternal.InterfaceC6522h;
import java.nio.ByteBuffer;

/* renamed from: ag.a */
/* loaded from: classes2.dex */
public class C0113a implements InterfaceC6522h {

    /* renamed from: a */
    private volatile Bitmap f491a;

    /* renamed from: b */
    private volatile ByteBuffer f492b;

    /* renamed from: c */
    private volatile C0114b f493c;

    /* renamed from: d */
    private final int f494d;

    /* renamed from: e */
    private final int f495e;

    /* renamed from: f */
    private final int f496f;

    /* renamed from: g */
    private final int f497g;

    /* renamed from: h */
    private final Matrix f498h;

    private C0113a(Bitmap bitmap, int i10) {
        this.f491a = (Bitmap) C5276s.m13324j(bitmap);
        this.f494d = bitmap.getWidth();
        this.f495e = bitmap.getHeight();
        m532l(i10);
        this.f496f = i10;
        this.f497g = -1;
        this.f498h = null;
    }

    private C0113a(Image image, int i10, int i11, int i12, Matrix matrix) {
        C5276s.m13324j(image);
        this.f493c = new C0114b(image);
        this.f494d = i10;
        this.f495e = i11;
        m532l(i12);
        this.f496f = i12;
        this.f497g = 35;
        this.f498h = matrix;
    }

    /* renamed from: a */
    public static C0113a m530a(Context context, Uri uri) {
        C5276s.m13325k(context, "Please provide a valid Context");
        C5276s.m13325k(uri, "Please provide a valid imageUri");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap m9505e = C1780d.m9501b().m9505e(context.getContentResolver(), uri);
        C0113a c0113a = new C0113a(m9505e, 0);
        m534n(-1, 4, elapsedRealtime, m9505e.getHeight(), m9505e.getWidth(), m9505e.getAllocationByteCount(), 0);
        return c0113a;
    }

    /* renamed from: b */
    public static C0113a m531b(Image image, int i10) {
        return m533m(image, i10, null);
    }

    /* renamed from: l */
    private static int m532l(int i10) {
        boolean z10 = true;
        if (i10 != 0 && i10 != 90 && i10 != 180) {
            if (i10 == 270) {
                i10 = 270;
            } else {
                z10 = false;
            }
        }
        C5276s.m13316b(z10, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        return i10;
    }

    /* renamed from: m */
    private static C0113a m533m(Image image, int i10, Matrix matrix) {
        C0113a c0113a;
        int limit;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C5276s.m13325k(image, "Please provide a valid image");
        m532l(i10);
        boolean z10 = true;
        if (image.getFormat() != 256 && image.getFormat() != 35) {
            z10 = false;
        }
        C5276s.m13316b(z10, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            limit = image.getPlanes()[0].getBuffer().limit();
            c0113a = new C0113a(C1779c.m9494d().m9498b(image, i10), 0);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            c0113a = new C0113a(image, image.getWidth(), image.getHeight(), i10, matrix);
            limit = (image.getPlanes()[0].getBuffer().limit() * 3) / 2;
        }
        int i11 = limit;
        C0113a c0113a2 = c0113a;
        m534n(image.getFormat(), 5, elapsedRealtime, image.getHeight(), image.getWidth(), i11, i10);
        return c0113a2;
    }

    /* renamed from: n */
    private static void m534n(int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        zzmu.zza(zzms.zzb("vision-common"), i10, i11, j10, i12, i13, i14, i15);
    }

    /* renamed from: c */
    public Bitmap m535c() {
        return this.f491a;
    }

    /* renamed from: d */
    public ByteBuffer m536d() {
        return this.f492b;
    }

    /* renamed from: e */
    public Matrix m537e() {
        return this.f498h;
    }

    /* renamed from: f */
    public int m538f() {
        return this.f497g;
    }

    /* renamed from: g */
    public int m539g() {
        return this.f495e;
    }

    /* renamed from: h */
    public Image m540h() {
        if (this.f493c == null) {
            return null;
        }
        return this.f493c.m544a();
    }

    /* renamed from: i */
    public Image.Plane[] m541i() {
        if (this.f493c == null) {
            return null;
        }
        return this.f493c.m545b();
    }

    /* renamed from: j */
    public int m542j() {
        return this.f496f;
    }

    /* renamed from: k */
    public int m543k() {
        return this.f494d;
    }
}
