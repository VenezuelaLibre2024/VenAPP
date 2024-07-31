.class public final Lnm/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;
.implements Lnm/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnm/m$a;
    }
.end annotation


# instance fields
.field private final a:Lzk/k0;

.field private b:Lio/flutter/plugin/common/MethodChannel;

.field private c:Lio/flutter/plugin/common/MethodChannel;

.field private d:Lnm/p;

.field private e:Landroid/content/Context;

.field private f:Lio/flutter/plugin/common/BinaryMessenger;

.field private r:Lom/l;

.field private final s:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lom/o;",
            ">;"
        }
    .end annotation
.end field

.field private final t:Landroid/os/Handler;

.field private u:Ljava/lang/Runnable;

.field private v:Lnm/a;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lzk/a1;->c()Lzk/h2;

    move-result-object v0

    invoke-static {v0}, Lzk/l0;->a(Lgk/f;)Lzk/k0;

    move-result-object v0

    iput-object v0, p0, Lnm/m;->a:Lzk/k0;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lnm/m;->s:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lnm/m;->t:Landroid/os/Handler;

    new-instance v0, Lnm/a;

    invoke-direct {v0}, Lnm/a;-><init>()V

    iput-object v0, p0, Lnm/m;->v:Lnm/a;

    return-void
.end method

