.class public interface abstract Lw/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw/x0$a;
    }
.end annotation


# virtual methods
.method public abstract A0(Ljava/util/concurrent/Executor;Landroidx/core/util/a;)Landroid/view/Surface;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Landroidx/core/util/a<",
            "Lw/x0$a;",
            ">;)",
            "Landroid/view/Surface;"
        }
    .end annotation
.end method

.method public abstract close()V
.end method

.method public getFormat()I
    .locals 1

    const/16 v0, 0x22

    return v0
.end method

.method public abstract p()Landroid/util/Size;
.end method

.method public abstract y0([F[F)V
.end method
