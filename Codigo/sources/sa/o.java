package sa;

import com.google.android.gms.internal.maps.zzad;
import sa.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class o extends ta.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c.i f25444a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(c cVar, c.i iVar) {
        this.f25444a = iVar;
    }

    @Override // ta.r
    public final void B(zzad zzadVar) {
        this.f25444a.onMarkerDragEnd(new ua.m(zzadVar));
    }

    @Override // ta.r
    public final void G1(zzad zzadVar) {
        this.f25444a.onMarkerDragStart(new ua.m(zzadVar));
    }

    @Override // ta.r
    public final void a(zzad zzadVar) {
        this.f25444a.onMarkerDrag(new ua.m(zzadVar));
    }
}
