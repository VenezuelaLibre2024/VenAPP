.class public Ldm/h;
.super Ldm/y;
.source "SourceFile"


# instance fields
.field private f:Ldm/y;


# direct methods
.method public constructor <init>(Ldm/y;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ldm/y;-><init>()V

    iput-object p1, p0, Ldm/h;->f:Ldm/y;

    return-void
.end method


# virtual methods
.method public a()Ldm/y;
    .locals 1

    iget-object v0, p0, Ldm/h;->f:Ldm/y;

    invoke-virtual {v0}, Ldm/y;->a()Ldm/y;

    move-result-object v0

    return-object v0
.end method

.method public b()Ldm/y;
    .locals 1

    iget-object v0, p0, Ldm/h;->f:Ldm/y;

    invoke-virtual {v0}, Ldm/y;->b()Ldm/y;

    move-result-object v0

    return-object v0
.end method

.method public c()J
    .locals 2

    iget-object v0, p0, Ldm/h;->f:Ldm/y;

    invoke-virtual {v0}, Ldm/y;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public d(J)Ldm/y;
    .locals 1

    iget-object v0, p0, Ldm/h;->f:Ldm/y;

    invoke-virtual {v0, p1, p2}, Ldm/y;->d(J)Ldm/y;

    move-result-object p1

    return-object p1
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Ldm/h;->f:Ldm/y;

    invoke-virtual {v0}, Ldm/y;->e()Z

    move-result v0

    return v0
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Ldm/h;->f:Ldm/y;

    invoke-virtual {v0}, Ldm/y;->f()V

    return-void
.end method

.method public g(JLjava/util/concurrent/TimeUnit;)Ldm/y;
    .locals 1

    const-string v0, "unit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldm/h;->f:Ldm/y;

    invoke-virtual {v0, p1, p2, p3}, Ldm/y;->g(JLjava/util/concurrent/TimeUnit;)Ldm/y;

    move-result-object p1

    return-object p1
.end method

.method public final i()Ldm/y;
    .locals 1

    iget-object v0, p0, Ldm/h;->f:Ldm/y;

    return-object v0
.end method

.method public final j(Ldm/y;)Ldm/h;
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ldm/h;->f:Ldm/y;

    return-object p0
.end method
