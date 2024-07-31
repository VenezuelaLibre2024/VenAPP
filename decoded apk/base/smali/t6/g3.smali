.class final Lt6/g3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final s:Lv7/a0$b;


# instance fields
.field public final a:Lt6/d4;

.field public final b:Lv7/a0$b;

.field public final c:J

.field public final d:J

.field public final e:I

.field public final f:Lt6/x;

.field public final g:Z

.field public final h:Lv7/f1;

.field public final i:Lq8/b0;

.field public final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ll7/a;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Lv7/a0$b;

.field public final l:Z

.field public final m:I

.field public final n:Lt6/i3;

.field public final o:Z

.field public volatile p:J

.field public volatile q:J

.field public volatile r:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv7/a0$b;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-direct {v0, v1}, Lv7/a0$b;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lt6/g3;->s:Lv7/a0$b;

    return-void
.end method

.method public constructor <init>(Lt6/d4;Lv7/a0$b;JJILt6/x;ZLv7/f1;Lq8/b0;Ljava/util/List;Lv7/a0$b;ZILt6/i3;JJJZ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt6/d4;",
            "Lv7/a0$b;",
            "JJI",
            "Lt6/x;",
            "Z",
            "Lv7/f1;",
            "Lq8/b0;",
            "Ljava/util/List<",
            "Ll7/a;",
            ">;",
            "Lv7/a0$b;",
            "ZI",
            "Lt6/i3;",
            "JJJZ)V"
        }
    .end annotation

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Lt6/g3;->a:Lt6/d4;

    move-object v1, p2

    iput-object v1, v0, Lt6/g3;->b:Lv7/a0$b;

    move-wide v1, p3

    iput-wide v1, v0, Lt6/g3;->c:J

    move-wide v1, p5

    iput-wide v1, v0, Lt6/g3;->d:J

    move v1, p7

    iput v1, v0, Lt6/g3;->e:I

    move-object v1, p8

    iput-object v1, v0, Lt6/g3;->f:Lt6/x;

    move v1, p9

    iput-boolean v1, v0, Lt6/g3;->g:Z

    move-object v1, p10

    iput-object v1, v0, Lt6/g3;->h:Lv7/f1;

    move-object v1, p11

    iput-object v1, v0, Lt6/g3;->i:Lq8/b0;

    move-object v1, p12

    iput-object v1, v0, Lt6/g3;->j:Ljava/util/List;

    move-object/from16 v1, p13

    iput-object v1, v0, Lt6/g3;->k:Lv7/a0$b;

    move/from16 v1, p14

    iput-boolean v1, v0, Lt6/g3;->l:Z

    move/from16 v1, p15

    iput v1, v0, Lt6/g3;->m:I

    move-object/from16 v1, p16

    iput-object v1, v0, Lt6/g3;->n:Lt6/i3;

    move-wide/from16 v1, p17

    iput-wide v1, v0, Lt6/g3;->p:J

    move-wide/from16 v1, p19

    iput-wide v1, v0, Lt6/g3;->q:J

    move-wide/from16 v1, p21

    iput-wide v1, v0, Lt6/g3;->r:J

    move/from16 v1, p23

    iput-boolean v1, v0, Lt6/g3;->o:Z

    return-void
.end method

.method public static j(Lq8/b0;)Lt6/g3;
    .locals 25

    move-object/from16 v11, p0

    new-instance v24, Lt6/g3;

    move-object/from16 v0, v24

    sget-object v1, Lt6/d4;->a:Lt6/d4;

    sget-object v13, Lt6/g3;->s:Lv7/a0$b;

    move-object v2, v13

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v5, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    sget-object v10, Lv7/f1;->d:Lv7/f1;

    invoke-static {}, Lcom/google/common/collect/w;->v()Lcom/google/common/collect/w;

    move-result-object v12

    const/4 v14, 0x0

    const/4 v15, 0x0

    sget-object v16, Lt6/i3;->d:Lt6/i3;

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v0 .. v23}, Lt6/g3;-><init>(Lt6/d4;Lv7/a0$b;JJILt6/x;ZLv7/f1;Lq8/b0;Ljava/util/List;Lv7/a0$b;ZILt6/i3;JJJZ)V

    return-object v24
