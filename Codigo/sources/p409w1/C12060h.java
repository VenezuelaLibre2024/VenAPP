package p409w1;

import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.C9322n;
import p391v1.InterfaceC11614m;

/* renamed from: w1.h */
/* loaded from: classes.dex */
public final class C12060h extends C12059g implements InterfaceC11614m {

    /* renamed from: b */
    private final SQLiteStatement f32083b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12060h(SQLiteStatement delegate) {
        super(delegate);
        C9322n.m27781e(delegate, "delegate");
        this.f32083b = delegate;
    }

    @Override // p391v1.InterfaceC11614m
    /* renamed from: t0 */
    public long mo32162t0() {
        return this.f32083b.executeInsert();
    }

    @Override // p391v1.InterfaceC11614m
    /* renamed from: z */
    public int mo32164z() {
        return this.f32083b.executeUpdateDelete();
    }
}
