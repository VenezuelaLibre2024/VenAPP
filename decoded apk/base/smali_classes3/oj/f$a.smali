.class final Loj/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loj/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field private final a:Ldj/c;

.field final synthetic b:Loj/f;


# direct methods
.method constructor <init>(Loj/f;Ldj/c;)V
    .locals 0

    iput-object p1, p0, Loj/f$a;->b:Loj/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Loj/f$a;->a:Ldj/c;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Loj/f$a;->a:Ldj/c;

    invoke-interface {v0}, Ldj/c;->a()V

    return-void
.end method

.method public b(Lgj/b;)V
    .locals 1

    iget-object v0, p0, Loj/f$a;->a:Ldj/c;

    invoke-interface {v0, p1}, Ldj/c;->b(Lgj/b;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 5

    :try_start_0
    iget-object v0, p0, Loj/f$a;->b:Loj/f;

    iget-object v0, v0, Loj/f;->b:Ljj/g;

    invoke-interface {v0, p1}, Ljj/g;->test(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    iget-object p1, p0, Loj/f$a;->a:Ldj/c;

    invoke-interface {p1}, Ldj/c;->a()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Loj/f$a;->a:Ldj/c;

    invoke-interface {v0, p1}, Ldj/c;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lhj/b;->b(Ljava/lang/Throwable;)V

    iget-object v1, p0, Loj/f$a;->a:Ldj/c;

    new-instance v2, Lhj/a;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Throwable;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 p1, 0x1

    aput-object v0, v3, p1

    invoke-direct {v2, v3}, Lhj/a;-><init>([Ljava/lang/Throwable;)V

    invoke-interface {v1, v2}, Ldj/c;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
