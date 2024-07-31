package io.flutter.plugins.googlemaps;

import android.content.Context;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class GoogleMapFactory extends PlatformViewFactory {
    private final BinaryMessenger binaryMessenger;
    private final GoogleMapInitializer googleMapInitializer;
    private final LifecycleProvider lifecycleProvider;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleMapFactory(BinaryMessenger binaryMessenger, Context context, LifecycleProvider lifecycleProvider) {
        super(StandardMessageCodec.INSTANCE);
        this.binaryMessenger = binaryMessenger;
        this.lifecycleProvider = lifecycleProvider;
        this.googleMapInitializer = new GoogleMapInitializer(context, binaryMessenger);
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public PlatformView create(Context context, int i10, Object obj) {
        Map map = (Map) obj;
        GoogleMapBuilder googleMapBuilder = new GoogleMapBuilder();
        Object obj2 = map.get("options");
        Convert.interpretGoogleMapOptions(obj2, googleMapBuilder);
        if (map.containsKey("initialCameraPosition")) {
            googleMapBuilder.setInitialCameraPosition(Convert.toCameraPosition(map.get("initialCameraPosition")));
        }
        if (map.containsKey("markersToAdd")) {
            googleMapBuilder.setInitialMarkers(map.get("markersToAdd"));
        }
        if (map.containsKey("polygonsToAdd")) {
            googleMapBuilder.setInitialPolygons(map.get("polygonsToAdd"));
        }
        if (map.containsKey("polylinesToAdd")) {
            googleMapBuilder.setInitialPolylines(map.get("polylinesToAdd"));
        }
        if (map.containsKey("circlesToAdd")) {
            googleMapBuilder.setInitialCircles(map.get("circlesToAdd"));
        }
        if (map.containsKey("tileOverlaysToAdd")) {
            googleMapBuilder.setInitialTileOverlays((List) map.get("tileOverlaysToAdd"));
        }
        Object obj3 = ((Map) obj2).get("cloudMapId");
        if (obj3 != null) {
            googleMapBuilder.setMapId((String) obj3);
        }
        return googleMapBuilder.build(i10, context, this.binaryMessenger, this.lifecycleProvider);
    }
}
