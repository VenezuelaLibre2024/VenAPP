.class final La8/i;
.super Lx7/n;
.source "SourceFile"


# static fields
.field private static final M:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field private final A:Z

.field private final B:Z

.field private final C:Lu6/m3;

.field private D:La8/j;

.field private E:La8/p;

.field private F:I

.field private G:Z

.field private volatile H:Z

.field private I:Z

.field private J:Lcom/google/common/collect/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/w<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private K:Z

.field private L:Z

.field public final k:I

.field public final l:I

.field public final m:Landroid/net/Uri;

.field public final n:Z

.field public final o:I

.field private final p:Ls8/j;

.field private final q:Ls8/n;

.field private final r:La8/j;

.field private final s:Z

.field private final t:Z

.field private final u:Lt8/n0;

.field private final v:La8/h;

.field private final w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lt6/u1;",
            ">;"
        }
    .end annotation
.end field

.field private final x:Lx6/m;

.field private final y:Lq7/h;

.field private final z:Lt8/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, La8/i;->M:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method private constructor <init>(La8/h;Ls8/j;Ls8/n;Lt6/u1;ZLs8/j;Ls8/n;ZLandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;JJJIZIZZLt8/n0;Lx6/m;La8/j;Lq7/h;Lt8/e0;ZLu6/m3;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La8/h;",
            "Ls8/j;",
            "Ls8/n;",
            "Lt6/u1;",
            "Z",
            "Ls8/j;",
            "Ls8/n;",
            "Z",
            "Landroid/net/Uri;",
            "Ljava/util/List<",
            "Lt6/u1;",
            ">;I",
            "Ljava/lang/Object;",
            "JJJIZIZZ",
            "Lt8/n0;",
            "Lx6/m;",
            "La8/j;",
            "Lq7/h;",
            "Lt8/e0;",
            "Z",
            "Lu6/m3;",
            ")V"
        }
    .end annotation

    move-object v12, p0

    move-object/from16 v13, p7

    move-object v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move/from16 v4, p11

    move-object/from16 v5, p12

    move-wide/from16 v6, p13

    move-wide/from16 v8, p15

    move-wide/from16 v10, p17

    invoke-direct/range {v0 .. v11}, Lx7/n;-><init>(Ls8/j;Ls8/n;Lt6/u1;ILjava/lang/Object;JJJ)V

    move/from16 v0, p5

    iput-boolean v0, v12, La8/i;->A:Z

    move/from16 v0, p19

    iput v0, v12, La8/i;->o:I

    move/from16 v0, p20

    iput-boolean v0, v12, La8/i;->L:Z

    move/from16 v0, p21

    iput v0, v12, La8/i;->l:I

    iput-object v13, v12, La8/i;->q:Ls8/n;

    move-object/from16 v0, p6

    iput-object v0, v12, La8/i;->p:Ls8/j;

    if-eqz v13, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, v12, La8/i;->G:Z

    move/from16 v0, p8

    iput-boolean v0, v12, La8/i;->B:Z

    move-object/from16 v0, p9

    iput-object v0, v12, La8/i;->m:Landroid/net/Uri;

    move/from16 v0, p23

    iput-boolean v0, v12, La8/i;->s:Z

    move-object/from16 v0, p24

    iput-object v0, v12, La8/i;->u:Lt8/n0;

    move/from16 v0, p22

    iput-boolean v0, v12, La8/i;->t:Z

    move-object v0, p1

    iput-object v0, v12, La8/i;->v:La8/h;

    move-object/from16 v0, p10

    iput-object v0, v12, La8/i;->w:Ljava/util/List;

    move-object/from16 v0, p25

    iput-object v0, v12, La8/i;->x:Lx6/m;

    move-object/from16 v0, p26

    iput-object v0, v12, La8/i;->r:La8/j;

    move-object/from16 v0, p27

    iput-object v0, v12, La8/i;->y:Lq7/h;

    move-object/from16 v0, p28

    iput-object v0, v12, La8/i;->z:Lt8/e0;

    move/from16 v0, p29

    iput-boolean v0, v12, La8/i;->n:Z

    move-object/from16 v0, p30

    iput-object v0, v12, La8/i;->C:Lu6/m3;

    invoke-static {}, Lcom/google/common/collect/w;->v()Lcom/google/common/collect/w;

    move-result-object v0

    iput-object v0, v12, La8/i;->J:Lcom/google/common/collect/w;

    sget-object v0, La8/i;->M:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    iput v0, v12, La8/i;->k:I

    return-void
