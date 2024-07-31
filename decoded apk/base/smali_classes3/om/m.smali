.class public final Lom/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lom/j;


# instance fields
.field private final a:Lom/o;

.field private final b:Lom/l;

.field private c:Ljava/lang/Integer;

.field private d:Ljava/lang/Integer;

.field private e:Lnm/a;

.field private f:Lom/n;

.field private g:Lpm/c;


# direct methods
.method public constructor <init>(Lom/o;Lom/l;)V
    .locals 1

    const-string v0, "wrappedPlayer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "soundPoolManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lom/m;->a:Lom/o;

    iput-object p2, p0, Lom/m;->b:Lom/l;

    invoke-virtual {p1}, Lom/o;->h()Lnm/a;

    move-result-object p1

    iput-object p1, p0, Lom/m;->e:Lnm/a;

    const/16 v0, 0x20

    invoke-virtual {p2, v0, p1}, Lom/l;->b(ILnm/a;)V

    iget-object p1, p0, Lom/m;->e:Lnm/a;

    invoke-virtual {p2, p1}, Lom/l;->e(Lnm/a;)Lom/n;

    move-result-object p1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lom/m;->f:Lom/n;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Could not create SoundPool "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lom/m;->e:Lnm/a;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final m()Landroid/media/SoundPool;
    .locals 1

    iget-object v0, p0, Lom/m;->f:Lom/n;

    invoke-virtual {v0}, Lom/n;->c()Landroid/media/SoundPool;

    move-result-object v0

    return-object v0
.end method

.method private final p(Z)I
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final q(Lnm/a;)V
    .locals 3

    iget-object v0, p0, Lom/m;->e:Lnm/a;

    invoke-virtual {v0}, Lnm/a;->a()Landroid/media/AudioAttributes;

    move-result-object v0

    invoke-virtual {p1}, Lnm/a;->a()Landroid/media/AudioAttributes;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lom/m;->release()V

    iget-object v0, p0, Lom/m;->b:Lom/l;

    const/16 v1, 0x20

    invoke-virtual {v0, v1, p1}, Lom/l;->b(ILnm/a;)V

    iget-object v0, p0, Lom/m;->b:Lom/l;

    invoke-virtual {v0, p1}, Lom/l;->e(Lnm/a;)Lom/n;

    move-result-object v0

    if-eqz v0, :cond_0

    iput-object v0, p0, Lom/m;->f:Lom/n;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not create SoundPool "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iput-object p1, p0, Lom/m;->e:Lnm/a;

    return-void
.end method

.method private final s(Ljava/lang/String;)Ljava/lang/Void;
    .locals 3

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "LOW_LATENCY mode does not support: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b()Ljava/lang/Void;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public c()Ljava/lang/Void;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lom/m;->c:Ljava/lang/Integer;

    return-object v0
.end method

