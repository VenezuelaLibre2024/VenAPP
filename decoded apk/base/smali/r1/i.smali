.class public abstract Lr1/i;
.super Lr1/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lr1/d0;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lr1/u;)V
    .locals 1

    const-string v0, "database"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lr1/d0;-><init>(Lr1/u;)V

    return-void
.end method


# virtual methods
.method protected abstract i(Lv1/m;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv1/m;",
            "TT;)V"
        }
    .end annotation
.end method

.method public final j(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lr1/d0;->b()Lv1/m;

    move-result-object v0

    :try_start_0
    invoke-virtual {p0, v0, p1}, Lr1/i;->i(Lv1/m;Ljava/lang/Object;)V

    invoke-interface {v0}, Lv1/m;->t0()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v0}, Lr1/d0;->h(Lv1/m;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0, v0}, Lr1/d0;->h(Lv1/m;)V

    throw p1
.end method
