package sa;

import com.google.android.gms.maps.model.LatLng;
import p365ta.AbstractBinderC11213k;
import sa.C10858c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sa.k */
/* loaded from: classes2.dex */
public final class BinderC10866k extends AbstractBinderC11213k {

    /* renamed from: a */
    final /* synthetic */ C10858c.g f27553a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC10866k(C10858c c10858c, C10858c.g gVar) {
        this.f27553a = gVar;
    }

    @Override // p365ta.InterfaceC11215l
    /* renamed from: b */
    public final void mo33176b(LatLng latLng) {
        this.f27553a.onMapLongClick(latLng);
    }
}
