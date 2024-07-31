.class Lio/flutter/plugins/googlemaps/MarkersController;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private googleMap:Lsa/c;

.field private final googleMapsMarkerIdToDartMarkerId:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final markerIdToController:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/googlemaps/MarkerController;",
            ">;"
        }
    .end annotation
.end field

.field private final methodChannel:Lio/flutter/plugin/common/MethodChannel;


# direct methods
.method constructor <init>(Lio/flutter/plugin/common/MethodChannel;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->markerIdToController:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->googleMapsMarkerIdToDartMarkerId:Ljava/util/Map;

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/MarkersController;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    return-void
.end method

.method private addMarker(Ljava/lang/Object;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Lio/flutter/plugins/googlemaps/MarkerBuilder;

    invoke-direct {v0}, Lio/flutter/plugins/googlemaps/MarkerBuilder;-><init>()V

    invoke-static {p1, v0}, Lio/flutter/plugins/googlemaps/Convert;->interpretMarkerOptions(Ljava/lang/Object;Lio/flutter/plugins/googlemaps/MarkerOptionsSink;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Lio/flutter/plugins/googlemaps/MarkerBuilder;->build()Lua/n;

    move-result-object v1

    invoke-virtual {v0}, Lio/flutter/plugins/googlemaps/MarkerBuilder;->consumeTapEvents()Z

    move-result v0

    invoke-direct {p0, p1, v1, v0}, Lio/flutter/plugins/googlemaps/MarkersController;->addMarker(Ljava/lang/String;Lua/n;Z)V

    return-void
.end method

.method private addMarker(Ljava/lang/String;Lua/n;Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->googleMap:Lsa/c;

    invoke-virtual {v0, p2}, Lsa/c;->b(Lua/n;)Lua/m;

    move-result-object p2

    new-instance v0, Lio/flutter/plugins/googlemaps/MarkerController;

    invoke-direct {v0, p2, p3}, Lio/flutter/plugins/googlemaps/MarkerController;-><init>(Lua/m;Z)V

    iget-object p3, p0, Lio/flutter/plugins/googlemaps/MarkersController;->markerIdToController:Ljava/util/Map;

    invoke-interface {p3, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p3, p0, Lio/flutter/plugins/googlemaps/MarkersController;->googleMapsMarkerIdToDartMarkerId:Ljava/util/Map;

    invoke-virtual {p2}, Lua/m;->a()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p3, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private changeMarker(Ljava/lang/Object;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, Lio/flutter/plugins/googlemaps/MarkersController;->getMarkerId(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/MarkersController;->markerIdToController:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugins/googlemaps/MarkerController;

    if-eqz v0, :cond_1

    invoke-static {p1, v0}, Lio/flutter/plugins/googlemaps/Convert;->interpretMarkerOptions(Ljava/lang/Object;Lio/flutter/plugins/googlemaps/MarkerOptionsSink;)Ljava/lang/String;

    :cond_1
    return-void
.end method

.method private static getMarkerId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    check-cast p0, Ljava/util/Map;

    const-string v0, "markerId"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method addMarkers(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/flutter/plugins/googlemaps/MarkersController;->addMarker(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method changeMarkers(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/flutter/plugins/googlemaps/MarkersController;->changeMarker(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method hideMarkerInfoWindow(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->markerIdToController:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/flutter/plugins/googlemaps/MarkerController;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/flutter/plugins/googlemaps/MarkerController;->hideInfoWindow()V

    invoke-interface {p2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const-string p1, "Invalid markerId"

    const-string v1, "hideInfoWindow called with invalid markerId"

    invoke-interface {p2, p1, v1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method isInfoWindowShown(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->markerIdToController:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/flutter/plugins/googlemaps/MarkerController;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/flutter/plugins/googlemaps/MarkerController;->isInfoWindowShown()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const-string p1, "isInfoWindowShown called with invalid markerId"

    const/4 v0, 0x0

    const-string v1, "Invalid markerId"

    invoke-interface {p2, v1, p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method onInfoWindowTap(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->googleMapsMarkerIdToDartMarkerId:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    const-string v1, "infoWindow#onTap"

    invoke-static {p1}, Lio/flutter/plugins/googlemaps/Convert;->markerIdToJson(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method onMarkerDrag(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->googleMapsMarkerIdToDartMarkerId:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "markerId"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "position"

    invoke-static {p2}, Lio/flutter/plugins/googlemaps/Convert;->latLngToJson(Lcom/google/android/gms/maps/model/LatLng;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/MarkersController;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    const-string p2, "marker#onDrag"

    invoke-virtual {p1, p2, v0}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method onMarkerDragEnd(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->googleMapsMarkerIdToDartMarkerId:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "markerId"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "position"

    invoke-static {p2}, Lio/flutter/plugins/googlemaps/Convert;->latLngToJson(Lcom/google/android/gms/maps/model/LatLng;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/MarkersController;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    const-string p2, "marker#onDragEnd"

    invoke-virtual {p1, p2, v0}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method onMarkerDragStart(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->googleMapsMarkerIdToDartMarkerId:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "markerId"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "position"

    invoke-static {p2}, Lio/flutter/plugins/googlemaps/Convert;->latLngToJson(Lcom/google/android/gms/maps/model/LatLng;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/MarkersController;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    const-string p2, "marker#onDragStart"

    invoke-virtual {p1, p2, v0}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method onMarkerTap(Ljava/lang/String;)Z
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->googleMapsMarkerIdToDartMarkerId:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lio/flutter/plugins/googlemaps/MarkersController;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    const-string v2, "marker#onTap"

    invoke-static {p1}, Lio/flutter/plugins/googlemaps/Convert;->markerIdToJson(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/MarkersController;->markerIdToController:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/flutter/plugins/googlemaps/MarkerController;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lio/flutter/plugins/googlemaps/MarkerController;->consumeTapEvents()Z

    move-result p1

    return p1

    :cond_1
    return v0
.end method

.method removeMarkers(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/MarkersController;->markerIdToController:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugins/googlemaps/MarkerController;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/flutter/plugins/googlemaps/MarkerController;->remove()V

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/MarkersController;->googleMapsMarkerIdToDartMarkerId:Ljava/util/Map;

    invoke-virtual {v0}, Lio/flutter/plugins/googlemaps/MarkerController;->getGoogleMapsMarkerId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    return-void
.end method

.method setGoogleMap(Lsa/c;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/MarkersController;->googleMap:Lsa/c;

    return-void
.end method

.method showMarkerInfoWindow(Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkersController;->markerIdToController:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/flutter/plugins/googlemaps/MarkerController;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/flutter/plugins/googlemaps/MarkerController;->showInfoWindow()V

    invoke-interface {p2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const-string p1, "Invalid markerId"

    const-string v1, "showInfoWindow called with invalid markerId"

    invoke-interface {p2, p1, v1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
