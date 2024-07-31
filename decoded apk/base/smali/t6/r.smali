.class public Lt6/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/a2;


# instance fields
.field private final a:Ls8/o;

.field private final b:J

.field private final c:J

.field private final d:J

.field private final e:J

.field private final f:I

.field private final g:Z

.field private final h:J

.field private final i:Z

.field private j:I

.field private k:Z


# direct methods
.method public constructor <init>()V
    .locals 10

    new-instance v1, Ls8/o;

    const/4 v0, 0x1

    const/high16 v2, 0x10000

    invoke-direct {v1, v0, v2}, Ls8/o;-><init>(ZI)V

    const v2, 0xc350

    const v3, 0xc350

    const/16 v4, 0x9c4

    const/16 v5, 0x1388

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lt6/r;-><init>(Ls8/o;IIIIIZIZ)V

    return-void
.end method

.method protected constructor <init>(Ls8/o;IIIIIZIZ)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "bufferForPlaybackMs"

    const-string v2, "0"

    invoke-static {p4, v0, v1, v2}, Lt6/r;->i(IILjava/lang/String;Ljava/lang/String;)V

    const-string v3, "bufferForPlaybackAfterRebufferMs"

    invoke-static {p5, v0, v3, v2}, Lt6/r;->i(IILjava/lang/String;Ljava/lang/String;)V

    const-string v4, "minBufferMs"

    invoke-static {p2, p4, v4, v1}, Lt6/r;->i(IILjava/lang/String;Ljava/lang/String;)V

    invoke-static {p2, p5, v4, v3}, Lt6/r;->i(IILjava/lang/String;Ljava/lang/String;)V

    const-string v1, "maxBufferMs"

    invoke-static {p3, p2, v1, v4}, Lt6/r;->i(IILjava/lang/String;Ljava/lang/String;)V

    const-string v1, "backBufferDurationMs"

    invoke-static {p8, v0, v1, v2}, Lt6/r;->i(IILjava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lt6/r;->a:Ls8/o;

    int-to-long p1, p2

    invoke-static {p1, p2}, Lt8/r0;->C0(J)J

    move-result-wide p1

    iput-wide p1, p0, Lt6/r;->b:J

    int-to-long p1, p3

    invoke-static {p1, p2}, Lt8/r0;->C0(J)J

    move-result-wide p1

    iput-wide p1, p0, Lt6/r;->c:J

    int-to-long p1, p4

    invoke-static {p1, p2}, Lt8/r0;->C0(J)J

    move-result-wide p1

    iput-wide p1, p0, Lt6/r;->d:J

    int-to-long p1, p5

    invoke-static {p1, p2}, Lt8/r0;->C0(J)J

    move-result-wide p1

    iput-wide p1, p0, Lt6/r;->e:J

    iput p6, p0, Lt6/r;->f:I

    const/4 p1, -0x1

    if-eq p6, p1, :cond_0

    goto :goto_0

    :cond_0
    const/high16 p6, 0xc80000

    :goto_0
    iput p6, p0, Lt6/r;->j:I

    iput-boolean p7, p0, Lt6/r;->g:Z

    int-to-long p1, p8

    invoke-static {p1, p2}, Lt8/r0;->C0(J)J

    move-result-wide p1

    iput-wide p1, p0, Lt6/r;->h:J

    iput-boolean p9, p0, Lt6/r;->i:Z

    return-void
.end method

.method private static i(IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    if-lt p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " cannot be less than "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lt8/a;->b(ZLjava/lang/Object;)V

    return-void
.end method

.method private static k(I)I
    .locals 1

    const/high16 v0, 0x20000

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    :pswitch_1
    return v0

    :pswitch_2
    const/high16 p0, 0x7d00000

    return p0

    :pswitch_3
    const/high16 p0, 0xc80000

    return p0

    :pswitch_4
    const/high16 p0, 0x89a0000

    return p0

    :pswitch_5
    const/4 p0, 0x0

    return p0

    nop

    :pswitch_data_0
    .packed-switch -0x2
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private l(Z)V
    .locals 2

    iget v0, p0, Lt6/r;->f:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/high16 v0, 0xc80000

    :cond_0
    iput v0, p0, Lt6/r;->j:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lt6/r;->k:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lt6/r;->a:Ls8/o;

    invoke-virtual {p1}, Ls8/o;->g()V

    :cond_1
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lt6/r;->i:Z

    return v0
.end method

.method public b()J
    .locals 2

    iget-wide v0, p0, Lt6/r;->h:J

    return-wide v0
.end method

.method public c(JFZJ)Z
    .locals 2

    invoke-static {p1, p2, p3}, Lt8/r0;->f0(JF)J

    move-result-wide p1

    if-eqz p4, :cond_0

    iget-wide p3, p0, Lt6/r;->e:J

    goto :goto_0

    :cond_0
    iget-wide p3, p0, Lt6/r;->d:J

    :goto_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p5, v0

    if-eqz v0, :cond_1

    const-wide/16 v0, 0x2

    div-long/2addr p5, v0

    invoke-static {p5, p6, p3, p4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p3

    :cond_1
    const-wide/16 p5, 0x0

    cmp-long p5, p3, p5

    if-lez p5, :cond_3

    cmp-long p1, p1, p3

    if-gez p1, :cond_3

    iget-boolean p1, p0, Lt6/r;->g:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lt6/r;->a:Ls8/o;

    invoke-virtual {p1}, Ls8/o;->f()I

    move-result p1

    iget p2, p0, Lt6/r;->j:I

    if-lt p1, p2, :cond_2

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 p1, 0x1

    :goto_2
    return p1
.end method

.method public d()Ls8/b;
    .locals 1

    iget-object v0, p0, Lt6/r;->a:Ls8/o;

    return-object v0
.end method

.method public e()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lt6/r;->l(Z)V

    return-void
.end method

.method public f([Lt6/q3;Lv7/f1;[Lq8/r;)V
    .locals 1

    iget p2, p0, Lt6/r;->f:I

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    invoke-virtual {p0, p1, p3}, Lt6/r;->j([Lt6/q3;[Lq8/r;)I

    move-result p2

    :cond_0
    iput p2, p0, Lt6/r;->j:I

    iget-object p1, p0, Lt6/r;->a:Ls8/o;

    invoke-virtual {p1, p2}, Ls8/o;->h(I)V

    return-void
.end method

.method public g()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lt6/r;->l(Z)V

    return-void
.end method

.method public h(JJF)Z
    .locals 6

    iget-object p1, p0, Lt6/r;->a:Ls8/o;

    invoke-virtual {p1}, Ls8/o;->f()I

    move-result p1

    iget p2, p0, Lt6/r;->j:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-lt p1, p2, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    iget-wide v2, p0, Lt6/r;->b:J

    const/high16 p2, 0x3f800000    # 1.0f

    cmpl-float p2, p5, p2

    if-lez p2, :cond_1

    invoke-static {v2, v3, p5}, Lt8/r0;->a0(JF)J

    move-result-wide v2

    iget-wide v4, p0, Lt6/r;->c:J

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    :cond_1
    const-wide/32 v4, 0x7a120

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    cmp-long p2, p3, v2

    if-gez p2, :cond_4

    iget-boolean p2, p0, Lt6/r;->g:Z

    if-nez p2, :cond_3

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    move v0, v1

    :cond_3
    :goto_1
    iput-boolean v0, p0, Lt6/r;->k:Z

    if-nez v0, :cond_6

    cmp-long p1, p3, v4

    if-gez p1, :cond_6

    const-string p1, "DefaultLoadControl"

    const-string p2, "Target buffer size reached with less than 500ms of buffered media data."

    invoke-static {p1, p2}, Lt8/s;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    iget-wide v2, p0, Lt6/r;->c:J

    cmp-long p2, p3, v2

    if-gez p2, :cond_5

    if-eqz p1, :cond_6

    :cond_5
    iput-boolean v1, p0, Lt6/r;->k:Z

    :cond_6
    :goto_2
    iget-boolean p1, p0, Lt6/r;->k:Z

    return p1
.end method

.method protected j([Lt6/q3;[Lq8/r;)I
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v2, p1

    if-ge v0, v2, :cond_1

    aget-object v2, p2, v0

    if-eqz v2, :cond_0

    aget-object v2, p1, v0

    invoke-interface {v2}, Lt6/q3;->g()I

    move-result v2

    invoke-static {v2}, Lt6/r;->k(I)I

    move-result v2

    add-int/2addr v1, v2

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/high16 p1, 0xc80000

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1
.end method

.method public onPrepared()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lt6/r;->l(Z)V

    return-void
.end method
