.class Lcom/baseflow/geolocator/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/EventChannel$StreamHandler;


# instance fields
.field private final a:La3/b;

.field private b:Lio/flutter/plugin/common/EventChannel;

.field private c:Landroid/content/Context;

.field private d:Landroid/app/Activity;

.field private e:Lcom/baseflow/geolocator/GeolocatorLocationService;

.field private f:Lz2/l;

.field private r:Lz2/p;


# direct methods
.method public constructor <init>(La3/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/baseflow/geolocator/m;->a:La3/b;

    new-instance p1, Lz2/l;

    invoke-direct {p1}, Lz2/l;-><init>()V

    iput-object p1, p0, Lcom/baseflow/geolocator/m;->f:Lz2/l;

    return-void
.end method

.method public static synthetic a(Lio/flutter/plugin/common/EventChannel$EventSink;Ly2/b;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/baseflow/geolocator/m;->e(Lio/flutter/plugin/common/EventChannel$EventSink;Ly2/b;)V

    return-void
.end method

.method public static synthetic b(Lio/flutter/plugin/common/EventChannel$EventSink;Landroid/location/Location;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/baseflow/geolocator/m;->d(Lio/flutter/plugin/common/EventChannel$EventSink;Landroid/location/Location;)V

    return-void
.end method

.method private c(Z)V
    .locals 2

    const-string v0, "Geolocator position updates stopped"

    const-string v1, "FlutterGeolocator"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/baseflow/geolocator/m;->e:Lcom/baseflow/geolocator/GeolocatorLocationService;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/baseflow/geolocator/GeolocatorLocationService;->c(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/baseflow/geolocator/m;->e:Lcom/baseflow/geolocator/GeolocatorLocationService;

    invoke-virtual {p1}, Lcom/baseflow/geolocator/GeolocatorLocationService;->o()V

    iget-object p1, p0, Lcom/baseflow/geolocator/m;->e:Lcom/baseflow/geolocator/GeolocatorLocationService;

    invoke-virtual {p1}, Lcom/baseflow/geolocator/GeolocatorLocationService;->e()V

    goto :goto_0

    :cond_0
    const-string p1, "There is still another flutter engine connected, not stopping location service"

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    iget-object p1, p0, Lcom/baseflow/geolocator/m;->r:Lz2/p;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/baseflow/geolocator/m;->f:Lz2/l;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lz2/l;->f(Lz2/p;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/baseflow/geolocator/m;->r:Lz2/p;

    :cond_1
    return-void
.end method

.method private static synthetic d(Lio/flutter/plugin/common/EventChannel$EventSink;Landroid/location/Location;)V
    .locals 0

    invoke-static {p1}, Lz2/y;->b(Landroid/location/Location;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic e(Lio/flutter/plugin/common/EventChannel$EventSink;Ly2/b;)V
    .locals 2

    invoke-virtual {p1}, Ly2/b;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ly2/b;->h()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {p0, v0, p1, v1}, Lio/flutter/plugin/common/EventChannel$EventSink;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public f(Landroid/app/Activity;)V
    .locals 1

    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/baseflow/geolocator/m;->r:Lz2/p;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baseflow/geolocator/m;->b:Lio/flutter/plugin/common/EventChannel;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/baseflow/geolocator/m;->i()V

    :cond_0
    iput-object p1, p0, Lcom/baseflow/geolocator/m;->d:Landroid/app/Activity;

    return-void
.end method

.method public g(Lcom/baseflow/geolocator/GeolocatorLocationService;)V
    .locals 0

    iput-object p1, p0, Lcom/baseflow/geolocator/m;->e:Lcom/baseflow/geolocator/GeolocatorLocationService;

    return-void
.end method

.method h(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;)V
    .locals 2

    iget-object v0, p0, Lcom/baseflow/geolocator/m;->b:Lio/flutter/plugin/common/EventChannel;

    if-eqz v0, :cond_0

    const-string v0, "FlutterGeolocator"

    const-string v1, "Setting a event call handler before the last was disposed."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/baseflow/geolocator/m;->i()V

    :cond_0
    new-instance v0, Lio/flutter/plugin/common/EventChannel;

    const-string v1, "flutter.baseflow.com/geolocator_updates_android"

    invoke-direct {v0, p2, v1}, Lio/flutter/plugin/common/EventChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/baseflow/geolocator/m;->b:Lio/flutter/plugin/common/EventChannel;

    invoke-virtual {v0, p0}, Lio/flutter/plugin/common/EventChannel;->setStreamHandler(Lio/flutter/plugin/common/EventChannel$StreamHandler;)V

    iput-object p1, p0, Lcom/baseflow/geolocator/m;->c:Landroid/content/Context;

    return-void
.end method

.method i()V
    .locals 2

    iget-object v0, p0, Lcom/baseflow/geolocator/m;->b:Lio/flutter/plugin/common/EventChannel;

    if-nez v0, :cond_0

    const-string v0, "FlutterGeolocator"

    const-string v1, "Tried to stop listening when no MethodChannel had been initialized."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/baseflow/geolocator/m;->c(Z)V

    iget-object v0, p0, Lcom/baseflow/geolocator/m;->b:Lio/flutter/plugin/common/EventChannel;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/EventChannel;->setStreamHandler(Lio/flutter/plugin/common/EventChannel$StreamHandler;)V

    iput-object v1, p0, Lcom/baseflow/geolocator/m;->b:Lio/flutter/plugin/common/EventChannel;

    return-void
.end method

.method public onCancel(Ljava/lang/Object;)V
    .locals 0

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lcom/baseflow/geolocator/m;->c(Z)V

    return-void
.end method

.method public onListen(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/baseflow/geolocator/m;->a:La3/b;

    iget-object v2, p0, Lcom/baseflow/geolocator/m;->c:Landroid/content/Context;

    invoke-virtual {v1, v2}, La3/b;->d(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object p1, Ly2/b;->permissionDenied:Ly2/b;

    invoke-virtual {p1}, Ly2/b;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ly2/b;->h()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v1, p1, v0}, Lio/flutter/plugin/common/EventChannel$EventSink;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ly2/c; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/baseflow/geolocator/m;->e:Lcom/baseflow/geolocator/GeolocatorLocationService;

    const-string v2, "FlutterGeolocator"

    if-nez v1, :cond_1

    const-string p1, "Location background service has not started correctly"

    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    check-cast p1, Ljava/util/Map;

    if-eqz p1, :cond_2

    const-string v1, "forceLocationManager"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-static {p1}, Lz2/z;->e(Ljava/util/Map;)Lz2/z;

    move-result-object v3

    if-eqz p1, :cond_3

    const-string v0, "foregroundNotificationConfig"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Lz2/e;->h(Ljava/util/Map;)Lz2/e;

    move-result-object v0

    :cond_3
    if-eqz v0, :cond_4

    const-string p1, "Geolocator position updates started using Android foreground service"

    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/baseflow/geolocator/m;->e:Lcom/baseflow/geolocator/GeolocatorLocationService;

    invoke-virtual {p1, v1, v3, p2}, Lcom/baseflow/geolocator/GeolocatorLocationService;->n(ZLz2/z;Lio/flutter/plugin/common/EventChannel$EventSink;)V

    iget-object p1, p0, Lcom/baseflow/geolocator/m;->e:Lcom/baseflow/geolocator/GeolocatorLocationService;

    invoke-virtual {p1, v0}, Lcom/baseflow/geolocator/GeolocatorLocationService;->f(Lz2/e;)V

    goto :goto_1

    :cond_4
    const-string p1, "Geolocator position updates started"

    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/baseflow/geolocator/m;->f:Lz2/l;

    iget-object v0, p0, Lcom/baseflow/geolocator/m;->c:Landroid/content/Context;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p1, v0, v1, v3}, Lz2/l;->a(Landroid/content/Context;ZLz2/z;)Lz2/p;

    move-result-object p1

    iput-object p1, p0, Lcom/baseflow/geolocator/m;->r:Lz2/p;

    iget-object v0, p0, Lcom/baseflow/geolocator/m;->f:Lz2/l;

    iget-object v1, p0, Lcom/baseflow/geolocator/m;->d:Landroid/app/Activity;

    new-instance v2, Lcom/baseflow/geolocator/k;

    invoke-direct {v2, p2}, Lcom/baseflow/geolocator/k;-><init>(Lio/flutter/plugin/common/EventChannel$EventSink;)V

    new-instance v3, Lcom/baseflow/geolocator/l;

    invoke-direct {v3, p2}, Lcom/baseflow/geolocator/l;-><init>(Lio/flutter/plugin/common/EventChannel$EventSink;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Lz2/l;->e(Lz2/p;Landroid/app/Activity;Lz2/e0;Ly2/a;)V

    :goto_1
    return-void

    :catch_0
    sget-object p1, Ly2/b;->permissionDefinitionsNotFound:Ly2/b;

    invoke-virtual {p1}, Ly2/b;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ly2/b;->h()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v1, p1, v0}, Lio/flutter/plugin/common/EventChannel$EventSink;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
