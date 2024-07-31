package io.flutter.plugins.googlemaps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.k;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.platform.PlatformView;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sa.c;
import sa.d;
import sa.f;
import ua.l;
import ua.m;
import ua.q;
import ua.s;

/* loaded from: classes3.dex */
public final class GoogleMapController implements DefaultLifecycleObserver, ActivityPluginBinding.OnSaveInstanceStateListener, GoogleMapOptionsSink, MethodChannel.MethodCallHandler, f, GoogleMapListener, PlatformView {
    private static final String TAG = "GoogleMapController";
    private final CirclesController circlesController;
    private final Context context;
    final float density;
    private c googleMap;

    /* renamed from: id */
    private final int f18283id;
    private List<Object> initialCircles;
    private List<Object> initialMarkers;
    List<Float> initialPadding;
    private List<Object> initialPolygons;
    private List<Object> initialPolylines;
    private List<Map<String, ?>> initialTileOverlays;
    private final LifecycleProvider lifecycleProvider;
    private MethodChannel.Result mapReadyResult;
    private d mapView;
    private final MarkersController markersController;
    private final MethodChannel methodChannel;
    private final GoogleMapOptions options;
    private final PolygonsController polygonsController;
    private final PolylinesController polylinesController;
    private final TileOverlaysController tileOverlaysController;
    private boolean trackCameraPosition = false;
    private boolean myLocationEnabled = false;
    private boolean myLocationButtonEnabled = false;
    private boolean zoomControlsEnabled = true;
    private boolean indoorEnabled = true;
    private boolean trafficEnabled = false;
    private boolean buildingsEnabled = true;
    private boolean disposed = false;

    /* renamed from: io.flutter.plugins.googlemaps.GoogleMapController$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements TextureView.SurfaceTextureListener {
        final /* synthetic */ TextureView.SurfaceTextureListener val$internalListener;
        final /* synthetic */ d val$mapView;