.end method

.method public static k()Lv7/a0$b;
    .locals 1

    sget-object v0, Lt6/g3;->s:Lv7/a0$b;

    return-object v0
.end method


# virtual methods
.method public a(Z)Lt6/g3;
    .locals 27

    move-object/from16 v0, p0

    move/from16 v10, p1

    new-instance v25, Lt6/g3;

    move-object/from16 v1, v25

    iget-object v2, v0, Lt6/g3;->a:Lt6/d4;

    iget-object v3, v0, Lt6/g3;->b:Lv7/a0$b;

    iget-wide v4, v0, Lt6/g3;->c:J

    iget-wide v6, v0, Lt6/g3;->d:J

    iget v8, v0, Lt6/g3;->e:I

    iget-object v9, v0, Lt6/g3;->f:Lt6/x;

    iget-object v11, v0, Lt6/g3;->h:Lv7/f1;

    iget-object v12, v0, Lt6/g3;->i:Lq8/b0;

    iget-object v13, v0, Lt6/g3;->j:Ljava/util/List;

    iget-object v14, v0, Lt6/g3;->k:Lv7/a0$b;

    iget-boolean v15, v0, Lt6/g3;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Lt6/g3;->m:I

    move/from16 v16, v1

    iget-object v1, v0, Lt6/g3;->n:Lt6/i3;

    move-object/from16 v17, v1

    move-object/from16 v26, v2

    iget-wide v1, v0, Lt6/g3;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lt6/g3;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lt6/g3;->r:J

    move-wide/from16 v22, v1

    iget-boolean v1, v0, Lt6/g3;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v26

    invoke-direct/range {v1 .. v24}, Lt6/g3;-><init>(Lt6/d4;Lv7/a0$b;JJILt6/x;ZLv7/f1;Lq8/b0;Ljava/util/List;Lv7/a0$b;ZILt6/i3;JJJZ)V

    return-object v25
.end method

.method public b(Lv7/a0$b;)Lt6/g3;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    new-instance v25, Lt6/g3;

    move-object/from16 v1, v25

    iget-object v2, v0, Lt6/g3;->a:Lt6/d4;

    iget-object v3, v0, Lt6/g3;->b:Lv7/a0$b;

    iget-wide v4, v0, Lt6/g3;->c:J

    iget-wide v6, v0, Lt6/g3;->d:J

    iget v8, v0, Lt6/g3;->e:I

    iget-object v9, v0, Lt6/g3;->f:Lt6/x;

    iget-boolean v10, v0, Lt6/g3;->g:Z

    iget-object v11, v0, Lt6/g3;->h:Lv7/f1;

    iget-object v12, v0, Lt6/g3;->i:Lq8/b0;

    iget-object v13, v0, Lt6/g3;->j:Ljava/util/List;

    iget-boolean v15, v0, Lt6/g3;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Lt6/g3;->m:I

    move/from16 v16, v1

    iget-object v1, v0, Lt6/g3;->n:Lt6/i3;

    move-object/from16 v17, v1

    move-object/from16 v26, v2

    iget-wide v1, v0, Lt6/g3;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lt6/g3;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lt6/g3;->r:J

    move-wide/from16 v22, v1

    iget-boolean v1, v0, Lt6/g3;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v26

    invoke-direct/range {v1 .. v24}, Lt6/g3;-><init>(Lt6/d4;Lv7/a0$b;JJILt6/x;ZLv7/f1;Lq8/b0;Ljava/util/List;Lv7/a0$b;ZILt6/i3;JJJZ)V

    return-object v25
.end method

