.class Lzk/s0;
.super Lzk/a;
.source "SourceFile"

# interfaces
.implements Lzk/r0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lzk/a<",
        "TT;>;",
        "Lzk/r0<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lgk/f;Z)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p2}, Lzk/a;-><init>(Lgk/f;ZZ)V

    return-void
.end method


# virtual methods
.method public g()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lzk/d2;->M()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
