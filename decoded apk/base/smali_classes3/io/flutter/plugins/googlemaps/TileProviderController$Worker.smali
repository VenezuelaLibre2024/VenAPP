.class final Lio/flutter/plugins/googlemaps/TileProviderController$Worker;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$Result;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/googlemaps/TileProviderController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "Worker"
.end annotation


# instance fields
.field private final countDownLatch:Ljava/util/concurrent/CountDownLatch;

.field private result:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lio/flutter/plugins/googlemaps/TileProviderController;

.field private final x:I

.field private final y:I

.field private final zoom:I


# direct methods
.method constructor <init>(Lio/flutter/plugins/googlemaps/TileProviderController;III)V
    .locals 1

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/TileProviderController$Worker;->this$0:Lio/flutter/plugins/googlemaps/TileProviderController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/TileProviderController$Worker;->countDownLatch:Ljava/util/concurrent/CountDownLatch;

    iput p2, p0, Lio/flutter/plugins/googlemaps/TileProviderController$Worker;->x:I

    iput p3, p0, Lio/flutter/plugins/googlemaps/TileProviderController$Worker;->y:I

    iput p4, p0, Lio/flutter/plugins/googlemaps/TileProviderController$Worker;->zoom:I

    return-void
.end method

.method public static synthetic a(Lio/flutter/plugins/googlemaps/TileProviderController$Worker;)V
    .locals 0

    invoke-direct {p0}, Lio/flutter/plugins/googlemaps/TileProviderController$Worker;->lambda$getTile$0()V

    return-void
.end method

.method private synthetic lambda$getTile$0()V
    .locals 5

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/TileProviderController$Worker;->this$0:Lio/flutter/plugins/googlemaps/TileProviderController;

    iget-object v1, v0, Lio/flutter/plugins/googlemaps/TileProviderController;->methodChannel:Lio/flutter/plugin/common/MethodChannel;

    iget-object v0, v0, Lio/flutter/plugins/googlemaps/TileProviderController;->tileOverlayId:Ljava/lang/String;

    iget v2, p0, Lio/flutter/plugins/googlemaps/TileProviderController$Worker;->x:I

    iget v3, p0, Lio/flutter/plugins/googlemaps/TileProviderController$Worker;->y:I

    iget v4, p0, Lio/flutter/plugins/googlemaps/TileProviderController$Worker;->zoom:I

    invoke-static {v0, v2, v3, v4}, Lio/flutter/plugins/googlemaps/Convert;->tileOverlayArgumentsToJson(Ljava/lang/String;III)Ljava/util/Map;

    move-result-object v0

    const-string v2, "tileOverlay#getTile"

    invoke-virtual {v1, v2, v0, p0}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method


# virtual methods
.method public error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Can\'t get tile: errorCode = "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", errorMessage = "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", date = "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "TileProviderController"

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/TileProviderController$Worker;->result:Ljava/util/Map;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/TileProviderController$Worker;->countDownLatch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method getTile()Lua/a0;
    .locals 5

    const-string v0, "TileProviderController"

    iget-object v1, p0, Lio/flutter/plugins/googlemaps/TileProviderController$Worker;->this$0:Lio/flutter/plugins/googlemaps/TileProviderController;

    iget-object v1, v1, Lio/flutter/plugins/googlemaps/TileProviderController;->handler:Landroid/os/Handler;

    new-instance v2, Lio/flutter/plugins/googlemaps/a;

    invoke-direct {v2, p0}, Lio/flutter/plugins/googlemaps/a;-><init>(Lio/flutter/plugins/googlemaps/TileProviderController$Worker;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :try_start_0
    iget-object v1, p0, Lio/flutter/plugins/googlemaps/TileProviderController$Worker;->countDownLatch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    iget-object v1, p0, Lio/flutter/plugins/googlemaps/TileProviderController$Worker;->result:Ljava/util/Map;

    invoke-static {v1}, Lio/flutter/plugins/googlemaps/Convert;->interpretTile(Ljava/util/Map;)Lua/a0;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :catch_0
    move-exception v1

    const-string v2, "Can\'t parse tile data"

    :goto_0
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    sget-object v0, Lua/d0;->a:Lua/a0;

    return-object v0

    :catch_1
    move-exception v1

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lio/flutter/plugins/googlemaps/TileProviderController$Worker;->x:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lio/flutter/plugins/googlemaps/TileProviderController$Worker;->y:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    iget v3, p0, Lio/flutter/plugins/googlemaps/TileProviderController$Worker;->zoom:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    const-string v3, "countDownLatch: can\'t get tile: x = %d, y= %d, zoom = %d"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0
.end method

.method public notImplemented()V
    .locals 2

    const-string v0, "TileProviderController"

    const-string v1, "Can\'t get tile: notImplemented"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugins/googlemaps/TileProviderController$Worker;->result:Ljava/util/Map;

    iget-object v0, p0, Lio/flutter/plugins/googlemaps/TileProviderController$Worker;->countDownLatch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method public success(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/Map;

    iput-object p1, p0, Lio/flutter/plugins/googlemaps/TileProviderController$Worker;->result:Ljava/util/Map;

    iget-object p1, p0, Lio/flutter/plugins/googlemaps/TileProviderController$Worker;->countDownLatch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method
