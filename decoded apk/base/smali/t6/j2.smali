.class final Lt6/j2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lv7/a0$b;

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Z


# direct methods
.method constructor <init>(Lv7/a0$b;JJJJZZZZ)V
    .locals 8

    move-object v0, p0

    move/from16 v1, p10

    move/from16 v2, p11

    move/from16 v3, p12

    move/from16 v4, p13

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v4, :cond_1

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move v7, v5

    goto :goto_1

    :cond_1
    :goto_0
    move v7, v6

    :goto_1
    invoke-static {v7}, Lt8/a;->a(Z)V

    if-eqz v3, :cond_3

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    move v7, v5

    goto :goto_3

    :cond_3
    :goto_2
    move v7, v6

    :goto_3
    invoke-static {v7}, Lt8/a;->a(Z)V

    if-eqz v1, :cond_4

    if-nez v2, :cond_5

    if-nez v3, :cond_5

    if-nez v4, :cond_5

    :cond_4
    move v5, v6

    :cond_5
    invoke-static {v5}, Lt8/a;->a(Z)V

    move-object v5, p1

    iput-object v5, v0, Lt6/j2;->a:Lv7/a0$b;

    move-wide v5, p2

    iput-wide v5, v0, Lt6/j2;->b:J

    move-wide v5, p4

    iput-wide v5, v0, Lt6/j2;->c:J

    move-wide v5, p6

    iput-wide v5, v0, Lt6/j2;->d:J

    move-wide/from16 v5, p8

    iput-wide v5, v0, Lt6/j2;->e:J

    iput-boolean v1, v0, Lt6/j2;->f:Z

    iput-boolean v2, v0, Lt6/j2;->g:Z

    iput-boolean v3, v0, Lt6/j2;->h:Z

    iput-boolean v4, v0, Lt6/j2;->i:Z

    return-void
.end method


# virtual methods
.method public a(J)Lt6/j2;
    .locals 17

    move-object/from16 v0, p0

    iget-wide v1, v0, Lt6/j2;->c:J

    cmp-long v1, p1, v1

    if-nez v1, :cond_0

    move-object v1, v0

    goto :goto_0

    :cond_0
    new-instance v1, Lt6/j2;

    iget-object v4, v0, Lt6/j2;->a:Lv7/a0$b;

    iget-wide v5, v0, Lt6/j2;->b:J

    iget-wide v9, v0, Lt6/j2;->d:J

    iget-wide v11, v0, Lt6/j2;->e:J

    iget-boolean v13, v0, Lt6/j2;->f:Z

    iget-boolean v14, v0, Lt6/j2;->g:Z

    iget-boolean v15, v0, Lt6/j2;->h:Z

    iget-boolean v2, v0, Lt6/j2;->i:Z

    move-object v3, v1

    move-wide/from16 v7, p1

    move/from16 v16, v2

    invoke-direct/range {v3 .. v16}, Lt6/j2;-><init>(Lv7/a0$b;JJJJZZZZ)V

    :goto_0
    return-object v1
.end method

.method public b(J)Lt6/j2;
    .locals 17

    move-object/from16 v0, p0

    iget-wide v1, v0, Lt6/j2;->b:J

    cmp-long v1, p1, v1

    if-nez v1, :cond_0

    move-object v1, v0

    goto :goto_0

    :cond_0
    new-instance v1, Lt6/j2;

    iget-object v4, v0, Lt6/j2;->a:Lv7/a0$b;

    iget-wide v7, v0, Lt6/j2;->c:J

    iget-wide v9, v0, Lt6/j2;->d:J

    iget-wide v11, v0, Lt6/j2;->e:J

    iget-boolean v13, v0, Lt6/j2;->f:Z

    iget-boolean v14, v0, Lt6/j2;->g:Z

    iget-boolean v15, v0, Lt6/j2;->h:Z

    iget-boolean v2, v0, Lt6/j2;->i:Z

    move-object v3, v1

    move-wide/from16 v5, p1

    move/from16 v16, v2

    invoke-direct/range {v3 .. v16}, Lt6/j2;-><init>(Lv7/a0$b;JJJJZZZZ)V

    :goto_0
    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lt6/j2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lt6/j2;

    iget-wide v2, p0, Lt6/j2;->b:J

    iget-wide v4, p1, Lt6/j2;->b:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Lt6/j2;->c:J

    iget-wide v4, p1, Lt6/j2;->c:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Lt6/j2;->d:J

    iget-wide v4, p1, Lt6/j2;->d:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Lt6/j2;->e:J

    iget-wide v4, p1, Lt6/j2;->e:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-boolean v2, p0, Lt6/j2;->f:Z

    iget-boolean v3, p1, Lt6/j2;->f:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lt6/j2;->g:Z

    iget-boolean v3, p1, Lt6/j2;->g:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lt6/j2;->h:Z

    iget-boolean v3, p1, Lt6/j2;->h:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Lt6/j2;->i:Z

    iget-boolean v3, p1, Lt6/j2;->i:Z

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lt6/j2;->a:Lv7/a0$b;

    iget-object p1, p1, Lt6/j2;->a:Lv7/a0$b;

    invoke-static {v2, p1}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lt6/j2;->a:Lv7/a0$b;

    invoke-virtual {v0}, Lv7/z;->hashCode()I

    move-result v0

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Lt6/j2;->b:J

    long-to-int v0, v2

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Lt6/j2;->c:J

    long-to-int v0, v2

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Lt6/j2;->d:J

    long-to-int v0, v2

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Lt6/j2;->e:J

    long-to-int v0, v2

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Lt6/j2;->f:Z

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Lt6/j2;->g:Z

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Lt6/j2;->h:Z

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Lt6/j2;->i:Z

    add-int/2addr v1, v0

    return v1
.end method