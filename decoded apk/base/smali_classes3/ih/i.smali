.class public Lih/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final k:Ljava/lang/String; = "i"


# instance fields
.field private a:Ljh/g;

.field private b:Landroid/os/HandlerThread;

.field private c:Landroid/os/Handler;

.field private d:Lih/f;

.field private e:Landroid/os/Handler;

.field private f:Landroid/graphics/Rect;

.field private g:Z

.field private final h:Ljava/lang/Object;

.field private final i:Landroid/os/Handler$Callback;

.field private final j:Ljh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljh/g;Lih/f;Landroid/os/Handler;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lih/i;->g:Z

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lih/i;->h:Ljava/lang/Object;

    new-instance v0, Lih/i$a;

    invoke-direct {v0, p0}, Lih/i$a;-><init>(Lih/i;)V

    iput-object v0, p0, Lih/i;->i:Landroid/os/Handler$Callback;

    new-instance v0, Lih/i$b;

    invoke-direct {v0, p0}, Lih/i$b;-><init>(Lih/i;)V

    iput-object v0, p0, Lih/i;->j:Ljh/p;

    invoke-static {}, Lih/r;->a()V

    iput-object p1, p0, Lih/i;->a:Ljh/g;

    iput-object p2, p0, Lih/i;->d:Lih/f;

    iput-object p3, p0, Lih/i;->e:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lih/i;Lih/q;)V
    .locals 0

    invoke-direct {p0, p1}, Lih/i;->g(Lih/q;)V

    return-void
.end method

.method static synthetic b(Lih/i;)V
    .locals 0

    invoke-direct {p0}, Lih/i;->h()V

    return-void
.end method

.method static synthetic c(Lih/i;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lih/i;->h:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic d(Lih/i;)Z
    .locals 0

    iget-boolean p0, p0, Lih/i;->g:Z

    return p0
.end method

.method static synthetic e(Lih/i;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lih/i;->c:Landroid/os/Handler;

    return-object p0
.end method

.method private g(Lih/q;)V
    .locals 8

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lih/i;->f:Landroid/graphics/Rect;

    invoke-virtual {p1, v2}, Lih/q;->d(Landroid/graphics/Rect;)V

    invoke-virtual {p0, p1}, Lih/i;->f(Lih/q;)Ldg/j;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v3, p0, Lih/i;->d:Lih/f;

    invoke-virtual {v3, v2}, Lih/f;->c(Ldg/j;)Ldg/q;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sget-object v5, Lih/i;->k:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Found barcode in "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sub-long/2addr v3, v0

    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " ms"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lih/i;->e:Landroid/os/Handler;

    if-eqz v0, :cond_2

    new-instance v0, Lih/b;

    invoke-direct {v0, v2, p1}, Lih/b;-><init>(Ldg/q;Lih/q;)V

    iget-object v1, p0, Lih/i;->e:Landroid/os/Handler;

    sget v2, Lig/k;->g:I

    invoke-static {v1, v2, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lih/i;->e:Landroid/os/Handler;

    if-eqz v0, :cond_2

    sget v1, Lig/k;->f:I

    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    :goto_1
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    :cond_2
    iget-object v0, p0, Lih/i;->e:Landroid/os/Handler;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lih/i;->d:Lih/f;

    invoke-virtual {v0}, Lih/f;->d()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p1}, Lih/b;->f(Ljava/util/List;Lih/q;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lih/i;->e:Landroid/os/Handler;

    sget v1, Lig/k;->h:I

    invoke-static {v0, v1, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :cond_3
    invoke-direct {p0}, Lih/i;->h()V

    return-void
.end method

.method private h()V
    .locals 2

    iget-object v0, p0, Lih/i;->a:Ljh/g;

    iget-object v1, p0, Lih/i;->j:Ljh/p;

    invoke-virtual {v0, v1}, Ljh/g;->v(Ljh/p;)V

    return-void
.end method


# virtual methods
.method protected f(Lih/q;)Ldg/j;
    .locals 1

    iget-object v0, p0, Lih/i;->f:Landroid/graphics/Rect;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lih/q;->a()Ldg/n;

    move-result-object p1

    return-object p1
.end method

.method public i(Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Lih/i;->f:Landroid/graphics/Rect;

    return-void
.end method

.method public j(Lih/f;)V
    .locals 0

    iput-object p1, p0, Lih/i;->d:Lih/f;

    return-void
.end method

.method public k()V
    .locals 3

    invoke-static {}, Lih/r;->a()V

    new-instance v0, Landroid/os/HandlerThread;

    sget-object v1, Lih/i;->k:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lih/i;->b:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lih/i;->b:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    iget-object v2, p0, Lih/i;->i:Landroid/os/Handler$Callback;

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lih/i;->c:Landroid/os/Handler;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lih/i;->g:Z

    invoke-direct {p0}, Lih/i;->h()V

    return-void
.end method

.method public l()V
    .locals 3

    invoke-static {}, Lih/r;->a()V

    iget-object v0, p0, Lih/i;->h:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v1, p0, Lih/i;->g:Z

    iget-object v1, p0, Lih/i;->c:Landroid/os/Handler;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v1, p0, Lih/i;->b:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->quit()Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
