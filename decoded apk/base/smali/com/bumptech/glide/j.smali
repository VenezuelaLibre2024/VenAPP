.class public Lcom/bumptech/glide/j;
.super Ly3/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TranscodeType:",
        "Ljava/lang/Object;",
        ">",
        "Ly3/a<",
        "Lcom/bumptech/glide/j<",
        "TTranscodeType;>;>;"
    }
.end annotation


# static fields
.field protected static final Z:Ly3/i;


# instance fields
.field private final L:Landroid/content/Context;

.field private final M:Lcom/bumptech/glide/k;

.field private final N:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TTranscodeType;>;"
        }
    .end annotation
.end field

.field private final O:Lcom/bumptech/glide/b;

.field private final P:Lcom/bumptech/glide/d;

.field private Q:Lcom/bumptech/glide/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/l<",
            "*-TTranscodeType;>;"
        }
    .end annotation
.end field

.field private R:Ljava/lang/Object;

.field private S:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ly3/h<",
            "TTranscodeType;>;>;"
        }
    .end annotation
.end field

.field private T:Lcom/bumptech/glide/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/j<",
            "TTranscodeType;>;"
        }
    .end annotation
.end field

.field private U:Lcom/bumptech/glide/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/j<",
            "TTranscodeType;>;"
        }
    .end annotation
.end field

.field private V:Ljava/lang/Float;

.field private W:Z

.field private X:Z

.field private Y:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly3/i;

    invoke-direct {v0}, Ly3/i;-><init>()V

    sget-object v1, Lj3/j;->c:Lj3/j;

    invoke-virtual {v0, v1}, Ly3/a;->e(Lj3/j;)Ly3/a;

    move-result-object v0

    check-cast v0, Ly3/i;

    sget-object v1, Lcom/bumptech/glide/g;->LOW:Lcom/bumptech/glide/g;

    invoke-virtual {v0, v1}, Ly3/a;->P(Lcom/bumptech/glide/g;)Ly3/a;

    move-result-object v0

    check-cast v0, Ly3/i;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ly3/a;->X(Z)Ly3/a;

    move-result-object v0

    check-cast v0, Ly3/i;

    sput-object v0, Lcom/bumptech/glide/j;->Z:Ly3/i;

    return-void
.end method

