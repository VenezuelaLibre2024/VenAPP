package u8;

import java.util.ArrayList;
import java.util.List;
import t6.b3;
import t8.e0;
import t8.x;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f27334a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27335b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27336c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27337d;

    /* renamed from: e, reason: collision with root package name */
    public final float f27338e;

    /* renamed from: f, reason: collision with root package name */
    public final String f27339f;

    private a(List<byte[]> list, int i10, int i11, int i12, float f10, String str) {
        this.f27334a = list;
        this.f27335b = i10;
        this.f27336c = i11;
        this.f27337d = i12;
        this.f27338e = f10;
        this.f27339f = str;
    }

    private static byte[] a(e0 e0Var) {
        int N = e0Var.N();
        int f10 = e0Var.f();
        e0Var.V(N);
        return t8.e.d(e0Var.e(), f10, N);
    }

    public static a b(e0 e0Var) {
        int i10;
        int i11;
        float f10;
        String str;
        try {
            e0Var.V(4);
            int H = (e0Var.H() & 3) + 1;
            if (H == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int H2 = e0Var.H() & 31;
            for (int i12 = 0; i12 < H2; i12++) {
                arrayList.add(a(e0Var));
            }
            int H3 = e0Var.H();
            for (int i13 = 0; i13 < H3; i13++) {
                arrayList.add(a(e0Var));
            }
            if (H2 > 0) {
                x.c l10 = t8.x.l((byte[]) arrayList.get(0), H, ((byte[]) arrayList.get(0)).length);
                int i14 = l10.f26798f;
                int i15 = l10.f26799g;
                float f11 = l10.f26800h;
                str = t8.e.a(l10.f26793a, l10.f26794b, l10.f26795c);
                i10 = i14;
                i11 = i15;
                f10 = f11;
            } else {
                i10 = -1;
                i11 = -1;
                f10 = 1.0f;
                str = null;
            }
            return new a(arrayList, H, i10, i11, f10, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw b3.a("Error parsing AVC config", e10);
        }
    }
}
