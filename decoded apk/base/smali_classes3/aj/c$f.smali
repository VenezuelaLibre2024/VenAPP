.class final Laj/c$f;
.super Laj/c$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laj/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<RespT:",
        "Ljava/lang/Object;",
        ">",
        "Laj/c$c<",
        "TRespT;>;"
    }
.end annotation


# instance fields
.field private final a:Laj/c$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Laj/c$b<",
            "TRespT;>;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TRespT;"
        }
    .end annotation
.end field

.field private c:Z


# direct methods
.method constructor <init>(Laj/c$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laj/c$b<",
            "TRespT;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Laj/c$c;-><init>(Laj/c$a;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Laj/c$f;->c:Z

    iput-object p1, p0, Laj/c$f;->a:Laj/c$b;

    return-void
.end method


# virtual methods
.method public a(Lvi/g1;Lvi/w0;)V
    .locals 2

    invoke-virtual {p1}, Lvi/g1;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean p1, p0, Laj/c$f;->c:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Laj/c$f;->a:Laj/c$b;

    sget-object v0, Lvi/g1;->t:Lvi/g1;

    const-string v1, "No value received for unary call"

    invoke-virtual {v0, v1}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v0

    invoke-virtual {v0, p2}, Lvi/g1;->e(Lvi/w0;)Lvi/i1;

    move-result-object p2

    invoke-virtual {p1, p2}, Laj/c$b;->B(Ljava/lang/Throwable;)Z

    :cond_0
    iget-object p1, p0, Laj/c$f;->a:Laj/c$b;

    iget-object p2, p0, Laj/c$f;->b:Ljava/lang/Object;

    invoke-virtual {p1, p2}, Laj/c$b;->A(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Laj/c$f;->a:Laj/c$b;

    invoke-virtual {p1, p2}, Lvi/g1;->e(Lvi/w0;)Lvi/i1;

    move-result-object p1

    invoke-virtual {v0, p1}, Laj/c$b;->B(Ljava/lang/Throwable;)Z

    :goto_0
    return-void
.end method

.method public b(Lvi/w0;)V
    .locals 0

    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TRespT;)V"
        }
    .end annotation

    iget-boolean v0, p0, Laj/c$f;->c:Z

    if-nez v0, :cond_0

    iput-object p1, p0, Laj/c$f;->b:Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, p0, Laj/c$f;->c:Z

    return-void

    :cond_0
    sget-object p1, Lvi/g1;->t:Lvi/g1;

    const-string v0, "More than one value received for unary call"

    invoke-virtual {p1, v0}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object p1

    invoke-virtual {p1}, Lvi/g1;->d()Lvi/i1;

    move-result-object p1

    throw p1
.end method

.method e()V
    .locals 2

    iget-object v0, p0, Laj/c$f;->a:Laj/c$b;

    invoke-static {v0}, Laj/c$b;->C(Laj/c$b;)Lvi/g;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lvi/g;->c(I)V

    return-void
.end method
