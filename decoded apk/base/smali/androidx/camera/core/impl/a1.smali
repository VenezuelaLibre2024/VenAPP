.class public Landroidx/camera/core/impl/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/b0;


# instance fields
.field private final a:Landroidx/camera/core/impl/b0;


# direct methods
.method public constructor <init>(Landroidx/camera/core/impl/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/impl/a1;->a:Landroidx/camera/core/impl/b0;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/a1;->a:Landroidx/camera/core/impl/b0;

    invoke-interface {v0}, Lw/o;->a()I

    move-result v0

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/a1;->a:Landroidx/camera/core/impl/b0;

    invoke-interface {v0}, Landroidx/camera/core/impl/b0;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/a1;->a:Landroidx/camera/core/impl/b0;

    invoke-interface {v0, p1}, Landroidx/camera/core/impl/b0;->c(I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public e()Landroidx/camera/core/impl/t1;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/a1;->a:Landroidx/camera/core/impl/b0;

    invoke-interface {v0}, Landroidx/camera/core/impl/b0;->e()Landroidx/camera/core/impl/t1;

    move-result-object v0

    return-object v0
.end method

.method public f(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/a1;->a:Landroidx/camera/core/impl/b0;

    invoke-interface {v0, p1}, Landroidx/camera/core/impl/b0;->f(I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getLensFacing()I
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/a1;->a:Landroidx/camera/core/impl/b0;

    invoke-interface {v0}, Lw/o;->getLensFacing()I

    move-result v0

    return v0
.end method

.method public i(I)I
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/a1;->a:Landroidx/camera/core/impl/b0;

    invoke-interface {v0, p1}, Lw/o;->i(I)I

    move-result p1

    return p1
.end method
