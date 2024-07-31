.class public Lf8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu7/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf8/a$b;,
        Lf8/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lu7/a<",
        "Lf8/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:Z

.field public final e:Lf8/a$a;

.field public final f:[Lf8/a$b;

.field public final g:J

.field public final h:J


# direct methods
.method private constructor <init>(IIJJIZLf8/a$a;[Lf8/a$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lf8/a;->a:I

    iput p2, p0, Lf8/a;->b:I

    iput-wide p3, p0, Lf8/a;->g:J

    iput-wide p5, p0, Lf8/a;->h:J

    iput p7, p0, Lf8/a;->c:I

    iput-boolean p8, p0, Lf8/a;->d:Z

    iput-object p9, p0, Lf8/a;->e:Lf8/a$a;

    iput-object p10, p0, Lf8/a;->f:[Lf8/a$b;

    return-void
.end method

.method public constructor <init>(IIJJJIZLf8/a$a;[Lf8/a$b;)V
    .locals 21

    const-wide/16 v0, 0x0

    cmp-long v2, p5, v0

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v2, :cond_0

    move-wide v13, v8

    goto :goto_0

    :cond_0
    const-wide/32 v4, 0xf4240

    move-wide/from16 v2, p5

    move-wide/from16 v6, p3

    invoke-static/range {v2 .. v7}, Lt8/r0;->O0(JJJ)J

    move-result-wide v2

    move-wide v13, v2

    :goto_0
    cmp-long v0, p7, v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const-wide/32 v4, 0xf4240

    move-wide/from16 v2, p7

    move-wide/from16 v6, p3

    invoke-static/range {v2 .. v7}, Lt8/r0;->O0(JJJ)J

    move-result-wide v8

    :goto_1
    move-wide v15, v8

    move-object/from16 v10, p0

    move/from16 v11, p1

    move/from16 v12, p2

    move/from16 v17, p9

    move/from16 v18, p10

    move-object/from16 v19, p11

    move-object/from16 v20, p12

    invoke-direct/range {v10 .. v20}, Lf8/a;-><init>(IIJJIZLf8/a$a;[Lf8/a$b;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/util/List;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lf8/a;->b(Ljava/util/List;)Lf8/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/List;)Lf8/a;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lu7/c;",
            ">;)",
            "Lf8/a;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_1

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lu7/c;

    iget-object v6, p0, Lf8/a;->f:[Lf8/a$b;

    iget v7, v5, Lu7/c;->b:I

    aget-object v6, v6, v7

    if-eq v6, v2, :cond_0

    if-eqz v2, :cond_0

    new-array v7, v3, [Lt6/u1;

    invoke-interface {v1, v7}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [Lt6/u1;

    invoke-virtual {v2, v7}, Lf8/a$b;->b([Lt6/u1;)Lf8/a$b;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v1}, Ljava/util/List;->clear()V

    :cond_0
    iget-object v2, v6, Lf8/a$b;->j:[Lt6/u1;

    iget v5, v5, Lu7/c;->c:I

    aget-object v2, v2, v5

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    move-object v2, v6

    goto :goto_0

    :cond_1
    if-eqz v2, :cond_2

    new-array v0, v3, [Lt6/u1;

    invoke-interface {v1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lt6/u1;

    invoke-virtual {v2, v0}, Lf8/a$b;->b([Lt6/u1;)Lf8/a$b;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    new-array v0, v3, [Lf8/a$b;

    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    move-object v10, p1

    check-cast v10, [Lf8/a$b;

    new-instance p1, Lf8/a;

    iget v1, p0, Lf8/a;->a:I

    iget v2, p0, Lf8/a;->b:I

    iget-wide v3, p0, Lf8/a;->g:J

    iget-wide v5, p0, Lf8/a;->h:J

    iget v7, p0, Lf8/a;->c:I

    iget-boolean v8, p0, Lf8/a;->d:Z

    iget-object v9, p0, Lf8/a;->e:Lf8/a$a;

    move-object v0, p1

    invoke-direct/range {v0 .. v10}, Lf8/a;-><init>(IIJJIZLf8/a$a;[Lf8/a$b;)V

    return-object p1
.end method
