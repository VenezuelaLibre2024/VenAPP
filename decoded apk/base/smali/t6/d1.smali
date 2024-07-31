.class final Lt6/d1;
.super Lt6/k;
.source "SourceFile"

# interfaces
.implements Lt6/y;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt6/d1$b;,
        Lt6/d1$d;,
        Lt6/d1$c;,
        Lt6/d1$e;
    }
.end annotation


# instance fields
.field private final A:Lt6/j;

.field private final B:Lt6/y3;

.field private final C:Lt6/j4;

.field private final D:Lt6/k4;

.field private final E:J

.field private F:I

.field private G:Z

.field private H:I

.field private I:I

.field private J:Z

.field private K:I

.field private L:Lt6/u3;

.field private M:Lv7/x0;

.field private N:Z

.field private O:Lt6/j3$b;

.field private P:Lt6/h2;

.field private Q:Lt6/h2;

.field private R:Lt6/u1;

.field private S:Lt6/u1;

.field private T:Landroid/media/AudioTrack;

.field private U:Ljava/lang/Object;

.field private V:Landroid/view/Surface;

.field private W:Landroid/view/SurfaceHolder;

.field private X:Lv8/l;

.field private Y:Z

.field private Z:Landroid/view/TextureView;

.field private a0:I

.field final b:Lq8/b0;

.field private b0:I

.field final c:Lt6/j3$b;

.field private c0:Lt8/h0;

.field private final d:Lt8/g;

.field private d0:Lw6/e;

.field private final e:Landroid/content/Context;

.field private e0:Lw6/e;

.field private final f:Lt6/j3;

.field private f0:I

.field private final g:[Lt6/q3;

.field private g0:Lv6/e;

.field private final h:Lq8/a0;

.field private h0:F

.field private final i:Lt8/o;

.field private i0:Z

.field private final j:Lt6/q1$f;

.field private j0:Lg8/f;

.field private final k:Lt6/q1;

.field private k0:Z

.field private final l:Lt8/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt8/r<",
            "Lt6/j3$d;",
            ">;"
        }
    .end annotation
.end field

.field private l0:Z

.field private final m:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lt6/y$a;",
            ">;"
        }
    .end annotation
.end field

.field private m0:Lt8/g0;

.field private final n:Lt6/d4$b;

.field private n0:Z

.field private final o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lt6/d1$e;",
            ">;"
        }
    .end annotation
.end field

.field private o0:Z

.field private final p:Z

.field private p0:Lt6/v;

.field private final q:Lv7/a0$a;

.field private q0:Lu8/a0;

.field private final r:Lu6/a;

.field private r0:Lt6/h2;

.field private final s:Landroid/os/Looper;

.field private s0:Lt6/g3;

.field private final t:Ls8/e;

.field private t0:I

.field private final u:J

.field private u0:I

.field private final v:J

.field private v0:J

.field private final w:Lt8/d;

.field private final x:Lt6/d1$c;

.field private final y:Lt6/d1$d;

