.class Lio/flutter/plugins/googlemaps/MarkerController;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/googlemaps/MarkerOptionsSink;


# instance fields
.field private consumeTapEvents:Z

.field private final googleMapsMarkerId:Ljava/lang/String;

.field private final marker:Lua/m;


# direct methods
.method constructor <init>(Lua/m;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/MarkerController;->marker:Lua/m;

    iput-boolean p2, p0, Lio/flutter/plugins/googlemaps/MarkerController;->consumeTapEvents:Z

    invoke-virtual {p1}, Lua/m;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/MarkerController;->googleMapsMarkerId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method consumeTapEvents()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->consumeTapEvents:Z

    return v0
.end method

.method getGoogleMapsMarkerId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->googleMapsMarkerId:Ljava/lang/String;

    return-object v0
.end method

.method public hideInfoWindow()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->marker:Lua/m;

    invoke-virtual {v0}, Lua/m;->c()V

    return-void
.end method

.method public isInfoWindowShown()Z
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->marker:Lua/m;

    invoke-virtual {v0}, Lua/m;->d()Z

    move-result v0

    return v0
.end method

.method remove()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->marker:Lua/m;

    invoke-virtual {v0}, Lua/m;->e()V

    return-void
.end method

.method public setAlpha(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->marker:Lua/m;

    invoke-virtual {v0, p1}, Lua/m;->f(F)V

    return-void
.end method

.method public setAnchor(FF)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->marker:Lua/m;

    invoke-virtual {v0, p1, p2}, Lua/m;->g(FF)V

    return-void
.end method

.method public setConsumeTapEvents(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/MarkerController;->consumeTapEvents:Z

    return-void
.end method

.method public setDraggable(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->marker:Lua/m;

    invoke-virtual {v0, p1}, Lua/m;->h(Z)V

    return-void
.end method

.method public setFlat(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->marker:Lua/m;

    invoke-virtual {v0, p1}, Lua/m;->i(Z)V

    return-void
.end method

.method public setIcon(Lua/b;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->marker:Lua/m;

    invoke-virtual {v0, p1}, Lua/m;->j(Lua/b;)V

    return-void
.end method

.method public setInfoWindowAnchor(FF)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->marker:Lua/m;

    invoke-virtual {v0, p1, p2}, Lua/m;->k(FF)V

    return-void
.end method

.method public setInfoWindowText(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->marker:Lua/m;

    invoke-virtual {v0, p1}, Lua/m;->o(Ljava/lang/String;)V

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/MarkerController;->marker:Lua/m;

    invoke-virtual {p1, p2}, Lua/m;->n(Ljava/lang/String;)V

    return-void
.end method

.method public setPosition(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->marker:Lua/m;

    invoke-virtual {v0, p1}, Lua/m;->l(Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method

.method public setRotation(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->marker:Lua/m;

    invoke-virtual {v0, p1}, Lua/m;->m(F)V

    return-void
.end method

.method public setVisible(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->marker:Lua/m;

    invoke-virtual {v0, p1}, Lua/m;->p(Z)V

    return-void
.end method

.method public setZIndex(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->marker:Lua/m;

    invoke-virtual {v0, p1}, Lua/m;->q(F)V

    return-void
.end method

.method public showInfoWindow()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/MarkerController;->marker:Lua/m;

    invoke-virtual {v0}, Lua/m;->r()V

    return-void
.end method
