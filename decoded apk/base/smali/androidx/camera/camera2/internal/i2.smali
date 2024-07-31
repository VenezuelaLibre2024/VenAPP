.class public final Landroidx/camera/camera2/internal/i2;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(IZZ)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZZ)",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/c2;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Landroidx/camera/camera2/internal/i2;->f()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    const/4 v1, 0x1

    const/4 v2, 0x3

    if-eqz p0, :cond_0

    if-eq p0, v1, :cond_0

    if-ne p0, v2, :cond_1

    :cond_0
    invoke-static {}, Landroidx/camera/camera2/internal/i2;->h()Ljava/util/List;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    if-eq p0, v1, :cond_2

    if-ne p0, v2, :cond_3

    :cond_2
    invoke-static {}, Landroidx/camera/camera2/internal/i2;->e()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_3
    if-eqz p1, :cond_4

    invoke-static {}, Landroidx/camera/camera2/internal/i2;->i()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_4
    if-eqz p2, :cond_5

    if-nez p0, :cond_5

    invoke-static {}, Landroidx/camera/camera2/internal/i2;->c()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_5
    if-ne p0, v2, :cond_6

    invoke-static {}, Landroidx/camera/camera2/internal/i2;->g()Ljava/util/List;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_6
    return-object v0
.end method

