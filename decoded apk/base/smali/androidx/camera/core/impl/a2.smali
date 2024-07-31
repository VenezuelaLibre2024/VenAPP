.class public final Landroidx/camera/core/impl/a2;
.super Landroidx/camera/core/impl/r0;
.source "SourceFile"


# instance fields
.field private final o:Landroid/view/Surface;


# virtual methods
.method public r()Lcom/google/common/util/concurrent/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/f<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/a2;->o:Landroid/view/Surface;

    invoke-static {v0}, La0/f;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;

    move-result-object v0

    return-object v0
.end method
