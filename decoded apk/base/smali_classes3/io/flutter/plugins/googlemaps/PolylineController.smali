.class Lio/flutter/plugins/googlemaps/PolylineController;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/googlemaps/PolylineOptionsSink;


# instance fields
.field private consumeTapEvents:Z

.field private final density:F

.field private final googleMapsPolylineId:Ljava/lang/String;

.field private final polyline:Lua/s;


# direct methods
.method constructor <init>(Lua/s;ZF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/PolylineController;->polyline:Lua/s;

    iput-boolean p2, p0, Lio/flutter/plugins/googlemaps/PolylineController;->consumeTapEvents:Z

    iput p3, p0, Lio/flutter/plugins/googlemaps/PolylineController;->density:F

    invoke-virtual {p1}, Lua/s;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/PolylineController;->googleMapsPolylineId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method consumeTapEvents()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/PolylineController;->consumeTapEvents:Z

    return v0
.end method

.method getGoogleMapsPolylineId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineController;->googleMapsPolylineId:Ljava/lang/String;

    return-object v0
.end method

.method remove()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineController;->polyline:Lua/s;

    invoke-virtual {v0}, Lua/s;->b()V

    return-void
.end method

.method public setColor(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineController;->polyline:Lua/s;

    invoke-virtual {v0, p1}, Lua/s;->d(I)V

    return-void
.end method

.method public setConsumeTapEvents(Z)V
    .locals 1

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/PolylineController;->consumeTapEvents:Z

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineController;->polyline:Lua/s;

    invoke-virtual {v0, p1}, Lua/s;->c(Z)V

    return-void
.end method

.method public setEndCap(Lua/e;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineController;->polyline:Lua/s;

    invoke-virtual {v0, p1}, Lua/s;->e(Lua/e;)V

    return-void
.end method

.method public setGeodesic(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineController;->polyline:Lua/s;

    invoke-virtual {v0, p1}, Lua/s;->f(Z)V

    return-void
.end method

.method public setJointType(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineController;->polyline:Lua/s;

    invoke-virtual {v0, p1}, Lua/s;->g(I)V

    return-void
.end method

.method public setPattern(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lua/o;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineController;->polyline:Lua/s;

    invoke-virtual {v0, p1}, Lua/s;->h(Ljava/util/List;)V

    return-void
.end method

.method public setPoints(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineController;->polyline:Lua/s;

    invoke-virtual {v0, p1}, Lua/s;->i(Ljava/util/List;)V

    return-void
.end method

.method public setStartCap(Lua/e;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineController;->polyline:Lua/s;

    invoke-virtual {v0, p1}, Lua/s;->j(Lua/e;)V

    return-void
.end method

.method public setVisible(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineController;->polyline:Lua/s;

    invoke-virtual {v0, p1}, Lua/s;->k(Z)V

    return-void
.end method

.method public setWidth(F)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineController;->polyline:Lua/s;

    iget v1, p0, Lio/flutter/plugins/googlemaps/PolylineController;->density:F

    mul-float/2addr p1, v1

    invoke-virtual {v0, p1}, Lua/s;->l(F)V

    return-void
.end method

.method public setZIndex(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineController;->polyline:Lua/s;

    invoke-virtual {v0, p1}, Lua/s;->m(F)V

    return-void
.end method
