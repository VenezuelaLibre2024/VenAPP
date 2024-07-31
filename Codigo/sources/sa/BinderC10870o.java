package sa;

import com.google.android.gms.internal.maps.zzad;
import p365ta.AbstractBinderC11224q;
import sa.C10858c;
import ua.C11500m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sa.o */
/* loaded from: classes2.dex */
public final class BinderC10870o extends AbstractBinderC11224q {

    /* renamed from: a */
    final /* synthetic */ C10858c.i f27563a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC10870o(C10858c c10858c, C10858c.i iVar) {
        this.f27563a = iVar;
    }

    @Override // p365ta.InterfaceC11225r
    /* renamed from: B */
    public final void mo33181B(zzad zzadVar) {
        this.f27563a.onMarkerDragEnd(new C11500m(zzadVar));
    }

    @Override // p365ta.InterfaceC11225r
    /* renamed from: G1 */
    public final void mo33182G1(zzad zzadVar) {
        this.f27563a.onMarkerDragStart(new C11500m(zzadVar));
    }

    @Override // p365ta.InterfaceC11225r
    /* renamed from: a */
    public final void mo33183a(zzad zzadVar) {
        this.f27563a.onMarkerDrag(new C11500m(zzadVar));
    }
}
