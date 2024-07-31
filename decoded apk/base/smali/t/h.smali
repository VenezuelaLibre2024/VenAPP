.class public Lt/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt/h$a;
    }
.end annotation


# instance fields
.field private final a:Ls/h;


# direct methods
.method public constructor <init>(Landroidx/camera/core/impl/t1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Ls/h;

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/t1;->b(Ljava/lang/Class;)Landroidx/camera/core/impl/s1;

    move-result-object p1

    check-cast p1, Ls/h;

    iput-object p1, p0, Lt/h;->a:Ls/h;

    return-void
.end method

.method private a(Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Landroidx/camera/camera2/internal/x2;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/camera2/internal/x2;

    invoke-interface {v0}, Landroidx/camera/camera2/internal/x2;->c()Landroidx/camera/camera2/internal/x2$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/camera/camera2/internal/x2$a;->p(Landroidx/camera/camera2/internal/x2;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private b(Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Landroidx/camera/camera2/internal/x2;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/camera2/internal/x2;

    invoke-interface {v0}, Landroidx/camera/camera2/internal/x2;->c()Landroidx/camera/camera2/internal/x2$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/camera/camera2/internal/x2$a;->q(Landroidx/camera/camera2/internal/x2;)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public c(Landroidx/camera/camera2/internal/x2;Ljava/util/List;Ljava/util/List;Lt/h$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/camera2/internal/x2;",
            "Ljava/util/List<",
            "Landroidx/camera/camera2/internal/x2;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/camera/camera2/internal/x2;",
            ">;",
            "Lt/h$a;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Lt/h;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/camera2/internal/x2;

    if-ne v1, p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    :goto_1
    invoke-direct {p0, v0}, Lt/h;->b(Ljava/util/Set;)V

    :cond_2
    invoke-interface {p4, p1}, Lt/h$a;->a(Landroidx/camera/camera2/internal/x2;)V

    invoke-virtual {p0}, Lt/h;->d()Z

    move-result p2

    if-eqz p2, :cond_5

    new-instance p2, Ljava/util/LinkedHashSet;

    invoke-direct {p2}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_4

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroidx/camera/camera2/internal/x2;

    if-ne p4, p1, :cond_3

    goto :goto_3

    :cond_3
    invoke-interface {p2, p4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    :goto_3
    invoke-direct {p0, p2}, Lt/h;->a(Ljava/util/Set;)V

    :cond_5
    return-void
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lt/h;->a:Ls/h;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