.method protected constructor <init>(Lcom/bumptech/glide/b;Lcom/bumptech/glide/k;Ljava/lang/Class;Landroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/b;",
            "Lcom/bumptech/glide/k;",
            "Ljava/lang/Class<",
            "TTranscodeType;>;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ly3/a;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/j;->W:Z

    iput-object p1, p0, Lcom/bumptech/glide/j;->O:Lcom/bumptech/glide/b;

    iput-object p2, p0, Lcom/bumptech/glide/j;->M:Lcom/bumptech/glide/k;

    iput-object p3, p0, Lcom/bumptech/glide/j;->N:Ljava/lang/Class;

    iput-object p4, p0, Lcom/bumptech/glide/j;->L:Landroid/content/Context;

    invoke-virtual {p2, p3}, Lcom/bumptech/glide/k;->p(Ljava/lang/Class;)Lcom/bumptech/glide/l;

    move-result-object p3

    iput-object p3, p0, Lcom/bumptech/glide/j;->Q:Lcom/bumptech/glide/l;

    invoke-virtual {p1}, Lcom/bumptech/glide/b;->j()Lcom/bumptech/glide/d;

    move-result-object p1

    iput-object p1, p0, Lcom/bumptech/glide/j;->P:Lcom/bumptech/glide/d;

    invoke-virtual {p2}, Lcom/bumptech/glide/k;->n()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/bumptech/glide/j;->n0(Ljava/util/List;)V

    invoke-virtual {p2}, Lcom/bumptech/glide/k;->o()Ly3/i;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/bumptech/glide/j;->g0(Ly3/a;)Lcom/bumptech/glide/j;

    return-void
.end method

.method private h0(Lcom/bumptech/glide/j;)Lcom/bumptech/glide/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/j<",
            "TTranscodeType;>;)",
            "Lcom/bumptech/glide/j<",
            "TTranscodeType;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bumptech/glide/j;->L:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    invoke-virtual {p1, v0}, Ly3/a;->Y(Landroid/content/res/Resources$Theme;)Ly3/a;

    move-result-object p1

    check-cast p1, Lcom/bumptech/glide/j;

    iget-object v0, p0, Lcom/bumptech/glide/j;->L:Landroid/content/Context;

    invoke-static {v0}, Lb4/a;->c(Landroid/content/Context;)Lh3/f;

    move-result-object v0

    invoke-virtual {p1, v0}, Ly3/a;->V(Lh3/f;)Ly3/a;

    move-result-object p1

    check-cast p1, Lcom/bumptech/glide/j;

    return-object p1
.end method

.method private i0(Lz3/d;Ly3/h;Ly3/a;Ljava/util/concurrent/Executor;)Ly3/e;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz3/d<",
            "TTranscodeType;>;",
            "Ly3/h<",
            "TTranscodeType;>;",
            "Ly3/a<",
            "*>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Ly3/e;"
        }
    .end annotation

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/bumptech/glide/j;->Q:Lcom/bumptech/glide/l;

    invoke-virtual {p3}, Ly3/a;->v()Lcom/bumptech/glide/g;

    move-result-object v6

    invoke-virtual {p3}, Ly3/a;->s()I

    move-result v7

    invoke-virtual {p3}, Ly3/a;->r()I

    move-result v8

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v9, p3

    move-object v10, p4

    invoke-direct/range {v0 .. v10}, Lcom/bumptech/glide/j;->j0(Ljava/lang/Object;Lz3/d;Ly3/h;Ly3/f;Lcom/bumptech/glide/l;Lcom/bumptech/glide/g;IILy3/a;Ljava/util/concurrent/Executor;)Ly3/e;

    move-result-object p1

    return-object p1
.end method

