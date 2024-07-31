.class public final La8/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/y;
.implements Lb8/l$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La8/k$b;
    }
.end annotation


# instance fields
.field private final A:Lu6/m3;

.field private final B:La8/p$b;

.field private C:Lv7/y$a;

.field private D:I

.field private E:Lv7/f1;

.field private F:[La8/p;

.field private G:[La8/p;

.field private H:[[I

.field private I:I

.field private J:Lv7/w0;

.field private final a:La8/h;

.field private final b:Lb8/l;

.field private final c:La8/g;

.field private final d:Ls8/m0;

.field private final e:Lx6/v;

.field private final f:Lx6/u$a;

.field private final r:Ls8/d0;

.field private final s:Lv7/h0$a;

.field private final t:Ls8/b;

.field private final u:Ljava/util/IdentityHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/IdentityHashMap<",
            "Lv7/v0;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final v:La8/s;

.field private final w:Lv7/i;

.field private final x:Z

.field private final y:I

.field private final z:Z


# direct methods
.method public constructor <init>(La8/h;Lb8/l;La8/g;Ls8/m0;Lx6/v;Lx6/u$a;Ls8/d0;Lv7/h0$a;Ls8/b;Lv7/i;ZIZLu6/m3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La8/k;->a:La8/h;

    iput-object p2, p0, La8/k;->b:Lb8/l;

    iput-object p3, p0, La8/k;->c:La8/g;

    iput-object p4, p0, La8/k;->d:Ls8/m0;

    iput-object p5, p0, La8/k;->e:Lx6/v;

    iput-object p6, p0, La8/k;->f:Lx6/u$a;

    iput-object p7, p0, La8/k;->r:Ls8/d0;

    iput-object p8, p0, La8/k;->s:Lv7/h0$a;

    iput-object p9, p0, La8/k;->t:Ls8/b;

    iput-object p10, p0, La8/k;->w:Lv7/i;

    iput-boolean p11, p0, La8/k;->x:Z

    iput p12, p0, La8/k;->y:I

    iput-boolean p13, p0, La8/k;->z:Z

    iput-object p14, p0, La8/k;->A:Lu6/m3;

    new-instance p1, La8/k$b;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, La8/k$b;-><init>(La8/k;La8/k$a;)V

    iput-object p1, p0, La8/k;->B:La8/p$b;

    const/4 p1, 0x0

    new-array p2, p1, [Lv7/w0;

    invoke-interface {p10, p2}, Lv7/i;->a([Lv7/w0;)Lv7/w0;

    move-result-object p2

    iput-object p2, p0, La8/k;->J:Lv7/w0;

    new-instance p2, Ljava/util/IdentityHashMap;

    invoke-direct {p2}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p2, p0, La8/k;->u:Ljava/util/IdentityHashMap;

    new-instance p2, La8/s;

    invoke-direct {p2}, La8/s;-><init>()V

    iput-object p2, p0, La8/k;->v:La8/s;

    new-array p2, p1, [La8/p;

    iput-object p2, p0, La8/k;->F:[La8/p;

    new-array p2, p1, [La8/p;

    iput-object p2, p0, La8/k;->G:[La8/p;

    new-array p1, p1, [[I

    iput-object p1, p0, La8/k;->H:[[I

    return-void
.end method

.method static synthetic h(La8/k;)I
    .locals 1

    iget v0, p0, La8/k;->D:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, La8/k;->D:I

    return v0
.end method

.method static synthetic i(La8/k;)[La8/p;
    .locals 0

    iget-object p0, p0, La8/k;->F:[La8/p;

    return-object p0
.end method

.method static synthetic m(La8/k;Lv7/f1;)Lv7/f1;
    .locals 0

    iput-object p1, p0, La8/k;->E:Lv7/f1;

    return-object p1
.end method

.method static synthetic n(La8/k;)Lv7/y$a;
    .locals 0

    iget-object p0, p0, La8/k;->C:Lv7/y$a;

    return-object p0
.end method

.method static synthetic p(La8/k;)Lb8/l;
    .locals 0

    iget-object p0, p0, La8/k;->b:Lb8/l;

    return-object p0
.end method

.method private q(JLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "Lb8/h$a;",
            ">;",
            "Ljava/util/List<",
            "La8/p;",
            ">;",
            "Ljava/util/List<",
            "[I>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lx6/m;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p3

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_5

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lb8/h$a;

    iget-object v7, v7, Lb8/h$a;->d:Ljava/lang/String;

    invoke-virtual {v4, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_0

    move-object/from16 v13, p0

    move-object/from16 v11, p4

    move-object/from16 v12, p5

    goto/16 :goto_3

    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    const/4 v8, 0x1

    move v9, v5

    move v10, v8

    :goto_1
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v11

    if-ge v9, v11, :cond_3

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lb8/h$a;

    iget-object v11, v11, Lb8/h$a;->d:Ljava/lang/String;

    invoke-static {v7, v11}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lb8/h$a;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v12, v11, Lb8/h$a;->a:Landroid/net/Uri;

    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v12, v11, Lb8/h$a;->b:Lt6/u1;

    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v11, v11, Lb8/h$a;->b:Lt6/u1;

    iget-object v11, v11, Lt6/u1;->t:Ljava/lang/String;

    invoke-static {v11, v8}, Lt8/r0;->K(Ljava/lang/String;I)I

    move-result v11

    if-ne v11, v8, :cond_1

    move v11, v8

    goto :goto_2

    :cond_1
    move v11, v5

    :goto_2
    and-int/2addr v10, v11

    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_3
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "audio:"

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/4 v14, 0x1

    new-array v9, v5, [Landroid/net/Uri;

    invoke-static {v9}, Lt8/r0;->k([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v9

    check-cast v9, [Landroid/net/Uri;

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v9

    move-object v15, v9

    check-cast v15, [Landroid/net/Uri;

    new-array v9, v5, [Lt6/u1;

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v16, v9

    check-cast v16, [Lt6/u1;

    const/16 v17, 0x0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v18

    move-object/from16 v12, p0

    move-object v13, v7

    move-object/from16 v19, p6

    move-wide/from16 v20, p1

    invoke-direct/range {v12 .. v21}, La8/k;->w(Ljava/lang/String;I[Landroid/net/Uri;[Lt6/u1;Lt6/u1;Ljava/util/List;Ljava/util/Map;J)La8/p;

    move-result-object v9

    invoke-static {v3}, Lhb/e;->l(Ljava/util/Collection;)[I

    move-result-object v11

    move-object/from16 v12, p5

    invoke-interface {v12, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v11, p4

    invoke-interface {v11, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v13, p0

    iget-boolean v14, v13, La8/k;->x:Z

    if-eqz v14, :cond_4

    if-eqz v10, :cond_4

    new-array v10, v5, [Lt6/u1;

    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v10

    check-cast v10, [Lt6/u1;

    new-array v8, v8, [Lv7/d1;

    new-instance v14, Lv7/d1;

    invoke-direct {v14, v7, v10}, Lv7/d1;-><init>(Ljava/lang/String;[Lt6/u1;)V

    aput-object v14, v8, v5

    new-array v7, v5, [I

    invoke-virtual {v9, v8, v5, v7}, La8/p;->c0([Lv7/d1;I[I)V

    :cond_4
    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    :cond_5
    move-object/from16 v13, p0

    return-void
.end method

.method private u(Lb8/h;JLjava/util/List;Ljava/util/List;Ljava/util/Map;)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb8/h;",
            "J",
            "Ljava/util/List<",
            "La8/p;",
            ">;",
            "Ljava/util/List<",
            "[I>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lx6/m;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p1

    iget-object v1, v0, Lb8/h;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    new-array v2, v1, [I

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    move v6, v5

    :goto_0
    iget-object v7, v0, Lb8/h;->e:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-ge v4, v7, :cond_3

    iget-object v7, v0, Lb8/h;->e:Ljava/util/List;

    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lb8/h$b;

    iget-object v7, v7, Lb8/h$b;->b:Lt6/u1;

    iget v10, v7, Lt6/u1;->C:I

    if-gtz v10, :cond_2

    iget-object v10, v7, Lt6/u1;->t:Ljava/lang/String;

    invoke-static {v10, v8}, Lt8/r0;->L(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_0

    goto :goto_1

    :cond_0
    iget-object v7, v7, Lt6/u1;->t:Ljava/lang/String;

    invoke-static {v7, v9}, Lt8/r0;->L(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_1

    aput v9, v2, v4

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_1
    const/4 v7, -0x1

    aput v7, v2, v4

    goto :goto_2

    :cond_2
    :goto_1
    aput v8, v2, v4

    add-int/lit8 v5, v5, 0x1

    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    if-lez v5, :cond_4

    move v1, v5

    move v4, v9

    move v5, v3

    goto :goto_3

    :cond_4
    if-ge v6, v1, :cond_5

    sub-int/2addr v1, v6

    move v4, v3

    move v5, v9

    goto :goto_3

    :cond_5
    move v4, v3

    move v5, v4

    :goto_3
    new-array v13, v1, [Landroid/net/Uri;

    new-array v6, v1, [Lt6/u1;

    new-array v7, v1, [I

    move v10, v3

    move v11, v10

    :goto_4
    iget-object v12, v0, Lb8/h;->e:Ljava/util/List;

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v12

    if-ge v10, v12, :cond_9

    if-eqz v4, :cond_6

    aget v12, v2, v10

    if-ne v12, v8, :cond_8

    :cond_6
    if-eqz v5, :cond_7

    aget v12, v2, v10

    if-eq v12, v9, :cond_8

    :cond_7
    iget-object v12, v0, Lb8/h;->e:Ljava/util/List;

    invoke-interface {v12, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lb8/h$b;

    iget-object v14, v12, Lb8/h$b;->a:Landroid/net/Uri;

    aput-object v14, v13, v11

    iget-object v12, v12, Lb8/h$b;->b:Lt6/u1;

    aput-object v12, v6, v11

    add-int/lit8 v12, v11, 0x1

    aput v10, v7, v11

    move v11, v12

    :cond_8
    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    :cond_9
    aget-object v2, v6, v3

    iget-object v2, v2, Lt6/u1;->t:Ljava/lang/String;

    invoke-static {v2, v8}, Lt8/r0;->K(Ljava/lang/String;I)I

    move-result v5

    invoke-static {v2, v9}, Lt8/r0;->K(Ljava/lang/String;I)I

    move-result v2

    if-eq v2, v9, :cond_a

    if-nez v2, :cond_b

    iget-object v8, v0, Lb8/h;->g:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_b

    :cond_a
    if-gt v5, v9, :cond_b

    add-int v8, v2, v5

    if-lez v8, :cond_b

    move v8, v9

    goto :goto_5

    :cond_b
    move v8, v3

    :goto_5
    if-nez v4, :cond_c

    if-lez v2, :cond_c

    move v12, v9

    goto :goto_6

    :cond_c
    move v12, v3

    :goto_6
    const-string v4, "main"

    iget-object v15, v0, Lb8/h;->j:Lt6/u1;

    iget-object v14, v0, Lb8/h;->k:Ljava/util/List;

    move-object/from16 v10, p0

    move-object v11, v4

    move-object/from16 v16, v14

    move-object v14, v6

    move-object/from16 v17, p6

    move-wide/from16 v18, p2

    invoke-direct/range {v10 .. v19}, La8/k;->w(Ljava/lang/String;I[Landroid/net/Uri;[Lt6/u1;Lt6/u1;Ljava/util/List;Ljava/util/Map;J)La8/p;

    move-result-object v10

    move-object/from16 v11, p4

    invoke-interface {v11, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v11, p5

    invoke-interface {v11, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v7, p0

    iget-boolean v11, v7, La8/k;->x:Z

    if-eqz v11, :cond_13

    if-eqz v8, :cond_13

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    if-lez v5, :cond_10

    new-array v5, v1, [Lt6/u1;

    move v11, v3

    :goto_7
    if-ge v11, v1, :cond_d

    aget-object v12, v6, v11

    invoke-static {v12}, La8/k;->z(Lt6/u1;)Lt6/u1;

    move-result-object v12

    aput-object v12, v5, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_7

    :cond_d
    new-instance v1, Lv7/d1;

    invoke-direct {v1, v4, v5}, Lv7/d1;-><init>(Ljava/lang/String;[Lt6/u1;)V

    invoke-interface {v8, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-lez v2, :cond_f

    iget-object v1, v0, Lb8/h;->j:Lt6/u1;

    if-nez v1, :cond_e

    iget-object v1, v0, Lb8/h;->g:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_f

    :cond_e
    new-instance v1, Lv7/d1;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ":audio"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v5, v9, [Lt6/u1;

    aget-object v6, v6, v3

    iget-object v11, v0, Lb8/h;->j:Lt6/u1;

    invoke-static {v6, v11, v3}, La8/k;->x(Lt6/u1;Lt6/u1;Z)Lt6/u1;

    move-result-object v6

    aput-object v6, v5, v3

    invoke-direct {v1, v2, v5}, Lv7/d1;-><init>(Ljava/lang/String;[Lt6/u1;)V

    invoke-interface {v8, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_f
    iget-object v0, v0, Lb8/h;->k:Ljava/util/List;

    if-eqz v0, :cond_12

    move v1, v3

    :goto_8
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_12

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ":cc:"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v5, Lv7/d1;

    new-array v6, v9, [Lt6/u1;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lt6/u1;

    aput-object v11, v6, v3

    invoke-direct {v5, v2, v6}, Lv7/d1;-><init>(Ljava/lang/String;[Lt6/u1;)V

    invoke-interface {v8, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :cond_10
    new-array v2, v1, [Lt6/u1;

    move v5, v3

    :goto_9
    if-ge v5, v1, :cond_11

    aget-object v11, v6, v5

    iget-object v12, v0, Lb8/h;->j:Lt6/u1;

    invoke-static {v11, v12, v9}, La8/k;->x(Lt6/u1;Lt6/u1;Z)Lt6/u1;

    move-result-object v11

    aput-object v11, v2, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_9

    :cond_11
    new-instance v0, Lv7/d1;

    invoke-direct {v0, v4, v2}, Lv7/d1;-><init>(Ljava/lang/String;[Lt6/u1;)V

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_12
    new-instance v0, Lv7/d1;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":id3"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v9, [Lt6/u1;

    new-instance v4, Lt6/u1$b;

    invoke-direct {v4}, Lt6/u1$b;-><init>()V

    const-string v5, "ID3"

    invoke-virtual {v4, v5}, Lt6/u1$b;->U(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v4

    const-string v5, "application/id3"

    invoke-virtual {v4, v5}, Lt6/u1$b;->g0(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v4

    invoke-virtual {v4}, Lt6/u1$b;->G()Lt6/u1;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-direct {v0, v1, v2}, Lv7/d1;-><init>(Ljava/lang/String;[Lt6/u1;)V

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-array v1, v3, [Lv7/d1;

    invoke-interface {v8, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lv7/d1;

    new-array v2, v9, [I

    invoke-interface {v8, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    aput v0, v2, v3

    invoke-virtual {v10, v1, v3, v2}, La8/p;->c0([Lv7/d1;I[I)V

    :cond_13
    return-void
.end method

.method private v(J)V
    .locals 20

    move-object/from16 v10, p0

    iget-object v0, v10, La8/k;->b:Lb8/l;

    invoke-interface {v0}, Lb8/l;->e()Lb8/h;

    move-result-object v0

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lb8/h;

    iget-boolean v0, v10, La8/k;->z:Z

    if-eqz v0, :cond_0

    iget-object v0, v1, Lb8/h;->m:Ljava/util/List;

    invoke-static {v0}, La8/k;->y(Ljava/util/List;)Ljava/util/Map;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    :goto_0
    move-object v11, v0

    iget-object v0, v1, Lb8/h;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v12, 0x1

    xor-int/2addr v0, v12

    iget-object v7, v1, Lb8/h;->g:Ljava/util/List;

    iget-object v13, v1, Lb8/h;->h:Ljava/util/List;

    const/4 v14, 0x0

    iput v14, v10, La8/k;->D:I

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    if-eqz v0, :cond_1

    move-object/from16 v0, p0

    move-wide/from16 v2, p1

    move-object v4, v15

    move-object v5, v8

    move-object v6, v11

    invoke-direct/range {v0 .. v6}, La8/k;->u(Lb8/h;JLjava/util/List;Ljava/util/List;Ljava/util/Map;)V

    :cond_1
    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object v3, v7

    move-object v4, v15

    move-object v5, v8

    move-object v6, v11

    invoke-direct/range {v0 .. v6}, La8/k;->q(JLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V

    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, v10, La8/k;->I:I

    move v9, v14

    :goto_1
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_2

    invoke-interface {v13, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lb8/h$a;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "subtitle:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v7, Lb8/h$a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v2, 0x3

    new-array v3, v12, [Landroid/net/Uri;

    iget-object v0, v7, Lb8/h$a;->a:Landroid/net/Uri;

    aput-object v0, v3, v14

    new-array v4, v12, [Lt6/u1;

    iget-object v0, v7, Lb8/h$a;->b:Lt6/u1;

    aput-object v0, v4, v14

    const/4 v5, 0x0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v16

    move-object/from16 v0, p0

    move-object v1, v6

    move-object/from16 v17, v6

    move-object/from16 v6, v16

    move-object/from16 v18, v7

    move-object v7, v11

    move-object/from16 v19, v8

    move/from16 v16, v9

    move-wide/from16 v8, p1

    invoke-direct/range {v0 .. v9}, La8/k;->w(Ljava/lang/String;I[Landroid/net/Uri;[Lt6/u1;Lt6/u1;Ljava/util/List;Ljava/util/Map;J)La8/p;

    move-result-object v0

    new-array v1, v12, [I

    aput v16, v1, v14

    move-object/from16 v2, v19

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-array v1, v12, [Lv7/d1;

    new-instance v3, Lv7/d1;

    new-array v4, v12, [Lt6/u1;

    move-object/from16 v5, v18

    iget-object v5, v5, Lb8/h$a;->b:Lt6/u1;

    aput-object v5, v4, v14

    move-object/from16 v5, v17

    invoke-direct {v3, v5, v4}, Lv7/d1;-><init>(Ljava/lang/String;[Lt6/u1;)V

    aput-object v3, v1, v14

    new-array v3, v14, [I

    invoke-virtual {v0, v1, v14, v3}, La8/p;->c0([Lv7/d1;I[I)V

    add-int/lit8 v9, v16, 0x1

    move-object v8, v2

    goto :goto_1

    :cond_2
    move-object v2, v8

    new-array v0, v14, [La8/p;

    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La8/p;

    iput-object v0, v10, La8/k;->F:[La8/p;

    new-array v0, v14, [[I

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[I

    iput-object v0, v10, La8/k;->H:[[I

    iget-object v0, v10, La8/k;->F:[La8/p;

    array-length v0, v0

    iput v0, v10, La8/k;->D:I

    move v0, v14

    :goto_2
    iget v1, v10, La8/k;->I:I

    if-ge v0, v1, :cond_3

    iget-object v1, v10, La8/k;->F:[La8/p;

    aget-object v1, v1, v0

    invoke-virtual {v1, v12}, La8/p;->l0(Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    iget-object v0, v10, La8/k;->F:[La8/p;

    array-length v1, v0

    :goto_3
    if-ge v14, v1, :cond_4

    aget-object v2, v0, v14

    invoke-virtual {v2}, La8/p;->A()V

    add-int/lit8 v14, v14, 0x1

    goto :goto_3

    :cond_4
    iget-object v0, v10, La8/k;->F:[La8/p;

    iput-object v0, v10, La8/k;->G:[La8/p;

    return-void
.end method

.method private w(Ljava/lang/String;I[Landroid/net/Uri;[Lt6/u1;Lt6/u1;Ljava/util/List;Ljava/util/Map;J)La8/p;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I[",
            "Landroid/net/Uri;",
            "[",
            "Lt6/u1;",
            "Lt6/u1;",
            "Ljava/util/List<",
            "Lt6/u1;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lx6/m;",
            ">;J)",
            "La8/p;"
        }
    .end annotation

    move-object/from16 v0, p0

    new-instance v11, La8/f;

    iget-object v2, v0, La8/k;->a:La8/h;

    iget-object v3, v0, La8/k;->b:Lb8/l;

    iget-object v6, v0, La8/k;->c:La8/g;

    iget-object v7, v0, La8/k;->d:Ls8/m0;

    iget-object v8, v0, La8/k;->v:La8/s;

    iget-object v10, v0, La8/k;->A:Lu6/m3;

    move-object v1, v11

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v9, p6

    invoke-direct/range {v1 .. v10}, La8/f;-><init>(La8/h;Lb8/l;[Landroid/net/Uri;[Lt6/u1;La8/g;Ls8/m0;La8/s;Ljava/util/List;Lu6/m3;)V

    new-instance v16, La8/p;

    iget-object v4, v0, La8/k;->B:La8/p$b;

    iget-object v7, v0, La8/k;->t:Ls8/b;

    iget-object v12, v0, La8/k;->e:Lx6/v;

    iget-object v13, v0, La8/k;->f:Lx6/u$a;

    iget-object v14, v0, La8/k;->r:Ls8/d0;

    iget-object v15, v0, La8/k;->s:Lv7/h0$a;

    iget v10, v0, La8/k;->y:I

    move-object/from16 v1, v16

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object v5, v11

    move-object/from16 v6, p7

    move-wide/from16 v8, p8

    move/from16 v17, v10

    move-object/from16 v10, p5

    move-object v11, v12

    move-object v12, v13

    move-object v13, v14

    move-object v14, v15

    move/from16 v15, v17

    invoke-direct/range {v1 .. v15}, La8/p;-><init>(Ljava/lang/String;ILa8/p$b;La8/f;Ljava/util/Map;Ls8/b;JLt6/u1;Lx6/v;Lx6/u$a;Ls8/d0;Lv7/h0$a;I)V

    return-object v16
.end method

.method private static x(Lt6/u1;Lt6/u1;Z)Lt6/u1;
    .locals 10

    const/4 v0, -0x1

    if-eqz p1, :cond_0

    iget-object v1, p1, Lt6/u1;->t:Ljava/lang/String;

    iget-object v2, p1, Lt6/u1;->u:Ll7/a;

    iget v3, p1, Lt6/u1;->J:I

    iget v4, p1, Lt6/u1;->d:I

    iget v5, p1, Lt6/u1;->e:I

    iget-object v6, p1, Lt6/u1;->c:Ljava/lang/String;

    iget-object p1, p1, Lt6/u1;->b:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lt6/u1;->t:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {p1, v1}, Lt8/r0;->L(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lt6/u1;->u:Ll7/a;

    if-eqz p2, :cond_1

    iget v3, p0, Lt6/u1;->J:I

    iget v4, p0, Lt6/u1;->d:I

    iget v5, p0, Lt6/u1;->e:I

    iget-object v6, p0, Lt6/u1;->c:Ljava/lang/String;

    iget-object p1, p0, Lt6/u1;->b:Ljava/lang/String;

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    const/4 v6, 0x0

    move v3, v0

    move v5, v4

    move-object p1, v6

    :goto_0
    invoke-static {v1}, Lt8/w;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz p2, :cond_2

    iget v8, p0, Lt6/u1;->f:I

    goto :goto_1

    :cond_2
    move v8, v0

    :goto_1
    if-eqz p2, :cond_3

    iget v0, p0, Lt6/u1;->r:I

    :cond_3
    new-instance p2, Lt6/u1$b;

    invoke-direct {p2}, Lt6/u1$b;-><init>()V

    iget-object v9, p0, Lt6/u1;->a:Ljava/lang/String;

    invoke-virtual {p2, v9}, Lt6/u1$b;->U(Ljava/lang/String;)Lt6/u1$b;

    move-result-object p2

    invoke-virtual {p2, p1}, Lt6/u1$b;->W(Ljava/lang/String;)Lt6/u1$b;

    move-result-object p1

    iget-object p0, p0, Lt6/u1;->v:Ljava/lang/String;

    invoke-virtual {p1, p0}, Lt6/u1$b;->M(Ljava/lang/String;)Lt6/u1$b;

    move-result-object p0

    invoke-virtual {p0, v7}, Lt6/u1$b;->g0(Ljava/lang/String;)Lt6/u1$b;

    move-result-object p0

    invoke-virtual {p0, v1}, Lt6/u1$b;->K(Ljava/lang/String;)Lt6/u1$b;

    move-result-object p0

    invoke-virtual {p0, v2}, Lt6/u1$b;->Z(Ll7/a;)Lt6/u1$b;

    move-result-object p0

    invoke-virtual {p0, v8}, Lt6/u1$b;->I(I)Lt6/u1$b;

    move-result-object p0

    invoke-virtual {p0, v0}, Lt6/u1$b;->b0(I)Lt6/u1$b;

    move-result-object p0

    invoke-virtual {p0, v3}, Lt6/u1$b;->J(I)Lt6/u1$b;

    move-result-object p0

    invoke-virtual {p0, v4}, Lt6/u1$b;->i0(I)Lt6/u1$b;

    move-result-object p0

    invoke-virtual {p0, v5}, Lt6/u1$b;->e0(I)Lt6/u1$b;

    move-result-object p0

    invoke-virtual {p0, v6}, Lt6/u1$b;->X(Ljava/lang/String;)Lt6/u1$b;

    move-result-object p0

    invoke-virtual {p0}, Lt6/u1$b;->G()Lt6/u1;

    move-result-object p0

    return-object p0
.end method

.method private static y(Ljava/util/List;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lx6/m;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lx6/m;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx6/m;

    iget-object v4, v3, Lx6/m;->c:Ljava/lang/String;

    add-int/lit8 v2, v2, 0x1

    move v5, v2

    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_1

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lx6/m;

    iget-object v7, v6, Lx6/m;->c:Ljava/lang/String;

    invoke-static {v7, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v3, v6}, Lx6/m;->f(Lx6/m;)Lx6/m;

    move-result-object v3

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method private static z(Lt6/u1;)Lt6/u1;
    .locals 4

    iget-object v0, p0, Lt6/u1;->t:Ljava/lang/String;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lt8/r0;->L(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lt8/w;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lt6/u1$b;

    invoke-direct {v2}, Lt6/u1$b;-><init>()V

    iget-object v3, p0, Lt6/u1;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lt6/u1$b;->U(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v2

    iget-object v3, p0, Lt6/u1;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lt6/u1$b;->W(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v2

    iget-object v3, p0, Lt6/u1;->v:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lt6/u1$b;->M(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v2

    invoke-virtual {v2, v1}, Lt6/u1$b;->g0(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lt6/u1$b;->K(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v0

    iget-object v1, p0, Lt6/u1;->u:Ll7/a;

    invoke-virtual {v0, v1}, Lt6/u1$b;->Z(Ll7/a;)Lt6/u1$b;

    move-result-object v0

    iget v1, p0, Lt6/u1;->f:I

    invoke-virtual {v0, v1}, Lt6/u1$b;->I(I)Lt6/u1$b;

    move-result-object v0

    iget v1, p0, Lt6/u1;->r:I

    invoke-virtual {v0, v1}, Lt6/u1$b;->b0(I)Lt6/u1$b;

    move-result-object v0

    iget v1, p0, Lt6/u1;->B:I

    invoke-virtual {v0, v1}, Lt6/u1$b;->n0(I)Lt6/u1$b;

    move-result-object v0

    iget v1, p0, Lt6/u1;->C:I

    invoke-virtual {v0, v1}, Lt6/u1$b;->S(I)Lt6/u1$b;

    move-result-object v0

    iget v1, p0, Lt6/u1;->D:F

    invoke-virtual {v0, v1}, Lt6/u1$b;->R(F)Lt6/u1$b;

    move-result-object v0

    iget v1, p0, Lt6/u1;->d:I

    invoke-virtual {v0, v1}, Lt6/u1$b;->i0(I)Lt6/u1$b;

    move-result-object v0

    iget p0, p0, Lt6/u1;->e:I

    invoke-virtual {v0, p0}, Lt6/u1$b;->e0(I)Lt6/u1$b;

    move-result-object p0

    invoke-virtual {p0}, Lt6/u1$b;->G()Lt6/u1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public A()V
    .locals 4

    iget-object v0, p0, La8/k;->b:Lb8/l;

    invoke-interface {v0, p0}, Lb8/l;->n(Lb8/l$b;)V

    iget-object v0, p0, La8/k;->F:[La8/p;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, La8/p;->e0()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, La8/k;->C:Lv7/y$a;

    return-void
.end method

.method public a(Landroid/net/Uri;Ls8/d0$c;Z)Z
    .locals 5

    iget-object v0, p0, La8/k;->F:[La8/p;

    array-length v1, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    invoke-virtual {v4, p1, p2, p3}, La8/p;->Z(Landroid/net/Uri;Ls8/d0$c;Z)Z

    move-result v4

    and-int/2addr v2, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, La8/k;->C:Lv7/y$a;

    invoke-interface {p1, p0}, Lv7/w0$a;->a(Lv7/w0;)V

    return v2
.end method

.method public b()J
    .locals 2

    iget-object v0, p0, La8/k;->J:Lv7/w0;

    invoke-interface {v0}, Lv7/w0;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public c(JLt6/u3;)J
    .locals 5

    iget-object v0, p0, La8/k;->G:[La8/p;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, La8/p;->Q()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3, p1, p2, p3}, La8/p;->c(JLt6/u3;)J

    move-result-wide p1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-wide p1
.end method

.method public d()V
    .locals 4

    iget-object v0, p0, La8/k;->F:[La8/p;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, La8/p;->a0()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, La8/k;->C:Lv7/y$a;

    invoke-interface {v0, p0}, Lv7/w0$a;->a(Lv7/w0;)V

    return-void
.end method

.method public e(J)Z
    .locals 3

    iget-object v0, p0, La8/k;->E:Lv7/f1;

    if-nez v0, :cond_1

    iget-object p1, p0, La8/k;->F:[La8/p;

    array-length p2, p1

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p2, :cond_0

    aget-object v2, p1, v1

    invoke-virtual {v2}, La8/p;->A()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v0

    :cond_1
    iget-object v0, p0, La8/k;->J:Lv7/w0;

    invoke-interface {v0, p1, p2}, Lv7/w0;->e(J)Z

    move-result p1

    return p1
.end method

.method public f()J
    .locals 2

    iget-object v0, p0, La8/k;->J:Lv7/w0;

    invoke-interface {v0}, Lv7/w0;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public g(J)V
    .locals 1

    iget-object v0, p0, La8/k;->J:Lv7/w0;

    invoke-interface {v0, p1, p2}, Lv7/w0;->g(J)V

    return-void
.end method

.method public isLoading()Z
    .locals 1

    iget-object v0, p0, La8/k;->J:Lv7/w0;

    invoke-interface {v0}, Lv7/w0;->isLoading()Z

    move-result v0

    return v0
.end method

.method public j(J)J
    .locals 4

    iget-object v0, p0, La8/k;->G:[La8/p;

    array-length v1, v0

    if-lez v1, :cond_1

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1, p2, v1}, La8/p;->h0(JZ)Z

    move-result v0

    const/4 v1, 0x1

    :goto_0
    iget-object v2, p0, La8/k;->G:[La8/p;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    aget-object v2, v2, v1

    invoke-virtual {v2, p1, p2, v0}, La8/p;->h0(JZ)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    iget-object v0, p0, La8/k;->v:La8/s;

    invoke-virtual {v0}, La8/s;->b()V

    :cond_1
    return-wide p1
.end method

.method public k(Lv7/y$a;J)V
    .locals 0

    iput-object p1, p0, La8/k;->C:Lv7/y$a;

    iget-object p1, p0, La8/k;->b:Lb8/l;

    invoke-interface {p1, p0}, Lb8/l;->a(Lb8/l$b;)V

    invoke-direct {p0, p2, p3}, La8/k;->v(J)V

    return-void
.end method

.method public l()J
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public o()V
    .locals 4

    iget-object v0, p0, La8/k;->F:[La8/p;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, La8/p;->o()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public r()Lv7/f1;
    .locals 1

    iget-object v0, p0, La8/k;->E:Lv7/f1;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv7/f1;

    return-object v0
.end method

.method public s(JZ)V
    .locals 4

    iget-object v0, p0, La8/k;->G:[La8/p;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3, p1, p2, p3}, La8/p;->s(JZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public t([Lq8/r;[Z[Lv7/v0;[ZJ)J
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    array-length v3, v1

    new-array v3, v3, [I

    array-length v4, v1

    new-array v4, v4, [I

    const/4 v6, 0x0

    :goto_0
    array-length v7, v1

    if-ge v6, v7, :cond_3

    aget-object v7, v2, v6

    const/4 v8, -0x1

    if-nez v7, :cond_0

    move v7, v8

    goto :goto_1

    :cond_0
    iget-object v9, v0, La8/k;->u:Ljava/util/IdentityHashMap;

    invoke-virtual {v9, v7}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    :goto_1
    aput v7, v3, v6

    aput v8, v4, v6

    aget-object v7, v1, v6

    if-eqz v7, :cond_2

    invoke-interface {v7}, Lq8/u;->d()Lv7/d1;

    move-result-object v7

    const/4 v9, 0x0

    :goto_2
    iget-object v10, v0, La8/k;->F:[La8/p;

    array-length v11, v10

    if-ge v9, v11, :cond_2

    aget-object v10, v10, v9

    invoke-virtual {v10}, La8/p;->r()Lv7/f1;

    move-result-object v10

    invoke-virtual {v10, v7}, Lv7/f1;->d(Lv7/d1;)I

    move-result v10

    if-eq v10, v8, :cond_1

    aput v9, v4, v6

    goto :goto_3

    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_2
    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    iget-object v6, v0, La8/k;->u:Ljava/util/IdentityHashMap;

    invoke-virtual {v6}, Ljava/util/IdentityHashMap;->clear()V

    array-length v6, v1

    new-array v7, v6, [Lv7/v0;

    array-length v8, v1

    new-array v8, v8, [Lv7/v0;

    array-length v9, v1

    new-array v14, v9, [Lq8/r;

    iget-object v9, v0, La8/k;->F:[La8/p;

    array-length v9, v9

    new-array v15, v9, [La8/p;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v17, 0x0

    :goto_4
    iget-object v9, v0, La8/k;->F:[La8/p;

    array-length v9, v9

    if-ge v13, v9, :cond_10

    const/4 v9, 0x0

    :goto_5
    array-length v10, v1

    if-ge v9, v10, :cond_6

    aget v10, v3, v9

    const/4 v11, 0x0

    if-ne v10, v13, :cond_4

    aget-object v10, v2, v9

    goto :goto_6

    :cond_4
    move-object v10, v11

    :goto_6
    aput-object v10, v8, v9

    aget v10, v4, v9

    if-ne v10, v13, :cond_5

    aget-object v11, v1, v9

    :cond_5
    aput-object v11, v14, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    :cond_6
    iget-object v9, v0, La8/k;->F:[La8/p;

    aget-object v11, v9, v13

    move-object v9, v11

    move-object v10, v14

    move-object v5, v11

    move-object/from16 v11, p2

    move v2, v12

    move-object v12, v8

    move/from16 v18, v6

    move v6, v13

    move-object/from16 v13, p4

    move-object/from16 v19, v14

    move-object/from16 v20, v15

    move-wide/from16 v14, p5

    move/from16 v16, v17

    invoke-virtual/range {v9 .. v16}, La8/p;->i0([Lq8/r;[Z[Lv7/v0;[ZJZ)Z

    move-result v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_7
    array-length v12, v1

    const/4 v13, 0x1

    if-ge v10, v12, :cond_a

    aget-object v12, v8, v10

    aget v14, v4, v10

    if-ne v14, v6, :cond_7

    invoke-static {v12}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    aput-object v12, v7, v10

    iget-object v11, v0, La8/k;->u:Ljava/util/IdentityHashMap;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual {v11, v12, v14}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v11, v13

    goto :goto_9

    :cond_7
    aget v14, v3, v10

    if-ne v14, v6, :cond_9

    if-nez v12, :cond_8

    goto :goto_8

    :cond_8
    const/4 v13, 0x0

    :goto_8
    invoke-static {v13}, Lt8/a;->g(Z)V

    :cond_9
    :goto_9
    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    :cond_a
    move-object/from16 v10, v20

    if-eqz v11, :cond_e

    aput-object v5, v10, v2

    add-int/lit8 v12, v2, 0x1

    if-nez v2, :cond_c

    invoke-virtual {v5, v13}, La8/p;->l0(Z)V

    if-nez v9, :cond_b

    iget-object v2, v0, La8/k;->G:[La8/p;

    array-length v9, v2

    if-eqz v9, :cond_b

    const/4 v9, 0x0

    aget-object v2, v2, v9

    if-eq v5, v2, :cond_f

    :cond_b
    iget-object v2, v0, La8/k;->v:La8/s;

    invoke-virtual {v2}, La8/s;->b()V

    move/from16 v17, v13

    goto :goto_b

    :cond_c
    iget v2, v0, La8/k;->I:I

    if-ge v6, v2, :cond_d

    goto :goto_a

    :cond_d
    const/4 v13, 0x0

    :goto_a
    invoke-virtual {v5, v13}, La8/p;->l0(Z)V

    goto :goto_b

    :cond_e
    move v12, v2

    :cond_f
    :goto_b
    add-int/lit8 v13, v6, 0x1

    move-object/from16 v2, p3

    move-object v15, v10

    move/from16 v6, v18

    move-object/from16 v14, v19

    goto/16 :goto_4

    :cond_10
    move v5, v6

    move-object v10, v15

    const/4 v6, 0x0

    invoke-static {v7, v6, v2, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v10, v12}, Lt8/r0;->H0([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [La8/p;

    iput-object v1, v0, La8/k;->G:[La8/p;

    iget-object v2, v0, La8/k;->w:Lv7/i;

    invoke-interface {v2, v1}, Lv7/i;->a([Lv7/w0;)Lv7/w0;

    move-result-object v1

    iput-object v1, v0, La8/k;->J:Lv7/w0;

    return-wide p5
.end method
