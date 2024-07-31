.class public final Landroidx/camera/core/n$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/k2$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/camera/core/impl/k2$a<",
        "Landroidx/camera/core/n;",
        "Landroidx/camera/core/impl/d1;",
        "Landroidx/camera/core/n$b;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Landroidx/camera/core/impl/m1;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/m1;->a0()Landroidx/camera/core/impl/m1;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/camera/core/n$b;-><init>(Landroidx/camera/core/impl/m1;)V

    return-void
.end method

.method private constructor <init>(Landroidx/camera/core/impl/m1;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/n$b;->a:Landroidx/camera/core/impl/m1;

    sget-object v0, Lb0/j;->D:Landroidx/camera/core/impl/n0$a;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroidx/camera/core/impl/p1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Class;

    const-class v0, Landroidx/camera/core/n;

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid target class configuration for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-virtual {p0, v0}, Landroidx/camera/core/n$b;->k(Ljava/lang/Class;)Landroidx/camera/core/n$b;

    return-void
.end method

.method public static d(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/n$b;
    .locals 1

    new-instance v0, Landroidx/camera/core/n$b;

    invoke-static {p0}, Landroidx/camera/core/impl/m1;->b0(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/m1;

    move-result-object p0

    invoke-direct {v0, p0}, Landroidx/camera/core/n$b;-><init>(Landroidx/camera/core/impl/m1;)V

    return-object v0
.end method


# virtual methods
.method public a()Landroidx/camera/core/impl/l1;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/n$b;->a:Landroidx/camera/core/impl/m1;

    return-object v0
.end method

.method public bridge synthetic b()Landroidx/camera/core/impl/k2;
    .locals 1

    invoke-virtual {p0}, Landroidx/camera/core/n$b;->e()Landroidx/camera/core/impl/d1;

    move-result-object v0

    return-object v0
.end method

.method public c()Landroidx/camera/core/n;
    .locals 4

    invoke-virtual {p0}, Landroidx/camera/core/n$b;->a()Landroidx/camera/core/impl/l1;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/d1;->K:Landroidx/camera/core/impl/n0$a;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroidx/camera/core/impl/n0;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/n$b;->a()Landroidx/camera/core/impl/l1;

    move-result-object v1

    sget-object v3, Landroidx/camera/core/impl/e1;->f:Landroidx/camera/core/impl/n0$a;

    invoke-interface {v1, v3, v0}, Landroidx/camera/core/impl/l1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/n$b;->a()Landroidx/camera/core/impl/l1;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/e1;->f:Landroidx/camera/core/impl/n0$a;

    const/16 v3, 0x100

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Landroidx/camera/core/impl/l1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p0}, Landroidx/camera/core/n$b;->e()Landroidx/camera/core/impl/d1;

    move-result-object v0

    invoke-static {v0}, Landroidx/camera/core/impl/f1;->w(Landroidx/camera/core/impl/f1;)V

    new-instance v1, Landroidx/camera/core/n;

    invoke-direct {v1, v0}, Landroidx/camera/core/n;-><init>(Landroidx/camera/core/impl/d1;)V

    invoke-virtual {p0}, Landroidx/camera/core/n$b;->a()Landroidx/camera/core/impl/l1;

    move-result-object v0

    sget-object v3, Landroidx/camera/core/impl/f1;->l:Landroidx/camera/core/impl/n0$a;

    invoke-interface {v0, v3, v2}, Landroidx/camera/core/impl/n0;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Size;

    if-eqz v0, :cond_1

    new-instance v2, Landroid/util/Rational;

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    invoke-direct {v2, v3, v0}, Landroid/util/Rational;-><init>(II)V

    invoke-virtual {v1, v2}, Landroidx/camera/core/n;->l0(Landroid/util/Rational;)V

    :cond_1
    invoke-virtual {p0}, Landroidx/camera/core/n$b;->a()Landroidx/camera/core/impl/l1;

    move-result-object v0

    sget-object v2, Lb0/g;->B:Landroidx/camera/core/impl/n0$a;

    invoke-static {}, Lz/a;->c()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Landroidx/camera/core/impl/n0;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    const-string v2, "The IO executor can\'t be null"

    invoke-static {v0, v2}, Landroidx/core/util/h;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroidx/camera/core/n$b;->a()Landroidx/camera/core/impl/l1;

    move-result-object v0

    sget-object v2, Landroidx/camera/core/impl/d1;->I:Landroidx/camera/core/impl/n0$a;

    invoke-interface {v0, v2}, Landroidx/camera/core/impl/n0;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroidx/camera/core/n$b;->a()Landroidx/camera/core/impl/l1;

    move-result-object v0

    invoke-interface {v0, v2}, Landroidx/camera/core/impl/n0;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_2

    goto :goto_1

    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "The flash mode is not allowed to set: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    :goto_1
    return-object v1
.end method

.method public e()Landroidx/camera/core/impl/d1;
    .locals 2

    new-instance v0, Landroidx/camera/core/impl/d1;

    iget-object v1, p0, Landroidx/camera/core/n$b;->a:Landroidx/camera/core/impl/m1;

    invoke-static {v1}, Landroidx/camera/core/impl/p1;->Y(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/p1;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/camera/core/impl/d1;-><init>(Landroidx/camera/core/impl/p1;)V

    return-object v0
.end method

.method public f(Landroidx/camera/core/impl/l2$b;)Landroidx/camera/core/n$b;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/n$b;->a()Landroidx/camera/core/impl/l1;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/k2;->A:Landroidx/camera/core/impl/n0$a;

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public g(Lw/y;)Landroidx/camera/core/n$b;
    .locals 2

    sget-object v0, Lw/y;->d:Lw/y;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/n$b;->a()Landroidx/camera/core/impl/l1;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/e1;->g:Landroidx/camera/core/impl/n0$a;

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "ImageCapture currently only supports SDR"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public h(Lh0/c;)Landroidx/camera/core/n$b;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/n$b;->a()Landroidx/camera/core/impl/l1;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/f1;->p:Landroidx/camera/core/impl/n0$a;

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public i(I)Landroidx/camera/core/n$b;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/n$b;->a()Landroidx/camera/core/impl/l1;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/k2;->v:Landroidx/camera/core/impl/n0$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public j(I)Landroidx/camera/core/n$b;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/n$b;->a()Landroidx/camera/core/impl/l1;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/f1;->h:Landroidx/camera/core/impl/n0$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    return-object p0
.end method

.method public k(Ljava/lang/Class;)Landroidx/camera/core/n$b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "Landroidx/camera/core/n;",
            ">;)",
            "Landroidx/camera/core/n$b;"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/camera/core/n$b;->a()Landroidx/camera/core/impl/l1;

    move-result-object v0

    sget-object v1, Lb0/j;->D:Landroidx/camera/core/impl/n0$a;

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/camera/core/n$b;->a()Landroidx/camera/core/impl/l1;

    move-result-object v0

    sget-object v1, Lb0/j;->C:Landroidx/camera/core/impl/n0$a;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroidx/camera/core/impl/n0;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/core/n$b;->l(Ljava/lang/String;)Landroidx/camera/core/n$b;

    :cond_0
    return-object p0
.end method

.method public l(Ljava/lang/String;)Landroidx/camera/core/n$b;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/n$b;->a()Landroidx/camera/core/impl/l1;

    move-result-object v0

    sget-object v1, Lb0/j;->C:Landroidx/camera/core/impl/n0$a;

    invoke-interface {v0, v1, p1}, Landroidx/camera/core/impl/l1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    return-object p0
.end method
