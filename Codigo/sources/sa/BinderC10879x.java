package sa;

import com.google.android.gms.maps.model.LatLng;
import p365ta.AbstractBinderC11209i;
import sa.C10858c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sa.x */
/* loaded from: classes2.dex */
public final class BinderC10879x extends AbstractBinderC11209i {

    /* renamed from: a */
    final /* synthetic */ C10858c.f f27572a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC10879x(C10858c c10858c, C10858c.f fVar) {
        this.f27572a = fVar;
    }

    @Override // p365ta.InterfaceC11211j
    /* renamed from: b */
    public final void mo33189b(LatLng latLng) {
        this.f27572a.onMapClick(latLng);
    }
}
