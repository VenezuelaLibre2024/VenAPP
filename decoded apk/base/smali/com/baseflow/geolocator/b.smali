.class public Lcom/baseflow/geolocator/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/EventChannel$StreamHandler;


# instance fields
.field private a:Lio/flutter/plugin/common/EventChannel;

.field private b:Landroid/content/Context;

.field private c:Lz2/b0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a()V
    .locals 2

    iget-object v0, p0, Lcom/baseflow/geolocator/b;->b:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/baseflow/geolocator/b;->c:Lz2/b0;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    :cond_0
    return-void
.end method


# virtual methods
.method b(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/baseflow/geolocator/b;->b:Landroid/content/Context;

    return-void
.end method

.method c(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;)V
    .locals 2

    iget-object v0, p0, Lcom/baseflow/geolocator/b;->a:Lio/flutter/plugin/common/EventChannel;

    if-eqz v0, :cond_0

    const-string v0, "LocationServiceHandler"

    const-string v1, "Setting a event call handler before the last was disposed."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/baseflow/geolocator/b;->d()V

    :cond_0
    new-instance v0, Lio/flutter/plugin/common/EventChannel;

    const-string v1, "flutter.baseflow.com/geolocator_service_updates_android"

    invoke-direct {v0, p2, v1}, Lio/flutter/plugin/common/EventChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/baseflow/geolocator/b;->a:Lio/flutter/plugin/common/EventChannel;

    invoke-virtual {v0, p0}, Lio/flutter/plugin/common/EventChannel;->setStreamHandler(Lio/flutter/plugin/common/EventChannel$StreamHandler;)V

    iput-object p1, p0, Lcom/baseflow/geolocator/b;->b:Landroid/content/Context;

    return-void
.end method

.method d()V
    .locals 2

    iget-object v0, p0, Lcom/baseflow/geolocator/b;->a:Lio/flutter/plugin/common/EventChannel;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/baseflow/geolocator/b;->a()V

    iget-object v0, p0, Lcom/baseflow/geolocator/b;->a:Lio/flutter/plugin/common/EventChannel;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/EventChannel;->setStreamHandler(Lio/flutter/plugin/common/EventChannel$StreamHandler;)V

    iput-object v1, p0, Lcom/baseflow/geolocator/b;->a:Lio/flutter/plugin/common/EventChannel;

    return-void
.end method

.method public onCancel(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lcom/baseflow/geolocator/b;->a()V

    return-void
.end method

.method public onListen(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 2

    iget-object p1, p0, Lcom/baseflow/geolocator/b;->b:Landroid/content/Context;

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Landroid/content/IntentFilter;

    const-string v0, "android.location.PROVIDERS_CHANGED"

    invoke-direct {p1, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const-string v0, "android.intent.action.PROVIDER_CHANGED"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    new-instance v0, Lz2/b0;

    invoke-direct {v0, p2}, Lz2/b0;-><init>(Lio/flutter/plugin/common/EventChannel$EventSink;)V

    iput-object v0, p0, Lcom/baseflow/geolocator/b;->c:Lz2/b0;

    iget-object p2, p0, Lcom/baseflow/geolocator/b;->b:Landroid/content/Context;

    const/4 v1, 0x2

    invoke-static {p2, v0, p1, v1}, Landroidx/core/content/a;->registerReceiver(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    return-void
.end method
