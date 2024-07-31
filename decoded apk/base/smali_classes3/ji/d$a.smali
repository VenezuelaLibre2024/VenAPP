.class Lji/d$a;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lji/d;->onListen(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lji/d;


# direct methods
.method constructor <init>(Lji/d;)V
    .locals 0

    iput-object p1, p0, Lji/d$a;->a:Lji/d;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAvailable(Landroid/net/Network;)V
    .locals 0

    iget-object p1, p0, Lji/d$a;->a:Lji/d;

    invoke-static {p1}, Lji/d;->c(Lji/d;)V

    return-void
.end method

.method public onLost(Landroid/net/Network;)V
    .locals 1

    iget-object p1, p0, Lji/d$a;->a:Lji/d;

    const-string v0, "none"

    invoke-static {p1, v0}, Lji/d;->d(Lji/d;Ljava/lang/String;)V

    return-void
.end method
