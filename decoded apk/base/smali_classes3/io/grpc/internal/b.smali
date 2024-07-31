.class public abstract Lio/grpc/internal/b;
.super Lvi/t0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lvi/t0<",
        "TT;>;>",
        "Lvi/t0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field protected a:I


# direct methods
.method protected constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lvi/t0;-><init>()V

    const/high16 v0, 0x400000

    iput v0, p0, Lio/grpc/internal/b;->a:I

    return-void
.end method


# virtual methods
.method public a()Lvi/s0;
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/b;->c()Lvi/t0;

    move-result-object v0

    invoke-virtual {v0}, Lvi/t0;->a()Lvi/s0;

    move-result-object v0

    return-object v0
.end method

.method protected abstract c()Lvi/t0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvi/t0<",
            "*>;"
        }
    .end annotation
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Leb/i;->c(Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "delegate"

    invoke-virtual {p0}, Lio/grpc/internal/b;->c()Lvi/t0;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    invoke-virtual {v0}, Leb/i$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
