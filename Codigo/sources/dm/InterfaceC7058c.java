package dm;

import java.nio.channels.WritableByteChannel;

/* renamed from: dm.c */
/* loaded from: classes3.dex */
public interface InterfaceC7058c extends InterfaceC7078v, WritableByteChannel {
    /* renamed from: E0 */
    long mo20693E0(InterfaceC7080x interfaceC7080x);

    /* renamed from: T */
    InterfaceC7058c mo20705T(String str);

    /* renamed from: Z0 */
    InterfaceC7058c mo20711Z0(long j10);

    /* renamed from: b0 */
    InterfaceC7058c mo20715b0(C7061e c7061e);

    /* renamed from: c */
    C7056b mo20717c();

    @Override // dm.InterfaceC7078v, java.io.Flushable
    void flush();

    /* renamed from: s0 */
    InterfaceC7058c mo20736s0(long j10);

    InterfaceC7058c write(byte[] bArr);

    InterfaceC7058c write(byte[] bArr, int i10, int i11);

    InterfaceC7058c writeByte(int i10);

    InterfaceC7058c writeInt(int i10);

    InterfaceC7058c writeShort(int i10);
}
