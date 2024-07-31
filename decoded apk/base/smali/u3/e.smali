.class public Lu3/e;
.super Ls3/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls3/h<",
        "Lu3/c;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lu3/c;)V
    .locals 0

    invoke-direct {p0, p1}, Ls3/h;-><init>(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method public initialize()V
    .locals 1

    iget-object v0, p0, Ls3/h;->a:Landroid/graphics/drawable/Drawable;

    check-cast v0, Lu3/c;

    invoke-virtual {v0}, Lu3/c;->e()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    return-void
.end method

.method public p()I
    .locals 1

    iget-object v0, p0, Ls3/h;->a:Landroid/graphics/drawable/Drawable;

    check-cast v0, Lu3/c;

    invoke-virtual {v0}, Lu3/c;->i()I

    move-result v0

    return v0
.end method

.method public q()V
    .locals 1

    iget-object v0, p0, Ls3/h;->a:Landroid/graphics/drawable/Drawable;

    check-cast v0, Lu3/c;

    invoke-virtual {v0}, Lu3/c;->stop()V

    iget-object v0, p0, Ls3/h;->a:Landroid/graphics/drawable/Drawable;

    check-cast v0, Lu3/c;

    invoke-virtual {v0}, Lu3/c;->k()V

    return-void
.end method

.method public r()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lu3/c;",
            ">;"
        }
    .end annotation

    const-class v0, Lu3/c;

    return-object v0
.end method