.method private j0(Ljava/lang/Object;Lz3/d;Ly3/h;Ly3/f;Lcom/bumptech/glide/l;Lcom/bumptech/glide/g;IILy3/a;Ljava/util/concurrent/Executor;)Ly3/e;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lz3/d<",
            "TTranscodeType;>;",
            "Ly3/h<",
            "TTranscodeType;>;",
            "Ly3/f;",
            "Lcom/bumptech/glide/l<",
            "*-TTranscodeType;>;",
            "Lcom/bumptech/glide/g;",
            "II",
            "Ly3/a<",
            "*>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Ly3/e;"
        }
    .end annotation

    move-object/from16 v11, p0

    iget-object v0, v11, Lcom/bumptech/glide/j;->U:Lcom/bumptech/glide/j;

    if-eqz v0, :cond_0

    new-instance v0, Ly3/b;

    move-object/from16 v13, p1

    move-object/from16 v1, p4

    invoke-direct {v0, v13, v1}, Ly3/b;-><init>(Ljava/lang/Object;Ly3/f;)V

    move-object v4, v0

    move-object v15, v4

    goto :goto_0

    :cond_0
    move-object/from16 v13, p1

    move-object/from16 v1, p4

    const/4 v0, 0x0

    move-object v15, v0

    move-object v4, v1

    :goto_0
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/bumptech/glide/j;->k0(Ljava/lang/Object;Lz3/d;Ly3/h;Ly3/f;Lcom/bumptech/glide/l;Lcom/bumptech/glide/g;IILy3/a;Ljava/util/concurrent/Executor;)Ly3/e;

    move-result-object v0

    if-nez v15, :cond_1

    return-object v0

    :cond_1
    iget-object v1, v11, Lcom/bumptech/glide/j;->U:Lcom/bumptech/glide/j;

    invoke-virtual {v1}, Ly3/a;->s()I

    move-result v1

    iget-object v2, v11, Lcom/bumptech/glide/j;->U:Lcom/bumptech/glide/j;

    invoke-virtual {v2}, Ly3/a;->r()I

    move-result v2

    invoke-static/range {p7 .. p8}, Lc4/l;->t(II)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, v11, Lcom/bumptech/glide/j;->U:Lcom/bumptech/glide/j;

    invoke-virtual {v3}, Ly3/a;->L()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual/range {p9 .. p9}, Ly3/a;->s()I

    move-result v1

    invoke-virtual/range {p9 .. p9}, Ly3/a;->r()I

    move-result v2

    :cond_2
    move/from16 v19, v1

    move/from16 v20, v2

    iget-object v12, v11, Lcom/bumptech/glide/j;->U:Lcom/bumptech/glide/j;

    iget-object v1, v12, Lcom/bumptech/glide/j;->Q:Lcom/bumptech/glide/l;

    invoke-virtual {v12}, Ly3/a;->v()Lcom/bumptech/glide/g;

    move-result-object v18

    iget-object v2, v11, Lcom/bumptech/glide/j;->U:Lcom/bumptech/glide/j;

    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move-object v3, v15

    move-object/from16 v15, p3

    move-object/from16 v16, v3

    move-object/from16 v17, v1

    move-object/from16 v21, v2

    move-object/from16 v22, p10

    invoke-direct/range {v12 .. v22}, Lcom/bumptech/glide/j;->j0(Ljava/lang/Object;Lz3/d;Ly3/h;Ly3/f;Lcom/bumptech/glide/l;Lcom/bumptech/glide/g;IILy3/a;Ljava/util/concurrent/Executor;)Ly3/e;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ly3/b;->o(Ly3/e;Ly3/e;)V

    return-object v3
.end method

