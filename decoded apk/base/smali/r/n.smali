.class Lr/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/f$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/n$a;
    }
.end annotation


# instance fields
.field final a:Ljava/lang/Object;


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/n;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 0

    return-void
.end method

.method public b(Landroid/view/Surface;)V
    .locals 1

    const-string v0, "Surface must not be null"

    invoke-static {p1, v0}, Landroidx/core/util/h;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lr/n;->getSurface()Landroid/view/Surface;

    move-result-object v0

    if-eq v0, p1, :cond_1

    invoke-virtual {p0}, Lr/n;->h()Z

    move-result p1

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot have 2 surfaces for a non-sharing configuration"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Exceeds maximum number of surfaces"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Surface is already added!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c(J)V
    .locals 1

    iget-object v0, p0, Lr/n;->a:Ljava/lang/Object;

    check-cast v0, Lr/n$a;

    iput-wide p1, v0, Lr/n$a;->g:J

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lr/n;->a:Ljava/lang/Object;

    check-cast v0, Lr/n$a;

    iput-object p1, v0, Lr/n$a;->e:Ljava/lang/String;

    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lr/n;->a:Ljava/lang/Object;

    check-cast v0, Lr/n$a;

    iget-object v0, v0, Lr/n$a;->e:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lr/n;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lr/n;->a:Ljava/lang/Object;

    check-cast p1, Lr/n;

    iget-object p1, p1, Lr/n;->a:Ljava/lang/Object;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f()V
    .locals 2

    iget-object v0, p0, Lr/n;->a:Ljava/lang/Object;

    check-cast v0, Lr/n$a;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lr/n$a;->f:Z

    return-void
.end method

.method public g()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getSurface()Landroid/view/Surface;
    .locals 2

    iget-object v0, p0, Lr/n;->a:Ljava/lang/Object;

    check-cast v0, Lr/n$a;

    iget-object v0, v0, Lr/n$a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/Surface;

    return-object v0
.end method

.method h()Z
    .locals 1

    iget-object v0, p0, Lr/n;->a:Ljava/lang/Object;

    check-cast v0, Lr/n$a;

    iget-boolean v0, v0, Lr/n$a;->f:Z

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lr/n;->a:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
