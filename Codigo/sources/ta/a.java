package ta;

import android.os.IInterface;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes2.dex */
public interface a extends IInterface {
    com.google.android.gms.dynamic.b L0(LatLng latLng);

    com.google.android.gms.dynamic.b U(CameraPosition cameraPosition);

    com.google.android.gms.dynamic.b e(LatLngBounds latLngBounds, int i10);

    com.google.android.gms.dynamic.b f1(float f10, int i10, int i11);

    com.google.android.gms.dynamic.b i0(float f10);

    com.google.android.gms.dynamic.b m0(LatLng latLng, float f10);

    com.google.android.gms.dynamic.b n0(float f10, float f11);

    com.google.android.gms.dynamic.b zoomBy(float f10);

    com.google.android.gms.dynamic.b zoomIn();

    com.google.android.gms.dynamic.b zoomOut();
}
