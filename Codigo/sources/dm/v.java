package dm;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes3.dex */
public interface v extends Closeable, Flushable {
    void K0(b bVar, long j10);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    y m();
}
