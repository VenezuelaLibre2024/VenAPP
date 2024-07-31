package sa;

import com.google.android.gms.maps.model.LatLng;
import sa.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class k extends ta.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c.g f25434a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(c cVar, c.g gVar) {
        this.f25434a = gVar;
    }

    @Override // ta.l
    public final void b(LatLng latLng) {
        this.f25434a.onMapLongClick(latLng);
    }
}
