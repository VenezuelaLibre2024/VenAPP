.class abstract Lh6/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh6/o$a;
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lh6/o$a;
    .locals 1

    new-instance v0, Lh6/c$b;

    invoke-direct {v0}, Lh6/c$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Lf6/b;
.end method

.method abstract c()Lf6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lf6/c<",
            "*>;"
        }
    .end annotation
.end method

.method public d()[B
    .locals 2

    invoke-virtual {p0}, Lh6/o;->e()Lf6/e;

    move-result-object v0

    invoke-virtual {p0}, Lh6/o;->c()Lf6/c;

    move-result-object v1

    invoke-virtual {v1}, Lf6/c;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lf6/e;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method

.method abstract e()Lf6/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lf6/e<",
            "*[B>;"
        }
    .end annotation
.end method

.method public abstract f()Lh6/p;
.end method

.method public abstract g()Ljava/lang/String;
.end method
