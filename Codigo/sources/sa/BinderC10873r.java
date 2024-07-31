package sa;

import com.google.android.gms.internal.maps.zzag;
import p365ta.AbstractBinderC11227t;
import sa.C10858c;
import ua.C11508q;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sa.r */
/* loaded from: classes2.dex */
public final class BinderC10873r extends AbstractBinderC11227t {

    /* renamed from: a */
    final /* synthetic */ C10858c.j f27566a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC10873r(C10858c c10858c, C10858c.j jVar) {
        this.f27566a = jVar;
    }

    @Override // p365ta.InterfaceC11228u
    /* renamed from: w1 */
    public final void mo33186w1(zzag zzagVar) {
        this.f27566a.onPolygonClick(new C11508q(zzagVar));
    }
}
