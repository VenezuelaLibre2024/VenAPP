package p291p8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p120g8.C7484b;
import p120g8.InterfaceC7491i;
import p363t8.C11137a;
import p363t8.C11172r0;

/* renamed from: p8.k */
/* loaded from: classes.dex */
final class C10121k implements InterfaceC7491i {

    /* renamed from: a */
    private final List<C10115e> f24856a;

    /* renamed from: b */
    private final long[] f24857b;

    /* renamed from: c */
    private final long[] f24858c;

    public C10121k(List<C10115e> list) {
        this.f24856a = Collections.unmodifiableList(new ArrayList(list));
        this.f24857b = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            C10115e c10115e = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f24857b;
            jArr[i11] = c10115e.f24827b;
            jArr[i11 + 1] = c10115e.f24828c;
        }
        long[] jArr2 = this.f24857b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f24858c = copyOf;
        Arrays.sort(copyOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ int m30242c(C10115e c10115e, C10115e c10115e2) {
        return Long.compare(c10115e.f24827b, c10115e2.f24827b);
    }

    @Override // p120g8.InterfaceC7491i
    /* renamed from: b */
    public int mo22798b(long j10) {
        int m34918e = C11172r0.m34918e(this.f24858c, j10, false, false);
        if (m34918e < this.f24858c.length) {
            return m34918e;
        }
        return -1;
    }

    @Override // p120g8.InterfaceC7491i
    /* renamed from: h */
    public List<C7484b> mo22799h(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f24856a.size(); i10++) {
            long[] jArr = this.f24857b;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                C10115e c10115e = this.f24856a.get(i10);
                C7484b c7484b = c10115e.f24826a;
                if (c7484b.f17660e == -3.4028235E38f) {
                    arrayList2.add(c10115e);
                } else {
                    arrayList.add(c7484b);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: p8.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m30242c;
                m30242c = C10121k.m30242c((C10115e) obj, (C10115e) obj2);
                return m30242c;
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((C10115e) arrayList2.get(i12)).f24826a.m22763c().m22771h((-1) - i12, 1).m22764a());
        }
        return arrayList;
    }

    @Override // p120g8.InterfaceC7491i
    /* renamed from: i */
    public long mo22800i(int i10) {
        C11137a.m34599a(i10 >= 0);
        C11137a.m34599a(i10 < this.f24858c.length);
        return this.f24858c[i10];
    }

    @Override // p120g8.InterfaceC7491i
    /* renamed from: l */
    public int mo22801l() {
        return this.f24858c.length;
    }
}