.method public c(Lv7/a0$b;JJJJLv7/f1;Lq8/b0;Ljava/util/List;)Lt6/g3;
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv7/a0$b;",
            "JJJJ",
            "Lv7/f1;",
            "Lq8/b0;",
            "Ljava/util/List<",
            "Ll7/a;",
            ">;)",
            "Lt6/g3;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    move-wide/from16 v22, p2

    move-wide/from16 v4, p4

    move-wide/from16 v6, p6

    move-wide/from16 v20, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    new-instance v25, Lt6/g3;

    move-object/from16 v1, v25

    iget-object v2, v0, Lt6/g3;->a:Lt6/d4;

    iget v8, v0, Lt6/g3;->e:I

    iget-object v9, v0, Lt6/g3;->f:Lt6/x;

    iget-boolean v10, v0, Lt6/g3;->g:Z

    iget-object v14, v0, Lt6/g3;->k:Lv7/a0$b;

    iget-boolean v15, v0, Lt6/g3;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Lt6/g3;->m:I

    move/from16 v16, v1

    iget-object v1, v0, Lt6/g3;->n:Lt6/i3;

    move-object/from16 v17, v1

    move-object/from16 p2, v2

    iget-wide v1, v0, Lt6/g3;->p:J

    move-wide/from16 v18, v1

    iget-boolean v1, v0, Lt6/g3;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v1 .. v24}, Lt6/g3;-><init>(Lt6/d4;Lv7/a0$b;JJILt6/x;ZLv7/f1;Lq8/b0;Ljava/util/List;Lv7/a0$b;ZILt6/i3;JJJZ)V

    return-object v25
.end method

.method public d(ZI)Lt6/g3;
    .locals 26

    move-object/from16 v0, p0

    move/from16 v15, p1

    move/from16 v16, p2

    new-instance v25, Lt6/g3;

    move-object/from16 v1, v25

    iget-object v2, v0, Lt6/g3;->a:Lt6/d4;

    iget-object v3, v0, Lt6/g3;->b:Lv7/a0$b;

    iget-wide v4, v0, Lt6/g3;->c:J

    iget-wide v6, v0, Lt6/g3;->d:J

    iget v8, v0, Lt6/g3;->e:I

    iget-object v9, v0, Lt6/g3;->f:Lt6/x;

    iget-boolean v10, v0, Lt6/g3;->g:Z

    iget-object v11, v0, Lt6/g3;->h:Lv7/f1;

    iget-object v12, v0, Lt6/g3;->i:Lq8/b0;

    iget-object v13, v0, Lt6/g3;->j:Ljava/util/List;

    iget-object v14, v0, Lt6/g3;->k:Lv7/a0$b;

    move-object/from16 p1, v1

    iget-object v1, v0, Lt6/g3;->n:Lt6/i3;

    move-object/from16 v17, v1

    move-object/from16 p2, v2

    iget-wide v1, v0, Lt6/g3;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lt6/g3;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lt6/g3;->r:J

    move-wide/from16 v22, v1

    iget-boolean v1, v0, Lt6/g3;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v1 .. v24}, Lt6/g3;-><init>(Lt6/d4;Lv7/a0$b;JJILt6/x;ZLv7/f1;Lq8/b0;Ljava/util/List;Lv7/a0$b;ZILt6/i3;JJJZ)V

    return-object v25
.end method

