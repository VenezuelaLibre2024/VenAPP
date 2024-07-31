.class Lio/flutter/plugins/googlemaps/PolygonController;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/googlemaps/PolygonOptionsSink;


# instance fields
.field private consumeTapEvents:Z

.field private final density:F

.field private final googleMapsPolygonId:Ljava/lang/String;

.field private final polygon:Lua/q;


# direct methods
.method constructor <init>(Lua/q;ZF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/PolygonController;->polygon:Lua/q;

    iput p3, p0, Lio/flutter/plugins/googlemaps/PolygonController;->density:F

    iput-boolean p2, p0, Lio/flutter/plugins/googlemaps/PolygonController;->consumeTapEvents:Z

    invoke-virtual {p1}, Lua/q;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/PolygonController;->googleMapsPolygonId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method consumeTapEvents()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/PolygonController;->consumeTapEvents:Z

    return v0
.end method

.method getGoogleMapsPolygonId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonController;->googleMapsPolygonId:Ljava/lang/String;

    return-object v0
.end method

.method remove()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonController;->polygon:Lua/q;

    invoke-virtual {v0}, Lua/q;->b()V

    return-void
.end method

.method public setConsumeTapEvents(Z)V
    .locals 1

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/PolygonController;->consumeTapEvents:Z

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonController;->polygon:Lua/q;

    invoke-virtual {v0, p1}, Lua/q;->c(Z)V

    return-void
.end method

.method public setFillColor(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonController;->polygon:Lua/q;

    invoke-virtual {v0, p1}, Lua/q;->d(I)V

    return-void
.end method

.method public setGeodesic(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonController;->polygon:Lua/q;

    invoke-virtual {v0, p1}, Lua/q;->e(Z)V

    return-void
.end method

.method public setHoles(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonController;->polygon:Lua/q;

    invoke-virtual {v0, p1}, Lua/q;->f(Ljava/util/List;)V

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

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonController;->polygon:Lua/q;

    invoke-virtual {v0, p1}, Lua/q;->g(Ljava/util/List;)V

    return-void
.end method

.method public setStrokeColor(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonController;->polygon:Lua/q;

    invoke-virtual {v0, p1}, Lua/q;->h(I)V

    return-void
.end method

.method public setStrokeWidth(F)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonController;->polygon:Lua/q;

    iget v1, p0, Lio/flutter/plugins/googlemaps/PolygonController;->density:F

    mul-float/2addr p1, v1

    invoke-virtual {v0, p1}, Lua/q;->i(F)V

    return-void
.end method

.method public setVisible(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonController;->polygon:Lua/q;

    invoke-virtual {v0, p1}, Lua/q;->j(Z)V

    return-void
.end method

.method public setZIndex(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonController;->polygon:Lua/q;

    invoke-virtual {v0, p1}, Lua/q;->k(F)V

    return-void
.end method
