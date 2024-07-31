.class Lio/flutter/plugins/googlemaps/PolylineBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/googlemaps/PolylineOptionsSink;


# instance fields
.field private consumeTapEvents:Z

.field private final density:F

.field private final polylineOptions:Lua/t;


# direct methods
.method constructor <init>(F)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lua/t;

    invoke-direct {v0}, Lua/t;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->polylineOptions:Lua/t;

    iput p1, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->density:F

    return-void
.end method


# virtual methods
.method build()Lua/t;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->polylineOptions:Lua/t;

    return-object v0
.end method

.method consumeTapEvents()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->consumeTapEvents:Z

    return v0
.end method

.method public setColor(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->polylineOptions:Lua/t;

    invoke-virtual {v0, p1}, Lua/t;->w1(I)Lua/t;

    return-void
.end method

.method public setConsumeTapEvents(Z)V
    .locals 1

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->consumeTapEvents:Z

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->polylineOptions:Lua/t;

    invoke-virtual {v0, p1}, Lua/t;->v1(Z)Lua/t;

    return-void
.end method

.method public setEndCap(Lua/e;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->polylineOptions:Lua/t;

    invoke-virtual {v0, p1}, Lua/t;->x1(Lua/e;)Lua/t;

    return-void
.end method

.method public setGeodesic(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->polylineOptions:Lua/t;

    invoke-virtual {v0, p1}, Lua/t;->y1(Z)Lua/t;

    return-void
.end method

.method public setJointType(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->polylineOptions:Lua/t;

    invoke-virtual {v0, p1}, Lua/t;->K1(I)Lua/t;

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

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->polylineOptions:Lua/t;

    invoke-virtual {v0, p1}, Lua/t;->L1(Ljava/util/List;)Lua/t;

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

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->polylineOptions:Lua/t;

    invoke-virtual {v0, p1}, Lua/t;->u1(Ljava/lang/Iterable;)Lua/t;

    return-void
.end method

.method public setStartCap(Lua/e;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->polylineOptions:Lua/t;

    invoke-virtual {v0, p1}, Lua/t;->M1(Lua/e;)Lua/t;

    return-void
.end method

.method public setVisible(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->polylineOptions:Lua/t;

    invoke-virtual {v0, p1}, Lua/t;->N1(Z)Lua/t;

    return-void
.end method

.method public setWidth(F)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->polylineOptions:Lua/t;

    iget v1, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->density:F

    mul-float/2addr p1, v1

    invoke-virtual {v0, p1}, Lua/t;->O1(F)Lua/t;

    return-void
.end method

.method public setZIndex(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/PolylineBuilder;->polylineOptions:Lua/t;

    invoke-virtual {v0, p1}, Lua/t;->P1(F)Lua/t;

    return-void
.end method