.method public e(Lt6/x;)Lt6/g3;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v9, p1

    new-instance v25, Lt6/g3;

    move-object/from16 v1, v25

    iget-object v2, v0, Lt6/g3;->a:Lt6/d4;

    iget-object v3, v0, Lt6/g3;->b:Lv7/a0$b;

    iget-wide v4, v0, Lt6/g3;->c:J

    iget-wide v6, v0, Lt6/g3;->d:J

    iget v8, v0, Lt6/g3;->e:I

    iget-boolean v10, v0, Lt6/g3;->g:Z

    iget-object v11, v0, Lt6/g3;->h:Lv7/f1;

    iget-object v12, v0, Lt6/g3;->i:Lq8/b0;

    iget-object v13, v0, Lt6/g3;->j:Ljava/util/List;

    iget-object v14, v0, Lt6/g3;->k:Lv7/a0$b;

    iget-boolean v15, v0, Lt6/g3;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Lt6/g3;->m:I

    move/from16 v16, v1

    iget-object v1, v0, Lt6/g3;->n:Lt6/i3;

    move-object/from16 v17, v1

    move-object/from16 v26, v2

    iget-wide v1, v0, Lt6/g3;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lt6/g3;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lt6/g3;->r:J

    move-wide/from16 v22, v1

    iget-boolean v1, v0, Lt6/g3;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v26

    invoke-direct/range {v1 .. v24}, Lt6/g3;-><init>(Lt6/d4;Lv7/a0$b;JJILt6/x;ZLv7/f1;Lq8/b0;Ljava/util/List;Lv7/a0$b;ZILt6/i3;JJJZ)V

    return-object v25
.end method

.method public f(Lt6/i3;)Lt6/g3;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v17, p1

    new-instance v25, Lt6/g3;

    move-object/from16 v1, v25

    iget-object v2, v0, Lt6/g3;->a:Lt6/d4;

    iget-object v3, v0, Lt6/g3;->b:Lv7/a0$b;

    iget-wide v4, v0, Lt6/g3;->c:J

    iget-wide v6, v0, Lt6/g3;->d:J

    iget v8, v0, Lt6/g3;->e:I

    iget-object v9, v0, Lt6/g3;->f:Lt6/x;

    iget-boolean v10, v0, Lt6/g3;->g:Z

    iget-object v11, v0, Lt6/g3;->h:Lv7/f1;

    iget-object v12, v0, Lt6/g3;->i:Lq8/b0;

    iget-object v13, v0, Lt6/g3;->j:Ljava/util/List;

    iget-object v14, v0, Lt6/g3;->k:Lv7/a0$b;

    iget-boolean v15, v0, Lt6/g3;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Lt6/g3;->m:I

    move/from16 v16, v1

    move-object/from16 v26, v2

    iget-wide v1, v0, Lt6/g3;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lt6/g3;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lt6/g3;->r:J

    move-wide/from16 v22, v1

    iget-boolean v1, v0, Lt6/g3;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v26

    invoke-direct/range {v1 .. v24}, Lt6/g3;-><init>(Lt6/d4;Lv7/a0$b;JJILt6/x;ZLv7/f1;Lq8/b0;Ljava/util/List;Lv7/a0$b;ZILt6/i3;JJJZ)V

    return-object v25
.end method

.method public g(I)Lt6/g3;
    .locals 27

    move-object/from16 v0, p0

    move/from16 v8, p1

    new-instance v25, Lt6/g3;

    move-object/from16 v1, v25

    iget-object v2, v0, Lt6/g3;->a:Lt6/d4;

    iget-object v3, v0, Lt6/g3;->b:Lv7/a0$b;

    iget-wide v4, v0, Lt6/g3;->c:J

    iget-wide v6, v0, Lt6/g3;->d:J

    iget-object v9, v0, Lt6/g3;->f:Lt6/x;

    iget-boolean v10, v0, Lt6/g3;->g:Z

    iget-object v11, v0, Lt6/g3;->h:Lv7/f1;

    iget-object v12, v0, Lt6/g3;->i:Lq8/b0;

    iget-object v13, v0, Lt6/g3;->j:Ljava/util/List;

    iget-object v14, v0, Lt6/g3;->k:Lv7/a0$b;

    iget-boolean v15, v0, Lt6/g3;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Lt6/g3;->m:I

    move/from16 v16, v1

    iget-object v1, v0, Lt6/g3;->n:Lt6/i3;

    move-object/from16 v17, v1

    move-object/from16 v26, v2

    iget-wide v1, v0, Lt6/g3;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lt6/g3;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lt6/g3;->r:J

    move-wide/from16 v22, v1

    iget-boolean v1, v0, Lt6/g3;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v26

    invoke-direct/range {v1 .. v24}, Lt6/g3;-><init>(Lt6/d4;Lv7/a0$b;JJILt6/x;ZLv7/f1;Lq8/b0;Ljava/util/List;Lv7/a0$b;ZILt6/i3;JJJZ)V

    return-object v25
