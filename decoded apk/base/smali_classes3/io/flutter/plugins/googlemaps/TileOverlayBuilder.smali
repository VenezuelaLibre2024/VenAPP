.class Lio/flutter/plugins/googlemaps/TileOverlayBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/googlemaps/TileOverlaySink;


# instance fields
.field private final tileOverlayOptions:Lua/c0;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lua/c0;

    invoke-direct {v0}, Lua/c0;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/TileOverlayBuilder;->tileOverlayOptions:Lua/c0;

    return-void
.end method


# virtual methods
.method build()Lua/c0;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/TileOverlayBuilder;->tileOverlayOptions:Lua/c0;

    return-object v0
.end method

.method public setFadeIn(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/TileOverlayBuilder;->tileOverlayOptions:Lua/c0;

    invoke-virtual {v0, p1}, Lua/c0;->u1(Z)Lua/c0;

    return-void
.end method

.method public setTileProvider(Lua/d0;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/TileOverlayBuilder;->tileOverlayOptions:Lua/c0;

    invoke-virtual {v0, p1}, Lua/c0;->z1(Lua/d0;)Lua/c0;

    return-void
.end method

.method public setTransparency(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/TileOverlayBuilder;->tileOverlayOptions:Lua/c0;

    invoke-virtual {v0, p1}, Lua/c0;->A1(F)Lua/c0;

    return-void
.end method

.method public setVisible(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/TileOverlayBuilder;->tileOverlayOptions:Lua/c0;

    invoke-virtual {v0, p1}, Lua/c0;->B1(Z)Lua/c0;

    return-void
.end method

.method public setZIndex(F)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/TileOverlayBuilder;->tileOverlayOptions:Lua/c0;

    invoke-virtual {v0, p1}, Lua/c0;->C1(F)Lua/c0;

    return-void
.end method
