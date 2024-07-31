package io.flutter.plugins.googlemaps;

import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sa.c;
import ua.f;
import ua.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class CirclesController {
    private final float density;
    private c googleMap;
    private final MethodChannel methodChannel;
    private final Map<String, CircleController> circleIdToController = new HashMap();
    private final Map<String, String> googleMapsCircleIdToDartCircleId = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public CirclesController(MethodChannel methodChannel, float f10) {
        this.methodChannel = methodChannel;
        this.density = f10;
    }

    private void addCircle(Object obj) {
        if (obj == null) {
            return;
        }
        CircleBuilder circleBuilder = new CircleBuilder(this.density);
        addCircle(Convert.interpretCircleOptions(obj, circleBuilder), circleBuilder.build(), circleBuilder.consumeTapEvents());
    }

    private void addCircle(String str, g gVar, boolean z10) {
        f a10 = this.googleMap.a(gVar);
        this.circleIdToController.put(str, new CircleController(a10, z10, this.density));
        this.googleMapsCircleIdToDartCircleId.put(a10.a(), str);
    }

    private void changeCircle(Object obj) {
        if (obj == null) {
            return;
        }
        CircleController circleController = this.circleIdToController.get(getCircleId(obj));
        if (circleController != null) {
            Convert.interpretCircleOptions(obj, circleController);
        }
    }

    private static String getCircleId(Object obj) {
        return (String) ((Map) obj).get("circleId");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addCircles(List<Object> list) {
        if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                addCircle(it.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void changeCircles(List<Object> list) {
        if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                changeCircle(it.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean onCircleTap(String str) {
        String str2 = this.googleMapsCircleIdToDartCircleId.get(str);
        if (str2 == null) {
            return false;
        }
        this.methodChannel.invokeMethod("circle#onTap", Convert.circleIdToJson(str2));
        CircleController circleController = this.circleIdToController.get(str2);
        if (circleController != null) {
            return circleController.consumeTapEvents();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeCircles(List<Object> list) {
        if (list == null) {
            return;
        }
        for (Object obj : list) {
            if (obj != null) {
                CircleController remove = this.circleIdToController.remove((String) obj);
                if (remove != null) {
                    remove.remove();
                    this.googleMapsCircleIdToDartCircleId.remove(remove.getGoogleMapsCircleId());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setGoogleMap(c cVar) {
        this.googleMap = cVar;
    }
}
