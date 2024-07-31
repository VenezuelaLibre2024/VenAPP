.class Lio/flutter/plugins/googlemaps/MarkerBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/googlemaps/MarkerOptionsSink;


# instance fields
.field private consumeTapEvents:Z

.field private final markerOptions:Lua/n;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lua/n;

    invoke-direct {v0}, Lua/n;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lua/n;

    return-void
.end method


# virtual methods
.method build()Lua/n;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lua/n;

    return-object v0
.end method

.method consumeTapEvents()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->consumeTapEvents:Z

    return v0
.end method

.method public setAlpha(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lua/n;

    invoke-virtual {v0, p1}, Lua/n;->u1(F)Lua/n;

    return-void
.end method

.method public setAnchor(FF)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lua/n;

    invoke-virtual {v0, p1, p2}, Lua/n;->v1(FF)Lua/n;

    return-void
.end method

.method public setConsumeTapEvents(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->consumeTapEvents:Z

    return-void
.end method

.method public setDraggable(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lua/n;

    invoke-virtual {v0, p1}, Lua/n;->w1(Z)Lua/n;

    return-void
.end method

.method public setFlat(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lua/n;

    invoke-virtual {v0, p1}, Lua/n;->x1(Z)Lua/n;

    return-void
.end method

.method public setIcon(Lua/b;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lua/n;

    invoke-virtual {v0, p1}, Lua/n;->I1(Lua/b;)Lua/n;

    return-void
.end method

.method public setInfoWindowAnchor(FF)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lua/n;

    invoke-virtual {v0, p1, p2}, Lua/n;->J1(FF)Lua/n;

    return-void
.end method

.method public setInfoWindowText(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lua/n;

    invoke-virtual {v0, p1}, Lua/n;->Q1(Ljava/lang/String;)Lua/n;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lua/n;

    invoke-virtual {p1, p2}, Lua/n;->P1(Ljava/lang/String;)Lua/n;

    return-void
.end method

.method public setPosition(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lua/n;

    invoke-virtual {v0, p1}, Lua/n;->N1(Lcom/google/android/gms/maps/model/LatLng;)Lua/n;

    return-void
.end method

.method public setRotation(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lua/n;

    invoke-virtual {v0, p1}, Lua/n;->O1(F)Lua/n;

    return-void
.end method

.method public setVisible(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lua/n;

    invoke-virtual {v0, p1}, Lua/n;->R1(Z)Lua/n;

    return-void
.end method

.method public setZIndex(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerBuilder;->markerOptions:Lua/n;

    invoke-virtual {v0, p1}, Lua/n;->S1(F)Lua/n;

    return-void
.end method
