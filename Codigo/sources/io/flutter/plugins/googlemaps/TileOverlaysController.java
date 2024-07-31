package io.flutter.plugins.googlemaps;

import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sa.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class TileOverlaysController {
    private c googleMap;
    private final MethodChannel methodChannel;
    private final Map<String, TileOverlayController> tileOverlayIdToController = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public TileOverlaysController(MethodChannel methodChannel) {
        this.methodChannel = methodChannel;
    }

    private void addTileOverlay(Map<String, ?> map) {
        if (map == null) {
            return;
        }
        TileOverlayBuilder tileOverlayBuilder = new TileOverlayBuilder();
        String interpretTileOverlayOptions = Convert.interpretTileOverlayOptions(map, tileOverlayBuilder);
        tileOverlayBuilder.setTileProvider(new TileProviderController(this.methodChannel, interpretTileOverlayOptions));
        this.tileOverlayIdToController.put(interpretTileOverlayOptions, new TileOverlayController(this.googleMap.e(tileOverlayBuilder.build())));
    }

    private void changeTileOverlay(Map<String, ?> map) {
        if (map == null) {
            return;
        }
        TileOverlayController tileOverlayController = this.tileOverlayIdToController.get(getTileOverlayId(map));
        if (tileOverlayController != null) {
            Convert.interpretTileOverlayOptions(map, tileOverlayController);
        }
    }

    private static String getTileOverlayId(Map<String, ?> map) {
        return (String) map.get("tileOverlayId");
    }

    private void removeTileOverlay(String str) {
        TileOverlayController tileOverlayController = this.tileOverlayIdToController.get(str);
        if (tileOverlayController != null) {
            tileOverlayController.remove();
            this.tileOverlayIdToController.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addTileOverlays(List<Map<String, ?>> list) {
        if (list == null) {
            return;
        }
        Iterator<Map<String, ?>> it = list.iterator();
        while (it.hasNext()) {
            addTileOverlay(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void changeTileOverlays(List<Map<String, ?>> list) {
        if (list == null) {
            return;
        }
        Iterator<Map<String, ?>> it = list.iterator();
        while (it.hasNext()) {
            changeTileOverlay(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearTileCache(String str) {
        TileOverlayController tileOverlayController;
        if (str == null || (tileOverlayController = this.tileOverlayIdToController.get(str)) == null) {
            return;
        }
        tileOverlayController.clearTileCache();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, Object> getTileOverlayInfo(String str) {
        TileOverlayController tileOverlayController;
        if (str == null || (tileOverlayController = this.tileOverlayIdToController.get(str)) == null) {
            return null;
        }
        return tileOverlayController.getTileOverlayInfo();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeTileOverlays(List<String> list) {
        if (list == null) {
            return;
        }
        for (String str : list) {
            if (str != null) {
                removeTileOverlay(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setGoogleMap(c cVar) {
        this.googleMap = cVar;
    }
}
