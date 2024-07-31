.class public Lcom/baseflow/geolocator/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;
.implements Lio/flutter/embedding/engine/plugins/activity/ActivityAware;


# instance fields
.field private final a:La3/b;

.field private final b:Lz2/l;

.field private final c:Lz2/n;

.field private d:Lcom/baseflow/geolocator/GeolocatorLocationService;

.field private e:Lcom/baseflow/geolocator/j;

.field private f:Lcom/baseflow/geolocator/m;

.field private final r:Landroid/content/ServiceConnection;

.field private s:Lcom/baseflow/geolocator/b;

.field private t:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/baseflow/geolocator/a$a;

    invoke-direct {v0, p0}, Lcom/baseflow/geolocator/a$a;-><init>(Lcom/baseflow/geolocator/a;)V

    iput-object v0, p0, Lcom/baseflow/geolocator/a;->r:Landroid/content/ServiceConnection;

    new-instance v0, La3/b;

    invoke-direct {v0}, La3/b;-><init>()V

    iput-object v0, p0, Lcom/baseflow/geolocator/a;->a:La3/b;

    new-instance v0, Lz2/l;

    invoke-direct {v0}, Lz2/l;-><init>()V

    iput-object v0, p0, Lcom/baseflow/geolocator/a;->b:Lz2/l;

    new-instance v0, Lz2/n;

    invoke-direct {v0}, Lz2/n;-><init>()V

    iput-object v0, p0, Lcom/baseflow/geolocator/a;->c:Lz2/n;

    return-void
.end method

