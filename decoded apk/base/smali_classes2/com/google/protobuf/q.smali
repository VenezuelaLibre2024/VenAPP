.class final Lcom/google/protobuf/q;
.super Lcom/google/protobuf/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/p<",
        "Lcom/google/protobuf/x$d;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/protobuf/p;-><init>()V

    return-void
.end method


# virtual methods
.method a(Ljava/util/Map$Entry;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "**>;)I"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/protobuf/x$d;

    invoke-virtual {p1}, Lcom/google/protobuf/x$d;->a()I

    move-result p1

    return p1
.end method

.method b(Lcom/google/protobuf/o;Lcom/google/protobuf/r0;I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p1, p2, p3}, Lcom/google/protobuf/o;->a(Lcom/google/protobuf/r0;I)Lcom/google/protobuf/x$e;

    move-result-object p1

    return-object p1
.end method

.method c(Ljava/lang/Object;)Lcom/google/protobuf/t;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/protobuf/t<",
            "Lcom/google/protobuf/x$d;",
            ">;"
        }
    .end annotation

    check-cast p1, Lcom/google/protobuf/x$c;

    iget-object p1, p1, Lcom/google/protobuf/x$c;->extensions:Lcom/google/protobuf/t;

    return-object p1
.end method

.method d(Ljava/lang/Object;)Lcom/google/protobuf/t;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/protobuf/t<",
            "Lcom/google/protobuf/x$d;",
            ">;"
        }
    .end annotation

    check-cast p1, Lcom/google/protobuf/x$c;

    invoke-virtual {p1}, Lcom/google/protobuf/x$c;->Z()Lcom/google/protobuf/t;

    move-result-object p1

    return-object p1
.end method

.method e(Lcom/google/protobuf/r0;)Z
    .locals 0

    instance-of p1, p1, Lcom/google/protobuf/x$c;

    return p1
.end method