.method private k0(Ljava/lang/Object;Lz3/d;Ly3/h;Ly3/f;Lcom/bumptech/glide/l;Lcom/bumptech/glide/g;IILy3/a;Ljava/util/concurrent/Executor;)Ly3/e;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lz3/d<",
            "TTranscodeType;>;",
            "Ly3/h<",
            "TTranscodeType;>;",
            "Ly3/f;",
            "Lcom/bumptech/glide/l<",
            "*-TTranscodeType;>;",
            "Lcom/bumptech/glide/g;",
            "II",
            "Ly3/a<",
            "*>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Ly3/e;"
        }
    .end annotation

    move-object/from16 v11, p0

    move-object/from16 v12, p1

    move-object/from16 v5, p4

    move-object/from16 v13, p6

    iget-object v0, v11, Lcom/bumptech/glide/j;->T:Lcom/bumptech/glide/j;

    if-eqz v0, :cond_4

    iget-boolean v1, v11, Lcom/bumptech/glide/j;->Y:Z

    if-nez v1, :cond_3

    iget-object v1, v0, Lcom/bumptech/glide/j;->Q:Lcom/bumptech/glide/l;

    iget-boolean v2, v0, Lcom/bumptech/glide/j;->W:Z

    if-eqz v2, :cond_0

    move-object/from16 v14, p5

    goto :goto_0

    :cond_0
    move-object v14, v1

    :goto_0
    invoke-virtual {v0}, Ly3/a;->G()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v11, Lcom/bumptech/glide/j;->T:Lcom/bumptech/glide/j;

    invoke-virtual {v0}, Ly3/a;->v()Lcom/bumptech/glide/g;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-direct {v11, v13}, Lcom/bumptech/glide/j;->m0(Lcom/bumptech/glide/g;)Lcom/bumptech/glide/g;

    move-result-object v0

    :goto_1
    move-object v15, v0

    iget-object v0, v11, Lcom/bumptech/glide/j;->T:Lcom/bumptech/glide/j;

    invoke-virtual {v0}, Ly3/a;->s()I

    move-result v0

    iget-object v1, v11, Lcom/bumptech/glide/j;->T:Lcom/bumptech/glide/j;

    invoke-virtual {v1}, Ly3/a;->r()I

    move-result v1

    invoke-static/range {p7 .. p8}, Lc4/l;->t(II)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, v11, Lcom/bumptech/glide/j;->T:Lcom/bumptech/glide/j;

    invoke-virtual {v2}, Ly3/a;->L()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual/range {p9 .. p9}, Ly3/a;->s()I

    move-result v0

    invoke-virtual/range {p9 .. p9}, Ly3/a;->r()I

    move-result v1

    :cond_2
    move/from16 v16, v0

    move/from16 v17, v1

    new-instance v10, Ly3/l;

    invoke-direct {v10, v12, v5}, Ly3/l;-><init>(Ljava/lang/Object;Ly3/f;)V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p9

    move-object v5, v10

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object v13, v10

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/bumptech/glide/j;->x0(Ljava/lang/Object;Lz3/d;Ly3/h;Ly3/a;Ly3/f;Lcom/bumptech/glide/l;Lcom/bumptech/glide/g;IILjava/util/concurrent/Executor;)Ly3/e;

    move-result-object v10

    const/4 v0, 0x1

    iput-boolean v0, v11, Lcom/bumptech/glide/j;->Y:Z

    iget-object v9, v11, Lcom/bumptech/glide/j;->T:Lcom/bumptech/glide/j;

    move-object v0, v9

    move-object v4, v13

    move-object v5, v14

    move-object v6, v15

    move/from16 v7, v16

    move/from16 v8, v17

    move-object v12, v10

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/bumptech/glide/j;->j0(Ljava/lang/Object;Lz3/d;Ly3/h;Ly3/f;Lcom/bumptech/glide/l;Lcom/bumptech/glide/g;IILy3/a;Ljava/util/concurrent/Executor;)Ly3/e;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v11, Lcom/bumptech/glide/j;->Y:Z

    invoke-virtual {v13, v12, v0}, Ly3/l;->n(Ly3/e;Ly3/e;)V

    return-object v13

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    iget-object v0, v11, Lcom/bumptech/glide/j;->V:Ljava/lang/Float;

    if-eqz v0, :cond_5

    new-instance v14, Ly3/l;

    invoke-direct {v14, v12, v5}, Ly3/l;-><init>(Ljava/lang/Object;Ly3/f;)V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p9

    move-object v5, v14

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/bumptech/glide/j;->x0(Ljava/lang/Object;Lz3/d;Ly3/h;Ly3/a;Ly3/f;Lcom/bumptech/glide/l;Lcom/bumptech/glide/g;IILjava/util/concurrent/Executor;)Ly3/e;

    move-result-object v15

    invoke-virtual/range {p9 .. p9}, Ly3/a;->c()Ly3/a;

    move-result-object v0

    iget-object v1, v11, Lcom/bumptech/glide/j;->V:Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v0, v1}, Ly3/a;->W(F)Ly3/a;

    move-result-object v4

    invoke-direct {v11, v13}, Lcom/bumptech/glide/j;->m0(Lcom/bumptech/glide/g;)Lcom/bumptech/glide/g;

    move-result-object v7

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct/range {v0 .. v10}, Lcom/bumptech/glide/j;->x0(Ljava/lang/Object;Lz3/d;Ly3/h;Ly3/a;Ly3/f;Lcom/bumptech/glide/l;Lcom/bumptech/glide/g;IILjava/util/concurrent/Executor;)Ly3/e;

    move-result-object v0

    invoke-virtual {v14, v15, v0}, Ly3/l;->n(Ly3/e;Ly3/e;)V

    return-object v14

    :cond_5
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p9

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/bumptech/glide/j;->x0(Ljava/lang/Object;Lz3/d;Ly3/h;Ly3/a;Ly3/f;Lcom/bumptech/glide/l;Lcom/bumptech/glide/g;IILjava/util/concurrent/Executor;)Ly3/e;

    move-result-object v0

    return-object v0
