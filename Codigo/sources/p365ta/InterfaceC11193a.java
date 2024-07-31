package p365ta;

import android.os.IInterface;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: ta.a */
/* loaded from: classes2.dex */
public interface InterfaceC11193a extends IInterface {
    /* renamed from: L0 */
    InterfaceC5312b mo35046L0(LatLng latLng);

    /* renamed from: U */
    InterfaceC5312b mo35047U(CameraPosition cameraPosition);

    /* renamed from: e */
    InterfaceC5312b mo35048e(LatLngBounds latLngBounds, int i10);

    /* renamed from: f1 */
    InterfaceC5312b mo35049f1(float f10, int i10, int i11);

    /* renamed from: i0 */
    InterfaceC5312b mo35050i0(float f10);

    /* renamed from: m0 */
    InterfaceC5312b mo35051m0(LatLng latLng, float f10);

    /* renamed from: n0 */
    InterfaceC5312b mo35052n0(float f10, float f11);

    InterfaceC5312b zoomBy(float f10);

    InterfaceC5312b zoomIn();

    InterfaceC5312b zoomOut();
}
