.class public final Ldl/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ldl/a;Lcl/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldl/a;",
            "Lcl/c<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, Ldl/a;->a:Lcl/c;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    throw p0
.end method
