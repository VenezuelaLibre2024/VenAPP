.class public final Ljm/g$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljm/g;->k(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Integer;

.field final synthetic b:Ljava/lang/Integer;

.field final synthetic c:Ljm/g;

.field final synthetic d:D

.field final synthetic e:D

.field final synthetic f:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljm/g;DDLio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    iput-object p1, p0, Ljm/g$g;->a:Ljava/lang/Integer;

    iput-object p2, p0, Ljm/g$g;->b:Ljava/lang/Integer;

    iput-object p3, p0, Ljm/g$g;->c:Ljm/g;

    iput-wide p4, p0, Ljm/g$g;->d:D

    iput-wide p6, p0, Ljm/g$g;->e:D

    iput-object p8, p0, Ljm/g$g;->f:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Ljm/g$g;->a:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object v1, p0, Ljm/g$g;->c:Ljm/g;

    invoke-static {v1}, Ljm/g;->d(Ljm/g;)Landroid/media/SoundPool;

    move-result-object v1

    iget-wide v2, p0, Ljm/g$g;->d:D

    double-to-float v2, v2

    iget-wide v3, p0, Ljm/g$g;->e:D

    double-to-float v3, v3

    invoke-virtual {v1, v0, v2, v3}, Landroid/media/SoundPool;->setVolume(IFF)V

    :cond_0
    iget-object v0, p0, Ljm/g$g;->b:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Ljm/g$g;->c:Ljm/g;

    invoke-static {v1}, Ljm/g;->e(Ljm/g;)Ljava/util/Map;

    move-result-object v1

    new-instance v2, Ljm/h;

    iget-wide v3, p0, Ljm/g$g;->d:D

    double-to-float v3, v3

    iget-wide v4, p0, Ljm/g$g;->e:D

    double-to-float v4, v4

    invoke-direct {v2, v3, v4}, Ljm/h;-><init>(FF)V

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-static {}, Ljm/c;->b()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Ljm/g$o;

    iget-object v2, p0, Ljm/g$g;->f:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-direct {v1, v2}, Ljm/g$o;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