.method public static b()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/c2;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    sget-object v2, Landroidx/camera/core/impl/d2$b;->PRIV:Landroidx/camera/core/impl/d2$b;

    sget-object v3, Landroidx/camera/core/impl/d2$a;->MAXIMUM:Landroidx/camera/core/impl/d2$a;

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    sget-object v4, Landroidx/camera/core/impl/d2$b;->YUV:Landroidx/camera/core/impl/d2$b;

    invoke-static {v4, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    sget-object v5, Landroidx/camera/core/impl/d2$a;->PREVIEW:Landroidx/camera/core/impl/d2$a;

    invoke-static {v2, v5}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    sget-object v6, Landroidx/camera/core/impl/d2$b;->JPEG:Landroidx/camera/core/impl/d2$b;

    invoke-static {v6, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v2, v5}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v4, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v4, v5}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v4, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v2, v5}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    sget-object v3, Landroidx/camera/core/impl/d2$a;->RECORD:Landroidx/camera/core/impl/d2$a;

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v2, v5}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v4, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v2, v5}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v6, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static c()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/c2;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    sget-object v2, Landroidx/camera/core/impl/d2$b;->PRIV:Landroidx/camera/core/impl/d2$b;

    sget-object v3, Landroidx/camera/core/impl/d2$a;->PREVIEW:Landroidx/camera/core/impl/d2$a;

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    sget-object v4, Landroidx/camera/core/impl/d2$a;->MAXIMUM:Landroidx/camera/core/impl/d2$a;

    invoke-static {v2, v4}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    sget-object v2, Landroidx/camera/core/impl/d2$b;->YUV:Landroidx/camera/core/impl/d2$b;

    invoke-static {v2, v4}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v2, v4}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static d()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/c2;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    sget-object v2, Landroidx/camera/core/impl/d2$b;->YUV:Landroidx/camera/core/impl/d2$b;

    sget-object v3, Landroidx/camera/core/impl/d2$a;->s1440p:Landroidx/camera/core/impl/d2$a;

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    sget-object v4, Landroidx/camera/core/impl/d2$b;->PRIV:Landroidx/camera/core/impl/d2$b;

    invoke-static {v4, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    sget-object v5, Landroidx/camera/core/impl/d2$b;->JPEG:Landroidx/camera/core/impl/d2$b;

    invoke-static {v5, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    sget-object v6, Landroidx/camera/core/impl/d2$a;->s720p:Landroidx/camera/core/impl/d2$a;

    invoke-static {v2, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v5, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v4, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v5, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v2, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v2, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v4, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v4, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v4, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v4, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static e()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/c2;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    sget-object v2, Landroidx/camera/core/impl/d2$b;->PRIV:Landroidx/camera/core/impl/d2$b;

    sget-object v3, Landroidx/camera/core/impl/d2$a;->PREVIEW:Landroidx/camera/core/impl/d2$a;

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    sget-object v4, Landroidx/camera/core/impl/d2$a;->MAXIMUM:Landroidx/camera/core/impl/d2$a;

    invoke-static {v2, v4}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    sget-object v5, Landroidx/camera/core/impl/d2$b;->YUV:Landroidx/camera/core/impl/d2$b;

    invoke-static {v5, v4}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v5, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v5, v4}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    sget-object v6, Landroidx/camera/core/impl/d2$b;->JPEG:Landroidx/camera/core/impl/d2$b;

    invoke-static {v6, v4}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    sget-object v6, Landroidx/camera/core/impl/d2$a;->VGA:Landroidx/camera/core/impl/d2$a;

    invoke-static {v5, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v5, v4}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v5, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v5, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v5, v4}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static f()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/c2;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    sget-object v2, Landroidx/camera/core/impl/d2$b;->PRIV:Landroidx/camera/core/impl/d2$b;

    sget-object v3, Landroidx/camera/core/impl/d2$a;->MAXIMUM:Landroidx/camera/core/impl/d2$a;

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    sget-object v4, Landroidx/camera/core/impl/d2$b;->JPEG:Landroidx/camera/core/impl/d2$b;

    invoke-static {v4, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    sget-object v5, Landroidx/camera/core/impl/d2$b;->YUV:Landroidx/camera/core/impl/d2$b;

    invoke-static {v5, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    sget-object v6, Landroidx/camera/core/impl/d2$a;->PREVIEW:Landroidx/camera/core/impl/d2$a;

    invoke-static {v2, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v4, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v5, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v4, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v2, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v2, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v2, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v5, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v2, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v5, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v4, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static g()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/c2;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    sget-object v2, Landroidx/camera/core/impl/d2$b;->PRIV:Landroidx/camera/core/impl/d2$b;

    sget-object v3, Landroidx/camera/core/impl/d2$a;->PREVIEW:Landroidx/camera/core/impl/d2$a;

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    sget-object v4, Landroidx/camera/core/impl/d2$a;->VGA:Landroidx/camera/core/impl/d2$a;

    invoke-static {v2, v4}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    sget-object v5, Landroidx/camera/core/impl/d2$b;->YUV:Landroidx/camera/core/impl/d2$b;

    sget-object v6, Landroidx/camera/core/impl/d2$a;->MAXIMUM:Landroidx/camera/core/impl/d2$a;

    invoke-static {v5, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    sget-object v5, Landroidx/camera/core/impl/d2$b;->RAW:Landroidx/camera/core/impl/d2$b;

    invoke-static {v5, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v2, v4}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    sget-object v2, Landroidx/camera/core/impl/d2$b;->JPEG:Landroidx/camera/core/impl/d2$b;

    invoke-static {v2, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v5, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static h()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/c2;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    sget-object v2, Landroidx/camera/core/impl/d2$b;->PRIV:Landroidx/camera/core/impl/d2$b;

    sget-object v3, Landroidx/camera/core/impl/d2$a;->PREVIEW:Landroidx/camera/core/impl/d2$a;

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    sget-object v4, Landroidx/camera/core/impl/d2$a;->RECORD:Landroidx/camera/core/impl/d2$a;

    invoke-static {v2, v4}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    sget-object v5, Landroidx/camera/core/impl/d2$b;->YUV:Landroidx/camera/core/impl/d2$b;

    invoke-static {v5, v4}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v5, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v5, v4}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v2, v4}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    sget-object v6, Landroidx/camera/core/impl/d2$b;->JPEG:Landroidx/camera/core/impl/d2$b;

    invoke-static {v6, v4}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v5, v4}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v6, v4}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v5, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v5, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    sget-object v2, Landroidx/camera/core/impl/d2$a;->MAXIMUM:Landroidx/camera/core/impl/d2$a;

    invoke-static {v6, v2}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static i()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/c2;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    sget-object v2, Landroidx/camera/core/impl/d2$b;->RAW:Landroidx/camera/core/impl/d2$b;

    sget-object v3, Landroidx/camera/core/impl/d2$a;->MAXIMUM:Landroidx/camera/core/impl/d2$a;

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    sget-object v4, Landroidx/camera/core/impl/d2$b;->PRIV:Landroidx/camera/core/impl/d2$b;

    sget-object v5, Landroidx/camera/core/impl/d2$a;->PREVIEW:Landroidx/camera/core/impl/d2$a;

    invoke-static {v4, v5}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    sget-object v6, Landroidx/camera/core/impl/d2$b;->YUV:Landroidx/camera/core/impl/d2$b;

    invoke-static {v6, v5}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v4, v5}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v4, v5}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v4, v5}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v6, v5}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v6, v5}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v6, v5}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v4, v5}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    sget-object v4, Landroidx/camera/core/impl/d2$b;->JPEG:Landroidx/camera/core/impl/d2$b;

    invoke-static {v4, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v6, v5}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v4, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static j()Ljava/util/List;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/c2;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    sget-object v2, Landroidx/camera/core/impl/d2$b;->PRIV:Landroidx/camera/core/impl/d2$b;

    sget-object v3, Landroidx/camera/core/impl/d2$a;->s1440p:Landroidx/camera/core/impl/d2$a;

    const-wide/16 v4, 0x4

    invoke-static {v2, v3, v4, v5}, Landroidx/camera/core/impl/d2;->b(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;J)Landroidx/camera/core/impl/d2;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    sget-object v6, Landroidx/camera/core/impl/d2$b;->YUV:Landroidx/camera/core/impl/d2$b;

    invoke-static {v6, v3, v4, v5}, Landroidx/camera/core/impl/d2;->b(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;J)Landroidx/camera/core/impl/d2;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    sget-object v3, Landroidx/camera/core/impl/d2$a;->RECORD:Landroidx/camera/core/impl/d2$a;

    const-wide/16 v4, 0x3

    invoke-static {v2, v3, v4, v5}, Landroidx/camera/core/impl/d2;->b(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;J)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v6, v3, v4, v5}, Landroidx/camera/core/impl/d2;->b(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;J)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    sget-object v7, Landroidx/camera/core/impl/d2$b;->JPEG:Landroidx/camera/core/impl/d2$b;

    sget-object v8, Landroidx/camera/core/impl/d2$a;->MAXIMUM:Landroidx/camera/core/impl/d2$a;

    const-wide/16 v9, 0x2

    invoke-static {v7, v8, v9, v10}, Landroidx/camera/core/impl/d2;->b(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;J)Landroidx/camera/core/impl/d2;

    move-result-object v11

    invoke-virtual {v1, v11}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v6, v8, v9, v10}, Landroidx/camera/core/impl/d2;->b(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;J)Landroidx/camera/core/impl/d2;

    move-result-object v11

    invoke-virtual {v1, v11}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    sget-object v11, Landroidx/camera/core/impl/d2$a;->PREVIEW:Landroidx/camera/core/impl/d2$a;

    const-wide/16 v12, 0x1

    invoke-static {v2, v11, v12, v13}, Landroidx/camera/core/impl/d2;->b(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;J)Landroidx/camera/core/impl/d2;

    move-result-object v14

    invoke-virtual {v1, v14}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v7, v8, v9, v10}, Landroidx/camera/core/impl/d2;->b(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;J)Landroidx/camera/core/impl/d2;

    move-result-object v14

    invoke-virtual {v1, v14}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v2, v11, v12, v13}, Landroidx/camera/core/impl/d2;->b(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;J)Landroidx/camera/core/impl/d2;

    move-result-object v14

    invoke-virtual {v1, v14}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v6, v8, v9, v10}, Landroidx/camera/core/impl/d2;->b(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;J)Landroidx/camera/core/impl/d2;

    move-result-object v14

    invoke-virtual {v1, v14}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v2, v11, v12, v13}, Landroidx/camera/core/impl/d2;->b(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;J)Landroidx/camera/core/impl/d2;

    move-result-object v14

    invoke-virtual {v1, v14}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v2, v3, v4, v5}, Landroidx/camera/core/impl/d2;->b(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;J)Landroidx/camera/core/impl/d2;

    move-result-object v14

    invoke-virtual {v1, v14}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v2, v11, v12, v13}, Landroidx/camera/core/impl/d2;->b(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;J)Landroidx/camera/core/impl/d2;

    move-result-object v14

    invoke-virtual {v1, v14}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v6, v3, v4, v5}, Landroidx/camera/core/impl/d2;->b(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;J)Landroidx/camera/core/impl/d2;

    move-result-object v14

    invoke-virtual {v1, v14}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v2, v11, v12, v13}, Landroidx/camera/core/impl/d2;->b(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;J)Landroidx/camera/core/impl/d2;

    move-result-object v14

    invoke-virtual {v1, v14}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v6, v11, v12, v13}, Landroidx/camera/core/impl/d2;->b(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;J)Landroidx/camera/core/impl/d2;

    move-result-object v14

    invoke-virtual {v1, v14}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v2, v11, v12, v13}, Landroidx/camera/core/impl/d2;->b(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;J)Landroidx/camera/core/impl/d2;

    move-result-object v14

    invoke-virtual {v1, v14}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v2, v3, v4, v5}, Landroidx/camera/core/impl/d2;->b(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;J)Landroidx/camera/core/impl/d2;

    move-result-object v14

    invoke-virtual {v1, v14}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v7, v3, v9, v10}, Landroidx/camera/core/impl/d2;->b(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;J)Landroidx/camera/core/impl/d2;

    move-result-object v14

    invoke-virtual {v1, v14}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v2, v11, v12, v13}, Landroidx/camera/core/impl/d2;->b(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;J)Landroidx/camera/core/impl/d2;

    move-result-object v14

    invoke-virtual {v1, v14}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v6, v3, v4, v5}, Landroidx/camera/core/impl/d2;->b(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;J)Landroidx/camera/core/impl/d2;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v7, v3, v9, v10}, Landroidx/camera/core/impl/d2;->b(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;J)Landroidx/camera/core/impl/d2;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v2, v11, v12, v13}, Landroidx/camera/core/impl/d2;->b(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;J)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v6, v11, v12, v13}, Landroidx/camera/core/impl/d2;->b(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;J)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v7, v8, v9, v10}, Landroidx/camera/core/impl/d2;->b(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;J)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static k()Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/c2;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    sget-object v2, Landroidx/camera/core/impl/d2$b;->YUV:Landroidx/camera/core/impl/d2$b;

    sget-object v3, Landroidx/camera/core/impl/d2$a;->ULTRA_MAXIMUM:Landroidx/camera/core/impl/d2$a;

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    sget-object v4, Landroidx/camera/core/impl/d2$b;->PRIV:Landroidx/camera/core/impl/d2$b;

    sget-object v5, Landroidx/camera/core/impl/d2$a;->PREVIEW:Landroidx/camera/core/impl/d2$a;

    invoke-static {v4, v5}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    sget-object v6, Landroidx/camera/core/impl/d2$a;->RECORD:Landroidx/camera/core/impl/d2$a;

    invoke-static {v4, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    sget-object v7, Landroidx/camera/core/impl/d2$b;->JPEG:Landroidx/camera/core/impl/d2$b;

    invoke-static {v7, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v8

    invoke-virtual {v1, v8}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v4, v5}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v8

    invoke-virtual {v1, v8}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v4, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v8

    invoke-virtual {v1, v8}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    sget-object v8, Landroidx/camera/core/impl/d2$b;->RAW:Landroidx/camera/core/impl/d2$b;

    invoke-static {v8, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v9

    invoke-virtual {v1, v9}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v4, v5}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v9

    invoke-virtual {v1, v9}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v4, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v4, v5}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    sget-object v6, Landroidx/camera/core/impl/d2$a;->MAXIMUM:Landroidx/camera/core/impl/d2$a;

    invoke-static {v7, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v9

    invoke-virtual {v1, v9}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v7, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v9

    invoke-virtual {v1, v9}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v4, v5}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v9

    invoke-virtual {v1, v9}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v7, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v9

    invoke-virtual {v1, v9}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v8, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v9

    invoke-virtual {v1, v9}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v4, v5}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v9

    invoke-virtual {v1, v9}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v7, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v9

    invoke-virtual {v1, v9}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v9

    invoke-virtual {v1, v9}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v4, v5}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v9

    invoke-virtual {v1, v9}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v2, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v9

    invoke-virtual {v1, v9}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v7, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v9

    invoke-virtual {v1, v9}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v4, v5}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v9

    invoke-virtual {v1, v9}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v2, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v9

    invoke-virtual {v1, v9}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v8, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v9

    invoke-virtual {v1, v9}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v4, v5}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v9

    invoke-virtual {v1, v9}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v2, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v9

    invoke-virtual {v1, v9}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v2, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v4, v5}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v8, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v7, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v4, v5}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v8, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Landroidx/camera/core/impl/c2;

    invoke-direct {v1}, Landroidx/camera/core/impl/c2;-><init>()V

    invoke-static {v8, v3}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v4, v5}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-static {v8, v6}, Landroidx/camera/core/impl/d2;->a(Landroidx/camera/core/impl/d2$b;Landroidx/camera/core/impl/d2$a;)Landroidx/camera/core/impl/d2;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/c2;->a(Landroidx/camera/core/impl/d2;)Z

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method
