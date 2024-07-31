package mg;

import java.util.ArrayList;
import java.util.List;

/* renamed from: mg.d */
/* loaded from: classes2.dex */
public final class C9583d {

    /* renamed from: a */
    private final C9580a f23358a;

    /* renamed from: b */
    private final List<C9581b> f23359b;

    public C9583d(C9580a c9580a) {
        this.f23358a = c9580a;
        ArrayList arrayList = new ArrayList();
        this.f23359b = arrayList;
        arrayList.add(new C9581b(c9580a, new int[]{1}));
    }

    /* renamed from: a */
    private C9581b m28555a(int i10) {
        if (i10 >= this.f23359b.size()) {
            List<C9581b> list = this.f23359b;
            C9581b c9581b = list.get(list.size() - 1);
            for (int size = this.f23359b.size(); size <= i10; size++) {
                C9580a c9580a = this.f23358a;
                c9581b = c9581b.m28549i(new C9581b(c9580a, new int[]{1, c9580a.m28533c((size - 1) + c9580a.m28534d())}));
                this.f23359b.add(c9581b);
            }
        }
        return this.f23359b.get(i10);
    }

    /* renamed from: b */
    public void m28556b(int[] iArr, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i10;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        C9581b m28555a = m28555a(i10);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] m28545e = new C9581b(this.f23358a, iArr2).m28550j(i10, 1).m28542b(m28555a)[1].m28545e();
        int length2 = i10 - m28545e.length;
        for (int i11 = 0; i11 < length2; i11++) {
            iArr[length + i11] = 0;
        }
        System.arraycopy(m28545e, 0, iArr, length + length2, m28545e.length);
    }
}
