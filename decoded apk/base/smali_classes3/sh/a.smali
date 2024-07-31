.class public final Lsh/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/os/Handler;

.field private b:Ljava/lang/Runnable;

.field private c:Lio/flutter/plugin/common/MethodChannel;

.field private d:Landroid/content/Context;

.field private e:Lt6/y;

.field private f:Lt6/j3$d;

.field private g:Z

.field private h:Lsh/f;

.field private i:Ljava/lang/String;

.field private j:Lsh/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/flutter/plugin/common/MethodChannel;Ljava/lang/String;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "playerKey"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lsh/a;->a:Landroid/os/Handler;

    iput-object p2, p0, Lsh/a;->c:Lio/flutter/plugin/common/MethodChannel;

    iput-object p1, p0, Lsh/a;->d:Landroid/content/Context;

    sget-object p1, Lsh/f;->Stop:Lsh/f;

    iput-object p1, p0, Lsh/a;->h:Lsh/f;

    iput-object p3, p0, Lsh/a;->i:Ljava/lang/String;

    sget-object p1, Lsh/h;->Low:Lsh/h;

    iput-object p1, p0, Lsh/a;->j:Lsh/h;

    return-void
.end method

.method public static final synthetic a(Lsh/a;)Lsh/f;
    .locals 0

    iget-object p0, p0, Lsh/a;->h:Lsh/f;

    return-object p0
.end method