.end method

.method private m0(Lcom/bumptech/glide/g;)Lcom/bumptech/glide/g;
    .locals 2

    sget-object v0, Lcom/bumptech/glide/j$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unknown priority: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ly3/a;->v()Lcom/bumptech/glide/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    sget-object p1, Lcom/bumptech/glide/g;->IMMEDIATE:Lcom/bumptech/glide/g;

    return-object p1

    :cond_2
    sget-object p1, Lcom/bumptech/glide/g;->HIGH:Lcom/bumptech/glide/g;

    return-object p1

    :cond_3
    sget-object p1, Lcom/bumptech/glide/g;->NORMAL:Lcom/bumptech/glide/g;

    return-object p1
.end method

.method private n0(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ly3/h<",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/h;

    invoke-virtual {p0, v0}, Lcom/bumptech/glide/j;->f0(Ly3/h;)Lcom/bumptech/glide/j;

    goto :goto_0

    :cond_0
    return-void
.end method

.method private q0(Lz3/d;Ly3/h;Ly3/a;Ljava/util/concurrent/Executor;)Lz3/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Y::",
            "Lz3/d<",
            "TTranscodeType;>;>(TY;",
            "Ly3/h<",
            "TTranscodeType;>;",
            "Ly3/a<",
            "*>;",
            "Ljava/util/concurrent/Executor;",
            ")TY;"
        }
    .end annotation

    invoke-static {p1}, Lc4/k;->d(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, p0, Lcom/bumptech/glide/j;->X:Z

    if-eqz v0, :cond_2

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/bumptech/glide/j;->i0(Lz3/d;Ly3/h;Ly3/a;Ljava/util/concurrent/Executor;)Ly3/e;

    move-result-object p2

    invoke-interface {p1}, Lz3/d;->f()Ly3/e;

    move-result-object p4

    invoke-interface {p2, p4}, Ly3/e;->h(Ly3/e;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p3, p4}, Lcom/bumptech/glide/j;->r0(Ly3/a;Ly3/e;)Z

    move-result p3

    if-nez p3, :cond_1

    invoke-static {p4}, Lc4/k;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ly3/e;

    invoke-interface {p2}, Ly3/e;->isRunning()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {p4}, Ly3/e;->j()V

    :cond_0
    return-object p1

    :cond_1
    iget-object p3, p0, Lcom/bumptech/glide/j;->M:Lcom/bumptech/glide/k;

    invoke-virtual {p3, p1}, Lcom/bumptech/glide/k;->m(Lz3/d;)V

    invoke-interface {p1, p2}, Lz3/d;->h(Ly3/e;)V

    iget-object p3, p0, Lcom/bumptech/glide/j;->M:Lcom/bumptech/glide/k;

    invoke-virtual {p3, p1, p2}, Lcom/bumptech/glide/k;->w(Lz3/d;Ly3/e;)V

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "You must call #load() before calling #into()"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private r0(Ly3/a;Ly3/e;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly3/a<",
            "*>;",
            "Ly3/e;",
            ")Z"
        }
    .end annotation

    invoke-virtual {p1}, Ly3/a;->F()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-interface {p2}, Ly3/e;->g()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private v0(Ljava/lang/Object;)Lcom/bumptech/glide/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lcom/bumptech/glide/j<",
            "TTranscodeType;>;"
        }
    .end annotation

    invoke-virtual {p0}, Ly3/a;->E()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bumptech/glide/j;->l0()Lcom/bumptech/glide/j;

    move-result-object v0

    invoke-direct {v0, p1}, Lcom/bumptech/glide/j;->v0(Ljava/lang/Object;)Lcom/bumptech/glide/j;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object p1, p0, Lcom/bumptech/glide/j;->R:Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/bumptech/glide/j;->X:Z

    invoke-virtual {p0}, Ly3/a;->T()Ly3/a;

    move-result-object p1

    check-cast p1, Lcom/bumptech/glide/j;

    return-object p1
