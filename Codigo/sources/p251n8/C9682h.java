package p251n8;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import p120g8.C7484b;
import p120g8.InterfaceC7491i;
import p363t8.C11172r0;

/* renamed from: n8.h */
/* loaded from: classes.dex */
final class C9682h implements InterfaceC7491i {

    /* renamed from: a */
    private final C9678d f23836a;

    /* renamed from: b */
    private final long[] f23837b;

    /* renamed from: c */
    private final Map<String, C9681g> f23838c;

    /* renamed from: d */
    private final Map<String, C9679e> f23839d;

    /* renamed from: e */
    private final Map<String, String> f23840e;

    public C9682h(C9678d c9678d, Map<String, C9681g> map, Map<String, C9679e> map2, Map<String, String> map3) {
        this.f23836a = c9678d;
        this.f23839d = map2;
        this.f23840e = map3;
        this.f23838c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f23837b = c9678d.m29016j();
    }

    @Override // p120g8.InterfaceC7491i
    /* renamed from: b */
    public int mo22798b(long j10) {
        int m34918e = C11172r0.m34918e(this.f23837b, j10, false, false);
        if (m34918e < this.f23837b.length) {
            return m34918e;
        }
        return -1;
    }

    @Override // p120g8.InterfaceC7491i
    /* renamed from: h */
    public List<C7484b> mo22799h(long j10) {
        return this.f23836a.m29015h(j10, this.f23838c, this.f23839d, this.f23840e);
    }

    @Override // p120g8.InterfaceC7491i
    /* renamed from: i */
    public long mo22800i(int i10) {
        return this.f23837b[i10];
    }

    @Override // p120g8.InterfaceC7491i
    /* renamed from: l */
    public int mo22801l() {
        return this.f23837b.length;
    }
}
