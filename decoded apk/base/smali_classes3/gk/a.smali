.class public abstract Lgk/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgk/f$b;


# instance fields
.field private final a:Lgk/f$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgk/f$c<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lgk/f$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/f$c<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgk/a;->a:Lgk/f$c;

    return-void
.end method


# virtual methods
.method public Q(Lgk/f$c;)Lgk/f;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/f$c<",
            "*>;)",
            "Lgk/f;"
        }
    .end annotation

    invoke-static {p0, p1}, Lgk/f$b$a;->c(Lgk/f$b;Lgk/f$c;)Lgk/f;

    move-result-object p1

    return-object p1
.end method

.method public U(Lgk/f;)Lgk/f;
    .locals 0

    invoke-static {p0, p1}, Lgk/f$b$a;->d(Lgk/f$b;Lgk/f;)Lgk/f;

    move-result-object p1

    return-object p1
.end method

.method public b(Lgk/f$c;)Lgk/f$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lgk/f$b;",
            ">(",
            "Lgk/f$c<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Lgk/f$b$a;->b(Lgk/f$b;Lgk/f$c;)Lgk/f$b;

    move-result-object p1

    return-object p1
.end method

.method public getKey()Lgk/f$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lgk/f$c<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lgk/a;->a:Lgk/f$c;

    return-object v0
.end method

.method public z0(Ljava/lang/Object;Lok/p;)Ljava/lang/Object;
    .locals 0
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

    invoke-static {p0, p1, p2}, Lgk/f$b$a;->a(Lgk/f$b;Ljava/lang/Object;Lok/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
