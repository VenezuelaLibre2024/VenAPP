.class public final Ljm/g$f;
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
.field final synthetic a:Ljm/g;

.field final synthetic b:I

.field final synthetic c:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public constructor <init>(Ljm/g;ILio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    iput-object p1, p0, Ljm/g$f;->a:Ljm/g;

    iput p2, p0, Ljm/g$f;->b:I

    iput-object p3, p0, Ljm/g$f;->c:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Ljm/g$f;->a:Ljm/g;

    invoke-static {v0}, Ljm/g;->d(Ljm/g;)Landroid/media/SoundPool;

    move-result-object v0

    iget v1, p0, Ljm/g$f;->b:I

    invoke-virtual {v0, v1}, Landroid/media/SoundPool;->stop(I)V

    invoke-static {}, Ljm/c;->b()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Ljm/g$n;

    iget-object v2, p0, Ljm/g$f;->c:Lio/flutter/plugin/common/MethodChannel$Result;

    iget v3, p0, Ljm/g$f;->b:I

    invoke-direct {v1, v2, v3}, Ljm/g$n;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
