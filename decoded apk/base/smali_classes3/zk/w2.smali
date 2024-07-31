.class final Lzk/w2;
.super Lel/d0;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<U:",
        "Ljava/lang/Object;",
        "T::TU;>",
        "Lel/d0<",
        "TT;>;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field public final e:J


# direct methods
.method public constructor <init>(JLgk/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lgk/Continuation<",
            "-TU;>;)V"
        }
    .end annotation

    invoke-interface {p3}, Lgk/Continuation;->getContext()Lgk/f;

    move-result-object v0

    invoke-direct {p0, v0, p3}, Lel/d0;-><init>(Lgk/f;Lgk/Continuation;)V

    iput-wide p1, p0, Lzk/w2;->e:J

    return-void
.end method


# virtual methods
.method public p0()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Lzk/a;->p0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "(timeMillis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lzk/w2;->e:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public run()V
    .locals 3

    iget-wide v0, p0, Lzk/w2;->e:J

    invoke-virtual {p0}, Lzk/a;->getContext()Lgk/f;

    move-result-object v2

    invoke-static {v2}, Lzk/u0;->a(Lgk/f;)Lzk/t0;

    move-result-object v2

    invoke-static {v0, v1, v2, p0}, Lzk/x2;->a(JLzk/t0;Lzk/w1;)Lzk/v2;

    move-result-object v0

    invoke-virtual {p0, v0}, Lzk/d2;->w(Ljava/lang/Throwable;)Z

    return-void
.end method
