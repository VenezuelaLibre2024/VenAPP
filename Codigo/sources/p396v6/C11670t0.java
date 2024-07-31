package p396v6;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: v6.t0 */
/* loaded from: classes.dex */
public class C11670t0 {
    /* renamed from: a */
    public static List<byte[]> m36683a(byte[] bArr) {
        long m36690h = m36690h(m36688f(bArr));
        long m36690h2 = m36690h(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(m36684b(m36690h));
        arrayList.add(m36684b(m36690h2));
        return arrayList;
    }

    /* renamed from: b */
    private static byte[] m36684b(long j10) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array();
    }

    /* renamed from: c */
    public static int m36685c(byte[] bArr) {
        return bArr[9] & 255;
    }

    /* renamed from: d */
    private static long m36686d(byte b10, byte b11) {
        int i10;
        int i11 = b10 & 255;
        int i12 = i11 & 3;
        if (i12 != 0) {
            i10 = 2;
            if (i12 != 1 && i12 != 2) {
                i10 = b11 & 63;
            }
        } else {
            i10 = 1;
        }
        int i13 = i11 >> 3;
        return i10 * (i13 >= 16 ? 2500 << r0 : i13 >= 12 ? ModuleDescriptor.MODULE_VERSION << (r0 & 1) : (i13 & 3) == 3 ? 60000 : ModuleDescriptor.MODULE_VERSION << r0);
    }

    /* renamed from: e */
    public static long m36687e(byte[] bArr) {
        return m36686d(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    /* renamed from: f */
    private static int m36688f(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    /* renamed from: g */
    public static int m36689g(ByteBuffer byteBuffer) {
        return (int) ((m36686d(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    /* renamed from: h */
    private static long m36690h(long j10) {
        return (j10 * 1000000000) / 48000;
    }
}
