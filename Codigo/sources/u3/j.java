package u3;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import j3.v;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public class j implements h3.j<InputStream, c> {

    /* renamed from: a, reason: collision with root package name */
    private final List<ImageHeaderParser> f27070a;

    /* renamed from: b, reason: collision with root package name */
    private final h3.j<ByteBuffer, c> f27071b;

    /* renamed from: c, reason: collision with root package name */
    private final k3.b f27072c;

    public j(List<ImageHeaderParser> list, h3.j<ByteBuffer, c> jVar, k3.b bVar) {
        this.f27070a = list;
        this.f27071b = jVar;
        this.f27072c = bVar;
    }

    private static byte[] e(InputStream inputStream) {
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

    @Override // h3.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public v<c> b(InputStream inputStream, int i10, int i11, h3.h hVar) {
        byte[] e10 = e(inputStream);
        if (e10 == null) {
            return null;
        }
        return this.f27071b.b(ByteBuffer.wrap(e10), i10, i11, hVar);
    }

    @Override // h3.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, h3.h hVar) {
        return !((Boolean) hVar.c(i.f27069b)).booleanValue() && com.bumptech.glide.load.a.f(this.f27070a, inputStream, this.f27072c) == ImageHeaderParser.ImageType.GIF;
    }
}
