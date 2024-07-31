package i8;

import g8.h;
import g8.i;
import java.util.List;
import t8.e0;

/* loaded from: classes.dex */
public final class a extends h {

    /* renamed from: o, reason: collision with root package name */
    private final b f17544o;

    public a(List<byte[]> list) {
        super("DvbDecoder");
        e0 e0Var = new e0(list.get(0));
        this.f17544o = new b(e0Var.N(), e0Var.N());
    }

    @Override // g8.h
    protected i z(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f17544o.r();
        }
        return new c(this.f17544o.b(bArr, i10));
    }
}
