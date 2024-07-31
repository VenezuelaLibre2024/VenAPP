package p8;

import g8.b;
import java.util.ArrayList;
import java.util.Collections;
import t8.e0;
import t8.r0;

/* loaded from: classes.dex */
public final class a extends g8.h {

    /* renamed from: o, reason: collision with root package name */
    private final e0 f22870o;

    public a() {
        super("Mp4WebvttDecoder");
        this.f22870o = new e0();
    }

    private static g8.b B(e0 e0Var, int i10) {
        CharSequence charSequence = null;
        b.C0262b c0262b = null;
        while (i10 > 0) {
            if (i10 < 8) {
                throw new g8.k("Incomplete vtt cue box header found.");
            }
            int q10 = e0Var.q();
            int q11 = e0Var.q();
            int i11 = q10 - 8;
            String E = r0.E(e0Var.e(), e0Var.f(), i11);
            e0Var.V(i11);
            i10 = (i10 - 8) - i11;
            if (q11 == 1937011815) {
                c0262b = f.o(E);
            } else if (q11 == 1885436268) {
                charSequence = f.q(null, E.trim(), Collections.emptyList());
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        return c0262b != null ? c0262b.o(charSequence).a() : f.l(charSequence);
    }

    @Override // g8.h
    protected g8.i z(byte[] bArr, int i10, boolean z10) {
        this.f22870o.S(bArr, i10);
        ArrayList arrayList = new ArrayList();
        while (this.f22870o.a() > 0) {
            if (this.f22870o.a() < 8) {
                throw new g8.k("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int q10 = this.f22870o.q();
            if (this.f22870o.q() == 1987343459) {
                arrayList.add(B(this.f22870o, q10 - 8));
            } else {
                this.f22870o.V(q10 - 8);
            }
        }
        return new b(arrayList);
    }
}