.field private final z:Lt6/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "goog.exo.exoplayer"

    invoke-static {v0}, Lt6/r1;->a(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lt6/y$b;Lt6/j3;)V
    .locals 38

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    invoke-direct/range {p0 .. p0}, Lt6/k;-><init>()V

    new-instance v2, Lt8/g;

    invoke-direct {v2}, Lt8/g;-><init>()V

    iput-object v2, v1, Lt6/d1;->d:Lt8/g;

    :try_start_0
    const-string v3, "ExoPlayerImpl"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Init "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {p0 .. p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " ["

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "ExoPlayerLib/2.18.7"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "] ["

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v5, Lt8/r0;->e:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "]"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lt8/s;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, v0, Lt6/y$b;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    iput-object v3, v1, Lt6/d1;->e:Landroid/content/Context;

    iget-object v4, v0, Lt6/y$b;->i:Leb/g;

    iget-object v5, v0, Lt6/y$b;->b:Lt8/d;

    invoke-interface {v4, v5}, Leb/g;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu6/a;

    iput-object v4, v1, Lt6/d1;->r:Lu6/a;

    iget-object v5, v0, Lt6/y$b;->k:Lt8/g0;

    iput-object v5, v1, Lt6/d1;->m0:Lt8/g0;

    iget-object v5, v0, Lt6/y$b;->l:Lv6/e;

    iput-object v5, v1, Lt6/d1;->g0:Lv6/e;

    iget v5, v0, Lt6/y$b;->q:I

    iput v5, v1, Lt6/d1;->a0:I

    iget v5, v0, Lt6/y$b;->r:I

    iput v5, v1, Lt6/d1;->b0:I

    iget-boolean v5, v0, Lt6/y$b;->p:Z

    iput-boolean v5, v1, Lt6/d1;->i0:Z

    iget-wide v5, v0, Lt6/y$b;->y:J

    iput-wide v5, v1, Lt6/d1;->E:J

    new-instance v15, Lt6/d1$c;

    const/4 v14, 0x0

    invoke-direct {v15, v1, v14}, Lt6/d1$c;-><init>(Lt6/d1;Lt6/d1$a;)V

    iput-object v15, v1, Lt6/d1;->x:Lt6/d1$c;

    new-instance v13, Lt6/d1$d;

    invoke-direct {v13, v14}, Lt6/d1$d;-><init>(Lt6/d1$a;)V

    iput-object v13, v1, Lt6/d1;->y:Lt6/d1$d;

    new-instance v6, Landroid/os/Handler;

    iget-object v5, v0, Lt6/y$b;->j:Landroid/os/Looper;

    invoke-direct {v6, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iget-object v5, v0, Lt6/y$b;->d:Leb/v;

    invoke-interface {v5}, Leb/v;->get()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Lt6/t3;

    move-object v8, v6

    move-object v9, v15

    move-object v10, v15

    move-object v11, v15

    move-object v12, v15

    invoke-interface/range {v7 .. v12}, Lt6/t3;->a(Landroid/os/Handler;Lu8/y;Lv6/u;Lg8/p;Ll7/e;)[Lt6/q3;

    move-result-object v7

    iput-object v7, v1, Lt6/d1;->g:[Lt6/q3;

    array-length v5, v7

    const/4 v12, 0x0

    if-lez v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    move v5, v12

    :goto_0
    invoke-static {v5}, Lt8/a;->g(Z)V

    iget-object v5, v0, Lt6/y$b;->f:Leb/v;

    invoke-interface {v5}, Leb/v;->get()Ljava/lang/Object;

    move-result-object v5

    move-object v10, v5

    check-cast v10, Lq8/a0;

    iput-object v10, v1, Lt6/d1;->h:Lq8/a0;

    iget-object v5, v0, Lt6/y$b;->e:Leb/v;

    invoke-interface {v5}, Leb/v;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lv7/a0$a;

    iput-object v5, v1, Lt6/d1;->q:Lv7/a0$a;

    iget-object v5, v0, Lt6/y$b;->h:Leb/v;

    invoke-interface {v5}, Leb/v;->get()Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, Ls8/e;

    iput-object v9, v1, Lt6/d1;->t:Ls8/e;

    iget-boolean v5, v0, Lt6/y$b;->s:Z

    iput-boolean v5, v1, Lt6/d1;->p:Z

    iget-object v5, v0, Lt6/y$b;->t:Lt6/u3;

    iput-object v5, v1, Lt6/d1;->L:Lt6/u3;

    move-object/from16 v16, v15

    iget-wide v14, v0, Lt6/y$b;->u:J

    iput-wide v14, v1, Lt6/d1;->u:J

    iget-wide v14, v0, Lt6/y$b;->v:J

    iput-wide v14, v1, Lt6/d1;->v:J

    iget-boolean v5, v0, Lt6/y$b;->z:Z

    iput-boolean v5, v1, Lt6/d1;->N:Z

    iget-object v15, v0, Lt6/y$b;->j:Landroid/os/Looper;

    iput-object v15, v1, Lt6/d1;->s:Landroid/os/Looper;

    iget-object v14, v0, Lt6/y$b;->b:Lt8/d;

    iput-object v14, v1, Lt6/d1;->w:Lt8/d;

    if-nez p2, :cond_1

    move-object v5, v1

    goto :goto_1

    :cond_1
    move-object/from16 v5, p2

    :goto_1
    iput-object v5, v1, Lt6/d1;->f:Lt6/j3;

    new-instance v8, Lt8/r;

    new-instance v11, Lt6/q0;

    invoke-direct {v11, v1}, Lt6/q0;-><init>(Lt6/d1;)V

    invoke-direct {v8, v15, v14, v11}, Lt8/r;-><init>(Landroid/os/Looper;Lt8/d;Lt8/r$b;)V

    iput-object v8, v1, Lt6/d1;->l:Lt8/r;

    new-instance v8, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v8}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v8, v1, Lt6/d1;->m:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, v1, Lt6/d1;->o:Ljava/util/List;

    new-instance v8, Lv7/x0$a;

    invoke-direct {v8, v12}, Lv7/x0$a;-><init>(I)V

    iput-object v8, v1, Lt6/d1;->M:Lv7/x0;

    new-instance v8, Lq8/b0;

    array-length v11, v7

    new-array v11, v11, [Lt6/s3;

    array-length v12, v7

    new-array v12, v12, [Lq8/r;

    move-object/from16 v20, v6

    sget-object v6, Lt6/i4;->b:Lt6/i4;

    move-object/from16 v21, v9

    const/4 v9, 0x0

    invoke-direct {v8, v11, v12, v6, v9}, Lq8/b0;-><init>([Lt6/s3;[Lq8/r;Lt6/i4;Ljava/lang/Object;)V

    iput-object v8, v1, Lt6/d1;->b:Lq8/b0;

    new-instance v6, Lt6/d4$b;

    invoke-direct {v6}, Lt6/d4$b;-><init>()V

    iput-object v6, v1, Lt6/d1;->n:Lt6/d4$b;

    new-instance v6, Lt6/j3$b$a;

    invoke-direct {v6}, Lt6/j3$b$a;-><init>()V

    const/16 v12, 0x15

    new-array v9, v12, [I

    const/4 v11, 0x1

    const/16 v18, 0x0

    aput v11, v9, v18

    const/4 v12, 0x2

    aput v12, v9, v11

    move-object/from16 v24, v2

    const/4 v2, 0x3

    aput v2, v9, v12

    const/16 v19, 0xd

    aput v19, v9, v2

    const/16 v22, 0xe

    const/4 v2, 0x4

    aput v22, v9, v2

    const/16 v23, 0xf

    const/4 v2, 0x5

    aput v23, v9, v2

    const/16 v25, 0x10

    const/4 v2, 0x6

    aput v25, v9, v2

    const/16 v26, 0x11

    const/4 v2, 0x7

    aput v26, v9, v2

    const/16 v27, 0x12

    const/16 v2, 0x8

    aput v27, v9, v2

    const/16 v28, 0x13

    const/16 v2, 0x9

    aput v28, v9, v2

    const/16 v11, 0x1f

    const/16 v2, 0xa

    aput v11, v9, v2

    const/16 v29, 0xb

    const/16 v30, 0x14

    aput v30, v9, v29

    const/16 v29, 0xc

    const/16 v31, 0x1e

    aput v31, v9, v29

    const/16 v29, 0x15

    aput v29, v9, v19

    const/16 v19, 0x16

    aput v19, v9, v22

    const/16 v19, 0x17

    aput v19, v9, v23

    const/16 v19, 0x18

    aput v19, v9, v25

    const/16 v19, 0x19

    aput v19, v9, v26

    const/16 v19, 0x1a

    aput v19, v9, v27

    const/16 v19, 0x1b

    aput v19, v9, v28

    const/16 v19, 0x1c

    aput v19, v9, v30

    invoke-virtual {v6, v9}, Lt6/j3$b$a;->c([I)Lt6/j3$b$a;

    move-result-object v6

    invoke-virtual {v10}, Lq8/a0;->d()Z

    move-result v9

    const/16 v12, 0x1d

    invoke-virtual {v6, v12, v9}, Lt6/j3$b$a;->d(IZ)Lt6/j3$b$a;

    move-result-object v6

    invoke-virtual {v6}, Lt6/j3$b$a;->e()Lt6/j3$b;

    move-result-object v6

    iput-object v6, v1, Lt6/d1;->c:Lt6/j3$b;

    new-instance v9, Lt6/j3$b$a;

    invoke-direct {v9}, Lt6/j3$b$a;-><init>()V

    invoke-virtual {v9, v6}, Lt6/j3$b$a;->b(Lt6/j3$b;)Lt6/j3$b$a;

    move-result-object v6

    const/4 v9, 0x4

    invoke-virtual {v6, v9}, Lt6/j3$b$a;->a(I)Lt6/j3$b$a;

    move-result-object v6

    invoke-virtual {v6, v2}, Lt6/j3$b$a;->a(I)Lt6/j3$b$a;

    move-result-object v6

    invoke-virtual {v6}, Lt6/j3$b$a;->e()Lt6/j3$b;

    move-result-object v6

    iput-object v6, v1, Lt6/d1;->O:Lt6/j3$b;

    const/4 v12, 0x0

    invoke-interface {v14, v15, v12}, Lt8/d;->c(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lt8/o;

    move-result-object v6

    iput-object v6, v1, Lt6/d1;->i:Lt8/o;

    new-instance v9, Lt6/v0;

    invoke-direct {v9, v1}, Lt6/v0;-><init>(Lt6/d1;)V

    iput-object v9, v1, Lt6/d1;->j:Lt6/q1$f;

    invoke-static {v8}, Lt6/g3;->j(Lq8/b0;)Lt6/g3;

    move-result-object v6

    iput-object v6, v1, Lt6/d1;->s0:Lt6/g3;

    invoke-interface {v4, v5, v15}, Lu6/a;->z(Lt6/j3;Landroid/os/Looper;)V

    sget v6, Lt8/r0;->a:I

    if-ge v6, v11, :cond_2

    new-instance v5, Lu6/m3;

    invoke-direct {v5}, Lu6/m3;-><init>()V

    goto :goto_2

    :cond_2
    iget-boolean v5, v0, Lt6/y$b;->A:Z

    invoke-static {v3, v1, v5}, Lt6/d1$b;->a(Landroid/content/Context;Lt6/d1;Z)Lu6/m3;

    move-result-object v5

    :goto_2
    move-object/from16 v22, v5

    new-instance v11, Lt6/q1;

    iget-object v5, v0, Lt6/y$b;->g:Leb/v;

    invoke-interface {v5}, Leb/v;->get()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v17, v5

    check-cast v17, Lt6/a2;

    iget v5, v1, Lt6/d1;->F:I

    iget-boolean v12, v1, Lt6/d1;->G:Z

    iget-object v2, v1, Lt6/d1;->L:Lt6/u3;

    move-object/from16 v23, v15

    iget-object v15, v0, Lt6/y$b;->w:Lt6/z1;

    move-object/from16 v27, v2

    move-object/from16 v26, v3

    iget-wide v2, v0, Lt6/y$b;->x:J

    move-wide/from16 v30, v2

    iget-boolean v2, v1, Lt6/d1;->N:Z

    iget-object v3, v0, Lt6/y$b;->B:Landroid/os/Looper;

    move/from16 v28, v5

    move-object v5, v11

    move v0, v6

    move-object/from16 v32, v20

    move-object v6, v7

    move-object v7, v10

    move-object/from16 v33, v21

    move-object/from16 v21, v9

    move-object/from16 v9, v17

    move-object/from16 v34, v10

    move-object/from16 v10, v33

    move/from16 v35, v0

    move-object v0, v11

    move/from16 v11, v28

    const/16 v17, 0x0

    move-object/from16 v36, v13

    move-object v13, v4

    move-object/from16 v20, v14

    move-object/from16 v28, v17

    move-object/from16 v14, v27

    move-object/from16 v37, v16

    move-object/from16 p2, v23

    move-wide/from16 v16, v30

    move/from16 v18, v2

    move-object/from16 v19, p2

    move-object/from16 v23, v3

    invoke-direct/range {v5 .. v23}, Lt6/q1;-><init>([Lt6/q3;Lq8/a0;Lq8/b0;Lt6/a2;Ls8/e;IZLu6/a;Lt6/u3;Lt6/z1;JZLandroid/os/Looper;Lt8/d;Lt6/q1$f;Lu6/m3;Landroid/os/Looper;)V

    iput-object v0, v1, Lt6/d1;->k:Lt6/q1;

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v1, Lt6/d1;->h0:F

    const/4 v2, 0x0

    iput v2, v1, Lt6/d1;->F:I

    sget-object v3, Lt6/h2;->T:Lt6/h2;

    iput-object v3, v1, Lt6/d1;->P:Lt6/h2;

    iput-object v3, v1, Lt6/d1;->Q:Lt6/h2;

    iput-object v3, v1, Lt6/d1;->r0:Lt6/h2;

    const/4 v3, -0x1

    iput v3, v1, Lt6/d1;->t0:I

    move/from16 v3, v35

    const/16 v5, 0x15

    if-ge v3, v5, :cond_3

    invoke-direct {v1, v2}, Lt6/d1;->q1(I)I

    move-result v3

    :goto_3
    iput v3, v1, Lt6/d1;->f0:I

    goto :goto_4

    :cond_3
    invoke-static/range {v26 .. v26}, Lt8/r0;->F(Landroid/content/Context;)I

    move-result v3

    goto :goto_3

    :goto_4
    sget-object v3, Lg8/f;->c:Lg8/f;

    iput-object v3, v1, Lt6/d1;->j0:Lg8/f;

    const/4 v3, 0x1

    iput-boolean v3, v1, Lt6/d1;->k0:Z

    invoke-virtual {v1, v4}, Lt6/d1;->s(Lt6/j3$d;)V

    new-instance v5, Landroid/os/Handler;

    move-object/from16 v6, p2

    invoke-direct {v5, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    move-object/from16 v6, v33

    invoke-interface {v6, v5, v4}, Ls8/e;->h(Landroid/os/Handler;Ls8/e$a;)V

    move-object/from16 v4, v37

    invoke-virtual {v1, v4}, Lt6/d1;->V0(Lt6/y$a;)V

    move-object/from16 v5, p1

    iget-wide v6, v5, Lt6/y$b;->c:J

    const-wide/16 v8, 0x0

    cmp-long v8, v6, v8

    if-lez v8, :cond_4

    invoke-virtual {v0, v6, v7}, Lt6/q1;->u(J)V

    :cond_4
    new-instance v0, Lt6/b;

    iget-object v6, v5, Lt6/y$b;->a:Landroid/content/Context;

    move-object/from16 v7, v32

    invoke-direct {v0, v6, v7, v4}, Lt6/b;-><init>(Landroid/content/Context;Landroid/os/Handler;Lt6/b$b;)V

    iput-object v0, v1, Lt6/d1;->z:Lt6/b;

    iget-boolean v6, v5, Lt6/y$b;->o:Z

    invoke-virtual {v0, v6}, Lt6/b;->b(Z)V

    new-instance v0, Lt6/j;

    iget-object v6, v5, Lt6/y$b;->a:Landroid/content/Context;

    invoke-direct {v0, v6, v7, v4}, Lt6/j;-><init>(Landroid/content/Context;Landroid/os/Handler;Lt6/j$b;)V

    iput-object v0, v1, Lt6/d1;->A:Lt6/j;

    iget-boolean v6, v5, Lt6/y$b;->m:Z

    if-eqz v6, :cond_5

    iget-object v14, v1, Lt6/d1;->g0:Lv6/e;

    goto :goto_5

    :cond_5
    move-object/from16 v14, v28

    :goto_5
    invoke-virtual {v0, v14}, Lt6/j;->m(Lv6/e;)V

    new-instance v0, Lt6/y3;

    iget-object v6, v5, Lt6/y$b;->a:Landroid/content/Context;

    invoke-direct {v0, v6, v7, v4}, Lt6/y3;-><init>(Landroid/content/Context;Landroid/os/Handler;Lt6/y3$b;)V

    iput-object v0, v1, Lt6/d1;->B:Lt6/y3;

    iget-object v4, v1, Lt6/d1;->g0:Lv6/e;

    iget v4, v4, Lv6/e;->c:I

    invoke-static {v4}, Lt8/r0;->g0(I)I

    move-result v4

    invoke-virtual {v0, v4}, Lt6/y3;->h(I)V

    new-instance v4, Lt6/j4;

    iget-object v6, v5, Lt6/y$b;->a:Landroid/content/Context;

    invoke-direct {v4, v6}, Lt6/j4;-><init>(Landroid/content/Context;)V

    iput-object v4, v1, Lt6/d1;->C:Lt6/j4;

    iget v6, v5, Lt6/y$b;->n:I

    if-eqz v6, :cond_6

    move v12, v3

    goto :goto_6

    :cond_6
    move v12, v2

    :goto_6
    invoke-virtual {v4, v12}, Lt6/j4;->a(Z)V

    new-instance v4, Lt6/k4;

    iget-object v6, v5, Lt6/y$b;->a:Landroid/content/Context;

    invoke-direct {v4, v6}, Lt6/k4;-><init>(Landroid/content/Context;)V

    iput-object v4, v1, Lt6/d1;->D:Lt6/k4;

    iget v5, v5, Lt6/y$b;->n:I

    const/4 v6, 0x2

    if-ne v5, v6, :cond_7

    move v12, v3

    goto :goto_7

    :cond_7
    move v12, v2

    :goto_7
    invoke-virtual {v4, v12}, Lt6/k4;->a(Z)V

    invoke-static {v0}, Lt6/d1;->Z0(Lt6/y3;)Lt6/v;

    move-result-object v0

    iput-object v0, v1, Lt6/d1;->p0:Lt6/v;

    sget-object v0, Lu8/a0;->e:Lu8/a0;

    iput-object v0, v1, Lt6/d1;->q0:Lu8/a0;

    sget-object v0, Lt8/h0;->c:Lt8/h0;

    iput-object v0, v1, Lt6/d1;->c0:Lt8/h0;

    iget-object v0, v1, Lt6/d1;->g0:Lv6/e;

    move-object/from16 v5, v34

    invoke-virtual {v5, v0}, Lq8/a0;->h(Lv6/e;)V

    iget v0, v1, Lt6/d1;->f0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v2, 0xa

    invoke-direct {v1, v3, v2, v0}, Lt6/d1;->W1(IILjava/lang/Object;)V

    iget v0, v1, Lt6/d1;->f0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v1, v6, v2, v0}, Lt6/d1;->W1(IILjava/lang/Object;)V

    iget-object v0, v1, Lt6/d1;->g0:Lv6/e;

    const/4 v2, 0x3

    invoke-direct {v1, v3, v2, v0}, Lt6/d1;->W1(IILjava/lang/Object;)V

    iget v0, v1, Lt6/d1;->a0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x4

    invoke-direct {v1, v6, v2, v0}, Lt6/d1;->W1(IILjava/lang/Object;)V

    iget v0, v1, Lt6/d1;->b0:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x5

    invoke-direct {v1, v6, v2, v0}, Lt6/d1;->W1(IILjava/lang/Object;)V

    iget-boolean v0, v1, Lt6/d1;->i0:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/16 v2, 0x9

    invoke-direct {v1, v3, v2, v0}, Lt6/d1;->W1(IILjava/lang/Object;)V

    move-object/from16 v0, v36

    const/4 v2, 0x7

    invoke-direct {v1, v6, v2, v0}, Lt6/d1;->W1(IILjava/lang/Object;)V

    const/16 v2, 0x8

    const/4 v3, 0x6

    invoke-direct {v1, v3, v2, v0}, Lt6/d1;->W1(IILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual/range {v24 .. v24}, Lt8/g;->e()Z

    return-void

    :catchall_0
    move-exception v0

    iget-object v2, v1, Lt6/d1;->d:Lt8/g;

    invoke-virtual {v2}, Lt8/g;->e()Z

    throw v0
.end method

.method static synthetic A0(Lt6/d1;Lt6/h2;)Lt6/h2;
    .locals 0

    iput-object p1, p0, Lt6/d1;->P:Lt6/h2;

    return-object p1
.end method

.method private synthetic A1(Lt6/j3$d;)V
    .locals 1

    iget-object v0, p0, Lt6/d1;->O:Lt6/j3$b;

    invoke-interface {p1, v0}, Lt6/j3$d;->onAvailableCommandsChanged(Lt6/j3$b;)V

    return-void
.end method

.method static synthetic B0(Lt6/d1;)Z
    .locals 0

    iget-boolean p0, p0, Lt6/d1;->Y:Z

    return p0
.end method

.method private static synthetic B1(Lt6/g3;ILt6/j3$d;)V
    .locals 0

    iget-object p0, p0, Lt6/g3;->a:Lt6/d4;

    invoke-interface {p2, p0, p1}, Lt6/j3$d;->onTimelineChanged(Lt6/d4;I)V

    return-void
.end method

.method static synthetic C0(Lt6/d1;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lt6/d1;->c2(Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic C1(ILt6/j3$e;Lt6/j3$e;Lt6/j3$d;)V
    .locals 0

    invoke-interface {p3, p0}, Lt6/j3$d;->onPositionDiscontinuity(I)V

    invoke-interface {p3, p1, p2, p0}, Lt6/j3$d;->onPositionDiscontinuity(Lt6/j3$e;Lt6/j3$e;I)V

    return-void
.end method

.method static synthetic D0(Lt6/d1;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lt6/d1;->R1(II)V

    return-void
.end method

.method private static synthetic D1(Lt6/c2;ILt6/j3$d;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt6/j3$d;->onMediaItemTransition(Lt6/c2;I)V

    return-void
.end method

.method static synthetic E0(Lt6/d1;Landroid/graphics/SurfaceTexture;)V
    .locals 0

    invoke-direct {p0, p1}, Lt6/d1;->b2(Landroid/graphics/SurfaceTexture;)V

    return-void
.end method

.method private static synthetic E1(Lt6/g3;Lt6/j3$d;)V
    .locals 0

    iget-object p0, p0, Lt6/g3;->f:Lt6/x;

    invoke-interface {p1, p0}, Lt6/j3$d;->onPlayerErrorChanged(Lt6/f3;)V

    return-void
.end method

.method static synthetic F0(Lt6/d1;)V
    .locals 0

    invoke-direct {p0}, Lt6/d1;->X1()V

    return-void
.end method

.method private static synthetic F1(Lt6/g3;Lt6/j3$d;)V
    .locals 0

    iget-object p0, p0, Lt6/g3;->f:Lt6/x;

    invoke-interface {p1, p0}, Lt6/j3$d;->onPlayerError(Lt6/f3;)V

    return-void
.end method

.method static synthetic G0(ZI)I
    .locals 0

    invoke-static {p0, p1}, Lt6/d1;->k1(ZI)I

    move-result p0

    return p0
.end method

.method private static synthetic G1(Lt6/g3;Lt6/j3$d;)V
    .locals 0

    iget-object p0, p0, Lt6/g3;->i:Lq8/b0;

    iget-object p0, p0, Lq8/b0;->d:Lt6/i4;

    invoke-interface {p1, p0}, Lt6/j3$d;->onTracksChanged(Lt6/i4;)V

    return-void
.end method

.method static synthetic H0(Lt6/d1;ZII)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lt6/d1;->g2(ZII)V

    return-void
.end method

.method private static synthetic H1(Lt6/h2;Lt6/j3$d;)V
    .locals 0

    invoke-interface {p1, p0}, Lt6/j3$d;->onMediaMetadataChanged(Lt6/h2;)V

    return-void
.end method

.method static synthetic I0(Lt6/d1;)Lt6/y3;
    .locals 0

    iget-object p0, p0, Lt6/d1;->B:Lt6/y3;

    return-object p0
.end method

.method private static synthetic I1(Lt6/g3;Lt6/j3$d;)V
    .locals 1

    iget-boolean v0, p0, Lt6/g3;->g:Z

    invoke-interface {p1, v0}, Lt6/j3$d;->onLoadingChanged(Z)V

    iget-boolean p0, p0, Lt6/g3;->g:Z

    invoke-interface {p1, p0}, Lt6/j3$d;->onIsLoadingChanged(Z)V

    return-void
.end method

.method static synthetic J0(Lt6/y3;)Lt6/v;
    .locals 0

    invoke-static {p0}, Lt6/d1;->Z0(Lt6/y3;)Lt6/v;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic J1(Lt6/g3;Lt6/j3$d;)V
    .locals 1

    iget-boolean v0, p0, Lt6/g3;->l:Z

    iget p0, p0, Lt6/g3;->e:I

    invoke-interface {p1, v0, p0}, Lt6/j3$d;->onPlayerStateChanged(ZI)V

    return-void
.end method

.method static synthetic K0(Lt6/d1;)Lt6/v;
    .locals 0

    iget-object p0, p0, Lt6/d1;->p0:Lt6/v;

    return-object p0
.end method

.method private static synthetic K1(Lt6/g3;Lt6/j3$d;)V
    .locals 0

    iget p0, p0, Lt6/g3;->e:I

    invoke-interface {p1, p0}, Lt6/j3$d;->onPlaybackStateChanged(I)V

    return-void
.end method

.method static synthetic L0(Lt6/d1;Lt6/v;)Lt6/v;
    .locals 0

    iput-object p1, p0, Lt6/d1;->p0:Lt6/v;

    return-object p1
.end method

.method private static synthetic L1(Lt6/g3;ILt6/j3$d;)V
    .locals 0

    iget-boolean p0, p0, Lt6/g3;->l:Z

    invoke-interface {p2, p0, p1}, Lt6/j3$d;->onPlayWhenReadyChanged(ZI)V

    return-void
.end method

.method static synthetic M0(Lt6/d1;)V
    .locals 0

    invoke-direct {p0}, Lt6/d1;->j2()V

    return-void
.end method

.method private static synthetic M1(Lt6/g3;Lt6/j3$d;)V
    .locals 0

    iget p0, p0, Lt6/g3;->m:I

    invoke-interface {p1, p0}, Lt6/j3$d;->onPlaybackSuppressionReasonChanged(I)V

    return-void
.end method

.method static synthetic N0(Lt6/d1;Lw6/e;)Lw6/e;
    .locals 0

    iput-object p1, p0, Lt6/d1;->d0:Lw6/e;

    return-object p1
.end method

.method private static synthetic N1(Lt6/g3;Lt6/j3$d;)V
    .locals 0

    invoke-static {p0}, Lt6/d1;->r1(Lt6/g3;)Z

    move-result p0

    invoke-interface {p1, p0}, Lt6/j3$d;->onIsPlayingChanged(Z)V

    return-void
.end method

.method static synthetic O0(Lt6/d1;)Lu6/a;
    .locals 0

    iget-object p0, p0, Lt6/d1;->r:Lu6/a;

    return-object p0
.end method

.method private static synthetic O1(Lt6/g3;Lt6/j3$d;)V
    .locals 0

    iget-object p0, p0, Lt6/g3;->n:Lt6/i3;

    invoke-interface {p1, p0}, Lt6/j3$d;->onPlaybackParametersChanged(Lt6/i3;)V

    return-void
.end method

.method static synthetic P0(Lt6/d1;Lt6/u1;)Lt6/u1;
    .locals 0

    iput-object p1, p0, Lt6/d1;->R:Lt6/u1;

    return-object p1
.end method

.method private P1(Lt6/g3;Lt6/d4;Landroid/util/Pair;)Lt6/g3;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt6/g3;",
            "Lt6/d4;",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;)",
            "Lt6/g3;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    invoke-virtual/range {p2 .. p2}, Lt6/d4;->v()Z

    move-result v3

    const/4 v4, 0x1

    if-nez v3, :cond_1

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move v3, v4

    :goto_1
    invoke-static {v3}, Lt8/a;->a(Z)V

    move-object/from16 v3, p1

    iget-object v5, v3, Lt6/g3;->a:Lt6/d4;

    invoke-virtual/range {p1 .. p2}, Lt6/g3;->i(Lt6/d4;)Lt6/g3;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, Lt6/d4;->v()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {}, Lt6/g3;->k()Lv7/a0$b;

    move-result-object v1

    iget-wide v2, v0, Lt6/d1;->v0:J

    invoke-static {v2, v3}, Lt8/r0;->C0(J)J

    move-result-wide v12

    const-wide/16 v14, 0x0

    sget-object v16, Lv7/f1;->d:Lv7/f1;

    iget-object v2, v0, Lt6/d1;->b:Lq8/b0;

    invoke-static {}, Lcom/google/common/collect/w;->v()Lcom/google/common/collect/w;

    move-result-object v18

    move-object v7, v1

    move-wide v8, v12

    move-wide v10, v12

    move-object/from16 v17, v2

    invoke-virtual/range {v6 .. v18}, Lt6/g3;->c(Lv7/a0$b;JJJJLv7/f1;Lq8/b0;Ljava/util/List;)Lt6/g3;

    move-result-object v2

    invoke-virtual {v2, v1}, Lt6/g3;->b(Lv7/a0$b;)Lt6/g3;

    move-result-object v1

    iget-wide v2, v1, Lt6/g3;->r:J

    iput-wide v2, v1, Lt6/g3;->p:J

    return-object v1

    :cond_2
    iget-object v3, v6, Lt6/g3;->b:Lv7/a0$b;

    iget-object v3, v3, Lv7/z;->a:Ljava/lang/Object;

    invoke-static/range {p3 .. p3}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/util/Pair;

    iget-object v7, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    xor-int/2addr v7, v4

    if-eqz v7, :cond_3

    new-instance v8, Lv7/a0$b;

    iget-object v9, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-direct {v8, v9}, Lv7/a0$b;-><init>(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object v8, v6, Lt6/g3;->b:Lv7/a0$b;

    :goto_2
    move-object v14, v8

    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    invoke-virtual/range {p0 .. p0}, Lt6/d1;->B()J

    move-result-wide v8

    invoke-static {v8, v9}, Lt8/r0;->C0(J)J

    move-result-wide v8

    invoke-virtual {v5}, Lt6/d4;->v()Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, v0, Lt6/d1;->n:Lt6/d4$b;

    invoke-virtual {v5, v3, v2}, Lt6/d4;->m(Ljava/lang/Object;Lt6/d4$b;)Lt6/d4$b;

    move-result-object v2

    invoke-virtual {v2}, Lt6/d4$b;->r()J

    move-result-wide v2

    sub-long/2addr v8, v2

    :cond_4
    if-nez v7, :cond_b

    cmp-long v2, v12, v8

    if-gez v2, :cond_5

    goto/16 :goto_6

    :cond_5
    if-nez v2, :cond_9

    iget-object v2, v6, Lt6/g3;->k:Lv7/a0$b;

    iget-object v2, v2, Lv7/z;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lt6/d4;->g(Ljava/lang/Object;)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_6

    iget-object v3, v0, Lt6/d1;->n:Lt6/d4$b;

    invoke-virtual {v1, v2, v3}, Lt6/d4;->k(ILt6/d4$b;)Lt6/d4$b;

    move-result-object v2

    iget v2, v2, Lt6/d4$b;->c:I

    iget-object v3, v14, Lv7/z;->a:Ljava/lang/Object;

    iget-object v4, v0, Lt6/d1;->n:Lt6/d4$b;

    invoke-virtual {v1, v3, v4}, Lt6/d4;->m(Ljava/lang/Object;Lt6/d4$b;)Lt6/d4$b;

    move-result-object v3

    iget v3, v3, Lt6/d4$b;->c:I

    if-eq v2, v3, :cond_8

    :cond_6
    iget-object v2, v14, Lv7/z;->a:Ljava/lang/Object;

    iget-object v3, v0, Lt6/d1;->n:Lt6/d4$b;

    invoke-virtual {v1, v2, v3}, Lt6/d4;->m(Ljava/lang/Object;Lt6/d4$b;)Lt6/d4$b;

    invoke-virtual {v14}, Lv7/z;->b()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, v0, Lt6/d1;->n:Lt6/d4$b;

    iget v2, v14, Lv7/z;->b:I

    iget v3, v14, Lv7/z;->c:I

    invoke-virtual {v1, v2, v3}, Lt6/d4$b;->f(II)J

    move-result-wide v1

    goto :goto_3

    :cond_7
    iget-object v1, v0, Lt6/d1;->n:Lt6/d4$b;

    iget-wide v1, v1, Lt6/d4$b;->d:J

    :goto_3
    iget-wide v8, v6, Lt6/g3;->r:J

    iget-wide v10, v6, Lt6/g3;->r:J

    iget-wide v12, v6, Lt6/g3;->d:J

    iget-wide v3, v6, Lt6/g3;->r:J

    sub-long v3, v1, v3

    iget-object v5, v6, Lt6/g3;->h:Lv7/f1;

    iget-object v15, v6, Lt6/g3;->i:Lq8/b0;

    iget-object v7, v6, Lt6/g3;->j:Ljava/util/List;

    move-object/from16 v18, v7

    move-object v7, v14

    move-object v0, v14

    move-object/from16 v17, v15

    move-wide v14, v3

    move-object/from16 v16, v5

    invoke-virtual/range {v6 .. v18}, Lt6/g3;->c(Lv7/a0$b;JJJJLv7/f1;Lq8/b0;Ljava/util/List;)Lt6/g3;

    move-result-object v3

    invoke-virtual {v3, v0}, Lt6/g3;->b(Lv7/a0$b;)Lt6/g3;

    move-result-object v6

    goto :goto_5

    :cond_8
    :goto_4
    move-object/from16 v0, p0

    goto/16 :goto_a

    :cond_9
    move-object v0, v14

    invoke-virtual {v0}, Lv7/z;->b()Z

    move-result v1

    xor-int/2addr v1, v4

    invoke-static {v1}, Lt8/a;->g(Z)V

    iget-wide v1, v6, Lt6/g3;->q:J

    sub-long v3, v12, v8

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x0

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v14

    iget-wide v1, v6, Lt6/g3;->p:J

    iget-object v3, v6, Lt6/g3;->k:Lv7/a0$b;

    iget-object v4, v6, Lt6/g3;->b:Lv7/a0$b;

    invoke-virtual {v3, v4}, Lv7/z;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    add-long v1, v12, v14

    :cond_a
    iget-object v3, v6, Lt6/g3;->h:Lv7/f1;

    iget-object v4, v6, Lt6/g3;->i:Lq8/b0;

    iget-object v5, v6, Lt6/g3;->j:Ljava/util/List;

    move-object v7, v0

    move-wide v8, v12

    move-wide v10, v12

    move-object/from16 v16, v3

    move-object/from16 v17, v4

    move-object/from16 v18, v5

    invoke-virtual/range {v6 .. v18}, Lt6/g3;->c(Lv7/a0$b;JJJJLv7/f1;Lq8/b0;Ljava/util/List;)Lt6/g3;

    move-result-object v6

    :goto_5
    iput-wide v1, v6, Lt6/g3;->p:J

    goto :goto_4

    :cond_b
    :goto_6
    move-object v0, v14

    invoke-virtual {v0}, Lv7/z;->b()Z

    move-result v1

    xor-int/2addr v1, v4

    invoke-static {v1}, Lt8/a;->g(Z)V

    const-wide/16 v14, 0x0

    if-eqz v7, :cond_c

    sget-object v1, Lv7/f1;->d:Lv7/f1;

    goto :goto_7

    :cond_c
    iget-object v1, v6, Lt6/g3;->h:Lv7/f1;

    :goto_7
    move-object/from16 v16, v1

    move-object v1, v0

    move-object/from16 v0, p0

    if-eqz v7, :cond_d

    iget-object v2, v0, Lt6/d1;->b:Lq8/b0;

    goto :goto_8

    :cond_d
    iget-object v2, v6, Lt6/g3;->i:Lq8/b0;

    :goto_8
    move-object/from16 v17, v2

    if-eqz v7, :cond_e

    invoke-static {}, Lcom/google/common/collect/w;->v()Lcom/google/common/collect/w;

    move-result-object v2

    goto :goto_9

    :cond_e
    iget-object v2, v6, Lt6/g3;->j:Ljava/util/List;

    :goto_9
    move-object/from16 v18, v2

    move-object v7, v1

    move-wide v8, v12

    move-wide v10, v12

    move-wide v2, v12

    invoke-virtual/range {v6 .. v18}, Lt6/g3;->c(Lv7/a0$b;JJJJLv7/f1;Lq8/b0;Ljava/util/List;)Lt6/g3;

    move-result-object v4

    invoke-virtual {v4, v1}, Lt6/g3;->b(Lv7/a0$b;)Lt6/g3;

    move-result-object v6

    iput-wide v2, v6, Lt6/g3;->p:J

    :goto_a
    return-object v6
.end method

.method static synthetic Q0(Lt6/d1;Lu8/a0;)Lu8/a0;
    .locals 0

    iput-object p1, p0, Lt6/d1;->q0:Lu8/a0;

    return-object p1
.end method

.method private Q1(Lt6/d4;IJ)Landroid/util/Pair;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt6/d4;",
            "IJ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lt6/d4;->v()Z

    move-result v0

    if-eqz v0, :cond_1

    iput p2, p0, Lt6/d1;->t0:I

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p3, p1

    if-nez p1, :cond_0

    const-wide/16 p3, 0x0

    :cond_0
    iput-wide p3, p0, Lt6/d1;->v0:J

    const/4 p1, 0x0

    iput p1, p0, Lt6/d1;->u0:I

    const/4 p1, 0x0

    return-object p1

    :cond_1
    const/4 v0, -0x1

    if-eq p2, v0, :cond_2

    invoke-virtual {p1}, Lt6/d4;->u()I

    move-result v0

    if-lt p2, v0, :cond_3

    :cond_2
    iget-boolean p2, p0, Lt6/d1;->G:Z

    invoke-virtual {p1, p2}, Lt6/d4;->f(Z)I

    move-result p2

    iget-object p3, p0, Lt6/k;->a:Lt6/d4$d;

    invoke-virtual {p1, p2, p3}, Lt6/d4;->s(ILt6/d4$d;)Lt6/d4$d;

    move-result-object p3

    invoke-virtual {p3}, Lt6/d4$d;->e()J

    move-result-wide p3

    :cond_3
    move v3, p2

    iget-object v1, p0, Lt6/k;->a:Lt6/d4$d;

    iget-object v2, p0, Lt6/d1;->n:Lt6/d4$b;

    invoke-static {p3, p4}, Lt8/r0;->C0(J)J

    move-result-wide v4

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lt6/d4;->o(Lt6/d4$d;Lt6/d4$b;IJ)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method static synthetic R0(Lt6/d1;)Lt8/r;
    .locals 0

    iget-object p0, p0, Lt6/d1;->l:Lt8/r;

    return-object p0
.end method

.method private R1(II)V
    .locals 2

    iget-object v0, p0, Lt6/d1;->c0:Lt8/h0;

    invoke-virtual {v0}, Lt8/h0;->b()I

    move-result v0

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lt6/d1;->c0:Lt8/h0;

    invoke-virtual {v0}, Lt8/h0;->a()I

    move-result v0

    if-eq p2, v0, :cond_1

    :cond_0
    new-instance v0, Lt8/h0;

    invoke-direct {v0, p1, p2}, Lt8/h0;-><init>(II)V

    iput-object v0, p0, Lt6/d1;->c0:Lt8/h0;

    iget-object v0, p0, Lt6/d1;->l:Lt8/r;

    new-instance v1, Lt6/f0;

    invoke-direct {v1, p1, p2}, Lt6/f0;-><init>(II)V

    const/16 p1, 0x18

    invoke-virtual {v0, p1, v1}, Lt8/r;->l(ILt8/r$a;)V

    :cond_1
    return-void
.end method

.method static synthetic S0(Lt6/d1;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lt6/d1;->U:Ljava/lang/Object;

    return-object p0
.end method

.method private S1(Lt6/d4;Lv7/a0$b;J)J
    .locals 1

    iget-object p2, p2, Lv7/z;->a:Ljava/lang/Object;

    iget-object v0, p0, Lt6/d1;->n:Lt6/d4$b;

    invoke-virtual {p1, p2, v0}, Lt6/d4;->m(Ljava/lang/Object;Lt6/d4$b;)Lt6/d4$b;

    iget-object p1, p0, Lt6/d1;->n:Lt6/d4$b;

    invoke-virtual {p1}, Lt6/d4$b;->r()J

    move-result-wide p1

    add-long/2addr p3, p1

    return-wide p3
.end method

.method static synthetic T0(Lt6/d1;Lw6/e;)Lw6/e;
    .locals 0

    iput-object p1, p0, Lt6/d1;->e0:Lw6/e;

    return-object p1
.end method

.method private T1(II)Lt6/g3;
    .locals 6

    invoke-virtual {p0}, Lt6/d1;->G()I

    move-result v0

    invoke-virtual {p0}, Lt6/d1;->r()Lt6/d4;

    move-result-object v1

    iget-object v2, p0, Lt6/d1;->o:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    iget v3, p0, Lt6/d1;->H:I

    const/4 v4, 0x1

    add-int/2addr v3, v4

    iput v3, p0, Lt6/d1;->H:I

    invoke-direct {p0, p1, p2}, Lt6/d1;->U1(II)V

    invoke-direct {p0}, Lt6/d1;->a1()Lt6/d4;

    move-result-object v3

    iget-object v5, p0, Lt6/d1;->s0:Lt6/g3;

    invoke-direct {p0, v1, v3}, Lt6/d1;->j1(Lt6/d4;Lt6/d4;)Landroid/util/Pair;

    move-result-object v1

    invoke-direct {p0, v5, v3, v1}, Lt6/d1;->P1(Lt6/g3;Lt6/d4;Landroid/util/Pair;)Lt6/g3;

    move-result-object v1

    iget v3, v1, Lt6/g3;->e:I

    const/4 v5, 0x4

    if-eq v3, v4, :cond_0

    if-eq v3, v5, :cond_0

    if-ge p1, p2, :cond_0

    if-ne p2, v2, :cond_0

    iget-object v2, v1, Lt6/g3;->a:Lt6/d4;

    invoke-virtual {v2}, Lt6/d4;->u()I

    move-result v2

    if-lt v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_1

    invoke-virtual {v1, v5}, Lt6/g3;->g(I)Lt6/g3;

    move-result-object v1

    :cond_1
    iget-object v0, p0, Lt6/d1;->k:Lt6/q1;

    iget-object v2, p0, Lt6/d1;->M:Lv7/x0;

    invoke-virtual {v0, p1, p2, v2}, Lt6/q1;->n0(IILv7/x0;)V

    return-object v1
.end method

.method private U1(II)V
    .locals 2

    add-int/lit8 v0, p2, -0x1

    :goto_0
    if-lt v0, p1, :cond_0

    iget-object v1, p0, Lt6/d1;->o:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lt6/d1;->M:Lv7/x0;

    invoke-interface {v0, p1, p2}, Lv7/x0;->a(II)Lv7/x0;

    move-result-object p1

    iput-object p1, p0, Lt6/d1;->M:Lv7/x0;

    return-void
.end method

.method public static synthetic V(Lt6/g3;Lt6/j3$d;)V
    .locals 0

    invoke-static {p0, p1}, Lt6/d1;->E1(Lt6/g3;Lt6/j3$d;)V

    return-void
.end method

.method private V1()V
    .locals 3

    iget-object v0, p0, Lt6/d1;->X:Lv8/l;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lt6/d1;->y:Lt6/d1$d;

    invoke-direct {p0, v0}, Lt6/d1;->c1(Lt6/m3$b;)Lt6/m3;

    move-result-object v0

    const/16 v2, 0x2710

    invoke-virtual {v0, v2}, Lt6/m3;->n(I)Lt6/m3;

    move-result-object v0

    invoke-virtual {v0, v1}, Lt6/m3;->m(Ljava/lang/Object;)Lt6/m3;

    move-result-object v0

    invoke-virtual {v0}, Lt6/m3;->l()Lt6/m3;

    iget-object v0, p0, Lt6/d1;->X:Lv8/l;

    iget-object v2, p0, Lt6/d1;->x:Lt6/d1$c;

    invoke-virtual {v0, v2}, Lv8/l;->h(Lv8/l$b;)V

    iput-object v1, p0, Lt6/d1;->X:Lv8/l;

    :cond_0
    iget-object v0, p0, Lt6/d1;->Z:Landroid/view/TextureView;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;

    move-result-object v0

    iget-object v2, p0, Lt6/d1;->x:Lt6/d1$c;

    if-eq v0, v2, :cond_1

    const-string v0, "ExoPlayerImpl"

    const-string v2, "SurfaceTextureListener already unset or replaced."

    invoke-static {v0, v2}, Lt8/s;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lt6/d1;->Z:Landroid/view/TextureView;

    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    :goto_0
    iput-object v1, p0, Lt6/d1;->Z:Landroid/view/TextureView;

    :cond_2
    iget-object v0, p0, Lt6/d1;->W:Landroid/view/SurfaceHolder;

    if-eqz v0, :cond_3

    iget-object v2, p0, Lt6/d1;->x:Lt6/d1$c;

    invoke-interface {v0, v2}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    iput-object v1, p0, Lt6/d1;->W:Landroid/view/SurfaceHolder;

    :cond_3
    return-void
.end method

.method public static synthetic W(Lt6/d1;Lt6/j3$d;Lt8/l;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lt6/d1;->t1(Lt6/j3$d;Lt8/l;)V

    return-void
.end method

.method private W0(ILjava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lv7/a0;",
            ">;)",
            "Ljava/util/List<",
            "Lt6/a3$c;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    new-instance v2, Lt6/a3$c;

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lv7/a0;

    iget-boolean v4, p0, Lt6/d1;->p:Z

    invoke-direct {v2, v3, v4}, Lt6/a3$c;-><init>(Lv7/a0;Z)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v3, p0, Lt6/d1;->o:Ljava/util/List;

    add-int v4, v1, p1

    new-instance v5, Lt6/d1$e;

    iget-object v6, v2, Lt6/a3$c;->b:Ljava/lang/Object;

    iget-object v2, v2, Lt6/a3$c;->a:Lv7/w;

    invoke-virtual {v2}, Lv7/w;->Z()Lt6/d4;

    move-result-object v2

    invoke-direct {v5, v6, v2}, Lt6/d1$e;-><init>(Ljava/lang/Object;Lt6/d4;)V

    invoke-interface {v3, v4, v5}, Ljava/util/List;->add(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lt6/d1;->M:Lv7/x0;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p2, p1, v1}, Lv7/x0;->g(II)Lv7/x0;

    move-result-object p1

    iput-object p1, p0, Lt6/d1;->M:Lv7/x0;

    return-object v0
.end method

.method private W1(IILjava/lang/Object;)V
    .locals 5

    iget-object v0, p0, Lt6/d1;->g:[Lt6/q3;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-interface {v3}, Lt6/q3;->g()I

    move-result v4

    if-ne v4, p1, :cond_0

    invoke-direct {p0, v3}, Lt6/d1;->c1(Lt6/m3$b;)Lt6/m3;

    move-result-object v3

    invoke-virtual {v3, p2}, Lt6/m3;->n(I)Lt6/m3;

    move-result-object v3

    invoke-virtual {v3, p3}, Lt6/m3;->m(Ljava/lang/Object;)Lt6/m3;

    move-result-object v3

    invoke-virtual {v3}, Lt6/m3;->l()Lt6/m3;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static synthetic X(FLt6/j3$d;)V
    .locals 0

    invoke-static {p0, p1}, Lt6/d1;->z1(FLt6/j3$d;)V

    return-void
.end method

.method private X1()V
    .locals 3

    iget v0, p0, Lt6/d1;->h0:F

    iget-object v1, p0, Lt6/d1;->A:Lt6/j;

    invoke-virtual {v1}, Lt6/j;->g()F

    move-result v1

    mul-float/2addr v0, v1

    const/4 v1, 0x2

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/4 v2, 0x1

    invoke-direct {p0, v2, v1, v0}, Lt6/d1;->W1(IILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic Y(Lt6/g3;Lt6/j3$d;)V
    .locals 0

    invoke-static {p0, p1}, Lt6/d1;->K1(Lt6/g3;Lt6/j3$d;)V

    return-void
.end method

.method private Y0()Lt6/h2;
    .locals 3

    invoke-virtual {p0}, Lt6/d1;->r()Lt6/d4;

    move-result-object v0

    invoke-virtual {v0}, Lt6/d4;->v()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lt6/d1;->r0:Lt6/h2;

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lt6/d1;->G()I

    move-result v1

    iget-object v2, p0, Lt6/k;->a:Lt6/d4$d;

    invoke-virtual {v0, v1, v2}, Lt6/d4;->s(ILt6/d4$d;)Lt6/d4$d;

    move-result-object v0

    iget-object v0, v0, Lt6/d4$d;->c:Lt6/c2;

    iget-object v1, p0, Lt6/d1;->r0:Lt6/h2;

    invoke-virtual {v1}, Lt6/h2;->c()Lt6/h2$b;

    move-result-object v1

    iget-object v0, v0, Lt6/c2;->e:Lt6/h2;

    invoke-virtual {v1, v0}, Lt6/h2$b;->J(Lt6/h2;)Lt6/h2$b;

    move-result-object v0

    invoke-virtual {v0}, Lt6/h2$b;->H()Lt6/h2;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic Z(Lt6/g3;Lt6/j3$d;)V
    .locals 0

    invoke-static {p0, p1}, Lt6/d1;->G1(Lt6/g3;Lt6/j3$d;)V

    return-void
.end method

.method private static Z0(Lt6/y3;)Lt6/v;
    .locals 3

    new-instance v0, Lt6/v;

    invoke-virtual {p0}, Lt6/y3;->d()I

    move-result v1

    invoke-virtual {p0}, Lt6/y3;->c()I

    move-result p0

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, p0}, Lt6/v;-><init>(III)V

    return-object v0
.end method

.method public static synthetic a0(IILt6/j3$d;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt6/d1;->s1(IILt6/j3$d;)V

    return-void
.end method

.method private a1()Lt6/d4;
    .locals 3

    new-instance v0, Lt6/n3;

    iget-object v1, p0, Lt6/d1;->o:Ljava/util/List;

    iget-object v2, p0, Lt6/d1;->M:Lv7/x0;

    invoke-direct {v0, v1, v2}, Lt6/n3;-><init>(Ljava/util/Collection;Lv7/x0;)V

    return-object v0
.end method

.method private a2(Ljava/util/List;IJZ)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lv7/a0;",
            ">;IJZ)V"
        }
    .end annotation

    move-object/from16 v11, p0

    move/from16 v0, p2

    invoke-direct/range {p0 .. p0}, Lt6/d1;->i1()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lt6/d1;->e()J

    move-result-wide v2

    iget v4, v11, Lt6/d1;->H:I

    const/4 v5, 0x1

    add-int/2addr v4, v5

    iput v4, v11, Lt6/d1;->H:I

    iget-object v4, v11, Lt6/d1;->o:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    const/4 v6, 0x0

    if-nez v4, :cond_0

    iget-object v4, v11, Lt6/d1;->o:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v11, v6, v4}, Lt6/d1;->U1(II)V

    :cond_0
    move-object/from16 v4, p1

    invoke-direct {v11, v6, v4}, Lt6/d1;->W0(ILjava/util/List;)Ljava/util/List;

    move-result-object v13

    invoke-direct/range {p0 .. p0}, Lt6/d1;->a1()Lt6/d4;

    move-result-object v4

    invoke-virtual {v4}, Lt6/d4;->v()Z

    move-result v7

    if-nez v7, :cond_2

    invoke-virtual {v4}, Lt6/d4;->u()I

    move-result v7

    if-ge v0, v7, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Lt6/y1;

    move-wide/from16 v7, p3

    invoke-direct {v1, v4, v0, v7, v8}, Lt6/y1;-><init>(Lt6/d4;IJ)V

    throw v1

    :cond_2
    :goto_0
    move-wide/from16 v7, p3

    const/4 v9, -0x1

    if-eqz p5, :cond_3

    iget-boolean v0, v11, Lt6/d1;->G:Z

    invoke-virtual {v4, v0}, Lt6/d4;->f(Z)I

    move-result v0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    move v14, v0

    goto :goto_1

    :cond_3
    if-ne v0, v9, :cond_4

    move v14, v1

    move-wide v1, v2

    goto :goto_1

    :cond_4
    move v14, v0

    move-wide v1, v7

    :goto_1
    iget-object v0, v11, Lt6/d1;->s0:Lt6/g3;

    invoke-direct {v11, v4, v14, v1, v2}, Lt6/d1;->Q1(Lt6/d4;IJ)Landroid/util/Pair;

    move-result-object v3

    invoke-direct {v11, v0, v4, v3}, Lt6/d1;->P1(Lt6/g3;Lt6/d4;Landroid/util/Pair;)Lt6/g3;

    move-result-object v0

    iget v3, v0, Lt6/g3;->e:I

    if-eq v14, v9, :cond_7

    if-eq v3, v5, :cond_7

    invoke-virtual {v4}, Lt6/d4;->v()Z

    move-result v3

    if-nez v3, :cond_6

    invoke-virtual {v4}, Lt6/d4;->u()I

    move-result v3

    if-lt v14, v3, :cond_5

    goto :goto_2

    :cond_5
    const/4 v3, 0x2

    goto :goto_3

    :cond_6
    :goto_2
    const/4 v3, 0x4

    :cond_7
    :goto_3
    invoke-virtual {v0, v3}, Lt6/g3;->g(I)Lt6/g3;

    move-result-object v3

    iget-object v12, v11, Lt6/d1;->k:Lt6/q1;

    invoke-static {v1, v2}, Lt8/r0;->C0(J)J

    move-result-wide v15

    iget-object v0, v11, Lt6/d1;->M:Lv7/x0;

    move-object/from16 v17, v0

    invoke-virtual/range {v12 .. v17}, Lt6/q1;->N0(Ljava/util/List;IJLv7/x0;)V

    iget-object v0, v11, Lt6/d1;->s0:Lt6/g3;

    iget-object v0, v0, Lt6/g3;->b:Lv7/a0$b;

    iget-object v0, v0, Lv7/z;->a:Ljava/lang/Object;

    iget-object v1, v3, Lt6/g3;->b:Lv7/a0$b;

    iget-object v1, v1, Lv7/z;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, v11, Lt6/d1;->s0:Lt6/g3;

    iget-object v0, v0, Lt6/g3;->a:Lt6/d4;

    invoke-virtual {v0}, Lt6/d4;->v()Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_4

    :cond_8
    move v5, v6

    :goto_4
    const/4 v2, 0x0

    const/4 v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x4

    invoke-direct {v11, v3}, Lt6/d1;->h1(Lt6/g3;)J

    move-result-wide v8

    const/4 v10, -0x1

    const/4 v12, 0x0

    move-object/from16 v0, p0

    move-object v1, v3

    move v3, v4

    move v4, v6

    move v6, v7

    move-wide v7, v8

    move v9, v10

    move v10, v12

    invoke-direct/range {v0 .. v10}, Lt6/d1;->h2(Lt6/g3;IIZZIJIZ)V

    return-void
.end method

.method public static synthetic b0(Lt6/g3;Lt6/j3$d;)V
    .locals 0

    invoke-static {p0, p1}, Lt6/d1;->M1(Lt6/g3;Lt6/j3$d;)V

    return-void
.end method

.method private b1(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lt6/c2;",
            ">;)",
            "Ljava/util/List<",
            "Lv7/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lt6/d1;->q:Lv7/a0$a;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lt6/c2;

    invoke-interface {v2, v3}, Lv7/a0$a;->a(Lt6/c2;)Lv7/a0;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private b2(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    new-instance v0, Landroid/view/Surface;

    invoke-direct {v0, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    invoke-direct {p0, v0}, Lt6/d1;->c2(Ljava/lang/Object;)V

    iput-object v0, p0, Lt6/d1;->V:Landroid/view/Surface;

    return-void
.end method

.method public static synthetic c0(Lt6/g3;Lt6/j3$d;)V
    .locals 0

    invoke-static {p0, p1}, Lt6/d1;->O1(Lt6/g3;Lt6/j3$d;)V

    return-void
.end method

.method private c1(Lt6/m3$b;)Lt6/m3;
    .locals 9

    invoke-direct {p0}, Lt6/d1;->i1()I

    move-result v0

    new-instance v8, Lt6/m3;

    iget-object v2, p0, Lt6/d1;->k:Lt6/q1;

    iget-object v1, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v4, v1, Lt6/g3;->a:Lt6/d4;

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    move v5, v0

    iget-object v6, p0, Lt6/d1;->w:Lt8/d;

    invoke-virtual {v2}, Lt6/q1;->B()Landroid/os/Looper;

    move-result-object v7

    move-object v1, v8

    move-object v3, p1

    invoke-direct/range {v1 .. v7}, Lt6/m3;-><init>(Lt6/m3$a;Lt6/m3$b;Lt6/d4;ILt8/d;Landroid/os/Looper;)V

    return-object v8
.end method

.method private c2(Ljava/lang/Object;)V
    .locals 9

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lt6/d1;->g:[Lt6/q3;

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    const/4 v5, 0x1

    if-ge v4, v2, :cond_1

    aget-object v6, v1, v4

    invoke-interface {v6}, Lt6/q3;->g()I

    move-result v7

    const/4 v8, 0x2

    if-ne v7, v8, :cond_0

    invoke-direct {p0, v6}, Lt6/d1;->c1(Lt6/m3$b;)Lt6/m3;

    move-result-object v6

    invoke-virtual {v6, v5}, Lt6/m3;->n(I)Lt6/m3;

    move-result-object v5

    invoke-virtual {v5, p1}, Lt6/m3;->m(Ljava/lang/Object;)Lt6/m3;

    move-result-object v5

    invoke-virtual {v5}, Lt6/m3;->l()Lt6/m3;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lt6/d1;->U:Ljava/lang/Object;

    if-eqz v1, :cond_3

    if-eq v1, p1, :cond_3

    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt6/m3;

    iget-wide v6, p0, Lt6/d1;->E:J

    invoke-virtual {v1, v6, v7}, Lt6/m3;->a(J)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_1

    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_2
    move v5, v3

    :catch_1
    iget-object v0, p0, Lt6/d1;->U:Ljava/lang/Object;

    iget-object v1, p0, Lt6/d1;->V:Landroid/view/Surface;

    if-ne v0, v1, :cond_4

    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lt6/d1;->V:Landroid/view/Surface;

    goto :goto_2

    :cond_3
    move v5, v3

    :cond_4
    :goto_2
    iput-object p1, p0, Lt6/d1;->U:Ljava/lang/Object;

    if-eqz v5, :cond_5

    new-instance p1, Lt6/s1;

    const/4 v0, 0x3

    invoke-direct {p1, v0}, Lt6/s1;-><init>(I)V

    const/16 v0, 0x3eb

    invoke-static {p1, v0}, Lt6/x;->j(Ljava/lang/RuntimeException;I)Lt6/x;

    move-result-object p1

    invoke-direct {p0, v3, p1}, Lt6/d1;->e2(ZLt6/x;)V

    :cond_5
    return-void
.end method

.method public static synthetic d0(Lt6/g3;Lt6/j3$d;)V
    .locals 0

    invoke-static {p0, p1}, Lt6/d1;->N1(Lt6/g3;Lt6/j3$d;)V

    return-void
.end method

.method private d1(Lt6/g3;Lt6/g3;ZIZZ)Landroid/util/Pair;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt6/g3;",
            "Lt6/g3;",
            "ZIZZ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p2, Lt6/g3;->a:Lt6/d4;

    iget-object v1, p1, Lt6/g3;->a:Lt6/d4;

    invoke-virtual {v1}, Lt6/d4;->v()Z

    move-result v2

    const/4 v3, -0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lt6/d4;->v()Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance p1, Landroid/util/Pair;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p1, p2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_0
    invoke-virtual {v1}, Lt6/d4;->v()Z

    move-result v2

    invoke-virtual {v0}, Lt6/d4;->v()Z

    move-result v4

    const/4 v5, 0x3

    if-eq v2, v4, :cond_1

    new-instance p1, Landroid/util/Pair;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_1
    iget-object v2, p2, Lt6/g3;->b:Lv7/a0$b;

    iget-object v2, v2, Lv7/z;->a:Ljava/lang/Object;

    iget-object v4, p0, Lt6/d1;->n:Lt6/d4$b;

    invoke-virtual {v0, v2, v4}, Lt6/d4;->m(Ljava/lang/Object;Lt6/d4$b;)Lt6/d4$b;

    move-result-object v2

    iget v2, v2, Lt6/d4$b;->c:I

    iget-object v4, p0, Lt6/k;->a:Lt6/d4$d;

    invoke-virtual {v0, v2, v4}, Lt6/d4;->s(ILt6/d4$d;)Lt6/d4$d;

    move-result-object v0

    iget-object v0, v0, Lt6/d4$d;->a:Ljava/lang/Object;

    iget-object v2, p1, Lt6/g3;->b:Lv7/a0$b;

    iget-object v2, v2, Lv7/z;->a:Ljava/lang/Object;

    iget-object v4, p0, Lt6/d1;->n:Lt6/d4$b;

    invoke-virtual {v1, v2, v4}, Lt6/d4;->m(Ljava/lang/Object;Lt6/d4$b;)Lt6/d4$b;

    move-result-object v2

    iget v2, v2, Lt6/d4$b;->c:I

    iget-object v4, p0, Lt6/k;->a:Lt6/d4$d;

    invoke-virtual {v1, v2, v4}, Lt6/d4;->s(ILt6/d4$d;)Lt6/d4$d;

    move-result-object v1

    iget-object v1, v1, Lt6/d4$d;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-nez v0, :cond_5

    if-eqz p3, :cond_2

    if-nez p4, :cond_2

    move v5, v2

    goto :goto_0

    :cond_2
    if-eqz p3, :cond_3

    if-ne p4, v2, :cond_3

    move v5, v1

    goto :goto_0

    :cond_3
    if-eqz p5, :cond_4

    :goto_0
    new-instance p1, Landroid/util/Pair;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_5
    if-eqz p3, :cond_6

    if-nez p4, :cond_6

    iget-object p2, p2, Lt6/g3;->b:Lv7/a0$b;

    iget-wide v4, p2, Lv7/z;->d:J

    iget-object p1, p1, Lt6/g3;->b:Lv7/a0$b;

    iget-wide p1, p1, Lv7/z;->d:J

    cmp-long p1, v4, p1

    if-gez p1, :cond_6

    new-instance p1, Landroid/util/Pair;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 p3, 0x0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_6
    if-eqz p3, :cond_7

    if-ne p4, v2, :cond_7

    if-eqz p6, :cond_7

    new-instance p1, Landroid/util/Pair;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_7
    new-instance p1, Landroid/util/Pair;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p1, p2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static synthetic e0(Lt6/g3;Lt6/j3$d;)V
    .locals 0

    invoke-static {p0, p1}, Lt6/d1;->F1(Lt6/g3;Lt6/j3$d;)V

    return-void
.end method

.method private e2(ZLt6/x;)V
    .locals 13

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lt6/d1;->o:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-direct {p0, v0, p1}, Lt6/d1;->T1(II)Lt6/g3;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lt6/g3;->e(Lt6/x;)Lt6/g3;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v1, p1, Lt6/g3;->b:Lv7/a0$b;

    invoke-virtual {p1, v1}, Lt6/g3;->b(Lv7/a0$b;)Lt6/g3;

    move-result-object p1

    iget-wide v1, p1, Lt6/g3;->r:J

    iput-wide v1, p1, Lt6/g3;->p:J

    const-wide/16 v1, 0x0

    iput-wide v1, p1, Lt6/g3;->q:J

    :goto_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lt6/g3;->g(I)Lt6/g3;

    move-result-object p1

    if-eqz p2, :cond_1

    invoke-virtual {p1, p2}, Lt6/g3;->e(Lt6/x;)Lt6/g3;

    move-result-object p1

    :cond_1
    move-object v3, p1

    iget p1, p0, Lt6/d1;->H:I

    add-int/2addr p1, v1

    iput p1, p0, Lt6/d1;->H:I

    iget-object p1, p0, Lt6/d1;->k:Lt6/q1;

    invoke-virtual {p1}, Lt6/q1;->g1()V

    iget-object p1, v3, Lt6/g3;->a:Lt6/d4;

    invoke-virtual {p1}, Lt6/d4;->v()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object p1, p1, Lt6/g3;->a:Lt6/d4;

    invoke-virtual {p1}, Lt6/d4;->v()Z

    move-result p1

    if-nez p1, :cond_2

    move v7, v1

    goto :goto_1

    :cond_2
    move v7, v0

    :goto_1
    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v8, 0x4

    invoke-direct {p0, v3}, Lt6/d1;->h1(Lt6/g3;)J

    move-result-wide v9

    const/4 v11, -0x1

    const/4 v12, 0x0

    move-object v2, p0

    invoke-direct/range {v2 .. v12}, Lt6/d1;->h2(Lt6/g3;IIZZIJIZ)V

    return-void
.end method

.method public static synthetic f0(Lt6/g3;Lt6/j3$d;)V
    .locals 0

    invoke-static {p0, p1}, Lt6/d1;->J1(Lt6/g3;Lt6/j3$d;)V

    return-void
.end method

.method private f2()V
    .locals 3

    iget-object v0, p0, Lt6/d1;->O:Lt6/j3$b;

    iget-object v1, p0, Lt6/d1;->f:Lt6/j3;

    iget-object v2, p0, Lt6/d1;->c:Lt6/j3$b;

    invoke-static {v1, v2}, Lt8/r0;->H(Lt6/j3;Lt6/j3$b;)Lt6/j3$b;

    move-result-object v1

    iput-object v1, p0, Lt6/d1;->O:Lt6/j3$b;

    invoke-virtual {v1, v0}, Lt6/j3$b;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lt6/d1;->l:Lt8/r;

    new-instance v1, Lt6/u0;

    invoke-direct {v1, p0}, Lt6/u0;-><init>(Lt6/d1;)V

    const/16 v2, 0xd

    invoke-virtual {v0, v2, v1}, Lt8/r;->i(ILt8/r$a;)V

    :cond_0
    return-void
.end method

.method public static synthetic g0(Lt6/d1;Lt6/q1$e;)V
    .locals 0

    invoke-direct {p0, p1}, Lt6/d1;->v1(Lt6/q1$e;)V

    return-void
.end method

.method private g2(ZII)V
    .locals 11

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p1, :cond_0

    const/4 v3, -0x1

    if-eq p2, v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    if-eqz v3, :cond_1

    if-eq p2, v2, :cond_1

    move v1, v2

    :cond_1
    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget-boolean v4, v0, Lt6/g3;->l:Z

    if-ne v4, v3, :cond_2

    iget v4, v0, Lt6/g3;->m:I

    if-ne v4, v1, :cond_2

    return-void

    :cond_2
    iget v4, p0, Lt6/d1;->H:I

    add-int/2addr v4, v2

    iput v4, p0, Lt6/d1;->H:I

    invoke-virtual {v0, v3, v1}, Lt6/g3;->d(ZI)Lt6/g3;

    move-result-object v2

    iget-object v0, p0, Lt6/d1;->k:Lt6/q1;

    invoke-virtual {v0, v3, v1}, Lt6/q1;->Q0(ZI)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x5

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v9, -0x1

    const/4 v10, 0x0

    move-object v0, p0

    move-object v1, v2

    move v2, v3

    move v3, p3

    invoke-direct/range {v0 .. v10}, Lt6/d1;->h2(Lt6/g3;IIZZIJIZ)V

    return-void
.end method

.method public static synthetic h0(ILt6/j3$e;Lt6/j3$e;Lt6/j3$d;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lt6/d1;->C1(ILt6/j3$e;Lt6/j3$e;Lt6/j3$d;)V

    return-void
.end method

.method private h1(Lt6/g3;)J
    .locals 4

    iget-object v0, p1, Lt6/g3;->a:Lt6/d4;

    invoke-virtual {v0}, Lt6/d4;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lt6/d1;->v0:J

    invoke-static {v0, v1}, Lt8/r0;->C0(J)J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-object v0, p1, Lt6/g3;->b:Lv7/a0$b;

    invoke-virtual {v0}, Lv7/z;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v0, p1, Lt6/g3;->r:J

    return-wide v0

    :cond_1
    iget-object v0, p1, Lt6/g3;->a:Lt6/d4;

    iget-object v1, p1, Lt6/g3;->b:Lv7/a0$b;

    iget-wide v2, p1, Lt6/g3;->r:J

    invoke-direct {p0, v0, v1, v2, v3}, Lt6/d1;->S1(Lt6/d4;Lv7/a0$b;J)J

    move-result-wide v0

    return-wide v0
.end method

.method private h2(Lt6/g3;IIZZIJIZ)V
    .locals 16

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move/from16 v9, p6

    iget-object v10, v7, Lt6/d1;->s0:Lt6/g3;

    iput-object v8, v7, Lt6/d1;->s0:Lt6/g3;

    iget-object v0, v10, Lt6/g3;->a:Lt6/d4;

    iget-object v1, v8, Lt6/g3;->a:Lt6/d4;

    invoke-virtual {v0, v1}, Lt6/d4;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v11, 0x1

    xor-int/lit8 v12, v0, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v10

    move/from16 v3, p5

    move/from16 v4, p6

    move v5, v12

    move/from16 v6, p10

    invoke-direct/range {v0 .. v6}, Lt6/d1;->d1(Lt6/g3;Lt6/g3;ZIZZ)Landroid/util/Pair;

    move-result-object v0

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, v7, Lt6/d1;->P:Lt6/h2;

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    iget-object v4, v8, Lt6/g3;->a:Lt6/d4;

    invoke-virtual {v4}, Lt6/d4;->v()Z

    move-result v4

    if-nez v4, :cond_0

    iget-object v3, v8, Lt6/g3;->a:Lt6/d4;

    iget-object v4, v8, Lt6/g3;->b:Lv7/a0$b;

    iget-object v4, v4, Lv7/z;->a:Ljava/lang/Object;

    iget-object v5, v7, Lt6/d1;->n:Lt6/d4$b;

    invoke-virtual {v3, v4, v5}, Lt6/d4;->m(Ljava/lang/Object;Lt6/d4$b;)Lt6/d4$b;

    move-result-object v3

    iget v3, v3, Lt6/d4$b;->c:I

    iget-object v4, v8, Lt6/g3;->a:Lt6/d4;

    iget-object v5, v7, Lt6/k;->a:Lt6/d4$d;

    invoke-virtual {v4, v3, v5}, Lt6/d4;->s(ILt6/d4$d;)Lt6/d4$d;

    move-result-object v3

    iget-object v3, v3, Lt6/d4$d;->c:Lt6/c2;

    :cond_0
    sget-object v4, Lt6/h2;->T:Lt6/h2;

    iput-object v4, v7, Lt6/d1;->r0:Lt6/h2;

    :cond_1
    if-nez v1, :cond_2

    iget-object v4, v10, Lt6/g3;->j:Ljava/util/List;

    iget-object v5, v8, Lt6/g3;->j:Ljava/util/List;

    invoke-interface {v4, v5}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    iget-object v2, v7, Lt6/d1;->r0:Lt6/h2;

    invoke-virtual {v2}, Lt6/h2;->c()Lt6/h2$b;

    move-result-object v2

    iget-object v4, v8, Lt6/g3;->j:Ljava/util/List;

    invoke-virtual {v2, v4}, Lt6/h2$b;->K(Ljava/util/List;)Lt6/h2$b;

    move-result-object v2

    invoke-virtual {v2}, Lt6/h2$b;->H()Lt6/h2;

    move-result-object v2

    iput-object v2, v7, Lt6/d1;->r0:Lt6/h2;

    invoke-direct/range {p0 .. p0}, Lt6/d1;->Y0()Lt6/h2;

    move-result-object v2

    :cond_3
    iget-object v4, v7, Lt6/d1;->P:Lt6/h2;

    invoke-virtual {v2, v4}, Lt6/h2;->equals(Ljava/lang/Object;)Z

    move-result v4

    xor-int/2addr v4, v11

    iput-object v2, v7, Lt6/d1;->P:Lt6/h2;

    iget-boolean v2, v10, Lt6/g3;->l:Z

    iget-boolean v5, v8, Lt6/g3;->l:Z

    const/4 v6, 0x0

    if-eq v2, v5, :cond_4

    move v2, v11

    goto :goto_0

    :cond_4
    move v2, v6

    :goto_0
    iget v5, v10, Lt6/g3;->e:I

    iget v13, v8, Lt6/g3;->e:I

    if-eq v5, v13, :cond_5

    move v5, v11

    goto :goto_1

    :cond_5
    move v5, v6

    :goto_1
    if-nez v5, :cond_6

    if-eqz v2, :cond_7

    :cond_6
    invoke-direct/range {p0 .. p0}, Lt6/d1;->j2()V

    :cond_7
    iget-boolean v13, v10, Lt6/g3;->g:Z

    iget-boolean v14, v8, Lt6/g3;->g:Z

    if-eq v13, v14, :cond_8

    move v13, v11

    goto :goto_2

    :cond_8
    move v13, v6

    :goto_2
    if-eqz v13, :cond_9

    invoke-direct {v7, v14}, Lt6/d1;->i2(Z)V

    :cond_9
    if-eqz v12, :cond_a

    iget-object v12, v7, Lt6/d1;->l:Lt8/r;

    new-instance v14, Lt6/a1;

    move/from16 v15, p2

    invoke-direct {v14, v8, v15}, Lt6/a1;-><init>(Lt6/g3;I)V

    invoke-virtual {v12, v6, v14}, Lt8/r;->i(ILt8/r$a;)V

    :cond_a
    if-eqz p5, :cond_b

    move/from16 v6, p9

    invoke-direct {v7, v9, v10, v6}, Lt6/d1;->n1(ILt6/g3;I)Lt6/j3$e;

    move-result-object v6

    move-wide/from16 v14, p7

    invoke-direct {v7, v14, v15}, Lt6/d1;->m1(J)Lt6/j3$e;

    move-result-object v12

    iget-object v14, v7, Lt6/d1;->l:Lt8/r;

    new-instance v15, Lt6/j0;

    invoke-direct {v15, v9, v6, v12}, Lt6/j0;-><init>(ILt6/j3$e;Lt6/j3$e;)V

    const/16 v6, 0xb

    invoke-virtual {v14, v6, v15}, Lt8/r;->i(ILt8/r$a;)V

    :cond_b
    if-eqz v1, :cond_c

    iget-object v1, v7, Lt6/d1;->l:Lt8/r;

    new-instance v6, Lt6/k0;

    invoke-direct {v6, v3, v0}, Lt6/k0;-><init>(Lt6/c2;I)V

    invoke-virtual {v1, v11, v6}, Lt8/r;->i(ILt8/r$a;)V

    :cond_c
    iget-object v0, v10, Lt6/g3;->f:Lt6/x;

    iget-object v1, v8, Lt6/g3;->f:Lt6/x;

    if-eq v0, v1, :cond_d

    iget-object v0, v7, Lt6/d1;->l:Lt8/r;

    new-instance v1, Lt6/l0;

    invoke-direct {v1, v8}, Lt6/l0;-><init>(Lt6/g3;)V

    const/16 v3, 0xa

    invoke-virtual {v0, v3, v1}, Lt8/r;->i(ILt8/r$a;)V

    iget-object v0, v8, Lt6/g3;->f:Lt6/x;

    if-eqz v0, :cond_d

    iget-object v0, v7, Lt6/d1;->l:Lt8/r;

    new-instance v1, Lt6/m0;

    invoke-direct {v1, v8}, Lt6/m0;-><init>(Lt6/g3;)V

    invoke-virtual {v0, v3, v1}, Lt8/r;->i(ILt8/r$a;)V

    :cond_d
    iget-object v0, v10, Lt6/g3;->i:Lq8/b0;

    iget-object v1, v8, Lt6/g3;->i:Lq8/b0;

    if-eq v0, v1, :cond_e

    iget-object v0, v7, Lt6/d1;->h:Lq8/a0;

    iget-object v1, v1, Lq8/b0;->e:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lq8/a0;->e(Ljava/lang/Object;)V

    iget-object v0, v7, Lt6/d1;->l:Lt8/r;

    new-instance v1, Lt6/n0;

    invoke-direct {v1, v8}, Lt6/n0;-><init>(Lt6/g3;)V

    const/4 v3, 0x2

    invoke-virtual {v0, v3, v1}, Lt8/r;->i(ILt8/r$a;)V

    :cond_e
    if-eqz v4, :cond_f

    iget-object v0, v7, Lt6/d1;->P:Lt6/h2;

    iget-object v1, v7, Lt6/d1;->l:Lt8/r;

    new-instance v3, Lt6/o0;

    invoke-direct {v3, v0}, Lt6/o0;-><init>(Lt6/h2;)V

    const/16 v0, 0xe

    invoke-virtual {v1, v0, v3}, Lt8/r;->i(ILt8/r$a;)V

    :cond_f
    if-eqz v13, :cond_10

    iget-object v0, v7, Lt6/d1;->l:Lt8/r;

    new-instance v1, Lt6/p0;

    invoke-direct {v1, v8}, Lt6/p0;-><init>(Lt6/g3;)V

    const/4 v3, 0x3

    invoke-virtual {v0, v3, v1}, Lt8/r;->i(ILt8/r$a;)V

    :cond_10
    const/4 v0, -0x1

    if-nez v5, :cond_11

    if-eqz v2, :cond_12

    :cond_11
    iget-object v1, v7, Lt6/d1;->l:Lt8/r;

    new-instance v3, Lt6/r0;

    invoke-direct {v3, v8}, Lt6/r0;-><init>(Lt6/g3;)V

    invoke-virtual {v1, v0, v3}, Lt8/r;->i(ILt8/r$a;)V

    :cond_12
    if-eqz v5, :cond_13

    iget-object v1, v7, Lt6/d1;->l:Lt8/r;

    new-instance v3, Lt6/s0;

    invoke-direct {v3, v8}, Lt6/s0;-><init>(Lt6/g3;)V

    const/4 v4, 0x4

    invoke-virtual {v1, v4, v3}, Lt8/r;->i(ILt8/r$a;)V

    :cond_13
    if-eqz v2, :cond_14

    iget-object v1, v7, Lt6/d1;->l:Lt8/r;

    new-instance v2, Lt6/b1;

    move/from16 v3, p3

    invoke-direct {v2, v8, v3}, Lt6/b1;-><init>(Lt6/g3;I)V

    const/4 v3, 0x5

    invoke-virtual {v1, v3, v2}, Lt8/r;->i(ILt8/r$a;)V

    :cond_14
    iget v1, v10, Lt6/g3;->m:I

    iget v2, v8, Lt6/g3;->m:I

    if-eq v1, v2, :cond_15

    iget-object v1, v7, Lt6/d1;->l:Lt8/r;

    new-instance v2, Lt6/c1;

    invoke-direct {v2, v8}, Lt6/c1;-><init>(Lt6/g3;)V

    const/4 v3, 0x6

    invoke-virtual {v1, v3, v2}, Lt8/r;->i(ILt8/r$a;)V

    :cond_15
    invoke-static {v10}, Lt6/d1;->r1(Lt6/g3;)Z

    move-result v1

    invoke-static/range {p1 .. p1}, Lt6/d1;->r1(Lt6/g3;)Z

    move-result v2

    if-eq v1, v2, :cond_16

    iget-object v1, v7, Lt6/d1;->l:Lt8/r;

    new-instance v2, Lt6/g0;

    invoke-direct {v2, v8}, Lt6/g0;-><init>(Lt6/g3;)V

    const/4 v3, 0x7

    invoke-virtual {v1, v3, v2}, Lt8/r;->i(ILt8/r$a;)V

    :cond_16
    iget-object v1, v10, Lt6/g3;->n:Lt6/i3;

    iget-object v2, v8, Lt6/g3;->n:Lt6/i3;

    invoke-virtual {v1, v2}, Lt6/i3;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    iget-object v1, v7, Lt6/d1;->l:Lt8/r;

    new-instance v2, Lt6/h0;

    invoke-direct {v2, v8}, Lt6/h0;-><init>(Lt6/g3;)V

    const/16 v3, 0xc

    invoke-virtual {v1, v3, v2}, Lt8/r;->i(ILt8/r$a;)V

    :cond_17
    if-eqz p4, :cond_18

    iget-object v1, v7, Lt6/d1;->l:Lt8/r;

    new-instance v2, Lt6/i0;

    invoke-direct {v2}, Lt6/i0;-><init>()V

    invoke-virtual {v1, v0, v2}, Lt8/r;->i(ILt8/r$a;)V

    :cond_18
    invoke-direct/range {p0 .. p0}, Lt6/d1;->f2()V

    iget-object v0, v7, Lt6/d1;->l:Lt8/r;

    invoke-virtual {v0}, Lt8/r;->f()V

    iget-boolean v0, v10, Lt6/g3;->o:Z

    iget-boolean v1, v8, Lt6/g3;->o:Z

    if-eq v0, v1, :cond_19

    iget-object v0, v7, Lt6/d1;->m:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt6/y$a;

    iget-boolean v2, v8, Lt6/g3;->o:Z

    invoke-interface {v1, v2}, Lt6/y$a;->A(Z)V

    goto :goto_3

    :cond_19
    return-void
.end method

.method public static synthetic i0(Lv6/e;Lt6/j3$d;)V
    .locals 0

    invoke-static {p0, p1}, Lt6/d1;->x1(Lv6/e;Lt6/j3$d;)V

    return-void
.end method

.method private i1()I
    .locals 3

    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v0, v0, Lt6/g3;->a:Lt6/d4;

    invoke-virtual {v0}, Lt6/d4;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lt6/d1;->t0:I

    return v0

    :cond_0
    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v1, v0, Lt6/g3;->a:Lt6/d4;

    iget-object v0, v0, Lt6/g3;->b:Lv7/a0$b;

    iget-object v0, v0, Lv7/z;->a:Ljava/lang/Object;

    iget-object v2, p0, Lt6/d1;->n:Lt6/d4$b;

    invoke-virtual {v1, v0, v2}, Lt6/d4;->m(Ljava/lang/Object;Lt6/d4$b;)Lt6/d4$b;

    move-result-object v0

    iget v0, v0, Lt6/d4$b;->c:I

    return v0
.end method

.method private i2(Z)V
    .locals 3

    iget-object v0, p0, Lt6/d1;->m0:Lt8/g0;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    iget-boolean v2, p0, Lt6/d1;->n0:Z

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Lt8/g0;->a(I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lt6/d1;->n0:Z

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    iget-boolean p1, p0, Lt6/d1;->n0:Z

    if-eqz p1, :cond_1

    invoke-virtual {v0, v1}, Lt8/g0;->b(I)V

    iput-boolean v1, p0, Lt6/d1;->n0:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic j0(Lt6/h2;Lt6/j3$d;)V
    .locals 0

    invoke-static {p0, p1}, Lt6/d1;->H1(Lt6/h2;Lt6/j3$d;)V

    return-void
.end method

.method private j1(Lt6/d4;Lt6/d4;)Landroid/util/Pair;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt6/d4;",
            "Lt6/d4;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lt6/d1;->B()J

    move-result-wide v0

    invoke-virtual {p1}, Lt6/d4;->v()Z

    move-result v2

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v5, -0x1

    if-nez v2, :cond_3

    invoke-virtual {p2}, Lt6/d4;->v()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lt6/d1;->G()I

    move-result v9

    iget-object v7, p0, Lt6/k;->a:Lt6/d4$d;

    iget-object v8, p0, Lt6/d1;->n:Lt6/d4$b;

    invoke-static {v0, v1}, Lt8/r0;->C0(J)J

    move-result-wide v10

    move-object v6, p1

    invoke-virtual/range {v6 .. v11}, Lt6/d4;->o(Lt6/d4$d;Lt6/d4$b;IJ)Landroid/util/Pair;

    move-result-object v0

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    iget-object v10, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    invoke-virtual {p2, v10}, Lt6/d4;->g(Ljava/lang/Object;)I

    move-result v1

    if-eq v1, v5, :cond_1

    return-object v0

    :cond_1
    iget-object v6, p0, Lt6/k;->a:Lt6/d4$d;

    iget-object v7, p0, Lt6/d1;->n:Lt6/d4$b;

    iget v8, p0, Lt6/d1;->F:I

    iget-boolean v9, p0, Lt6/d1;->G:Z

    move-object v11, p1

    move-object v12, p2

    invoke-static/range {v6 .. v12}, Lt6/q1;->y0(Lt6/d4$d;Lt6/d4$b;IZLjava/lang/Object;Lt6/d4;Lt6/d4;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, Lt6/d1;->n:Lt6/d4$b;

    invoke-virtual {p2, p1, v0}, Lt6/d4;->m(Ljava/lang/Object;Lt6/d4$b;)Lt6/d4$b;

    iget-object p1, p0, Lt6/d1;->n:Lt6/d4$b;

    iget p1, p1, Lt6/d4$b;->c:I

    iget-object v0, p0, Lt6/k;->a:Lt6/d4$d;

    invoke-virtual {p2, p1, v0}, Lt6/d4;->s(ILt6/d4$d;)Lt6/d4$d;

    move-result-object v0

    invoke-virtual {v0}, Lt6/d4$d;->e()J

    move-result-wide v0

    invoke-direct {p0, p2, p1, v0, v1}, Lt6/d1;->Q1(Lt6/d4;IJ)Landroid/util/Pair;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-direct {p0, p2, v5, v3, v4}, Lt6/d1;->Q1(Lt6/d4;IJ)Landroid/util/Pair;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_0
    invoke-virtual {p1}, Lt6/d4;->v()Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {p2}, Lt6/d4;->v()Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x1

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_5

    goto :goto_2

    :cond_5
    invoke-direct {p0}, Lt6/d1;->i1()I

    move-result v5

    :goto_2
    if-eqz p1, :cond_6

    move-wide v0, v3

    :cond_6
    invoke-direct {p0, p2, v5, v0, v1}, Lt6/d1;->Q1(Lt6/d4;IJ)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method private j2()V
    .locals 5

    invoke-virtual {p0}, Lt6/d1;->F()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_3

    const/4 v3, 0x2

    if-eq v0, v3, :cond_1

    const/4 v3, 0x3

    if-eq v0, v3, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_1
    invoke-virtual {p0}, Lt6/d1;->e1()Z

    move-result v0

    iget-object v3, p0, Lt6/d1;->C:Lt6/j4;

    invoke-virtual {p0}, Lt6/d1;->u()Z

    move-result v4

    if-eqz v4, :cond_2

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    move v1, v2

    :goto_0
    invoke-virtual {v3, v1}, Lt6/j4;->b(Z)V

    iget-object v0, p0, Lt6/d1;->D:Lt6/k4;

    invoke-virtual {p0}, Lt6/d1;->u()Z

    move-result v1

    invoke-virtual {v0, v1}, Lt6/k4;->b(Z)V

    goto :goto_2

    :cond_3
    :goto_1
    iget-object v0, p0, Lt6/d1;->C:Lt6/j4;

    invoke-virtual {v0, v2}, Lt6/j4;->b(Z)V

    iget-object v0, p0, Lt6/d1;->D:Lt6/k4;

    invoke-virtual {v0, v2}, Lt6/k4;->b(Z)V

    :goto_2
    return-void
.end method

.method public static synthetic k0(Lt6/d1;Lt6/j3$d;)V
    .locals 0

    invoke-direct {p0, p1}, Lt6/d1;->A1(Lt6/j3$d;)V

    return-void
.end method

.method private static k1(ZI)I
    .locals 1

    const/4 v0, 0x1

    if-eqz p0, :cond_0

    if-eq p1, v0, :cond_0

    const/4 v0, 0x2

    :cond_0
    return v0
.end method

.method private k2()V
    .locals 4

    iget-object v0, p0, Lt6/d1;->d:Lt8/g;

    invoke-virtual {v0}, Lt8/g;->b()V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {p0}, Lt6/d1;->f1()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v0, v1, :cond_2

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lt6/d1;->f1()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "Player is accessed on the wrong thread.\nCurrent thread: \'%s\'\nExpected thread: \'%s\'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread"

    invoke-static {v1, v0}, Lt8/r0;->C(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lt6/d1;->k0:Z

    if-nez v1, :cond_1

    iget-boolean v1, p0, Lt6/d1;->l0:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    :goto_0
    const-string v3, "ExoPlayerImpl"

    invoke-static {v3, v0, v1}, Lt8/s;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-boolean v2, p0, Lt6/d1;->l0:Z

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    :goto_1
    return-void
.end method

.method public static synthetic l0(ILt6/j3$d;)V
    .locals 0

    invoke-static {p0, p1}, Lt6/d1;->y1(ILt6/j3$d;)V

    return-void
.end method

.method public static synthetic m0(Lt6/c2;ILt6/j3$d;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt6/d1;->D1(Lt6/c2;ILt6/j3$d;)V

    return-void
.end method

.method private m1(J)Lt6/j3$e;
    .locals 13

    invoke-virtual {p0}, Lt6/d1;->G()I

    move-result v2

    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v0, v0, Lt6/g3;->a:Lt6/d4;

    invoke-virtual {v0}, Lt6/d4;->v()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v1, v0, Lt6/g3;->b:Lv7/a0$b;

    iget-object v1, v1, Lv7/z;->a:Ljava/lang/Object;

    iget-object v0, v0, Lt6/g3;->a:Lt6/d4;

    iget-object v3, p0, Lt6/d1;->n:Lt6/d4$b;

    invoke-virtual {v0, v1, v3}, Lt6/d4;->m(Ljava/lang/Object;Lt6/d4$b;)Lt6/d4$b;

    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v0, v0, Lt6/g3;->a:Lt6/d4;

    invoke-virtual {v0, v1}, Lt6/d4;->g(Ljava/lang/Object;)I

    move-result v0

    iget-object v3, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v3, v3, Lt6/g3;->a:Lt6/d4;

    iget-object v4, p0, Lt6/k;->a:Lt6/d4$d;

    invoke-virtual {v3, v2, v4}, Lt6/d4;->s(ILt6/d4$d;)Lt6/d4$d;

    move-result-object v3

    iget-object v3, v3, Lt6/d4$d;->a:Ljava/lang/Object;

    iget-object v4, p0, Lt6/k;->a:Lt6/d4$d;

    iget-object v4, v4, Lt6/d4$d;->c:Lt6/c2;

    move v5, v0

    move-object v12, v4

    move-object v4, v1

    move-object v1, v3

    move-object v3, v12

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, -0x1

    move-object v3, v0

    move-object v4, v3

    move v5, v1

    move-object v1, v4

    :goto_0
    invoke-static {p1, p2}, Lt8/r0;->a1(J)J

    move-result-wide v6

    new-instance p1, Lt6/j3$e;

    iget-object p2, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object p2, p2, Lt6/g3;->b:Lv7/a0$b;

    invoke-virtual {p2}, Lv7/z;->b()Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lt6/d1;->s0:Lt6/g3;

    invoke-static {p2}, Lt6/d1;->o1(Lt6/g3;)J

    move-result-wide v8

    invoke-static {v8, v9}, Lt8/r0;->a1(J)J

    move-result-wide v8

    goto :goto_1

    :cond_1
    move-wide v8, v6

    :goto_1
    iget-object p2, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object p2, p2, Lt6/g3;->b:Lv7/a0$b;

    iget v10, p2, Lv7/z;->b:I

    iget v11, p2, Lv7/z;->c:I

    move-object v0, p1

    invoke-direct/range {v0 .. v11}, Lt6/j3$e;-><init>(Ljava/lang/Object;ILt6/c2;Ljava/lang/Object;IJJII)V

    return-object p1
.end method

.method public static synthetic n0(Lt6/g3;Lt6/j3$d;)V
    .locals 0

    invoke-static {p0, p1}, Lt6/d1;->I1(Lt6/g3;Lt6/j3$d;)V

    return-void
.end method

.method private n1(ILt6/g3;I)Lt6/j3$e;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    new-instance v2, Lt6/d4$b;

    invoke-direct {v2}, Lt6/d4$b;-><init>()V

    iget-object v3, v1, Lt6/g3;->a:Lt6/d4;

    invoke-virtual {v3}, Lt6/d4;->v()Z

    move-result v3

    const/4 v4, -0x1

    if-nez v3, :cond_0

    iget-object v3, v1, Lt6/g3;->b:Lv7/a0$b;

    iget-object v3, v3, Lv7/z;->a:Ljava/lang/Object;

    iget-object v5, v1, Lt6/g3;->a:Lt6/d4;

    invoke-virtual {v5, v3, v2}, Lt6/d4;->m(Ljava/lang/Object;Lt6/d4$b;)Lt6/d4$b;

    iget v5, v2, Lt6/d4$b;->c:I

    iget-object v6, v1, Lt6/g3;->a:Lt6/d4;

    invoke-virtual {v6, v3}, Lt6/d4;->g(Ljava/lang/Object;)I

    move-result v6

    iget-object v7, v1, Lt6/g3;->a:Lt6/d4;

    iget-object v8, v0, Lt6/k;->a:Lt6/d4$d;

    invoke-virtual {v7, v5, v8}, Lt6/d4;->s(ILt6/d4$d;)Lt6/d4$d;

    move-result-object v7

    iget-object v7, v7, Lt6/d4$d;->a:Ljava/lang/Object;

    iget-object v8, v0, Lt6/k;->a:Lt6/d4$d;

    iget-object v8, v8, Lt6/d4$d;->c:Lt6/c2;

    move-object v9, v3

    move v10, v6

    move-object v6, v7

    move v7, v5

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    move/from16 v7, p3

    move-object v6, v3

    move-object v8, v6

    move-object v9, v8

    move v10, v4

    :goto_0
    iget-object v3, v1, Lt6/g3;->b:Lv7/a0$b;

    invoke-virtual {v3}, Lv7/z;->b()Z

    move-result v3

    if-nez p1, :cond_3

    if-eqz v3, :cond_1

    iget-object v3, v1, Lt6/g3;->b:Lv7/a0$b;

    iget v4, v3, Lv7/z;->b:I

    iget v3, v3, Lv7/z;->c:I

    invoke-virtual {v2, v4, v3}, Lt6/d4$b;->f(II)J

    move-result-wide v2

    goto :goto_1

    :cond_1
    iget-object v3, v1, Lt6/g3;->b:Lv7/a0$b;

    iget v3, v3, Lv7/z;->e:I

    if-eq v3, v4, :cond_2

    iget-object v2, v0, Lt6/d1;->s0:Lt6/g3;

    invoke-static {v2}, Lt6/d1;->o1(Lt6/g3;)J

    move-result-wide v2

    goto :goto_2

    :cond_2
    iget-wide v3, v2, Lt6/d4$b;->e:J

    iget-wide v11, v2, Lt6/d4$b;->d:J

    add-long v2, v3, v11

    goto :goto_2

    :cond_3
    if-eqz v3, :cond_4

    iget-wide v2, v1, Lt6/g3;->r:J

    :goto_1
    invoke-static/range {p2 .. p2}, Lt6/d1;->o1(Lt6/g3;)J

    move-result-wide v4

    goto :goto_3

    :cond_4
    iget-wide v2, v2, Lt6/d4$b;->e:J

    iget-wide v4, v1, Lt6/g3;->r:J

    add-long/2addr v2, v4

    :goto_2
    move-wide v4, v2

    :goto_3
    new-instance v17, Lt6/j3$e;

    invoke-static {v2, v3}, Lt8/r0;->a1(J)J

    move-result-wide v11

    invoke-static {v4, v5}, Lt8/r0;->a1(J)J

    move-result-wide v13

    iget-object v1, v1, Lt6/g3;->b:Lv7/a0$b;

    iget v15, v1, Lv7/z;->b:I

    iget v1, v1, Lv7/z;->c:I

    move-object/from16 v5, v17

    move/from16 v16, v1

    invoke-direct/range {v5 .. v16}, Lt6/j3$e;-><init>(Ljava/lang/Object;ILt6/c2;Ljava/lang/Object;IJJII)V

    return-object v17
.end method

.method public static synthetic o0(Lt6/g3;ILt6/j3$d;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt6/d1;->B1(Lt6/g3;ILt6/j3$d;)V

    return-void
.end method

.method private static o1(Lt6/g3;)J
    .locals 6

    new-instance v0, Lt6/d4$d;

    invoke-direct {v0}, Lt6/d4$d;-><init>()V

    new-instance v1, Lt6/d4$b;

    invoke-direct {v1}, Lt6/d4$b;-><init>()V

    iget-object v2, p0, Lt6/g3;->a:Lt6/d4;

    iget-object v3, p0, Lt6/g3;->b:Lv7/a0$b;

    iget-object v3, v3, Lv7/z;->a:Ljava/lang/Object;

    invoke-virtual {v2, v3, v1}, Lt6/d4;->m(Ljava/lang/Object;Lt6/d4$b;)Lt6/d4$b;

    iget-wide v2, p0, Lt6/g3;->c:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    iget-object p0, p0, Lt6/g3;->a:Lt6/d4;

    iget v1, v1, Lt6/d4$b;->c:I

    invoke-virtual {p0, v1, v0}, Lt6/d4;->s(ILt6/d4$d;)Lt6/d4$d;

    move-result-object p0

    invoke-virtual {p0}, Lt6/d4$d;->f()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lt6/d4$b;->r()J

    move-result-wide v0

    iget-wide v2, p0, Lt6/g3;->c:J

    add-long/2addr v0, v2

    :goto_0
    return-wide v0
.end method

.method public static synthetic p0(Lt6/j3$d;)V
    .locals 0

    invoke-static {p0}, Lt6/d1;->w1(Lt6/j3$d;)V

    return-void
.end method

.method private p1(Lt6/q1$e;)V
    .locals 11

    iget v1, p0, Lt6/d1;->H:I

    iget v2, p1, Lt6/q1$e;->c:I

    sub-int/2addr v1, v2

    iput v1, p0, Lt6/d1;->H:I

    iget-boolean v2, p1, Lt6/q1$e;->d:Z

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    iget v2, p1, Lt6/q1$e;->e:I

    iput v2, p0, Lt6/d1;->I:I

    iput-boolean v3, p0, Lt6/d1;->J:Z

    :cond_0
    iget-boolean v2, p1, Lt6/q1$e;->f:Z

    if-eqz v2, :cond_1

    iget v2, p1, Lt6/q1$e;->g:I

    iput v2, p0, Lt6/d1;->K:I

    :cond_1
    if-nez v1, :cond_b

    iget-object v1, p1, Lt6/q1$e;->b:Lt6/g3;

    iget-object v1, v1, Lt6/g3;->a:Lt6/d4;

    iget-object v2, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v2, v2, Lt6/g3;->a:Lt6/d4;

    invoke-virtual {v2}, Lt6/d4;->v()Z

    move-result v2

    const/4 v4, 0x0

    if-nez v2, :cond_2

    invoke-virtual {v1}, Lt6/d4;->v()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    iput v2, p0, Lt6/d1;->t0:I

    const-wide/16 v5, 0x0

    iput-wide v5, p0, Lt6/d1;->v0:J

    iput v4, p0, Lt6/d1;->u0:I

    :cond_2
    invoke-virtual {v1}, Lt6/d4;->v()Z

    move-result v2

    if-nez v2, :cond_4

    move-object v2, v1

    check-cast v2, Lt6/n3;

    invoke-virtual {v2}, Lt6/n3;->J()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    iget-object v6, p0, Lt6/d1;->o:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ne v5, v6, :cond_3

    move v5, v3

    goto :goto_0

    :cond_3
    move v5, v4

    :goto_0
    invoke-static {v5}, Lt8/a;->g(Z)V

    move v5, v4

    :goto_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_4

    iget-object v6, p0, Lt6/d1;->o:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lt6/d1$e;

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lt6/d4;

    invoke-static {v6, v7}, Lt6/d1$e;->b(Lt6/d1$e;Lt6/d4;)Lt6/d4;

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    iget-boolean v2, p0, Lt6/d1;->J:Z

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v2, :cond_a

    iget-object v2, p1, Lt6/q1$e;->b:Lt6/g3;

    iget-object v2, v2, Lt6/g3;->b:Lv7/a0$b;

    iget-object v7, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v7, v7, Lt6/g3;->b:Lv7/a0$b;

    invoke-virtual {v2, v7}, Lv7/z;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, p1, Lt6/q1$e;->b:Lt6/g3;

    iget-wide v7, v2, Lt6/g3;->d:J

    iget-object v2, p0, Lt6/d1;->s0:Lt6/g3;

    iget-wide v9, v2, Lt6/g3;->r:J

    cmp-long v2, v7, v9

    if-eqz v2, :cond_5

    goto :goto_2

    :cond_5
    move v3, v4

    :cond_6
    :goto_2
    if-eqz v3, :cond_9

    invoke-virtual {v1}, Lt6/d4;->v()Z

    move-result v2

    if-nez v2, :cond_8

    iget-object v2, p1, Lt6/q1$e;->b:Lt6/g3;

    iget-object v2, v2, Lt6/g3;->b:Lv7/a0$b;

    invoke-virtual {v2}, Lv7/z;->b()Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_3

    :cond_7
    iget-object v2, p1, Lt6/q1$e;->b:Lt6/g3;

    iget-object v5, v2, Lt6/g3;->b:Lv7/a0$b;

    iget-wide v6, v2, Lt6/g3;->d:J

    invoke-direct {p0, v1, v5, v6, v7}, Lt6/d1;->S1(Lt6/d4;Lv7/a0$b;J)J

    move-result-wide v1

    goto :goto_4

    :cond_8
    :goto_3
    iget-object v1, p1, Lt6/q1$e;->b:Lt6/g3;

    iget-wide v1, v1, Lt6/g3;->d:J

    :goto_4
    move-wide v7, v1

    goto :goto_5

    :cond_9
    move-wide v7, v5

    :goto_5
    move v5, v3

    goto :goto_6

    :cond_a
    move-wide v7, v5

    move v5, v4

    :goto_6
    iput-boolean v4, p0, Lt6/d1;->J:Z

    iget-object v1, p1, Lt6/q1$e;->b:Lt6/g3;

    const/4 v2, 0x1

    iget v3, p0, Lt6/d1;->K:I

    const/4 v4, 0x0

    iget v6, p0, Lt6/d1;->I:I

    const/4 v9, -0x1

    const/4 v10, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lt6/d1;->h2(Lt6/g3;IIZZIJIZ)V

    :cond_b
    return-void
.end method

.method public static synthetic q0(Lt6/d1;Lt6/q1$e;)V
    .locals 0

    invoke-direct {p0, p1}, Lt6/d1;->u1(Lt6/q1$e;)V

    return-void
.end method

.method private q1(I)I
    .locals 9

    iget-object v0, p0, Lt6/d1;->T:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getAudioSessionId()I

    move-result v0

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lt6/d1;->T:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lt6/d1;->T:Landroid/media/AudioTrack;

    :cond_0
    iget-object v0, p0, Lt6/d1;->T:Landroid/media/AudioTrack;

    if-nez v0, :cond_1

    const/16 v3, 0xfa0

    const/4 v4, 0x4

    const/4 v5, 0x2

    const/4 v6, 0x2

    new-instance v0, Landroid/media/AudioTrack;

    const/4 v2, 0x3

    const/4 v7, 0x0

    move-object v1, v0

    move v8, p1

    invoke-direct/range {v1 .. v8}, Landroid/media/AudioTrack;-><init>(IIIIIII)V

    iput-object v0, p0, Lt6/d1;->T:Landroid/media/AudioTrack;

    :cond_1
    iget-object p1, p0, Lt6/d1;->T:Landroid/media/AudioTrack;

    invoke-virtual {p1}, Landroid/media/AudioTrack;->getAudioSessionId()I

    move-result p1

    return p1
.end method

.method public static synthetic r0(Lt6/g3;ILt6/j3$d;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt6/d1;->L1(Lt6/g3;ILt6/j3$d;)V

    return-void
.end method

.method private static r1(Lt6/g3;)Z
    .locals 2

    iget v0, p0, Lt6/g3;->e:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lt6/g3;->l:Z

    if-eqz v0, :cond_0

    iget p0, p0, Lt6/g3;->m:I

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method static synthetic s0(Lt6/d1;Lt6/u1;)Lt6/u1;
    .locals 0

    iput-object p1, p0, Lt6/d1;->S:Lt6/u1;

    return-object p1
.end method

.method private static synthetic s1(IILt6/j3$d;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt6/j3$d;->onSurfaceSizeChanged(II)V

    return-void
.end method

.method static synthetic t0(Lt6/d1;)Z
    .locals 0

    iget-boolean p0, p0, Lt6/d1;->i0:Z

    return p0
.end method

.method private synthetic t1(Lt6/j3$d;Lt8/l;)V
    .locals 2

    iget-object v0, p0, Lt6/d1;->f:Lt6/j3;

    new-instance v1, Lt6/j3$c;

    invoke-direct {v1, p2}, Lt6/j3$c;-><init>(Lt8/l;)V

    invoke-interface {p1, v0, v1}, Lt6/j3$d;->onEvents(Lt6/j3;Lt6/j3$c;)V

    return-void
.end method

.method static synthetic u0(Lt6/d1;Z)Z
    .locals 0

    iput-boolean p1, p0, Lt6/d1;->i0:Z

    return p1
.end method

.method private synthetic u1(Lt6/q1$e;)V
    .locals 0

    invoke-direct {p0, p1}, Lt6/d1;->p1(Lt6/q1$e;)V

    return-void
.end method

.method static synthetic v0(Lt6/d1;Lg8/f;)Lg8/f;
    .locals 0

    iput-object p1, p0, Lt6/d1;->j0:Lg8/f;

    return-object p1
.end method

.method private synthetic v1(Lt6/q1$e;)V
    .locals 2

    iget-object v0, p0, Lt6/d1;->i:Lt8/o;

    new-instance v1, Lt6/t0;

    invoke-direct {v1, p0, p1}, Lt6/t0;-><init>(Lt6/d1;Lt6/q1$e;)V

    invoke-interface {v0, v1}, Lt8/o;->h(Ljava/lang/Runnable;)Z

    return-void
.end method

.method static synthetic w0(Lt6/d1;)Lt6/h2;
    .locals 0

    iget-object p0, p0, Lt6/d1;->r0:Lt6/h2;

    return-object p0
.end method

.method private static synthetic w1(Lt6/j3$d;)V
    .locals 2

    new-instance v0, Lt6/s1;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lt6/s1;-><init>(I)V

    const/16 v1, 0x3eb

    invoke-static {v0, v1}, Lt6/x;->j(Ljava/lang/RuntimeException;I)Lt6/x;

    move-result-object v0

    invoke-interface {p0, v0}, Lt6/j3$d;->onPlayerError(Lt6/f3;)V

    return-void
.end method

.method static synthetic x0(Lt6/d1;Lt6/h2;)Lt6/h2;
    .locals 0

    iput-object p1, p0, Lt6/d1;->r0:Lt6/h2;

    return-object p1
.end method

.method private static synthetic x1(Lv6/e;Lt6/j3$d;)V
    .locals 0

    invoke-interface {p1, p0}, Lt6/j3$d;->onAudioAttributesChanged(Lv6/e;)V

    return-void
.end method

.method static synthetic y0(Lt6/d1;)Lt6/h2;
    .locals 0

    invoke-direct {p0}, Lt6/d1;->Y0()Lt6/h2;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic y1(ILt6/j3$d;)V
    .locals 0

    invoke-interface {p1, p0}, Lt6/j3$d;->onRepeatModeChanged(I)V

    return-void
.end method

.method static synthetic z0(Lt6/d1;)Lt6/h2;
    .locals 0

    iget-object p0, p0, Lt6/d1;->P:Lt6/h2;

    return-object p0
.end method

.method private static synthetic z1(FLt6/j3$d;)V
    .locals 0

    invoke-interface {p1, p0}, Lt6/j3$d;->onVolumeChanged(F)V

    return-void
.end method


# virtual methods
.method public B()J
    .locals 5

    invoke-direct {p0}, Lt6/d1;->k2()V

    invoke-virtual {p0}, Lt6/d1;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v1, v0, Lt6/g3;->a:Lt6/d4;

    iget-object v0, v0, Lt6/g3;->b:Lv7/a0$b;

    iget-object v0, v0, Lv7/z;->a:Ljava/lang/Object;

    iget-object v2, p0, Lt6/d1;->n:Lt6/d4$b;

    invoke-virtual {v1, v0, v2}, Lt6/d4;->m(Ljava/lang/Object;Lt6/d4$b;)Lt6/d4$b;

    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget-wide v1, v0, Lt6/g3;->c:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    iget-object v0, v0, Lt6/g3;->a:Lt6/d4;

    invoke-virtual {p0}, Lt6/d1;->G()I

    move-result v1

    iget-object v2, p0, Lt6/k;->a:Lt6/d4$d;

    invoke-virtual {v0, v1, v2}, Lt6/d4;->s(ILt6/d4$d;)Lt6/d4$d;

    move-result-object v0

    invoke-virtual {v0}, Lt6/d4$d;->e()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lt6/d1;->n:Lt6/d4$b;

    invoke-virtual {v0}, Lt6/d4$b;->q()J

    move-result-wide v0

    iget-object v2, p0, Lt6/d1;->s0:Lt6/g3;

    iget-wide v2, v2, Lt6/g3;->c:J

    invoke-static {v2, v3}, Lt8/r0;->a1(J)J

    move-result-wide v2

    add-long/2addr v0, v2

    :goto_0
    return-wide v0

    :cond_1
    invoke-virtual {p0}, Lt6/d1;->e()J

    move-result-wide v0

    return-wide v0
.end method

.method public C(ILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lt6/c2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lt6/d1;->k2()V

    invoke-direct {p0, p2}, Lt6/d1;->b1(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lt6/d1;->X0(ILjava/util/List;)V

    return-void
.end method

.method public D()J
    .locals 2

    invoke-direct {p0}, Lt6/d1;->k2()V

    invoke-virtual {p0}, Lt6/d1;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v1, v0, Lt6/g3;->k:Lv7/a0$b;

    iget-object v0, v0, Lt6/g3;->b:Lv7/a0$b;

    invoke-virtual {v1, v0}, Lv7/z;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget-wide v0, v0, Lt6/g3;->p:J

    invoke-static {v0, v1}, Lt8/r0;->a1(J)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lt6/d1;->getDuration()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_1
    invoke-virtual {p0}, Lt6/d1;->g1()J

    move-result-wide v0

    return-wide v0
.end method

.method public F()I
    .locals 1

    invoke-direct {p0}, Lt6/d1;->k2()V

    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget v0, v0, Lt6/g3;->e:I

    return v0
.end method

.method public G()I
    .locals 2

    invoke-direct {p0}, Lt6/d1;->k2()V

    invoke-direct {p0}, Lt6/d1;->i1()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return v0
.end method

.method public H(I)V
    .locals 2

    invoke-direct {p0}, Lt6/d1;->k2()V

    iget v0, p0, Lt6/d1;->F:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lt6/d1;->F:I

    iget-object v0, p0, Lt6/d1;->k:Lt6/q1;

    invoke-virtual {v0, p1}, Lt6/q1;->U0(I)V

    iget-object v0, p0, Lt6/d1;->l:Lt8/r;

    new-instance v1, Lt6/z0;

    invoke-direct {v1, p1}, Lt6/z0;-><init>(I)V

    const/16 p1, 0x8

    invoke-virtual {v0, p1, v1}, Lt8/r;->i(ILt8/r$a;)V

    invoke-direct {p0}, Lt6/d1;->f2()V

    iget-object p1, p0, Lt6/d1;->l:Lt8/r;

    invoke-virtual {p1}, Lt8/r;->f()V

    :cond_0
    return-void
.end method

.method public I(Lv7/a0;)V
    .locals 0

    invoke-direct {p0}, Lt6/d1;->k2()V

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lt6/d1;->Y1(Ljava/util/List;)V

    return-void
.end method

.method public J()I
    .locals 1

    invoke-direct {p0}, Lt6/d1;->k2()V

    iget v0, p0, Lt6/d1;->F:I

    return v0
.end method

.method public K()Z
    .locals 1

    invoke-direct {p0}, Lt6/d1;->k2()V

    iget-boolean v0, p0, Lt6/d1;->G:Z

    return v0
.end method

.method public L(Lv6/e;Z)V
    .locals 3

    invoke-direct {p0}, Lt6/d1;->k2()V

    iget-boolean v0, p0, Lt6/d1;->o0:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lt6/d1;->g0:Lv6/e;

    invoke-static {v0, p1}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p1, p0, Lt6/d1;->g0:Lv6/e;

    const/4 v0, 0x1

    const/4 v1, 0x3

    invoke-direct {p0, v0, v1, p1}, Lt6/d1;->W1(IILjava/lang/Object;)V

    iget-object v0, p0, Lt6/d1;->B:Lt6/y3;

    iget v1, p1, Lv6/e;->c:I

    invoke-static {v1}, Lt8/r0;->g0(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lt6/y3;->h(I)V

    iget-object v0, p0, Lt6/d1;->l:Lt8/r;

    new-instance v1, Lt6/w0;

    invoke-direct {v1, p1}, Lt6/w0;-><init>(Lv6/e;)V

    const/16 v2, 0x14

    invoke-virtual {v0, v2, v1}, Lt8/r;->i(ILt8/r$a;)V

    :cond_1
    iget-object v0, p0, Lt6/d1;->A:Lt6/j;

    if-eqz p2, :cond_2

    move-object p2, p1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {v0, p2}, Lt6/j;->m(Lv6/e;)V

    iget-object p2, p0, Lt6/d1;->h:Lq8/a0;

    invoke-virtual {p2, p1}, Lq8/a0;->h(Lv6/e;)V

    invoke-virtual {p0}, Lt6/d1;->u()Z

    move-result p1

    iget-object p2, p0, Lt6/d1;->A:Lt6/j;

    invoke-virtual {p0}, Lt6/d1;->F()I

    move-result v0

    invoke-virtual {p2, p1, v0}, Lt6/j;->p(ZI)I

    move-result p2

    invoke-static {p1, p2}, Lt6/d1;->k1(ZI)I

    move-result v0

    invoke-direct {p0, p1, p2, v0}, Lt6/d1;->g2(ZII)V

    iget-object p1, p0, Lt6/d1;->l:Lt8/r;

    invoke-virtual {p1}, Lt8/r;->f()V

    return-void
.end method

.method public S(IJIZ)V
    .locals 12

    move-object v11, p0

    move v0, p1

    invoke-direct {p0}, Lt6/d1;->k2()V

    const/4 v1, 0x1

    if-ltz v0, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Lt8/a;->a(Z)V

    iget-object v2, v11, Lt6/d1;->r:Lu6/a;

    invoke-interface {v2}, Lu6/a;->t()V

    iget-object v2, v11, Lt6/d1;->s0:Lt6/g3;

    iget-object v2, v2, Lt6/g3;->a:Lt6/d4;

    invoke-virtual {v2}, Lt6/d4;->v()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, Lt6/d4;->u()I

    move-result v3

    if-lt v0, v3, :cond_1

    return-void

    :cond_1
    iget v3, v11, Lt6/d1;->H:I

    add-int/2addr v3, v1

    iput v3, v11, Lt6/d1;->H:I

    invoke-virtual {p0}, Lt6/d1;->g()Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v0, "ExoPlayerImpl"

    const-string v2, "seekTo ignored because an ad is playing"

    invoke-static {v0, v2}, Lt8/s;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lt6/q1$e;

    iget-object v2, v11, Lt6/d1;->s0:Lt6/g3;

    invoke-direct {v0, v2}, Lt6/q1$e;-><init>(Lt6/g3;)V

    invoke-virtual {v0, v1}, Lt6/q1$e;->b(I)V

    iget-object v1, v11, Lt6/d1;->j:Lt6/q1$f;

    invoke-interface {v1, v0}, Lt6/q1$f;->a(Lt6/q1$e;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lt6/d1;->F()I

    move-result v3

    if-ne v3, v1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v1, 0x2

    :goto_1
    invoke-virtual {p0}, Lt6/d1;->G()I

    move-result v9

    iget-object v3, v11, Lt6/d1;->s0:Lt6/g3;

    invoke-virtual {v3, v1}, Lt6/g3;->g(I)Lt6/g3;

    move-result-object v1

    move-wide v3, p2

    invoke-direct {p0, v2, p1, p2, p3}, Lt6/d1;->Q1(Lt6/d4;IJ)Landroid/util/Pair;

    move-result-object v5

    invoke-direct {p0, v1, v2, v5}, Lt6/d1;->P1(Lt6/g3;Lt6/d4;Landroid/util/Pair;)Lt6/g3;

    move-result-object v1

    iget-object v5, v11, Lt6/d1;->k:Lt6/q1;

    invoke-static {p2, p3}, Lt8/r0;->C0(J)J

    move-result-wide v3

    invoke-virtual {v5, v2, p1, v3, v4}, Lt6/q1;->A0(Lt6/d4;IJ)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x1

    invoke-direct {p0, v1}, Lt6/d1;->h1(Lt6/g3;)J

    move-result-wide v7

    move-object v0, p0

    move/from16 v10, p5

    invoke-direct/range {v0 .. v10}, Lt6/d1;->h2(Lt6/g3;IIZZIJIZ)V

    return-void
.end method

.method public U0(Lu6/b;)V
    .locals 1

    iget-object v0, p0, Lt6/d1;->r:Lu6/a;

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu6/b;

    invoke-interface {v0, p1}, Lu6/a;->E(Lu6/b;)V

    return-void
.end method

.method public V0(Lt6/y$a;)V
    .locals 1

    iget-object v0, p0, Lt6/d1;->m:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public X0(ILjava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lv7/a0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lt6/d1;->k2()V

    const/4 v1, 0x1

    if-ltz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Lt8/a;->a(Z)V

    iget-object v2, p0, Lt6/d1;->o:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {p0}, Lt6/d1;->r()Lt6/d4;

    move-result-object v2

    iget v3, p0, Lt6/d1;->H:I

    add-int/2addr v3, v1

    iput v3, p0, Lt6/d1;->H:I

    invoke-direct {p0, v0, p2}, Lt6/d1;->W0(ILjava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-direct {p0}, Lt6/d1;->a1()Lt6/d4;

    move-result-object v3

    iget-object v4, p0, Lt6/d1;->s0:Lt6/g3;

    invoke-direct {p0, v2, v3}, Lt6/d1;->j1(Lt6/d4;Lt6/d4;)Landroid/util/Pair;

    move-result-object v2

    invoke-direct {p0, v4, v3, v2}, Lt6/d1;->P1(Lt6/g3;Lt6/d4;Landroid/util/Pair;)Lt6/g3;

    move-result-object v2

    iget-object v3, p0, Lt6/d1;->k:Lt6/q1;

    iget-object v4, p0, Lt6/d1;->M:Lv7/x0;

    invoke-virtual {v3, v0, v1, v4}, Lt6/q1;->l(ILjava/util/List;Lv7/x0;)V

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x5

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v10, -0x1

    const/4 v11, 0x0

    move-object v0, p0

    move-object v1, v2

    move v2, v3

    move v3, v4

    move v4, v5

    move v5, v6

    move v6, v7

    move-wide v7, v8

    move v9, v10

    move v10, v11

    invoke-direct/range {v0 .. v10}, Lt6/d1;->h2(Lt6/g3;IIZZIJIZ)V

    return-void
.end method

.method public Y1(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lv7/a0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lt6/d1;->k2()V

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lt6/d1;->Z1(Ljava/util/List;Z)V

    return-void
.end method

.method public Z1(Ljava/util/List;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lv7/a0;",
            ">;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Lt6/d1;->k2()V

    const/4 v2, -0x1

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lt6/d1;->a2(Ljava/util/List;IJZ)V

    return-void
.end method

.method public a()V
    .locals 15

    invoke-direct {p0}, Lt6/d1;->k2()V

    invoke-virtual {p0}, Lt6/d1;->u()Z

    move-result v0

    iget-object v1, p0, Lt6/d1;->A:Lt6/j;

    const/4 v2, 0x2

    invoke-virtual {v1, v0, v2}, Lt6/j;->p(ZI)I

    move-result v1

    invoke-static {v0, v1}, Lt6/d1;->k1(ZI)I

    move-result v3

    invoke-direct {p0, v0, v1, v3}, Lt6/d1;->g2(ZII)V

    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget v1, v0, Lt6/g3;->e:I

    const/4 v3, 0x1

    if-eq v1, v3, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lt6/g3;->e(Lt6/x;)Lt6/g3;

    move-result-object v0

    iget-object v1, v0, Lt6/g3;->a:Lt6/d4;

    invoke-virtual {v1}, Lt6/d4;->v()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v2, 0x4

    :cond_1
    invoke-virtual {v0, v2}, Lt6/g3;->g(I)Lt6/g3;

    move-result-object v5

    iget v0, p0, Lt6/d1;->H:I

    add-int/2addr v0, v3

    iput v0, p0, Lt6/d1;->H:I

    iget-object v0, p0, Lt6/d1;->k:Lt6/q1;

    invoke-virtual {v0}, Lt6/q1;->i0()V

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x5

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v13, -0x1

    const/4 v14, 0x0

    move-object v4, p0

    invoke-direct/range {v4 .. v14}, Lt6/d1;->h2(Lt6/g3;IIZZIJIZ)V

    return-void
.end method

.method public b(Lt6/i3;)V
    .locals 12

    invoke-direct {p0}, Lt6/d1;->k2()V

    if-nez p1, :cond_0

    sget-object p1, Lt6/i3;->d:Lt6/i3;

    :cond_0
    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v0, v0, Lt6/g3;->n:Lt6/i3;

    invoke-virtual {v0, p1}, Lt6/i3;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    invoke-virtual {v0, p1}, Lt6/g3;->f(Lt6/i3;)Lt6/g3;

    move-result-object v2

    iget v0, p0, Lt6/d1;->H:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lt6/d1;->H:I

    iget-object v0, p0, Lt6/d1;->k:Lt6/q1;

    invoke-virtual {v0, p1}, Lt6/q1;->S0(Lt6/i3;)V

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x5

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v10, -0x1

    const/4 v11, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v11}, Lt6/d1;->h2(Lt6/g3;IIZZIJIZ)V

    return-void
.end method

.method public c()Lt6/i3;
    .locals 1

    invoke-direct {p0}, Lt6/d1;->k2()V

    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v0, v0, Lt6/g3;->n:Lt6/i3;

    return-object v0
.end method

.method public d2(Z)V
    .locals 3

    invoke-direct {p0}, Lt6/d1;->k2()V

    iget-object v0, p0, Lt6/d1;->A:Lt6/j;

    invoke-virtual {p0}, Lt6/d1;->u()Z

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lt6/j;->p(ZI)I

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lt6/d1;->e2(ZLt6/x;)V

    new-instance p1, Lg8/f;

    invoke-static {}, Lcom/google/common/collect/w;->v()Lcom/google/common/collect/w;

    move-result-object v0

    iget-object v1, p0, Lt6/d1;->s0:Lt6/g3;

    iget-wide v1, v1, Lt6/g3;->r:J

    invoke-direct {p1, v0, v1, v2}, Lg8/f;-><init>(Ljava/util/List;J)V

    iput-object p1, p0, Lt6/d1;->j0:Lg8/f;

    return-void
.end method

.method public e()J
    .locals 2

    invoke-direct {p0}, Lt6/d1;->k2()V

    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    invoke-direct {p0, v0}, Lt6/d1;->h1(Lt6/g3;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lt8/r0;->a1(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public e1()Z
    .locals 1

    invoke-direct {p0}, Lt6/d1;->k2()V

    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget-boolean v0, v0, Lt6/g3;->o:Z

    return v0
.end method

.method public f(Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0}, Lt6/d1;->k2()V

    invoke-direct {p0}, Lt6/d1;->V1()V

    invoke-direct {p0, p1}, Lt6/d1;->c2(Ljava/lang/Object;)V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    invoke-direct {p0, p1, p1}, Lt6/d1;->R1(II)V

    return-void
.end method

.method public f1()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Lt6/d1;->s:Landroid/os/Looper;

    return-object v0
.end method

.method public g()Z
    .locals 1

    invoke-direct {p0}, Lt6/d1;->k2()V

    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v0, v0, Lt6/g3;->b:Lv7/a0$b;

    invoke-virtual {v0}, Lv7/z;->b()Z

    move-result v0

    return v0
.end method

.method public g1()J
    .locals 5

    invoke-direct {p0}, Lt6/d1;->k2()V

    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v0, v0, Lt6/g3;->a:Lt6/d4;

    invoke-virtual {v0}, Lt6/d4;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lt6/d1;->v0:J

    return-wide v0

    :cond_0
    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v1, v0, Lt6/g3;->k:Lv7/a0$b;

    iget-wide v1, v1, Lv7/z;->d:J

    iget-object v3, v0, Lt6/g3;->b:Lv7/a0$b;

    iget-wide v3, v3, Lv7/z;->d:J

    cmp-long v1, v1, v3

    if-eqz v1, :cond_1

    iget-object v0, v0, Lt6/g3;->a:Lt6/d4;

    invoke-virtual {p0}, Lt6/d1;->G()I

    move-result v1

    iget-object v2, p0, Lt6/k;->a:Lt6/d4$d;

    invoke-virtual {v0, v1, v2}, Lt6/d4;->s(ILt6/d4$d;)Lt6/d4$d;

    move-result-object v0

    invoke-virtual {v0}, Lt6/d4$d;->g()J

    move-result-wide v0

    return-wide v0

    :cond_1
    iget-wide v0, v0, Lt6/g3;->p:J

    iget-object v2, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v2, v2, Lt6/g3;->k:Lv7/a0$b;

    invoke-virtual {v2}, Lv7/z;->b()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v1, v0, Lt6/g3;->a:Lt6/d4;

    iget-object v0, v0, Lt6/g3;->k:Lv7/a0$b;

    iget-object v0, v0, Lv7/z;->a:Ljava/lang/Object;

    iget-object v2, p0, Lt6/d1;->n:Lt6/d4$b;

    invoke-virtual {v1, v0, v2}, Lt6/d4;->m(Ljava/lang/Object;Lt6/d4$b;)Lt6/d4$b;

    move-result-object v0

    iget-object v1, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v1, v1, Lt6/g3;->k:Lv7/a0$b;

    iget v1, v1, Lv7/z;->b:I

    invoke-virtual {v0, v1}, Lt6/d4$b;->j(I)J

    move-result-wide v1

    const-wide/high16 v3, -0x8000000000000000L

    cmp-long v3, v1, v3

    if-nez v3, :cond_2

    iget-wide v0, v0, Lt6/d4$b;->d:J

    goto :goto_0

    :cond_2
    move-wide v0, v1

    :cond_3
    :goto_0
    iget-object v2, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v3, v2, Lt6/g3;->a:Lt6/d4;

    iget-object v2, v2, Lt6/g3;->k:Lv7/a0$b;

    invoke-direct {p0, v3, v2, v0, v1}, Lt6/d1;->S1(Lt6/d4;Lv7/a0$b;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lt8/r0;->a1(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getDuration()J
    .locals 4

    invoke-direct {p0}, Lt6/d1;->k2()V

    invoke-virtual {p0}, Lt6/d1;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v1, v0, Lt6/g3;->b:Lv7/a0$b;

    iget-object v0, v0, Lt6/g3;->a:Lt6/d4;

    iget-object v2, v1, Lv7/z;->a:Ljava/lang/Object;

    iget-object v3, p0, Lt6/d1;->n:Lt6/d4$b;

    invoke-virtual {v0, v2, v3}, Lt6/d4;->m(Ljava/lang/Object;Lt6/d4$b;)Lt6/d4$b;

    iget-object v0, p0, Lt6/d1;->n:Lt6/d4$b;

    iget v2, v1, Lv7/z;->b:I

    iget v1, v1, Lv7/z;->c:I

    invoke-virtual {v0, v2, v1}, Lt6/d4$b;->f(II)J

    move-result-wide v0

    invoke-static {v0, v1}, Lt8/r0;->a1(J)J

    move-result-wide v0

    return-wide v0

    :cond_0
    invoke-virtual {p0}, Lt6/k;->O()J

    move-result-wide v0

    return-wide v0
.end method

.method public h()J
    .locals 2

    invoke-direct {p0}, Lt6/d1;->k2()V

    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget-wide v0, v0, Lt6/g3;->q:J

    invoke-static {v0, v1}, Lt8/r0;->a1(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic j()Lt6/f3;
    .locals 1

    invoke-virtual {p0}, Lt6/d1;->l1()Lt6/x;

    move-result-object v0

    return-object v0
.end method

.method public k(Z)V
    .locals 2

    invoke-direct {p0}, Lt6/d1;->k2()V

    iget-object v0, p0, Lt6/d1;->A:Lt6/j;

    invoke-virtual {p0}, Lt6/d1;->F()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lt6/j;->p(ZI)I

    move-result v0

    invoke-static {p1, v0}, Lt6/d1;->k1(ZI)I

    move-result v1

    invoke-direct {p0, p1, v0, v1}, Lt6/d1;->g2(ZII)V

    return-void
.end method

.method public l()Lt6/u1;
    .locals 1

    invoke-direct {p0}, Lt6/d1;->k2()V

    iget-object v0, p0, Lt6/d1;->R:Lt6/u1;

    return-object v0
.end method

.method public l1()Lt6/x;
    .locals 1

    invoke-direct {p0}, Lt6/d1;->k2()V

    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v0, v0, Lt6/g3;->f:Lt6/x;

    return-object v0
.end method

.method public m()Lt6/i4;
    .locals 1

    invoke-direct {p0}, Lt6/d1;->k2()V

    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v0, v0, Lt6/g3;->i:Lq8/b0;

    iget-object v0, v0, Lq8/b0;->d:Lt6/i4;

    return-object v0
.end method

.method public o()I
    .locals 1

    invoke-direct {p0}, Lt6/d1;->k2()V

    invoke-virtual {p0}, Lt6/d1;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v0, v0, Lt6/g3;->b:Lv7/a0$b;

    iget v0, v0, Lv7/z;->b:I

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public q()I
    .locals 1

    invoke-direct {p0}, Lt6/d1;->k2()V

    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget v0, v0, Lt6/g3;->m:I

    return v0
.end method

.method public r()Lt6/d4;
    .locals 1

    invoke-direct {p0}, Lt6/d1;->k2()V

    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v0, v0, Lt6/g3;->a:Lt6/d4;

    return-object v0
.end method

.method public release()V
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Release "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "ExoPlayerLib/2.18.7"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lt8/r0;->e:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lt6/r1;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ExoPlayerImpl"

    invoke-static {v1, v0}, Lt8/s;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lt6/d1;->k2()V

    sget v0, Lt8/r0;->a:I

    const/16 v1, 0x15

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lt6/d1;->T:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    iput-object v2, p0, Lt6/d1;->T:Landroid/media/AudioTrack;

    :cond_0
    iget-object v0, p0, Lt6/d1;->z:Lt6/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lt6/b;->b(Z)V

    iget-object v0, p0, Lt6/d1;->B:Lt6/y3;

    invoke-virtual {v0}, Lt6/y3;->g()V

    iget-object v0, p0, Lt6/d1;->C:Lt6/j4;

    invoke-virtual {v0, v1}, Lt6/j4;->b(Z)V

    iget-object v0, p0, Lt6/d1;->D:Lt6/k4;

    invoke-virtual {v0, v1}, Lt6/k4;->b(Z)V

    iget-object v0, p0, Lt6/d1;->A:Lt6/j;

    invoke-virtual {v0}, Lt6/j;->i()V

    iget-object v0, p0, Lt6/d1;->k:Lt6/q1;

    invoke-virtual {v0}, Lt6/q1;->k0()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lt6/d1;->l:Lt8/r;

    new-instance v3, Lt6/x0;

    invoke-direct {v3}, Lt6/x0;-><init>()V

    const/16 v4, 0xa

    invoke-virtual {v0, v4, v3}, Lt8/r;->l(ILt8/r$a;)V

    :cond_1
    iget-object v0, p0, Lt6/d1;->l:Lt8/r;

    invoke-virtual {v0}, Lt8/r;->j()V

    iget-object v0, p0, Lt6/d1;->i:Lt8/o;

    invoke-interface {v0, v2}, Lt8/o;->e(Ljava/lang/Object;)V

    iget-object v0, p0, Lt6/d1;->t:Ls8/e;

    iget-object v3, p0, Lt6/d1;->r:Lu6/a;

    invoke-interface {v0, v3}, Ls8/e;->e(Ls8/e$a;)V

    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lt6/g3;->g(I)Lt6/g3;

    move-result-object v0

    iput-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v4, v0, Lt6/g3;->b:Lv7/a0$b;

    invoke-virtual {v0, v4}, Lt6/g3;->b(Lv7/a0$b;)Lt6/g3;

    move-result-object v0

    iput-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget-wide v4, v0, Lt6/g3;->r:J

    iput-wide v4, v0, Lt6/g3;->p:J

    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    const-wide/16 v4, 0x0

    iput-wide v4, v0, Lt6/g3;->q:J

    iget-object v0, p0, Lt6/d1;->r:Lu6/a;

    invoke-interface {v0}, Lu6/a;->release()V

    iget-object v0, p0, Lt6/d1;->h:Lq8/a0;

    invoke-virtual {v0}, Lq8/a0;->f()V

    invoke-direct {p0}, Lt6/d1;->V1()V

    iget-object v0, p0, Lt6/d1;->V:Landroid/view/Surface;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    iput-object v2, p0, Lt6/d1;->V:Landroid/view/Surface;

    :cond_2
    iget-boolean v0, p0, Lt6/d1;->n0:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lt6/d1;->m0:Lt8/g0;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt8/g0;

    invoke-virtual {v0, v1}, Lt8/g0;->b(I)V

    iput-boolean v1, p0, Lt6/d1;->n0:Z

    :cond_3
    sget-object v0, Lg8/f;->c:Lg8/f;

    iput-object v0, p0, Lt6/d1;->j0:Lg8/f;

    iput-boolean v3, p0, Lt6/d1;->o0:Z

    return-void
.end method

.method public s(Lt6/j3$d;)V
    .locals 1

    iget-object v0, p0, Lt6/d1;->l:Lt8/r;

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt6/j3$d;

    invoke-virtual {v0, p1}, Lt8/r;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public setVolume(F)V
    .locals 2

    invoke-direct {p0}, Lt6/d1;->k2()V

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p1, v0, v1}, Lt8/r0;->p(FFF)F

    move-result p1

    iget v0, p0, Lt6/d1;->h0:F

    cmpl-float v0, v0, p1

    if-nez v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lt6/d1;->h0:F

    invoke-direct {p0}, Lt6/d1;->X1()V

    iget-object v0, p0, Lt6/d1;->l:Lt8/r;

    new-instance v1, Lt6/y0;

    invoke-direct {v1, p1}, Lt6/y0;-><init>(F)V

    const/16 p1, 0x16

    invoke-virtual {v0, p1, v1}, Lt8/r;->l(ILt8/r$a;)V

    return-void
.end method

.method public stop()V
    .locals 1

    invoke-direct {p0}, Lt6/d1;->k2()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lt6/d1;->d2(Z)V

    return-void
.end method

.method public t(Lt6/j3$d;)V
    .locals 1

    invoke-direct {p0}, Lt6/d1;->k2()V

    iget-object v0, p0, Lt6/d1;->l:Lt8/r;

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt6/j3$d;

    invoke-virtual {v0, p1}, Lt8/r;->k(Ljava/lang/Object;)V

    return-void
.end method

.method public u()Z
    .locals 1

    invoke-direct {p0}, Lt6/d1;->k2()V

    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget-boolean v0, v0, Lt6/g3;->l:Z

    return v0
.end method

.method public w()I
    .locals 2

    invoke-direct {p0}, Lt6/d1;->k2()V

    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v0, v0, Lt6/g3;->a:Lt6/d4;

    invoke-virtual {v0}, Lt6/d4;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lt6/d1;->u0:I

    return v0

    :cond_0
    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v1, v0, Lt6/g3;->a:Lt6/d4;

    iget-object v0, v0, Lt6/g3;->b:Lv7/a0$b;

    iget-object v0, v0, Lv7/z;->a:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Lt6/d4;->g(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public y()I
    .locals 1

    invoke-direct {p0}, Lt6/d1;->k2()V

    invoke-virtual {p0}, Lt6/d1;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lt6/d1;->s0:Lt6/g3;

    iget-object v0, v0, Lt6/g3;->b:Lv7/a0$b;

    iget v0, v0, Lv7/z;->c:I

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method
