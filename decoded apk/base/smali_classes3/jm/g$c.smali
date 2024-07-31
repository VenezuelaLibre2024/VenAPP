.class public final Ljm/g$c;
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

.field final synthetic c:Ljm/h;

.field final synthetic d:I

.field final synthetic e:D

.field final synthetic f:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public constructor <init>(Ljm/g;ILjm/h;IDLio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    iput-object p1, p0, Ljm/g$c;->a:Ljm/g;

    iput p2, p0, Ljm/g$c;->b:I

    iput-object p3, p0, Ljm/g$c;->c:Ljm/h;

    iput p4, p0, Ljm/g$c;->d:I

    iput-wide p5, p0, Ljm/g$c;->e:D

    iput-object p7, p0, Ljm/g$c;->f:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    iget-object v0, p0, Ljm/g$c;->a:Ljm/g;

    invoke-static {v0}, Ljm/g;->d(Ljm/g;)Landroid/media/SoundPool;

    move-result-object v1

    iget v2, p0, Ljm/g$c;->b:I

    iget-object v0, p0, Ljm/g$c;->c:Ljm/h;

    invoke-virtual {v0}, Ljm/h;->a()F

    move-result v3

    iget-object v0, p0, Ljm/g$c;->c:Ljm/h;

    invoke-virtual {v0}, Ljm/h;->b()F

    move-result v4

    const/4 v5, 0x0

    iget v6, p0, Ljm/g$c;->d:I

    iget-wide v7, p0, Ljm/g$c;->e:D

    double-to-float v7, v7

    invoke-virtual/range {v1 .. v7}, Landroid/media/SoundPool;->play(IFFIIF)I

    move-result v0

    invoke-static {}, Ljm/c;->b()Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Ljm/g$k;

    iget-object v3, p0, Ljm/g$c;->f:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-direct {v2, v3, v0}, Ljm/g$k;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
