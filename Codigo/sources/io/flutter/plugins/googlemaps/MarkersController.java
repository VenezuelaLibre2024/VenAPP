package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sa.c;
import ua.m;
import ua.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class MarkersController {
    private c googleMap;
    private final MethodChannel methodChannel;
    private final Map<String, MarkerController> markerIdToController = new HashMap();
    private final Map<String, String> googleMapsMarkerIdToDartMarkerId = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public MarkersController(MethodChannel methodChannel) {
        this.methodChannel = methodChannel;
    }

    private void addMarker(Object obj) {
        if (obj == null) {
            return;
        }
        MarkerBuilder markerBuilder = new MarkerBuilder();
        addMarker(Convert.interpretMarkerOptions(obj, markerBuilder), markerBuilder.build(), markerBuilder.consumeTapEvents());
    }

    private void addMarker(String str, n nVar, boolean z10) {
        m b10 = this.googleMap.b(nVar);
        this.markerIdToController.put(str, new MarkerController(b10, z10));
        this.googleMapsMarkerIdToDartMarkerId.put(b10.a(), str);
    }

    private void changeMarker(Object obj) {
        if (obj == null) {
            return;
        }
        MarkerController markerController = this.markerIdToController.get(getMarkerId(obj));
        if (markerController != null) {
            Convert.interpretMarkerOptions(obj, markerController);
        }
    }

    private static String getMarkerId(Object obj) {
        return (String) ((Map) obj).get("markerId");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addMarkers(List<Object> list) {
        if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                addMarker(it.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void changeMarkers(List<Object> list) {
        if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                changeMarker(it.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void hideMarkerInfoWindow(String str, MethodChannel.Result result) {
        MarkerController markerController = this.markerIdToController.get(str);
        if (markerController == null) {
            result.error("Invalid markerId", "hideInfoWindow called with invalid markerId", null);
        } else {
            markerController.hideInfoWindow();
            result.success(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void isInfoWindowShown(String str, MethodChannel.Result result) {
        MarkerController markerController = this.markerIdToController.get(str);
        if (markerController != null) {
            result.success(Boolean.valueOf(markerController.isInfoWindowShown()));
        } else {
            result.error("Invalid markerId", "isInfoWindowShown called with invalid markerId", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onInfoWindowTap(String str) {
        String str2 = this.googleMapsMarkerIdToDartMarkerId.get(str);
        if (str2 == null) {
            return;
        }
        this.methodChannel.invokeMethod("infoWindow#onTap", Convert.markerIdToJson(str2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onMarkerDrag(String str, LatLng latLng) {
        String str2 = this.googleMapsMarkerIdToDartMarkerId.get(str);
        if (str2 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("markerId", str2);
        hashMap.put("position", Convert.latLngToJson(latLng));
        this.methodChannel.invokeMethod("marker#onDrag", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onMarkerDragEnd(String str, LatLng latLng) {
        String str2 = this.googleMapsMarkerIdToDartMarkerId.get(str);
        if (str2 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("markerId", str2);
        hashMap.put("position", Convert.latLngToJson(latLng));
        this.methodChannel.invokeMethod("marker#onDragEnd", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onMarkerDragStart(String str, LatLng latLng) {
        String str2 = this.googleMapsMarkerIdToDartMarkerId.get(str);
        if (str2 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("markerId", str2);
        hashMap.put("position", Convert.latLngToJson(latLng));
        this.methodChannel.invokeMethod("marker#onDragStart", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean onMarkerTap(String str) {
        String str2 = this.googleMapsMarkerIdToDartMarkerId.get(str);
        if (str2 == null) {
            return false;
        }
        this.methodChannel.invokeMethod("marker#onTap", Convert.markerIdToJson(str2));
        MarkerController markerController = this.markerIdToController.get(str2);
        if (markerController != null) {
            return markerController.consumeTapEvents();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeMarkers(List<Object> list) {
        if (list == null) {
            return;
        }
        for (Object obj : list) {
            if (obj != null) {
                MarkerController remove = this.markerIdToController.remove((String) obj);
                if (remove != null) {
                    remove.remove();
                    this.googleMapsMarkerIdToDartMarkerId.remove(remove.getGoogleMapsMarkerId());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setGoogleMap(c cVar) {
        this.googleMap = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void showMarkerInfoWindow(String str, MethodChannel.Result result) {
        MarkerController markerController = this.markerIdToController.get(str);
        if (markerController == null) {
            result.error("Invalid markerId", "showInfoWindow called with invalid markerId", null);
        } else {
            markerController.showInfoWindow();
            result.success(null);
        }
    }
}
