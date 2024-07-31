package p373u3;

import android.util.Log;
import com.bumptech.glide.load.C2128a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p129h3.C7624h;
import p129h3.InterfaceC7626j;
import p171j3.InterfaceC8975v;
import p193k3.InterfaceC9139b;

/* renamed from: u3.j */
/* loaded from: classes.dex */
public class C11315j implements InterfaceC7626j<InputStream, C11308c> {

    /* renamed from: a */
    private final List<ImageHeaderParser> f29372a;

    /* renamed from: b */
    private final InterfaceC7626j<ByteBuffer, C11308c> f29373b;

    /* renamed from: c */
    private final InterfaceC9139b f29374c;

    public C11315j(List<ImageHeaderParser> list, InterfaceC7626j<ByteBuffer, C11308c> interfaceC7626j, InterfaceC9139b interfaceC9139b) {
        this.f29372a = list;
        this.f29373b = interfaceC7626j;
        this.f29374c = interfaceC9139b;
    }

    /* renamed from: e */
    private static byte[] m35356e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e10) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e10);
            return null;
        }
    }

    @Override // p129h3.InterfaceC7626j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8975v<C11308c> mo23152b(InputStream inputStream, int i10, int i11, C7624h c7624h) {
        byte[] m35356e = m35356e(inputStream);
        if (m35356e == null) {
            return null;
        }
        return this.f29373b.mo23152b(ByteBuffer.wrap(m35356e), i10, i11, c7624h);
    }

    @Override // p129h3.InterfaceC7626j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo23151a(InputStream inputStream, C7624h c7624h) {
        return !((Boolean) c7624h.m23147c(C11314i.f29371b)).booleanValue() && C2128a.m10748f(this.f29372a, inputStream, this.f29374c) == ImageHeaderParser.ImageType.GIF;
    }
}
