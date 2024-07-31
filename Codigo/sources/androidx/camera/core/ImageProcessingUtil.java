package androidx.camera.core;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.e;
import androidx.camera.core.impl.g1;
import java.nio.ByteBuffer;
import java.util.Locale;
import w.o0;

/* loaded from: classes.dex */
public final class ImageProcessingUtil {

    /* renamed from: a */
    private static int f2375a;

    /* loaded from: classes.dex */
    public enum a {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static boolean c(o oVar) {
        String str;
        if (!k(oVar)) {
            str = "Unsupported format for YUV to RGB";
        } else {
            if (d(oVar) != a.ERROR_CONVERSION) {
                return true;
            }
            str = "One pixel shift for YUV failure";
        }
        o0.c("ImageProcessingUtil", str);
        return false;
    }

    private static a d(o oVar) {
        int width = oVar.getWidth();
        int height = oVar.getHeight();
        int d10 = oVar.u0()[0].d();
        int d11 = oVar.u0()[1].d();
        int d12 = oVar.u0()[2].d();
        int e10 = oVar.u0()[0].e();
        int e11 = oVar.u0()[1].e();
        return nativeShiftPixel(oVar.u0()[0].c(), d10, oVar.u0()[1].c(), d11, oVar.u0()[2].c(), d12, e10, e11, width, height, e10, e11, e11) != 0 ? a.ERROR_CONVERSION : a.SUCCESS;
    }