.end method

.method private w0(Landroid/net/Uri;Lcom/bumptech/glide/j;)Lcom/bumptech/glide/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Lcom/bumptech/glide/j<",
            "TTranscodeType;>;)",
            "Lcom/bumptech/glide/j<",
            "TTranscodeType;>;"
        }
    .end annotation

    if-eqz p1, :cond_1

    const-string v0, "android.resource"

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p2}, Lcom/bumptech/glide/j;->h0(Lcom/bumptech/glide/j;)Lcom/bumptech/glide/j;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    return-object p2
.end method

.method private x0(Ljava/lang/Object;Lz3/d;Ly3/h;Ly3/a;Ly3/f;Lcom/bumptech/glide/l;Lcom/bumptech/glide/g;IILjava/util/concurrent/Executor;)Ly3/e;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lz3/d<",
            "TTranscodeType;>;",
            "Ly3/h<",
            "TTranscodeType;>;",
            "Ly3/a<",
            "*>;",
            "Ly3/f;",
            "Lcom/bumptech/glide/l<",
            "*-TTranscodeType;>;",
            "Lcom/bumptech/glide/g;",
            "II",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Ly3/e;"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/bumptech/glide/j;->L:Landroid/content/Context;

    iget-object v2, v0, Lcom/bumptech/glide/j;->P:Lcom/bumptech/glide/d;

    iget-object v4, v0, Lcom/bumptech/glide/j;->R:Ljava/lang/Object;

    iget-object v5, v0, Lcom/bumptech/glide/j;->N:Ljava/lang/Class;

    iget-object v12, v0, Lcom/bumptech/glide/j;->S:Ljava/util/List;

    invoke-virtual {v2}, Lcom/bumptech/glide/d;->e()Lj3/k;

    move-result-object v14

    invoke-virtual/range {p6 .. p6}, Lcom/bumptech/glide/l;->b()La4/c;

    move-result-object v15

    move-object/from16 v3, p1

    move-object/from16 v6, p4

    move/from16 v7, p8

    move/from16 v8, p9

    move-object/from16 v9, p7

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    move-object/from16 v13, p5

    move-object/from16 v16, p10

    invoke-static/range {v1 .. v16}, Ly3/k;->y(Landroid/content/Context;Lcom/bumptech/glide/d;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;Ly3/a;IILcom/bumptech/glide/g;Lz3/d;Ly3/h;Ljava/util/List;Ly3/f;Lj3/k;La4/c;Ljava/util/concurrent/Executor;)Ly3/k;

    move-result-object v1

    return-object v1
.end method