.end method

.method public h(Z)Lt6/g3;
    .locals 27

    move-object/from16 v0, p0

    move/from16 v24, p1

    new-instance v25, Lt6/g3;

    move-object/from16 v1, v25

    iget-object v2, v0, Lt6/g3;->a:Lt6/d4;

    iget-object v3, v0, Lt6/g3;->b:Lv7/a0$b;

    iget-wide v4, v0, Lt6/g3;->c:J

    iget-wide v6, v0, Lt6/g3;->d:J

    iget v8, v0, Lt6/g3;->e:I

    iget-object v9, v0, Lt6/g3;->f:Lt6/x;

    iget-boolean v10, v0, Lt6/g3;->g:Z

    iget-object v11, v0, Lt6/g3;->h:Lv7/f1;

    iget-object v12, v0, Lt6/g3;->i:Lq8/b0;

    iget-object v13, v0, Lt6/g3;->j:Ljava/util/List;

    iget-object v14, v0, Lt6/g3;->k:Lv7/a0$b;

    iget-boolean v15, v0, Lt6/g3;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Lt6/g3;->m:I

    move/from16 v16, v1

    iget-object v1, v0, Lt6/g3;->n:Lt6/i3;

    move-object/from16 v17, v1

    move-object/from16 v26, v2

    iget-wide v1, v0, Lt6/g3;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lt6/g3;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lt6/g3;->r:J

    move-wide/from16 v22, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v26

    invoke-direct/range {v1 .. v24}, Lt6/g3;-><init>(Lt6/d4;Lv7/a0$b;JJILt6/x;ZLv7/f1;Lq8/b0;Ljava/util/List;Lv7/a0$b;ZILt6/i3;JJJZ)V

    return-object v25
.end method

.method public i(Lt6/d4;)Lt6/g3;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    new-instance v25, Lt6/g3;

    move-object/from16 v1, v25

    iget-object v3, v0, Lt6/g3;->b:Lv7/a0$b;

    iget-wide v4, v0, Lt6/g3;->c:J

    iget-wide v6, v0, Lt6/g3;->d:J

    iget v8, v0, Lt6/g3;->e:I

    iget-object v9, v0, Lt6/g3;->f:Lt6/x;

    iget-boolean v10, v0, Lt6/g3;->g:Z

    iget-object v11, v0, Lt6/g3;->h:Lv7/f1;

    iget-object v12, v0, Lt6/g3;->i:Lq8/b0;

    iget-object v13, v0, Lt6/g3;->j:Ljava/util/List;

    iget-object v14, v0, Lt6/g3;->k:Lv7/a0$b;

    iget-boolean v15, v0, Lt6/g3;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Lt6/g3;->m:I

    move/from16 v16, v1

    iget-object v1, v0, Lt6/g3;->n:Lt6/i3;

    move-object/from16 v17, v1

    move-object/from16 v26, v2

    iget-wide v1, v0, Lt6/g3;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lt6/g3;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lt6/g3;->r:J

    move-wide/from16 v22, v1

    iget-boolean v1, v0, Lt6/g3;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v26

    invoke-direct/range {v1 .. v24}, Lt6/g3;-><init>(Lt6/d4;Lv7/a0$b;JJILt6/x;ZLv7/f1;Lq8/b0;Ljava/util/List;Lv7/a0$b;ZILt6/i3;JJJZ)V

    return-object v25
.end method
