.class Lio/flutter/plugins/googlemaps/PolygonBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/googlemaps/PolygonOptionsSink;


# instance fields
.field private consumeTapEvents:Z

.field private final density:F

.field private final polygonOptions:Lua/r;


# direct methods
.method constructor <init>(F)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lua/r;

    invoke-direct {v0}, Lua/r;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->polygonOptions:Lua/r;

    iput p1, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->density:F

    return-void
.end method


# virtual methods
.method build()Lua/r;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->polygonOptions:Lua/r;

    return-object v0
.end method

.method consumeTapEvents()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->consumeTapEvents:Z

    return v0
.end method

.method public setConsumeTapEvents(Z)V
    .locals 1

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->consumeTapEvents:Z

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->polygonOptions:Lua/r;

    invoke-virtual {v0, p1}, Lua/r;->w1(Z)Lua/r;

    return-void
.end method

.method public setFillColor(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->polygonOptions:Lua/r;

    invoke-virtual {v0, p1}, Lua/r;->x1(I)Lua/r;

    return-void
.end method

.method public setGeodesic(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->polygonOptions:Lua/r;

    invoke-virtual {v0, p1}, Lua/r;->y1(Z)Lua/r;

    return-void
.end method

.method public setHoles(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;>;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->polygonOptions:Lua/r;

    invoke-virtual {v1, v0}, Lua/r;->v1(Ljava/lang/Iterable;)Lua/r;

    goto :goto_0

    :cond_0
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

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->polygonOptions:Lua/r;

    invoke-virtual {v0, p1}, Lua/r;->u1(Ljava/lang/Iterable;)Lua/r;

    return-void
.end method

.method public setStrokeColor(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->polygonOptions:Lua/r;

    invoke-virtual {v0, p1}, Lua/r;->J1(I)Lua/r;

    return-void
.end method

.method public setStrokeWidth(F)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->polygonOptions:Lua/r;

    iget v1, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->density:F

    mul-float/2addr p1, v1

    invoke-virtual {v0, p1}, Lua/r;->K1(F)Lua/r;

    return-void
.end method

.method public setVisible(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->polygonOptions:Lua/r;

    invoke-virtual {v0, p1}, Lua/r;->L1(Z)Lua/r;

    return-void
.end method

.method public setZIndex(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolygonBuilder;->polygonOptions:Lua/r;

    invoke-virtual {v0, p1}, Lua/r;->M1(F)Lua/r;

    return-void
.end method
