.class public final Lu6/k3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu6/b;
.implements Lu6/l3$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu6/k3$b;,
        Lu6/k3$a;
    }
.end annotation


# instance fields
.field private A:Z

.field private final a:Landroid/content/Context;

.field private final b:Lu6/l3;

.field private final c:Landroid/media/metrics/PlaybackSession;

.field private final d:J

.field private final e:Lt6/d4$d;

.field private final f:Lt6/d4$b;

.field private final g:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private i:Ljava/lang/String;

.field private j:Landroid/media/metrics/PlaybackMetrics$Builder;

.field private k:I

.field private l:I

.field private m:I

.field private n:Lt6/f3;

.field private o:Lu6/k3$b;

.field private p:Lu6/k3$b;

.field private q:Lu6/k3$b;

.field private r:Lt6/u1;

.field private s:Lt6/u1;

.field private t:Lt6/u1;

.field private u:Z

.field private v:I

.field private w:Z

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method private constructor <init>(Landroid/content/Context;Landroid/media/metrics/PlaybackSession;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lu6/k3;->a:Landroid/content/Context;

    iput-object p2, p0, Lu6/k3;->c:Landroid/media/metrics/PlaybackSession;

    new-instance p1, Lt6/d4$d;

    invoke-direct {p1}, Lt6/d4$d;-><init>()V

    iput-object p1, p0, Lu6/k3;->e:Lt6/d4$d;

    new-instance p1, Lt6/d4$b;

    invoke-direct {p1}, Lt6/d4$b;-><init>()V

    iput-object p1, p0, Lu6/k3;->f:Lt6/d4$b;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lu6/k3;->h:Ljava/util/HashMap;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lu6/k3;->g:Ljava/util/HashMap;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iput-wide p1, p0, Lu6/k3;->d:J

    const/4 p1, 0x0

    iput p1, p0, Lu6/k3;->l:I

    iput p1, p0, Lu6/k3;->m:I

    new-instance p1, Lu6/p1;

    invoke-direct {p1}, Lu6/p1;-><init>()V

    iput-object p1, p0, Lu6/k3;->b:Lu6/l3;

    invoke-interface {p1, p0}, Lu6/l3;->d(Lu6/l3$a;)V

    return-void
.end method

.method public static A0(Landroid/content/Context;)Lu6/k3;
    .locals 2

    const-string v0, "media_metrics"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/metrics/MediaMetricsManager;

    if-nez v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Lu6/k3;

    invoke-static {v0}, Lu6/q1;->a(Landroid/media/metrics/MediaMetricsManager;)Landroid/media/metrics/PlaybackSession;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Lu6/k3;-><init>(Landroid/content/Context;Landroid/media/metrics/PlaybackSession;)V

    move-object p0, v1

    :goto_0
    return-object p0
.end method

.method private B0()V
    .locals 7

    iget-object v0, p0, Lu6/k3;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-boolean v2, p0, Lu6/k3;->A:Z

    if-eqz v2, :cond_3

    iget v2, p0, Lu6/k3;->z:I

    invoke-static {v0, v2}, Lu6/t1;->a(Landroid/media/metrics/PlaybackMetrics$Builder;I)Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object v0, p0, Lu6/k3;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    iget v2, p0, Lu6/k3;->x:I

    invoke-static {v0, v2}, Lu6/u1;->a(Landroid/media/metrics/PlaybackMetrics$Builder;I)Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object v0, p0, Lu6/k3;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    iget v2, p0, Lu6/k3;->y:I

    invoke-static {v0, v2}, Lu6/v1;->a(Landroid/media/metrics/PlaybackMetrics$Builder;I)Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object v0, p0, Lu6/k3;->g:Ljava/util/HashMap;

    iget-object v2, p0, Lu6/k3;->i:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    iget-object v2, p0, Lu6/k3;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    const-wide/16 v3, 0x0

    if-nez v0, :cond_0

    move-wide v5, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    :goto_0
    invoke-static {v2, v5, v6}, Lu6/w1;->a(Landroid/media/metrics/PlaybackMetrics$Builder;J)Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object v0, p0, Lu6/k3;->h:Ljava/util/HashMap;

    iget-object v2, p0, Lu6/k3;->i:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    iget-object v2, p0, Lu6/k3;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    if-nez v0, :cond_1

    move-wide v5, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    :goto_1
    invoke-static {v2, v5, v6}, Lu6/x1;->a(Landroid/media/metrics/PlaybackMetrics$Builder;J)Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object v2, p0, Lu6/k3;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v0, v5, v3

    if-lez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    invoke-static {v2, v0}, Lu6/y1;->a(Landroid/media/metrics/PlaybackMetrics$Builder;I)Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object v0, p0, Lu6/k3;->c:Landroid/media/metrics/PlaybackSession;

    iget-object v2, p0, Lu6/k3;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    invoke-static {v2}, Lu6/z1;->a(Landroid/media/metrics/PlaybackMetrics$Builder;)Landroid/media/metrics/PlaybackMetrics;

    move-result-object v2

    invoke-static {v0, v2}, Lu6/a2;->a(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/PlaybackMetrics;)V

    :cond_3
    const/4 v0, 0x0

    iput-object v0, p0, Lu6/k3;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    iput-object v0, p0, Lu6/k3;->i:Ljava/lang/String;

    iput v1, p0, Lu6/k3;->z:I

    iput v1, p0, Lu6/k3;->x:I

    iput v1, p0, Lu6/k3;->y:I

    iput-object v0, p0, Lu6/k3;->r:Lt6/u1;

    iput-object v0, p0, Lu6/k3;->s:Lt6/u1;

    iput-object v0, p0, Lu6/k3;->t:Lt6/u1;

    iput-boolean v1, p0, Lu6/k3;->A:Z

    return-void
.end method

.method private static C0(I)I
    .locals 0

    invoke-static {p0}, Lt8/r0;->V(I)I

    move-result p0

    packed-switch p0, :pswitch_data_0

    const/16 p0, 0x1b

    return p0

    :pswitch_0
    const/16 p0, 0x1a

    return p0

    :pswitch_1
    const/16 p0, 0x19

    return p0

    :pswitch_2
    const/16 p0, 0x1c

    return p0

    :pswitch_3
    const/16 p0, 0x18

    return p0

    :pswitch_data_0
    .packed-switch 0x1772
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static D0(Lcom/google/common/collect/w;)Lx6/m;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/collect/w<",
            "Lt6/i4$a;",
            ">;)",
            "Lx6/m;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/common/collect/w;->m()Lcom/google/common/collect/h1;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt6/i4$a;

    const/4 v1, 0x0

    :goto_0
    iget v2, v0, Lt6/i4$a;->a:I

    if-ge v1, v2, :cond_0

    invoke-virtual {v0, v1}, Lt6/i4$a;->f(I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0, v1}, Lt6/i4$a;->c(I)Lt6/u1;

    move-result-object v2

    iget-object v2, v2, Lt6/u1;->z:Lx6/m;

    if-eqz v2, :cond_1

    return-object v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method private static E0(Lx6/m;)I
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lx6/m;->d:I

    if-ge v0, v1, :cond_3

    invoke-virtual {p0, v0}, Lx6/m;->e(I)Lx6/m$b;

    move-result-object v1

    iget-object v1, v1, Lx6/m$b;->b:Ljava/util/UUID;

    sget-object v2, Lt6/p;->d:Ljava/util/UUID;

    invoke-virtual {v1, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 p0, 0x3

    return p0

    :cond_0
    sget-object v2, Lt6/p;->e:Ljava/util/UUID;

    invoke-virtual {v1, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    sget-object v2, Lt6/p;->c:Ljava/util/UUID;

    invoke-virtual {v1, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 p0, 0x6

    return p0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    const/4 p0, 0x1

    return p0
.end method

.method private static F0(Lt6/f3;Landroid/content/Context;Z)Lu6/k3$a;
    .locals 9

    iget v0, p0, Lt6/f3;->a:I

    const/16 v1, 0x3e9

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    new-instance p0, Lu6/k3$a;

    const/16 p1, 0x14

    invoke-direct {p0, p1, v2}, Lu6/k3$a;-><init>(II)V

    return-object p0

    :cond_0
    instance-of v0, p0, Lt6/x;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    move-object v0, p0

    check-cast v0, Lt6/x;

    iget v3, v0, Lt6/x;->t:I

    if-ne v3, v1, :cond_1

    move v3, v1

    goto :goto_0

    :cond_1
    move v3, v2

    :goto_0
    iget v0, v0, Lt6/x;->x:I

    goto :goto_1

    :cond_2
    move v0, v2

    move v3, v0

    :goto_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    invoke-static {v4}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Throwable;

    instance-of v5, v4, Ljava/io/IOException;

    const/4 v6, 0x3

    const/16 v7, 0x12

    const/16 v8, 0x17

    if-eqz v5, :cond_17

    instance-of v0, v4, Ls8/a0;

    if-eqz v0, :cond_3

    check-cast v4, Ls8/a0;

    iget p0, v4, Ls8/a0;->d:I

    new-instance p1, Lu6/k3$a;

    const/4 p2, 0x5

    invoke-direct {p1, p2, p0}, Lu6/k3$a;-><init>(II)V

    return-object p1

    :cond_3
    instance-of v0, v4, Ls8/z;

    if-nez v0, :cond_15

    instance-of v0, v4, Lt6/b3;

    if-eqz v0, :cond_4

    goto/16 :goto_3

    :cond_4
    instance-of p2, v4, Ls8/y;

    if-nez p2, :cond_10

    instance-of p2, v4, Ls8/n0$a;

    if-eqz p2, :cond_5

    goto/16 :goto_2

    :cond_5
    iget p0, p0, Lt6/f3;->a:I

    const/16 p1, 0x3ea

    const/16 p2, 0x15

    if-ne p0, p1, :cond_6

    new-instance p0, Lu6/k3$a;

    invoke-direct {p0, p2, v2}, Lu6/k3$a;-><init>(II)V

    return-object p0

    :cond_6
    instance-of p0, v4, Lx6/n$a;

    if-eqz p0, :cond_d

    invoke-virtual {v4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Throwable;

    sget p1, Lt8/r0;->a:I

    if-lt p1, p2, :cond_7

    instance-of p2, p0, Landroid/media/MediaDrm$MediaDrmStateException;

    if-eqz p2, :cond_7

    check-cast p0, Landroid/media/MediaDrm$MediaDrmStateException;

    invoke-virtual {p0}, Landroid/media/MediaDrm$MediaDrmStateException;->getDiagnosticInfo()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lt8/r0;->W(Ljava/lang/String;)I

    move-result p0

    invoke-static {p0}, Lu6/k3;->C0(I)I

    move-result p1

    new-instance p2, Lu6/k3$a;

    invoke-direct {p2, p1, p0}, Lu6/k3$a;-><init>(II)V

    return-object p2

    :cond_7
    if-lt p1, v8, :cond_8

    instance-of p2, p0, Landroid/media/MediaDrmResetException;

    if-eqz p2, :cond_8

    new-instance p0, Lu6/k3$a;

    const/16 p1, 0x1b

    invoke-direct {p0, p1, v2}, Lu6/k3$a;-><init>(II)V

    return-object p0

    :cond_8
    if-lt p1, v7, :cond_9

    instance-of p2, p0, Landroid/media/NotProvisionedException;

    if-eqz p2, :cond_9

    new-instance p0, Lu6/k3$a;

    const/16 p1, 0x18

    invoke-direct {p0, p1, v2}, Lu6/k3$a;-><init>(II)V

    return-object p0

    :cond_9
    if-lt p1, v7, :cond_a

    instance-of p1, p0, Landroid/media/DeniedByServerException;

    if-eqz p1, :cond_a

    new-instance p0, Lu6/k3$a;

    const/16 p1, 0x1d

    invoke-direct {p0, p1, v2}, Lu6/k3$a;-><init>(II)V

    return-object p0

    :cond_a
    instance-of p1, p0, Lx6/n0;

    if-eqz p1, :cond_b

    new-instance p0, Lu6/k3$a;

    invoke-direct {p0, v8, v2}, Lu6/k3$a;-><init>(II)V

    return-object p0

    :cond_b
    instance-of p0, p0, Lx6/h$e;

    if-eqz p0, :cond_c

    new-instance p0, Lu6/k3$a;

    const/16 p1, 0x1c

    invoke-direct {p0, p1, v2}, Lu6/k3$a;-><init>(II)V

    return-object p0

    :cond_c
    new-instance p0, Lu6/k3$a;

    const/16 p1, 0x1e

    invoke-direct {p0, p1, v2}, Lu6/k3$a;-><init>(II)V

    return-object p0

    :cond_d
    instance-of p0, v4, Ls8/w$b;

    if-eqz p0, :cond_f

    invoke-virtual {v4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    instance-of p0, p0, Ljava/io/FileNotFoundException;

    if-eqz p0, :cond_f

    invoke-virtual {v4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Throwable;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    sget p1, Lt8/r0;->a:I

    if-lt p1, p2, :cond_e

    instance-of p1, p0, Landroid/system/ErrnoException;

    if-eqz p1, :cond_e

    check-cast p0, Landroid/system/ErrnoException;

    iget p0, p0, Landroid/system/ErrnoException;->errno:I

    sget p1, Landroid/system/OsConstants;->EACCES:I

    if-ne p0, p1, :cond_e

    new-instance p0, Lu6/k3$a;

    const/16 p1, 0x20

    invoke-direct {p0, p1, v2}, Lu6/k3$a;-><init>(II)V

    return-object p0

    :cond_e
    new-instance p0, Lu6/k3$a;

    const/16 p1, 0x1f

    invoke-direct {p0, p1, v2}, Lu6/k3$a;-><init>(II)V

    return-object p0

    :cond_f
    new-instance p0, Lu6/k3$a;

    const/16 p1, 0x9

    invoke-direct {p0, p1, v2}, Lu6/k3$a;-><init>(II)V

    return-object p0

    :cond_10
    :goto_2
    invoke-static {p1}, Lt8/z;->d(Landroid/content/Context;)Lt8/z;

    move-result-object p0

    invoke-virtual {p0}, Lt8/z;->f()I

    move-result p0

    if-ne p0, v1, :cond_11

    new-instance p0, Lu6/k3$a;

    invoke-direct {p0, v6, v2}, Lu6/k3$a;-><init>(II)V

    return-object p0

    :cond_11
    invoke-virtual {v4}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    instance-of p1, p0, Ljava/net/UnknownHostException;

    if-eqz p1, :cond_12

    new-instance p0, Lu6/k3$a;

    const/4 p1, 0x6

    invoke-direct {p0, p1, v2}, Lu6/k3$a;-><init>(II)V

    return-object p0

    :cond_12
    instance-of p0, p0, Ljava/net/SocketTimeoutException;

    if-eqz p0, :cond_13

    new-instance p0, Lu6/k3$a;

    const/4 p1, 0x7

    invoke-direct {p0, p1, v2}, Lu6/k3$a;-><init>(II)V

    return-object p0

    :cond_13
    instance-of p0, v4, Ls8/y;

    if-eqz p0, :cond_14

    check-cast v4, Ls8/y;

    iget p0, v4, Ls8/y;->c:I

    if-ne p0, v1, :cond_14

    new-instance p0, Lu6/k3$a;

    const/4 p1, 0x4

    invoke-direct {p0, p1, v2}, Lu6/k3$a;-><init>(II)V

    return-object p0

    :cond_14
    new-instance p0, Lu6/k3$a;

    const/16 p1, 0x8

    invoke-direct {p0, p1, v2}, Lu6/k3$a;-><init>(II)V

    return-object p0

    :cond_15
    :goto_3
    new-instance p0, Lu6/k3$a;

    if-eqz p2, :cond_16

    const/16 p1, 0xa

    goto :goto_4

    :cond_16
    const/16 p1, 0xb

    :goto_4
    invoke-direct {p0, p1, v2}, Lu6/k3$a;-><init>(II)V

    return-object p0

    :cond_17
    if-eqz v3, :cond_19

    if-eqz v0, :cond_18

    if-ne v0, v1, :cond_19

    :cond_18
    new-instance p0, Lu6/k3$a;

    const/16 p1, 0x23

    invoke-direct {p0, p1, v2}, Lu6/k3$a;-><init>(II)V

    return-object p0

    :cond_19
    if-eqz v3, :cond_1a

    if-ne v0, v6, :cond_1a

    new-instance p0, Lu6/k3$a;

    const/16 p1, 0xf

    invoke-direct {p0, p1, v2}, Lu6/k3$a;-><init>(II)V

    return-object p0

    :cond_1a
    if-eqz v3, :cond_1b

    const/4 p0, 0x2

    if-ne v0, p0, :cond_1b

    new-instance p0, Lu6/k3$a;

    invoke-direct {p0, v8, v2}, Lu6/k3$a;-><init>(II)V

    return-object p0

    :cond_1b
    instance-of p0, v4, Lk7/r$b;

    if-eqz p0, :cond_1c

    check-cast v4, Lk7/r$b;

    iget-object p0, v4, Lk7/r$b;->d:Ljava/lang/String;

    invoke-static {p0}, Lt8/r0;->W(Ljava/lang/String;)I

    move-result p0

    new-instance p1, Lu6/k3$a;

    const/16 p2, 0xd

    invoke-direct {p1, p2, p0}, Lu6/k3$a;-><init>(II)V

    return-object p1

    :cond_1c
    instance-of p0, v4, Lk7/m;

    const/16 p1, 0xe

    if-eqz p0, :cond_1d

    check-cast v4, Lk7/m;

    iget-object p0, v4, Lk7/m;->b:Ljava/lang/String;

    invoke-static {p0}, Lt8/r0;->W(Ljava/lang/String;)I

    move-result p0

    new-instance p2, Lu6/k3$a;

    invoke-direct {p2, p1, p0}, Lu6/k3$a;-><init>(II)V

    return-object p2

    :cond_1d
    instance-of p0, v4, Ljava/lang/OutOfMemoryError;

    if-eqz p0, :cond_1e

    new-instance p0, Lu6/k3$a;

    invoke-direct {p0, p1, v2}, Lu6/k3$a;-><init>(II)V

    return-object p0

    :cond_1e
    instance-of p0, v4, Lv6/v$b;

    if-eqz p0, :cond_1f

    check-cast v4, Lv6/v$b;

    iget p0, v4, Lv6/v$b;->a:I

    new-instance p1, Lu6/k3$a;

    const/16 p2, 0x11

    invoke-direct {p1, p2, p0}, Lu6/k3$a;-><init>(II)V

    return-object p1

    :cond_1f
    instance-of p0, v4, Lv6/v$e;

    if-eqz p0, :cond_20

    check-cast v4, Lv6/v$e;

    iget p0, v4, Lv6/v$e;->a:I

    new-instance p1, Lu6/k3$a;

    invoke-direct {p1, v7, p0}, Lu6/k3$a;-><init>(II)V

    return-object p1

    :cond_20
    sget p0, Lt8/r0;->a:I

    const/16 p1, 0x10

    if-lt p0, p1, :cond_21

    instance-of p0, v4, Landroid/media/MediaCodec$CryptoException;

    if-eqz p0, :cond_21

    check-cast v4, Landroid/media/MediaCodec$CryptoException;

    invoke-virtual {v4}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    move-result p0

    invoke-static {p0}, Lu6/k3;->C0(I)I

    move-result p1

    new-instance p2, Lu6/k3$a;

    invoke-direct {p2, p1, p0}, Lu6/k3$a;-><init>(II)V

    return-object p2

    :cond_21
    new-instance p0, Lu6/k3$a;

    const/16 p1, 0x16

    invoke-direct {p0, p1, v2}, Lu6/k3$a;-><init>(II)V

    return-object p0
.end method

.method private static G0(Ljava/lang/String;)Landroid/util/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "-"

    invoke-static {p0, v0}, Lt8/r0;->R0(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    aget-object v0, p0, v0

    array-length v1, p0

    const/4 v2, 0x2

    if-lt v1, v2, :cond_0

    const/4 v1, 0x1

    aget-object p0, p0, v1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-static {v0, p0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method

.method private static I0(Landroid/content/Context;)I
    .locals 0

    invoke-static {p0}, Lt8/z;->d(Landroid/content/Context;)Lt8/z;

    move-result-object p0

    invoke-virtual {p0}, Lt8/z;->f()I

    move-result p0

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const/4 p0, 0x1

    return p0

    :pswitch_1
    const/4 p0, 0x7

    return p0

    :pswitch_2
    const/16 p0, 0x8

    return p0

    :pswitch_3
    const/4 p0, 0x3

    return p0

    :pswitch_4
    const/4 p0, 0x6

    return p0

    :pswitch_5
    const/4 p0, 0x5

    return p0

    :pswitch_6
    const/4 p0, 0x4

    return p0

    :pswitch_7
    const/4 p0, 0x2

    return p0

    :pswitch_8
    const/16 p0, 0x9

    return p0

    :pswitch_9
    const/4 p0, 0x0

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private static J0(Lt6/c2;)I
    .locals 2

    iget-object p0, p0, Lt6/c2;->b:Lt6/c2$h;

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    iget-object v0, p0, Lt6/c2$h;->a:Landroid/net/Uri;

    iget-object p0, p0, Lt6/c2$h;->b:Ljava/lang/String;

    invoke-static {v0, p0}, Lt8/r0;->p0(Landroid/net/Uri;Ljava/lang/String;)I

    move-result p0

    if-eqz p0, :cond_3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v1, 0x2

    if-eq p0, v1, :cond_1

    return v0

    :cond_1
    const/4 p0, 0x4

    return p0

    :cond_2
    const/4 p0, 0x5

    return p0

    :cond_3
    const/4 p0, 0x3

    return p0
.end method

.method private static K0(I)I
    .locals 3

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eq p0, v1, :cond_2

    const/4 v2, 0x3

    if-eq p0, v0, :cond_1

    if-eq p0, v2, :cond_0

    return v1

    :cond_0
    const/4 p0, 0x4

    return p0

    :cond_1
    return v2

    :cond_2
    return v0
.end method

.method private L0(Lu6/b$b;)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lu6/b$b;->d()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-virtual {p1, v0}, Lu6/b$b;->b(I)I

    move-result v1

    invoke-virtual {p1, v1}, Lu6/b$b;->c(I)Lu6/b$a;

    move-result-object v2

    if-nez v1, :cond_0

    iget-object v1, p0, Lu6/k3;->b:Lu6/l3;

    invoke-interface {v1, v2}, Lu6/l3;->g(Lu6/b$a;)V

    goto :goto_1

    :cond_0
    const/16 v3, 0xb

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lu6/k3;->b:Lu6/l3;

    iget v3, p0, Lu6/k3;->k:I

    invoke-interface {v1, v2, v3}, Lu6/l3;->e(Lu6/b$a;I)V

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lu6/k3;->b:Lu6/l3;

    invoke-interface {v1, v2}, Lu6/l3;->f(Lu6/b$a;)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private M0(J)V
    .locals 4

    iget-object v0, p0, Lu6/k3;->a:Landroid/content/Context;

    invoke-static {v0}, Lu6/k3;->I0(Landroid/content/Context;)I

    move-result v0

    iget v1, p0, Lu6/k3;->m:I

    if-eq v0, v1, :cond_0

    iput v0, p0, Lu6/k3;->m:I

    iget-object v1, p0, Lu6/k3;->c:Landroid/media/metrics/PlaybackSession;

    new-instance v2, Landroid/media/metrics/NetworkEvent$Builder;

    invoke-direct {v2}, Landroid/media/metrics/NetworkEvent$Builder;-><init>()V

    invoke-static {v2, v0}, Lu6/c2;->a(Landroid/media/metrics/NetworkEvent$Builder;I)Landroid/media/metrics/NetworkEvent$Builder;

    move-result-object v0

    iget-wide v2, p0, Lu6/k3;->d:J

    sub-long/2addr p1, v2

    invoke-static {v0, p1, p2}, Lu6/d2;->a(Landroid/media/metrics/NetworkEvent$Builder;J)Landroid/media/metrics/NetworkEvent$Builder;

    move-result-object p1

    invoke-static {p1}, Lu6/e2;->a(Landroid/media/metrics/NetworkEvent$Builder;)Landroid/media/metrics/NetworkEvent;

    move-result-object p1

    invoke-static {v1, p1}, Lu6/f2;->a(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/NetworkEvent;)V

    :cond_0
    return-void
.end method

.method private N0(J)V
    .locals 7

    iget-object v0, p0, Lu6/k3;->n:Lt6/f3;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lu6/k3;->a:Landroid/content/Context;

    iget v2, p0, Lu6/k3;->v:I

    const/4 v3, 0x4

    const/4 v4, 0x1

    if-ne v2, v3, :cond_1

    move v2, v4

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-static {v0, v1, v2}, Lu6/k3;->F0(Lt6/f3;Landroid/content/Context;Z)Lu6/k3$a;

    move-result-object v1

    iget-object v2, p0, Lu6/k3;->c:Landroid/media/metrics/PlaybackSession;

    new-instance v3, Landroid/media/metrics/PlaybackErrorEvent$Builder;

    invoke-direct {v3}, Landroid/media/metrics/PlaybackErrorEvent$Builder;-><init>()V

    iget-wide v5, p0, Lu6/k3;->d:J

    sub-long/2addr p1, v5

    invoke-static {v3, p1, p2}, Lu6/b2;->a(Landroid/media/metrics/PlaybackErrorEvent$Builder;J)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    move-result-object p1

    iget p2, v1, Lu6/k3$a;->a:I

    invoke-static {p1, p2}, Lu6/m2;->a(Landroid/media/metrics/PlaybackErrorEvent$Builder;I)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    move-result-object p1

    iget p2, v1, Lu6/k3$a;->b:I

    invoke-static {p1, p2}, Lu6/x2;->a(Landroid/media/metrics/PlaybackErrorEvent$Builder;I)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    move-result-object p1

    invoke-static {p1, v0}, Lu6/e3;->a(Landroid/media/metrics/PlaybackErrorEvent$Builder;Ljava/lang/Exception;)Landroid/media/metrics/PlaybackErrorEvent$Builder;

    move-result-object p1

    invoke-static {p1}, Lu6/f3;->a(Landroid/media/metrics/PlaybackErrorEvent$Builder;)Landroid/media/metrics/PlaybackErrorEvent;

    move-result-object p1

    invoke-static {v2, p1}, Lu6/g3;->a(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/PlaybackErrorEvent;)V

    iput-boolean v4, p0, Lu6/k3;->A:Z

    const/4 p1, 0x0

    iput-object p1, p0, Lu6/k3;->n:Lt6/f3;

    return-void
.end method

.method private O0(Lt6/j3;Lu6/b$b;J)V
    .locals 3

    invoke-interface {p1}, Lt6/j3;->F()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    iput-boolean v2, p0, Lu6/k3;->u:Z

    :cond_0
    invoke-interface {p1}, Lt6/j3;->j()Lt6/f3;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iput-boolean v2, p0, Lu6/k3;->w:Z

    goto :goto_0

    :cond_1
    const/16 v0, 0xa

    invoke-virtual {p2, v0}, Lu6/b$b;->a(I)Z

    move-result p2

    if-eqz p2, :cond_2

    iput-boolean v1, p0, Lu6/k3;->w:Z

    :cond_2
    :goto_0
    invoke-direct {p0, p1}, Lu6/k3;->W0(Lt6/j3;)I

    move-result p1

    iget p2, p0, Lu6/k3;->l:I

    if-eq p2, p1, :cond_3

    iput p1, p0, Lu6/k3;->l:I

    iput-boolean v1, p0, Lu6/k3;->A:Z

    iget-object p1, p0, Lu6/k3;->c:Landroid/media/metrics/PlaybackSession;

    new-instance p2, Landroid/media/metrics/PlaybackStateEvent$Builder;

    invoke-direct {p2}, Landroid/media/metrics/PlaybackStateEvent$Builder;-><init>()V

    iget v0, p0, Lu6/k3;->l:I

    invoke-static {p2, v0}, Lu6/i3;->a(Landroid/media/metrics/PlaybackStateEvent$Builder;I)Landroid/media/metrics/PlaybackStateEvent$Builder;

    move-result-object p2

    iget-wide v0, p0, Lu6/k3;->d:J

    sub-long/2addr p3, v0

    invoke-static {p2, p3, p4}, Lu6/j3;->a(Landroid/media/metrics/PlaybackStateEvent$Builder;J)Landroid/media/metrics/PlaybackStateEvent$Builder;

    move-result-object p2

    invoke-static {p2}, Lu6/r1;->a(Landroid/media/metrics/PlaybackStateEvent$Builder;)Landroid/media/metrics/PlaybackStateEvent;

    move-result-object p2

    invoke-static {p1, p2}, Lu6/s1;->a(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/PlaybackStateEvent;)V

    :cond_3
    return-void
.end method

.method private P0(Lt6/j3;Lu6/b$b;J)V
    .locals 3

    const/4 v0, 0x2

    invoke-virtual {p2, v0}, Lu6/b$b;->a(I)Z

    move-result p2

    const/4 v1, 0x0

    if-eqz p2, :cond_3

    invoke-interface {p1}, Lt6/j3;->m()Lt6/i4;

    move-result-object p1

    invoke-virtual {p1, v0}, Lt6/i4;->d(I)Z

    move-result p2

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lt6/i4;->d(I)Z

    move-result v0

    const/4 v2, 0x3

    invoke-virtual {p1, v2}, Lt6/i4;->d(I)Z

    move-result p1

    if-nez p2, :cond_0

    if-nez v0, :cond_0

    if-eqz p1, :cond_3

    :cond_0
    const/4 v2, 0x0

    if-nez p2, :cond_1

    invoke-direct {p0, p3, p4, v1, v2}, Lu6/k3;->U0(JLt6/u1;I)V

    :cond_1
    if-nez v0, :cond_2

    invoke-direct {p0, p3, p4, v1, v2}, Lu6/k3;->Q0(JLt6/u1;I)V

    :cond_2
    if-nez p1, :cond_3

    invoke-direct {p0, p3, p4, v1, v2}, Lu6/k3;->S0(JLt6/u1;I)V

    :cond_3
    iget-object p1, p0, Lu6/k3;->o:Lu6/k3$b;

    invoke-direct {p0, p1}, Lu6/k3;->z0(Lu6/k3$b;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lu6/k3;->o:Lu6/k3$b;

    iget-object p2, p1, Lu6/k3$b;->a:Lt6/u1;

    iget v0, p2, Lt6/u1;->C:I

    const/4 v2, -0x1

    if-eq v0, v2, :cond_4

    iget p1, p1, Lu6/k3$b;->b:I

    invoke-direct {p0, p3, p4, p2, p1}, Lu6/k3;->U0(JLt6/u1;I)V

    iput-object v1, p0, Lu6/k3;->o:Lu6/k3$b;

    :cond_4
    iget-object p1, p0, Lu6/k3;->p:Lu6/k3$b;

    invoke-direct {p0, p1}, Lu6/k3;->z0(Lu6/k3$b;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lu6/k3;->p:Lu6/k3$b;

    iget-object p2, p1, Lu6/k3$b;->a:Lt6/u1;

    iget p1, p1, Lu6/k3$b;->b:I

    invoke-direct {p0, p3, p4, p2, p1}, Lu6/k3;->Q0(JLt6/u1;I)V

    iput-object v1, p0, Lu6/k3;->p:Lu6/k3$b;

    :cond_5
    iget-object p1, p0, Lu6/k3;->q:Lu6/k3$b;

    invoke-direct {p0, p1}, Lu6/k3;->z0(Lu6/k3$b;)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lu6/k3;->q:Lu6/k3$b;

    iget-object p2, p1, Lu6/k3$b;->a:Lt6/u1;

    iget p1, p1, Lu6/k3$b;->b:I

    invoke-direct {p0, p3, p4, p2, p1}, Lu6/k3;->S0(JLt6/u1;I)V

    iput-object v1, p0, Lu6/k3;->q:Lu6/k3$b;

    :cond_6
    return-void
.end method

.method private Q0(JLt6/u1;I)V
    .locals 6

    iget-object v0, p0, Lu6/k3;->s:Lt6/u1;

    invoke-static {v0, p3}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lu6/k3;->s:Lt6/u1;

    if-nez v0, :cond_1

    if-nez p4, :cond_1

    const/4 p4, 0x1

    :cond_1
    move v5, p4

    iput-object p3, p0, Lu6/k3;->s:Lt6/u1;

    const/4 v1, 0x0

    move-object v0, p0

    move-wide v2, p1

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lu6/k3;->V0(IJLt6/u1;I)V

    return-void
.end method

.method private R0(Lt6/j3;Lu6/b$b;)V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lu6/b$b;->a(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p2, v0}, Lu6/b$b;->c(I)Lu6/b$a;

    move-result-object v0

    iget-object v1, p0, Lu6/k3;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    if-eqz v1, :cond_0

    iget-object v1, v0, Lu6/b$a;->b:Lt6/d4;

    iget-object v0, v0, Lu6/b$a;->d:Lv7/a0$b;

    invoke-direct {p0, v1, v0}, Lu6/k3;->T0(Lt6/d4;Lv7/a0$b;)V

    :cond_0
    const/4 v0, 0x2

    invoke-virtual {p2, v0}, Lu6/b$b;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu6/k3;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lt6/j3;->m()Lt6/i4;

    move-result-object p1

    invoke-virtual {p1}, Lt6/i4;->c()Lcom/google/common/collect/w;

    move-result-object p1

    invoke-static {p1}, Lu6/k3;->D0(Lcom/google/common/collect/w;)Lx6/m;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lu6/k3;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/metrics/PlaybackMetrics$Builder;

    invoke-static {p1}, Lu6/k3;->E0(Lx6/m;)I

    move-result p1

    invoke-static {v0, p1}, Lu6/i2;->a(Landroid/media/metrics/PlaybackMetrics$Builder;I)Landroid/media/metrics/PlaybackMetrics$Builder;

    :cond_1
    const/16 p1, 0x3f3

    invoke-virtual {p2, p1}, Lu6/b$b;->a(I)Z

    move-result p1

    if-eqz p1, :cond_2

    iget p1, p0, Lu6/k3;->z:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lu6/k3;->z:I

    :cond_2
    return-void
.end method

.method private S0(JLt6/u1;I)V
    .locals 6

    iget-object v0, p0, Lu6/k3;->t:Lt6/u1;

    invoke-static {v0, p3}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lu6/k3;->t:Lt6/u1;

    if-nez v0, :cond_1

    if-nez p4, :cond_1

    const/4 p4, 0x1

    :cond_1
    move v5, p4

    iput-object p3, p0, Lu6/k3;->t:Lt6/u1;

    const/4 v1, 0x2

    move-object v0, p0

    move-wide v2, p1

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lu6/k3;->V0(IJLt6/u1;I)V

    return-void
.end method

.method private T0(Lt6/d4;Lv7/a0$b;)V
    .locals 5

    iget-object v0, p0, Lu6/k3;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object p2, p2, Lv7/z;->a:Ljava/lang/Object;

    invoke-virtual {p1, p2}, Lt6/d4;->g(Ljava/lang/Object;)I

    move-result p2

    const/4 v1, -0x1

    if-ne p2, v1, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, Lu6/k3;->f:Lt6/d4$b;

    invoke-virtual {p1, p2, v1}, Lt6/d4;->k(ILt6/d4$b;)Lt6/d4$b;

    iget-object p2, p0, Lu6/k3;->f:Lt6/d4$b;

    iget p2, p2, Lt6/d4$b;->c:I

    iget-object v1, p0, Lu6/k3;->e:Lt6/d4$d;

    invoke-virtual {p1, p2, v1}, Lt6/d4;->s(ILt6/d4$d;)Lt6/d4$d;

    iget-object p1, p0, Lu6/k3;->e:Lt6/d4$d;

    iget-object p1, p1, Lt6/d4$d;->c:Lt6/c2;

    invoke-static {p1}, Lu6/k3;->J0(Lt6/c2;)I

    move-result p1

    invoke-static {v0, p1}, Lu6/b3;->a(Landroid/media/metrics/PlaybackMetrics$Builder;I)Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object p1, p0, Lu6/k3;->e:Lt6/d4$d;

    iget-wide v1, p1, Lt6/d4$d;->y:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, v1, v3

    if-eqz p2, :cond_2

    iget-boolean p2, p1, Lt6/d4$d;->w:Z

    if-nez p2, :cond_2

    iget-boolean p2, p1, Lt6/d4$d;->t:Z

    if-nez p2, :cond_2

    invoke-virtual {p1}, Lt6/d4$d;->i()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lu6/k3;->e:Lt6/d4$d;

    invoke-virtual {p1}, Lt6/d4$d;->g()J

    move-result-wide p1

    invoke-static {v0, p1, p2}, Lu6/c3;->a(Landroid/media/metrics/PlaybackMetrics$Builder;J)Landroid/media/metrics/PlaybackMetrics$Builder;

    :cond_2
    iget-object p1, p0, Lu6/k3;->e:Lt6/d4$d;

    invoke-virtual {p1}, Lt6/d4$d;->i()Z

    move-result p1

    const/4 p2, 0x1

    if-eqz p1, :cond_3

    const/4 p1, 0x2

    goto :goto_0

    :cond_3
    move p1, p2

    :goto_0
    invoke-static {v0, p1}, Lu6/d3;->a(Landroid/media/metrics/PlaybackMetrics$Builder;I)Landroid/media/metrics/PlaybackMetrics$Builder;

    iput-boolean p2, p0, Lu6/k3;->A:Z

    return-void
.end method

.method private U0(JLt6/u1;I)V
    .locals 6

    iget-object v0, p0, Lu6/k3;->r:Lt6/u1;

    invoke-static {v0, p3}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lu6/k3;->r:Lt6/u1;

    if-nez v0, :cond_1

    if-nez p4, :cond_1

    const/4 p4, 0x1

    :cond_1
    move v5, p4

    iput-object p3, p0, Lu6/k3;->r:Lt6/u1;

    const/4 v1, 0x1

    move-object v0, p0

    move-wide v2, p1

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lu6/k3;->V0(IJLt6/u1;I)V

    return-void
.end method

.method private V0(IJLt6/u1;I)V
    .locals 3

    new-instance v0, Landroid/media/metrics/TrackChangeEvent$Builder;

    invoke-direct {v0, p1}, Landroid/media/metrics/TrackChangeEvent$Builder;-><init>(I)V

    iget-wide v1, p0, Lu6/k3;->d:J

    sub-long/2addr p2, v1

    invoke-static {v0, p2, p3}, Lu6/j2;->a(Landroid/media/metrics/TrackChangeEvent$Builder;J)Landroid/media/metrics/TrackChangeEvent$Builder;

    move-result-object p1

    const/4 p2, 0x1

    if-eqz p4, :cond_9

    invoke-static {p1, p2}, Lu6/p2;->a(Landroid/media/metrics/TrackChangeEvent$Builder;I)Landroid/media/metrics/TrackChangeEvent$Builder;

    invoke-static {p5}, Lu6/k3;->K0(I)I

    move-result p3

    invoke-static {p1, p3}, Lu6/s2;->a(Landroid/media/metrics/TrackChangeEvent$Builder;I)Landroid/media/metrics/TrackChangeEvent$Builder;

    iget-object p3, p4, Lt6/u1;->v:Ljava/lang/String;

    if-eqz p3, :cond_0

    invoke-static {p1, p3}, Lu6/t2;->a(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_0
    iget-object p3, p4, Lt6/u1;->w:Ljava/lang/String;

    if-eqz p3, :cond_1

    invoke-static {p1, p3}, Lu6/u2;->a(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_1
    iget-object p3, p4, Lt6/u1;->t:Ljava/lang/String;

    if-eqz p3, :cond_2

    invoke-static {p1, p3}, Lu6/v2;->a(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_2
    iget p3, p4, Lt6/u1;->s:I

    const/4 p5, -0x1

    if-eq p3, p5, :cond_3

    invoke-static {p1, p3}, Lu6/w2;->a(Landroid/media/metrics/TrackChangeEvent$Builder;I)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_3
    iget p3, p4, Lt6/u1;->B:I

    if-eq p3, p5, :cond_4

    invoke-static {p1, p3}, Lu6/y2;->a(Landroid/media/metrics/TrackChangeEvent$Builder;I)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_4
    iget p3, p4, Lt6/u1;->C:I

    if-eq p3, p5, :cond_5

    invoke-static {p1, p3}, Lu6/z2;->a(Landroid/media/metrics/TrackChangeEvent$Builder;I)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_5
    iget p3, p4, Lt6/u1;->J:I

    if-eq p3, p5, :cond_6

    invoke-static {p1, p3}, Lu6/a3;->a(Landroid/media/metrics/TrackChangeEvent$Builder;I)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_6
    iget p3, p4, Lt6/u1;->K:I

    if-eq p3, p5, :cond_7

    invoke-static {p1, p3}, Lu6/k2;->a(Landroid/media/metrics/TrackChangeEvent$Builder;I)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_7
    iget-object p3, p4, Lt6/u1;->c:Ljava/lang/String;

    if-eqz p3, :cond_8

    invoke-static {p3}, Lu6/k3;->G0(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object p3

    iget-object p5, p3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p5, Ljava/lang/String;

    invoke-static {p1, p5}, Lu6/l2;->a(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    iget-object p3, p3, Landroid/util/Pair;->second:Ljava/lang/Object;

    if-eqz p3, :cond_8

    check-cast p3, Ljava/lang/String;

    invoke-static {p1, p3}, Lu6/n2;->a(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_8
    iget p3, p4, Lt6/u1;->D:F

    const/high16 p4, -0x40800000    # -1.0f

    cmpl-float p4, p3, p4

    if-eqz p4, :cond_a

    invoke-static {p1, p3}, Lu6/o2;->a(Landroid/media/metrics/TrackChangeEvent$Builder;F)Landroid/media/metrics/TrackChangeEvent$Builder;

    goto :goto_0

    :cond_9
    const/4 p3, 0x0

    invoke-static {p1, p3}, Lu6/p2;->a(Landroid/media/metrics/TrackChangeEvent$Builder;I)Landroid/media/metrics/TrackChangeEvent$Builder;

    :cond_a
    :goto_0
    iput-boolean p2, p0, Lu6/k3;->A:Z

    iget-object p2, p0, Lu6/k3;->c:Landroid/media/metrics/PlaybackSession;

    invoke-static {p1}, Lu6/q2;->a(Landroid/media/metrics/TrackChangeEvent$Builder;)Landroid/media/metrics/TrackChangeEvent;

    move-result-object p1

    invoke-static {p2, p1}, Lu6/r2;->a(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/TrackChangeEvent;)V

    return-void
.end method

.method private W0(Lt6/j3;)I
    .locals 3

    invoke-interface {p1}, Lt6/j3;->F()I

    move-result v0

    iget-boolean v1, p0, Lu6/k3;->u:Z

    if-eqz v1, :cond_0

    const/4 p1, 0x5

    return p1

    :cond_0
    iget-boolean v1, p0, Lu6/k3;->w:Z

    if-eqz v1, :cond_1

    const/16 p1, 0xd

    return p1

    :cond_1
    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    const/16 p1, 0xb

    return p1

    :cond_2
    const/4 v2, 0x2

    if-ne v0, v2, :cond_7

    iget v0, p0, Lu6/k3;->l:I

    if-eqz v0, :cond_6

    if-ne v0, v2, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {p1}, Lt6/j3;->u()Z

    move-result v0

    if-nez v0, :cond_4

    const/4 p1, 0x7

    return p1

    :cond_4
    invoke-interface {p1}, Lt6/j3;->q()I

    move-result p1

    if-eqz p1, :cond_5

    const/16 p1, 0xa

    goto :goto_0

    :cond_5
    const/4 p1, 0x6

    :goto_0
    return p1

    :cond_6
    :goto_1
    return v2

    :cond_7
    const/4 v2, 0x3

    if-ne v0, v2, :cond_a

    invoke-interface {p1}, Lt6/j3;->u()Z

    move-result v0

    if-nez v0, :cond_8

    return v1

    :cond_8
    invoke-interface {p1}, Lt6/j3;->q()I

    move-result p1

    if-eqz p1, :cond_9

    const/16 v2, 0x9

    :cond_9
    return v2

    :cond_a
    const/4 p1, 0x1

    if-ne v0, p1, :cond_b

    iget p1, p0, Lu6/k3;->l:I

    if-eqz p1, :cond_b

    const/16 p1, 0xc

    return p1

    :cond_b
    iget p1, p0, Lu6/k3;->l:I

    return p1
.end method

.method private z0(Lu6/k3$b;)Z
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p1, Lu6/k3$b;->c:Ljava/lang/String;

    iget-object v0, p0, Lu6/k3;->b:Lu6/l3;

    invoke-interface {v0}, Lu6/l3;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public C(Lu6/b$a;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public H(Lu6/b$a;Lt6/j3$e;Lt6/j3$e;I)V
    .locals 0

    const/4 p1, 0x1

    if-ne p4, p1, :cond_0

    iput-boolean p1, p0, Lu6/k3;->u:Z

    :cond_0
    iput p4, p0, Lu6/k3;->k:I

    return-void
.end method

.method public H0()Landroid/media/metrics/LogSessionId;
    .locals 1

    iget-object v0, p0, Lu6/k3;->c:Landroid/media/metrics/PlaybackSession;

    invoke-static {v0}, Lu6/h3;->a(Landroid/media/metrics/PlaybackSession;)Landroid/media/metrics/LogSessionId;

    move-result-object v0

    return-object v0
.end method

.method public K(Lu6/b$a;Lv7/x;)V
    .locals 5

    iget-object v0, p1, Lu6/b$a;->d:Lv7/a0$b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lu6/k3$b;

    iget-object v1, p2, Lv7/x;->c:Lt6/u1;

    invoke-static {v1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt6/u1;

    iget v2, p2, Lv7/x;->d:I

    iget-object v3, p0, Lu6/k3;->b:Lu6/l3;

    iget-object v4, p1, Lu6/b$a;->b:Lt6/d4;

    iget-object p1, p1, Lu6/b$a;->d:Lv7/a0$b;

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv7/a0$b;

    invoke-interface {v3, v4, p1}, Lu6/l3;->b(Lt6/d4;Lv7/a0$b;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lu6/k3$b;-><init>(Lt6/u1;ILjava/lang/String;)V

    iget p1, p2, Lv7/x;->b:I

    if-eqz p1, :cond_3

    const/4 p2, 0x1

    if-eq p1, p2, :cond_2

    const/4 p2, 0x2

    if-eq p1, p2, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_1

    goto :goto_0

    :cond_1
    iput-object v0, p0, Lu6/k3;->q:Lu6/k3$b;

    goto :goto_0

    :cond_2
    iput-object v0, p0, Lu6/k3;->p:Lu6/k3$b;

    goto :goto_0

    :cond_3
    iput-object v0, p0, Lu6/k3;->o:Lu6/k3$b;

    :goto_0
    return-void
.end method

.method public P(Lu6/b$a;IJJ)V
    .locals 5

    iget-object p5, p1, Lu6/b$a;->d:Lv7/a0$b;

    if-eqz p5, :cond_2

    iget-object p6, p0, Lu6/k3;->b:Lu6/l3;

    iget-object p1, p1, Lu6/b$a;->b:Lt6/d4;

    invoke-static {p5}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lv7/a0$b;

    invoke-interface {p6, p1, p5}, Lu6/l3;->b(Lt6/d4;Lv7/a0$b;)Ljava/lang/String;

    move-result-object p1

    iget-object p5, p0, Lu6/k3;->h:Ljava/util/HashMap;

    invoke-virtual {p5, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/lang/Long;

    iget-object p6, p0, Lu6/k3;->g:Ljava/util/HashMap;

    invoke-virtual {p6, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Ljava/lang/Long;

    iget-object v0, p0, Lu6/k3;->h:Ljava/util/HashMap;

    const-wide/16 v1, 0x0

    if-nez p5, :cond_0

    move-wide v3, v1

    goto :goto_0

    :cond_0
    invoke-virtual {p5}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    :goto_0
    add-long/2addr v3, p3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {v0, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p3, p0, Lu6/k3;->g:Ljava/util/HashMap;

    if-nez p6, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p6}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    :goto_1
    int-to-long p4, p2

    add-long/2addr v1, p4

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public Y(Lu6/b$a;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p1, Lu6/b$a;->d:Lv7/a0$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lv7/z;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lu6/k3;->B0()V

    iput-object p2, p0, Lu6/k3;->i:Ljava/lang/String;

    new-instance p2, Landroid/media/metrics/PlaybackMetrics$Builder;

    invoke-direct {p2}, Landroid/media/metrics/PlaybackMetrics$Builder;-><init>()V

    const-string v0, "ExoPlayerLib"

    invoke-static {p2, v0}, Lu6/g2;->a(Landroid/media/metrics/PlaybackMetrics$Builder;Ljava/lang/String;)Landroid/media/metrics/PlaybackMetrics$Builder;

    move-result-object p2

    const-string v0, "2.18.7"

    invoke-static {p2, v0}, Lu6/h2;->a(Landroid/media/metrics/PlaybackMetrics$Builder;Ljava/lang/String;)Landroid/media/metrics/PlaybackMetrics$Builder;

    move-result-object p2

    iput-object p2, p0, Lu6/k3;->j:Landroid/media/metrics/PlaybackMetrics$Builder;

    iget-object p2, p1, Lu6/b$a;->b:Lt6/d4;

    iget-object p1, p1, Lu6/b$a;->d:Lv7/a0$b;

    invoke-direct {p0, p2, p1}, Lu6/k3;->T0(Lt6/d4;Lv7/a0$b;)V

    return-void
.end method

.method public b0(Lu6/b$a;Ljava/lang/String;Z)V
    .locals 0

    iget-object p1, p1, Lu6/b$a;->d:Lv7/a0$b;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lv7/z;->b()Z

    move-result p1

    if-nez p1, :cond_2

    :cond_0
    iget-object p1, p0, Lu6/k3;->i:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lu6/k3;->B0()V

    :cond_2
    :goto_0
    iget-object p1, p0, Lu6/k3;->g:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lu6/k3;->h:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public c(Lu6/b$a;Lt6/f3;)V
    .locals 0

    iput-object p2, p0, Lu6/k3;->n:Lt6/f3;

    return-void
.end method

.method public j0(Lu6/b$a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public k0(Lt6/j3;Lu6/b$b;)V
    .locals 2

    invoke-virtual {p2}, Lu6/b$b;->d()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p2}, Lu6/k3;->L0(Lu6/b$b;)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    invoke-direct {p0, p1, p2}, Lu6/k3;->R0(Lt6/j3;Lu6/b$b;)V

    invoke-direct {p0, v0, v1}, Lu6/k3;->N0(J)V

    invoke-direct {p0, p1, p2, v0, v1}, Lu6/k3;->P0(Lt6/j3;Lu6/b$b;J)V

    invoke-direct {p0, v0, v1}, Lu6/k3;->M0(J)V

    invoke-direct {p0, p1, p2, v0, v1}, Lu6/k3;->O0(Lt6/j3;Lu6/b$b;J)V

    const/16 p1, 0x404

    invoke-virtual {p2, p1}, Lu6/b$b;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu6/k3;->b:Lu6/l3;

    invoke-virtual {p2, p1}, Lu6/b$b;->c(I)Lu6/b$a;

    move-result-object p1

    invoke-interface {v0, p1}, Lu6/l3;->c(Lu6/b$a;)V

    :cond_1
    return-void
.end method

.method public q(Lu6/b$a;Lw6/e;)V
    .locals 1

    iget p1, p0, Lu6/k3;->x:I

    iget v0, p2, Lw6/e;->g:I

    add-int/2addr p1, v0

    iput p1, p0, Lu6/k3;->x:I

    iget p1, p0, Lu6/k3;->y:I

    iget p2, p2, Lw6/e;->e:I

    add-int/2addr p1, p2

    iput p1, p0, Lu6/k3;->y:I

    return-void
.end method

.method public r0(Lu6/b$a;Lu8/a0;)V
    .locals 3

    iget-object p1, p0, Lu6/k3;->o:Lu6/k3$b;

    if-eqz p1, :cond_0

    iget-object v0, p1, Lu6/k3$b;->a:Lt6/u1;

    iget v1, v0, Lt6/u1;->C:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lt6/u1;->c()Lt6/u1$b;

    move-result-object v0

    iget v1, p2, Lu8/a0;->a:I

    invoke-virtual {v0, v1}, Lt6/u1$b;->n0(I)Lt6/u1$b;

    move-result-object v0

    iget p2, p2, Lu8/a0;->b:I

    invoke-virtual {v0, p2}, Lt6/u1$b;->S(I)Lt6/u1$b;

    move-result-object p2

    invoke-virtual {p2}, Lt6/u1$b;->G()Lt6/u1;

    move-result-object p2

    new-instance v0, Lu6/k3$b;

    iget v1, p1, Lu6/k3$b;->b:I

    iget-object p1, p1, Lu6/k3$b;->c:Ljava/lang/String;

    invoke-direct {v0, p2, v1, p1}, Lu6/k3$b;-><init>(Lt6/u1;ILjava/lang/String;)V

    iput-object v0, p0, Lu6/k3;->o:Lu6/k3$b;

    :cond_0
    return-void
.end method

.method public v(Lu6/b$a;Lv7/u;Lv7/x;Ljava/io/IOException;Z)V
    .locals 0

    iget p1, p3, Lv7/x;->a:I

    iput p1, p0, Lu6/k3;->v:I

    return-void
.end method
