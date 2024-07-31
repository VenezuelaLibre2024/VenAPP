package p092f0;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.YuvImage;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.InterfaceC0710o;
import androidx.camera.core.impl.utils.C0681j;
import androidx.camera.core.impl.utils.C0682k;
import androidx.core.util.C0984h;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* renamed from: f0.b */
/* loaded from: classes.dex */
public final class C7262b {

    /* renamed from: f0.b$a */
    /* loaded from: classes.dex */
    public static final class a extends Exception {

        /* renamed from: a */
        private final EnumC13205a f16270a;

        /* renamed from: f0.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum EnumC13205a {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        a(String str, EnumC13205a enumC13205a) {
            super(str);
            this.f16270a = enumC13205a;
        }
    }

    /* renamed from: a */
    public static Bitmap m21730a(InterfaceC0710o.a[] aVarArr, int i10, int i11) {
        C0984h.m4824b(aVarArr.length == 1, "Expect a single plane");
        C0984h.m4824b(aVarArr[0].mo2888e() == 4, "Expect pixelStride=4");
        C0984h.m4824b(aVarArr[0].mo2887d() == i10 * 4, "Expect rowStride=width*4");
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        aVarArr[0].mo2886c().rewind();
        ImageProcessingUtil.m2873i(createBitmap, aVarArr[0].mo2886c(), aVarArr[0].mo2887d());
        return createBitmap;
    }

    /* renamed from: b */
    public static ByteBuffer m21731b(Bitmap bitmap) {
        C0984h.m4824b(bitmap.getConfig() == Bitmap.Config.ARGB_8888, "Only accept Bitmap with ARGB_8888 format for now.");
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
        ImageProcessingUtil.m2872h(bitmap, allocateDirect, bitmap.getRowBytes());
        allocateDirect.rewind();
        return allocateDirect;
    }

    /* renamed from: c */
    public static byte[] m21732c(InterfaceC0710o interfaceC0710o) {
        if (interfaceC0710o.getFormat() != 256) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + interfaceC0710o.getFormat());
        }
        ByteBuffer mo2886c = interfaceC0710o.mo2885u0()[0].mo2886c();
        byte[] bArr = new byte[mo2886c.capacity()];
        mo2886c.rewind();
        mo2886c.get(bArr);
        return bArr;
    }

    /* renamed from: d */
    public static byte[] m21733d(InterfaceC0710o interfaceC0710o, Rect rect, int i10, int i11) {
        if (interfaceC0710o.getFormat() != 35) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + interfaceC0710o.getFormat());
        }
        YuvImage yuvImage = new YuvImage(m21734e(interfaceC0710o), 17, interfaceC0710o.getWidth(), interfaceC0710o.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C0682k c0682k = new C0682k(byteArrayOutputStream, C0681j.m3307b(interfaceC0710o, i11));
        if (rect == null) {
            rect = new Rect(0, 0, interfaceC0710o.getWidth(), interfaceC0710o.getHeight());
        }
        if (yuvImage.compressToJpeg(rect, i10, c0682k)) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new a("YuvImage failed to encode jpeg.", a.EnumC13205a.ENCODE_FAILED);
    }

    /* renamed from: e */
    public static byte[] m21734e(InterfaceC0710o interfaceC0710o) {
        InterfaceC0710o.a aVar = interfaceC0710o.mo2885u0()[0];
        InterfaceC0710o.a aVar2 = interfaceC0710o.mo2885u0()[1];
        InterfaceC0710o.a aVar3 = interfaceC0710o.mo2885u0()[2];
        ByteBuffer mo2886c = aVar.mo2886c();
        ByteBuffer mo2886c2 = aVar2.mo2886c();
        ByteBuffer mo2886c3 = aVar3.mo2886c();
        mo2886c.rewind();
        mo2886c2.rewind();
        mo2886c3.rewind();
        int remaining = mo2886c.remaining();
        byte[] bArr = new byte[((interfaceC0710o.getWidth() * interfaceC0710o.getHeight()) / 2) + remaining];
        int i10 = 0;
        for (int i11 = 0; i11 < interfaceC0710o.getHeight(); i11++) {
            mo2886c.get(bArr, i10, interfaceC0710o.getWidth());
            i10 += interfaceC0710o.getWidth();
            mo2886c.position(Math.min(remaining, (mo2886c.position() - interfaceC0710o.getWidth()) + aVar.mo2887d()));
        }
        int height = interfaceC0710o.getHeight() / 2;
        int width = interfaceC0710o.getWidth() / 2;
        int mo2887d = aVar3.mo2887d();
        int mo2887d2 = aVar2.mo2887d();
        int mo2888e = aVar3.mo2888e();
        int mo2888e2 = aVar2.mo2888e();
        byte[] bArr2 = new byte[mo2887d];
        byte[] bArr3 = new byte[mo2887d2];
        for (int i12 = 0; i12 < height; i12++) {
            mo2886c3.get(bArr2, 0, Math.min(mo2887d, mo2886c3.remaining()));
            mo2886c2.get(bArr3, 0, Math.min(mo2887d2, mo2886c2.remaining()));
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < width; i15++) {
                int i16 = i10 + 1;
                bArr[i10] = bArr2[i13];
                i10 = i16 + 1;
                bArr[i16] = bArr3[i14];
                i13 += mo2888e;
                i14 += mo2888e2;
            }
        }
        return bArr;
    }
}
