.class public Lji/d;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/EventChannel$StreamHandler;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lji/a;

.field private c:Lio/flutter/plugin/common/EventChannel$EventSink;

.field private final d:Landroid/os/Handler;

.field private e:Landroid/net/ConnectivityManager$NetworkCallback;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lji/a;)V
    .locals 2

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lji/d;->d:Landroid/os/Handler;

    iput-object p1, p0, Lji/d;->a:Landroid/content/Context;

    iput-object p2, p0, Lji/d;->b:Lji/a;

    return-void
.end method

.method public static synthetic a(Lji/d;)V
    .locals 0

    invoke-direct {p0}, Lji/d;->e()V

    return-void
.end method

.method public static synthetic b(Lji/d;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lji/d;->f(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lji/d;)V
    .locals 0

    invoke-direct {p0}, Lji/d;->g()V

    return-void
.end method

.method static synthetic d(Lji/d;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lji/d;->h(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic e()V
    .locals 2

    iget-object v0, p0, Lji/d;->c:Lio/flutter/plugin/common/EventChannel$EventSink;

    iget-object v1, p0, Lji/d;->b:Lji/a;

    invoke-virtual {v1}, Lji/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic f(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lji/d;->c:Lio/flutter/plugin/common/EventChannel$EventSink;

    invoke-interface {v0, p1}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    return-void
.end method

.method private g()V
    .locals 2

    new-instance v0, Lji/b;

    invoke-direct {v0, p0}, Lji/b;-><init>(Lji/d;)V

    iget-object v1, p0, Lji/d;->d:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private h(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lji/c;

    invoke-direct {v0, p0, p1}, Lji/c;-><init>(Lji/d;Ljava/lang/String;)V

    iget-object p1, p0, Lji/d;->d:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public onCancel(Ljava/lang/Object;)V
    .locals 1

    iget-object p1, p0, Lji/d;->e:Landroid/net/ConnectivityManager$NetworkCallback;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lji/d;->b:Lji/a;

    invoke-virtual {p1}, Lji/a;->a()Landroid/net/ConnectivityManager;

    move-result-object p1

    iget-object v0, p0, Lji/d;->e:Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-virtual {p1, v0}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lji/d;->e:Landroid/net/ConnectivityManager$NetworkCallback;

    :cond_0
    return-void
.end method

.method public onListen(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 0

    iput-object p2, p0, Lji/d;->c:Lio/flutter/plugin/common/EventChannel$EventSink;

    new-instance p1, Lji/d$a;

    invoke-direct {p1, p0}, Lji/d$a;-><init>(Lji/d;)V

    iput-object p1, p0, Lji/d;->e:Landroid/net/ConnectivityManager$NetworkCallback;

    iget-object p1, p0, Lji/d;->b:Lji/a;

    invoke-virtual {p1}, Lji/a;->a()Landroid/net/ConnectivityManager;

    move-result-object p1

    iget-object p2, p0, Lji/d;->e:Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-virtual {p1, p2}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    iget-object p1, p0, Lji/d;->c:Lio/flutter/plugin/common/EventChannel$EventSink;

    if-eqz p1, :cond_0

    iget-object p2, p0, Lji/d;->b:Lji/a;

    invoke-virtual {p2}, Lji/a;->b()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
