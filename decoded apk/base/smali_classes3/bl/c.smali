.class public final Lbl/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lbl/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbl/i<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:I

.field private static final c:I

.field public static final d:Lel/h0;

.field private static final e:Lel/h0;

.field private static final f:Lel/h0;

.field private static final g:Lel/h0;

.field private static final h:Lel/h0;

.field private static final i:Lel/h0;

.field private static final j:Lel/h0;

.field private static final k:Lel/h0;

.field private static final l:Lel/h0;

.field private static final m:Lel/h0;

.field private static final n:Lel/h0;

.field private static final o:Lel/h0;

.field private static final p:Lel/h0;

.field private static final q:Lel/h0;

.field private static final r:Lel/h0;

.field private static final s:Lel/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v6, Lbl/i;

    const-wide/16 v1, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lbl/i;-><init>(JLbl/i;Lbl/b;I)V

    sput-object v6, Lbl/c;->a:Lbl/i;

    const-string v7, "kotlinx.coroutines.bufferedChannel.segmentSize"

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0xc

    const/4 v12, 0x0

    invoke-static/range {v7 .. v12}, Lel/i0;->g(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, Lbl/c;->b:I

    const-string v1, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations"

    const/16 v2, 0x2710

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xc

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lel/i0;->g(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, Lbl/c;->c:I

    new-instance v0, Lel/h0;

    const-string v1, "BUFFERED"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbl/c;->d:Lel/h0;

    new-instance v0, Lel/h0;

    const-string v1, "SHOULD_BUFFER"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbl/c;->e:Lel/h0;

    new-instance v0, Lel/h0;

    const-string v1, "S_RESUMING_BY_RCV"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbl/c;->f:Lel/h0;

    new-instance v0, Lel/h0;

    const-string v1, "RESUMING_BY_EB"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbl/c;->g:Lel/h0;

    new-instance v0, Lel/h0;

    const-string v1, "POISONED"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbl/c;->h:Lel/h0;

    new-instance v0, Lel/h0;

    const-string v1, "DONE_RCV"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbl/c;->i:Lel/h0;

    new-instance v0, Lel/h0;

    const-string v1, "INTERRUPTED_SEND"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbl/c;->j:Lel/h0;

    new-instance v0, Lel/h0;

    const-string v1, "INTERRUPTED_RCV"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbl/c;->k:Lel/h0;

    new-instance v0, Lel/h0;

    const-string v1, "CHANNEL_CLOSED"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbl/c;->l:Lel/h0;

    new-instance v0, Lel/h0;

    const-string v1, "SUSPEND"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbl/c;->m:Lel/h0;

    new-instance v0, Lel/h0;

    const-string v1, "SUSPEND_NO_WAITER"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbl/c;->n:Lel/h0;

    new-instance v0, Lel/h0;

    const-string v1, "FAILED"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbl/c;->o:Lel/h0;

    new-instance v0, Lel/h0;

    const-string v1, "NO_RECEIVE_RESULT"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbl/c;->p:Lel/h0;

    new-instance v0, Lel/h0;

    const-string v1, "CLOSE_HANDLER_CLOSED"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbl/c;->q:Lel/h0;

    new-instance v0, Lel/h0;

    const-string v1, "CLOSE_HANDLER_INVOKED"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbl/c;->r:Lel/h0;

    new-instance v0, Lel/h0;

    const-string v1, "NO_CLOSE_CAUSE"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbl/c;->s:Lel/h0;

    return-void
.end method

.method private static final A(I)J
    .locals 2

    if-eqz p0, :cond_1

    const v0, 0x7fffffff

    if-eq p0, v0, :cond_0

    int-to-long v0, p0

    goto :goto_0

    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method private static final B(Lzk/m;Ljava/lang/Object;Lok/l;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lzk/m<",
            "-TT;>;TT;",
            "Lok/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lck/v;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p0, p1, v0, p2}, Lzk/m;->l(Ljava/lang/Object;Ljava/lang/Object;Lok/l;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lzk/m;->o(Ljava/lang/Object;)V

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method static synthetic C(Lzk/m;Ljava/lang/Object;Lok/l;ILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lbl/c;->B(Lzk/m;Ljava/lang/Object;Lok/l;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic a(JZ)J
    .locals 0

    invoke-static {p0, p1, p2}, Lbl/c;->v(JZ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic b(JI)J
    .locals 0

    invoke-static {p0, p1, p2}, Lbl/c;->w(JI)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic c(JLbl/i;)Lbl/i;
    .locals 0

    invoke-static {p0, p1, p2}, Lbl/c;->x(JLbl/i;)Lbl/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d()Lel/h0;
    .locals 1

    sget-object v0, Lbl/c;->q:Lel/h0;

    return-object v0
.end method

.method public static final synthetic e()Lel/h0;
    .locals 1

    sget-object v0, Lbl/c;->r:Lel/h0;

    return-object v0
.end method

.method public static final synthetic f()Lel/h0;
    .locals 1

    sget-object v0, Lbl/c;->i:Lel/h0;

    return-object v0
.end method

.method public static final synthetic g()I
    .locals 1

    sget v0, Lbl/c;->c:I

    return v0
.end method

.method public static final synthetic h()Lel/h0;
    .locals 1

    sget-object v0, Lbl/c;->o:Lel/h0;

    return-object v0
.end method

.method public static final synthetic i()Lel/h0;
    .locals 1

    sget-object v0, Lbl/c;->k:Lel/h0;

    return-object v0
.end method

.method public static final synthetic j()Lel/h0;
    .locals 1

    sget-object v0, Lbl/c;->j:Lel/h0;

    return-object v0
.end method

.method public static final synthetic k()Lel/h0;
    .locals 1

    sget-object v0, Lbl/c;->e:Lel/h0;

    return-object v0
.end method

.method public static final synthetic l()Lel/h0;
    .locals 1

    sget-object v0, Lbl/c;->s:Lel/h0;

    return-object v0
.end method

.method public static final synthetic m()Lel/h0;
    .locals 1

    sget-object v0, Lbl/c;->p:Lel/h0;

    return-object v0
.end method

.method public static final synthetic n()Lbl/i;
    .locals 1

    sget-object v0, Lbl/c;->a:Lbl/i;

    return-object v0
.end method

.method public static final synthetic o()Lel/h0;
    .locals 1

    sget-object v0, Lbl/c;->h:Lel/h0;

    return-object v0
.end method

.method public static final synthetic p()Lel/h0;
    .locals 1

    sget-object v0, Lbl/c;->g:Lel/h0;

    return-object v0
.end method

.method public static final synthetic q()Lel/h0;
    .locals 1

    sget-object v0, Lbl/c;->f:Lel/h0;

    return-object v0
.end method

.method public static final synthetic r()Lel/h0;
    .locals 1

    sget-object v0, Lbl/c;->m:Lel/h0;

    return-object v0
.end method

.method public static final synthetic s()Lel/h0;
    .locals 1

    sget-object v0, Lbl/c;->n:Lel/h0;

    return-object v0
.end method

.method public static final synthetic t(I)J
    .locals 2

    invoke-static {p0}, Lbl/c;->A(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic u(Lzk/m;Ljava/lang/Object;Lok/l;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lbl/c;->B(Lzk/m;Ljava/lang/Object;Lok/l;)Z

    move-result p0

    return p0
.end method

.method private static final v(JZ)J
    .locals 2

    if-eqz p2, :cond_0

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    add-long/2addr v0, p0

    return-wide v0
.end method

.method private static final w(JI)J
    .locals 2

    int-to-long v0, p2

    const/16 p2, 0x3c

    shl-long/2addr v0, p2

    add-long/2addr v0, p0

    return-wide v0
.end method

.method private static final x(JLbl/i;)Lbl/i;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(J",
            "Lbl/i<",
            "TE;>;)",
            "Lbl/i<",
            "TE;>;"
        }
    .end annotation

    new-instance v6, Lbl/i;

    invoke-virtual {p2}, Lbl/i;->u()Lbl/b;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, v6

    move-wide v1, p0

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lbl/i;-><init>(JLbl/i;Lbl/b;I)V

    return-object v6
.end method

.method public static final y()Lvk/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Lvk/e<",
            "Lbl/i<",
            "TE;>;>;"
        }
    .end annotation

    sget-object v0, Lbl/c$a;->a:Lbl/c$a;

    return-object v0
.end method

.method public static final z()Lel/h0;
    .locals 1

    sget-object v0, Lbl/c;->l:Lel/h0;

    return-object v0
.end method
