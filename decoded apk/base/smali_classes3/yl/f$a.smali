.class public final Lyl/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyl/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Z

.field private final b:Lul/e;

.field public c:Ljava/net/Socket;

.field public d:Ljava/lang/String;

.field public e:Ldm/d;

.field public f:Ldm/c;

.field private g:Lyl/f$c;

.field private h:Lyl/l;

.field private i:I


# direct methods
.method public constructor <init>(ZLul/e;)V
    .locals 1

    const-string v0, "taskRunner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lyl/f$a;->a:Z

    iput-object p2, p0, Lyl/f$a;->b:Lul/e;

    sget-object p1, Lyl/f$c;->b:Lyl/f$c;

    iput-object p1, p0, Lyl/f$a;->g:Lyl/f$c;

    sget-object p1, Lyl/l;->b:Lyl/l;

    iput-object p1, p0, Lyl/f$a;->h:Lyl/l;

    return-void
.end method


# virtual methods
.method public final a()Lyl/f;
    .locals 1

    new-instance v0, Lyl/f;

    invoke-direct {v0, p0}, Lyl/f;-><init>(Lyl/f$a;)V

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lyl/f$a;->a:Z

    return v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lyl/f$a;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "connectionName"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()Lyl/f$c;
    .locals 1

    iget-object v0, p0, Lyl/f$a;->g:Lyl/f$c;

    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lyl/f$a;->i:I

    return v0
.end method

.method public final f()Lyl/l;
    .locals 1

    iget-object v0, p0, Lyl/f$a;->h:Lyl/l;

    return-object v0
.end method

.method public final g()Ldm/c;
    .locals 1

    iget-object v0, p0, Lyl/f$a;->f:Ldm/c;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "sink"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final h()Ljava/net/Socket;
    .locals 1

    iget-object v0, p0, Lyl/f$a;->c:Ljava/net/Socket;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "socket"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final i()Ldm/d;
    .locals 1

    iget-object v0, p0, Lyl/f$a;->e:Ldm/d;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "source"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final j()Lul/e;
    .locals 1

    iget-object v0, p0, Lyl/f$a;->b:Lul/e;

    return-object v0
.end method

.method public final k(Lyl/f$c;)Lyl/f$a;
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lyl/f$a;->n(Lyl/f$c;)V

    return-object p0
.end method

.method public final l(I)Lyl/f$a;
    .locals 0

    invoke-virtual {p0, p1}, Lyl/f$a;->o(I)V

    return-object p0
.end method

.method public final m(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lyl/f$a;->d:Ljava/lang/String;

    return-void
.end method

.method public final n(Lyl/f$c;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lyl/f$a;->g:Lyl/f$c;

    return-void
.end method

.method public final o(I)V
    .locals 0

    iput p1, p0, Lyl/f$a;->i:I

    return-void
.end method

.method public final p(Ldm/c;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lyl/f$a;->f:Ldm/c;

    return-void
.end method

.method public final q(Ljava/net/Socket;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lyl/f$a;->c:Ljava/net/Socket;

    return-void
.end method

.method public final r(Ldm/d;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lyl/f$a;->e:Ldm/d;

    return-void
.end method

.method public final s(Ljava/net/Socket;Ljava/lang/String;Ldm/d;Ldm/c;)Lyl/f$a;
    .locals 1

    const-string v0, "socket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "peerName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sink"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lyl/f$a;->q(Ljava/net/Socket;)V

    invoke-virtual {p0}, Lyl/f$a;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v0, Lrl/d;->i:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, "MockWebServer "

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, Lyl/f$a;->m(Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Lyl/f$a;->r(Ldm/d;)V

    invoke-virtual {p0, p4}, Lyl/f$a;->p(Ldm/c;)V

    return-object p0
.end method