.method private static final B(Lnm/m;Ljava/lang/String;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lnm/m;->d:Lnm/p;

    if-nez p0, :cond_0

    const-string p0, "globalEvents"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Lck/m;

    const-string v1, "value"

    invoke-static {v1, p1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {v0}, Ldk/h0;->j([Lck/m;)Ljava/util/HashMap;

    move-result-object p1

    const-string v0, "audio.onLog"

    invoke-virtual {p0, v0, p1}, Lnm/p;->c(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private static final E(Lom/o;Ljava/lang/String;)V
    .locals 2

    const-string v0, "$player"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lom/o;->k()Lnm/p;

    move-result-object p0

    const/4 v0, 0x1

    new-array v0, v0, [Lck/m;

    const-string v1, "value"

    invoke-static {v1, p1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {v0}, Ldk/h0;->j([Lck/m;)Ljava/util/HashMap;

    move-result-object p1

    const-string v0, "audio.onLog"

    invoke-virtual {p0, v0, p1}, Lnm/p;->c(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private static final G(Lom/o;Z)V
    .locals 2

    const-string v0, "$player"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lom/o;->k()Lnm/p;

    move-result-object p0

    const/4 v0, 0x1

    new-array v0, v0, [Lck/m;

    const-string v1, "value"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {v1, p1}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {v0}, Ldk/h0;->j([Lck/m;)Ljava/util/HashMap;

    move-result-object p1

    const-string v0, "audio.onPrepared"

    invoke-virtual {p0, v0, p1}, Lnm/p;->c(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private static final I(Lom/o;)V
    .locals 4

    const-string v0, "$player"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lom/o;->k()Lnm/p;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    const-string v3, "audio.onSeekComplete"

    invoke-static {v0, v3, v1, v2, v1}, Lnm/p;->d(Lnm/p;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    invoke-virtual {p0}, Lom/o;->k()Lnm/p;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lck/m;

    invoke-virtual {p0}, Lom/o;->i()Ljava/lang/Integer;

    move-result-object p0

    const/4 v2, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    goto :goto_0

    :cond_0
    move p0, v2

    :goto_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v3, "value"

    invoke-static {v3, p0}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p0

    aput-object p0, v1, v2

    invoke-static {v1}, Ldk/h0;->j([Lck/m;)Ljava/util/HashMap;

    move-result-object p0

    const-string v1, "audio.onCurrentPosition"

    invoke-virtual {v0, v1, p0}, Lnm/p;->c(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private final J(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    const-string v3, "AndroidAudioError"

    const-string v4, "playerId"

    invoke-virtual {v0, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-nez v4, :cond_0

    return-void

    :cond_0
    iget-object v5, v0, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    const-string v6, "create"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v5, :cond_3

    new-instance v0, Lnm/p;

    new-instance v3, Lio/flutter/plugin/common/EventChannel;

    iget-object v5, v1, Lnm/m;->f:Lio/flutter/plugin/common/BinaryMessenger;

    if-nez v5, :cond_1

    const-string v5, "binaryMessenger"

    invoke-static {v5}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    move-object v5, v7

    :cond_1
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "xyz.luan/audioplayers/events/"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v3, v5, v8}, Lio/flutter/plugin/common/EventChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    invoke-direct {v0, v3}, Lnm/p;-><init>(Lio/flutter/plugin/common/EventChannel;)V

    iget-object v3, v1, Lnm/m;->s:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v5, Lom/o;

    iget-object v8, v1, Lnm/m;->v:Lnm/a;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x3f

    const/16 v16, 0x0

    invoke-static/range {v8 .. v16}, Lnm/a;->c(Lnm/a;ZZIIIIILjava/lang/Object;)Lnm/a;

    move-result-object v8

    iget-object v9, v1, Lnm/m;->r:Lom/l;

    if-nez v9, :cond_2

    const-string v9, "soundPoolManager"

    invoke-static {v9}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v7, v9

    :goto_0
    invoke-direct {v5, v1, v0, v8, v7}, Lom/o;-><init>(Lnm/m;Lnm/p;Lnm/a;Lom/l;)V

    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    :cond_3
    invoke-direct {v1, v4}, Lnm/m;->q(Ljava/lang/String;)Lom/o;

    move-result-object v5

    :try_start_0
    iget-object v8, v0, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    if-eqz v8, :cond_24

    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    move-result v9
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const/16 v10, 0x2e

    const/4 v11, 0x0

    const-string v12, "message is required"

    const-string v13, "message"

    sparse-switch v9, :sswitch_data_0

    goto/16 :goto_4

    :sswitch_0
    :try_start_1
    const-string v4, "setReleaseMode"

    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "releaseMode"

    invoke-virtual {v0, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/lang/String;

    if-nez v12, :cond_5

    goto :goto_1

    :cond_5
    invoke-static {v12}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    new-array v13, v6, [C

    aput-char v10, v13, v11

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x6

    const/16 v17, 0x0

    invoke-static/range {v12 .. v17}, Lxk/g;->t0(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ldk/p;->O(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lnm/n;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnm/s;->valueOf(Ljava/lang/String;)Lnm/s;

    move-result-object v7

    :goto_1
    if-eqz v7, :cond_6

    invoke-virtual {v5, v7}, Lom/o;->J(Lnm/s;)V

    goto/16 :goto_3

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v4, "releaseMode is required"

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_1
    const-string v4, "setAudioContext"

    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    goto/16 :goto_4

    :cond_7
    invoke-static/range {p1 .. p1}, Lnm/n;->a(Lio/flutter/plugin/common/MethodCall;)Lnm/a;

    move-result-object v0

    invoke-virtual {v5, v0}, Lom/o;->O(Lnm/a;)V

    goto/16 :goto_3

    :sswitch_2
    const-string v4, "setSourceBytes"

    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    goto/16 :goto_4

    :cond_8
    const-string v4, "bytes"

    invoke-virtual {v0, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    if-eqz v0, :cond_9

    new-instance v4, Lpm/a;

    invoke-direct {v4, v0}, Lpm/a;-><init>([B)V

    invoke-virtual {v5, v4}, Lom/o;->K(Lpm/b;)V

    goto/16 :goto_3

    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v4, "bytes are required"

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_3
    const-string v0, "dispose"

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_4

    :cond_a
    iget-object v0, v1, Lnm/m;->t:Landroid/os/Handler;

    new-instance v7, Lnm/k;

    invoke-direct {v7, v5, v1, v4}, Lnm/k;-><init>(Lom/o;Lnm/m;Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_3

    :sswitch_4
    const-string v0, "release"

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_4

    :cond_b
    invoke-virtual {v5}, Lom/o;->D()V

    goto/16 :goto_3

    :sswitch_5
    const-string v4, "emitError"

    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    goto/16 :goto_4

    :cond_c
    const-string v4, "code"

    invoke-virtual {v0, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_e

    invoke-virtual {v0, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_d

    invoke-virtual {v5, v4, v0, v7}, Lom/o;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v4, "code is required"

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_6
    const-string v4, "setVolume"

    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    goto/16 :goto_4

    :cond_f
    const-string v4, "volume"

    invoke-virtual {v0, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    double-to-float v0, v7

    invoke-virtual {v5, v0}, Lom/o;->L(F)V

    goto/16 :goto_3

    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v4, "volume is required"

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_7
    const-string v0, "pause"

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto/16 :goto_4

    :cond_11
    invoke-virtual {v5}, Lom/o;->B()V

    goto/16 :goto_3

    :sswitch_8
    const-string v0, "getDuration"

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto/16 :goto_4

    :cond_12
    invoke-virtual {v5}, Lom/o;->j()Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    :sswitch_9
    const-string v0, "stop"

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto/16 :goto_4

    :cond_13
    invoke-virtual {v5}, Lom/o;->N()V

    goto/16 :goto_3

    :sswitch_a
    const-string v4, "seek"

    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_14

    goto/16 :goto_4

    :cond_14
    const-string v4, "position"

    invoke-virtual {v0, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_15

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {v5, v0}, Lom/o;->E(I)V

    goto/16 :goto_3

    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v4, "position is required"

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_b
    const-string v4, "setSourceUrl"

    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_16

    goto/16 :goto_4

    :cond_16
    const-string v4, "url"

    invoke-virtual {v0, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_18

    const-string v7, "isLocal"

    invoke-virtual {v0, v7}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-nez v0, :cond_17

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :cond_17
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    new-instance v7, Lpm/c;

    invoke-direct {v7, v4, v0}, Lpm/c;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v5, v7}, Lom/o;->K(Lpm/b;)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto/16 :goto_3

    :catch_0
    move-exception v0

    :try_start_3
    const-string v4, "Failed to set source. For troubleshooting, see: https://github.com/bluefireteam/audioplayers/blob/main/troubleshooting.md"

    invoke-interface {v2, v3, v4, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v4, "url is required"

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_c
    const-string v4, "setPlaybackRate"

    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_19

    goto/16 :goto_4

    :cond_19
    const-string v4, "playbackRate"

    invoke-virtual {v0, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    if-eqz v0, :cond_1a

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    double-to-float v0, v7

    invoke-virtual {v5, v0}, Lom/o;->I(F)V

    goto/16 :goto_3

    :cond_1a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v4, "playbackRate is required"

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_d
    const-string v0, "resume"

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    goto/16 :goto_4

    :cond_1b
    invoke-virtual {v5}, Lom/o;->C()V

    goto/16 :goto_3

    :sswitch_e
    const-string v4, "emitLog"

    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1c

    goto/16 :goto_4

    :cond_1c
    invoke-virtual {v0, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1d

    invoke-virtual {v5, v0}, Lom/o;->r(Ljava/lang/String;)V

    goto :goto_3

    :cond_1d
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_f
    const-string v4, "setBalance"

    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1e

    goto/16 :goto_4

    :cond_1e
    const-string v4, "balance"

    invoke-virtual {v0, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    if-eqz v0, :cond_1f

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    double-to-float v0, v7

    invoke-virtual {v5, v0}, Lom/o;->F(F)V

    goto :goto_3

    :cond_1f
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v4, "balance is required"

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_10
    const-string v4, "setPlayerMode"

    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_20

    goto :goto_4

    :cond_20
    const-string v4, "playerMode"

    invoke-virtual {v0, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/lang/String;

    if-nez v12, :cond_21

    goto :goto_2

    :cond_21
    invoke-static {v12}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    new-array v13, v6, [C

    aput-char v10, v13, v11

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x6

    const/16 v17, 0x0

    invoke-static/range {v12 .. v17}, Lxk/g;->t0(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ldk/p;->O(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lnm/n;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnm/r;->valueOf(Ljava/lang/String;)Lnm/r;

    move-result-object v7

    :goto_2
    if-eqz v7, :cond_22

    invoke-virtual {v5, v7}, Lom/o;->G(Lnm/r;)V

    :goto_3
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto :goto_5

    :cond_22
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v4, "playerMode is required"

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_11
    const-string v0, "getCurrentPosition"

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_23

    goto :goto_4

    :cond_23
    invoke-virtual {v5}, Lom/o;->i()Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    :cond_24
    :goto_4
    invoke-interface/range {p2 .. p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    return-void

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x68b9fc74 -> :sswitch_11
        -0x66b209da -> :sswitch_10
        -0x62f907e6 -> :sswitch_f
        -0x612cd98f -> :sswitch_e
        -0x37b237d3 -> :sswitch_d
        -0x17fa60e3 -> :sswitch_c
        -0x97aa2ee -> :sswitch_b
        0x35ce78 -> :sswitch_a
        0x360802 -> :sswitch_9
        0x51e8b0a -> :sswitch_8
        0x65825f6 -> :sswitch_7
        0x27f73e1c -> :sswitch_6
        0x36423df5 -> :sswitch_5
        0x41012807 -> :sswitch_4
        0x63a5261f -> :sswitch_3
        0x6999fb4e -> :sswitch_2
        0x7164e27b -> :sswitch_1
        0x7cf03488 -> :sswitch_0
    .end sparse-switch
.end method

.method private static final K(Lom/o;Lnm/m;Ljava/lang/String;)V
    .locals 1

    const-string v0, "$player"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$playerId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lom/o;->e()V

    iget-object p0, p1, Lnm/m;->s:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final L(Lnm/m;Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lnm/m$b;

    invoke-direct {v0, p0}, Lnm/m$b;-><init>(Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2, v0}, Lnm/m;->N(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;Lok/p;)V

    return-void
.end method

.method private static final M(Lnm/m;Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lnm/m$c;

    invoke-direct {v0, p0}, Lnm/m$c;-><init>(Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2, v0}, Lnm/m;->N(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;Lok/p;)V

    return-void
.end method

.method private final N(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;Lok/p;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/flutter/plugin/common/MethodCall;",
            "Lio/flutter/plugin/common/MethodChannel$Result;",
            "Lok/p<",
            "-",
            "Lio/flutter/plugin/common/MethodCall;",
            "-",
            "Lio/flutter/plugin/common/MethodChannel$Result;",
            "Lck/v;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lnm/m;->a:Lzk/k0;

    invoke-static {}, Lzk/a1;->b()Lzk/h0;

    move-result-object v1

    const/4 v2, 0x0

    new-instance v3, Lnm/m$d;

    const/4 v4, 0x0

    invoke-direct {v3, p3, p1, p2, v4}, Lnm/m$d;-><init>(Lok/p;Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;Lgk/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lzk/h;->d(Lzk/k0;Lgk/f;Lzk/m0;Lok/p;ILjava/lang/Object;)Lzk/w1;

    return-void
.end method

.method public static synthetic b(Lom/o;Lnm/m;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lnm/m;->K(Lom/o;Lnm/m;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic c(Lom/o;)V
    .locals 0

    invoke-static {p0}, Lnm/m;->t(Lom/o;)V

    return-void
.end method

.method public static synthetic d(Lnm/m;Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lnm/m;->L(Lnm/m;Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method

.method public static synthetic e(Lom/o;Z)V
    .locals 0

    invoke-static {p0, p1}, Lnm/m;->G(Lom/o;Z)V

    return-void
.end method

.method public static synthetic f(Lnm/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lnm/m;->z(Lnm/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic g(Lom/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lnm/m;->x(Lom/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic h(Lnm/m;Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lnm/m;->M(Lnm/m;Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method

.method public static synthetic i(Lom/o;)V
    .locals 0

    invoke-static {p0}, Lnm/m;->I(Lom/o;)V

    return-void
.end method

.method public static synthetic j(Lom/o;)V
    .locals 0

    invoke-static {p0}, Lnm/m;->v(Lom/o;)V

    return-void
.end method

.method public static synthetic k(Lnm/m;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lnm/m;->B(Lnm/m;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic l(Lom/o;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lnm/m;->E(Lom/o;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic m(Lnm/m;Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lnm/m;->r(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method

.method public static final synthetic n(Lnm/m;Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lnm/m;->J(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method

.method private final q(Ljava/lang/String;)Lom/o;
    .locals 1

    iget-object v0, p0, Lnm/m;->s:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lom/o;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Player has not yet been created or has already been disposed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final r(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 5

    iget-object v0, p1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0x612cd98f

    const-string v3, "message is required"

    const-string v4, "message"

    if-eq v1, v2, :cond_5

    const v2, 0x36423df5

    if-eq v1, v2, :cond_1

    const v2, 0x7164e27b

    if-eq v1, v2, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v1, "setAudioContext"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lnm/m;->p()Landroid/media/AudioManager;

    move-result-object v0

    iget-object v1, p0, Lnm/m;->v:Lnm/a;

    invoke-virtual {v1}, Lnm/a;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->setMode(I)V

    iget-object v1, p0, Lnm/m;->v:Lnm/a;

    invoke-virtual {v1}, Lnm/a;->g()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->setSpeakerphoneOn(Z)V

    invoke-static {p1}, Lnm/n;->a(Lio/flutter/plugin/common/MethodCall;)Lnm/a;

    move-result-object p1

    iput-object p1, p0, Lnm/m;->v:Lnm/a;

    goto :goto_0

    :cond_1
    const-string v1, "emitError"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    const-string v0, "code"

    invoke-virtual {p1, v0}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_4

    invoke-virtual {p1, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_3

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lnm/m;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "code is required"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    const-string v1, "emitLog"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {p1, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_7

    invoke-virtual {p0, p1}, Lnm/m;->A(Ljava/lang/String;)V

    :goto_0
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_1
    invoke-interface {p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    return-void
.end method

.method private static final t(Lom/o;)V
    .locals 3

    const-string v0, "$player"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lom/o;->k()Lnm/p;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "audio.onComplete"

    invoke-static {p0, v2, v0, v1, v0}, Lnm/p;->d(Lnm/p;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method private static final v(Lom/o;)V
    .locals 4

    const-string v0, "$player"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lom/o;->k()Lnm/p;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lck/m;

    invoke-virtual {p0}, Lom/o;->j()Ljava/lang/Integer;

    move-result-object p0

    const/4 v2, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    goto :goto_0

    :cond_0
    move p0, v2

    :goto_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v3, "value"

    invoke-static {v3, p0}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object p0

    aput-object p0, v1, v2

    invoke-static {v1}, Ldk/h0;->j([Lck/m;)Ljava/util/HashMap;

    move-result-object p0

    const-string v1, "audio.onDuration"

    invoke-virtual {v0, v1, p0}, Lnm/p;->c(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private static final x(Lom/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$player"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lom/o;->k()Lnm/p;

    move-result-object p0

    invoke-virtual {p0, p1, p2, p3}, Lnm/p;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private static final z(Lnm/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lnm/m;->d:Lnm/p;

    if-nez p0, :cond_0

    const-string p0, "globalEvents"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lnm/p;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/String;)V
    .locals 2

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lnm/m;->t:Landroid/os/Handler;

    new-instance v1, Lnm/c;

    invoke-direct {v1, p0, p1}, Lnm/c;-><init>(Lnm/m;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final C()V
    .locals 0

    invoke-virtual {p0}, Lnm/m;->O()V

    return-void
.end method

.method public final D(Lom/o;Ljava/lang/String;)V
    .locals 2

    const-string v0, "player"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lnm/m;->t:Landroid/os/Handler;

    new-instance v1, Lnm/f;

    invoke-direct {v1, p1, p2}, Lnm/f;-><init>(Lom/o;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final F(Lom/o;Z)V
    .locals 2

    const-string v0, "player"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lnm/m;->t:Landroid/os/Handler;

    new-instance v1, Lnm/e;

    invoke-direct {v1, p1, p2}, Lnm/e;-><init>(Lom/o;Z)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final H(Lom/o;)V
    .locals 2

    const-string v0, "player"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lnm/m;->t:Landroid/os/Handler;

    new-instance v1, Lnm/j;

    invoke-direct {v1, p1}, Lnm/j;-><init>(Lom/o;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public O()V
    .locals 2

    iget-object v0, p0, Lnm/m;->u:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lnm/m;->t:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public a()V
    .locals 2

    iget-object v0, p0, Lnm/m;->u:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lnm/m;->t:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final o()Landroid/content/Context;
    .locals 2

    iget-object v0, p0, Lnm/m;->e:Landroid/content/Context;

    if-nez v0, :cond_0

    const-string v0, "context"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getApplicationContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 4

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getApplicationContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lnm/m;->e:Landroid/content/Context;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v0

    const-string v1, "getBinaryMessenger(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lnm/m;->f:Lio/flutter/plugin/common/BinaryMessenger;

    new-instance v0, Lom/l;

    invoke-direct {v0, p0}, Lom/l;-><init>(Lnm/m;)V

    iput-object v0, p0, Lnm/m;->r:Lom/l;

    new-instance v0, Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v1

    const-string v2, "xyz.luan/audioplayers"

    invoke-direct {v0, v1, v2}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object v0, p0, Lnm/m;->b:Lio/flutter/plugin/common/MethodChannel;

    new-instance v1, Lnm/b;

    invoke-direct {v1, p0}, Lnm/b;-><init>(Lnm/m;)V

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    new-instance v0, Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v1

    const-string v2, "xyz.luan/audioplayers.global"

    invoke-direct {v0, v1, v2}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    iput-object v0, p0, Lnm/m;->c:Lio/flutter/plugin/common/MethodChannel;

    new-instance v1, Lnm/d;

    invoke-direct {v1, p0}, Lnm/d;-><init>(Lnm/m;)V

    invoke-virtual {v0, v1}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    new-instance v0, Lnm/m$a;

    iget-object v1, p0, Lnm/m;->s:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v2, p0, Lnm/m;->b:Lio/flutter/plugin/common/MethodChannel;

    if-nez v2, :cond_0

    const-string v2, "methods"

    invoke-static {v2}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    const/4 v2, 0x0

    :cond_0
    iget-object v3, p0, Lnm/m;->t:Landroid/os/Handler;

    invoke-direct {v0, v1, v2, v3, p0}, Lnm/m$a;-><init>(Ljava/util/concurrent/ConcurrentMap;Lio/flutter/plugin/common/MethodChannel;Landroid/os/Handler;Lnm/q;)V

    iput-object v0, p0, Lnm/m;->u:Ljava/lang/Runnable;

    new-instance v0, Lnm/p;

    new-instance v1, Lio/flutter/plugin/common/EventChannel;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object p1

    const-string v2, "xyz.luan/audioplayers.global/events"

    invoke-direct {v1, p1, v2}, Lio/flutter/plugin/common/EventChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lnm/p;-><init>(Lio/flutter/plugin/common/EventChannel;)V

    iput-object v0, p0, Lnm/m;->d:Lnm/p;

    return-void
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 2

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lnm/m;->a()V

    iget-object p1, p0, Lnm/m;->t:Landroid/os/Handler;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iput-object v0, p0, Lnm/m;->u:Ljava/lang/Runnable;

    iget-object p1, p0, Lnm/m;->s:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    const-string v1, "<get-values>(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lom/o;

    invoke-virtual {v1}, Lom/o;->e()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lnm/m;->s:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object p1, p0, Lnm/m;->a:Lzk/k0;

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lzk/l0;->d(Lzk/k0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    iget-object p1, p0, Lnm/m;->r:Lom/l;

    if-nez p1, :cond_1

    const-string p1, "soundPoolManager"

    invoke-static {p1}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    move-object p1, v0

    :cond_1
    invoke-virtual {p1}, Lom/l;->d()V

    iget-object p1, p0, Lnm/m;->d:Lnm/p;

    if-nez p1, :cond_2

    const-string p1, "globalEvents"

    invoke-static {p1}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    move-object v0, p1

    :goto_1
    invoke-virtual {v0}, Lnm/p;->a()V

    return-void
.end method

.method public final p()Landroid/media/AudioManager;
    .locals 2

    iget-object v0, p0, Lnm/m;->e:Landroid/content/Context;

    if-nez v0, :cond_0

    const-string v0, "context"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.media.AudioManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/media/AudioManager;

    return-object v0
.end method

.method public final s(Lom/o;)V
    .locals 2

    const-string v0, "player"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lnm/m;->t:Landroid/os/Handler;

    new-instance v1, Lnm/l;

    invoke-direct {v1, p1}, Lnm/l;-><init>(Lom/o;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final u(Lom/o;)V
    .locals 2

    const-string v0, "player"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lnm/m;->t:Landroid/os/Handler;

    new-instance v1, Lnm/g;

    invoke-direct {v1, p1}, Lnm/g;-><init>(Lom/o;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final w(Lom/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    const-string v0, "player"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lnm/m;->t:Landroid/os/Handler;

    new-instance v1, Lnm/i;

    invoke-direct {v1, p1, p2, p3, p4}, Lnm/i;-><init>(Lom/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lnm/m;->t:Landroid/os/Handler;

    new-instance v1, Lnm/h;

    invoke-direct {v1, p0, p1, p2, p3}, Lnm/h;-><init>(Lnm/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
