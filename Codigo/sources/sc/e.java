package sc;

import dk.s;
import java.util.ArrayList;
import java.util.Set;
import wc.n;

/* loaded from: classes.dex */
public final class e implements cf.f {

    /* renamed from: a, reason: collision with root package name */
    private final n f25466a;

    public e(n userMetadata) {
        kotlin.jvm.internal.n.e(userMetadata, "userMetadata");
        this.f25466a = userMetadata;
    }

    @Override // cf.f
    public void a(cf.e rolloutsState) {
        int r10;
        kotlin.jvm.internal.n.e(rolloutsState, "rolloutsState");
        n nVar = this.f25466a;
        Set<cf.d> b10 = rolloutsState.b();
        kotlin.jvm.internal.n.d(b10, "rolloutsState.rolloutAssignments");
        Set<cf.d> set = b10;
        r10 = s.r(set, 10);
        ArrayList arrayList = new ArrayList(r10);
        for (cf.d dVar : set) {
            arrayList.add(wc.i.b(dVar.d(), dVar.b(), dVar.c(), dVar.f(), dVar.e()));
        }
        nVar.s(arrayList);
        g.f().b("Updated Crashlytics Rollout State");
    }
}
