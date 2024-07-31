package w1;

import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.n;
import v1.m;

/* loaded from: classes.dex */
public final class h extends g implements m {

    /* renamed from: b, reason: collision with root package name */
    private final SQLiteStatement f29620b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SQLiteStatement delegate) {
        super(delegate);
        n.e(delegate, "delegate");
        this.f29620b = delegate;
    }

    @Override // v1.m
    public long t0() {
        return this.f29620b.executeInsert();
    }

    @Override // v1.m
    public int z() {
        return this.f29620b.executeUpdateDelete();
    }
}
