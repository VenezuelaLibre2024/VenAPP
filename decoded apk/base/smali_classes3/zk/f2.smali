.class final Lzk/f2;
.super Lzk/s0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lzk/s0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final d:Lgk/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgk/Continuation<",
            "Lck/v;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lgk/f;Lok/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/f;",
            "Lok/p<",
            "-",
            "Lzk/k0;",
            "-",
            "Lgk/Continuation<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lzk/s0;-><init>(Lgk/f;Z)V

    invoke-static {p2, p0, p0}, Lhk/b;->a(Lok/p;Ljava/lang/Object;Lgk/Continuation;)Lgk/Continuation;

    move-result-object p1

    iput-object p1, p0, Lzk/f2;->d:Lgk/Continuation;

    return-void
.end method


# virtual methods
.method protected w0()V
    .locals 1

    iget-object v0, p0, Lzk/f2;->d:Lgk/Continuation;

    invoke-static {v0, p0}, Lfl/a;->b(Lgk/Continuation;Lgk/Continuation;)V

    return-void
.end method
