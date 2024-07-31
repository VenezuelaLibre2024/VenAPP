.class Lio/flutter/plugins/googlemaps/TileProviderController;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lua/d0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/googlemaps/TileProviderController$Worker;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "TileProviderController"


# instance fields
.field protected final handler:Landroid/os/Handler;

.field protected final methodChannel:Lio/flutter/plugin/common/MethodChannel;

.field protected final tileOverlayId:Ljava/lang/String;


# direct methods
.method constructor <init>(Lio/flutter/plugin/common/MethodChannel;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/TileProviderController;->handler:Landroid/os/Handler;

    iput-object p2, p0, Lio/flutter/plugins/googlemaps/TileProviderController;->tileOverlayId:Ljava/lang/String;

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/TileProviderController;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    return-void
.end method


# virtual methods
.method public getTile(III)Lua/a0;
    .locals 1

    new-instance v0, Lio/flutter/plugins/googlemaps/TileProviderController$Worker;

    invoke-direct {v0, p0, p1, p2, p3}, Lio/flutter/plugins/googlemaps/TileProviderController$Worker;-><init>(Lio/flutter/plugins/googlemaps/TileProviderController;III)V

    invoke-virtual {v0}, Lio/flutter/plugins/googlemaps/TileProviderController$Worker;->getTile()Lua/a0;

    move-result-object p1

    return-object p1
.end method
