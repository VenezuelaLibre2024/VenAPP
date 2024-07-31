.class public abstract Lr1/h;
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