.method public bridge synthetic e()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lom/m;->b()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public f(Lnm/a;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lom/m;->q(Lnm/a;)V

    return-void
.end method

.method public g(Lpm/b;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Lpm/b;->b(Lom/m;)V

    return-void
.end method

.method public bridge synthetic getDuration()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lom/m;->c()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public h(Z)V
    .locals 2

    iget-object v0, p0, Lom/m;->d:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-direct {p0}, Lom/m;->m()Landroid/media/SoundPool;

    move-result-object v1

    invoke-direct {p0, p1}, Lom/m;->p(Z)I

    move-result p1

    invoke-virtual {v1, v0, p1}, Landroid/media/SoundPool;->setLoop(II)V

    :cond_0
    return-void
.end method

.method public i()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public j(FF)V
    .locals 2

    iget-object v0, p0, Lom/m;->d:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-direct {p0}, Lom/m;->m()Landroid/media/SoundPool;

    move-result-object v1

    invoke-virtual {v1, v0, p1, p2}, Landroid/media/SoundPool;->setVolume(IFF)V

    :cond_0
    return-void
.end method

.method public k()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public l(F)V
    .locals 2

    iget-object v0, p0, Lom/m;->d:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-direct {p0}, Lom/m;->m()Landroid/media/SoundPool;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Landroid/media/SoundPool;->setRate(IF)V

    :cond_0
    return-void
.end method

.method public final n()Lpm/c;
    .locals 1

    iget-object v0, p0, Lom/m;->g:Lpm/c;

    return-object v0
.end method

.method public final o()Lom/o;
    .locals 1

    iget-object v0, p0, Lom/m;->a:Lom/o;

    return-object v0
.end method

.method public pause()V
    .locals 2

    iget-object v0, p0, Lom/m;->d:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-direct {p0}, Lom/m;->m()Landroid/media/SoundPool;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/media/SoundPool;->pause(I)V

    :cond_0
    return-void
.end method

.method public final r(Lpm/c;)V
    .locals 8

    if-eqz p1, :cond_2

    iget-object v0, p0, Lom/m;->f:Lom/n;

    invoke-virtual {v0}, Lom/n;->d()Ljava/util/Map;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lom/m;->f:Lom/n;

    invoke-virtual {v1}, Lom/n;->d()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v2, Ljava/util/List;

    invoke-static {v2}, Ldk/p;->H(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lom/m;

    if-eqz v1, :cond_1

    iget-object v3, v1, Lom/m;->a:Lom/o;

    invoke-virtual {v3}, Lom/o;->n()Z

    move-result v3

    iget-object v4, p0, Lom/m;->a:Lom/o;

    invoke-virtual {v4, v3}, Lom/o;->H(Z)V

    iget-object v1, v1, Lom/m;->c:Ljava/lang/Integer;

    iput-object v1, p0, Lom/m;->c:Ljava/lang/Integer;

    iget-object v1, p0, Lom/m;->a:Lom/o;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Reusing soundId "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lom/m;->c:Ljava/lang/Integer;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " for "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " is prepared="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v3, 0x20

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_0
    invoke-virtual {v1, v3}, Lom/o;->r(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-object v1, p0, Lom/m;->a:Lom/o;

    const/4 v5, 0x0

    invoke-virtual {v1, v5}, Lom/o;->H(Z)V

    iget-object v1, p0, Lom/m;->a:Lom/o;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Fetching actual URL for "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lom/o;->r(Ljava/lang/String;)V

    invoke-virtual {p1}, Lpm/c;->d()Ljava/lang/String;

    move-result-object v1

    iget-object v5, p0, Lom/m;->a:Lom/o;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Now loading "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lom/o;->r(Ljava/lang/String;)V

    invoke-direct {p0}, Lom/m;->m()Landroid/media/SoundPool;

    move-result-object v5

    const/4 v6, 0x1

    invoke-virtual {v5, v1, v6}, Landroid/media/SoundPool;->load(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget-object v6, p0, Lom/m;->f:Lom/n;

    invoke-virtual {v6}, Lom/n;->b()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p0, Lom/m;->c:Ljava/lang/Integer;

    iget-object v1, p0, Lom/m;->a:Lom/o;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "time to call load() for "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, ": "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long/2addr v6, v3

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, " player="

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto/16 :goto_0

    :goto_1
    invoke-interface {v2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    goto :goto_2

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_2
    :goto_2
    iput-object p1, p0, Lom/m;->g:Lpm/c;

    return-void
.end method

.method public release()V
    .locals 5

    invoke-virtual {p0}, Lom/m;->stop()V

    iget-object v0, p0, Lom/m;->c:Ljava/lang/Integer;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lom/m;->g:Lpm/c;

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v2, p0, Lom/m;->f:Lom/n;

    invoke-virtual {v2}, Lom/n;->d()Ljava/util/Map;

    move-result-object v2

    monitor-enter v2

    :try_start_0
    iget-object v3, p0, Lom/m;->f:Lom/n;

    invoke-virtual {v3}, Lom/n;->d()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_1

    monitor-exit v2

    return-void

    :cond_1
    :try_start_1
    invoke-static {v3}, Ldk/p;->X(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, p0, :cond_2

    iget-object v3, p0, Lom/m;->f:Lom/n;

    invoke-virtual {v3}, Lom/n;->d()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lom/m;->m()Landroid/media/SoundPool;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/media/SoundPool;->unload(I)Z

    iget-object v1, p0, Lom/m;->f:Lom/n;

    invoke-virtual {v1}, Lom/n;->b()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lom/m;->a:Lom/o;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "unloaded soundId "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lom/o;->r(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-interface {v3, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lom/m;->c:Ljava/lang/Integer;

    invoke-virtual {p0, v0}, Lom/m;->r(Lpm/c;)V

    sget-object v0, Lck/v;->a:Lck/v;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v2

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0

    :cond_3
    return-void
.end method

.method public reset()V
    .locals 0

    return-void
.end method

.method public seekTo(I)V
    .locals 1

    if-nez p1, :cond_1

    iget-object p1, p0, Lom/m;->d:Ljava/lang/Integer;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0}, Lom/m;->stop()V

    iget-object v0, p0, Lom/m;->a:Lom/o;

    invoke-virtual {v0}, Lom/o;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lom/m;->m()Landroid/media/SoundPool;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/media/SoundPool;->resume(I)V

    :cond_0
    return-void

    :cond_1
    const-string p1, "seek"

    invoke-direct {p0, p1}, Lom/m;->s(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lck/e;

    invoke-direct {p1}, Lck/e;-><init>()V

    throw p1
.end method

.method public start()V
    .locals 9

    iget-object v0, p0, Lom/m;->d:Ljava/lang/Integer;

    iget-object v1, p0, Lom/m;->c:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lom/m;->m()Landroid/media/SoundPool;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/media/SoundPool;->resume(I)V

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    invoke-direct {p0}, Lom/m;->m()Landroid/media/SoundPool;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v0, p0, Lom/m;->a:Lom/o;

    invoke-virtual {v0}, Lom/o;->p()F

    move-result v4

    iget-object v0, p0, Lom/m;->a:Lom/o;

    invoke-virtual {v0}, Lom/o;->p()F

    move-result v5

    const/4 v6, 0x0

    iget-object v0, p0, Lom/m;->a:Lom/o;

    invoke-virtual {v0}, Lom/o;->u()Z

    move-result v0

    invoke-direct {p0, v0}, Lom/m;->p(Z)I

    move-result v7

    iget-object v0, p0, Lom/m;->a:Lom/o;

    invoke-virtual {v0}, Lom/o;->o()F

    move-result v8

    invoke-virtual/range {v2 .. v8}, Landroid/media/SoundPool;->play(IFFIIF)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lom/m;->d:Ljava/lang/Integer;

    :cond_1
    :goto_0
    return-void
.end method

.method public stop()V
    .locals 2

    iget-object v0, p0, Lom/m;->d:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-direct {p0}, Lom/m;->m()Landroid/media/SoundPool;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/media/SoundPool;->stop(I)V

    const/4 v0, 0x0

    iput-object v0, p0, Lom/m;->d:Ljava/lang/Integer;

    :cond_0
    return-void
.end method