    public static o e(g1 g1Var, byte[] bArr) {
        androidx.core.util.h.a(g1Var.c() == 256);
        androidx.core.util.h.k(bArr);
        Surface surface = g1Var.getSurface();
        androidx.core.util.h.k(surface);
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            o0.c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        o b10 = g1Var.b();
        if (b10 == null) {
            o0.c("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return b10;
    }

    public static o f(o oVar, g1 g1Var, ByteBuffer byteBuffer, int i10, boolean z10) {
        String str;
        if (k(oVar)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!j(i10)) {
                str = "Unsupported rotation degrees for rotate RGB";
            } else if (g(oVar, g1Var.getSurface(), byteBuffer, i10, z10) == a.ERROR_CONVERSION) {
                str = "YUV to RGB conversion failure";
            } else {
                if (Log.isLoggable("MH", 3)) {
                    o0.a("ImageProcessingUtil", String.format(Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(f2375a)));
                    f2375a++;
                }
                o b10 = g1Var.b();
                if (b10 != null) {
                    v vVar = new v(b10);
                    vVar.a(new e.a() { // from class: w.i0

                        /* renamed from: b */
                        public final /* synthetic */ androidx.camera.core.o f29483b;

                        public /* synthetic */ i0(androidx.camera.core.o oVar2) {
                            r2 = oVar2;
                        }

                        @Override // androidx.camera.core.e.a
                        public final void a(androidx.camera.core.o oVar2) {
                            ImageProcessingUtil.l(androidx.camera.core.o.this, r2, oVar2);
                        }
                    });
                    return vVar;
                }
                str = "YUV to RGB acquireLatestImage failure";
            }
        } else {
            str = "Unsupported format for YUV to RGB";
        }
        o0.c("ImageProcessingUtil", str);
        return null;
    }

    private static a g(o oVar, Surface surface, ByteBuffer byteBuffer, int i10, boolean z10) {
        int width = oVar.getWidth();
        int height = oVar.getHeight();
        int d10 = oVar.u0()[0].d();
        int d11 = oVar.u0()[1].d();
        int d12 = oVar.u0()[2].d();
        int e10 = oVar.u0()[0].e();
        int e11 = oVar.u0()[1].e();
        return nativeConvertAndroid420ToABGR(oVar.u0()[0].c(), d10, oVar.u0()[1].c(), d11, oVar.u0()[2].c(), d12, e10, e11, surface, byteBuffer, width, height, z10 ? e10 : 0, z10 ? e11 : 0, z10 ? e11 : 0, i10) != 0 ? a.ERROR_CONVERSION : a.SUCCESS;
    }

    public static void h(Bitmap bitmap, ByteBuffer byteBuffer, int i10) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i10, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void i(Bitmap bitmap, ByteBuffer byteBuffer, int i10) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i10, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    private static boolean j(int i10) {
        return i10 == 0 || i10 == 90 || i10 == 180 || i10 == 270;
    }

    private static boolean k(o oVar) {
        return oVar.getFormat() == 35 && oVar.u0().length == 3;
    }

    public static /* synthetic */ void l(o oVar, o oVar2, o oVar3) {
        if (oVar == null || oVar2 == null) {
            return;
        }
        oVar2.close();
    }

    public static /* synthetic */ void m(o oVar, o oVar2, o oVar3) {
        if (oVar == null || oVar2 == null) {
            return;
        }
        oVar2.close();
    }

    public static o n(o oVar, g1 g1Var, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        String str;
        if (!k(oVar)) {
            str = "Unsupported format for rotate YUV";
        } else if (j(i10)) {
            a aVar = a.ERROR_CONVERSION;
            if ((i10 > 0 ? o(oVar, imageWriter, byteBuffer, byteBuffer2, byteBuffer3, i10) : aVar) == aVar) {
                str = "rotate YUV failure";
            } else {
                o b10 = g1Var.b();
                if (b10 != null) {
                    v vVar = new v(b10);
                    vVar.a(new e.a() { // from class: w.j0

                        /* renamed from: b */
                        public final /* synthetic */ androidx.camera.core.o f29513b;

                        public /* synthetic */ j0(androidx.camera.core.o oVar2) {
                            r2 = oVar2;
                        }

                        @Override // androidx.camera.core.e.a
                        public final void a(androidx.camera.core.o oVar2) {
                            ImageProcessingUtil.m(androidx.camera.core.o.this, r2, oVar2);
                        }
                    });
                    return vVar;
                }
                str = "YUV rotation acquireLatestImage failure";
            }
        } else {
            str = "Unsupported rotation degrees for rotate YUV";
        }
        o0.c("ImageProcessingUtil", str);
        return null;
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, Surface surface, ByteBuffer byteBuffer4, int i15, int i16, int i17, int i18, int i19, int i20);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i10, int i11, int i12, int i13, boolean z10);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, ByteBuffer byteBuffer4, int i14, int i15, ByteBuffer byteBuffer5, int i16, int i17, ByteBuffer byteBuffer6, int i18, int i19, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i20, int i21, int i22);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);

    private static a o(o oVar, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        int width = oVar.getWidth();
        int height = oVar.getHeight();
        int d10 = oVar.u0()[0].d();
        int d11 = oVar.u0()[1].d();
        int d12 = oVar.u0()[2].d();
        int e10 = oVar.u0()[1].e();
        Image b10 = c0.a.b(imageWriter);
        if (b10 != null && nativeRotateYUV(oVar.u0()[0].c(), d10, oVar.u0()[1].c(), d11, oVar.u0()[2].c(), d12, e10, b10.getPlanes()[0].getBuffer(), b10.getPlanes()[0].getRowStride(), b10.getPlanes()[0].getPixelStride(), b10.getPlanes()[1].getBuffer(), b10.getPlanes()[1].getRowStride(), b10.getPlanes()[1].getPixelStride(), b10.getPlanes()[2].getBuffer(), b10.getPlanes()[2].getRowStride(), b10.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i10) == 0) {
            c0.a.d(imageWriter, b10);
            return a.SUCCESS;
        }
        return a.ERROR_CONVERSION;
    }

    public static boolean p(Surface surface, byte[] bArr) {
        androidx.core.util.h.k(bArr);
        androidx.core.util.h.k(surface);
        if (nativeWriteJpegToSurface(bArr, surface) == 0) {
            return true;
        }
        o0.c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        return false;
    }
}
