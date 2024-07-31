.class Lsd/b$d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud/n$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsd/b$d;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lsd/b$d;


# direct methods
.method constructor <init>(Lsd/b$d;)V
    .locals 0

    iput-object p1, p0, Lsd/b$d$b;->a:Lsd/b$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lsd/b$d$b;->a:Lsd/b$d;

    iget-object v0, v0, Lsd/b$d;->s:Lsd/b;

    invoke-static {v0}, Lsd/b;->l(Lsd/b;)Lde/i;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lsd/b$d$b;->a:Lsd/b$d;

    iget-object v0, v0, Lsd/b$d;->s:Lsd/b;

    invoke-static {v0}, Lsd/b;->c(Lsd/b;)Lqd/t;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Impression timer onFinish for: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lsd/b$d$b;->a:Lsd/b$d;

    iget-object v1, v1, Lsd/b$d;->s:Lsd/b;

    invoke-static {v1}, Lsd/b;->l(Lsd/b;)Lde/i;

    move-result-object v1

    invoke-virtual {v1}, Lde/i;->a()Lde/e;

    move-result-object v1

    invoke-virtual {v1}, Lde/e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lud/m;->f(Ljava/lang/String;)V

    iget-object v0, p0, Lsd/b$d$b;->a:Lsd/b$d;

    iget-object v0, v0, Lsd/b$d;->s:Lsd/b;

    invoke-static {v0}, Lsd/b;->c(Lsd/b;)Lqd/t;

    move-result-object v0

    invoke-interface {v0}, Lqd/t;->d()Lcom/google/android/gms/tasks/Task;

    :cond_0
    return-void
.end method
