package io.flutter.plugins.googlemaps;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ua.a0;
import ua.b;
import ua.c;

/* loaded from: classes3.dex */
class Convert {
    Convert() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object cameraPositionToJson(CameraPosition cameraPosition) {
        if (cameraPosition == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bearing", Float.valueOf(cameraPosition.f9908d));
        hashMap.put("target", latLngToJson(cameraPosition.f9905a));
        hashMap.put("tilt", Float.valueOf(cameraPosition.f9907c));
        hashMap.put("zoom", Float.valueOf(cameraPosition.f9906b));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object circleIdToJson(String str) {
        if (str == null) {
            return null;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("circleId", str);
        return hashMap;
    }

    private static b getBitmapFromBytes(List<?> list) {
        if (list.size() == 2) {
            try {
                return c.d(toBitmap(list.get(1)));
            } catch (Exception e10) {
                throw new IllegalArgumentException("Unable to interpret bytes as a valid image.", e10);
            }
        }
        throw new IllegalArgumentException("fromBytes should have exactly one argument, interpretTileOverlayOptions the bytes. Got: " + list.size());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String interpretCircleOptions(Object obj, CircleOptionsSink circleOptionsSink) {
        Map<?, ?> map = toMap(obj);
        Object obj2 = map.get("consumeTapEvents");
        if (obj2 != null) {
            circleOptionsSink.setConsumeTapEvents(toBoolean(obj2));
        }
        Object obj3 = map.get("fillColor");
        if (obj3 != null) {
            circleOptionsSink.setFillColor(toInt(obj3));
        }
        Object obj4 = map.get("strokeColor");
        if (obj4 != null) {
            circleOptionsSink.setStrokeColor(toInt(obj4));
        }
        Object obj5 = map.get("visible");
        if (obj5 != null) {
            circleOptionsSink.setVisible(toBoolean(obj5));
        }
        if (map.get("strokeWidth") != null) {
            circleOptionsSink.setStrokeWidth(toInt(r0));
        }
        Object obj6 = map.get("zIndex");
        if (obj6 != null) {
            circleOptionsSink.setZIndex(toFloat(obj6));
        }
        Object obj7 = map.get("center");
        if (obj7 != null) {
            circleOptionsSink.setCenter(toLatLng(obj7));
        }
        Object obj8 = map.get("radius");
        if (obj8 != null) {
            circleOptionsSink.setRadius(toDouble(obj8));
        }
        String str = (String) map.get("circleId");
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("circleId was null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void interpretGoogleMapOptions(Object obj, GoogleMapOptionsSink googleMapOptionsSink) {
        Map<?, ?> map = toMap(obj);
        Object obj2 = map.get("cameraTargetBounds");
        if (obj2 != null) {
            googleMapOptionsSink.setCameraTargetBounds(toLatLngBounds(toList(obj2).get(0)));
        }
        Object obj3 = map.get("compassEnabled");
        if (obj3 != null) {
            googleMapOptionsSink.setCompassEnabled(toBoolean(obj3));
        }
        Object obj4 = map.get("mapToolbarEnabled");
        if (obj4 != null) {
            googleMapOptionsSink.setMapToolbarEnabled(toBoolean(obj4));
        }
        Object obj5 = map.get("mapType");
        if (obj5 != null) {
            googleMapOptionsSink.setMapType(toInt(obj5));
        }
        Object obj6 = map.get("minMaxZoomPreference");
        if (obj6 != null) {
            List<?> list = toList(obj6);
            googleMapOptionsSink.setMinMaxZoomPreference(toFloatWrapper(list.get(0)), toFloatWrapper(list.get(1)));
        }
        Object obj7 = map.get("padding");
        if (obj7 != null) {
            List<?> list2 = toList(obj7);
            googleMapOptionsSink.setPadding(toFloat(list2.get(0)), toFloat(list2.get(1)), toFloat(list2.get(2)), toFloat(list2.get(3)));
        }
        Object obj8 = map.get("rotateGesturesEnabled");
        if (obj8 != null) {
            googleMapOptionsSink.setRotateGesturesEnabled(toBoolean(obj8));
        }
        Object obj9 = map.get("scrollGesturesEnabled");
        if (obj9 != null) {
            googleMapOptionsSink.setScrollGesturesEnabled(toBoolean(obj9));
        }
        Object obj10 = map.get("tiltGesturesEnabled");
        if (obj10 != null) {
            googleMapOptionsSink.setTiltGesturesEnabled(toBoolean(obj10));
        }
        Object obj11 = map.get("trackCameraPosition");
        if (obj11 != null) {
            googleMapOptionsSink.setTrackCameraPosition(toBoolean(obj11));
        }
        Object obj12 = map.get("zoomGesturesEnabled");
        if (obj12 != null) {
            googleMapOptionsSink.setZoomGesturesEnabled(toBoolean(obj12));
        }
        Object obj13 = map.get("liteModeEnabled");
        if (obj13 != null) {
            googleMapOptionsSink.setLiteModeEnabled(toBoolean(obj13));
        }
        Object obj14 = map.get("myLocationEnabled");
        if (obj14 != null) {
            googleMapOptionsSink.setMyLocationEnabled(toBoolean(obj14));
        }
        Object obj15 = map.get("zoomControlsEnabled");
        if (obj15 != null) {
            googleMapOptionsSink.setZoomControlsEnabled(toBoolean(obj15));
        }
        Object obj16 = map.get("myLocationButtonEnabled");
        if (obj16 != null) {
            googleMapOptionsSink.setMyLocationButtonEnabled(toBoolean(obj16));
        }
        Object obj17 = map.get("indoorEnabled");
        if (obj17 != null) {
            googleMapOptionsSink.setIndoorEnabled(toBoolean(obj17));
        }
        Object obj18 = map.get("trafficEnabled");
        if (obj18 != null) {
            googleMapOptionsSink.setTrafficEnabled(toBoolean(obj18));
        }
        Object obj19 = map.get("buildingsEnabled");
        if (obj19 != null) {
            googleMapOptionsSink.setBuildingsEnabled(toBoolean(obj19));
        }
    }

    private static void interpretInfoWindowOptions(MarkerOptionsSink markerOptionsSink, Map<String, Object> map) {
        String str = (String) map.get("title");
        String str2 = (String) map.get("snippet");
        if (str != null) {
            markerOptionsSink.setInfoWindowText(str, str2);
        }
        Object obj = map.get("anchor");
        if (obj != null) {
            List<?> list = toList(obj);
            markerOptionsSink.setInfoWindowAnchor(toFloat(list.get(0)), toFloat(list.get(1)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String interpretMarkerOptions(Object obj, MarkerOptionsSink markerOptionsSink) {
        Map<?, ?> map = toMap(obj);
        Object obj2 = map.get("alpha");
        if (obj2 != null) {
            markerOptionsSink.setAlpha(toFloat(obj2));
        }
        Object obj3 = map.get("anchor");
        if (obj3 != null) {
            List<?> list = toList(obj3);
            markerOptionsSink.setAnchor(toFloat(list.get(0)), toFloat(list.get(1)));
        }
        Object obj4 = map.get("consumeTapEvents");
        if (obj4 != null) {
            markerOptionsSink.setConsumeTapEvents(toBoolean(obj4));
        }
        Object obj5 = map.get("draggable");
        if (obj5 != null) {
            markerOptionsSink.setDraggable(toBoolean(obj5));
        }
        Object obj6 = map.get("flat");
        if (obj6 != null) {
            markerOptionsSink.setFlat(toBoolean(obj6));
        }
        Object obj7 = map.get("icon");
        if (obj7 != null) {
            markerOptionsSink.setIcon(toBitmapDescriptor(obj7));
        }
        Object obj8 = map.get("infoWindow");
        if (obj8 != null) {
            interpretInfoWindowOptions(markerOptionsSink, toObjectMap(obj8));
        }
        Object obj9 = map.get("position");
        if (obj9 != null) {
            markerOptionsSink.setPosition(toLatLng(obj9));
        }
        Object obj10 = map.get("rotation");
        if (obj10 != null) {
            markerOptionsSink.setRotation(toFloat(obj10));
        }
        Object obj11 = map.get("visible");
        if (obj11 != null) {
            markerOptionsSink.setVisible(toBoolean(obj11));
        }
        Object obj12 = map.get("zIndex");
        if (obj12 != null) {
            markerOptionsSink.setZIndex(toFloat(obj12));
        }
        String str = (String) map.get("markerId");
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("markerId was null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String interpretPolygonOptions(Object obj, PolygonOptionsSink polygonOptionsSink) {
        Map<?, ?> map = toMap(obj);
        Object obj2 = map.get("consumeTapEvents");
        if (obj2 != null) {
            polygonOptionsSink.setConsumeTapEvents(toBoolean(obj2));
        }
        Object obj3 = map.get("geodesic");
        if (obj3 != null) {
            polygonOptionsSink.setGeodesic(toBoolean(obj3));
        }
        Object obj4 = map.get("visible");
        if (obj4 != null) {
            polygonOptionsSink.setVisible(toBoolean(obj4));
        }
        Object obj5 = map.get("fillColor");
        if (obj5 != null) {
            polygonOptionsSink.setFillColor(toInt(obj5));
        }
        Object obj6 = map.get("strokeColor");
        if (obj6 != null) {
            polygonOptionsSink.setStrokeColor(toInt(obj6));
        }
        if (map.get("strokeWidth") != null) {
            polygonOptionsSink.setStrokeWidth(toInt(r0));
        }
        Object obj7 = map.get("zIndex");
        if (obj7 != null) {
            polygonOptionsSink.setZIndex(toFloat(obj7));
        }
        Object obj8 = map.get("points");
        if (obj8 != null) {
            polygonOptionsSink.setPoints(toPoints(obj8));
        }
        Object obj9 = map.get("holes");
        if (obj9 != null) {
            polygonOptionsSink.setHoles(toHoles(obj9));
        }
        String str = (String) map.get("polygonId");
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("polygonId was null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String interpretPolylineOptions(Object obj, PolylineOptionsSink polylineOptionsSink) {
        Map<?, ?> map = toMap(obj);
        Object obj2 = map.get("consumeTapEvents");
        if (obj2 != null) {
            polylineOptionsSink.setConsumeTapEvents(toBoolean(obj2));
        }
        Object obj3 = map.get("color");
        if (obj3 != null) {
            polylineOptionsSink.setColor(toInt(obj3));
        }
        Object obj4 = map.get("endCap");
        if (obj4 != null) {
            polylineOptionsSink.setEndCap(toCap(obj4));
        }
        Object obj5 = map.get("geodesic");
        if (obj5 != null) {
            polylineOptionsSink.setGeodesic(toBoolean(obj5));
        }
        Object obj6 = map.get("jointType");
        if (obj6 != null) {
            polylineOptionsSink.setJointType(toInt(obj6));
        }
        Object obj7 = map.get("startCap");
        if (obj7 != null) {
            polylineOptionsSink.setStartCap(toCap(obj7));
        }
        Object obj8 = map.get("visible");
        if (obj8 != null) {
            polylineOptionsSink.setVisible(toBoolean(obj8));
        }
        if (map.get("width") != null) {
            polylineOptionsSink.setWidth(toInt(r0));
        }
        Object obj9 = map.get("zIndex");
        if (obj9 != null) {
            polylineOptionsSink.setZIndex(toFloat(obj9));
        }
        Object obj10 = map.get("points");
        if (obj10 != null) {
            polylineOptionsSink.setPoints(toPoints(obj10));
        }
        Object obj11 = map.get("pattern");
        if (obj11 != null) {
            polylineOptionsSink.setPattern(toPattern(obj11));
        }
        String str = (String) map.get("polylineId");
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("polylineId was null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a0 interpretTile(Map<String, ?> map) {
        return new a0(toInt(map.get("width")), toInt(map.get("height")), map.get("data") != null ? (byte[]) map.get("data") : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String interpretTileOverlayOptions(Map<String, ?> map, TileOverlaySink tileOverlaySink) {
        Object obj = map.get("fadeIn");
        if (obj != null) {
            tileOverlaySink.setFadeIn(toBoolean(obj));
        }
        Object obj2 = map.get("transparency");
        if (obj2 != null) {
            tileOverlaySink.setTransparency(toFloat(obj2));
        }
        Object obj3 = map.get("zIndex");
        if (obj3 != null) {
            tileOverlaySink.setZIndex(toFloat(obj3));
        }
        Object obj4 = map.get("visible");
        if (obj4 != null) {
            tileOverlaySink.setVisible(toBoolean(obj4));
        }
        String str = (String) map.get("tileOverlayId");
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("tileOverlayId was null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object latLngToJson(LatLng latLng) {
        return Arrays.asList(Double.valueOf(latLng.f9913a), Double.valueOf(latLng.f9914b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object latlngBoundsToJson(LatLngBounds latLngBounds) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("southwest", latLngToJson(latLngBounds.f9915a));
        hashMap.put("northeast", latLngToJson(latLngBounds.f9916b));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object markerIdToJson(String str) {
        if (str == null) {
            return null;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("markerId", str);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Integer> pointToJson(Point point) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("x", Integer.valueOf(point.x));
        hashMap.put("y", Integer.valueOf(point.y));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object polygonIdToJson(String str) {
        if (str == null) {
            return null;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("polygonId", str);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object polylineIdToJson(String str) {
        if (str == null) {
            return null;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("polylineId", str);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> tileOverlayArgumentsToJson(String str, int i10, int i11, int i12) {
        if (str == null) {
            return null;
        }
        HashMap hashMap = new HashMap(4);
        hashMap.put("tileOverlayId", str);
        hashMap.put("x", Integer.valueOf(i10));
        hashMap.put("y", Integer.valueOf(i11));
        hashMap.put("zoom", Integer.valueOf(i12));
        return hashMap;
    }

    private static Bitmap toBitmap(Object obj) {
        byte[] bArr = (byte[]) obj;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        if (decodeByteArray != null) {
            return decodeByteArray;
        }
        throw new IllegalArgumentException("Unable to decode bytes as a valid bitmap.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0044, code lost:
    
        if (r2.equals("fromAssetImage") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static ua.b toBitmapDescriptor(java.lang.Object r8) {
        /*
            java.util.List r0 = toList(r8)
            r1 = 0
            java.lang.Object r2 = r0.get(r1)
            java.lang.String r2 = toString(r2)
            r2.hashCode()
            int r3 = r2.hashCode()
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = -1
            switch(r3) {
                case -458749035: goto L3e;
                case 52960614: goto L33;
                case 54063841: goto L28;
                case 784458203: goto L1d;
                default: goto L1b;
            }
        L1b:
            r1 = r7
            goto L47
        L1d:
            java.lang.String r1 = "defaultMarker"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L26
            goto L1b
        L26:
            r1 = r4
            goto L47
        L28:
            java.lang.String r1 = "fromBytes"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L31
            goto L1b
        L31:
            r1 = r5
            goto L47
        L33:
            java.lang.String r1 = "fromAsset"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L3c
            goto L1b
        L3c:
            r1 = r6
            goto L47
        L3e:
            java.lang.String r3 = "fromAssetImage"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L47
            goto L1b
        L47:
            switch(r1) {
                case 0: goto Lb3;
                case 1: goto L83;
                case 2: goto L7e;
                case 3: goto L66;
                default: goto L4a;
            }
        L4a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot interpret "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = " as BitmapDescriptor"
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L66:
            int r8 = r0.size()
            if (r8 != r6) goto L71
            ua.b r8 = ua.c.a()
            return r8
        L71:
            java.lang.Object r8 = r0.get(r6)
            float r8 = toFloat(r8)
            ua.b r8 = ua.c.b(r8)
            return r8
        L7e:
            ua.b r8 = getBitmapFromBytes(r0)
            return r8
        L83:
            int r8 = r0.size()
            if (r8 != r5) goto L9a
            java.lang.Object r8 = r0.get(r6)
            java.lang.String r8 = toString(r8)
            java.lang.String r8 = io.flutter.view.FlutterMain.getLookupKeyForAsset(r8)
            ua.b r8 = ua.c.c(r8)
            return r8
        L9a:
            java.lang.Object r8 = r0.get(r6)
            java.lang.String r8 = toString(r8)
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = toString(r0)
            java.lang.String r8 = io.flutter.view.FlutterMain.getLookupKeyForAsset(r8, r0)
            ua.b r8 = ua.c.c(r8)
            return r8
        Lb3:
            int r8 = r0.size()
            if (r8 != r4) goto Lca
            java.lang.Object r8 = r0.get(r6)
            java.lang.String r8 = toString(r8)
            java.lang.String r8 = io.flutter.view.FlutterMain.getLookupKeyForAsset(r8)
            ua.b r8 = ua.c.c(r8)
            return r8
        Lca:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "'fromAssetImage' Expected exactly 3 arguments, got: "
            r1.append(r2)
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.googlemaps.Convert.toBitmapDescriptor(java.lang.Object):ua.b");
    }

    private static boolean toBoolean(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CameraPosition toCameraPosition(Object obj) {
        Map<?, ?> map = toMap(obj);
        CameraPosition.a u12 = CameraPosition.u1();
        u12.a(toFloat(map.get("bearing")));
        u12.c(toLatLng(map.get("target")));
        u12.d(toFloat(map.get("tilt")));
        u12.e(toFloat(map.get("zoom")));
        return u12.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x007d, code lost:
    
        if (r2.equals("newLatLng") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static sa.a toCameraUpdate(java.lang.Object r7, float r8) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.googlemaps.Convert.toCameraUpdate(java.lang.Object, float):sa.a");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0043, code lost:
    
        if (r2.equals("roundCap") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static ua.e toCap(java.lang.Object r7) {
        /*
            java.util.List r0 = toList(r7)
            r1 = 0
            java.lang.Object r2 = r0.get(r1)
            java.lang.String r2 = toString(r2)
            r2.hashCode()
            int r3 = r2.hashCode()
            r4 = 2
            r5 = 1
            r6 = -1
            switch(r3) {
                case -179356: goto L3d;
                case 241309887: goto L32;
                case 1314340213: goto L27;
                case 1611528865: goto L1c;
                default: goto L1a;
            }
        L1a:
            r1 = r6
            goto L46
        L1c:
            java.lang.String r1 = "customCap"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L25
            goto L1a
        L25:
            r1 = 3
            goto L46
        L27:
            java.lang.String r1 = "squareCap"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L30
            goto L1a
        L30:
            r1 = r4
            goto L46
        L32:
            java.lang.String r1 = "buttCap"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L3b
            goto L1a
        L3b:
            r1 = r5
            goto L46
        L3d:
            java.lang.String r3 = "roundCap"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L46
            goto L1a
        L46:
            switch(r1) {
                case 0: goto L9b;
                case 1: goto L95;
                case 2: goto L8f;
                case 3: goto L65;
                default: goto L49;
            }
        L49:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot interpret "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = " as Cap"
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L65:
            int r7 = r0.size()
            if (r7 != r4) goto L79
            ua.h r7 = new ua.h
            java.lang.Object r0 = r0.get(r5)
            ua.b r0 = toBitmapDescriptor(r0)
            r7.<init>(r0)
            return r7
        L79:
            ua.h r7 = new ua.h
            java.lang.Object r1 = r0.get(r5)
            ua.b r1 = toBitmapDescriptor(r1)
            java.lang.Object r0 = r0.get(r4)
            float r0 = toFloat(r0)
            r7.<init>(r1, r0)
            return r7
        L8f:
            ua.w r7 = new ua.w
            r7.<init>()
            return r7
        L95:
            ua.d r7 = new ua.d
            r7.<init>()
            return r7
        L9b:
            ua.u r7 = new ua.u
            r7.<init>()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.googlemaps.Convert.toCap(java.lang.Object):ua.e");
    }

    private static double toDouble(Object obj) {
        return ((Number) obj).doubleValue();
    }

    private static float toFloat(Object obj) {
        return ((Number) obj).floatValue();
    }

    private static Float toFloatWrapper(Object obj) {
        if (obj == null) {
            return null;
        }
        return Float.valueOf(toFloat(obj));
    }

    private static float toFractionalPixels(Object obj, float f10) {
        return toFloat(obj) * f10;
    }

    private static List<List<LatLng>> toHoles(Object obj) {
        List<?> list = toList(obj);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toPoints(it.next()));
        }
        return arrayList;
    }

    private static int toInt(Object obj) {
        return ((Number) obj).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static LatLng toLatLng(Object obj) {
        List<?> list = toList(obj);
        return new LatLng(toDouble(list.get(0)), toDouble(list.get(1)));
    }

    private static LatLngBounds toLatLngBounds(Object obj) {
        if (obj == null) {
            return null;
        }
        List<?> list = toList(obj);
        return new LatLngBounds(toLatLng(list.get(0)), toLatLng(list.get(1)));
    }

    private static List<?> toList(Object obj) {
        return (List) obj;
    }

    private static Map<?, ?> toMap(Object obj) {
        return (Map) obj;
    }

    private static Map<String, Object> toObjectMap(Object obj) {
        HashMap hashMap = new HashMap();
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            Object obj3 = map.get(obj2);
            if (obj3 != null) {
                hashMap.put((String) obj2, obj3);
            }
        }
        return hashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r3.equals("dot") == false) goto L11;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x005d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0039. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<ua.o> toPattern(java.lang.Object r7) {
        /*
            java.util.List r7 = toList(r7)
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto Lc
            r7 = 0
            return r7
        Lc:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.size()
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L19:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto La5
            java.lang.Object r1 = r7.next()
            java.util.List r1 = toList(r1)
            r2 = 0
            java.lang.Object r3 = r1.get(r2)
            java.lang.String r3 = toString(r3)
            r3.hashCode()
            int r4 = r3.hashCode()
            r5 = 1
            r6 = -1
            switch(r4) {
                case 99657: goto L54;
                case 102102: goto L49;
                case 3075986: goto L3e;
                default: goto L3c;
            }
        L3c:
            r2 = r6
            goto L5d
        L3e:
            java.lang.String r2 = "dash"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L47
            goto L3c
        L47:
            r2 = 2
            goto L5d
        L49:
            java.lang.String r2 = "gap"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L52
            goto L3c
        L52:
            r2 = r5
            goto L5d
        L54:
            java.lang.String r4 = "dot"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L5d
            goto L3c
        L5d:
            switch(r2) {
                case 0: goto L9b;
                case 1: goto L8d;
                case 2: goto L7c;
                default: goto L60;
            }
        L60:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot interpret "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " as PatternItem"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.<init>(r0)
            throw r7
        L7c:
            ua.i r2 = new ua.i
            java.lang.Object r1 = r1.get(r5)
            float r1 = toFloat(r1)
            r2.<init>(r1)
        L89:
            r0.add(r2)
            goto L19
        L8d:
            ua.k r2 = new ua.k
            java.lang.Object r1 = r1.get(r5)
            float r1 = toFloat(r1)
            r2.<init>(r1)
            goto L89
        L9b:
            ua.j r1 = new ua.j
            r1.<init>()
            r0.add(r1)
            goto L19
        La5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.googlemaps.Convert.toPattern(java.lang.Object):java.util.List");
    }

    private static int toPixels(Object obj, float f10) {
        return (int) toFractionalPixels(obj, f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Point toPoint(Object obj) {
        return new Point(((Integer) toMap(obj).get("x")).intValue(), ((Integer) toMap(obj).get("y")).intValue());
    }

    private static Point toPoint(Object obj, float f10) {
        List<?> list = toList(obj);
        return new Point(toPixels(list.get(0), f10), toPixels(list.get(1), f10));
    }

    static List<LatLng> toPoints(Object obj) {
        List<?> list = toList(obj);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            List<?> list2 = toList(it.next());
            arrayList.add(new LatLng(toDouble(list2.get(0)), toDouble(list2.get(1))));
        }
        return arrayList;
    }

    private static String toString(Object obj) {
        return (String) obj;
    }
}
