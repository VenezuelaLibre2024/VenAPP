package dm;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* renamed from: dm.d */
/* loaded from: classes3.dex */
public interface InterfaceC7060d extends InterfaceC7080x, ReadableByteChannel {
    /* renamed from: G0 */
    boolean mo20695G0();

    /* renamed from: L */
    String mo20700L(long j10);

    /* renamed from: U0 */
    String mo20708U0(Charset charset);

    /* renamed from: Y */
    long mo20710Y(InterfaceC7078v interfaceC7078v);

    /* renamed from: c */
    C7056b mo20717c();

    /* renamed from: d0 */
    String mo20719d0();

    /* renamed from: g0 */
    byte[] mo20722g0(long j10);

    /* renamed from: n1 */
    int mo20731n1(C7071o c7071o);

    /* renamed from: q0 */
    void mo20733q0(long j10);

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j10);

    /* renamed from: t1 */
    long mo20737t1();

    /* renamed from: w0 */
    C7061e mo20739w0(long j10);
}
