.class Lzk/o2;
.super Lzk/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lzk/a<",
        "Lck/v;",
        ">;"
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
.method protected Z(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-virtual {p0}, Lzk/a;->getContext()Lgk/f;

    move-result-object v0

    invoke-static {v0, p1}, Lzk/j0;->a(Lgk/f;Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    return p1
.end method
