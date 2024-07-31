package p8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import t8.r0;

/* loaded from: classes.dex */
final class k implements g8.i {

    /* renamed from: a, reason: collision with root package name */
    private final List<e> f22923a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f22924b;

    /* renamed from: c, reason: collision with root package name */
    private final long[] f22925c;

    public k(List<e> list) {
        this.f22923a = Collections.unmodifiableList(new ArrayList(list));
        this.f22924b = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f22924b;
            jArr[i11] = eVar.f22894b;
            jArr[i11 + 1] = eVar.f22895c;
        }
        long[] jArr2 = this.f22924b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f22925c = copyOf;
        Arrays.sort(copyOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int c(e eVar, e eVar2) {
        return Long.compare(eVar.f22894b, eVar2.f22894b);
    }

    @Override // g8.i
    public int b(long j10) {
        int e10 = r0.e(this.f22925c, j10, false, false);
        if (e10 < this.f22925c.length) {
            return e10;
        }
        return -1;
    }

    @Override // g8.i
    public List<g8.b> h(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f22923a.size(); i10++) {
            long[] jArr = this.f22924b;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                e eVar = this.f22923a.get(i10);
                g8.b bVar = eVar.f22893a;
                if (bVar.f16046e == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: p8.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int c10;
                c10 = k.c((e) obj, (e) obj2);
                return c10;
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((e) arrayList2.get(i12)).f22893a.c().h((-1) - i12, 1).a());
        }
        return arrayList;
    }

    @Override // g8.i
    public long i(int i10) {
        t8.a.a(i10 >= 0);
        t8.a.a(i10 < this.f22925c.length);
        return this.f22925c[i10];
    }

    @Override // g8.i
    public int l() {
        return this.f22925c.length;
    }
}
