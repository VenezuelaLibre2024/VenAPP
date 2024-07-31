package w1;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.n;
import v1.k;

/* loaded from: classes.dex */
public class g implements k {

    /* renamed from: a, reason: collision with root package name */
    private final SQLiteProgram f29619a;

    public g(SQLiteProgram delegate) {
        n.e(delegate, "delegate");
        this.f29619a = delegate;
    }

    @Override // v1.k
    public void C(int i10, double d10) {
        this.f29619a.bindDouble(i10, d10);
    }

    @Override // v1.k
    public void M0(int i10, long j10) {
        this.f29619a.bindLong(i10, j10);
    }

    @Override // v1.k
    public void O0(int i10, byte[] value) {
        n.e(value, "value");
        this.f29619a.bindBlob(i10, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f29619a.close();
    }

    @Override // v1.k
    public void g1(int i10) {
        this.f29619a.bindNull(i10);
    }

    @Override // v1.k
    public void x0(int i10, String value) {
        n.e(value, "value");
        this.f29619a.bindString(i10, value);
    }
}
