package i7;

import android.util.SparseArray;
import com.google.android.libraries.barhopper.RecognitionOptions;
import i7.i0;
import java.util.ArrayList;
import java.util.List;
import t6.u1;

/* loaded from: classes.dex */
public final class j implements i0.c {

    /* renamed from: a */
    private final int f17330a;

    /* renamed from: b */
    private final List<u1> f17331b;

    public j(int i10) {
        this(i10, com.google.common.collect.w.v());
    }

    public j(int i10, List<u1> list) {
        this.f17330a = i10;
        this.f17331b = list;
    }

    private d0 c(i0.b bVar) {
        return new d0(e(bVar));
    }

    private k0 d(i0.b bVar) {
        return new k0(e(bVar));
    }

    private List<u1> e(i0.b bVar) {
        String str;
        int i10;
        if (f(32)) {
            return this.f17331b;
        }
        t8.e0 e0Var = new t8.e0(bVar.f17324d);
        List<u1> list = this.f17331b;
        while (e0Var.a() > 0) {
            int H = e0Var.H();
            int f10 = e0Var.f() + e0Var.H();
            if (H == 134) {
                list = new ArrayList<>();
                int H2 = e0Var.H() & 31;
                for (int i11 = 0; i11 < H2; i11++) {
                    String E = e0Var.E(3);
                    int H3 = e0Var.H();
                    boolean z10 = (H3 & RecognitionOptions.ITF) != 0;
                    if (z10) {
                        i10 = H3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte H4 = (byte) e0Var.H();
                    e0Var.V(1);
                    list.add(new u1.b().g0(str).X(E).H(i10).V(z10 ? t8.e.b((H4 & 64) != 0) : null).G());
                }
            }
            e0Var.U(f10);
        }
        return list;
    }

    private boolean f(int i10) {
        return (i10 & this.f17330a) != 0;
    }

    @Override // i7.i0.c
    public SparseArray<i0> a() {
        return new SparseArray<>();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x002e. Please report as an issue. */
    @Override // i7.i0.c
    public i0 b(int i10, i0.b bVar) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new w(new t(bVar.f17322b));
            }
            if (i10 == 21) {
                return new w(new r());
            }
            if (i10 == 27) {
                if (f(4)) {
                    return null;
                }
                return new w(new p(c(bVar), f(1), f(8)));
            }
            if (i10 == 36) {
                return new w(new q(c(bVar)));
            }
            if (i10 == 89) {
                return new w(new l(bVar.f17323c));
            }
            if (i10 != 138) {
                if (i10 == 172) {
                    return new w(new f(bVar.f17322b));
                }
                if (i10 == 257) {
                    return new c0(new v("application/vnd.dvb.ait"));
                }
                if (i10 == 134) {
                    if (f(16)) {
                        return null;
                    }
                    return new c0(new v("application/x-scte35"));
                }
                if (i10 != 135) {
                    switch (i10) {
                        case 15:
                            if (f(2)) {
                                return null;
                            }
                            return new w(new i(false, bVar.f17322b));
                        case 16:
                            return new w(new o(d(bVar)));
                        case 17:
                            if (f(2)) {
                                return null;
                            }
                            return new w(new s(bVar.f17322b));
                        default:
                            switch (i10) {
                                case RecognitionOptions.ITF /* 128 */:
                                    break;
                                case 129:
                                    break;
                                case 130:
                                    if (!f(64)) {
                                        return null;
                                    }
                                    break;
                                default:
                                    return null;
                            }
                    }
                }
                return new w(new c(bVar.f17322b));
            }
            return new w(new k(bVar.f17322b));
        }
        return new w(new n(d(bVar)));
    }
}
