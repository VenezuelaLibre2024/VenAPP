package sa;

import com.google.android.gms.internal.maps.zzag;
import sa.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class r extends ta.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c.j f25447a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(c cVar, c.j jVar) {
        this.f25447a = jVar;
    }

    @Override // ta.u
    public final void w1(zzag zzagVar) {
        this.f25447a.onPolygonClick(new ua.q(zzagVar));
    }
}
