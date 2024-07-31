.class public Ld0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static a()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/s1;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Ld0/d;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ld0/d;

    invoke-direct {v1}, Ld0/d;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-static {}, Ld0/i;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ld0/i;

    invoke-direct {v1}, Ld0/i;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-static {}, Ld0/a;->b()Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Ld0/a;

    invoke-direct {v1}, Ld0/a;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-static {}, Ld0/f;->a()Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Ld0/f;

    invoke-direct {v1}, Ld0/f;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-static {}, Ld0/e;->a()Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance v1, Ld0/e;

    invoke-direct {v1}, Ld0/e;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    return-object v0
.end method