# virtual methods
.method public bridge synthetic a(Ly3/a;)Ly3/a;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/bumptech/glide/j;->g0(Ly3/a;)Lcom/bumptech/glide/j;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c()Ly3/a;
    .locals 1

    invoke-virtual {p0}, Lcom/bumptech/glide/j;->l0()Lcom/bumptech/glide/j;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/bumptech/glide/j;->l0()Lcom/bumptech/glide/j;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lcom/bumptech/glide/j;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lcom/bumptech/glide/j;

    invoke-super {p0, p1}, Ly3/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/j;->N:Ljava/lang/Class;

    iget-object v2, p1, Lcom/bumptech/glide/j;->N:Ljava/lang/Class;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/j;->Q:Lcom/bumptech/glide/l;

    iget-object v2, p1, Lcom/bumptech/glide/j;->Q:Lcom/bumptech/glide/l;

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/l;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/j;->R:Ljava/lang/Object;

    iget-object v2, p1, Lcom/bumptech/glide/j;->R:Ljava/lang/Object;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/j;->S:Ljava/util/List;

    iget-object v2, p1, Lcom/bumptech/glide/j;->S:Ljava/util/List;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/j;->T:Lcom/bumptech/glide/j;

    iget-object v2, p1, Lcom/bumptech/glide/j;->T:Lcom/bumptech/glide/j;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/j;->U:Lcom/bumptech/glide/j;

    iget-object v2, p1, Lcom/bumptech/glide/j;->U:Lcom/bumptech/glide/j;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/j;->V:Ljava/lang/Float;

    iget-object v2, p1, Lcom/bumptech/glide/j;->V:Ljava/lang/Float;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/bumptech/glide/j;->W:Z

    iget-boolean v2, p1, Lcom/bumptech/glide/j;->W:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Lcom/bumptech/glide/j;->X:Z

    iget-boolean p1, p1, Lcom/bumptech/glide/j;->X:Z

    if-ne v0, p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public f0(Ly3/h;)Lcom/bumptech/glide/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly3/h<",
            "TTranscodeType;>;)",
            "Lcom/bumptech/glide/j<",
            "TTranscodeType;>;"
        }
    .end annotation

    invoke-virtual {p0}, Ly3/a;->E()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bumptech/glide/j;->l0()Lcom/bumptech/glide/j;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/j;->f0(Ly3/h;)Lcom/bumptech/glide/j;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/bumptech/glide/j;->S:Ljava/util/List;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/j;->S:Ljava/util/List;

    :cond_1
    iget-object v0, p0, Lcom/bumptech/glide/j;->S:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-virtual {p0}, Ly3/a;->T()Ly3/a;

    move-result-object p1

    check-cast p1, Lcom/bumptech/glide/j;

    return-object p1
.end method

