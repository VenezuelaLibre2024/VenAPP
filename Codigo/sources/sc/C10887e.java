package sc;

import cf.AbstractC1961d;
import cf.AbstractC1962e;
import cf.InterfaceC1963f;
import dk.C7033s;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.C9322n;
import p420wc.AbstractC12156i;
import p420wc.C12161n;

/* renamed from: sc.e */
/* loaded from: classes.dex */
public final class C10887e implements InterfaceC1963f {

    /* renamed from: a */
    private final C12161n f27585a;

    public C10887e(C12161n userMetadata) {
        C9322n.m27781e(userMetadata, "userMetadata");
        this.f27585a = userMetadata;
    }

    @Override // cf.InterfaceC1963f
    /* renamed from: a */
    public void mo10214a(AbstractC1962e rolloutsState) {
        int m20590r;
        C9322n.m27781e(rolloutsState, "rolloutsState");
        C12161n c12161n = this.f27585a;
        Set<AbstractC1961d> mo10211b = rolloutsState.mo10211b();
        C9322n.m27780d(mo10211b, "rolloutsState.rolloutAssignments");
        Set<AbstractC1961d> set = mo10211b;
        m20590r = C7033s.m20590r(set, 10);
        ArrayList arrayList = new ArrayList(m20590r);
        for (AbstractC1961d abstractC1961d : set) {
            arrayList.add(AbstractC12156i.m38987b(abstractC1961d.mo10202d(), abstractC1961d.mo10200b(), abstractC1961d.mo10201c(), abstractC1961d.mo10204f(), abstractC1961d.mo10203e()));
        }
        c12161n.m39011s(arrayList);
        C10889g.m33216f().m33217b("Updated Crashlytics Rollout State");
    }
}
