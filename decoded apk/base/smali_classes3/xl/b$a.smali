.class abstract Lxl/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldm/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxl/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "a"
.end annotation


# instance fields
.field private final a:Ldm/h;

.field private b:Z

.field final synthetic c:Lxl/b;


# direct methods
.method public constructor <init>(Lxl/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lxl/b$a;->c:Lxl/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ldm/h;

    invoke-static {p1}, Lxl/b;->m(Lxl/b;)Ldm/d;

    move-result-object p1

    invoke-interface {p1}, Ldm/x;->m()Ldm/y;

    move-result-object p1

    invoke-direct {v0, p1}, Ldm/h;-><init>(Ldm/y;)V

    iput-object v0, p0, Lxl/b$a;->a:Ldm/h;

    return-void
.end method


# virtual methods
.method protected final a()Z
    .locals 1

    iget-boolean v0, p0, Lxl/b$a;->b:Z

    return v0
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, Lxl/b$a;->c:Lxl/b;

    invoke-static {v0}, Lxl/b;->n(Lxl/b;)I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lxl/b$a;->c:Lxl/b;

    invoke-static {v0}, Lxl/b;->n(Lxl/b;)I

    move-result v0

    const/4 v2, 0x5

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lxl/b$a;->c:Lxl/b;

    iget-object v2, p0, Lxl/b$a;->a:Ldm/h;

    invoke-static {v0, v2}, Lxl/b;->i(Lxl/b;Ldm/h;)V

    iget-object v0, p0, Lxl/b$a;->c:Lxl/b;

    invoke-static {v0, v1}, Lxl/b;->p(Lxl/b;I)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    iget-object v1, p0, Lxl/b$a;->c:Lxl/b;

    invoke-static {v1}, Lxl/b;->n(Lxl/b;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "state: "

    invoke-static {v2, v1}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected final e(Z)V
    .locals 0

    iput-boolean p1, p0, Lxl/b$a;->b:Z

    return-void
.end method

.method public m()Ldm/y;
    .locals 1

    iget-object v0, p0, Lxl/b$a;->a:Ldm/h;

    return-object v0
.end method

.method public s1(Ldm/b;J)J
    .locals 1

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lxl/b$a;->c:Lxl/b;

    invoke-static {v0}, Lxl/b;->m(Lxl/b;)Ldm/d;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Ldm/x;->s1(Ldm/b;J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    iget-object p2, p0, Lxl/b$a;->c:Lxl/b;

    invoke-virtual {p2}, Lxl/b;->b()Lvl/f;

    move-result-object p2

    invoke-virtual {p2}, Lvl/f;->y()V

    invoke-virtual {p0}, Lxl/b$a;->b()V

    throw p1
.end method