.method public g0(Ly3/a;)Lcom/bumptech/glide/j;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly3/a<",
            "*>;)",
            "Lcom/bumptech/glide/j<",
            "TTranscodeType;>;"
        }
    .end annotation

    invoke-static {p1}, Lc4/k;->d(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-super {p0, p1}, Ly3/a;->a(Ly3/a;)Ly3/a;

    move-result-object p1

    check-cast p1, Lcom/bumptech/glide/j;

    return-object p1
.end method

.method public hashCode()I
    .locals 2

    invoke-super {p0}, Ly3/a;->hashCode()I

    move-result v0

    iget-object v1, p0, Lcom/bumptech/glide/j;->N:Ljava/lang/Class;

    invoke-static {v1, v0}, Lc4/l;->o(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lcom/bumptech/glide/j;->Q:Lcom/bumptech/glide/l;

    invoke-static {v1, v0}, Lc4/l;->o(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lcom/bumptech/glide/j;->R:Ljava/lang/Object;

    invoke-static {v1, v0}, Lc4/l;->o(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lcom/bumptech/glide/j;->S:Ljava/util/List;

    invoke-static {v1, v0}, Lc4/l;->o(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lcom/bumptech/glide/j;->T:Lcom/bumptech/glide/j;

    invoke-static {v1, v0}, Lc4/l;->o(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lcom/bumptech/glide/j;->U:Lcom/bumptech/glide/j;

    invoke-static {v1, v0}, Lc4/l;->o(Ljava/lang/Object;I)I

    move-result v0

    iget-object v1, p0, Lcom/bumptech/glide/j;->V:Ljava/lang/Float;

    invoke-static {v1, v0}, Lc4/l;->o(Ljava/lang/Object;I)I

    move-result v0

    iget-boolean v1, p0, Lcom/bumptech/glide/j;->W:Z

    invoke-static {v1, v0}, Lc4/l;->p(ZI)I

    move-result v0

    iget-boolean v1, p0, Lcom/bumptech/glide/j;->X:Z

    invoke-static {v1, v0}, Lc4/l;->p(ZI)I

    move-result v0

    return v0
.end method

.method public l0()Lcom/bumptech/glide/j;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bumptech/glide/j<",
            "TTranscodeType;>;"
        }
    .end annotation

    invoke-super {p0}, Ly3/a;->c()Ly3/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/j;

    iget-object v1, v0, Lcom/bumptech/glide/j;->Q:Lcom/bumptech/glide/l;

    invoke-virtual {v1}, Lcom/bumptech/glide/l;->a()Lcom/bumptech/glide/l;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/j;->Q:Lcom/bumptech/glide/l;

    iget-object v1, v0, Lcom/bumptech/glide/j;->S:Ljava/util/List;

    if-eqz v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, v0, Lcom/bumptech/glide/j;->S:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, v0, Lcom/bumptech/glide/j;->S:Ljava/util/List;

    :cond_0
    iget-object v1, v0, Lcom/bumptech/glide/j;->T:Lcom/bumptech/glide/j;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/bumptech/glide/j;->l0()Lcom/bumptech/glide/j;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/j;->T:Lcom/bumptech/glide/j;

    :cond_1
    iget-object v1, v0, Lcom/bumptech/glide/j;->U:Lcom/bumptech/glide/j;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/bumptech/glide/j;->l0()Lcom/bumptech/glide/j;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/j;->U:Lcom/bumptech/glide/j;

    :cond_2
    return-object v0
.end method

.method public o0(Lz3/d;)Lz3/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Y::",
            "Lz3/d<",
            "TTranscodeType;>;>(TY;)TY;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {}, Lc4/e;->b()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/bumptech/glide/j;->p0(Lz3/d;Ly3/h;Ljava/util/concurrent/Executor;)Lz3/d;

    move-result-object p1

    return-object p1
.end method

.method p0(Lz3/d;Ly3/h;Ljava/util/concurrent/Executor;)Lz3/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Y::",
            "Lz3/d<",
            "TTranscodeType;>;>(TY;",
            "Ly3/h<",
            "TTranscodeType;>;",
            "Ljava/util/concurrent/Executor;",
            ")TY;"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p0, p3}, Lcom/bumptech/glide/j;->q0(Lz3/d;Ly3/h;Ly3/a;Ljava/util/concurrent/Executor;)Lz3/d;

    move-result-object p1

    return-object p1
.end method

.method public s0(Landroid/net/Uri;)Lcom/bumptech/glide/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "Lcom/bumptech/glide/j<",
            "TTranscodeType;>;"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/bumptech/glide/j;->v0(Ljava/lang/Object;)Lcom/bumptech/glide/j;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/bumptech/glide/j;->w0(Landroid/net/Uri;Lcom/bumptech/glide/j;)Lcom/bumptech/glide/j;

    move-result-object p1

    return-object p1
.end method

.method public t0(Ljava/lang/Object;)Lcom/bumptech/glide/j;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lcom/bumptech/glide/j<",
            "TTranscodeType;>;"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/bumptech/glide/j;->v0(Ljava/lang/Object;)Lcom/bumptech/glide/j;

    move-result-object p1

    return-object p1
.end method

.method public u0(Ljava/lang/String;)Lcom/bumptech/glide/j;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/bumptech/glide/j<",
            "TTranscodeType;>;"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/bumptech/glide/j;->v0(Ljava/lang/Object;)Lcom/bumptech/glide/j;

    move-result-object p1

    return-object p1
.end method

.method public y0(II)Ly3/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ly3/d<",
            "TTranscodeType;>;"
        }
    .end annotation

    new-instance v0, Ly3/g;

    invoke-direct {v0, p1, p2}, Ly3/g;-><init>(II)V

    invoke-static {}, Lc4/e;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-virtual {p0, v0, v0, p1}, Lcom/bumptech/glide/j;->p0(Lz3/d;Ly3/h;Ljava/util/concurrent/Executor;)Lz3/d;

    move-result-object p1

    check-cast p1, Ly3/d;

    return-object p1
.end method