        AnonymousClass1(TextureView.SurfaceTextureListener surfaceTextureListener, d dVar) {
            r2 = surfaceTextureListener;
            r3 = dVar;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            TextureView.SurfaceTextureListener surfaceTextureListener = r2;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i10, i11);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            TextureView.SurfaceTextureListener surfaceTextureListener = r2;
            if (surfaceTextureListener != null) {
                return surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
            }
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            TextureView.SurfaceTextureListener surfaceTextureListener = r2;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i10, i11);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            TextureView.SurfaceTextureListener surfaceTextureListener = r2;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
            }
            r3.invalidate();
        }
    }

    /* renamed from: io.flutter.plugins.googlemaps.GoogleMapController$2 */
    /* loaded from: classes3.dex */
    class AnonymousClass2 implements c.l {
        final /* synthetic */ MethodChannel.Result val$_result;

        AnonymousClass2(MethodChannel.Result result) {
            r2 = result;
        }

        @Override // sa.c.l
        public void onSnapshotReady(Bitmap bitmap) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bitmap.recycle();
            r2.success(byteArray);
        }
    }

    public GoogleMapController(int i10, Context context, BinaryMessenger binaryMessenger, LifecycleProvider lifecycleProvider, GoogleMapOptions googleMapOptions) {
        this.f18283id = i10;
        this.context = context;
        this.options = googleMapOptions;
        this.mapView = new d(context, googleMapOptions);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.density = f10;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugins.flutter.dev/google_maps_android_" + i10);
        this.methodChannel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.lifecycleProvider = lifecycleProvider;
        this.markersController = new MarkersController(methodChannel);
        this.polygonsController = new PolygonsController(methodChannel, f10);
        this.polylinesController = new PolylinesController(methodChannel, f10);
        this.circlesController = new CirclesController(methodChannel, f10);
        this.tileOverlaysController = new TileOverlaysController(methodChannel);
    }

    private void animateCamera(sa.a aVar) {
        this.googleMap.f(aVar);
    }

    private int checkSelfPermission(String str) {
        if (str != null) {
            return this.context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    private void destroyMapViewIfNecessary() {
        d dVar = this.mapView;
        if (dVar == null) {
            return;
        }
        dVar.c();
        this.mapView = null;
    }

    private static TextureView findTextureView(ViewGroup viewGroup) {
        TextureView findTextureView;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof TextureView) {
                return (TextureView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (findTextureView = findTextureView((ViewGroup) childAt)) != null) {
                return findTextureView;
            }
        }
        return null;
    }

    private CameraPosition getCameraPosition() {
        if (this.trackCameraPosition) {
            return this.googleMap.g();
        }
        return null;
    }

    private boolean hasLocationPermission() {
        return checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0 || checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    private void installInvalidator() {
        d dVar = this.mapView;
        if (dVar == null) {
            return;
        }
        TextureView findTextureView = findTextureView(dVar);
        if (findTextureView == null) {
            Log.i(TAG, "No TextureView found. Likely using the LEGACY renderer.");
        } else {
            Log.i(TAG, "Installing custom TextureView driven invalidator.");
            findTextureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: io.flutter.plugins.googlemaps.GoogleMapController.1
                final /* synthetic */ TextureView.SurfaceTextureListener val$internalListener;
                final /* synthetic */ d val$mapView;

                AnonymousClass1(TextureView.SurfaceTextureListener surfaceTextureListener, d dVar2) {
                    r2 = surfaceTextureListener;
                    r3 = dVar2;
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
                    TextureView.SurfaceTextureListener surfaceTextureListener = r2;
                    if (surfaceTextureListener != null) {
                        surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i10, i11);
                    }
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                    TextureView.SurfaceTextureListener surfaceTextureListener = r2;
                    if (surfaceTextureListener != null) {
                        return surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
                    }
                    return true;
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
                    TextureView.SurfaceTextureListener surfaceTextureListener = r2;
                    if (surfaceTextureListener != null) {
                        surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i10, i11);
                    }
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                    TextureView.SurfaceTextureListener surfaceTextureListener = r2;
                    if (surfaceTextureListener != null) {
                        surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
                    }
                    r3.invalidate();
                }
            });
        }
    }

    private void moveCamera(sa.a aVar) {
        this.googleMap.n(aVar);
    }

    private void setGoogleMapListener(GoogleMapListener googleMapListener) {
        c cVar = this.googleMap;
        if (cVar == null) {
            Log.v(TAG, "Controller was disposed before GoogleMap was ready.");
            return;
        }
        cVar.z(googleMapListener);
        this.googleMap.y(googleMapListener);
        this.googleMap.x(googleMapListener);
        this.googleMap.E(googleMapListener);
        this.googleMap.F(googleMapListener);
        this.googleMap.G(googleMapListener);
        this.googleMap.H(googleMapListener);
        this.googleMap.A(googleMapListener);
        this.googleMap.C(googleMapListener);
        this.googleMap.D(googleMapListener);
    }

    private void updateInitialCircles() {
        this.circlesController.addCircles(this.initialCircles);
    }

    private void updateInitialMarkers() {
        this.markersController.addMarkers(this.initialMarkers);
    }

    private void updateInitialPolygons() {
        this.polygonsController.addPolygons(this.initialPolygons);
    }

    private void updateInitialPolylines() {
        this.polylinesController.addPolylines(this.initialPolylines);
    }

    private void updateInitialTileOverlays() {
        this.tileOverlaysController.addTileOverlays(this.initialTileOverlays);
    }

    private void updateMyLocationSettings() {
        if (!hasLocationPermission()) {
            Log.e(TAG, "Cannot enable MyLocation layer as location permissions are not granted");
        } else {
            this.googleMap.w(this.myLocationEnabled);
            this.googleMap.k().k(this.myLocationButtonEnabled);
        }
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        if (this.disposed) {
            return;
        }
        this.disposed = true;
        this.methodChannel.setMethodCallHandler(null);
        setGoogleMapListener(null);
        destroyMapViewIfNecessary();
        androidx.lifecycle.f lifecycle = this.lifecycleProvider.getLifecycle();
        if (lifecycle != null) {
            lifecycle.c(this);
        }
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public View getView() {
        return this.mapView;
    }

    public void init() {
        this.lifecycleProvider.getLifecycle().a(this);
        this.mapView.a(this);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, sa.c.a
    public void onCameraIdle() {
        this.methodChannel.invokeMethod("camera#onIdle", Collections.singletonMap("map", Integer.valueOf(this.f18283id)));
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, sa.c.b
    public void onCameraMove() {
        if (this.trackCameraPosition) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("position", Convert.cameraPositionToJson(this.googleMap.g()));
            this.methodChannel.invokeMethod("camera#onMove", hashMap);
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, sa.c.InterfaceC0424c
    public void onCameraMoveStarted(int i10) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("isGesture", Boolean.valueOf(i10 == 1));
        this.methodChannel.invokeMethod("camera#onMoveStarted", hashMap);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, sa.c.d
    public void onCircleClick(ua.f fVar) {
        this.circlesController.onCircleTap(fVar.a());
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(k kVar) {
        if (this.disposed) {
            return;
        }
        this.mapView.b(null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(k kVar) {
        kVar.getLifecycle().c(this);
        if (this.disposed) {
            return;
        }
        destroyMapViewIfNecessary();
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, sa.c.e
    public void onInfoWindowClick(m mVar) {
        this.markersController.onInfoWindowTap(mVar.a());
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, sa.c.f
    public void onMapClick(LatLng latLng) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("position", Convert.latLngToJson(latLng));
        this.methodChannel.invokeMethod("map#onTap", hashMap);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, sa.c.g
    public void onMapLongClick(LatLng latLng) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("position", Convert.latLngToJson(latLng));
        this.methodChannel.invokeMethod("map#onLongPress", hashMap);
    }

    @Override // sa.f
    public void onMapReady(c cVar) {
        this.googleMap = cVar;
        cVar.q(this.indoorEnabled);
        this.googleMap.J(this.trafficEnabled);
        this.googleMap.p(this.buildingsEnabled);
        installInvalidator();
        cVar.B(this);
        MethodChannel.Result result = this.mapReadyResult;
        if (result != null) {
            result.success(null);
            this.mapReadyResult = null;
        }
        setGoogleMapListener(this);
        updateMyLocationSettings();
        this.markersController.setGoogleMap(cVar);
        this.polygonsController.setGoogleMap(cVar);
        this.polylinesController.setGoogleMap(cVar);
        this.circlesController.setGoogleMap(cVar);
        this.tileOverlaysController.setGoogleMap(cVar);
        updateInitialMarkers();
        updateInitialPolygons();
        updateInitialPolylines();
        updateInitialCircles();
        updateInitialTileOverlays();
        List<Float> list = this.initialPadding;
        if (list == null || list.size() != 4) {
            return;
        }
        setPadding(this.initialPadding.get(0).floatValue(), this.initialPadding.get(1).floatValue(), this.initialPadding.get(2).floatValue(), this.initialPadding.get(3).floatValue());
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, sa.c.h
    public boolean onMarkerClick(m mVar) {
        return this.markersController.onMarkerTap(mVar.a());
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, sa.c.i
    public void onMarkerDrag(m mVar) {
        this.markersController.onMarkerDrag(mVar.a(), mVar.b());
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, sa.c.i
    public void onMarkerDragEnd(m mVar) {
        this.markersController.onMarkerDragEnd(mVar.a(), mVar.b());
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, sa.c.i
    public void onMarkerDragStart(m mVar) {
        this.markersController.onMarkerDragStart(mVar.a(), mVar.b());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:100:0x01c0. Please report as an issue. */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str;
        boolean e10;
        String str2;
        Object obj;
        String str3 = methodCall.method;
        str3.hashCode();
        char c10 = 65535;
        switch (str3.hashCode()) {
            case -2068530537:
                if (str3.equals("map#getVisibleRegion")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1753225255:
                if (str3.equals("map#isScrollGesturesEnabled")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1675017333:
                if (str3.equals("map#isRotateGesturesEnabled")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1389285936:
                if (str3.equals("map#update")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1366519597:
                if (str3.equals("map#getScreenCoordinate")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1264573565:
                if (str3.equals("camera#animate")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1255039905:
                if (str3.equals("markers#isInfoWindowShown")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1253612063:
                if (str3.equals("map#getTileOverlayInfo")) {
                    c10 = 7;
                    break;
                }
                break;
            case -1102318061:
                if (str3.equals("polygons#update")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -596474455:
                if (str3.equals("map#isTiltGesturesEnabled")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -577075523:
                if (str3.equals("map#isMyLocationButtonEnabled")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -508357782:
                if (str3.equals("markers#hideInfoWindow")) {
                    c10 = 11;
                    break;
                }
                break;
            case -451921790:
                if (str3.equals("map#getZoomLevel")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 262112323:
                if (str3.equals("map#getMinMaxZoomLevels")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 282895827:
                if (str3.equals("map#isZoomGesturesEnabled")) {
                    c10 = 14;
                    break;
                }
                break;
            case 295004975:
                if (str3.equals("map#waitForMap")) {
                    c10 = 15;
                    break;
                }
                break;
            case 390939153:
                if (str3.equals("map#isMapToolbarEnabled")) {
                    c10 = 16;
                    break;
                }
                break;
            case 434031410:
                if (str3.equals("map#takeSnapshot")) {
                    c10 = 17;
                    break;
                }
                break;
            case 622947733:
                if (str3.equals("map#getLatLng")) {
                    c10 = 18;
                    break;
                }
                break;
            case 643972249:
                if (str3.equals("polylines#update")) {
                    c10 = 19;
                    break;
                }
                break;
            case 712945078:
                if (str3.equals("map#setStyle")) {
                    c10 = 20;
                    break;
                }
                break;
            case 972868051:
                if (str3.equals("map#isBuildingsEnabled")) {
                    c10 = 21;
                    break;
                }
                break;
            case 1098288608:
                if (str3.equals("map#isCompassEnabled")) {
                    c10 = 22;
                    break;
                }
                break;
            case 1172199911:
                if (str3.equals("map#isZoomControlsEnabled")) {
                    c10 = 23;
                    break;
                }
                break;
            case 1322988819:
                if (str3.equals("markers#update")) {
                    c10 = 24;
                    break;
                }
                break;
            case 1546082965:
                if (str3.equals("map#isTrafficEnabled")) {
                    c10 = 25;
                    break;
                }
                break;
            case 1564959387:
                if (str3.equals("tileOverlays#update")) {
                    c10 = 26;
                    break;
                }
                break;
            case 1708609913:
                if (str3.equals("tileOverlays#clearTileCache")) {
                    c10 = 27;
                    break;
                }
                break;
            case 1873569705:
                if (str3.equals("circles#update")) {
                    c10 = 28;
                    break;
                }
                break;
            case 1915657375:
                if (str3.equals("map#isLiteModeEnabled")) {
                    c10 = 29;
                    break;
                }
                break;
            case 1953391461:
                if (str3.equals("markers#showInfoWindow")) {
                    c10 = 30;
                    break;
                }
                break;
            case 2003557999:
                if (str3.equals("camera#move")) {
                    c10 = 31;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                c cVar = this.googleMap;
                if (cVar != null) {
                    obj = Convert.latlngBoundsToJson(cVar.j().b().f27506e);
                    result.success(obj);
                    return;
                } else {
                    str = "getVisibleRegion called prior to map initialization";
                    result.error("GoogleMap uninitialized", str, null);
                    return;
                }
            case 1:
                e10 = this.googleMap.k().e();
                obj = Boolean.valueOf(e10);
                result.success(obj);
                return;
            case 2:
                e10 = this.googleMap.k().d();
                obj = Boolean.valueOf(e10);
                result.success(obj);
                return;
            case 3:
                Convert.interpretGoogleMapOptions(methodCall.argument("options"), this);
                obj = Convert.cameraPositionToJson(getCameraPosition());
                result.success(obj);
                return;
            case 4:
                if (this.googleMap != null) {
                    obj = Convert.pointToJson(this.googleMap.j().c(Convert.toLatLng(methodCall.arguments)));
                    result.success(obj);
                    return;
                } else {
                    str = "getScreenCoordinate called prior to map initialization";
                    result.error("GoogleMap uninitialized", str, null);
                    return;
                }
            case 5:
                animateCamera(Convert.toCameraUpdate(methodCall.argument("cameraUpdate"), this.density));
                result.success(null);
                return;
            case 6:
                this.markersController.isInfoWindowShown((String) methodCall.argument("markerId"), result);
                return;
            case 7:
                obj = this.tileOverlaysController.getTileOverlayInfo((String) methodCall.argument("tileOverlayId"));
                result.success(obj);
                return;
            case '\b':
                this.polygonsController.addPolygons((List) methodCall.argument("polygonsToAdd"));
                this.polygonsController.changePolygons((List) methodCall.argument("polygonsToChange"));
                this.polygonsController.removePolygons((List) methodCall.argument("polygonIdsToRemove"));
                result.success(null);
                return;
            case '\t':
                e10 = this.googleMap.k().f();
                obj = Boolean.valueOf(e10);
                result.success(obj);
                return;
            case '\n':
                e10 = this.googleMap.k().c();
                obj = Boolean.valueOf(e10);
                result.success(obj);
                return;
            case 11:
                this.markersController.hideMarkerInfoWindow((String) methodCall.argument("markerId"), result);
                return;
            case '\f':
                obj = Float.valueOf(this.googleMap.g().f9906b);
                result.success(obj);
                return;
            case '\r':
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(Float.valueOf(this.googleMap.i()));
                arrayList.add(Float.valueOf(this.googleMap.h()));
                obj = arrayList;
                result.success(obj);
                return;
            case 14:
                e10 = this.googleMap.k().h();
                obj = Boolean.valueOf(e10);
                result.success(obj);
                return;
            case 15:
                if (this.googleMap != null) {
                    result.success(null);
                    return;
                } else {
                    this.mapReadyResult = result;
                    return;
                }
            case 16:
                e10 = this.googleMap.k().b();
                obj = Boolean.valueOf(e10);
                result.success(obj);
                return;
            case 17:
                c cVar2 = this.googleMap;
                if (cVar2 != null) {
                    cVar2.K(new c.l() { // from class: io.flutter.plugins.googlemaps.GoogleMapController.2
                        final /* synthetic */ MethodChannel.Result val$_result;

                        AnonymousClass2(MethodChannel.Result result2) {
                            r2 = result2;
                        }

                        @Override // sa.c.l
                        public void onSnapshotReady(Bitmap bitmap) {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            bitmap.recycle();
                            r2.success(byteArray);
                        }
                    });
                    return;
                } else {
                    str = "takeSnapshot";
                    result2.error("GoogleMap uninitialized", str, null);
                    return;
                }
            case 18:
                if (this.googleMap != null) {
                    obj = Convert.latLngToJson(this.googleMap.j().a(Convert.toPoint(methodCall.arguments)));
                    result2.success(obj);
                    return;
                } else {
                    str = "getLatLng called prior to map initialization";
                    result2.error("GoogleMap uninitialized", str, null);
                    return;
                }
            case 19:
                this.polylinesController.addPolylines((List) methodCall.argument("polylinesToAdd"));
                this.polylinesController.changePolylines((List) methodCall.argument("polylinesToChange"));
                this.polylinesController.removePolylines((List) methodCall.argument("polylineIdsToRemove"));
                result2.success(null);
                return;
            case 20:
                Object obj2 = methodCall.arguments;
                boolean s10 = (!(obj2 instanceof String) || (str2 = (String) obj2) == null) ? this.googleMap.s(null) : this.googleMap.s(new l(str2));
                ArrayList arrayList2 = new ArrayList(2);
                arrayList2.add(Boolean.valueOf(s10));
                if (!s10) {
                    arrayList2.add("Unable to set the map style. Please check console logs for errors.");
                }
                result2.success(arrayList2);
                return;
            case 21:
                e10 = this.googleMap.l();
                obj = Boolean.valueOf(e10);
                result2.success(obj);
                return;
            case 22:
                e10 = this.googleMap.k().a();
                obj = Boolean.valueOf(e10);
                result2.success(obj);
                return;
            case 23:
                e10 = this.googleMap.k().g();
                obj = Boolean.valueOf(e10);
                result2.success(obj);
                return;
            case 24:
                this.markersController.addMarkers((List) methodCall.argument("markersToAdd"));
                this.markersController.changeMarkers((List) methodCall.argument("markersToChange"));
                this.markersController.removeMarkers((List) methodCall.argument("markerIdsToRemove"));
                result2.success(null);
                return;
            case 25:
                e10 = this.googleMap.m();
                obj = Boolean.valueOf(e10);
                result2.success(obj);
                return;
            case 26:
                this.tileOverlaysController.addTileOverlays((List) methodCall.argument("tileOverlaysToAdd"));
                this.tileOverlaysController.changeTileOverlays((List) methodCall.argument("tileOverlaysToChange"));
                this.tileOverlaysController.removeTileOverlays((List) methodCall.argument("tileOverlayIdsToRemove"));
                result2.success(null);
                return;
            case 27:
                this.tileOverlaysController.clearTileCache((String) methodCall.argument("tileOverlayId"));
                result2.success(null);
                return;
            case 28:
                this.circlesController.addCircles((List) methodCall.argument("circlesToAdd"));
                this.circlesController.changeCircles((List) methodCall.argument("circlesToChange"));
                this.circlesController.removeCircles((List) methodCall.argument("circleIdsToRemove"));
                result2.success(null);
                return;
            case 29:
                obj = this.options.z1();
                result2.success(obj);
                return;
            case 30:
                this.markersController.showMarkerInfoWindow((String) methodCall.argument("markerId"), result2);
                return;
            case 31:
                moveCamera(Convert.toCameraUpdate(methodCall.argument("cameraUpdate"), this.density));
                result2.success(null);
                return;
            default:
                result2.notImplemented();
                return;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(k kVar) {
        if (this.disposed) {
            return;
        }
        this.mapView.d();
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, sa.c.j
    public void onPolygonClick(q qVar) {
        this.polygonsController.onPolygonTap(qVar.a());
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapListener, sa.c.k
    public void onPolylineClick(s sVar) {
        this.polylinesController.onPolylineTap(sVar.a());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding.OnSaveInstanceStateListener
    public void onRestoreInstanceState(Bundle bundle) {
        if (this.disposed) {
            return;
        }
        this.mapView.b(bundle);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(k kVar) {
        if (this.disposed) {
            return;
        }
        this.mapView.d();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding.OnSaveInstanceStateListener
    public void onSaveInstanceState(Bundle bundle) {
        if (this.disposed) {
            return;
        }
        this.mapView.e(bundle);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(k kVar) {
        if (this.disposed) {
            return;
        }
        this.mapView.f();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(k kVar) {
        if (this.disposed) {
            return;
        }
        this.mapView.g();
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setBuildingsEnabled(boolean z10) {
        this.buildingsEnabled = z10;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setCameraTargetBounds(LatLngBounds latLngBounds) {
        this.googleMap.r(latLngBounds);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setCompassEnabled(boolean z10) {
        this.googleMap.k().i(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setIndoorEnabled(boolean z10) {
        this.indoorEnabled = z10;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialCircles(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        this.initialCircles = arrayList != null ? new ArrayList(arrayList) : null;
        if (this.googleMap != null) {
            updateInitialCircles();
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialMarkers(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        this.initialMarkers = arrayList != null ? new ArrayList(arrayList) : null;
        if (this.googleMap != null) {
            updateInitialMarkers();
        }
    }

    void setInitialPadding(float f10, float f11, float f12, float f13) {
        List<Float> list = this.initialPadding;
        if (list == null) {
            this.initialPadding = new ArrayList();
        } else {
            list.clear();
        }
        this.initialPadding.add(Float.valueOf(f10));
        this.initialPadding.add(Float.valueOf(f11));
        this.initialPadding.add(Float.valueOf(f12));
        this.initialPadding.add(Float.valueOf(f13));
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialPolygons(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        this.initialPolygons = arrayList != null ? new ArrayList(arrayList) : null;
        if (this.googleMap != null) {
            updateInitialPolygons();
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialPolylines(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        this.initialPolylines = arrayList != null ? new ArrayList(arrayList) : null;
        if (this.googleMap != null) {
            updateInitialPolylines();
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setInitialTileOverlays(List<Map<String, ?>> list) {
        this.initialTileOverlays = list;
        if (this.googleMap != null) {
            updateInitialTileOverlays();
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setLiteModeEnabled(boolean z10) {
        this.options.F1(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setMapToolbarEnabled(boolean z10) {
        this.googleMap.k().j(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setMapType(int i10) {
        this.googleMap.t(i10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setMinMaxZoomPreference(Float f10, Float f11) {
        this.googleMap.o();
        if (f10 != null) {
            this.googleMap.v(f10.floatValue());
        }
        if (f11 != null) {
            this.googleMap.u(f11.floatValue());
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setMyLocationButtonEnabled(boolean z10) {
        if (this.myLocationButtonEnabled == z10) {
            return;
        }
        this.myLocationButtonEnabled = z10;
        if (this.googleMap != null) {
            updateMyLocationSettings();
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setMyLocationEnabled(boolean z10) {
        if (this.myLocationEnabled == z10) {
            return;
        }
        this.myLocationEnabled = z10;
        if (this.googleMap != null) {
            updateMyLocationSettings();
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setPadding(float f10, float f11, float f12, float f13) {
        c cVar = this.googleMap;
        if (cVar == null) {
            setInitialPadding(f10, f11, f12, f13);
        } else {
            float f14 = this.density;
            cVar.I((int) (f11 * f14), (int) (f10 * f14), (int) (f13 * f14), (int) (f12 * f14));
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setRotateGesturesEnabled(boolean z10) {
        this.googleMap.k().l(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setScrollGesturesEnabled(boolean z10) {
        this.googleMap.k().m(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setTiltGesturesEnabled(boolean z10) {
        this.googleMap.k().n(z10);
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setTrackCameraPosition(boolean z10) {
        this.trackCameraPosition = z10;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setTrafficEnabled(boolean z10) {
        this.trafficEnabled = z10;
        c cVar = this.googleMap;
        if (cVar == null) {
            return;
        }
        cVar.J(z10);
    }

    void setView(d dVar) {
        this.mapView = dVar;
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setZoomControlsEnabled(boolean z10) {
        if (this.zoomControlsEnabled == z10) {
            return;
        }
        this.zoomControlsEnabled = z10;
        c cVar = this.googleMap;
        if (cVar != null) {
            cVar.k().o(z10);
        }
    }

    @Override // io.flutter.plugins.googlemaps.GoogleMapOptionsSink
    public void setZoomGesturesEnabled(boolean z10) {
        this.googleMap.k().p(z10);
    }
}
