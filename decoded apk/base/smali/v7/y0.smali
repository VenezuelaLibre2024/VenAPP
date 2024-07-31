.class public final Lv7/y0;
.super Lt6/d4;
.source "SourceFile"


# static fields
.field private static final D:Ljava/lang/Object;

.field private static final E:Lt6/c2;


# instance fields
.field private final A:Ljava/lang/Object;

.field private final B:Lt6/c2;

.field private final C:Lt6/c2$g;

.field private final f:J

.field private final r:J

.field private final s:J

.field private final t:J

.field private final u:J

.field private final v:J

.field private final w:J

.field private final x:Z

.field private final y:Z

.field private final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lv7/y0;->D:Ljava/lang/Object;

    new-instance v0, Lt6/c2$c;

    invoke-direct {v0}, Lt6/c2$c;-><init>()V

    const-string v1, "SinglePeriodTimeline"

    invoke-virtual {v0, v1}, Lt6/c2$c;->d(Ljava/lang/String;)Lt6/c2$c;

    move-result-object v0

    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Lt6/c2$c;->g(Landroid/net/Uri;)Lt6/c2$c;

    move-result-object v0

    invoke-virtual {v0}, Lt6/c2$c;->a()Lt6/c2;

    move-result-object v0

    sput-object v0, Lv7/y0;->E:Lt6/c2;

    return-void
.end method

.method public constructor <init>(JJJJJJJZZZLjava/lang/Object;Lt6/c2;Lt6/c2$g;)V
    .locals 3

    move-object v0, p0

    invoke-direct {p0}, Lt6/d4;-><init>()V

    move-wide v1, p1

    iput-wide v1, v0, Lv7/y0;->f:J

    move-wide v1, p3

    iput-wide v1, v0, Lv7/y0;->r:J

    move-wide v1, p5

    iput-wide v1, v0, Lv7/y0;->s:J

    move-wide v1, p7

    iput-wide v1, v0, Lv7/y0;->t:J

    move-wide v1, p9

    iput-wide v1, v0, Lv7/y0;->u:J

    move-wide v1, p11

    iput-wide v1, v0, Lv7/y0;->v:J

    move-wide/from16 v1, p13

    iput-wide v1, v0, Lv7/y0;->w:J

    move/from16 v1, p15

    iput-boolean v1, v0, Lv7/y0;->x:Z

    move/from16 v1, p16

    iput-boolean v1, v0, Lv7/y0;->y:Z

    move/from16 v1, p17

    iput-boolean v1, v0, Lv7/y0;->z:Z

    move-object/from16 v1, p18

    iput-object v1, v0, Lv7/y0;->A:Ljava/lang/Object;

    invoke-static/range {p19 .. p19}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt6/c2;

    iput-object v1, v0, Lv7/y0;->B:Lt6/c2;

    move-object/from16 v1, p20

    iput-object v1, v0, Lv7/y0;->C:Lt6/c2$g;

    return-void
.end method

.method public constructor <init>(JJJJZZZLjava/lang/Object;Lt6/c2;)V
    .locals 21

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v17, 0x0

    move-object/from16 v15, p13

    if-eqz p11, :cond_0

    iget-object v0, v15, Lt6/c2;->d:Lt6/c2$g;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object/from16 v20, v0

    move-object/from16 v0, p0

    move-wide/from16 v7, p1

    move-wide/from16 v9, p3

    move-wide/from16 v11, p5

    move-wide/from16 v13, p7

    move/from16 v15, p9

    move/from16 v16, p10

    move-object/from16 v18, p12

    move-object/from16 v19, p13

    invoke-direct/range {v0 .. v20}, Lv7/y0;-><init>(JJJJJJJZZZLjava/lang/Object;Lt6/c2;Lt6/c2$g;)V

    return-void
.end method

.method public constructor <init>(JZZZLjava/lang/Object;Lt6/c2;)V
    .locals 14

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p1

    move/from16 v9, p3

    move/from16 v10, p4

    move/from16 v11, p5

    move-object/from16 v12, p6

    move-object/from16 v13, p7

    invoke-direct/range {v0 .. v13}, Lv7/y0;-><init>(JJJJZZZLjava/lang/Object;Lt6/c2;)V

    return-void
.end method


# virtual methods
.method public g(Ljava/lang/Object;)I
    .locals 1

    sget-object v0, Lv7/y0;->D:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public l(ILt6/d4$b;Z)Lt6/d4$b;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lt8/a;->c(III)I

    if-eqz p3, :cond_0

    sget-object p1, Lv7/y0;->D:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    move-object v2, p1

    const/4 v1, 0x0

    const/4 v3, 0x0

    iget-wide v4, p0, Lv7/y0;->t:J

    iget-wide v6, p0, Lv7/y0;->v:J

    neg-long v6, v6

    move-object v0, p2

    invoke-virtual/range {v0 .. v7}, Lt6/d4$b;->v(Ljava/lang/Object;Ljava/lang/Object;IJJ)Lt6/d4$b;

    move-result-object p1

    return-object p1
.end method

.method public n()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public r(I)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lt8/a;->c(III)I

    sget-object p1, Lv7/y0;->D:Ljava/lang/Object;

    return-object p1
.end method

.method public t(ILt6/d4$d;J)Lt6/d4$d;
    .locals 24

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x1

    move/from16 v3, p1

    invoke-static {v3, v1, v2}, Lt8/a;->c(III)I

    iget-wide v1, v0, Lv7/y0;->w:J

    iget-boolean v14, v0, Lv7/y0;->y:Z

    if-eqz v14, :cond_1

    iget-boolean v3, v0, Lv7/y0;->z:Z

    if-nez v3, :cond_1

    const-wide/16 v3, 0x0

    cmp-long v3, p3, v3

    if-eqz v3, :cond_1

    iget-wide v3, v0, Lv7/y0;->u:J

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v7, v3, v5

    if-nez v7, :cond_0

    :goto_0
    move-wide/from16 v16, v5

    goto :goto_1

    :cond_0
    add-long v1, v1, p3

    cmp-long v3, v1, v3

    if-lez v3, :cond_1

    goto :goto_0

    :cond_1
    move-wide/from16 v16, v1

    :goto_1
    sget-object v4, Lt6/d4$d;->C:Ljava/lang/Object;

    iget-object v5, v0, Lv7/y0;->B:Lt6/c2;

    iget-object v6, v0, Lv7/y0;->A:Ljava/lang/Object;

    iget-wide v7, v0, Lv7/y0;->f:J

    iget-wide v9, v0, Lv7/y0;->r:J

    iget-wide v11, v0, Lv7/y0;->s:J

    iget-boolean v13, v0, Lv7/y0;->x:Z

    iget-object v15, v0, Lv7/y0;->C:Lt6/c2$g;

    iget-wide v1, v0, Lv7/y0;->u:J

    move-wide/from16 v18, v1

    const/16 v20, 0x0

    const/16 v21, 0x0

    iget-wide v1, v0, Lv7/y0;->v:J

    move-wide/from16 v22, v1

    move-object/from16 v3, p2

    invoke-virtual/range {v3 .. v23}, Lt6/d4$d;->j(Ljava/lang/Object;Lt6/c2;Ljava/lang/Object;JJJZZLt6/c2$g;JJIIJ)Lt6/d4$d;

    move-result-object v1

    return-object v1
.end method

.method public u()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
