.class public final Ldl/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgk/f;


# instance fields
.field public final a:Ljava/lang/Throwable;

.field private final synthetic b:Lgk/f;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;Lgk/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldl/e;->a:Ljava/lang/Throwable;

    iput-object p2, p0, Ldl/e;->b:Lgk/f;

    return-void
.end method


# virtual methods
.method public Q(Lgk/f$c;)Lgk/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/f$c<",
            "*>;)",
            "Lgk/f;"
        }
    .end annotation

    iget-object v0, p0, Ldl/e;->b:Lgk/f;

    invoke-interface {v0, p1}, Lgk/f;->Q(Lgk/f$c;)Lgk/f;

    move-result-object p1

    return-object p1
.end method

.method public U(Lgk/f;)Lgk/f;
    .locals 1

    iget-object v0, p0, Ldl/e;->b:Lgk/f;

    invoke-interface {v0, p1}, Lgk/f;->U(Lgk/f;)Lgk/f;

    move-result-object p1

    return-object p1
.end method

.method public b(Lgk/f$c;)Lgk/f$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lgk/f$b;",
            ">(",
            "Lgk/f$c<",
            "TE;>;)TE;"
        }
    .end annotation

    iget-object v0, p0, Ldl/e;->b:Lgk/f;

    invoke-interface {v0, p1}, Lgk/f;->b(Lgk/f$c;)Lgk/f$b;

    move-result-object p1

    return-object p1
.end method

.method public z0(Ljava/lang/Object;Lok/p;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lok/p<",
            "-TR;-",
            "Lgk/f$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    iget-object v0, p0, Ldl/e;->b:Lgk/f;

    invoke-interface {v0, p1, p2}, Lgk/f;->z0(Ljava/lang/Object;Lok/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
