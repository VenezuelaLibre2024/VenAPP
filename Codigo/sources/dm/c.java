package dm;

import java.nio.channels.WritableByteChannel;

/* loaded from: classes3.dex */
public interface c extends v, WritableByteChannel {
    long E0(x xVar);

    c T(String str);

    c Z0(long j10);

    c b0(e eVar);

    b c();

    @Override // dm.v, java.io.Flushable
    void flush();

    c s0(long j10);

    c write(byte[] bArr);

    c write(byte[] bArr, int i10, int i11);

    c writeByte(int i10);

    c writeInt(int i10);

    c writeShort(int i10);
}
