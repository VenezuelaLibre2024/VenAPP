package p106fe;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: fe.h */
/* loaded from: classes.dex */
public class C7339h {

    /* renamed from: a */
    private static final byte f16536a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    private static final byte f16537b = Byte.parseByte("00001111", 2);

    /* renamed from: b */
    private static String m22033b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: c */
    private static byte[] m22034c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    /* renamed from: a */
    public String m22035a() {
        byte[] m22034c = m22034c(UUID.randomUUID(), new byte[17]);
        byte b10 = m22034c[0];
        m22034c[16] = b10;
        m22034c[0] = (byte) ((b10 & f16537b) | f16536a);
        return m22033b(m22034c);
    }
}
