.class Lio/flutter/plugins/googlemaps/CircleController;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/googlemaps/CircleOptionsSink;


# instance fields
.field private final circle:Lua/f;

.field private consumeTapEvents:Z

.field private final density:F

.field private final googleMapsCircleId:Ljava/lang/String;


# direct methods
.method constructor <init>(Lua/f;ZF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/CircleController;->circle:Lua/f;

    iput-boolean p2, p0, Lio/flutter/plugins/googlemaps/CircleController;->consumeTapEvents:Z

    iput p3, p0, Lio/flutter/plugins/googlemaps/CircleController;->density:F

    invoke-virtual {p1}, Lua/f;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/CircleController;->googleMapsCircleId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method consumeTapEvents()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/googlemaps/CircleController;->consumeTapEvents:Z

    return v0
.end method

.method getGoogleMapsCircleId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/CircleController;->googleMapsCircleId:Ljava/lang/String;

    return-object v0
.end method

.method remove()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/CircleController;->circle:Lua/f;

    invoke-virtual {v0}, Lua/f;->b()V

    return-void
.end method

.method public setCenter(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/CircleController;->circle:Lua/f;

    invoke-virtual {v0, p1}, Lua/f;->c(Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method

.method public setConsumeTapEvents(Z)V
    .locals 1

    iput-boolean p1, p0, Lio/flutter/plugins/googlemaps/CircleController;->consumeTapEvents:Z

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/CircleController;->circle:Lua/f;

    invoke-virtual {v0, p1}, Lua/f;->d(Z)V

    return-void
.end method

.method public setFillColor(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/CircleController;->circle:Lua/f;

    invoke-virtual {v0, p1}, Lua/f;->e(I)V

    return-void
.end method

.method public setRadius(D)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/CircleController;->circle:Lua/f;

    invoke-virtual {v0, p1, p2}, Lua/f;->f(D)V

    return-void
.end method

.method public setStrokeColor(I)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/CircleController;->circle:Lua/f;

    invoke-virtual {v0, p1}, Lua/f;->g(I)V

    return-void
.end method

.method public setStrokeWidth(F)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/CircleController;->circle:Lua/f;

    iget v1, p0, Lio/flutter/plugins/googlemaps/CircleController;->density:F

    mul-float/2addr p1, v1

    invoke-virtual {v0, p1}, Lua/f;->h(F)V

    return-void
.end method

.method public setVisible(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/CircleController;->circle:Lua/f;

    invoke-virtual {v0, p1}, Lua/f;->i(Z)V

    return-void
.end method

.method public setZIndex(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/CircleController;->circle:Lua/f;

    invoke-virtual {v0, p1}, Lua/f;->j(F)V

    return-void
.end method