.end method

.method private static i(Ls8/j;[B[B)Ls8/j;
    .locals 1

    if-eqz p1, :cond_0

    invoke-static {p2}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, La8/a;

    invoke-direct {v0, p0, p1, p2}, La8/a;-><init>(Ls8/j;[B[B)V

    return-object v0

    :cond_0
    return-object p0
.end method

.method public static j(La8/h;Ls8/j;Lt6/u1;JLb8/g;La8/f$e;Landroid/net/Uri;Ljava/util/List;ILjava/lang/Object;ZLa8/s;La8/i;[B[BZLu6/m3;)La8/i;
    .locals 41
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La8/h;",
            "Ls8/j;",
            "Lt6/u1;",
            "J",
            "Lb8/g;",
            "La8/f$e;",
            "Landroid/net/Uri;",
            "Ljava/util/List<",
            "Lt6/u1;",
            ">;I",
            "Ljava/lang/Object;",
            "Z",
            "La8/s;",
            "La8/i;",
            "[B[BZ",
            "Lu6/m3;",
            ")",
            "La8/i;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    move-object/from16 v3, p13

    move-object/from16 v4, p14

    move-object/from16 v5, p15

    iget-object v6, v2, La8/f$e;->a:Lb8/g$e;

    new-instance v7, Ls8/n$b;

    invoke-direct {v7}, Ls8/n$b;-><init>()V

    iget-object v8, v1, Lb8/i;->a:Ljava/lang/String;

    iget-object v9, v6, Lb8/g$e;->a:Ljava/lang/String;

    invoke-static {v8, v9}, Lt8/p0;->e(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    invoke-virtual {v7, v8}, Ls8/n$b;->i(Landroid/net/Uri;)Ls8/n$b;

    move-result-object v7

    iget-wide v8, v6, Lb8/g$e;->t:J

    invoke-virtual {v7, v8, v9}, Ls8/n$b;->h(J)Ls8/n$b;

    move-result-object v7

    iget-wide v8, v6, Lb8/g$e;->u:J

    invoke-virtual {v7, v8, v9}, Ls8/n$b;->g(J)Ls8/n$b;

    move-result-object v7

    iget-boolean v8, v2, La8/f$e;->d:Z

    if-eqz v8, :cond_0

    const/16 v8, 0x8

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    :goto_0
    invoke-virtual {v7, v8}, Ls8/n$b;->b(I)Ls8/n$b;

    move-result-object v7

    invoke-virtual {v7}, Ls8/n$b;->a()Ls8/n;

    move-result-object v13

    const/4 v7, 0x1

    if-eqz v4, :cond_1

    move v15, v7

    goto :goto_1

    :cond_1
    const/4 v15, 0x0

    :goto_1
    if-eqz v15, :cond_2

    iget-object v10, v6, Lb8/g$e;->s:Ljava/lang/String;

    invoke-static {v10}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-static {v10}, La8/i;->l(Ljava/lang/String;)[B

    move-result-object v10

    goto :goto_2

    :cond_2
    const/4 v10, 0x0

    :goto_2
    invoke-static {v0, v4, v10}, La8/i;->i(Ls8/j;[B[B)Ls8/j;

    move-result-object v12

    iget-object v4, v6, Lb8/g$e;->b:Lb8/g$d;

    if-eqz v4, :cond_5

    if-eqz v5, :cond_3

    move v10, v7

    goto :goto_3

    :cond_3
    const/4 v10, 0x0

    :goto_3
    if-eqz v10, :cond_4

    iget-object v11, v4, Lb8/g$e;->s:Ljava/lang/String;

    invoke-static {v11}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-static {v11}, La8/i;->l(Ljava/lang/String;)[B

    move-result-object v11

    goto :goto_4

    :cond_4
    const/4 v11, 0x0

    :goto_4
    iget-object v14, v1, Lb8/i;->a:Ljava/lang/String;

    iget-object v8, v4, Lb8/g$e;->a:Ljava/lang/String;

    invoke-static {v14, v8}, Lt8/p0;->e(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v18

    new-instance v8, Ls8/n;

    move/from16 p14, v10

    iget-wide v9, v4, Lb8/g$e;->t:J

    move/from16 v23, v15

    iget-wide v14, v4, Lb8/g$e;->u:J

    move-object/from16 v17, v8

    move-wide/from16 v19, v9

    move-wide/from16 v21, v14

    invoke-direct/range {v17 .. v22}, Ls8/n;-><init>(Landroid/net/Uri;JJ)V

    invoke-static {v0, v5, v11}, La8/i;->i(Ls8/j;[B[B)Ls8/j;

    move-result-object v0

    move/from16 v18, p14

    goto :goto_5

    :cond_5
    move/from16 v23, v15

    const/4 v0, 0x0

    const/4 v8, 0x0

    const/16 v18, 0x0

    :goto_5
    iget-wide v4, v6, Lb8/g$e;->e:J

    add-long v4, p3, v4

    iget-wide v9, v6, Lb8/g$e;->c:J

    add-long v25, v4, v9

    iget v1, v1, Lb8/g;->j:I

    iget v9, v6, Lb8/g$e;->d:I

    add-int/2addr v1, v9

    if-eqz v3, :cond_a

    iget-object v9, v3, La8/i;->q:Ls8/n;

    if-eq v8, v9, :cond_7

    if-eqz v8, :cond_6

    if-eqz v9, :cond_6

    iget-object v10, v8, Ls8/n;->a:Landroid/net/Uri;

    iget-object v9, v9, Ls8/n;->a:Landroid/net/Uri;

    invoke-virtual {v10, v9}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    iget-wide v9, v8, Ls8/n;->g:J

    iget-object v11, v3, La8/i;->q:Ls8/n;

    iget-wide v14, v11, Ls8/n;->g:J

    cmp-long v9, v9, v14

    if-nez v9, :cond_6

    goto :goto_6

    :cond_6
    const/4 v9, 0x0

    goto :goto_7

    :cond_7
    :goto_6
    move v9, v7

    :goto_7
    iget-object v10, v3, La8/i;->m:Landroid/net/Uri;

    move-object/from16 v15, p7

    invoke-virtual {v15, v10}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    iget-boolean v10, v3, La8/i;->I:Z

    if-eqz v10, :cond_8

    move/from16 v24, v7

    goto :goto_8

    :cond_8
    const/16 v24, 0x0

    :goto_8
    iget-object v10, v3, La8/i;->y:Lq7/h;

    iget-object v11, v3, La8/i;->z:Lt8/e0;

    if-eqz v9, :cond_9

    if-eqz v24, :cond_9

    iget-boolean v9, v3, La8/i;->K:Z

    if-nez v9, :cond_9

    iget v9, v3, La8/i;->l:I

    if-ne v9, v1, :cond_9

    iget-object v3, v3, La8/i;->D:La8/j;

    move-object/from16 v16, v3

    goto :goto_9

    :cond_9
    const/16 v16, 0x0

    :goto_9
    move-object/from16 v37, v10

    move-object/from16 v38, v11

    move-object/from16 v36, v16

    goto :goto_a

    :cond_a
    move-object/from16 v15, p7

    new-instance v3, Lq7/h;

    invoke-direct {v3}, Lq7/h;-><init>()V

    new-instance v9, Lt8/e0;

    const/16 v10, 0xa

    invoke-direct {v9, v10}, Lt8/e0;-><init>(I)V

    move-object/from16 v37, v3

    move-object/from16 v38, v9

    const/16 v36, 0x0

    :goto_a
    new-instance v3, La8/i;

    iget-wide v9, v2, La8/f$e;->b:J

    iget v14, v2, La8/f$e;->c:I

    iget-boolean v2, v2, La8/f$e;->d:Z

    xor-int/lit8 v30, v2, 0x1

    iget-boolean v2, v6, Lb8/g$e;->v:Z

    move/from16 v32, v2

    move-object/from16 v2, p12

    invoke-virtual {v2, v1}, La8/s;->a(I)Lt8/n0;

    move-result-object v34

    iget-object v2, v6, Lb8/g$e;->f:Lx6/m;

    move-object/from16 v35, v2

    move-wide v6, v9

    move-object v10, v3

    move-object/from16 v11, p0

    move v2, v14

    move-object/from16 v14, p2

    move/from16 v15, v23

    move-object/from16 v16, v0

    move-object/from16 v17, v8

    move-object/from16 v19, p7

    move-object/from16 v20, p8

    move/from16 v21, p9

    move-object/from16 v22, p10

    move-wide/from16 v23, v4

    move-wide/from16 v27, v6

    move/from16 v29, v2

    move/from16 v31, v1

    move/from16 v33, p11

    move/from16 v39, p16

    move-object/from16 v40, p17

    invoke-direct/range {v10 .. v40}, La8/i;-><init>(La8/h;Ls8/j;Ls8/n;Lt6/u1;ZLs8/j;Ls8/n;ZLandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;JJJIZIZZLt8/n0;Lx6/m;La8/j;Lq7/h;Lt8/e0;ZLu6/m3;)V

    return-object v3
.end method

.method private k(Ls8/j;Ls8/n;ZZ)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget p3, p0, La8/i;->F:I

    if-eqz p3, :cond_0

    const/4 p3, 0x1

    move v0, p3

    :cond_0
    move-object p3, p2

    goto :goto_0

    :cond_1
    iget p3, p0, La8/i;->F:I

    int-to-long v1, p3

    invoke-virtual {p2, v1, v2}, Ls8/n;->e(J)Ls8/n;

    move-result-object p3

    :goto_0
    :try_start_0
    invoke-direct {p0, p1, p3, p4}, La8/i;->u(Ls8/j;Ls8/n;Z)Ly6/e;

    move-result-object p3

    if-eqz v0, :cond_2

    iget p4, p0, La8/i;->F:I

    invoke-interface {p3, p4}, Ly6/l;->n(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_2
    :goto_1
    :try_start_1
    iget-boolean p4, p0, La8/i;->H:Z

    if-nez p4, :cond_3

    iget-object p4, p0, La8/i;->D:La8/j;

    invoke-interface {p4, p3}, La8/j;->a(Ly6/l;)Z

    move-result p4
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p4, :cond_3

    goto :goto_1

    :cond_3
    :try_start_2
    invoke-interface {p3}, Ly6/l;->getPosition()J

    move-result-wide p3

    iget-wide v0, p2, Ls8/n;->g:J

    :goto_2
    sub-long/2addr p3, v0

    long-to-int p2, p3

    iput p2, p0, La8/i;->F:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_0
    move-exception p4

    goto :goto_4

    :catch_0
    move-exception p4

    :try_start_3
    iget-object v0, p0, Lx7/f;->d:Lt6/u1;

    iget v0, v0, Lt6/u1;->e:I

    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_4

    iget-object p4, p0, La8/i;->D:La8/j;

    invoke-interface {p4}, La8/j;->c()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-interface {p3}, Ly6/l;->getPosition()J

    move-result-wide p3

    iget-wide v0, p2, Ls8/n;->g:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :goto_3
    invoke-static {p1}, Ls8/m;->a(Ls8/j;)V

    return-void

    :cond_4
    :try_start_5
    throw p4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_4
    :try_start_6
    invoke-interface {p3}, Ly6/l;->getPosition()J

    move-result-wide v0

    iget-wide p2, p2, Ls8/n;->g:J

    sub-long/2addr v0, p2

    long-to-int p2, v0

    iput p2, p0, La8/i;->F:I

    throw p4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-exception p2

    invoke-static {p1}, Ls8/m;->a(Ls8/j;)V

    throw p2
.end method

.method private static l(Ljava/lang/String;)[B
    .locals 4

    invoke-static {p0}, Leb/c;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "0x"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    :cond_0
    new-instance v0, Ljava/math/BigInteger;

    const/16 v1, 0x10

    invoke-direct {v0, p0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p0

    new-array v0, v1, [B

    array-length v2, p0

    if-le v2, v1, :cond_1

    array-length v2, p0

    sub-int/2addr v2, v1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    array-length v3, p0

    sub-int/2addr v1, v3

    add-int/2addr v1, v2

    array-length v3, p0

    sub-int/2addr v3, v2

    invoke-static {p0, v2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method private static p(La8/f$e;Lb8/g;)Z
    .locals 2

    iget-object v0, p0, La8/f$e;->a:Lb8/g$e;

    instance-of v1, v0, Lb8/g$b;

    if-eqz v1, :cond_2

    check-cast v0, Lb8/g$b;

    iget-boolean v0, v0, Lb8/g$b;->w:Z

    if-nez v0, :cond_1

    iget p0, p0, La8/f$e;->c:I

    if-nez p0, :cond_0

    iget-boolean p0, p1, Lb8/i;->c:Z

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0

    :cond_2
    iget-boolean p0, p1, Lb8/i;->c:Z

    return p0
.end method

.method private r()V
    .locals 4

    iget-object v0, p0, Lx7/f;->i:Ls8/l0;

    iget-object v1, p0, Lx7/f;->b:Ls8/n;

    iget-boolean v2, p0, La8/i;->A:Z

    const/4 v3, 0x1

    invoke-direct {p0, v0, v1, v2, v3}, La8/i;->k(Ls8/j;Ls8/n;ZZ)V

    return-void
.end method

.method private s()V
    .locals 4

    iget-boolean v0, p0, La8/i;->G:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, La8/i;->p:Ls8/j;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, La8/i;->q:Ls8/n;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, La8/i;->p:Ls8/j;

    iget-object v1, p0, La8/i;->q:Ls8/n;

    iget-boolean v2, p0, La8/i;->B:Z

    const/4 v3, 0x0

    invoke-direct {p0, v0, v1, v2, v3}, La8/i;->k(Ls8/j;Ls8/n;ZZ)V

    iput v3, p0, La8/i;->F:I

    iput-boolean v3, p0, La8/i;->G:Z

    return-void
.end method

.method private t(Ly6/l;)J
    .locals 8

    invoke-interface {p1}, Ly6/l;->f()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    :try_start_0
    iget-object v2, p0, La8/i;->z:Lt8/e0;

    const/16 v3, 0xa

    invoke-virtual {v2, v3}, Lt8/e0;->Q(I)V

    iget-object v2, p0, La8/i;->z:Lt8/e0;

    invoke-virtual {v2}, Lt8/e0;->e()[B

    move-result-object v2

    const/4 v4, 0x0

    invoke-interface {p1, v2, v4, v3}, Ly6/l;->q([BII)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v2, p0, La8/i;->z:Lt8/e0;

    invoke-virtual {v2}, Lt8/e0;->K()I

    move-result v2

    const v5, 0x494433

    if-eq v2, v5, :cond_0

    return-wide v0

    :cond_0
    iget-object v2, p0, La8/i;->z:Lt8/e0;

    const/4 v5, 0x3

    invoke-virtual {v2, v5}, Lt8/e0;->V(I)V

    iget-object v2, p0, La8/i;->z:Lt8/e0;

    invoke-virtual {v2}, Lt8/e0;->G()I

    move-result v2

    add-int/lit8 v5, v2, 0xa

    iget-object v6, p0, La8/i;->z:Lt8/e0;

    invoke-virtual {v6}, Lt8/e0;->b()I

    move-result v6

    if-le v5, v6, :cond_1

    iget-object v6, p0, La8/i;->z:Lt8/e0;

    invoke-virtual {v6}, Lt8/e0;->e()[B

    move-result-object v6

    iget-object v7, p0, La8/i;->z:Lt8/e0;

    invoke-virtual {v7, v5}, Lt8/e0;->Q(I)V

    iget-object v5, p0, La8/i;->z:Lt8/e0;

    invoke-virtual {v5}, Lt8/e0;->e()[B

    move-result-object v5

    invoke-static {v6, v4, v5, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    iget-object v5, p0, La8/i;->z:Lt8/e0;

    invoke-virtual {v5}, Lt8/e0;->e()[B

    move-result-object v5

    invoke-interface {p1, v5, v3, v2}, Ly6/l;->q([BII)V

    iget-object p1, p0, La8/i;->y:Lq7/h;

    iget-object v3, p0, La8/i;->z:Lt8/e0;

    invoke-virtual {v3}, Lt8/e0;->e()[B

    move-result-object v3

    invoke-virtual {p1, v3, v2}, Lq7/h;->e([BI)Ll7/a;

    move-result-object p1

    if-nez p1, :cond_2

    return-wide v0

    :cond_2
    invoke-virtual {p1}, Ll7/a;->e()I

    move-result v2

    move v3, v4

    :goto_0
    if-ge v3, v2, :cond_4

    invoke-virtual {p1, v3}, Ll7/a;->d(I)Ll7/a$b;

    move-result-object v5

    instance-of v6, v5, Lq7/l;

    if-eqz v6, :cond_3

    check-cast v5, Lq7/l;

    iget-object v6, v5, Lq7/l;->b:Ljava/lang/String;

    const-string v7, "com.apple.streaming.transportStreamTimestamp"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    iget-object p1, v5, Lq7/l;->c:[B

    iget-object v0, p0, La8/i;->z:Lt8/e0;

    invoke-virtual {v0}, Lt8/e0;->e()[B

    move-result-object v0

    const/16 v1, 0x8

    invoke-static {p1, v4, v0, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, La8/i;->z:Lt8/e0;

    invoke-virtual {p1, v4}, Lt8/e0;->U(I)V

    iget-object p1, p0, La8/i;->z:Lt8/e0;

    invoke-virtual {p1, v1}, Lt8/e0;->T(I)V

    iget-object p1, p0, La8/i;->z:Lt8/e0;

    invoke-virtual {p1}, Lt8/e0;->A()J

    move-result-wide v0

    const-wide v2, 0x1ffffffffL

    and-long/2addr v0, v2

    return-wide v0

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catch_0
    :cond_4
    return-wide v0
.end method

.method private u(Ls8/j;Ls8/n;Z)Ly6/e;
    .locals 10

    invoke-interface {p1, p2}, Ls8/j;->o(Ls8/n;)J

    move-result-wide v4

    if-eqz p3, :cond_0

    :try_start_0
    iget-object p3, p0, La8/i;->u:Lt8/n0;

    iget-boolean v0, p0, La8/i;->s:Z

    iget-wide v1, p0, Lx7/f;->g:J

    invoke-virtual {p3, v0, v1, v2}, Lt8/n0;->h(ZJ)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance p1, Ljava/io/InterruptedIOException;

    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    throw p1

    :cond_0
    :goto_0
    new-instance p3, Ly6/e;

    iget-wide v2, p2, Ls8/n;->g:J

    move-object v0, p3

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Ly6/e;-><init>(Ls8/h;JJ)V

    iget-object v0, p0, La8/i;->D:La8/j;

    if-nez v0, :cond_4

    invoke-direct {p0, p3}, La8/i;->t(Ly6/l;)J

    move-result-wide v8

    invoke-virtual {p3}, Ly6/e;->f()V

    iget-object v0, p0, La8/i;->r:La8/j;

    if-eqz v0, :cond_1

    invoke-interface {v0}, La8/j;->f()La8/j;

    move-result-object p1

    goto :goto_1

    :cond_1
    iget-object v0, p0, La8/i;->v:La8/h;

    iget-object v1, p2, Ls8/n;->a:Landroid/net/Uri;

    iget-object v2, p0, Lx7/f;->d:Lt6/u1;

    iget-object v3, p0, La8/i;->w:Ljava/util/List;

    iget-object v4, p0, La8/i;->u:Lt8/n0;

    invoke-interface {p1}, Ls8/j;->e()Ljava/util/Map;

    move-result-object v5

    iget-object v7, p0, La8/i;->C:Lu6/m3;

    move-object v6, p3

    invoke-interface/range {v0 .. v7}, La8/h;->a(Landroid/net/Uri;Lt6/u1;Ljava/util/List;Lt8/n0;Ljava/util/Map;Ly6/l;Lu6/m3;)La8/j;

    move-result-object p1

    :goto_1
    iput-object p1, p0, La8/i;->D:La8/j;

    invoke-interface {p1}, La8/j;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, La8/i;->E:La8/p;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, v8, v0

    if-eqz p2, :cond_2

    iget-object p2, p0, La8/i;->u:Lt8/n0;

    invoke-virtual {p2, v8, v9}, Lt8/n0;->b(J)J

    move-result-wide v0

    goto :goto_2

    :cond_2
    iget-wide v0, p0, Lx7/f;->g:J

    goto :goto_2

    :cond_3
    iget-object p1, p0, La8/i;->E:La8/p;

    const-wide/16 v0, 0x0

    :goto_2
    invoke-virtual {p1, v0, v1}, La8/p;->m0(J)V

    iget-object p1, p0, La8/i;->E:La8/p;

    invoke-virtual {p1}, La8/p;->Y()V

    iget-object p1, p0, La8/i;->D:La8/j;

    iget-object p2, p0, La8/i;->E:La8/p;

    invoke-interface {p1, p2}, La8/j;->b(Ly6/m;)V

    :cond_4
    iget-object p1, p0, La8/i;->E:La8/p;

    iget-object p2, p0, La8/i;->x:Lx6/m;

    invoke-virtual {p1, p2}, La8/p;->j0(Lx6/m;)V

    return-object p3
.end method

.method public static w(La8/i;Landroid/net/Uri;Lb8/g;La8/f$e;J)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, La8/i;->m:Landroid/net/Uri;

    invoke-virtual {p1, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-boolean p1, p0, La8/i;->I:Z

    if-eqz p1, :cond_1

    return v0

    :cond_1
    iget-object p1, p3, La8/f$e;->a:Lb8/g$e;

    iget-wide v1, p1, Lb8/g$e;->e:J

    add-long/2addr p4, v1

    invoke-static {p3, p2}, La8/i;->p(La8/f$e;Lb8/g;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-wide p0, p0, Lx7/f;->h:J

    cmp-long p0, p4, p0

    if-gez p0, :cond_3

    :cond_2
    const/4 v0, 0x1

    :cond_3
    return v0
.end method


# virtual methods
.method public b()V
    .locals 1

    iget-object v0, p0, La8/i;->E:La8/p;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, La8/i;->D:La8/j;

    if-nez v0, :cond_0

    iget-object v0, p0, La8/i;->r:La8/j;

    if-eqz v0, :cond_0

    invoke-interface {v0}, La8/j;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La8/i;->r:La8/j;

    iput-object v0, p0, La8/i;->D:La8/j;

    const/4 v0, 0x0

    iput-boolean v0, p0, La8/i;->G:Z

    :cond_0
    invoke-direct {p0}, La8/i;->s()V

    iget-boolean v0, p0, La8/i;->H:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, La8/i;->t:Z

    if-nez v0, :cond_1

    invoke-direct {p0}, La8/i;->r()V

    :cond_1
    iget-boolean v0, p0, La8/i;->H:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, La8/i;->I:Z

    :cond_2
    return-void
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, La8/i;->H:Z

    return-void
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, La8/i;->I:Z

    return v0
.end method

.method public m(I)I
    .locals 1

    iget-boolean v0, p0, La8/i;->n:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lt8/a;->g(Z)V

    iget-object v0, p0, La8/i;->J:Lcom/google/common/collect/w;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, La8/i;->J:Lcom/google/common/collect/w;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public n(La8/p;Lcom/google/common/collect/w;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La8/p;",
            "Lcom/google/common/collect/w<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, La8/i;->E:La8/p;

    iput-object p2, p0, La8/i;->J:Lcom/google/common/collect/w;

    return-void
.end method

.method public o()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, La8/i;->K:Z

    return-void
.end method

.method public q()Z
    .locals 1

    iget-boolean v0, p0, La8/i;->L:Z

    return v0
.end method

.method public v()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, La8/i;->L:Z

    return-void
.end method
