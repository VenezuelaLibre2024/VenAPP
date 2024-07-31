package sa;

import com.google.android.gms.maps.model.LatLng;
import sa.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class x extends ta.i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c.f f25453a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(c cVar, c.f fVar) {
        this.f25453a = fVar;
    }

    @Override // ta.j
    public final void b(LatLng latLng) {
        this.f25453a.onMapClick(latLng);
    }
}