.method static synthetic a(Lcom/baseflow/geolocator/a;Lcom/baseflow/geolocator/GeolocatorLocationService;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/baseflow/geolocator/a;->g(Lcom/baseflow/geolocator/GeolocatorLocationService;)V

    return-void
.end method

.method static synthetic b(Lcom/baseflow/geolocator/a;)Lcom/baseflow/geolocator/GeolocatorLocationService;
    .locals 0

    iget-object p0, p0, Lcom/baseflow/geolocator/a;->d:Lcom/baseflow/geolocator/GeolocatorLocationService;

    return-object p0
.end method

.method static synthetic c(Lcom/baseflow/geolocator/a;Lcom/baseflow/geolocator/GeolocatorLocationService;)Lcom/baseflow/geolocator/GeolocatorLocationService;
    .locals 0

    iput-object p1, p0, Lcom/baseflow/geolocator/a;->d:Lcom/baseflow/geolocator/GeolocatorLocationService;

    return-object p1
.end method

.method private d(Landroid/content/Context;)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/baseflow/geolocator/GeolocatorLocationService;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v1, p0, Lcom/baseflow/geolocator/a;->r:Landroid/content/ServiceConnection;

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    return-void
.end method

.method private e()V
    .locals 2

    iget-object v0, p0, Lcom/baseflow/geolocator/a;->t:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/baseflow/geolocator/a;->b:Lz2/l;

    invoke-interface {v0, v1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->removeActivityResultListener(Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;)V

    iget-object v0, p0, Lcom/baseflow/geolocator/a;->t:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    iget-object v1, p0, Lcom/baseflow/geolocator/a;->a:La3/b;

    invoke-interface {v0, v1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->removeRequestPermissionsResultListener(Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;)V

    :cond_0
    return-void
.end method

.method private f()V
    .locals 2

    const-string v0, "FlutterGeolocator"

    const-string v1, "Disposing Geolocator services"

    invoke-static {v0, v1}, Lio/flutter/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/baseflow/geolocator/a;->e:Lcom/baseflow/geolocator/j;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/baseflow/geolocator/j;->x()V

    iget-object v0, p0, Lcom/baseflow/geolocator/a;->e:Lcom/baseflow/geolocator/j;

    invoke-virtual {v0, v1}, Lcom/baseflow/geolocator/j;->v(Landroid/app/Activity;)V

    iput-object v1, p0, Lcom/baseflow/geolocator/a;->e:Lcom/baseflow/geolocator/j;

    :cond_0
    iget-object v0, p0, Lcom/baseflow/geolocator/a;->f:Lcom/baseflow/geolocator/m;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/baseflow/geolocator/m;->i()V

    iget-object v0, p0, Lcom/baseflow/geolocator/a;->f:Lcom/baseflow/geolocator/m;

    invoke-virtual {v0, v1}, Lcom/baseflow/geolocator/m;->g(Lcom/baseflow/geolocator/GeolocatorLocationService;)V

    iput-object v1, p0, Lcom/baseflow/geolocator/a;->f:Lcom/baseflow/geolocator/m;

    :cond_1
    iget-object v0, p0, Lcom/baseflow/geolocator/a;->s:Lcom/baseflow/geolocator/b;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Lcom/baseflow/geolocator/b;->b(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/baseflow/geolocator/a;->s:Lcom/baseflow/geolocator/b;

    invoke-virtual {v0}, Lcom/baseflow/geolocator/b;->d()V

    iput-object v1, p0, Lcom/baseflow/geolocator/a;->s:Lcom/baseflow/geolocator/b;

    :cond_2
    iget-object v0, p0, Lcom/baseflow/geolocator/a;->d:Lcom/baseflow/geolocator/GeolocatorLocationService;

    if-eqz v0, :cond_3

    invoke-virtual {v0, v1}, Lcom/baseflow/geolocator/GeolocatorLocationService;->m(Landroid/app/Activity;)V

    :cond_3
    return-void
.end method

.method private g(Lcom/baseflow/geolocator/GeolocatorLocationService;)V
    .locals 2

    const-string v0, "FlutterGeolocator"

    const-string v1, "Initializing Geolocator services"

    invoke-static {v0, v1}, Lio/flutter/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/baseflow/geolocator/a;->d:Lcom/baseflow/geolocator/GeolocatorLocationService;

    invoke-virtual {p1}, Lcom/baseflow/geolocator/GeolocatorLocationService;->g()V

    iget-object v0, p0, Lcom/baseflow/geolocator/a;->f:Lcom/baseflow/geolocator/m;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/baseflow/geolocator/m;->g(Lcom/baseflow/geolocator/GeolocatorLocationService;)V

    :cond_0
    return-void
.end method

.method private h()V
    .locals 2

    iget-object v0, p0, Lcom/baseflow/geolocator/a;->t:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/baseflow/geolocator/a;->b:Lz2/l;

    invoke-interface {v0, v1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->addActivityResultListener(Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;)V

    iget-object v0, p0, Lcom/baseflow/geolocator/a;->t:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    iget-object v1, p0, Lcom/baseflow/geolocator/a;->a:La3/b;

    invoke-interface {v0, v1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->addRequestPermissionsResultListener(Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;)V

    :cond_0
    return-void
.end method

.method private i(Landroid/content/Context;)V
    .locals 1

    iget-object v0, p0, Lcom/baseflow/geolocator/a;->d:Lcom/baseflow/geolocator/GeolocatorLocationService;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/baseflow/geolocator/GeolocatorLocationService;->h()V

    :cond_0
    iget-object v0, p0, Lcom/baseflow/geolocator/a;->r:Landroid/content/ServiceConnection;

    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    return-void
.end method


# virtual methods
.method public onAttachedToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 2

    const-string v0, "FlutterGeolocator"

    const-string v1, "Attaching Geolocator to activity"

    invoke-static {v0, v1}, Lio/flutter/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/baseflow/geolocator/a;->t:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    invoke-direct {p0}, Lcom/baseflow/geolocator/a;->h()V

    iget-object v0, p0, Lcom/baseflow/geolocator/a;->e:Lcom/baseflow/geolocator/j;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/baseflow/geolocator/j;->v(Landroid/app/Activity;)V

    :cond_0
    iget-object v0, p0, Lcom/baseflow/geolocator/a;->f:Lcom/baseflow/geolocator/m;

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/baseflow/geolocator/m;->f(Landroid/app/Activity;)V

    :cond_1
    iget-object p1, p0, Lcom/baseflow/geolocator/a;->d:Lcom/baseflow/geolocator/GeolocatorLocationService;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/baseflow/geolocator/a;->t:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    invoke-interface {v0}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/baseflow/geolocator/GeolocatorLocationService;->m(Landroid/app/Activity;)V

    :cond_2
    return-void
.end method

.method public onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 4

    new-instance v0, Lcom/baseflow/geolocator/j;

    iget-object v1, p0, Lcom/baseflow/geolocator/a;->a:La3/b;

    iget-object v2, p0, Lcom/baseflow/geolocator/a;->b:Lz2/l;

    iget-object v3, p0, Lcom/baseflow/geolocator/a;->c:Lz2/n;

    invoke-direct {v0, v1, v2, v3}, Lcom/baseflow/geolocator/j;-><init>(La3/b;Lz2/l;Lz2/n;)V

    iput-object v0, p0, Lcom/baseflow/geolocator/a;->e:Lcom/baseflow/geolocator/j;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/baseflow/geolocator/j;->w(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;)V

    new-instance v0, Lcom/baseflow/geolocator/m;

    iget-object v1, p0, Lcom/baseflow/geolocator/a;->a:La3/b;

    invoke-direct {v0, v1}, Lcom/baseflow/geolocator/m;-><init>(La3/b;)V

    iput-object v0, p0, Lcom/baseflow/geolocator/a;->f:Lcom/baseflow/geolocator/m;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/baseflow/geolocator/m;->h(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;)V

    new-instance v0, Lcom/baseflow/geolocator/b;

    invoke-direct {v0}, Lcom/baseflow/geolocator/b;-><init>()V

    iput-object v0, p0, Lcom/baseflow/geolocator/a;->s:Lcom/baseflow/geolocator/b;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/baseflow/geolocator/b;->b(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/baseflow/geolocator/a;->s:Lcom/baseflow/geolocator/b;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/baseflow/geolocator/b;->c(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;)V

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/baseflow/geolocator/a;->d(Landroid/content/Context;)V

    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 2

    const-string v0, "FlutterGeolocator"

    const-string v1, "Detaching Geolocator from activity"

    invoke-static {v0, v1}, Lio/flutter/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/baseflow/geolocator/a;->e()V

    iget-object v0, p0, Lcom/baseflow/geolocator/a;->e:Lcom/baseflow/geolocator/j;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lcom/baseflow/geolocator/j;->v(Landroid/app/Activity;)V

    :cond_0
    iget-object v0, p0, Lcom/baseflow/geolocator/a;->f:Lcom/baseflow/geolocator/m;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Lcom/baseflow/geolocator/m;->f(Landroid/app/Activity;)V

    :cond_1
    iget-object v0, p0, Lcom/baseflow/geolocator/a;->d:Lcom/baseflow/geolocator/GeolocatorLocationService;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Lcom/baseflow/geolocator/GeolocatorLocationService;->m(Landroid/app/Activity;)V

    :cond_2
    iget-object v0, p0, Lcom/baseflow/geolocator/a;->t:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    if-eqz v0, :cond_3

    iput-object v1, p0, Lcom/baseflow/geolocator/a;->t:Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;

    :cond_3
    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 0

    invoke-virtual {p0}, Lcom/baseflow/geolocator/a;->onDetachedFromActivity()V

    return-void
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 0

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/baseflow/geolocator/a;->i(Landroid/content/Context;)V

    invoke-direct {p0}, Lcom/baseflow/geolocator/a;->f()V

    return-void
.end method

.method public onReattachedToActivityForConfigChanges(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/baseflow/geolocator/a;->onAttachedToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V

    return-void
.end method
