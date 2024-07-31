.class Lio/flutter/plugins/googlemaps/CircleBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/googlemaps/CircleOptionsSink;


# instance fields
.field private final circleOptions:Lua/g;

.field private consumeTapEvents:Z

.field private final density:F


# direct methods
.method constructor <init>(F)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lua/g;

    invoke-direct {v0}, Lua/g;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/CircleBuilder;->circleOptions:Lua/g;

    iput p1, p0, Lio/flutter/plugins/googlemaps/CircleBuilder;->density:F

    return-void
.end method


# virtual methods
.method build()Lua/g;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/CircleBuilder;->circleOptions:Lua/g;

    return-object v0
.end method

.method consumeTapEvents()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/CircleBuilder;->consumeTapEvents:Z

    return v0
.end method

.method public setCenter(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/CircleBuilder;->circleOptions:Lua/g;

    invoke-virtual {v0, p1}, Lua/g;->u1(Lcom/google/android/gms/maps/model/LatLng;)Lua/g;

    return-void
.end method

.method public setConsumeTapEvents(Z)V
    .locals 1

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/CircleBuilder;->consumeTapEvents:Z

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/CircleBuilder;->circleOptions:Lua/g;

    invoke-virtual {v0, p1}, Lua/g;->v1(Z)Lua/g;

    return-void
.end method

.method public setFillColor(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/CircleBuilder;->circleOptions:Lua/g;

    invoke-virtual {v0, p1}, Lua/g;->w1(I)Lua/g;

    return-void
.end method

.method public setRadius(D)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/CircleBuilder;->circleOptions:Lua/g;

    invoke-virtual {v0, p1, p2}, Lua/g;->G1(D)Lua/g;

    return-void
.end method

.method public setStrokeColor(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/CircleBuilder;->circleOptions:Lua/g;

    invoke-virtual {v0, p1}, Lua/g;->H1(I)Lua/g;

    return-void
.end method

.method public setStrokeWidth(F)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/CircleBuilder;->circleOptions:Lua/g;

    iget v1, p0, Lio/flutter/plugins/googlemaps/CircleBuilder;->density:F

    mul-float/2addr p1, v1

    invoke-virtual {v0, p1}, Lua/g;->I1(F)Lua/g;

    return-void
.end method

.method public setVisible(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/CircleBuilder;->circleOptions:Lua/g;

    invoke-virtual {v0, p1}, Lua/g;->J1(Z)Lua/g;

    return-void
.end method

.method public setZIndex(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/CircleBuilder;->circleOptions:Lua/g;

    invoke-virtual {v0, p1}, Lua/g;->K1(F)Lua/g;

    return-void
.end method
