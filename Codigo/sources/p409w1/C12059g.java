package p409w1;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.C9322n;
import p391v1.InterfaceC11612k;

/* renamed from: w1.g */
/* loaded from: classes.dex */
public class C12059g implements InterfaceC11612k {

    /* renamed from: a */
    private final SQLiteProgram f32082a;

    public C12059g(SQLiteProgram delegate) {
        C9322n.m27781e(delegate, "delegate");
        this.f32082a = delegate;
    }

    @Override // p391v1.InterfaceC11612k
    /* renamed from: C */
    public void mo32158C(int i10, double d10) {
        this.f32082a.bindDouble(i10, d10);
    }

    @Override // p391v1.InterfaceC11612k
    /* renamed from: M0 */
    public void mo32159M0(int i10, long j10) {
        this.f32082a.bindLong(i10, j10);
    }

    @Override // p391v1.InterfaceC11612k
    /* renamed from: O0 */
    public void mo32160O0(int i10, byte[] value) {
        C9322n.m27781e(value, "value");
        this.f32082a.bindBlob(i10, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f32082a.close();
    }

    @Override // p391v1.InterfaceC11612k
    /* renamed from: g1 */
    public void mo32161g1(int i10) {
        this.f32082a.bindNull(i10);
    }

    @Override // p391v1.InterfaceC11612k
    /* renamed from: x0 */
    public void mo32163x0(int i10, String value) {
        C9322n.m27781e(value, "value");
        this.f32082a.bindString(i10, value);
    }
}
