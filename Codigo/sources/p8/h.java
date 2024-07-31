package p8;

import android.text.TextUtils;
import java.util.ArrayList;
import t6.b3;
import t8.e0;

/* loaded from: classes.dex */
public final class h extends g8.h {

    /* renamed from: o, reason: collision with root package name */
    private final e0 f22920o;

    /* renamed from: p, reason: collision with root package name */
    private final c f22921p;

    public h() {
        super("WebvttDecoder");
        this.f22920o = new e0();
        this.f22921p = new c();
    }

    private static int B(e0 e0Var) {
        int i10 = -1;
        int i11 = 0;
        while (i10 == -1) {
            i11 = e0Var.f();
            String s10 = e0Var.s();
            i10 = s10 == null ? 0 : "STYLE".equals(s10) ? 2 : s10.startsWith("NOTE") ? 1 : 3;
        }
        e0Var.U(i11);
        return i10;
    }

    private static void C(e0 e0Var) {
        do {
        } while (!TextUtils.isEmpty(e0Var.s()));
    }

    @Override // g8.h
    protected g8.i z(byte[] bArr, int i10, boolean z10) {
        e n10;
        this.f22920o.S(bArr, i10);
        ArrayList arrayList = new ArrayList();
        try {
            i.e(this.f22920o);
            do {
            } while (!TextUtils.isEmpty(this.f22920o.s()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int B = B(this.f22920o);
                if (B == 0) {
                    return new k(arrayList2);
                }
                if (B == 1) {
                    C(this.f22920o);
                } else if (B == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new g8.k("A style block was found after the first cue.");
                    }
                    this.f22920o.s();
                    arrayList.addAll(this.f22921p.d(this.f22920o));
                } else if (B == 3 && (n10 = f.n(this.f22920o, arrayList)) != null) {
                    arrayList2.add(n10);
                }
            }
        } catch (b3 e10) {
            throw new g8.k(e10);
        }
    }
}
