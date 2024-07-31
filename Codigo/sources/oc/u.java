package oc;

import com.google.android.gms.tasks.OnFailureListener;

/* loaded from: classes.dex */
final class u implements OnFailureListener {

    /* renamed from: a */
    private final /* synthetic */ r f22458a;

    public u(r rVar) {
        this.f22458a = rVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        ga.a aVar;
        if (exc instanceof zb.o) {
            aVar = s.f22444h;
            aVar.g("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.f22458a.f22440b.d();
        }
    }
}