.method public static final synthetic b(Lsh/a;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lsh/a;->a:Landroid/os/Handler;

    return-object p0
.end method

.method public static final synthetic c(Lsh/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lsh/a;->i:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic d(Lsh/a;)Lio/flutter/plugin/common/MethodChannel;
    .locals 0

    iget-object p0, p0, Lsh/a;->c:Lio/flutter/plugin/common/MethodChannel;

    return-object p0
.end method

.method public static final synthetic e(Lsh/a;)Lt6/y;
    .locals 0

    iget-object p0, p0, Lsh/a;->e:Lt6/y;

    return-object p0
.end method

.method public static final synthetic f(Lsh/a;)Lsh/h;
    .locals 0

    iget-object p0, p0, Lsh/a;->j:Lsh/h;

    return-object p0
.end method

.method public static final synthetic g(Lsh/a;)Z
    .locals 0

    iget-boolean p0, p0, Lsh/a;->g:Z

    return p0
.end method

.method public static final synthetic h(Lsh/a;Lt6/y;)V
    .locals 0

    iput-object p1, p0, Lsh/a;->e:Lt6/y;

    return-void
.end method

.method public static final synthetic i(Lsh/a;Z)V
    .locals 0

    iput-boolean p1, p0, Lsh/a;->g:Z

    return-void
.end method

.method public static final synthetic j(Lsh/a;)V
    .locals 0

    invoke-direct {p0}, Lsh/a;->u()V

    return-void
.end method

.method private final s(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    new-instance v0, Lsh/a$b;

    invoke-direct {v0, p0, p1}, Lsh/a$b;-><init>(Lsh/a;Lio/flutter/plugin/common/MethodChannel$Result;)V

    iput-object v0, p0, Lsh/a;->b:Ljava/lang/Runnable;

    iget-object p1, p0, Lsh/a;->a:Landroid/os/Handler;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private final u()V
    .locals 2

    iget-object v0, p0, Lsh/a;->b:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lsh/a;->a:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final k(Lio/flutter/plugin/common/MethodChannel$Result;Lsh/d;)V
    .locals 2

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "durationType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Lsh/d;->Current:Lsh/d;

    const/4 v1, 0x0

    if-ne p2, v0, :cond_1

    iget-object p2, p0, Lsh/a;->e:Lt6/y;

    if-eqz p2, :cond_0

    invoke-interface {p2}, Lt6/j3;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {p1, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-object p2, p0, Lsh/a;->e:Lt6/y;

    if-eqz p2, :cond_0

    invoke-interface {p2}, Lt6/j3;->getDuration()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    const-string v0, "Can not get duration"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "AudioWaveforms"

    invoke-interface {p1, v1, v0, p2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public final l(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-direct {p0}, Lsh/a;->u()V

    iget-object v0, p0, Lsh/a;->e:Lt6/y;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lt6/j3;->pause()V

    :cond_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to pause the player"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "AudioWaveforms"

    invoke-interface {p1, v2, v1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final m(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;Ljava/lang/Float;Lsh/h;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "frequency"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_2

    iput-object p4, p0, Lsh/a;->j:Lsh/h;

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-static {p2}, Lt6/c2;->e(Landroid/net/Uri;)Lt6/c2;

    move-result-object p2

    const-string p4, "fromUri(...)"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p4, Lt6/y$b;

    iget-object v0, p0, Lsh/a;->d:Landroid/content/Context;

    invoke-direct {p4, v0}, Lt6/y$b;-><init>(Landroid/content/Context;)V

    invoke-virtual {p4}, Lt6/y$b;->e()Lt6/y;

    move-result-object p4

    iput-object p4, p0, Lsh/a;->e:Lt6/y;

    if-eqz p4, :cond_0

    invoke-interface {p4, p2}, Lt6/j3;->v(Lt6/c2;)V

    :cond_0
    iget-object p2, p0, Lsh/a;->e:Lt6/y;

    if-eqz p2, :cond_1

    invoke-interface {p2}, Lt6/j3;->a()V

    :cond_1
    new-instance p2, Lsh/a$a;

    invoke-direct {p2, p0, p3, p1}, Lsh/a$a;-><init>(Lsh/a;Ljava/lang/Float;Lio/flutter/plugin/common/MethodChannel$Result;)V

    iput-object p2, p0, Lsh/a;->f:Lt6/j3$d;

    iget-object p1, p0, Lsh/a;->e:Lt6/y;

    if-eqz p1, :cond_3

    invoke-static {p2}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-interface {p1, p2}, Lt6/j3;->s(Lt6/j3$d;)V

    goto :goto_0

    :cond_2
    const-string p2, "path to audio file or unique key can\'t be null"

    const-string p3, ""

    const-string p4, "AudioWaveforms"

    invoke-interface {p1, p4, p2, p3}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final n(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lsh/a;->e:Lt6/y;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lt6/j3;->release()V

    :cond_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to release player resource"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "AudioWaveforms"

    invoke-interface {p1, v2, v1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final o(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Long;)V
    .locals 3

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    iget-object v0, p0, Lsh/a;->e:Lt6/y;

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lt6/j3;->z(J)V

    :cond_0
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_1
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    invoke-interface {p1, p2}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method

.method public final p(Ljava/lang/Float;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    :try_start_0
    iget-object v0, p0, Lsh/a;->e:Lt6/y;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-interface {v0, p1}, Lt6/j3;->A(F)V

    :cond_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_0
    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public final q(Ljava/lang/Float;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    :try_start_0
    iget-object v0, p0, Lsh/a;->e:Lt6/y;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-interface {v0, p1}, Lt6/j3;->setVolume(F)V

    :goto_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_1
    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    :goto_2
    return-void
.end method

.method public final r(Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/Integer;)V
    .locals 2

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-nez v1, :cond_0

    sget-object p2, Lsh/f;->Loop:Lsh/f;

    :goto_0
    iput-object p2, p0, Lsh/a;->h:Lsh/f;

    goto :goto_1

    :catch_0
    move-exception p2

    goto :goto_3

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-ne p2, v0, :cond_1

    sget-object p2, Lsh/f;->Pause:Lsh/f;

    goto :goto_0

    :cond_1
    sget-object p2, Lsh/f;->Stop:Lsh/f;

    goto :goto_0

    :goto_1
    iget-object p2, p0, Lsh/a;->e:Lt6/y;

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p2, v0}, Lt6/j3;->k(Z)V

    :goto_2
    iget-object p2, p0, Lsh/a;->e:Lt6/y;

    if-eqz p2, :cond_3

    invoke-interface {p2}, Lt6/j3;->d()V

    :cond_3
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, p2}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lsh/a;->s(Lio/flutter/plugin/common/MethodChannel$Result;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :goto_3
    const-string v0, "Can not start the player"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "AudioWaveforms"

    invoke-interface {p1, v1, v0, p2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_4
    return-void
.end method

.method public final t(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 2

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lsh/a;->u()V

    iget-object v0, p0, Lsh/a;->f:Lt6/j3$d;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lsh/a;->e:Lt6/y;

    if-eqz v1, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-interface {v1, v0}, Lt6/j3;->t(Lt6/j3$d;)V

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lsh/a;->g:Z

    iget-object v0, p0, Lsh/a;->e:Lt6/y;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lt6/j3;->stop()V

    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    return-void
.end method
