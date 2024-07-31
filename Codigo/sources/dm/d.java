package dm;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public interface d extends x, ReadableByteChannel {
    boolean G0();

    String L(long j10);

    String U0(Charset charset);

    long Y(v vVar);

    b c();

    String d0();

    byte[] g0(long j10);

    int n1(o oVar);

    void q0(long j10);

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j10);

    long t1();

    e w0(long j10);
}