.method f(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/protobuf/q;->c(Ljava/lang/Object;)Lcom/google/protobuf/t;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/t;->u()V

    return-void
.end method

.method g(Ljava/lang/Object;Lcom/google/protobuf/f1;Ljava/lang/Object;Lcom/google/protobuf/o;Lcom/google/protobuf/t;Ljava/lang/Object;Lcom/google/protobuf/n1;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Lcom/google/protobuf/f1;",
            "Ljava/lang/Object;",
            "Lcom/google/protobuf/o;",
            "Lcom/google/protobuf/t<",
            "Lcom/google/protobuf/x$d;",
            ">;TUB;",
            "Lcom/google/protobuf/n1<",
            "TUT;TUB;>;)TUB;"
        }
    .end annotation

    check-cast p3, Lcom/google/protobuf/x$e;

    invoke-virtual {p3}, Lcom/google/protobuf/x$e;->c()I

    move-result v1

    iget-object v0, p3, Lcom/google/protobuf/x$e;->b:Lcom/google/protobuf/x$d;

    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p3, Lcom/google/protobuf/x$e;->b:Lcom/google/protobuf/x$d;

    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p4, Lcom/google/protobuf/q$a;->a:[I

    invoke-virtual {p3}, Lcom/google/protobuf/x$e;->a()Lcom/google/protobuf/t1$b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p4, p4, v0

    packed-switch p4, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Type cannot be packed: "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p3, Lcom/google/protobuf/x$e;->b:Lcom/google/protobuf/x$d;

    invoke-virtual {p3}, Lcom/google/protobuf/x$d;->d()Lcom/google/protobuf/t1$b;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, p4}, Lcom/google/protobuf/f1;->j(Ljava/util/List;)V

    iget-object p2, p3, Lcom/google/protobuf/x$e;->b:Lcom/google/protobuf/x$d;

    invoke-virtual {p2}, Lcom/google/protobuf/x$d;->h()Lcom/google/protobuf/z$d;

    move-result-object v3

    move-object v0, p1

    move-object v2, p4

    move-object v4, p6

    move-object v5, p7

    invoke-static/range {v0 .. v5}, Lcom/google/protobuf/i1;->z(Ljava/lang/Object;ILjava/util/List;Lcom/google/protobuf/z$d;Ljava/lang/Object;Lcom/google/protobuf/n1;)Ljava/lang/Object;

    move-result-object p6

    goto/16 :goto_0

    :pswitch_1
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, p4}, Lcom/google/protobuf/f1;->d(Ljava/util/List;)V

    goto/16 :goto_0

    :pswitch_2
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, p4}, Lcom/google/protobuf/f1;->r(Ljava/util/List;)V

    goto :goto_0

    :pswitch_3
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, p4}, Lcom/google/protobuf/f1;->v(Ljava/util/List;)V

    goto :goto_0

    :pswitch_4
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, p4}, Lcom/google/protobuf/f1;->c(Ljava/util/List;)V

    goto :goto_0

    :pswitch_5
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, p4}, Lcom/google/protobuf/f1;->t(Ljava/util/List;)V

    goto :goto_0

    :pswitch_6
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, p4}, Lcom/google/protobuf/f1;->m(Ljava/util/List;)V

    goto :goto_0

    :pswitch_7
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, p4}, Lcom/google/protobuf/f1;->x(Ljava/util/List;)V

    goto :goto_0

    :pswitch_8
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, p4}, Lcom/google/protobuf/f1;->q(Ljava/util/List;)V

    goto :goto_0

    :pswitch_9
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, p4}, Lcom/google/protobuf/f1;->w(Ljava/util/List;)V

    goto :goto_0

    :pswitch_a
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, p4}, Lcom/google/protobuf/f1;->g(Ljava/util/List;)V

    goto :goto_0

    :pswitch_b
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, p4}, Lcom/google/protobuf/f1;->i(Ljava/util/List;)V

    goto :goto_0

    :pswitch_c
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, p4}, Lcom/google/protobuf/f1;->C(Ljava/util/List;)V

    goto :goto_0

    :pswitch_d
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, p4}, Lcom/google/protobuf/f1;->G(Ljava/util/List;)V

    :goto_0
    iget-object p1, p3, Lcom/google/protobuf/x$e;->b:Lcom/google/protobuf/x$d;

    invoke-virtual {p5, p1, p4}, Lcom/google/protobuf/t;->y(Lcom/google/protobuf/t$b;Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    invoke-virtual {p3}, Lcom/google/protobuf/x$e;->a()Lcom/google/protobuf/t1$b;

    move-result-object v0

    sget-object v2, Lcom/google/protobuf/t1$b;->ENUM:Lcom/google/protobuf/t1$b;

    if-ne v0, v2, :cond_2

    invoke-interface {p2}, Lcom/google/protobuf/f1;->p()I

    move-result p2

    iget-object p4, p3, Lcom/google/protobuf/x$e;->b:Lcom/google/protobuf/x$d;

    invoke-virtual {p4}, Lcom/google/protobuf/x$d;->h()Lcom/google/protobuf/z$d;

    move-result-object p4

    invoke-interface {p4, p2}, Lcom/google/protobuf/z$d;->a(I)Lcom/google/protobuf/z$c;

    move-result-object p4

    if-nez p4, :cond_1

    invoke-static {p1, v1, p2, p6, p7}, Lcom/google/protobuf/i1;->L(Ljava/lang/Object;IILjava/lang/Object;Lcom/google/protobuf/n1;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto/16 :goto_3

    :cond_2
    sget-object p1, Lcom/google/protobuf/q$a;->a:[I

    invoke-virtual {p3}, Lcom/google/protobuf/x$e;->a()Lcom/google/protobuf/t1$b;

    move-result-object p7

    invoke-virtual {p7}, Ljava/lang/Enum;->ordinal()I

    move-result p7

    aget p1, p1, p7

    packed-switch p1, :pswitch_data_1

    const/4 p1, 0x0

    goto/16 :goto_3

    :pswitch_e
    invoke-virtual {p3}, Lcom/google/protobuf/x$e;->d()Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p3, Lcom/google/protobuf/x$e;->b:Lcom/google/protobuf/x$d;

    invoke-virtual {p5, p1}, Lcom/google/protobuf/t;->i(Lcom/google/protobuf/t$b;)Ljava/lang/Object;

    move-result-object p1

    instance-of p7, p1, Lcom/google/protobuf/x;

    if-eqz p7, :cond_4

    invoke-static {}, Lcom/google/protobuf/c1;->a()Lcom/google/protobuf/c1;

    move-result-object p7

    invoke-virtual {p7, p1}, Lcom/google/protobuf/c1;->d(Ljava/lang/Object;)Lcom/google/protobuf/g1;

    move-result-object p7

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/x;

    invoke-virtual {v0}, Lcom/google/protobuf/x;->N()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p7}, Lcom/google/protobuf/g1;->e()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p7, v0, p1}, Lcom/google/protobuf/g1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p3, Lcom/google/protobuf/x$e;->b:Lcom/google/protobuf/x$d;

    invoke-virtual {p5, p1, v0}, Lcom/google/protobuf/t;->y(Lcom/google/protobuf/t$b;Ljava/lang/Object;)V

    move-object p1, v0

    :cond_3
    invoke-interface {p2, p1, p7, p4}, Lcom/google/protobuf/f1;->P(Ljava/lang/Object;Lcom/google/protobuf/g1;Lcom/google/protobuf/o;)V

    return-object p6

    :cond_4
    invoke-virtual {p3}, Lcom/google/protobuf/x$e;->b()Lcom/google/protobuf/r0;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-interface {p2, p1, p4}, Lcom/google/protobuf/f1;->N(Ljava/lang/Class;Lcom/google/protobuf/o;)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_3

    :pswitch_f
    invoke-virtual {p3}, Lcom/google/protobuf/x$e;->d()Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, p3, Lcom/google/protobuf/x$e;->b:Lcom/google/protobuf/x$d;

    invoke-virtual {p5, p1}, Lcom/google/protobuf/t;->i(Lcom/google/protobuf/t$b;)Ljava/lang/Object;

    move-result-object p1

    instance-of p7, p1, Lcom/google/protobuf/x;

    if-eqz p7, :cond_6

    invoke-static {}, Lcom/google/protobuf/c1;->a()Lcom/google/protobuf/c1;

    move-result-object p7

    invoke-virtual {p7, p1}, Lcom/google/protobuf/c1;->d(Ljava/lang/Object;)Lcom/google/protobuf/g1;

    move-result-object p7

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/x;

    invoke-virtual {v0}, Lcom/google/protobuf/x;->N()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-interface {p7}, Lcom/google/protobuf/g1;->e()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p7, v0, p1}, Lcom/google/protobuf/g1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p3, Lcom/google/protobuf/x$e;->b:Lcom/google/protobuf/x$d;

    invoke-virtual {p5, p1, v0}, Lcom/google/protobuf/t;->y(Lcom/google/protobuf/t$b;Ljava/lang/Object;)V

    move-object p1, v0

    :cond_5
    invoke-interface {p2, p1, p7, p4}, Lcom/google/protobuf/f1;->O(Ljava/lang/Object;Lcom/google/protobuf/g1;Lcom/google/protobuf/o;)V

    return-object p6

    :cond_6
    invoke-virtual {p3}, Lcom/google/protobuf/x$e;->b()Lcom/google/protobuf/r0;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-interface {p2, p1, p4}, Lcom/google/protobuf/f1;->L(Ljava/lang/Class;Lcom/google/protobuf/o;)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_3

    :pswitch_10
    invoke-interface {p2}, Lcom/google/protobuf/f1;->z()Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :pswitch_11
    invoke-interface {p2}, Lcom/google/protobuf/f1;->o()Lcom/google/protobuf/g;

    move-result-object p1

    goto :goto_3

    :pswitch_12
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Shouldn\'t reach here."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_13
    invoke-interface {p2}, Lcom/google/protobuf/f1;->y()J

    move-result-wide p1

    goto :goto_2

    :pswitch_14
    invoke-interface {p2}, Lcom/google/protobuf/f1;->l()I

    move-result p1

    goto :goto_1

    :pswitch_15
    invoke-interface {p2}, Lcom/google/protobuf/f1;->f()J

    move-result-wide p1

    goto :goto_2

    :pswitch_16
    invoke-interface {p2}, Lcom/google/protobuf/f1;->E()I

    move-result p1

    goto :goto_1

    :pswitch_17
    invoke-interface {p2}, Lcom/google/protobuf/f1;->h()I

    move-result p1

    goto :goto_1

    :pswitch_18
    invoke-interface {p2}, Lcom/google/protobuf/f1;->e()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_3

    :pswitch_19
    invoke-interface {p2}, Lcom/google/protobuf/f1;->u()I

    move-result p1

    goto :goto_1

    :pswitch_1a
    invoke-interface {p2}, Lcom/google/protobuf/f1;->b()J

    move-result-wide p1

    goto :goto_2

    :pswitch_1b
    invoke-interface {p2}, Lcom/google/protobuf/f1;->p()I

    move-result p1

    :goto_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_3

    :pswitch_1c
    invoke-interface {p2}, Lcom/google/protobuf/f1;->s()J

    move-result-wide p1

    goto :goto_2

    :pswitch_1d
    invoke-interface {p2}, Lcom/google/protobuf/f1;->H()J

    move-result-wide p1

    :goto_2
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_3

    :pswitch_1e
    invoke-interface {p2}, Lcom/google/protobuf/f1;->readFloat()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    goto :goto_3

    :pswitch_1f
    invoke-interface {p2}, Lcom/google/protobuf/f1;->readDouble()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    :goto_3
    invoke-virtual {p3}, Lcom/google/protobuf/x$e;->d()Z

    move-result p2

    if-eqz p2, :cond_7

    iget-object p2, p3, Lcom/google/protobuf/x$e;->b:Lcom/google/protobuf/x$d;

    invoke-virtual {p5, p2, p1}, Lcom/google/protobuf/t;->a(Lcom/google/protobuf/t$b;Ljava/lang/Object;)V

    goto :goto_5

    :cond_7
    sget-object p2, Lcom/google/protobuf/q$a;->a:[I

    invoke-virtual {p3}, Lcom/google/protobuf/x$e;->a()Lcom/google/protobuf/t1$b;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p4

    aget p2, p2, p4

    const/16 p4, 0x11

    if-eq p2, p4, :cond_8

    const/16 p4, 0x12

    if-eq p2, p4, :cond_8

    goto :goto_4

    :cond_8
    iget-object p2, p3, Lcom/google/protobuf/x$e;->b:Lcom/google/protobuf/x$d;

    invoke-virtual {p5, p2}, Lcom/google/protobuf/t;->i(Lcom/google/protobuf/t$b;)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_9

    invoke-static {p2, p1}, Lcom/google/protobuf/z;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :cond_9
    :goto_4
    iget-object p2, p3, Lcom/google/protobuf/x$e;->b:Lcom/google/protobuf/x$d;

    invoke-virtual {p5, p2, p1}, Lcom/google/protobuf/t;->y(Lcom/google/protobuf/t$b;Ljava/lang/Object;)V

    :goto_5
    return-object p6

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
    .end packed-switch
.end method

.method h(Lcom/google/protobuf/f1;Ljava/lang/Object;Lcom/google/protobuf/o;Lcom/google/protobuf/t;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/protobuf/f1;",
            "Ljava/lang/Object;",
            "Lcom/google/protobuf/o;",
            "Lcom/google/protobuf/t<",
            "Lcom/google/protobuf/x$d;",
            ">;)V"
        }
    .end annotation

    check-cast p2, Lcom/google/protobuf/x$e;

    invoke-virtual {p2}, Lcom/google/protobuf/x$e;->b()Lcom/google/protobuf/r0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-interface {p1, v0, p3}, Lcom/google/protobuf/f1;->N(Ljava/lang/Class;Lcom/google/protobuf/o;)Ljava/lang/Object;

    move-result-object p1

    iget-object p2, p2, Lcom/google/protobuf/x$e;->b:Lcom/google/protobuf/x$d;

    invoke-virtual {p4, p2, p1}, Lcom/google/protobuf/t;->y(Lcom/google/protobuf/t$b;Ljava/lang/Object;)V

    return-void
.end method

.method i(Lcom/google/protobuf/g;Ljava/lang/Object;Lcom/google/protobuf/o;Lcom/google/protobuf/t;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/protobuf/g;",
            "Ljava/lang/Object;",
            "Lcom/google/protobuf/o;",
            "Lcom/google/protobuf/t<",
            "Lcom/google/protobuf/x$d;",
            ">;)V"
        }
    .end annotation

    check-cast p2, Lcom/google/protobuf/x$e;

    invoke-virtual {p2}, Lcom/google/protobuf/x$e;->b()Lcom/google/protobuf/r0;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/protobuf/r0;->d()Lcom/google/protobuf/r0$a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/protobuf/g;->s()Lcom/google/protobuf/h;

    move-result-object p1

    invoke-interface {v0, p1, p3}, Lcom/google/protobuf/r0$a;->c0(Lcom/google/protobuf/h;Lcom/google/protobuf/o;)Lcom/google/protobuf/r0$a;

    iget-object p2, p2, Lcom/google/protobuf/x$e;->b:Lcom/google/protobuf/x$d;

    invoke-interface {v0}, Lcom/google/protobuf/r0$a;->f()Lcom/google/protobuf/r0;

    move-result-object p3

    invoke-virtual {p4, p2, p3}, Lcom/google/protobuf/t;->y(Lcom/google/protobuf/t$b;Ljava/lang/Object;)V

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/google/protobuf/h;->a(I)V

    return-void
.end method

.method j(Lcom/google/protobuf/u1;Ljava/util/Map$Entry;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/protobuf/u1;",
            "Ljava/util/Map$Entry<",
            "**>;)V"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/x$d;

    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/google/protobuf/q$a;->a:[I

    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->d()Lcom/google/protobuf/t1$b;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {}, Lcom/google/protobuf/c1;->a()Lcom/google/protobuf/c1;

    move-result-object v3

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/google/protobuf/c1;->c(Ljava/lang/Class;)Lcom/google/protobuf/g1;

    move-result-object v1

    invoke-static {v0, p2, p1, v1}, Lcom/google/protobuf/i1;->X(ILjava/util/List;Lcom/google/protobuf/u1;Lcom/google/protobuf/g1;)V

    goto/16 :goto_0

    :pswitch_1
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {}, Lcom/google/protobuf/c1;->a()Lcom/google/protobuf/c1;

    move-result-object v3

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/google/protobuf/c1;->c(Ljava/lang/Class;)Lcom/google/protobuf/g1;

    move-result-object v1

    invoke-static {v0, p2, p1, v1}, Lcom/google/protobuf/i1;->U(ILjava/util/List;Lcom/google/protobuf/u1;Lcom/google/protobuf/g1;)V

    goto/16 :goto_0

    :pswitch_2
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {v0, p2, p1}, Lcom/google/protobuf/i1;->c0(ILjava/util/List;Lcom/google/protobuf/u1;)V

    goto/16 :goto_0

    :pswitch_3
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {v0, p2, p1}, Lcom/google/protobuf/i1;->O(ILjava/util/List;Lcom/google/protobuf/u1;)V

    goto/16 :goto_0

    :pswitch_4
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->f()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/protobuf/i1;->b0(ILjava/util/List;Lcom/google/protobuf/u1;Z)V

    goto/16 :goto_0

    :pswitch_5
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->f()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/protobuf/i1;->a0(ILjava/util/List;Lcom/google/protobuf/u1;Z)V

    goto/16 :goto_0

    :pswitch_6
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->f()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/protobuf/i1;->Z(ILjava/util/List;Lcom/google/protobuf/u1;Z)V

    goto/16 :goto_0

    :pswitch_7
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->f()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/protobuf/i1;->Y(ILjava/util/List;Lcom/google/protobuf/u1;Z)V

    goto/16 :goto_0

    :pswitch_8
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->f()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/protobuf/i1;->d0(ILjava/util/List;Lcom/google/protobuf/u1;Z)V

    goto/16 :goto_0

    :pswitch_9
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->f()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/protobuf/i1;->N(ILjava/util/List;Lcom/google/protobuf/u1;Z)V

    goto/16 :goto_0

    :pswitch_a
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->f()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/protobuf/i1;->R(ILjava/util/List;Lcom/google/protobuf/u1;Z)V

    goto/16 :goto_0

    :pswitch_b
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->f()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/protobuf/i1;->S(ILjava/util/List;Lcom/google/protobuf/u1;Z)V

    goto/16 :goto_0

    :pswitch_c
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->f()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/protobuf/i1;->V(ILjava/util/List;Lcom/google/protobuf/u1;Z)V

    goto/16 :goto_0

    :pswitch_d
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->f()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/protobuf/i1;->e0(ILjava/util/List;Lcom/google/protobuf/u1;Z)V

    goto/16 :goto_0

    :pswitch_e
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->f()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/protobuf/i1;->W(ILjava/util/List;Lcom/google/protobuf/u1;Z)V

    goto/16 :goto_0

    :pswitch_f
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->f()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/protobuf/i1;->T(ILjava/util/List;Lcom/google/protobuf/u1;Z)V

    goto/16 :goto_0

    :pswitch_10
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v1

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->f()Z

    move-result v0

    invoke-static {v1, p2, p1, v0}, Lcom/google/protobuf/i1;->P(ILjava/util/List;Lcom/google/protobuf/u1;Z)V

    goto/16 :goto_0

    :cond_0
    sget-object v1, Lcom/google/protobuf/q$a;->a:[I

    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->d()Lcom/google/protobuf/t1$b;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_1

    goto/16 :goto_0

    :pswitch_11
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lcom/google/protobuf/c1;->a()Lcom/google/protobuf/c1;

    move-result-object v2

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v2, p2}, Lcom/google/protobuf/c1;->c(Ljava/lang/Class;)Lcom/google/protobuf/g1;

    move-result-object p2

    invoke-interface {p1, v0, v1, p2}, Lcom/google/protobuf/u1;->N(ILjava/lang/Object;Lcom/google/protobuf/g1;)V

    goto/16 :goto_0

    :pswitch_12
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Lcom/google/protobuf/c1;->a()Lcom/google/protobuf/c1;

    move-result-object v2

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v2, p2}, Lcom/google/protobuf/c1;->c(Ljava/lang/Class;)Lcom/google/protobuf/g1;

    move-result-object p2

    invoke-interface {p1, v0, v1, p2}, Lcom/google/protobuf/u1;->K(ILjava/lang/Object;Lcom/google/protobuf/g1;)V

    goto/16 :goto_0

    :pswitch_13
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-interface {p1, v0, p2}, Lcom/google/protobuf/u1;->e(ILjava/lang/String;)V

    goto/16 :goto_0

    :pswitch_14
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/protobuf/g;

    invoke-interface {p1, v0, p2}, Lcom/google/protobuf/u1;->L(ILcom/google/protobuf/g;)V

    goto/16 :goto_0

    :pswitch_15
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/protobuf/u1;->m(IJ)V

    goto/16 :goto_0

    :pswitch_16
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/protobuf/u1;->H(II)V

    goto/16 :goto_0

    :pswitch_17
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/protobuf/u1;->i(IJ)V

    goto/16 :goto_0

    :pswitch_18
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/protobuf/u1;->w(II)V

    goto/16 :goto_0

    :pswitch_19
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/protobuf/u1;->o(II)V

    goto/16 :goto_0

    :pswitch_1a
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/protobuf/u1;->v(IZ)V

    goto/16 :goto_0

    :pswitch_1b
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/protobuf/u1;->c(II)V

    goto :goto_0

    :pswitch_1c
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/protobuf/u1;->s(IJ)V

    goto :goto_0

    :pswitch_1d
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/protobuf/u1;->h(II)V

    goto :goto_0

    :pswitch_1e
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/protobuf/u1;->f(IJ)V

    goto :goto_0

    :pswitch_1f
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/protobuf/u1;->u(IJ)V

    goto :goto_0

    :pswitch_20
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/protobuf/u1;->B(IF)V

    goto :goto_0

    :pswitch_21
    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/protobuf/u1;->p(ID)V

    :cond_1
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_c
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_1d
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
    .end packed-switch
.end method
