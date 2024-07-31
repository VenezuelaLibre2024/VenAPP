package io.flutter.plugins.googlemaps;

import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sa.c;
import ua.s;
import ua.t;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class PolylinesController {
    private final float density;
    private c googleMap;
    private final MethodChannel methodChannel;
    private final Map<String, PolylineController> polylineIdToController = new HashMap();
    private final Map<String, String> googleMapsPolylineIdToDartPolylineId = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public PolylinesController(MethodChannel methodChannel, float f10) {
        this.methodChannel = methodChannel;
        this.density = f10;
    }

    private void addPolyline(Object obj) {
        if (obj == null) {
            return;
        }
        PolylineBuilder polylineBuilder = new PolylineBuilder(this.density);
        addPolyline(Convert.interpretPolylineOptions(obj, polylineBuilder), polylineBuilder.build(), polylineBuilder.consumeTapEvents());
    }

    private void addPolyline(String str, t tVar, boolean z10) {
        s d10 = this.googleMap.d(tVar);
        this.polylineIdToController.put(str, new PolylineController(d10, z10, this.density));
        this.googleMapsPolylineIdToDartPolylineId.put(d10.a(), str);
    }

    private void changePolyline(Object obj) {
        if (obj == null) {
            return;
        }
        PolylineController polylineController = this.polylineIdToController.get(getPolylineId(obj));
        if (polylineController != null) {
            Convert.interpretPolylineOptions(obj, polylineController);
        }
    }

    private static String getPolylineId(Object obj) {
        return (String) ((Map) obj).get("polylineId");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addPolylines(List<Object> list) {
        if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                addPolyline(it.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void changePolylines(List<Object> list) {
        if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                changePolyline(it.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean onPolylineTap(String str) {
        String str2 = this.googleMapsPolylineIdToDartPolylineId.get(str);
        if (str2 == null) {
            return false;
        }
        this.methodChannel.invokeMethod("polyline#onTap", Convert.polylineIdToJson(str2));
        PolylineController polylineController = this.polylineIdToController.get(str2);
        if (polylineController != null) {
            return polylineController.consumeTapEvents();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removePolylines(List<Object> list) {
        if (list == null) {
            return;
        }
        for (Object obj : list) {
            if (obj != null) {
                PolylineController remove = this.polylineIdToController.remove((String) obj);
                if (remove != null) {
                    remove.remove();
                    this.googleMapsPolylineIdToDartPolylineId.remove(remove.getGoogleMapsPolylineId());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setGoogleMap(c cVar) {
        this.googleMap = cVar;
    }
}
