.class public final Lsh/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsh/a;->s(Lio/flutter/plugin/common/MethodChannel$Result;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lsh/a;

.field final synthetic b:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method constructor <init>(Lsh/a;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    iput-object p1, p0, Lsh/a$b;->a:Lsh/a;

    iput-object p2, p0, Lsh/a$b;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lsh/a$b;->a:Lsh/a;

    invoke-static {v0}, Lsh/a;->e(Lsh/a;)Lt6/y;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lt6/j3;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "current"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lsh/a$b;->a:Lsh/a;

    invoke-static {v0}, Lsh/a;->c(Lsh/a;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "playerKey"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lsh/a$b;->a:Lsh/a;

    invoke-static {v0}, Lsh/a;->d(Lsh/a;)Lio/flutter/plugin/common/MethodChannel;

    move-result-object v0

    const-string v2, "onCurrentDuration"

    invoke-virtual {v0, v2, v1}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lsh/a$b;->a:Lsh/a;

    invoke-static {v0}, Lsh/a;->b(Lsh/a;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lsh/a$b;->a:Lsh/a;

    invoke-static {v1}, Lsh/a;->f(Lsh/a;)Lsh/h;

    move-result-object v1

    invoke-virtual {v1}, Lsh/h;->h()J

    move-result-wide v1

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lsh/a$b;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    const-string v1, "Can\'t get current Position of player"

    const-string v2, ""

    const-string v3, "AudioWaveforms"

    invoke-interface {v0, v3, v1, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    return-void
.end method
