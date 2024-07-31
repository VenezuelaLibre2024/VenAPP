package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import sa.c;
import ua.f;
import ua.m;
import ua.q;
import ua.s;

/* loaded from: classes3.dex */
interface GoogleMapListener extends c.a, c.b, c.InterfaceC0424c, c.e, c.h, c.j, c.k, c.d, c.f, c.g, c.i {
    @Override // sa.c.a
    /* synthetic */ void onCameraIdle();

    /* synthetic */ void onCameraMove();

    /* synthetic */ void onCameraMoveStarted(int i10);

    /* synthetic */ void onCircleClick(f fVar);

    /* synthetic */ void onInfoWindowClick(m mVar);

    /* synthetic */ void onMapClick(LatLng latLng);

    /* synthetic */ void onMapLongClick(LatLng latLng);

    /* synthetic */ boolean onMarkerClick(m mVar);

    /* synthetic */ void onMarkerDrag(m mVar);

    /* synthetic */ void onMarkerDragEnd(m mVar);

    /* synthetic */ void onMarkerDragStart(m mVar);

    /* synthetic */ void onPolygonClick(q qVar);

    /* synthetic */ void onPolylineClick(s sVar);
}
